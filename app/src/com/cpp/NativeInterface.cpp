#include "com_java_NativeInterface.h"
#include <stdio.h>

JNIEXPORT void JNICALL Java_com_java_NativeInterface_nativeMethod(JNIEnv *env, jobject obj){
    //Native method implementation here;
    printf("Hello from C++!");
}