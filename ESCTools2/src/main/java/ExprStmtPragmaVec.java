/**
 ** ExprStmtPragmaVec: A Vector of ExprStmtPragma's. <p>
 **
 ** The interface to this class follows java.util.Vector, where
 ** appropriate. <p>
 **
 **
 ** This class was automatically created from the template
 ** javafe.util/_<tt>TYPE</tt>_Vec.j.<p>, i.e.
 ** $Id: ExprStmtPragmaVec.j 1928 2006-05-19 12:43:10Z chalin $
 **
 ** DO NOT EDIT!!<p>
 **/

/*
 * File: ExprStmtPragmaVec.java <p>
 *
 * This file is a template for a vector of X.  It is filled in using
 * sed (e.g, see the Makefile for javafe.ast).  The following
 * replacements need to be done:<p>
 *
 * ExprStmtPragma should be globally replaced with the simple name of the
 *		element type<p>
 * escjava.ast should be globally replaced with the package the resulting
 *		Vector type should live in<p>
 * escjava.ast should be globally replaced with the package the
 *		element type belongs to<p>
 *
 * The resulting type will have name ExprStmtPragmaVec.<p>
 * 
 * Example: to make a vector of java.lang.Integer's that lives in
 * javafe.ast, substitute Integer, javafe.ast, and java.lang
 * respectively.<p>
 *
 *
 * By Default, ExprStmtPragmaVec's may not contain nulls.  If the ability to
 * hold nulls is desired, remove all lines with "// @@@@" on them.<p>
 */


package escjava.ast;


import java.util.Vector;
import javafe.util.StackVector;

import escjava.ast.ExprStmtPragma;


public class  ExprStmtPragmaVec {

    /***************************************************
     *                                                 *
     * Instance fields:				       *
     *                                                 *
     ***************************************************/

    private /*@ spec_public non_null*/ ExprStmtPragma[] elements;
    //@ invariant (\forall int i; (0<=i && i<count) ==> elements[i]!=null);
    //@ invariant \typeof(elements) == \type(ExprStmtPragma[]);

    //@ invariant elements.owner == this;

    /*@spec_public*/ private int count;
    //@ invariant 0 <= count;
    //@ invariant count <= elements.length;


    /***************************************************
     *                                                 *
     * Private constructors:			       *
     *                                                 *
     ***************************************************/

    //@ requires els!=null;
    //@ requires \nonnullelements(els);				// @@@@
    //@ ensures count == els.length;
    //@ pure
    private ExprStmtPragmaVec(ExprStmtPragma[] els) {
	this.count = els.length;
	this.elements = new ExprStmtPragma[count];
	//@ set elements.owner = this;

	System.arraycopy(els,0, elements,0, count);
    }

    //@ requires cnt >= 0;
    //@ ensures this.elements.length >= cnt;
    //@ pure
    private ExprStmtPragmaVec(int cnt) {
	this.elements = new ExprStmtPragma[(cnt == 0 ? 2 : cnt)];
	//@ set elements.owner = this;

	this.count = 0;
    }


    /***************************************************
     *                                                 *
     * Public maker methods:			       *
     *                                                 *
     ***************************************************/

    //@ ensures \result!=null;
    //@ ensures \fresh(\result);
    //@ pure
    public static ExprStmtPragmaVec make() { 
	return new ExprStmtPragmaVec(0);
    }

    //@ requires count >= 0;
    //@ ensures \result!=null;
    //@ ensures \fresh(\result);
    public static ExprStmtPragmaVec make(int count) { 
	return new ExprStmtPragmaVec(count);
    }

    //@ requires vec!=null;
    //@ requires vec.elementType <: \type(ExprStmtPragma);
    //@ requires !vec.containsNull;
    //@ ensures \result!=null;
    //@ ensures \fresh(\result);
    public static ExprStmtPragmaVec make(Vector vec) {
	int sz = vec.size();
	ExprStmtPragmaVec result = new ExprStmtPragmaVec(sz);
	result.count = sz;
	vec.copyInto(result.elements);
	return result;
    }

    //@ requires els!=null;
    //@ requires \nonnullelements(els);
    //@ ensures \result!=null;
    //@ ensures \result.count == els.length;
    //@ ensures \fresh(\result);
    public static ExprStmtPragmaVec make(ExprStmtPragma[] els) {
	return new ExprStmtPragmaVec(els);
    }

    //
    //@ requires s.vectorCount>1;
    //@ requires s.elementType <: \type(ExprStmtPragma);
    //@ ensures \result!=null;
    //@ ensures \result.count == (\old(s.elementCount) - \old(s.currentStackBottom));
    // These are from pop() on s:
    //@ modifies s.vectorCount;
    //@ ensures s.vectorCount == \old(s.vectorCount)-1;
    //@ modifies s.elementCount, s.currentStackBottom;
    public static ExprStmtPragmaVec popFromStackVector(/*@non_null*/ StackVector s) {
	// Creates a new ExprStmtPragmaVec from top stuff in StackVector
	int sz = s.size();
	ExprStmtPragmaVec r = new ExprStmtPragmaVec(sz);
	s.copyInto(r.elements);
	r.count = sz;
	s.pop();
	return r;
    }


    /***************************************************
     *                                                 *
     * Other methods:				       *
     *                                                 *
     ***************************************************/

    //@ requires 0<=index && index<count;
    //@ ensures \result!=null;					// @@@@
    //@ pure
    public final ExprStmtPragma elementAt(int index)
	  /*throws ArrayIndexOutOfBoundsException*/ {
	if (index < 0 || index >= count)
	    throw new ArrayIndexOutOfBoundsException(index);

	javafe.util.Assert.notNull(elements[index]);		// @@@@
	return elements[index];
    }

    //@ requires 0<=index && index<count;
    //@ requires x!=null;					// @@@@
    public final void setElementAt(ExprStmtPragma x, int  index) 
	/*throws ArrayIndexOutOfBoundsException*/ {
	if (index < 0 || index >= count)
	    throw new ArrayIndexOutOfBoundsException(index);
	elements[index] = x;
    }

    //@ ensures \result==count;
    //@ pure
    public final int size() { return count; }

    public final /*@non_null*/String toString() {
	StringBuffer b = new StringBuffer();
	b.append("{ExprStmtPragmaVec");
	for(int i = 0; i < count; i++) {
	    b.append(" ");
	    if (elements[i]==null)
		b.append("null");
	    else
		b.append(elements[i].toString());
	}
	b.append('}');
	return b.toString();
    }

  //@ ensures \result!=null;
  //@ ensures \nonnullelements(\result);			// @@@@
  //@ pure
  public final ExprStmtPragma[] toArray() {
      int ct = count;
      ExprStmtPragma[] b = new ExprStmtPragma[ ct ];
      for(int i = 0; i < ct; i++) {
	  b[i]=elements[i];
      }
      return b;
  }

  //@ ensures \result!=null;
  //@ pure
  public final ExprStmtPragmaVec copy() {
    ExprStmtPragmaVec result = new ExprStmtPragmaVec(count);
    result.count = count;
    System.arraycopy(elements,0,result.elements,0,count);
    return result;
  }

  //@ requires x!=null;						// @@@@
  public boolean contains(ExprStmtPragma x) {
    for(int i = 0; i < count; i++) {
      if( elements[i] == x ) return true;
    }
    return false;
  }

  //@ requires x!=null;						// @@@@
  //@ modifies count,elements;
  //@ ensures count==\old(count)+1;
  public final void addElement(ExprStmtPragma x) {
    if( count == elements.length ) {
      ExprStmtPragma[] newElements = new ExprStmtPragma[ 2*(elements.length==0 ?
					      2 : elements.length) ];
      //@ set newElements.owner = this;

      System.arraycopy(elements, 0, newElements, 0, elements.length );
      elements = newElements;
    }
    elements[count++]=x;
  }

  //@ requires x!=null;						// @@@@
  //@ modifies count;
  public final boolean removeElement(ExprStmtPragma x) {
    for( int i=0; i<count; i++ ) {
      if( elements[i] == x ) {
	  int ct=count;
	for( int j=i+1; j<ct; j++ ) 
	  elements[j-1]=elements[j];
	count--;
	return true;
      }
    }
    return false;
  }

    //@ requires 0<=i && i<count;
    //@ modifies count;
    public final void removeElementAt(int i) {
	int ct=count;
        for (int j=i+1; j<ct; j++) {
            elements[j-1]=elements[j];
	}	    
        count--;
    }

    //@ requires count>0;
    //@ modifies count;
    //@ ensures count==\old(count)-1;
    //@ ensures \result!=null;
    public final ExprStmtPragma pop() {
        count--;
        ExprStmtPragma result = elements[count];
	elements[count] = null;
	return result;
    }


    //@ modifies count;
    //@ ensures count==0;
    public final void removeAllElements() {
	count = 0;
    }


  //@ requires 0 <= index && index <= this.count;
  //@ requires obj!=null;
  //@ modifies count,elements;
  //@ ensures count==\old(count)+1;
  public final void insertElementAt(ExprStmtPragma obj, int index) {
    if( count == elements.length ) {
      ExprStmtPragma[] newElements = new ExprStmtPragma[ 2*(elements.length==0 ?
					      2 : elements.length) ];
      //@ set newElements.owner = this;
      System.arraycopy(elements, 0, newElements, 0, elements.length );
      elements = newElements;
    }
    int ct=count;
    //-@ loop_predicate i!=ct ==> elements[ct] != null, i<= ct; // FIXME - what are the semantics
    for( int i=count; i>index; i--) 
      elements[i]=elements[i-1];
    elements[index]=obj;
    count++;
  }

  //@ requires vec!=null;
  //@ modifies count,elements;
  //@ ensures count==\old(count)+vec.count;
  public final void append(ExprStmtPragmaVec vec) {
      //-@ loop_predicate count == \old(count)+i, i <= vec.count; // FIXME - what are the semantics
    for( int i=0; i<vec.size(); i++)
      addElement( vec.elementAt(i) );
  }
}

/* Copyright 2000, 2001, Compaq Computer Corporation */