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

#ifndef NatJ_NatJ_h
#define NatJ_NatJ_h

#include "jni.h"
#include <ffi.h>
#include <assert.h>
#include <stdint.h>
#include <string.h>

#ifdef _WIN32
#include <windows.h>
#ifdef _MSC_VER
#define alloca _alloca
#endif
#else
#include <dlfcn.h>
#endif

#ifdef __linux__
#include <functional>
#endif

#include <mutex>
#include <vector>

#ifdef __APPLE__
#include <stdexcept>
#endif

#ifdef _WIN32
#ifdef _WIN64
#define __NATJ_IS_64BIT__ 1
#else
#define __NATJ_IS_64BIT__ 0
#endif
#elif defined(__LP64__) && __LP64__
#define __NATJ_IS_64BIT__ 1
#else
#define __NATJ_IS_64BIT__ 0
#endif

#ifdef _WIN32
#define __NATJ_LONG_TYPE_IS_64BIT__ 0
#elif defined(__LP64__) && __LP64__
#define __NATJ_LONG_TYPE_IS_64BIT__ 1
#else
#define __NATJ_LONG_TYPE_IS_64BIT__ 0
#endif

#ifdef _WIN32
#define __NATJ_WCHART_TYPE_IS_32BIT__ 0
#else
#define __NATJ_WCHART_TYPE_IS_32BIT__ 1
#endif

#ifndef __NATJ_HAS_NATIVE_SIZED_TYPES__
#define __NATJ_HAS_NATIVE_SIZED_TYPES__ (\
!__NATJ_IS_64BIT__ || \
!__NATJ_LONG_TYPE_IS_64BIT__ || \
!__NATJ_WCHART_TYPE_IS_32BIT__)
#endif

#include "Logging.h"

/**
 * @defgroup METHOD_SPECIFIERS Method specifier macros
 * @brief Macros for Java method specifiers.
 * @{
 */
#define ACC_ABSTRACT 1024
#define ACC_FINAL 16
#define ACC_INTERFACE 512
#define ACC_NATIVE 256
#define ACC_PRIVATE 2
#define ACC_PROTECTED 4
#define ACC_PUBLIC 1
#define ACC_STATIC 8
#define ACC_STRICT 2048
#define ACC_SYNCHRONIZED 32
#define ACC_TRANSIENT 128
#define ACC_VOLATILE 64
/** @} */

#ifdef __APPLE__
#import <CoreFoundation/CoreFoundation.h>

#import <TargetConditionals.h>
#if TARGET_OS_IOS
#define NATJ_PLATFORM "ios"
#define NATJ_PLATFORM_ROOT_PACKAGE "apple"
#elif TARGET_OS_TV
#define NATJ_PLATFORM "tvos"
#define NATJ_PLATFORM_ROOT_PACKAGE "apple"
#elif TARGET_OS_MAC
#define NATJ_PLATFORM "mac"
#define NATJ_PLATFORM_ROOT_PACKAGE "apple"
#else
#error "unsupported platform"
#endif
#elif __linux
#define NATJ_PLATFORM "linux"
#elif defined(_WIN32)
#define NATJ_PLATFORM "win"
#else
#error "unsupported platform"
#endif

#ifndef NATJ_PLATFORM_ROOT_PACKAGE
#define NATJ_PLATFORM_ROOT_PACKAGE NATJ_PLATFORM
#endif

/** Attaches a valid JNIEnv instance for the current thread. */
#define ATTACH_ENV()                                                  \
  bool _hadToAttach = false;                                          \
  JNIEnv* env;                                                        \
  if (gJVM->GetEnv((void**)&env, JNI_VERSION_1_6) == JNI_EDETACHED) { \
    gJVM->AttachCurrentThread(&env, NULL);                            \
    _hadToAttach = true;                                              \
  }

/** Detaches JNIEnv instance. */
#define DETACH_ENV()             \
  if (_hadToAttach) {            \
    gJVM->DetachCurrentThread(); \
  }

/** The catched native exception. */
#define NATIVE_EXC __natExc

/** Enter part of handling native exceptions. */
#define HANDLE_NATIVE_EXCEPTION_ENTER(env) \
  jthrowable NATIVE_EXC = NULL;            \
  try {
/**
 * Exit part of handling native exceptions. Dispatches exceptions to the
 * appropriate handlers.
 * If the ObjCRuntime is disabled, it will rethrow a NilException.
 */
#ifdef __APPLE__
#define HANDLE_NATIVE_EXCEPTION_EXIT(env)                               \
  }                                                                     \
  catch (...) {                                                         \
    std::exception_ptr ptr = std::current_exception();                  \
    void* ex = **(void***)&ptr;                                         \
    if (ex == NULL)                                                     \
      NATIVE_EXC = (jthrowable)env->NewLocalRef(gNilExceptionInstance); \
    else                                                                \
      NATIVE_EXC = handleObjCException(env, ex);                        \
  }
#else
#define HANDLE_NATIVE_EXCEPTION_EXIT(env)                             \
  }                                                                   \
  catch (...) {                                                       \
    NATIVE_EXC = (jthrowable)env->NewLocalRef(gNilExceptionInstance); \
  }
#endif

/** Throws catched native exceptions to Java side. */
#define THROW_NATIVE_EXCEPTION_TO_JAVA(env) \
  if (NATIVE_EXC) {                         \
    env->Throw(NATIVE_EXC);                 \
    env->DeleteLocalRef(NATIVE_EXC);        \
  }

/** The catched Java exception. */
#define JAVA_EXC __javaExc

/**
 * Handles Java exceptions.
 * If ObjCRuntime is disabled, this does nothing.
 */
#ifdef __APPLE__
#define HANDLE_JAVA_EXCEPTION(env)                          \
  jthrowable JAVA_EXC = NULL;                               \
  if (hasObjCRuntimeBeenInitialized()) {                    \
       JAVA_EXC = env->ExceptionOccurred();                 \
      if (JAVA_EXC) {                                       \
        JAVA_EXC = (jthrowable)env->NewGlobalRef(JAVA_EXC); \
        env->ExceptionClear();                              \
      }                                                     \
  }
#else
#define HANDLE_JAVA_EXCEPTION(env) jthrowable JAVA_EXC = NULL
#endif

/**
 * Throws catched Java exceptions to native side.
 * If ObjCRuntime is disabled, this does nothing.
 */
#ifdef __APPLE__
#define THROW_JAVA_EXCEPTION_TO_NATIVE(env)                           \
  if (JAVA_EXC) {                                                     \
    void* exc;                                                        \
    if (env->IsAssignableFrom(env->GetObjectClass(JAVA_EXC),          \
                              gNativeExceptionClass)) {               \
      jobject nobj =                                                  \
          env->CallObjectMethod(JAVA_EXC, gGetNativeExceptionMethod); \
      jobject pointer =                                               \
          env->CallObjectMethod(nobj, gGetNativeObjectPeerMethod);    \
      env->DeleteLocalRef(nobj);                                      \
      exc = reinterpret_cast<void*>(                                  \
          env->CallLongMethod(pointer, gGetPointerPeerMethod));       \
      env->DeleteLocalRef(pointer);                                   \
    } else {                                                          \
      exc = createObjCException(env, JAVA_EXC);                       \
    }                                                                 \
    env->DeleteGlobalRef(JAVA_EXC);                                   \
    DETACH_ENV();                                                     \
    throwObjCException(exc);                                          \
  }
#else
#define THROW_JAVA_EXCEPTION_TO_NATIVE(env)
#endif

/**
 * Prepares for out argument handling.
 */
#ifdef __APPLE__
#define PREPARE_FOR_OUT_ARG_HANDLING(inputB, inputC, container, skip) \
  do {                                                                \
    if (skip && inputC) {                                             \
      for (size_t i = 0; i < inputC; i++) {                           \
        inputB[i] = inputB[i] + skip;                                 \
      }                                                               \
    }                                                                 \
    std::vector<size_t> temp(inputB, inputB + inputC);                \
    container = std::move(temp);                                      \
  } while (false)
#else
#define PREPARE_FOR_OUT_ARG_HANDLING(inputB, inputC, container, skip) \
  do {                                                                \
  } while (false)
#endif

/**
 * Saves object references for out argument handling.
 */
#ifdef __APPLE__
#define SAVE_FOR_OUT_ARG_HANDLING(container)                                   \
  jobject* _savedObjectRefs = nullptr;                                         \
  do {                                                                         \
    if (container.size()) {                                                    \
      _savedObjectRefs = (jobject*)alloca(sizeof(jobject) * container.size()); \
      for (size_t i = 0; i < container.size(); i++) {                          \
        _savedObjectRefs[i] = *(jobject*)args[container[i]];                   \
      }                                                                        \
    }                                                                          \
  } while (false)
#else
#define SAVE_FOR_OUT_ARG_HANDLING(container) \
  do {                                    \
  } while (false)
#endif

/**
 * Refreshes out object pointers for out argument handling.
 */
#ifdef __APPLE__
#define REFRESH_FOR_OUT_ARG_HANDLING(container)                             \
  do {                                                                      \
    for (size_t i = 0; i < container.size(); i++) {                         \
      if (_savedObjectRefs[i]) {                                            \
        env->CallVoidMethod(_savedObjectRefs[i], gRefreshRetainListMethod); \
      }                                                                     \
    }                                                                       \
  } while (false)
#else
#define REFRESH_FOR_OUT_ARG_HANDLING(container) \
  do {                                          \
  } while (false)
#endif

/**
 * Helper macro for pointer alignment.
 */
#define ALIGN(ptr, align) (void*)(((((uintptr_t)ptr) - 1) | (align - 1)) + 1)

/** Tells whether the JVM is still running **/
extern bool gJVMIsRunning;

/** Singleton Java object for native nil exceptions. */
extern jthrowable gNilExceptionInstance;

#ifdef __APPLE__
/**
 * Handler for Objective-C exceptions
 *
 * This will convert the native exception to a Java exception and throw it with
 * jni.
 *
 * Defined by Objective-C Runtime.
 *
 * @param env JNIEnv pointer for the current thread
 * @param exc Pointer to the Objective-C exception object
 */
extern jthrowable handleObjCException(JNIEnv* env, void* exc);

/**
 * Creates an Objective-C exception from a Java exception
 *
 * Defined by Objective-C Runtime.
 *
 * @param env JNIEnv pointer for the current thread
 * @param exc The Java exception we want to create Objective-C exception from
 * @return The Objective-C exception
 */
extern void* createObjCException(JNIEnv* env, jthrowable exc);

/**
 * Function to throw Objective-C exceptions
 *
 * This throws the native exception.
 * Defined by Objective-C Runtime.
 *
 * @param exc The Objective-C exception we want to throw
 */
extern void throwObjCException(void* exc);

/**
 * Tells whether the Objective-C Runtime has been initilized
 *
 * Defined by Objective-C Runtime.
 *
 * @return The initialization state
 */
extern bool hasObjCRuntimeBeenInitialized();
#endif

/**
 * JVM pointer
 *
 * Used for getting JNIEnv instances available for an actual thread.
 */
extern JavaVM* gJVM;

extern "C" {
/**
 * Initializer for NatJ
 *
 * Initializes NatJ, looks up Java classes and methods, initializes nil
 * exception singleton object.
 *
 * Also documented in NatJ.java
 *
 * @param env JNIEnv pointer for the current thread
 * @param clazz Java class of NatJ, used for nothing
 */
JNIEXPORT void JNICALL
    Java_org_moe_natj_general_NatJ_initialize(JNIEnv* env, jclass clazz);

/**
 * Handles JVM shutdown
 *
 * Also documented in NatJ.java
 *
 * @param env JNIEnv pointer for the current thread
 * @param clazz Java class of NatJ, used for nothing
 */
JNIEXPORT void JNICALL
    Java_org_moe_natj_general_NatJ_handleShutdown(JNIEnv* env,
                                                      jclass clazz);

/**
 * Returns the platform name
 *
 * @param env JNIEnv pointer for the current thread
 * @param clazz Java class of NatJ, used for nothing
 * @return The platform name.
 */
JNIEXPORT jstring JNICALL
    Java_org_moe_natj_general_NatJ_getPlatformName(JNIEnv* env,
                                                       jclass clazz);

/**
 * Get the runtime system framework path on simulator.
 *
 * @param env JNIEnv pointer for the current thread
 * @param clazz Java class of NatJ, used for nothing
 * @return The path to the CoreFoundation.framework if running on simulator, or NULL on read device.
 */
JNIEXPORT jstring JNICALL
    Java_org_moe_natj_general_NatJ_getSimulatorFrameworkPath(JNIEnv* env,
                                                             jclass clazz);

/**
 * Try to load framework.
 * Should be applied only for darwin OS.
 *
 * @param path The full path to framework executable file
 *
 * @return Status of loading. True for cussess and false for
 * all other cases
 */
JNIEXPORT jboolean JNICALL
    Java_org_moe_natj_general_NatJ_loadFramework(JNIEnv* env,
                                                            jclass clazz,
                                                            jstring path);

/**
 * On macos symbols are by default loaded with "RTLD_GLOBAL", on linux with "RTLD_LOCAL".
 * This leads to the error, that NatJ can't find the symbols of librarys loaded with "System.load".
 * This is the workaround.
 *
 * @param path path to library to load
 * */
JNIEXPORT jboolean JNICALL
    Java_org_moe_natj_general_NatJ_loadGlobalLinux(JNIEnv* env,
                                                            jclass clazz,
                                                            jstring path);
}

extern jclass gObjectClass;
extern jclass gAnnotatedElementClass;
extern jclass gAnnotationClass;
extern jclass gNatJClass;
extern jclass gClassClass;
extern jclass gAsmTypeClass;
extern jclass gByValueClass;
#if !__NATJ_IS_64BIT__
extern jclass gNFloatClass;
extern jclass gNUIntClass;
extern jclass gNIntClass;
#endif
#if !__NATJ_LONG_TYPE_IS_64BIT__
extern jclass gNLongClass;
extern jclass gNULongClass;
#endif
#if !__NATJ_WCHART_TYPE_IS_32BIT__
extern jclass gWCharTClass;
#endif
extern jclass gBooleanClass;
extern jclass gByteClass;
extern jclass gCharClass;
extern jclass gShortClass;
extern jclass gIntClass;
extern jclass gLongClass;
extern jclass gFloatClass;
extern jclass gDoubleClass;
extern jclass gVoidClass;
extern jclass gBoxedBooleanClass;
extern jclass gBoxedByteClass;
extern jclass gBoxedCharClass;
extern jclass gBoxedShortClass;
extern jclass gBoxedIntClass;
extern jclass gBoxedLongClass;
extern jclass gBoxedFloatClass;
extern jclass gBoxedDoubleClass;
extern jclass gBoxedVoidClass;
extern jclass gBooleanArrayClass;
extern jclass gByteArrayClass;
extern jclass gCharArrayClass;
extern jclass gShortArrayClass;
extern jclass gIntArrayClass;
extern jclass gLongArrayClass;
extern jclass gFloatArrayClass;
extern jclass gDoubleArrayClass;
extern jclass gPointerClass;
extern jclass gNativeObjectClass;
extern jclass gLibraryClass;
extern jclass gRuntimeClass;
extern jclass gMethodClass;
extern jclass gStructureClass;
extern jclass gStructureFieldClass;
extern jclass gMappedClass;
extern jclass gMappedReturnClass;
extern jclass gOwnedClass;
extern jclass gNativeExceptionClass;
extern jclass gThrowableClass;
extern jclass gReferenceInfoClass;
extern jclass gCallableClass;
extern jclass gPtrClass;
extern jclass gParameterizedTypeClass;
extern jclass gWildcardTypeClass;
extern jclass gVariadicClass;
extern jclass gVariadicArgClass;
extern jclass gMapVariadicArgClass;
extern jclass gBoxVariadicArgClass;
extern jclass gUnboxVariadicArgClass;
extern jclass gNUIntVariadicArgClass;
extern jclass gNIntVariadicArgClass;
extern jclass gNFloatVariadicArgClass;
extern jclass gNULongVariadicArgClass;
extern jclass gNLongVariadicArgClass;
extern jclass gWCharTVariadicArgClass;
extern jclass gByValueVariadicArgClass;
extern jclass gNativeRuntimeClass;
#ifdef __APPLE__
extern jclass gObjCObjectClass;  // Defined by Objective-C Runtime.
extern jclass gObjCObjectPtrImplClass;
#endif


extern jmethodID gIsAnnotationPresentMethod;
extern jmethodID gAnnotationTypeMethod;
extern jmethodID gGetAnnotationMethod;
extern jmethodID gGetAnnotationsMethod;
extern jmethodID gGetDeclaredMethodsMethod;
extern jmethodID gGetMethodsMethod;
extern jmethodID gGetDeclaringClassMethod;
extern jmethodID gIsSyntheticMethodMethod;
extern jmethodID gGetMethodDescriptorStaticMethod;
extern jmethodID gGetClassInterfacesMethod;
extern jmethodID gGetClassNameMethod;
extern jmethodID gGetClassSimpleNameMethod;
extern jmethodID gIsAnonymousClassMethod;
extern jmethodID gGetNativeObjectPeerMethod;
extern jmethodID gGetNativeObjectPeerPointerMethod;
extern jmethodID gGetPointerPeerMethod;
extern jmethodID gGetModifiersMethod;
extern jmethodID gIsDefaultMethodMethod;
extern jmethodID gGetReturnTypeMethod;
extern jmethodID gGetParameterTypesMethod;
extern jmethodID gGetMethodNameMethod;
extern jmethodID gLookUpLibraryStaticMethod;
extern jmethodID gGetMethodDeclaringClassMethod;
extern jmethodID gGetStructFieldOrderMethod;
extern jmethodID gGetStructFieldIsGetterMethod;
extern jmethodID gToNativeStaticMethod;
extern jmethodID gToJavaStaticMethod;
extern jmethodID gBuildJavaObjectInfoStaticMethod;
extern jmethodID gBuildNativeObjectInfoStaticMethod;
extern jmethodID gGetMappedMethod;
extern jmethodID gGetMappedReturnMethod;
extern jmethodID gGetParameterAnnotationsMethod;
extern jmethodID gGetParameterAnnotationsInheritedStaticMethod;
extern jmethodID gGetRuntimeStaticMethod;
extern jmethodID gGetNativeExceptionMethod;
extern jmethodID gGetMessageMethod;
extern jmethodID gGetOrCreateInstanceOfRuntimeClassStaticMethod;
extern jmethodID gAddStrongReferenceStaticMethod;
extern jmethodID gRemoveStrongReferenceStaticMethod;
extern jmethodID gGetStrongReferenceStaticMethod;
extern jmethodID gAddWeakReferenceStaticMethod;
extern jmethodID gRemovWeakReferenceStaticMethod;
extern jmethodID gGetWeakReferenceStaticMethod;
extern jmethodID gBooleanValueMethod;
extern jmethodID gByteValueMethod;
extern jmethodID gCharValueMethod;
extern jmethodID gShortValueMethod;
extern jmethodID gIntValueMethod;
extern jmethodID gLongValueMethod;
extern jmethodID gFloatValueMethod;
extern jmethodID gDoubleValueMethod;
extern jmethodID gBoxedLongConstructorMethod;
extern jmethodID gGetGenericParameterTypesMethod;
extern jmethodID gGetActualTypeArgumentsMethod;
extern jmethodID gGetUpperBoundsMethodMethod;
extern jmethodID gGetVariadicArgInstanceMethod;
extern jmethodID gGetMapVariadicArgMapperMethod;
extern jmethodID gGetVariadicUnboxPolicyMethod;
extern jmethodID gGetNFloatVariadicArgNFloatMethod;
extern jmethodID gGetNUIntVariadicArgNUIntMethod;
extern jmethodID gGetNIntVariadicArgNIntMethod;
extern jmethodID gGetDefaultUnboxPolicyMethod;
#ifdef __APPLE__
extern jmethodID gRefreshRetainListMethod;
#endif

extern jbyte gRuntimeVariadicPolicyValue;
extern jbyte gBoxVariadicPolicyValue;
extern jbyte gUnboxVariadicPolicyValue;

/**
 * Container for mutex instances
 */
struct MutexInstance {
  std::mutex* getMutex();
};

/* Locks pointer */
#define LOCK_POINTER(ptr)                                 \
  MutexInstance* _inst = getMutexInstanceForPointer(ptr); \
  std::mutex* _mutex = _inst->getMutex();                 \
  _mutex->lock()

/* Unlocks pointer */
#define UNLOCK_POINTER() \
  _mutex->unlock();      \
  releaseMutexInstance(_inst)

#if !__NATJ_IS_64BIT__
extern ffi_type ffi_type_nfloat;
extern ffi_type ffi_type_nint;
extern ffi_type ffi_type_nuint;
#endif
#if !__NATJ_LONG_TYPE_IS_64BIT__
extern ffi_type ffi_type_nlong;
extern ffi_type ffi_type_nulong;
#endif
#if !__NATJ_WCHART_TYPE_IS_32BIT__
extern ffi_type ffi_type_wchart;
#endif

#if __NATJ_HAS_NATIVE_SIZED_TYPES__
enum NativeSizedType { kNo,
#if !__NATJ_IS_64BIT__
    kNFloat, kNInt, kNUInt,
#endif
#if !__NATJ_LONG_TYPE_IS_64BIT__
    kNLong, kNULong,
#endif
#if !__NATJ_WCHART_TYPE_IS_32BIT__
    kWCharT,
#endif
};
#endif

/**
 * Flags for variadic methods
 */
enum Variadic : int8_t {
  kNotVariadic          = 0b000000,

  kBoxVariadic          = 0b000001,
  kUnboxVariadic        = 0b000010,

  kBooleanVariadic      = 0b000100,
  kByteVariadic         = 0b001000,
  kCharVariadic         = 0b001100,
  kShortVariadic        = 0b010000,
  kIntVariadic          = 0b010100,
  kLongVariadic         = 0b011000,
#if !__NATJ_IS_64BIT__
  kNUIntVariadic        = 0b011100,
  kNIntVariadic         = 0b100000,
#endif
  kFloatVariadic        = 0b100100,
  kDoubleVariadic       = 0b101000,
#if !__NATJ_IS_64BIT__
  kNFloatVariadic       = 0b101100,
#endif
  kPrimRangeVariadic    = 0b111100,
#if !__NATJ_LONG_TYPE_IS_64BIT__
  kNLongVariadic        = 0b1000100,
  kNULongVariadic       = 0b1001000,
#endif
#if !__NATJ_WCHART_TYPE_IS_32BIT__
  kWCharTVariadic       = 0b1001100,
#endif
};

/**
 * Returns a function pointer for calling Java methods
 *
 * @param env JNIEnv pointer for the current thread
 * @param type The return value type of the returned function pointer
 * @param isStatic Set true for static and false for non-static function pointer
 * @return The function pointer
 */
void* getJNICallFunction(JNIEnv* env, ffi_type* type, bool isStatic);

/**
 * Returns the respective native type of a Java class
 *
 * This will call getCachedFFIType(JNIEnv*, jclass) to get an already computed
 * native type from the cache if @a byValue is true.
 *
 * @param env JNIEnv pointer for the current thread
 * @param type The Java type we want to get the native type for
 * @param byValue Set false for reference types and false otherwise
 * @param promoted Switch for using promoted types used for variadic arguments
 * @param native Specifed for native word sized types. (Only used on 32bit
 * platforms.)
 * @return The native type
 */
ffi_type* getFFIType(JNIEnv* env, jclass type, jboolean byValue,
#if !__NATJ_HAS_NATIVE_SIZED_TYPES__
                     jboolean promoted = false);
#else
                     jboolean promoted = false, NativeSizedType native = kNo);
#endif

/**
 * Returns the cached native type of the class
 *
 * This will fetch the static __natjCache field of the @a type, and hence will
 * invoke the static initializer of the class if it isn't initialized at the
 * time. The static intializer will always end up with storing a native type in
 * the field with setCachedFFIType(JNIEnv*, jclass, ffi_type*), thus getting
 * the value of the cache will always result in a valid native type.
 *
 * @param env JNIEnv pointer for the current thread
 * @param type The Java type we want to get the cached native type for
 * @return The native type
 */
ffi_type* getCachedFFIType(JNIEnv* env, jclass type);

/**
 * Cache a native type for a class
 *
 * This will store the native @a type in the static __natjCache field.
 * This should be used for caching whenever a static initializer of a
 * StrucObject or any other reasonable class invoked.
 *
 * @param env JNIEnv pointer for the current thread
 * @param type The Java type we want to set the cached native type of
 * @param cType The native type we want to cache
 */
void setCachedFFIType(JNIEnv* env, jclass type, ffi_type* cType);

/**
 * Builds Java objects containing every information needed for calling Java or
 * native side
 *
 * This function will build JavaObjectConstructionInfo and
 * NativeObjectConstructionInfo instances for the return and the argument types
 * of a given @a method. In the case of a Java method this will generate
 * NativeObjectConstructionInfo instance for a complex return type and
 * JavaObjectConstructionInfo instances for every argument of complex type.
 * Reasonably, this will generate construction infos in the other way around for
 * native methods. Those construction infos can be used for toNative and toJava
 * conversion calls and they contain every needed information.
 *
 * @param env JNIEnv pointer for the current thread
 * @param method The method we want to build construction infos for
 * @param toJava Set true for Java calls and false for native calls
 * @param paramInfos Out argument containing an array of construction infos for
 * complex arguments
 * @param returnInfo Out argument containing a construction info for complex
 * return value type
 * @param variadic In/Out argument for variadic methods
 * @param ptrBuff Set it if locating of ptr arguments are needed. It has to
 * point to a space with at least (arg number - ptrCount) number of elements.
 * @param ptrCount In/out argument. As an in arg it tells how many arguments to
 * skip, and as an out arg it tells the number of elements.
 */
void buildInfos(JNIEnv* env, jobject method, bool toJava, jobject** paramInfos,
                jobject* returnInfo, int8_t* variadic = NULL,
                size_t* ptrBuff = NULL, size_t* ptrCount = NULL);

/**
 * Cleanup the built construction infos
 *
 * @param env JNIEnv pointer for the current thread
 * @param paramInfos The array of the construction infos built for complex
 * arguments
 * @param returnInfo The built construction info for the return value type
 */
void destroyInfos(JNIEnv* env, jobject* paramInfos, jobject returnInfo);

enum ValueConverterKind { kToJava, kToNative };

/**
 * Helper class used for converting values between Java and native sides
 */
template <ValueConverterKind K>
class ValueConverter {
 public:
  typedef std::function<void(unsigned, ffi_type**, void**)> Callback;

  struct Descriptor {
    JNIEnv* env;
    unsigned nvalues;
    ffi_type** types;
    void** values;
    jobject* infos;
    int8_t variadic;
    bool promote;
    jobject runtime;

    ffi_type** preTypes;
    void** preValues;
    unsigned preNumber;
  };

  ValueConverter(const Descriptor& desc, Callback cb) {
    auto sizes = computeBufferSizes(desc);

    void** ptrBuffer = (void**)alloca(std::get<0>(sizes));
    uint8_t* valBuffer = (uint8_t*)alloca(std::get<1>(sizes));
    ffi_type** typeBuffer = (ffi_type**)alloca(std::get<2>(sizes));

    ptrItr = ptrBuffer;
    valItr = valBuffer;
    typeItr = typeBuffer;

    ptrItr = (void**)((((intptr_t)ptrItr - 1) | (sizeof(void*) - 1)) + 1);
    typeItr = (ffi_type**)((((intptr_t)typeItr - 1) | (sizeof(ffi_type*) - 1)) + 1);

    oldPtrItr = desc.values;
    oldTypeItr = desc.types;
    infoItr = desc.infos;

    for (unsigned i = 0; i < desc.preNumber; i++) {
      *typeItr = desc.preTypes[i];
      *ptrItr = desc.preValues[i];
      typeItr++;
      ptrItr++;
    }

    unsigned n = convert(desc);

    cb(n + desc.preNumber, typeBuffer, ptrBuffer);
  }

 private:
  void** ptrItr;
  uint8_t* valItr;
  void** oldPtrItr;
  jobject* infoItr;
  ffi_type** oldTypeItr;
  ffi_type** typeItr;

  static ffi_type* getNeededType(ffi_type*, bool promote);

  template <class T>
  T getOld() {
    return **(T**)oldPtrItr;
  }

  void* getOldDirect() { return *oldPtrItr; }

  ffi_type* getOldType() { return *oldTypeItr; }

  jobject getInfoAndNext() {
    jobject ret = *infoItr;
    infoItr++;
    return ret;
  }

  template <class T>
  void putAndNext(T val) {
    valItr = (uint8_t*)(((intptr_t)valItr - 1) | (sizeof(T) - 1)) + 1;
    *(T*)valItr = val;
    *ptrItr = valItr;
    *typeItr = typeFor<T>();
    valItr += sizeof(T);
    ptrItr++;
    typeItr++;
    oldPtrItr++;
    oldTypeItr++;
  }

  void putAndNext(ffi_type* type, void* val) {
    valItr = (uint8_t*)(((intptr_t)valItr - 1) | (type->size - 1)) + 1;
    memcpy(valItr, val, type->size);
    *ptrItr = valItr;
    *typeItr = type;
    valItr += type->size;
    typeItr++;
    ptrItr++;
    oldPtrItr++;
    oldTypeItr++;
  }

  void putOldAndNext() {
    *ptrItr = *oldPtrItr;
    *typeItr = *oldTypeItr;
    ptrItr++;
    typeItr++;
    oldPtrItr++;
    oldTypeItr++;
  }

  void putDirectAndNext(ffi_type* type, void* val) {
    *ptrItr = val;
    *typeItr = type;
    ptrItr++;
    typeItr++;
    oldPtrItr++;
    oldTypeItr++;
  }

  template <class T>
  ffi_type* typeFor();

  /**
   * Converts between Java and native values
   *
   * TODO: implement promotion support for variadic calls
   *
   * @param env JNIEnv pointer for the current thread
   * @param nvalues The number of the values to convert
   * @param types The types of the values to convert
   * @param values Pointer array containing the values of the arguments
   * @param infos The construction infos containing every information needed for
   * the conversion
   * @param promote Whether we have to promote values for a variadic call
   * @param replace Switch for enabling inplace-replacement of converted values
   * @return The number of values converted
   */
  unsigned convert(const Descriptor&);

  std::tuple<size_t, size_t, size_t> computeBufferSizes(
      const Descriptor& desc) {
    size_t slots = desc.nvalues;
    size_t valBytes = 0;

    for (unsigned i = 0; i < desc.nvalues; i++) {
      ffi_type* type = getNeededType(desc.types[i], desc.promote);
      if (type) {
        valBytes = ((valBytes - 1) | (type->size - 1)) + 1;
        valBytes += type->size;
      }
    }

    if (desc.variadic != kNotVariadic) {
      unsigned c = desc.env->GetArrayLength(*(jarray*)desc.values[desc.nvalues]);
      if (c) {
        slots += c;
        valBytes = ((valBytes - 1) | (8 - 1)) + 1;
        valBytes += 8 * c;
      }
    }

    if (desc.preNumber) {
      slots += desc.preNumber;
    }

    size_t slotBytes = (sizeof(void*) * slots) + 4;
    valBytes += 4;

    return std::make_tuple(slotBytes, valBytes, slotBytes);
  }
};

/**
 * Returns and retains a mutex embedden in a @a MutexInstance
 *
 * This will return a @a MutexInstance for the given pointer as a key and also
 * will retain it.
 * The key should be the pointer of a callback handler's user data pointer.
 * This function is thread-safe.
 *
 * @param key The pointer key we want to get a @a MutexInstance for
 */
MutexInstance* getMutexInstanceForPointer(void* key);

/**
 * Releases a @a MutexInstance
 *
 * This will release a @a MutexInstance. The key should be the pointer of a
 * callback handler's user data pointer.
 * This function is thread-safe.
 *
 * @param instance The instance we want to release
 */
void releaseMutexInstance(MutexInstance* instance);

/**
 * Dispatches class startup
 *
 * This will dispatch a class startup initialization to the responsible runtime.
 * This function is intended to be called from outside.
 *
 * @param env JNIEnv pointer for the current thread
 * @param name The name of the Java class we want to do initialization for
 */
extern "C" void handleStartup(JNIEnv* env, const char* name);

/**
 * Handles shutdown
 *
 * @param env JNIEnv pointer for the current thread
 */
extern "C" void handleShutdown(JNIEnv* env);

/**
 * Force inits a Java class
 *
 * @param env JNIEnv pointer for the current thread
 * @param clazz The Java class we want to do initialization for
 */
void forceInitClass(JNIEnv* env, jclass clazz);

/**
 * Prints callback failure information and aborts
 *
 * @param type type of the failure
 * @param env JNIEnv pointer for the current thread
 * @param method method that failed.
 */
void failCallbackWithMethod(const char* type, JNIEnv* env, jobject method);

/**
 * Creates a strong reference
 *
 * @param env JNIEnv pointer for the current thread
 * @param object what we want to create reference for
 * @return the reference
 */
uint64_t addStrongReference(JNIEnv* env, jobject object);

/**
 * Removes a strong reference
 *
 * @param env JNIEnv pointer for the current thread
 * @param reference what we want to remove
 * @return whether an element was removed
 */
bool removeStrongReference(JNIEnv* env, uint64_t reference);

/**
 * Gets a strong reference
 *
 * @param env JNIEnv pointer for the current thread
 * @param reference what we want to remove
 * @return the referenced object
 */
jobject getStrongReference(JNIEnv* env, uint64_t reference);

/**
 * Creates a weak reference
 *
 * @param env JNIEnv pointer for the current thread
 * @param object what we want to create reference for
 * @return the reference
 */
uint64_t addWeakReference(JNIEnv* env, jobject object);

/**
 * Removes a weak reference
 *
 * @param env JNIEnv pointer for the current thread
 * @param reference what we want to remove
 * @return whether an element was removed
 */
bool removeWeakReference(JNIEnv* env, uint64_t reference);

/**
 * Gets a weak reference
 *
 * @param env JNIEnv pointer for the current thread
 * @param reference what we want to remove
 * @return the referenced object
 */
jobject getWeakReference(JNIEnv* env, uint64_t reference);

/**
 * Prints the current thread's Java stack trace
 */
void natj_printJavaStackTrace(JNIEnv* env);

#endif
