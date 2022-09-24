#include <jni.h>

#include <jni.h>
JNIEXPORT jstring JNICALL
Java_com_mrmansur_androidsecurekey_MainActivity_getPublicKey(JNIEnv *env, jobject instance) {

    return (*env)->  NewStringUTF(env, "long_public_key");
}
JNIEXPORT jstring JNICALL
Java_com_mrmansur_androidsecurekey_MainActivity_getPrivateKey(JNIEnv *env, jobject instance) {

    return (*env)->NewStringUTF(env, "long_private_key");
}

JNIEXPORT jstring JNICALL
Java_com_mrmansur_androidsecurekey_MyApplication_getKeyFromApplicationClass(JNIEnv *env, jobject instance) {
    return (*env)->NewStringUTF(env, "My Private Key");
}