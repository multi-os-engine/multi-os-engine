/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

#include "CxxRuntime.h"

#include <stdlib.h>

namespace natj {
    // Global for jvm
    JavaVM* jvm;

    JNIEnv* GetJNIEnv(bool& didAttachThread) {
        JNIEnv *env = nullptr;

        // Try to GetEnv
        jint result = jvm->GetEnv((void **)&env, JNI_VERSION_1_6);

        // Attach thread if needed
        if (result == JNI_EDETACHED) {
            Guard(jvm->AttachCurrentThread(&env, nullptr) == JNI_OK);
            didAttachThread = true;
        }

        // Otherwise require success
        else {
            Guard(result == JNI_OK);
        }

        return env;
    }

    void ThrowStdExc(const std::exception& exc) {
        CallWithJNIEnv([&](JNIEnv *env) {
            // Push locals
            Guard(env->PushLocalFrame(8) == JNI_OK);

            // Pop locals at end of scope
            auto defer = Defer([env]() {
                Guard(env->PopLocalFrame(nullptr) == JNI_OK);
            });
            NATJ_UNUSED_VARIABLE(defer);

            // Get StdException class
            jclass cls = env->FindClass("org/moe/natj/cxx/StdException");
            if (cls == nullptr) {
                env->ExceptionClear();
                env->FindClass("java/lang/RuntimeException");
                GuardNoJNIExc(env);
                Guard(cls != nullptr);
                env->ThrowNew(cls, "An std::exception occured and failed to "
                              "find org.moe.natj.StdException class");
                return;
            }

            // Throw exception
            env->ThrowNew(cls, exc.what());
        });
    }

    void ThrowGenericExc() {
        CallWithJNIEnv([&](JNIEnv *env) {
            // Push locals
            Guard(env->PushLocalFrame(8) == JNI_OK);

            // Pop locals at end of scope
            auto defer = Defer([env]() {
                Guard(env->PopLocalFrame(nullptr) == JNI_OK);
            });
            NATJ_UNUSED_VARIABLE(defer);

            // Get RuntimeException class and throw
            jclass cls = env->FindClass("java/lang/RuntimeException");
            GuardNoJNIExc(env);
            Guard(cls != nullptr);
            env->ThrowNew(cls, "An unknown exception ocurred");
        });
    }

    // Throws a Java exception to native code
    void ThrowJNIExcToNative(void *_env) {
        JNIEnv* env = (JNIEnv*)_env;
        if (env->ExceptionCheck()) {
            jthrowable t = (jthrowable)env->NewGlobalRef(env->ExceptionOccurred());
            env->ExceptionClear();
            throw Exception(t);
        }
    }

    // Throws a Java exception back to Java
    void ThrowJNIExc(Exception& exc) {
        CallWithJNIEnv([&](JNIEnv *env) {
            // Push locals
            Guard(env->PushLocalFrame(8) == JNI_OK);

            // Pop locals at end of scope
            auto defer = Defer([env]() {
                Guard(env->PopLocalFrame(nullptr) == JNI_OK);
            });
            NATJ_UNUSED_VARIABLE(defer);

            // Get RuntimeException class and throw
            Guard(env->Throw(exc.throwable) == 0);
            env->DeleteGlobalRef(exc.throwable);
            exc.throwable = nullptr;
        });
    }

    // Utility function for initializing method indexes
    inline void DoInitJMethodID(const char *__class, const char *__name,
                         const char *__sig, jmethodID* __target) {
        CallWithJNIEnv([&](JNIEnv *env) {
            // Push locals
            Guard(env->PushLocalFrame(8) == JNI_OK);

            // Pop locals at end of scope
            auto defer = Defer([env]() {
                Guard(env->PopLocalFrame(nullptr) == JNI_OK);
            });
            NATJ_UNUSED_VARIABLE(defer);

            // Get class
            jclass cls = env->FindClass(__class);
            GuardNoJNIExc(env);
            Guard(cls != nullptr);

            // Get method
            jmethodID method = env->GetStaticMethodID(cls, __name, __sig);
            GuardNoJNIExc(env);
            Guard(method != nullptr);

            // Set target
            Guard(*__target == nullptr);
            *__target = method;
        });
    }

#if NATJ_CXX_USE_WINDOWS_THREADING
    namespace windows {
        struct CtxData {
            const char *_class;
            const char *_name;
            const char *_sig;
            jmethodID* _target;
        };

        BOOL CALLBACK DoInitJMethodID(PINIT_ONCE InitOnce, PVOID Parameter,
                                      PVOID *lpContext) {
            const CtxData *tls = static_cast<const CtxData*>(Parameter);
            ::natj::DoInitJMethodID(tls->_class, tls->_name, tls->_sig, tls->_target);
            return TRUE;
        }
    }

#elif NATJ_CXX_USE_PTHREAD_THREADING
    namespace pthread {
        pthread_key_t TLSKey = 0;

        struct TLSData {
            const char *_class;
            const char *_name;
            const char *_sig;
            jmethodID* _target;
        };

        void TLSDestructor(void *value) {
            delete static_cast<TLSData*>(value);
            pthread_setspecific(TLSKey, NULL);
        }

        void DoInitJMethodID() {
            const TLSData *tls = static_cast<const TLSData*>(pthread_getspecific(TLSKey));
            ::natj::DoInitJMethodID(tls->_class, tls->_name, tls->_sig, tls->_target);
        }

        void Init_TLSKey() {
            Guard(pthread_key_create(&TLSKey, TLSDestructor) == 0);
        }

        inline TLSData* getTLSData() {
            static NATJ_INIT_FLAG_TYPE TLSFlag NATJ_INIT_FLAG_INIT;
            pthread_once(&TLSFlag, Init_TLSKey);
            auto data = static_cast<TLSData*>(pthread_getspecific(TLSKey));
            if (data == nullptr) {
                data = new TLSData{nullptr, nullptr, nullptr, nullptr};
                Guard(pthread_setspecific(TLSKey, data) == 0);
            }
            return data;
        }
    }
#endif

    // Utility function for initializing method indexes
    void InitJMethodID(NATJ_INIT_FLAG_TYPE& __flag, const char *__class,
                       const char *__name, const char *__sig,
                       jmethodID* __target) {
#if NATJ_CXX_USE_WINDOWS_THREADING
        windows::CtxData data = {
            ._class = __class,
            ._name = __name,
            ._sig = __sig,
            ._target = __target
        };
        Guard(InitOnceExecuteOnce(&__flag, windows::DoInitJMethodID, &data,
                                  nullptr));

#elif NATJ_CXX_USE_PTHREAD_THREADING
        auto tls = pthread::getTLSData();
        tls->_class = __class;
        tls->_name = __name;
        tls->_sig = __sig;
        tls->_target = __target;
        pthread_once(&__flag, pthread::DoInitJMethodID);

#elif NATJ_CXX_USE_STL_THREADING
        std::call_once(__flag, [__class, __name, __sig, __target]() {
            ::natj::DoInitJMethodID(__class, __name, __sig, __target);
        });
#endif
    }
}

JNIEXPORT void JNICALL Java_org_moe_natj_cxx_CxxRuntime_setupVM(JNIEnv * env, jclass) {
    natj::Guard(env->GetJavaVM(&natj::jvm) == JNI_OK);
}
