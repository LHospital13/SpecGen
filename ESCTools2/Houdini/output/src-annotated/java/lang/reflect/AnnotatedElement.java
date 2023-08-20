package java.lang.reflect;

import java.lang.annotation.Annotation;

public interface AnnotatedElement
{
    /*@(houdini:interface method) ensures \result != null; */
    Annotation getAnnotation(/*@(houdini:parameter:interface method) non_null */ Class annotationClass);

    /*@(houdini:interface method) ensures \result != null; */
    /*@(houdini:interface method) ensures \result != null ==> \nonnullelements(\result); */
    Annotation[] getAnnotations();

    /*@(houdini:interface method) ensures \result != null; */
    /*@(houdini:interface method) ensures \result != null ==> \nonnullelements(\result); */
    Annotation[] getDeclaredAnnotations();

    boolean isAnnotationPresent(/*@(houdini:parameter:interface method) non_null */ Annotation annotationClass);
}
