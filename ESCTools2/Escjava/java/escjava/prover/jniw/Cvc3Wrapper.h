/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class escjava_prover_jniw_Cvc3Wrapper */

#ifndef _Included_escjava_prover_jniw_Cvc3Wrapper
#define _Included_escjava_prover_jniw_Cvc3Wrapper
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     escjava_prover_jniw_Cvc3Wrapper
 * Method:    natStartSolver
 * Signature: ()I
 */
JNIEXPORT jint JNICALL Java_escjava_prover_jniw_Cvc3Wrapper_natStartSolver
  (JNIEnv *, jobject);

/*
 * Class:     escjava_prover_jniw_Cvc3Wrapper
 * Method:    natStopSolver
 * Signature: ()I
 */
JNIEXPORT jint JNICALL Java_escjava_prover_jniw_Cvc3Wrapper_natStopSolver
  (JNIEnv *, jobject);

/*
 * Class:     escjava_prover_jniw_Cvc3Wrapper
 * Method:    natDeclType
 * Signature: (Ljava/lang/String;)I
 */
JNIEXPORT jint JNICALL Java_escjava_prover_jniw_Cvc3Wrapper_natDeclType
  (JNIEnv *, jobject, jstring);

/*
 * Class:     escjava_prover_jniw_Cvc3Wrapper
 * Method:    natDeclPreds
 * Signature: (Ljava/lang/String;)I
 */
JNIEXPORT jint JNICALL Java_escjava_prover_jniw_Cvc3Wrapper_natDeclPreds
  (JNIEnv *, jobject, jstring);

/*
 * Class:     escjava_prover_jniw_Cvc3Wrapper
 * Method:    natDeclFuns
 * Signature: (Ljava/lang/String;)I
 */
JNIEXPORT jint JNICALL Java_escjava_prover_jniw_Cvc3Wrapper_natDeclFuns
  (JNIEnv *, jobject, jstring);

/*
 * Class:     escjava_prover_jniw_Cvc3Wrapper
 * Method:    natAssert
 * Signature: (Ljava/lang/String;)I
 */
JNIEXPORT jint JNICALL Java_escjava_prover_jniw_Cvc3Wrapper_natAssert
  (JNIEnv *, jobject, jstring);

/*
 * Class:     escjava_prover_jniw_Cvc3Wrapper
 * Method:    natQuery
 * Signature: (Ljava/lang/String;)Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_escjava_prover_jniw_Cvc3Wrapper_natQuery
  (JNIEnv *, jobject, jstring);

/*
 * Class:     escjava_prover_jniw_Cvc3Wrapper
 * Method:    natUndo
 * Signature: (I)I
 */
JNIEXPORT jint JNICALL Java_escjava_prover_jniw_Cvc3Wrapper_natUndo
  (JNIEnv *, jobject, jint);

/*
 * Class:     escjava_prover_jniw_Cvc3Wrapper
 * Method:    natSetFlags
 * Signature: (Ljava/lang/String;)I
 */
JNIEXPORT jint JNICALL Java_escjava_prover_jniw_Cvc3Wrapper_natSetFlags
  (JNIEnv *, jobject, jstring);

#ifdef __cplusplus
}
#endif
#endif
