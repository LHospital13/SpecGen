package java.lang;


/* Only specification information is available for this type */

public final 
class Class
implements java.io.Serializable, java.lang.reflect.GenericDeclaration, java.lang.reflect.Type, java.lang.reflect.AnnotatedElement
{
   
   /* Only specification information is available for this type */

   private static 
   class AnnotationData
   {
      AnnotationData(java.util.Map arg0, java.util.Map arg1, int arg2)
      {
        /* constructor body unavailable */
      }

      final java.util.Map annotations;

      final java.util.Map declaredAnnotations;

      final int redefinedCount;
   }

   
   /* Only specification information is available for this type */

   static 
   class MethodArray
   {
      MethodArray()
      {
        /* constructor body unavailable */
      }

      MethodArray(int arg0)
      {
        /* constructor body unavailable */
      }

      boolean hasDefaults()
      {
        /* method body unavailable */
      }

      void add(java.lang.reflect.Method arg0)
      {
        /* method body unavailable */
      }

      void addAll(java.lang.reflect.Method[] arg0)
      {
        /* method body unavailable */
      }

      void addAll(java.lang.Class.MethodArray arg0)
      {
        /* method body unavailable */
      }

      void addIfNotPresent(java.lang.reflect.Method arg0)
      {
        /* method body unavailable */
      }

      void addAllIfNotPresent(java.lang.Class.MethodArray arg0)
      {
        /* method body unavailable */
      }

      void addInterfaceMethods(java.lang.reflect.Method[] arg0)
      {
        /* method body unavailable */
      }

      int length()
      {
        /* method body unavailable */
      }

      java.lang.reflect.Method get(int arg0)
      {
        /* method body unavailable */
      }

      java.lang.reflect.Method getFirst()
      {
        /* method body unavailable */
      }

      void removeByNameAndDescriptor(java.lang.reflect.Method arg0)
      {
        /* method body unavailable */
      }

      private void remove(int arg0)
      {
        /* method body unavailable */
      }

      private boolean matchesNameAndDescriptor(java.lang.reflect.Method arg0, java.lang.reflect.Method arg1)
      {
        /* method body unavailable */
      }

      void compactAndTrim()
      {
        /* method body unavailable */
      }

      void removeLessSpecifics()
      {
        /* method body unavailable */
      }

      java.lang.reflect.Method[] getArray()
      {
        /* method body unavailable */
      }

      static boolean hasMoreSpecificClass(java.lang.reflect.Method arg0, java.lang.reflect.Method arg1)
      {
        /* method body unavailable */
      }
   }

   
   /* Only specification information is available for this type */

   private static 
   class ReflectionData
   {
      ReflectionData(int arg0)
      {
        /* constructor body unavailable */
      }

      volatile java.lang.reflect.Field[] declaredFields;

      volatile java.lang.reflect.Field[] publicFields;

      volatile java.lang.reflect.Method[] declaredMethods;

      volatile java.lang.reflect.Method[] publicMethods;

      volatile java.lang.reflect.Constructor[] declaredConstructors;

      volatile java.lang.reflect.Constructor[] publicConstructors;

      volatile java.lang.reflect.Field[] declaredPublicFields;

      volatile java.lang.reflect.Method[] declaredPublicMethods;

      volatile java.lang.Class[] interfaces;

      final int redefinedCount;
   }

   
   /* Only specification information is available for this type */

   private static 
   class Atomic
   {
      private Atomic()
      {
        /* constructor body unavailable */
      }

      private static long objectFieldOffset(java.lang.reflect.Field[] arg0, java.lang.String arg1)
      {
        /* method body unavailable */
      }

      static boolean casReflectionData(java.lang.Class arg0, java.lang.ref.SoftReference arg1, java.lang.ref.SoftReference arg2)
      {
        /* method body unavailable */
      }

      static boolean casAnnotationType(java.lang.Class arg0, sun.reflect.annotation.AnnotationType arg1, sun.reflect.annotation.AnnotationType arg2)
      {
        /* method body unavailable */
      }

      static boolean casAnnotationData(java.lang.Class arg0, java.lang.Class.AnnotationData arg1, java.lang.Class.AnnotationData arg2)
      {
        /* method body unavailable */
      }

         }

   
   /* Only specification information is available for this type */

   private static final 
   class EnclosingMethodInfo
   {
      private EnclosingMethodInfo(java.lang.Object[] arg0)
      {
        /* constructor body unavailable */
      }

      boolean isPartial()
      {
        /* method body unavailable */
      }

      boolean isConstructor()
      {
        /* method body unavailable */
      }

      boolean isMethod()
      {
        /* method body unavailable */
      }

      java.lang.Class getEnclosingClass()
      {
        /* method body unavailable */
      }

      java.lang.String getName()
      {
        /* method body unavailable */
      }

      java.lang.String getDescriptor()
      {
        /* method body unavailable */
      }

   }

   private static native void registerNatives();

   private Class(java.lang.ClassLoader arg0);

   public java.lang.String toString();

   public java.lang.String toGenericString();

   public static java.lang.Class forName(java.lang.String arg0) throws java.lang.ClassNotFoundException;

   public static java.lang.Class forName(java.lang.String arg0, boolean arg1, java.lang.ClassLoader arg2) throws java.lang.ClassNotFoundException;

   private static native java.lang.Class forName0(java.lang.String arg0, boolean arg1, java.lang.ClassLoader arg2, java.lang.Class arg3) throws java.lang.ClassNotFoundException;

   public java.lang.Object newInstance() throws java.lang.InstantiationException, java.lang.IllegalAccessException;

   public native boolean isInstance(java.lang.Object arg0);

   public native boolean isAssignableFrom(java.lang.Class arg0);

   public native boolean isInterface();

   public native boolean isArray();

   public native boolean isPrimitive();

   public boolean isAnnotation();

   public boolean isSynthetic();

   public java.lang.String getName();

   private native java.lang.String getName0();

   public java.lang.ClassLoader getClassLoader();

   java.lang.ClassLoader getClassLoader0();

   public java.lang.reflect.TypeVariable[] getTypeParameters();

   public native java.lang.Class getSuperclass();

   public java.lang.reflect.Type getGenericSuperclass();

   public java.lang.Package getPackage();

   public java.lang.Class[] getInterfaces();

   private native java.lang.Class[] getInterfaces0();

   public java.lang.reflect.Type[] getGenericInterfaces();

   public native java.lang.Class getComponentType();

   public native int getModifiers();

   public native java.lang.Object[] getSigners();

   native void setSigners(java.lang.Object[] arg0);

   public java.lang.reflect.Method getEnclosingMethod() throws java.lang.SecurityException;

   private native java.lang.Object[] getEnclosingMethod0();

   private java.lang.Class.EnclosingMethodInfo getEnclosingMethodInfo();

   private static java.lang.Class toClass(java.lang.reflect.Type arg0);

   public java.lang.reflect.Constructor getEnclosingConstructor() throws java.lang.SecurityException;

   public java.lang.Class getDeclaringClass() throws java.lang.SecurityException;

   private native java.lang.Class getDeclaringClass0();

   public java.lang.Class getEnclosingClass() throws java.lang.SecurityException;

   public java.lang.String getSimpleName();

   public java.lang.String getTypeName();

   private static boolean isAsciiDigit(char arg0);

   public java.lang.String getCanonicalName();

   public boolean isAnonymousClass();

   public boolean isLocalClass();

   public boolean isMemberClass();

   private java.lang.String getSimpleBinaryName();

   private boolean isLocalOrAnonymousClass();

   public java.lang.Class[] getClasses();

   public java.lang.reflect.Field[] getFields() throws java.lang.SecurityException;

   public java.lang.reflect.Method[] getMethods() throws java.lang.SecurityException;

   public java.lang.reflect.Constructor[] getConstructors() throws java.lang.SecurityException;

   public java.lang.reflect.Field getField(java.lang.String arg0) throws java.lang.NoSuchFieldException, java.lang.SecurityException;

   public java.lang.reflect.Method getMethod(java.lang.String arg0, java.lang.Class[] arg1) throws java.lang.NoSuchMethodException, java.lang.SecurityException;

   public java.lang.reflect.Constructor getConstructor(java.lang.Class[] arg0) throws java.lang.NoSuchMethodException, java.lang.SecurityException;

   public java.lang.Class[] getDeclaredClasses() throws java.lang.SecurityException;

   public java.lang.reflect.Field[] getDeclaredFields() throws java.lang.SecurityException;

   public java.lang.reflect.Method[] getDeclaredMethods() throws java.lang.SecurityException;

   public java.lang.reflect.Constructor[] getDeclaredConstructors() throws java.lang.SecurityException;

   public java.lang.reflect.Field getDeclaredField(java.lang.String arg0) throws java.lang.NoSuchFieldException, java.lang.SecurityException;

   public java.lang.reflect.Method getDeclaredMethod(java.lang.String arg0, java.lang.Class[] arg1) throws java.lang.NoSuchMethodException, java.lang.SecurityException;

   public java.lang.reflect.Constructor getDeclaredConstructor(java.lang.Class[] arg0) throws java.lang.NoSuchMethodException, java.lang.SecurityException;

   public java.io.InputStream getResourceAsStream(java.lang.String arg0);

   public java.net.URL getResource(java.lang.String arg0);

   public java.security.ProtectionDomain getProtectionDomain();

   private native java.security.ProtectionDomain getProtectionDomain0();

   static native java.lang.Class getPrimitiveClass(java.lang.String arg0);

   private void checkMemberAccess(int arg0, java.lang.Class arg1, boolean arg2);

   private void checkPackageAccess(java.lang.ClassLoader arg0, boolean arg1);

   private java.lang.String resolveName(java.lang.String arg0);

   private java.lang.Class.ReflectionData reflectionData();

   private java.lang.Class.ReflectionData newReflectionData(java.lang.ref.SoftReference arg0, int arg1);

   private native java.lang.String getGenericSignature0();

   private sun.reflect.generics.factory.GenericsFactory getFactory();

   private sun.reflect.generics.repository.ClassRepository getGenericInfo();

   native byte[] getRawAnnotations();

   native byte[] getRawTypeAnnotations();

   static byte[] getExecutableTypeAnnotationBytes(java.lang.reflect.Executable arg0);

   native sun.reflect.ConstantPool getConstantPool();

   private java.lang.reflect.Field[] privateGetDeclaredFields(boolean arg0);

   private java.lang.reflect.Field[] privateGetPublicFields(java.util.Set arg0);

   private static void addAll(java.util.Collection arg0, java.lang.reflect.Field[] arg1);

   private java.lang.reflect.Constructor[] privateGetDeclaredConstructors(boolean arg0);

   private java.lang.reflect.Method[] privateGetDeclaredMethods(boolean arg0);

   private java.lang.reflect.Method[] privateGetPublicMethods();

   private static java.lang.reflect.Field searchFields(java.lang.reflect.Field[] arg0, java.lang.String arg1);

   private java.lang.reflect.Field getField0(java.lang.String arg0) throws java.lang.NoSuchFieldException;

   private static java.lang.reflect.Method searchMethods(java.lang.reflect.Method[] arg0, java.lang.String arg1, java.lang.Class[] arg2);

   private java.lang.reflect.Method getMethod0(java.lang.String arg0, java.lang.Class[] arg1, boolean arg2);

   private java.lang.reflect.Method privateGetMethodRecursive(java.lang.String arg0, java.lang.Class[] arg1, boolean arg2, java.lang.Class.MethodArray arg3);

   private java.lang.reflect.Constructor getConstructor0(java.lang.Class[] arg0, int arg1) throws java.lang.NoSuchMethodException;

   private static boolean arrayContentsEq(java.lang.Object[] arg0, java.lang.Object[] arg1);

   private static java.lang.reflect.Field[] copyFields(java.lang.reflect.Field[] arg0);

   private static java.lang.reflect.Method[] copyMethods(java.lang.reflect.Method[] arg0);

   private static java.lang.reflect.Constructor[] copyConstructors(java.lang.reflect.Constructor[] arg0);

   private native java.lang.reflect.Field[] getDeclaredFields0(boolean arg0);

   private native java.lang.reflect.Method[] getDeclaredMethods0(boolean arg0);

   private native java.lang.reflect.Constructor[] getDeclaredConstructors0(boolean arg0);

   private native java.lang.Class[] getDeclaredClasses0();

   private static java.lang.String argumentTypesToString(java.lang.Class[] arg0);

   public boolean desiredAssertionStatus();

   private static native boolean desiredAssertionStatus0(java.lang.Class arg0);

   public boolean isEnum();

   private static sun.reflect.ReflectionFactory getReflectionFactory();

   private static void checkInitted();

   public java.lang.Object[] getEnumConstants();

   java.lang.Object[] getEnumConstantsShared();

   java.util.Map enumConstantDirectory();

   public java.lang.Object cast(java.lang.Object arg0);

   private java.lang.String cannotCastMsg(java.lang.Object arg0);

   public java.lang.Class asSubclass(java.lang.Class arg0);

   public java.lang.annotation.Annotation getAnnotation(java.lang.Class arg0);

   public boolean isAnnotationPresent(java.lang.Class arg0);

   public java.lang.annotation.Annotation[] getAnnotationsByType(java.lang.Class arg0);

   public java.lang.annotation.Annotation[] getAnnotations();

   public java.lang.annotation.Annotation getDeclaredAnnotation(java.lang.Class arg0);

   public java.lang.annotation.Annotation[] getDeclaredAnnotationsByType(java.lang.Class arg0);

   public java.lang.annotation.Annotation[] getDeclaredAnnotations();

   private java.lang.Class.AnnotationData annotationData();

   private java.lang.Class.AnnotationData createAnnotationData(int arg0);

   boolean casAnnotationType(sun.reflect.annotation.AnnotationType arg0, sun.reflect.annotation.AnnotationType arg1);

   sun.reflect.annotation.AnnotationType getAnnotationType();

   java.util.Map getDeclaredAnnotationMap();

   public java.lang.reflect.AnnotatedType getAnnotatedSuperclass();

   public java.lang.reflect.AnnotatedType[] getAnnotatedInterfaces();

   transient java.lang.ClassValue.ClassValueMap classValueMap;
}

