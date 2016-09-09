//
//  Register.cpp
//  android.frameworks.base.core.database
//
//  Created by intel on 26/11/15.
//
//

#define LOG_TAG "database" // We'll be next to "dalvikvm" in the log; make the distinction clear.

#include "cutils/log.h"
#include "JniConstants.h"
#include "ScopedLocalFrame.h"

#include <stdlib.h>

#ifdef MOE
#define MOE_ONLOAD(name)                               \
jint JNI_OnLoad_Local_##name(JavaVM*, void*);            \
extern "C" jint JNI_OnLoad_##name(JavaVM* vm, void* p) { \
return JNI_OnLoad_Local_##name(vm, p);                 \
}                                                        \
jint JNI_OnLoad_Local_##name(JavaVM* vm, void* p)

MOE_ONLOAD(database) {
#else
    jint JNI_OnLoad(JavaVM* vm, void*) {
#endif
        JNIEnv* env;
        if (vm->GetEnv(reinterpret_cast<void**>(&env), JNI_VERSION_1_6) != JNI_OK) {
            ALOGE("JavaVM::GetEnv() failed");
            abort();
        }
        
        ScopedLocalFrame localFrame(env);
        
#define REGISTER(FN) extern void FN(JNIEnv*); FN(env)
        REGISTER(register_android_util_Log);
        REGISTER(register_android_database_CursorWindow);
        REGISTER(register_android_database_SQLiteConnection);
        REGISTER(register_android_database_SQLiteDebug);
        REGISTER(register_android_database_SQLiteGlobal);
        REGISTER(register_android_os_MemoryFile);
        REGISTER(register_android_os_Parcel);
        REGISTER(register_android_os_SystemClock);
        REGISTER(register_android_content_ContextImpl);
        REGISTER(register_android_content_res_AssetManager);
        REGISTER(register_android_os_Process);
        REGISTER(register_android_os_MessageQueue);
#undef REGISTER
        
        return JNI_VERSION_1_6;
    }