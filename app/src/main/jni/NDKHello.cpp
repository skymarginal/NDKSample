#include "com_yscall_ndksample_JNIUtils.h"
JNIEXPORT jstring JNICALL Java_com_yscall_ndksample_JNIUtils_getHelloString
    (JNIEnv *env, jclass jclass){
    return env->NewStringUTF("Hello JNI!!!!!");
}
