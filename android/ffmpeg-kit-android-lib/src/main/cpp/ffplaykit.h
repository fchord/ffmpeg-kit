
#ifndef FFPLAY_KIT_H
#define FFPLAY_KIT_H

#include <jni.h>

/*
 * Class:     com_arthenica_ffmpegkit_FFplayKit
 * Method:    nativeFFplayMain
 * Signature: (Ljava/lang/String;)I
 */
JNIEXPORT jint JNICALL Java_com_arthenica_ffmpegkit_FFplayKit_nativeFFplayMain(JNIEnv *env, jclass object, jstring arguments);


/*
 * Class:     com_arthenica_ffmpegkit_FFplayKit
 * Method:    nativeFFplayExecute
 * Signature: (Ljava/lang/String;)I
 */
JNIEXPORT jint JNICALL Java_com_arthenica_ffmpegkit_FFplayKit_nativeFFplayExecute(JNIEnv *env, jclass object, jstring arguments);

#endif  /* FFPLAY_KIT_H */
