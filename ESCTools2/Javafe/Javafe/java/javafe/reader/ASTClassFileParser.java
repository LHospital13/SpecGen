/* Copyright 2000, 2001, Compaq Computer Corporation */
// $Id$

/* =========================================================================
 * ASTClassFileParser.java
 * ========================================================================= */

package javafe.reader;

import java.io.*;
import java.util.*;

//import decsrc.util.*;
import javafe.decsrc.ClassFileParser;

import javafe.ast.*;
import javafe.util.*;
import javafe.genericfile.GenericFile;

/* -------------------------------------------------------------------------
 * ASTClassFileParser
 * ------------------------------------------------------------------------- */

/**
 * Parses the contents of a class file into an AST for the purpose of
 * type checking.  Ignores components of the class file that have no
 * relevance to type checking (e.g. method bodies).
 * 
 * @deprecated Use BCELReader for Java 1.5 and later versions
 */

class ASTClassFileParser extends ClassFileParser {
  /* -- package instance methods ------------------------------------------- */

  /**
   * The package name of the class being parsed.
   * Initialized by constructor (by way of set_this_class)
   */
  // access only readonly by BinReader
  Name classPackage;

  /**
   * The AST of the class parsed by this parser.
   * Initialized by constructor (by way of parse_file).
   */
  // access only readonly by BinReader
  //@ invariant typeDecl.specOnly;
  /*@ spec_protected*/ TypeDecl typeDecl;

  /**
   * A dummy location representing the class being parsed.
   * Initialized by constructor.
   */
  //  access only readonly by BinReader
  //@ invariant classLocation != Location.NULL;
  int classLocation;

  /**
   * Vector of methods and fields with Synthetic attributes.
   * Use this to weed out synthetic while constructing TypeDecl.
   */
  private/*@ non_null */Vector synthetics = new Vector();

  /**
   * Flag indicating whether the class being parsed has the synthetic
   * attribute.
   */
  private boolean syntheticClass = false;

  /**
   * Flag indicates that class bodies are currently being parsed, otherwise 
   * only the type interface is parsed.
   */
  private boolean includeBodies = false;

  /**
   * A flag indicating that parsed type declaration should ignore/omit 
   * private class fields.
   */
  private boolean omitPrivateFields = true;

  /**
   * Parse a class into a new class parser.  Resulting class file is
   * stored in <code>typeDecl</code>; this will be a "spec only"
   * declaration.  Its package is stored in <code>classPackage</code>
   * and a location for it is stored in <code>classLocation</code>.
   * @param inputFile  the file to parse the class from 
   * @param includeBodies if true, bodies are included, if not, only a spec is produced */
  ASTClassFileParser(/*@ non_null */GenericFile inputFile,
                     boolean includeBodies) throws IOException,
      ClassFormatError {
    super();
    this.constants = new Object[0];
    this.fields = new FieldDecl[0];
    this.includeBodies = includeBodies;
    this.interfaces = new TypeName[0];
    this.rawConstants = new Object[0];
    this.routines = new RoutineDecl[0];
    DataInputStream stream = null;
    try {
      this.inputFile = inputFile;
      this.classLocation = Location.createWholeFileLoc(inputFile);
      stream = new DataInputStream(inputFile.getInputStream());
      parse_file(stream); //@ nowarn Invariant;  // "parse_file" is a helper
    } finally {
      if (stream != null) {
        try {
          stream.close();
        } catch (IOException e) {
        }
      }
    }
    removeExtraArg();
  }

  /** Binary inner class constructors have an extra initial argument to
   their constructors (the enclosing class).  This is not present in
   the source file.  To make the AST generated by reading the binary
   correspond to that obtained from a source file, we remove that
   extra argument for each inner (non-static) class.  Since we do this
   at the end of parse_file, each nested class does this for its own
   direct inner classes. - DRCok
   */
  public void removeExtraArg() {
    TypeDeclElemVec vv = (/*@(non_null)*/typeDecl).elems;
    for (int k = 0; k < vv.size(); ++k) {
      if (!(vv.elementAt(k) instanceof ClassDecl))
        continue;
      ClassDecl cd = (ClassDecl) vv.elementAt(k);
      if (Modifiers.isStatic(cd.modifiers))
        continue;
      TypeDeclElemVec v = cd.elems;
      for (int j = 0; j < v.size(); ++j) {
        if (!(v.elementAt(j) instanceof ConstructorDecl))
          continue;
        ConstructorDecl cdl = (ConstructorDecl) v.elementAt(j);
        cdl.args.removeElementAt(0);
      }
    }
  }

  /* -- protected instance methods ----------------------------------------- */

  /**
   * Add only AST nodes that are not synthetic decls to <code>v</code>.
   * <code>elems</code> should be an array of {@link TypeDeclElem}s.  
   * A synthetic decl is one that had the synthetic attribute, 
   * or is a static method decl for an interface.
   */
  protected void addNonSyntheticDecls(/*@ non_null */TypeDeclElemVec v,
  /*@non_null*/TypeDeclElem[/*#@non_null*/] elems) {
    for (int i = 0; i < elems.length; i++) {
      if (synthetics.contains(elems[i])) { //@ nowarn;
        continue;
      }
      if ((modifiers & ACC_INTERFACE) != 0 && elems[i] instanceof RoutineDecl) {
        RoutineDecl rd = (RoutineDecl) elems[i];
        if (Modifiers.isStatic(rd.modifiers)) {
          continue;
        }
      }
      if (omitPrivateFields && elems[i] instanceof FieldDecl) {
        if (Modifiers.isPrivate(((FieldDecl) elems[i]).modifiers)) {
          continue;
        }
      }
      v.addElement(elems[i]); //@ nowarn Pre;
    }
  }

  /**
   * Parse the file and set <code>typeDecl</code>.
   */
  //@ also ensures typeDecl != null;
  protected void parse_file(DataInput stream) throws ClassFormatError,
      IOException {
    super.parse_file(stream);

    TypeNameVec interfaceVec = TypeNameVec.make(interfaces); //@ nowarn Pre;

    int predict = classMembers.size() + routines.length + fields.length;
    TypeDeclElemVec elementVec = TypeDeclElemVec.make(predict);

    elementVec.append(classMembers);

    // only add routines and fields that are not synthetic.
    this.addNonSyntheticDecls(elementVec, routines);
    this.addNonSyntheticDecls(elementVec, fields);

    //@ assume classIdentifier != null;
    Identifier classId = /*@(non_null)*/ this.classIdentifier;
    TypeDecl _typeDecl;
    if ((modifiers & ACC_INTERFACE) != 0) {
      _typeDecl = (TypeDecl) InterfaceDecl.make(modifiers & ~ACC_INTERFACE,
                                               null, classId,
                                               interfaceVec, null, elementVec,
                                               classLocation, classLocation,
                                               classLocation, classLocation);
    } else {
      _typeDecl = (TypeDecl) ClassDecl.make(modifiers, null, classId,
                                           interfaceVec, null, elementVec,
                                           classLocation, classLocation,
                                           classLocation, classLocation,
                                           super_class);
    }
    _typeDecl.specOnly = true;
    this.typeDecl = _typeDecl;
  }

  /**
   * Call back from ClassFileParser.
   */
  protected void set_version(int major, int minor) throws ClassFormatError {
    // don't need class file version
  }

  /**
   * Call back from ClassFileParser.
   */
  protected void set_num_constants(int cnum) throws ClassFormatError {
    constants = new Object[cnum];
    rawConstants = new Object[cnum];
  }

  /**
   * Call back from ClassFileParser.
   */
  protected void set_const(int i, int ctype, /*@nullable*/Object value)
      throws ClassFormatError {
    constants[i] = ctype == CONSTANT_Class //@ nowarn IndexTooBig;
    	? DescriptorParser.parseClass((/*+@non_null*/String) value)
        : value;
    rawConstants[i] = value;
  }

  /**
   * Call back from ClassFileParser.
   */
  protected void set_const_ref(int i, int ctype, int class_index,
                               String field_name, String type)
      throws ClassFormatError {
    // don't need ref constants
  }

  /**
   * Call back from ClassFileParser.
   */
  protected void set_class_attribute(/*@non_null*/ String aname,
                                     /*@non_null*/ DataInput stream, int n) 
  throws IOException, ClassFormatError {
    if (aname.equals("Synthetic")) {
      syntheticClass = true;
    } else if (!aname.equals("InnerClasses")) {
      super.set_class_attribute(aname, stream, n);
    } else {
      int num_classes = stream.readUnsignedShort();
      for (int j = 0; j < num_classes; j++) {
        int inner = stream.readUnsignedShort();
        //@ assume inner < constants.length;  // property of class files
        int outer = stream.readUnsignedShort();
        int name = stream.readUnsignedShort();
        //@ assume name < constants.length;  // property of class files
        int flags = stream.readUnsignedShort();
        //System.out.println("PPP" + Modifiers.toString(flags));
        if (outer == this_class_index && name != 0) {
          // We've found a member that needs to be parsed...
          if (!(rawConstants[name] instanceof String)) {
            throw new ClassFormatError("bad constant reference");
          }
          //@ assume rawConstants[inner] instanceof String;  // property of class files
          String nm = (/*+@non_null*/String) rawConstants[inner];
          int i = nm.lastIndexOf("/");
          String icfn = (i < 0 ? nm : nm.substring(i + 1)) + ".class";
          GenericFile icf = inputFile.getSibling(icfn);
          if (icf == null) {
            throw new IOException(icfn + ": inner class not found");
          }
          ASTClassFileParser parser = new ASTClassFileParser(icf, true);
          TypeDecl parserTD = /*@(non_null)*/parser.typeDecl;
          parserTD.modifiers |= (flags & ~ACC_SYNCHRONIZED & ~ACC_INTERFACE);

          if (Modifiers.isPublic(parserTD.modifiers)) {
        	  parserTD.modifiers &= ~ACC_PROTECTED;
          }

          // Only add classes that are not synthetic and are not anonymous inner classes,
          // which are identified by names that start with a number.
          if (!parser.syntheticClass
              && !Character.isDigit(parserTD.id.toString().charAt(0))) {
            classMembers.addElement(parserTD);
          }
        }
      }
    }
  }

  /**
   * Call back from ClassFileParser.
   */
  protected void set_modifiers(int modifiers) throws ClassFormatError {
    // The synchronized bit for classes is used for other purposes:
    this.modifiers = modifiers & ~ACC_SYNCHRONIZED;
  }

  /**
   * Call back from ClassFileParser.
   */
  protected void set_this_class(int cindex) throws ClassFormatError {
    // record the class type and synthesize a location for the class binary

    TypeName typeName = (/*+@non_null*/TypeName) constants[cindex]; //@ nowarn Cast, IndexTooBig;

    Name qualifier = getNameQualifier(typeName.name);
    Identifier terminal = getNameTerminal(typeName.name);

    this_class_index = cindex;
    //this_class      = typeName;
    classPackage = qualifier;
    classIdentifier = terminal;

    // This is not the correct location; it may be useful later, though.
    //    int        location  = Location.createWholeFileLoc(terminal+".java");
    //    classLocation   = location;

    DescriptorParser.classLocation = classLocation;
  }

  /**
   * Call back from ClassFileParser.
   */
  protected void set_super_class(int cindex) throws ClassFormatError {
    super_class = (TypeName) constants[cindex]; //@ nowarn Cast, IndexTooBig;
  }

  /**
   * Call back from ClassFileParser.
   */
  protected void set_num_interfaces(int n) throws ClassFormatError {
    interfaces = new TypeName[n];
  }

  /**
   * Call back from ClassFileParser.
   */
  protected void set_interface(int index, int cindex) throws ClassFormatError {
    interfaces[index] = (TypeName) constants[cindex]; //@ nowarn Cast,IndexTooBig;
  }

  /**
   * Call back from ClassFileParser.
   */
  protected void set_num_fields(int n) throws ClassFormatError {
    fields = new FieldDecl[n];
  }

  /**
   * Call back from ClassFileParser.
   */
  protected void set_field(int i, /*@non_null*/String fname, /*@non_null*/String type, int mod)
      throws ClassFormatError {
    fields[i] = //@ nowarn IndexTooBig;
    FieldDecl.make(mod, null, Identifier.intern(fname), DescriptorParser
        .parseField(type), classLocation, null, classLocation);
  }

  /**
   * Call back from ClassFileParser.
   */
  protected void set_field_initializer(int i, Object value)
      throws ClassFormatError {
    // construct a literal expression for the initializer

    FieldDecl field = fields[i]; //@ nowarn IndexTooBig;
    //@ assume field != null	;

    int tag;
    Object literal;

    switch (field.type.getTag()) {
    case ASTTagConstants.BOOLEANTYPE:
      tag = ASTTagConstants.BOOLEANLIT;
      literal = Boolean.valueOf(((/*+@non_null*/Integer) value).intValue() != 0); //@ nowarn Cast,Null;
      break;

    case ASTTagConstants.INTTYPE:
    case ASTTagConstants.BYTETYPE:
    case ASTTagConstants.SHORTTYPE:
      tag = ASTTagConstants.INTLIT;
      literal = (Integer) value; //@ nowarn Cast;
      break;

    case ASTTagConstants.LONGTYPE:
      tag = ASTTagConstants.LONGLIT;
      literal = (Long) value; //@ nowarn Cast;
      break;

    case ASTTagConstants.CHARTYPE:
      tag = ASTTagConstants.CHARLIT;
      literal = (Integer) value; //@ nowarn Cast;
      break;

    case ASTTagConstants.FLOATTYPE:
      tag = ASTTagConstants.FLOATLIT;
      literal = (Float) value; //@ nowarn Cast;
      break;

    case ASTTagConstants.DOUBLETYPE:
      tag = ASTTagConstants.DOUBLELIT;
      literal = (Double) value; //@ nowarn Cast;
      break;

    default:
      tag = ASTTagConstants.STRINGLIT;
      literal = (String) value; //@ nowarn Cast;
      break;
    }

    field.init = LiteralExpr.make(tag, literal, classLocation);
  }

  /**
   * Call back from ClassFileParser.
   */
  protected void set_num_methods(int n) throws ClassFormatError {
    routines = new RoutineDecl[n];
  }

  /**
   * Call back from ClassFileParser.
   */
  protected void set_method(int i, /*@non_null*/String mname, /*@non_null*/String sig, int mod)
      throws ClassFormatError {
    MethodSignature signature = DescriptorParser.parseMethod(sig);
    FormalParaDeclVec formalVec = FormalParaDeclVec
        .make(makeFormals(signature));
    BlockStmt body = null;

    routines[i] = //@ nowarn IndexTooBig;
    mname.equals("<init>") ? (RoutineDecl) ConstructorDecl
        .make(mod, null, null, formalVec, emptyTypeNameVec, body,
              Location.NULL, classLocation, classLocation, classLocation)
        : (RoutineDecl) MethodDecl.make(mod, null, null, formalVec,
                                        emptyTypeNameVec, body, Location.NULL,
                                        classLocation, classLocation,
                                        classLocation,
                                        Identifier.intern(mname),
                                        signature.getReturn(), classLocation);
  }

  /**
   * Call back from ClassFileParser.
   */
  protected void set_method_body(int i, int max_stack, int max_local,
                                 byte[] code, int num_handlers)
      throws ClassFormatError {
    // put in a dummy body
    if (!includeBodies)
      return;
    RoutineDecl routine = /*@(non_null)*/ this.routines[i];
    routine.body = //@ nowarn Null, IndexTooBig;
    BlockStmt.make(StmtVec.make(), classLocation, classLocation);
    routine.locOpenBrace = classLocation;
  }

  /**
   * Call back from ClassFileParser.
   */
  protected void set_method_handler(int i, int j, int start_pc, int end_pc,
                                    int handler_pc, int catch_index)
      throws ClassFormatError {
    // don't need method handlers
  }

  /**
   * Call back from ClassFileParser.
   */
  protected void set_method_attribute(int i, /*@non_null*/String aname, /*@non_null*/DataInput stream,
                                      int n) throws IOException,
      ClassFormatError {
    // look for the Exceptions attribute and modify the appropriate method, if
    // necessary

    if (aname.equals("Exceptions")) {
      (/*@(non_null)*/routines[i]).raises = TypeNameVec
          .make(parseTypeNames((DataInputStream) stream)); //@ nowarn Null, Cast, IndexTooBig;
    } else if (aname.equals("Synthetic")) {
      synthetics.addElement(routines[i]); //@ nowarn ;
    } else {
      stream.skipBytes(n);
    }
  }

  /* -- private instance variables ----------------------------------------- */

  /**
   * The input file being parsed.
   */
  /*@ non_null */GenericFile inputFile;

  /**
   * The constant pool of the class being parsed.
   * Initialized by set_num_constants.
   * Elements initialized by set_const and set_const_ref.
   *
   * Dynamic element types according to constant tag:
   * UTF8                String
   * String              String
   * Class               TypeName
   * Integer             Integer
   * Float               Float
   * Long                Long
   * Double              Double
   * FieldRef            null
   * MethodRef           null
   * InterfaceMethodRef  null
   */
  //@ private invariant \typeof(constants) == \type(Object[]);
  private /*@non_null*/Object[/*#@nullable*/] constants;

  /**
   * The constant pool of the class being parsed.
   * This array contains the constants as they came out of the
   * parser (versus translated by DescriptorParser).  Initialized
   * by set_const and set_num_constants.
   */
  //@ private invariant \typeof(rawConstants) == \type(Object[]);
  //@ private invariant constants.length == rawConstants.length;
  private /*@non_null*/Object[/*#@nullable*/] rawConstants;

  /**
   * The modifiers of the class being parsed.
   * Initialized by set_modifiers.
   */
  private int modifiers;

  /**
   * The contant pool index of this class.
   * Initialized by set_this_class.
   */
  private int this_class_index;

  /**
   * The type name of the class being parsed.
   * Initialized by set_this_class.
   */
  //private TypeName this_class;
  /**
   * The type name of the superclass of the class being parsed.
   * Initialized by set_super_class.
   */
  private TypeName super_class;

  /**
   * The type names of the interfaces implemented by the class being parsed.
   * Initialized by set_num_interfaces.
   * Elements initialized by set_interface.
   */
  //@ private invariant \typeof(interfaces) == \type(TypeName[]);
  private /*@non_null*/ TypeName[] interfaces;

  /**
   * The class members of the class being parsed.
   * Intialized by set_field, set_method, and set_class_attributes.
   */
  private /*@non_null*/ TypeDeclElemVec classMembers = TypeDeclElemVec.make(0);

  /**
   * The fields of the class being parsed.
   * Initialized by set_num_fields.
   * Elements initialized by set_field.
   */
  //@ invariant \typeof(fields) == \type(FieldDecl[]);
  //@ spec_public
  private /*@non_null*/ FieldDecl[/*#@non_null*/] fields;

  /**
   * The methods and constructors of the class being parsed.
   * Initialized by set_num_methods.
   * Elements initialized by set_method.
   */
  //@ invariant \typeof(routines) == \type(RoutineDecl[]);
  //@ spec_public
  private /*@non_null*/ RoutineDecl[] routines;

  /**
   * The identifier of the class being parsed.
   * Initialized by set_this_class.
   */
  //@ spec_public
  private Identifier classIdentifier;

  /* -- private instance methods ------------------------------------------- */

  /**
   * Parse a sequence of type names from a given stream.
   * @param stream                the stream to parse the type names from
   * @return                      an array of type names
   * @exception ClassFormatError  if the type names are not class constants
   */
  //@ ensures \nonnullelements(\result);
  //@ ensures \typeof(\result)==\type(TypeName[]);
  private /*@non_null*/TypeName[/*#@non_null*/] parseTypeNames(/*@non_null*/DataInputStream stream) throws IOException,
      ClassFormatError {
    int count = stream.readUnsignedShort();
    TypeName[] names = new TypeName[count];

    for (int i = 0; i < count; i++) {
      int index = stream.readUnsignedShort();

      if (index >= constants.length)
        throw new ClassFormatError("unknown constant");

      Object constant = constants[index];

      if (!(constant instanceof TypeName))
        throw new ClassFormatError("not a class constant");

      names[i] = (TypeName) constant;
    }

    return names;
  }

  /**
   * Construct a vector of formal parameters from a method signature.
   * @param signature  the method signature to make the formal parameters from
   * @return           the formal parameters
   */
  //@ ensures \nonnullelements(\result);
  //@ ensures \typeof(\result) == \type(FormalParaDecl[]);
  private /*@non_null*/FormalParaDecl[/*#@non_null*/] makeFormals(/*@non_null*/MethodSignature signature) {
    int length = signature.countParameters();
    FormalParaDecl[] formals = new FormalParaDecl[length];

    for (int i = 0; i < length; i++) {
      Identifier id = Identifier.intern("arg" + i);
      formals[i] = FormalParaDecl.make(0, null, id, signature.parameterAt(i),
                                       classLocation);
    }

    return formals;
  }

  /* -- private class methods ---------------------------------------------- */

  /**
   * Return the package qualifier of a given name.
   * @param name  the name to return the package qualifier of
   * @return      the package qualifier of name
   */
  private static Name getNameQualifier(/*@non_null*/Name name) {
    int size = name.size();

    return size > 1 ? name.prefix(size - 1) : null;
    // using null for the unnamed package ???
  }

  /**
   * Return the terminal identifier of a given name.
   * @param name  the name to return the terminal identifier of
   * @return      the terminal identifier of name
   */
  private static Identifier getNameTerminal(/*@non_null*/Name name) {
    return name.identifierAt(name.size() - 1);
  }

  /* -- private class variables -------------------------------------------- */

  /**
   * An empty type name vector.
   */
  //@ spec_public
  private static final /*@non_null*/TypeNameVec emptyTypeNameVec = TypeNameVec.make();

  /**
   * A null identifier.
   */
  /* UNUSED
   //@ invariant nullIdentifier != null;
   private static final Identifier nullIdentifier = Identifier.intern("");
   */

}