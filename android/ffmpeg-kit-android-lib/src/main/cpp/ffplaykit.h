
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
 * Method:    nativeFFplayTest
 * Signature: (Ljava/lang/String;)I
 */
JNIEXPORT jint JNICALL Java_com_arthenica_ffmpegkit_FFplayKit_nativeFFplayTest(JNIEnv *env, jclass object, jstring arguments);

#endif  /* FFPLAY_KIT_H */
