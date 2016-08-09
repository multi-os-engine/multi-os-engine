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

#ifndef NatJ_CxxRuntime_hpp
#define NatJ_CxxRuntime_hpp

#include <iostream>
#include <jni.h>
#include <stdlib.h>
#include <type_traits>

#if defined(_WIN32) && defined(_MSC_VER)
  #ifdef NATJ_EXPORT
    #define NATJ_API __declspec(dllexport)
  #else
    #define NATJ_API __declspec(dllimport)
  #endif
#else
  #define NATJ_API __attribute__((visibility("default")))
#endif

#ifdef _WIN32
  #if 0 // Use pthread model
    #define NATJ_CXX_USE_WINDOWS_THREADING 0
    #define NATJ_CXX_USE_PTHREAD_THREADING 1
    #define NATJ_CXX_USE_STL_THREADING 0
  #else
    #define NATJ_CXX_USE_WINDOWS_THREADING 1
    #define NATJ_CXX_USE_PTHREAD_THREADING 0
    #define NATJ_CXX_USE_STL_THREADING 0
  #endif
#else
  #if 0 // Use pthread model
    #define NATJ_CXX_USE_WINDOWS_THREADING 0
    #define NATJ_CXX_USE_PTHREAD_THREADING 1
    #define NATJ_CXX_USE_STL_THREADING 0
  #else
    #define NATJ_CXX_USE_WINDOWS_THREADING 0
    #define NATJ_CXX_USE_PTHREAD_THREADING 0
    #define NATJ_CXX_USE_STL_THREADING 1
  #endif
#endif

#if NATJ_CXX_USE_WINDOWS_THREADING
  #include <windows.h>
  #define NATJ_INIT_FLAG_TYPE INIT_ONCE
  #define NATJ_INIT_FLAG_INIT = INIT_ONCE_STATIC_INIT
#elif NATJ_CXX_USE_PTHREAD_THREADING
  #include <pthread.h>
  #define NATJ_INIT_FLAG_TYPE pthread_once_t
  #define NATJ_INIT_FLAG_INIT = PTHREAD_ONCE_INIT
#elif NATJ_CXX_USE_STL_THREADING
  #include <mutex>
  #define NATJ_INIT_FLAG_TYPE std::once_flag
  #define NATJ_INIT_FLAG_INIT
#else
  #error unsupported thread model
#endif

#ifndef NATJ_JOBJECT_T
#define NATJ_JOBJECT_T
struct natj_jobject_t {
    long long peer;
    natj_jobject_t(jlong p) : peer(p) {}
    operator jlong() const { return peer; }
};
static_assert(!std::is_polymorphic<natj_jobject_t>::value,
              "natj_jobject_t must be non polymorphic");
#endif /* NATJ_JOBJECT_T */

namespace natj {
    // Macro for silencing unused variables
#define NATJ_UNUSED_VARIABLE(expr) do { (void)(expr); } while (0)

    // Macro for defining a method index
#define NATJ_CASE_INIT_METHOD_INDEX(__name__, __sig__)\
__name__: { static NATJ_INIT_FLAG_TYPE flag NATJ_INIT_FLAG_INIT;\
natj::InitJMethodID(flag, __java_class_name, #__name__, __sig__, \
&__java_method_table[index]); break; }

    template<bool E, class A, class B>
    struct is_same {};

    template<class U, class B>
    struct is_same<true, U, B> {
        typedef typename std::underlying_type<U>::type A;
        static constexpr bool value = std::is_same<A, B>::value
                                   || std::is_same<U, B>::value;
    };

    template<class A, class B>
    struct is_same<false, A, B> {
        static constexpr bool value = std::is_same<A, B>::value;
    };

    template<class A, class B>
    struct assert_type {
        template<class C, class D>
        using underlying_type = is_same<std::is_enum<A>::value, C, D>;
        static constexpr bool value = underlying_type<A, B>::value;
    };
    
    template<class T>
    inline void destruct_ptr_elem(T* t,
                                  typename std::enable_if<std::is_class<T>::value
                                  && std::is_destructible<T>::value>::type* = 0) {
        t->~T();
    }
    
    template<class T>
    inline void destruct_ptr_elem(T* t,
                                  typename std::enable_if<!std::is_class<T>::value
                                  || !std::is_destructible<T>::value>::type* = 0) {}

    // Global for jvm
    NATJ_API extern JavaVM* jvm;

    // Class for implementing defer blocks
    template<typename T>
    class DeferBlock {
        T closure;
    public:
        DeferBlock(T __closure) : closure(__closure) { }
        ~DeferBlock() { closure(); }
    };

    // Factory function for creating DeferBlock objects
    template<typename T>
    DeferBlock<typename std::decay<T>::type> Defer(T&& __closure) {
        return { std::forward<T>(__closure) };
    }

    // Utility function for bailouts
    static inline void Guard(bool __condition) {
        if (!__condition) abort();
    }

    static inline void GuardNoJNIExc(JNIEnv *env) {
        if (env->ExceptionCheck()) {
            env->ExceptionDescribe();
            env->ExceptionClear();
            abort();
        }
    }

    // Utility funtion for retrieving JNIEnv and attaching thread on demand
    NATJ_API JNIEnv* GetJNIEnv(bool& didAttachThread);

    // Utility function for invoking Java methodsenabled
    template<typename _Callable>
    inline void CallWithJNIEnv(_Callable&& __func) {

        // Get JNIEnv & attach thread if needed
        bool didAttachThread = false;
        JNIEnv *env = GetJNIEnv(didAttachThread);

        // At end of scope detach thread if needed
        auto defer = Defer([didAttachThread]() {
            if (didAttachThread) {
                Guard(jvm->DetachCurrentThread() == JNI_OK);
            }
        });
        NATJ_UNUSED_VARIABLE(defer);

        // Call
        __func(env);
    }

    // Throws a Java exception from an std::exception
    NATJ_API void ThrowStdExc(const std::exception& exc);

    // Throws a Java exception from an unknown exception
    NATJ_API void ThrowGenericExc();

    // Class holding a Java exception
    class Exception {
    public:
        jthrowable throwable;
        Exception(jthrowable __throwable): throwable(__throwable) {}
    };

    // Throws a Java exception to native code
    NATJ_API void ThrowJNIExcToNative(void *_env);

    // Throws a Java exception back to Java
    NATJ_API void ThrowJNIExc(Exception& exc);

#if 1 // Enable C++ exception forwarding
  #define __NATJ_CXX_HANDLE_STD_EXC \
    catch(const std::exception& exc) { ::natj::ThrowStdExc(exc); }
  #define __NATJ_CXX_HANDLE_JNI_EXC \
    catch(natj::Exception& exc) { ::natj::ThrowJNIExc(exc); }
  #define __NATJ_CXX_GENERIC_EXC \
    catch(...) { ::natj::ThrowGenericExc(); }

  #define __NATJ_CXX_HANDLE_STD_EXC_RET \
    catch(const std::exception& exc) { ::natj::ThrowStdExc(exc); return 0; }
  #define __NATJ_CXX_HANDLE_JNI_EXC_RET \
    catch(natj::Exception& exc) { ::natj::ThrowJNIExc(exc); return 0; }
  #define __NATJ_CXX_GENERIC_EXC_RET \
    catch(...) { ::natj::ThrowGenericExc(); return 0; }

  #define NATJ_CXX_ENTER_EXC_HANDLER try {
  #define NATJ_CXX_EXIT_EXC_HANDLER } \
    __NATJ_CXX_HANDLE_STD_EXC \
    __NATJ_CXX_HANDLE_JNI_EXC \
    __NATJ_CXX_GENERIC_EXC
  #define NATJ_CXX_EXIT_EXC_HANDLER_RET } \
    __NATJ_CXX_HANDLE_STD_EXC_RET \
    __NATJ_CXX_HANDLE_JNI_EXC_RET \
    __NATJ_CXX_GENERIC_EXC_RET
#else
  #define NATJ_CXX_ENTER_EXC_HANDLER
  #define NATJ_CXX_EXIT_EXC_HANDLER
  #define NATJ_CXX_EXIT_EXC_HANDLER_RET
#endif

    // Utility function for initializing method indexes
    NATJ_API void InitJMethodID(NATJ_INIT_FLAG_TYPE& __flag,
                                const char *__class, const char *__name,
                                const char *__sig, jmethodID* __target);

    typedef size_t MethodIndex;

    // Utility function for calling a Java method
    template<typename T, typename _Callable>
    inline void CallWithJNIEnvAndClass(MethodIndex __index, _Callable&& __func) {
        CallWithJNIEnv([&](JNIEnv *env) {
            GuardNoJNIExc(env);

            // Push locals
            Guard(env->PushLocalFrame(8) == JNI_OK);

            // Pop locals at end of scope
            auto defer = Defer([env]() {
                Guard(env->PopLocalFrame(nullptr) == JNI_OK);
            });
            NATJ_UNUSED_VARIABLE(defer);

            // Get class
            jclass cls = env->FindClass(T::__java_class_name);
            GuardNoJNIExc(env);
            Guard(cls != nullptr);

            // Get method
            jmethodID method = T::__java_get_method(__index);

            // Call
            __func(env, cls, method);
        });
    }

    template<typename T>
    inline void CallStaticVoidMethod(jlong __peer, MethodIndex __index) {
        CallWithJNIEnvAndClass<T>(__index, [&](JNIEnv *env, jclass cls, jmethodID mID) {
            env->CallStaticVoidMethod(cls, mID, __peer);
            ThrowJNIExcToNative(env);
        });
    }

    template<typename T, class ...Args>
    inline void CallStaticVoidMethod(T* __this, MethodIndex __index, Args... args) {
        CallWithJNIEnvAndClass<T>(__index, [&](JNIEnv *env, jclass cls, jmethodID mID) {
            env->CallStaticVoidMethod(cls, mID, (jlong)__this->__java_object, args...);
            ThrowJNIExcToNative(env);
        });
    }

    template<typename T, class ...Args>
    inline jboolean CallStaticBooleanMethod(T* __this, MethodIndex __index, Args... args) {
        jboolean result;
        CallWithJNIEnvAndClass<T>(__index, [&](JNIEnv *env, jclass cls, jmethodID mID) {
            result = env->CallStaticBooleanMethod(cls, mID, (jlong)__this->__java_object, args...);
            ThrowJNIExcToNative(env);
        });
        return result;
    }

    template<typename T, class ...Args>
    inline jbyte CallStaticByteMethod(T* __this, MethodIndex __index, Args... args) {
        jbyte result;
        CallWithJNIEnvAndClass<T>(__index, [&](JNIEnv *env, jclass cls, jmethodID mID) {
            result = env->CallStaticByteMethod(cls, mID, (jlong)__this->__java_object, args...);
            ThrowJNIExcToNative(env);
        });
        return result;
    }

    template<typename T, class ...Args>
    inline jshort CallStaticShortMethod(T* __this, MethodIndex __index, Args... args) {
        jshort result;
        CallWithJNIEnvAndClass<T>(__index, [&](JNIEnv *env, jclass cls, jmethodID mID) {
            result = env->CallStaticShortMethod(cls, mID, (jlong)__this->__java_object, args...);
            ThrowJNIExcToNative(env);
        });
        return result;
    }

    template<typename T, class ...Args>
    inline jchar CallStaticCharMethod(T* __this, MethodIndex __index, Args... args) {
        jchar result;
        CallWithJNIEnvAndClass<T>(__index, [&](JNIEnv *env, jclass cls, jmethodID mID) {
            result = env->CallStaticCharMethod(cls, mID, (jlong)__this->__java_object, args...);
            ThrowJNIExcToNative(env);
        });
        return result;
    }

    template<typename T, class ...Args>
    inline jint CallStaticIntMethod(T* __this, MethodIndex __index, Args... args) {
        jint result;
        CallWithJNIEnvAndClass<T>(__index, [&](JNIEnv *env, jclass cls, jmethodID mID) {
            result = env->CallStaticIntMethod(cls, mID, (jlong)__this->__java_object, args...);
            ThrowJNIExcToNative(env);
        });
        return result;
    }

    template<typename T, class ...Args>
    inline jlong CallStaticLongMethod(T* __this, MethodIndex __index, Args... args) {
        jlong result;
        CallWithJNIEnvAndClass<T>(__index, [&](JNIEnv *env, jclass cls, jmethodID mID) {
            result = env->CallStaticLongMethod(cls, mID, (jlong)__this->__java_object, args...);
            ThrowJNIExcToNative(env);
        });
        return result;
    }

    template<typename T, class ...Args>
    inline jfloat CallStaticFloatMethod(T* __this, MethodIndex __index, Args... args) {
        jfloat result;
        CallWithJNIEnvAndClass<T>(__index, [&](JNIEnv *env, jclass cls, jmethodID mID) {
            result = env->CallStaticFloatMethod(cls, mID, (jlong)__this->__java_object, args...);
            ThrowJNIExcToNative(env);
        });
        return result;
    }

    template<typename T, class ...Args>
    inline jdouble CallStaticDoubleMethod(T* __this, MethodIndex __index, Args... args) {
        jdouble result;
        CallWithJNIEnvAndClass<T>(__index, [&](JNIEnv *env, jclass cls, jmethodID mID) {
            result = env->CallStaticDoubleMethod(cls, mID, (jlong)__this->__java_object, args...);
            ThrowJNIExcToNative(env);
        });
        return result;
    }
}

#ifdef __cplusplus
extern "C" {
#endif /* __cplusplus */

JNIEXPORT void JNICALL Java_org_moe_natj_cxx_CxxRuntime_setupVM(JNIEnv * env, jclass);

#ifdef __cplusplus
}
#endif /* __cplusplus */

#endif /* NatJ_CxxRuntime_hpp */
