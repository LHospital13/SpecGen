package java.lang;


/* Only specification information is available for this type */

public 
class Throwable
implements java.io.Serializable
{
   
   /* Only specification information is available for this type */

   private static 
   class WrappedPrintWriter
   extends java.lang.Throwable.PrintStreamOrWriter
   {
      WrappedPrintWriter(java.io.PrintWriter arg0)
      {
        /* constructor body unavailable */
      }

      java.lang.Object lock()
      {
        /* method body unavailable */
      }

      void println(java.lang.Object arg0)
      {
        /* method body unavailable */
      }
   }

   
   /* Only specification information is available for this type */

   private static 
   class WrappedPrintStream
   extends java.lang.Throwable.PrintStreamOrWriter
   {
      WrappedPrintStream(java.io.PrintStream arg0)
      {
        /* constructor body unavailable */
      }

      java.lang.Object lock()
      {
        /* method body unavailable */
      }

      void println(java.lang.Object arg0)
      {
        /* method body unavailable */
      }
   }

   
   /* Only specification information is available for this type */

   private static abstract 
   class PrintStreamOrWriter
   {
      private PrintStreamOrWriter()
      {
        /* constructor body unavailable */
      }

      abstract java.lang.Object lock();

      abstract void println(java.lang.Object arg0);
   }

   
   /* Only specification information is available for this type */

   private static 
   class SentinelHolder
   {
      private SentinelHolder()
      {
        /* constructor body unavailable */
      }

      
      public static final java.lang.StackTraceElement STACK_TRACE_ELEMENT_SENTINEL;

      public static final java.lang.StackTraceElement[] STACK_TRACE_SENTINEL;
   }

   public Throwable();

   public Throwable(java.lang.String arg0);

   public Throwable(java.lang.String arg0, java.lang.Throwable arg1);

   public Throwable(java.lang.Throwable arg0);

   protected Throwable(java.lang.String arg0, java.lang.Throwable arg1, boolean arg2, boolean arg3);

   public java.lang.String getMessage();

   public java.lang.String getLocalizedMessage();

   public synchronized java.lang.Throwable getCause();

   public synchronized java.lang.Throwable initCause(java.lang.Throwable arg0);

   public java.lang.String toString();

   public void printStackTrace();

   public void printStackTrace(java.io.PrintStream arg0);

   private void printStackTrace(java.lang.Throwable.PrintStreamOrWriter arg0);

   private void printEnclosedStackTrace(java.lang.Throwable.PrintStreamOrWriter arg0, java.lang.StackTraceElement[] arg1, java.lang.String arg2, java.lang.String arg3, java.util.Set arg4);

   public void printStackTrace(java.io.PrintWriter arg0);

   public synchronized java.lang.Throwable fillInStackTrace();

   private native java.lang.Throwable fillInStackTrace(int arg0);

   public java.lang.StackTraceElement[] getStackTrace();

   private synchronized java.lang.StackTraceElement[] getOurStackTrace();

   public void setStackTrace(java.lang.StackTraceElement[] arg0);

   native int getStackTraceDepth();

   native java.lang.StackTraceElement getStackTraceElement(int arg0);

   private void readObject(java.io.ObjectInputStream arg0) throws java.io.IOException, java.lang.ClassNotFoundException;

   private int validateSuppressedExceptionsList(java.util.List arg0) throws java.io.IOException;

   private synchronized void writeObject(java.io.ObjectOutputStream arg0) throws java.io.IOException;

   public final synchronized void addSuppressed(java.lang.Throwable arg0);

   public final synchronized java.lang.Throwable[] getSuppressed();
}

