// Generated by jmlspec from the .class file

package java.lang;

public class CloneNotSupportedException extends java.lang.Exception {

    /*@
      @  public normal_behavior
      @    ensures standardThrowable(null);
      @*/
    //@ pure
    public CloneNotSupportedException();

    /*@
      @  public normal_behavior
      @    ensures standardThrowable(s);
      @*/
    //@ pure
    public CloneNotSupportedException(/*@(houdini:parameter:constructor) non_null */ String s);
}
