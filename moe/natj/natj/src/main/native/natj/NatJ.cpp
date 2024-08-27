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

#include "NatJ.h"

#include <vector>
#include <map>

jthrowable gNilExceptionInstance = NULL;

JavaVM* gJVM = NULL;

bool gJVMIsRunning = true;

jclass gObjectClass = NULL;
jclass gAnnotatedElementClass = NULL;
jclass gAnnotationClass = NULL;
jclass gNatJClass = NULL;
jclass gClassClass = NULL;
jclass gAsmTypeClass = NULL;
jclass gByValueClass = NULL;
#if !__NATJ_IS_64BIT__
jclass gNFloatClass = NULL;
jclass gNUIntClass = NULL;
jclass gNIntClass = NULL;
#endif
#if !__NATJ_LONG_TYPE_IS_64BIT__
jclass gNLongClass = NULL;
jclass gNULongClass = NULL;
#endif
#if !__NATJ_WCHART_TYPE_IS_32BIT__
jclass gWCharTClass = NULL;
#endif
jclass gBooleanClass = NULL;
jclass gByteClass = NULL;
jclass gCharClass = NULL;
jclass gShortClass = NULL;
jclass gIntClass = NULL;
jclass gLongClass = NULL;
jclass gFloatClass = NULL;
jclass gDoubleClass = NULL;
jclass gVoidClass = NULL;
jclass gBoxedBooleanClass = NULL;
jclass gBoxedByteClass = NULL;
jclass gBoxedCharClass = NULL;
jclass gBoxedShortClass = NULL;
jclass gBoxedIntClass = NULL;
jclass gBoxedLongClass = NULL;
jclass gBoxedFloatClass = NULL;
jclass gBoxedDoubleClass = NULL;
jclass gBoxedVoidClass = NULL;
jclass gBooleanArrayClass = NULL;
jclass gByteArrayClass = NULL;
jclass gCharArrayClass = NULL;
jclass gShortArrayClass = NULL;
jclass gIntArrayClass = NULL;
jclass gLongArrayClass = NULL;
jclass gFloatArrayClass = NULL;
jclass gDoubleArrayClass = NULL;
jclass gPointerClass = NULL;
jclass gNativeObjectClass = NULL;
jclass gLibraryClass = NULL;
jclass gRuntimeClass = NULL;
jclass gMethodClass = NULL;
jclass gMappedClass = NULL;
jclass gMappedReturnClass = NULL;
jclass gOwnedClass = NULL;
jclass gNativeExceptionClass = NULL;
jclass gThrowableClass = NULL;
jclass gReferenceInfoClass = NULL;
jclass gCallableClass = NULL;
jclass gPtrClass = NULL;
jclass gParameterizedTypeClass = NULL;
jclass gWildcardTypeClass = NULL;
jclass gVariadicClass = NULL;
jclass gVariadicArgClass = NULL;
jclass gMapVariadicArgClass = NULL;
jclass gBoxVariadicArgClass = NULL;
jclass gUnboxVariadicArgClass = NULL;
jclass gNUIntVariadicArgClass = NULL;
jclass gNIntVariadicArgClass = NULL;
jclass gNFloatVariadicArgClass = NULL;
jclass gNULongVariadicArgClass = NULL;
jclass gNLongVariadicArgClass = NULL;
jclass gWCharTVariadicArgClass = NULL;
jclass gByValueVariadicArgClass = NULL;
jclass gNativeRuntimeClass = NULL;
#ifdef __APPLE__
jclass gObjCObjectPtrImplClass = NULL;
#endif

jmethodID gIsAnnotationPresentMethod = NULL;
jmethodID gAnnotationTypeMethod = NULL;
jmethodID gGetAnnotationMethod = NULL;
jmethodID gGetAnnotationsMethod = NULL;
jmethodID gGetDeclaredMethodsMethod = NULL;
jmethodID gGetMethodsMethod = NULL;
jmethodID gGetDeclaringClassMethod = NULL;
jmethodID gIsSyntheticMethodMethod = NULL;
jmethodID gGetMethodDescriptorStaticMethod = NULL;
jmethodID gGetClassInterfacesMethod = NULL;
jmethodID gGetClassNameMethod = NULL;
jmethodID gGetClassSimpleNameMethod = NULL;
jmethodID gIsAnonymousClassMethod = NULL;
jmethodID gGetNativeObjectPeerMethod = NULL;
jmethodID gGetNativeObjectPeerPointerMethod = NULL;
jmethodID gGetPointerPeerMethod = NULL;
jmethodID gGetModifiersMethod = NULL;
jmethodID gIsDefaultMethodMethod = NULL;
jmethodID gGetReturnTypeMethod = NULL;
jmethodID gGetParameterTypesMethod = NULL;
jmethodID gGetMethodNameMethod = NULL;
jmethodID gLookUpLibraryStaticMethod = NULL;
jmethodID gGetMethodDeclaringClassMethod = NULL;
jmethodID gToNativeStaticMethod = NULL;
jmethodID gToJavaStaticMethod = NULL;
jmethodID gBuildJavaObjectInfoStaticMethod = NULL;
jmethodID gBuildNativeObjectInfoStaticMethod = NULL;
jmethodID gGetMappedMethod = NULL;
jmethodID gGetMappedReturnMethod = NULL;
jmethodID gGetParameterAnnotationsMethod = NULL;
jmethodID gGetParameterAnnotationsInheritedStaticMethod = NULL;
jmethodID gGetRuntimeStaticMethod = NULL;
jmethodID gGetNativeExceptionMethod = NULL;
jmethodID gGetMessageMethod = NULL;
jmethodID gGetOrCreateInstanceOfRuntimeClassStaticMethod = NULL;
jmethodID gAddStrongReferenceStaticMethod = NULL;
jmethodID gRemoveStrongReferenceStaticMethod = NULL;
jmethodID gGetStrongReferenceStaticMethod = NULL;
jmethodID gAddWeakReferenceStaticMethod = NULL;
jmethodID gRemoveWeakReferenceStaticMethod = NULL;
jmethodID gGetWeakReferenceStaticMethod = NULL;
jmethodID gBooleanValueMethod = NULL;
jmethodID gByteValueMethod = NULL;
jmethodID gCharValueMethod = NULL;
jmethodID gShortValueMethod = NULL;
jmethodID gIntValueMethod = NULL;
jmethodID gLongValueMethod = NULL;
jmethodID gFloatValueMethod = NULL;
jmethodID gDoubleValueMethod = NULL;
jmethodID gBoxedLongConstructorMethod = NULL;
jmethodID gGetGenericParameterTypesMethod = NULL;
jmethodID gGetActualTypeArgumentsMethod = NULL;
jmethodID gGetUpperBoundsMethodMethod = NULL;
jmethodID gGetVariadicArgInstanceMethod = NULL;
jmethodID gGetMapVariadicArgMapperMethod = NULL;
jmethodID gGetVariadicUnboxPolicyMethod = NULL;
jmethodID gGetNFloatVariadicArgNFloatMethod = NULL;
jmethodID gGetNUIntVariadicArgNUIntMethod = NULL;
jmethodID gGetNIntVariadicArgNIntMethod = NULL;
jmethodID gGetWCharTVariadicArgWCharTMethod = NULL;
jmethodID gGetNULongVariadicArgNULongMethod = NULL;
jmethodID gGetNLongVariadicArgNLongMethod = NULL;
jmethodID gGetDefaultUnboxPolicyMethod = NULL;
#ifdef __APPLE__
jmethodID gRefreshRetainListMethod = NULL;
#endif

jbyte gRuntimeVariadicPolicyValue = -1;
jbyte gBoxVariadicPolicyValue = -1;
jbyte gUnboxVariadicPolicyValue = -1;

#if !__NATJ_IS_64BIT__
ffi_type ffi_type_nfloat = {alignof(float), sizeof(float), FFI_TYPE_FLOAT,
                            NULL};
ffi_type ffi_type_nint = {alignof(int32_t), sizeof(int32_t), FFI_TYPE_SINT32,
                          NULL};
ffi_type ffi_type_nuint = {alignof(uint32_t), sizeof(uint32_t), FFI_TYPE_UINT32,
                           NULL};
#endif
#if !__NATJ_LONG_TYPE_IS_64BIT__
ffi_type ffi_type_nlong = {alignof(int32_t), sizeof(int32_t), FFI_TYPE_SINT32,
    NULL};
ffi_type ffi_type_nulong = {alignof(uint32_t), sizeof(uint32_t), FFI_TYPE_UINT32,
    NULL};
#endif
#if !__NATJ_WCHART_TYPE_IS_32BIT__
ffi_type ffi_type_wchart = {alignof(wchar_t), sizeof(wchar_t), FFI_TYPE_UINT16,
    NULL};
#endif

/*
 * Defined in ObjCRuntime
 */
extern bool handleObjCStartup(JNIEnv*, jclass);

/*
 * Defined in CRuntime
 */
extern bool handleCStartup(JNIEnv*, jclass);

struct ReferencedMutex {
  std::mutex* mutex;
  int refs;
};

typedef std::map<void*, ReferencedMutex> ReferencedMutexContainer;
typedef ReferencedMutexContainer::iterator MutexIterator;

struct MutexInstanceImpl {
  MutexIterator it;
};

std::mutex* MutexInstance::getMutex() {
  return ((MutexInstanceImpl*)this)->it->second.mutex;
}

ReferencedMutexContainer& gMutexReferences = *new ReferencedMutexContainer();

std::mutex& gMutex = *new std::mutex();

void JNICALL Java_org_moe_natj_general_NatJ_initialize(JNIEnv* env, jclass clazz) {
  env->GetJavaVM(&gJVM);

  env->PushLocalFrame(50);

  gObjectClass = (jclass)env->NewGlobalRef(env->FindClass("java/lang/Object"));
  gNatJClass = (jclass)env->NewGlobalRef(
      env->FindClass("org/moe/natj/general/NatJ"));
  gClassClass = (jclass)env->NewGlobalRef(env->FindClass("java/lang/Class"));
  gAsmTypeClass = (jclass)env->NewGlobalRef(
      env->FindClass("org/moe/natj/org/objectweb/asm/Type"));
  gByValueClass = (jclass)env->NewGlobalRef(
      env->FindClass("org/moe/natj/general/ann/ByValue"));
#if !__NATJ_IS_64BIT__
  gNFloatClass = (jclass)env->NewGlobalRef(
      env->FindClass("org/moe/natj/general/ann/NFloat"));
  gNUIntClass = (jclass)env->NewGlobalRef(
      env->FindClass("org/moe/natj/general/ann/NUInt"));
  gNIntClass = (jclass)env->NewGlobalRef(
      env->FindClass("org/moe/natj/general/ann/NInt"));
#endif
#if !__NATJ_LONG_TYPE_IS_64BIT__
  gNLongClass = (jclass)env->NewGlobalRef(
    env->FindClass("org/moe/natj/general/ann/NLong"));
  gNULongClass = (jclass)env->NewGlobalRef(
    env->FindClass("org/moe/natj/general/ann/NULong"));
#endif
#if !__NATJ_WCHART_TYPE_IS_32BIT__
  gWCharTClass = (jclass)env->NewGlobalRef(
    env->FindClass("org/moe/natj/general/ann/WCharT"));
#endif
  gLibraryClass = (jclass)env->NewGlobalRef(
      env->FindClass("org/moe/natj/general/ann/Library"));
  gRuntimeClass = (jclass)env->NewGlobalRef(
      env->FindClass("org/moe/natj/general/ann/Runtime"));
  gPointerClass = (jclass)env->NewGlobalRef(
      env->FindClass("org/moe/natj/general/Pointer"));
  gMethodClass =
      (jclass)env->NewGlobalRef(env->FindClass("java/lang/reflect/Method"));
  gAnnotatedElementClass = (jclass)env->NewGlobalRef(
      env->FindClass("java/lang/reflect/AnnotatedElement"));
  gAnnotationClass = (jclass)env->NewGlobalRef(
      env->FindClass("java/lang/annotation/Annotation"));
  gNativeObjectClass = (jclass)env->NewGlobalRef(
      env->FindClass("org/moe/natj/general/NativeObject"));
  gMappedClass = (jclass)env->NewGlobalRef(
      env->FindClass("org/moe/natj/general/ann/Mapped"));
  gMappedReturnClass = (jclass)env->NewGlobalRef(
      env->FindClass("org/moe/natj/general/ann/MappedReturn"));
  gOwnedClass = (jclass)env->NewGlobalRef(
      env->FindClass("org/moe/natj/general/ann/Owned"));
  gNativeExceptionClass = (jclass)env->NewGlobalRef(
      env->FindClass("org/moe/natj/general/NativeException"));
  gThrowableClass =
      (jclass)env->NewGlobalRef(env->FindClass("java/lang/Throwable"));
  gReferenceInfoClass = (jclass)env->NewGlobalRef(
      env->FindClass("org/moe/natj/general/ann/ReferenceInfo"));
  gCallableClass = (jclass)env->NewGlobalRef(
      env->FindClass("org/moe/natj/general/ann/Callable"));
  gPtrClass = (jclass)env->NewGlobalRef(
      env->FindClass("org/moe/natj/general/ptr/Ptr"));
  gParameterizedTypeClass = (jclass)env->NewGlobalRef(
      env->FindClass("java/lang/reflect/ParameterizedType"));
  gWildcardTypeClass = (jclass)env->NewGlobalRef(
      env->FindClass("java/lang/reflect/WildcardType"));
  gVariadicClass = (jclass)env->NewGlobalRef(
      env->FindClass("org/moe/natj/c/ann/Variadic"));
  gVariadicArgClass = (jclass)env->NewGlobalRef(
      env->FindClass("org/moe/natj/general/VariadicArg"));
  gMapVariadicArgClass = (jclass)env->NewGlobalRef(
      env->FindClass("org/moe/natj/general/VariadicArg$MapVariadicArg"));
  gBoxVariadicArgClass = (jclass)env->NewGlobalRef(
      env->FindClass("org/moe/natj/general/VariadicArg$BoxVariadicArg"));
  gUnboxVariadicArgClass = (jclass)env->NewGlobalRef(
      env->FindClass("org/moe/natj/general/VariadicArg$UnboxVariadicArg"));
  gNUIntVariadicArgClass = (jclass)env->NewGlobalRef(
      env->FindClass("org/moe/natj/general/VariadicArg$NUIntVariadicArg"));
  gNIntVariadicArgClass = (jclass)env->NewGlobalRef(
      env->FindClass("org/moe/natj/general/VariadicArg$NIntVariadicArg"));
  gNFloatVariadicArgClass = (jclass)env->NewGlobalRef(
      env->FindClass("org/moe/natj/general/VariadicArg$NFloatVariadicArg"));
  gNULongVariadicArgClass = (jclass)env->NewGlobalRef(
      env->FindClass("org/moe/natj/general/VariadicArg$NULongVariadicArg"));
  gNLongVariadicArgClass = (jclass)env->NewGlobalRef(
      env->FindClass("org/moe/natj/general/VariadicArg$NLongVariadicArg"));
  gWCharTVariadicArgClass = (jclass)env->NewGlobalRef(
      env->FindClass("org/moe/natj/general/VariadicArg$WCharTVariadicArg"));
  gByValueVariadicArgClass = (jclass)env->NewGlobalRef(env->FindClass(
      "org/moe/natj/general/VariadicArg$ByValueVariadicArg"));
  gNativeRuntimeClass = (jclass)env->NewGlobalRef(
      env->FindClass("org/moe/natj/general/NativeRuntime"));

  env->PopLocalFrame(NULL);

  gIsAnnotationPresentMethod = env->GetMethodID(
      gAnnotatedElementClass, "isAnnotationPresent", "(Ljava/lang/Class;)Z");
  gAnnotationTypeMethod = env->GetMethodID(gAnnotationClass, "annotationType",
                                           "()Ljava/lang/Class;");
  gGetDeclaredMethodsMethod = env->GetMethodID(
      gClassClass, "getDeclaredMethods", "()[Ljava/lang/reflect/Method;");
  gGetMethodsMethod = env->GetMethodID(gClassClass, "getMethods",
                                       "()[Ljava/lang/reflect/Method;");
  gGetDeclaringClassMethod = env->GetMethodID(gMethodClass, "getDeclaringClass",
                                              "()Ljava/lang/Class;");
  gIsSyntheticMethodMethod =
      env->GetMethodID(gMethodClass, "isSynthetic", "()Z");
  gGetMethodDescriptorStaticMethod =
      env->GetStaticMethodID(gAsmTypeClass, "getMethodDescriptor",
                             "(Ljava/lang/reflect/Method;)Ljava/lang/String;");
  gGetClassInterfacesMethod =
      env->GetMethodID(gClassClass, "getInterfaces", "()[Ljava/lang/Class;");
  gGetClassNameMethod =
      env->GetMethodID(gClassClass, "getName", "()Ljava/lang/String;");
  gGetClassSimpleNameMethod =
      env->GetMethodID(gClassClass, "getSimpleName", "()Ljava/lang/String;");
  gIsAnonymousClassMethod =
      env->GetMethodID(gClassClass, "isAnonymousClass", "()Z");
  gGetNativeObjectPeerMethod = env->GetMethodID(
      gNativeObjectClass, "getPeer", "()Lorg/moe/natj/general/Pointer;");
  gGetNativeObjectPeerPointerMethod =
      env->GetMethodID(gNativeObjectClass, "getPeerPointer", "()J");
  gGetPointerPeerMethod = env->GetMethodID(gPointerClass, "getPeer", "()J");
  gGetModifiersMethod = env->GetMethodID(gMethodClass, "getModifiers", "()I");
  gIsDefaultMethodMethod = env->GetMethodID(gMethodClass, "isDefault", "()Z");
  if ((gIsDefaultMethodMethod == nullptr) != (env->ExceptionCheck())) {
    LOGF << "Invalid state after getting method 'boolean java.lang.reflect.Method.isDefault()'!";
  }
  if (env->ExceptionCheck()) {
    LOGD << "Method 'boolean java.lang.reflect.Method.isDefault()' is not accessible.";
    env->ExceptionClear();
  }
  gLookUpLibraryStaticMethod = env->GetStaticMethodID(
      gNatJClass, "lookUpLibrary", "(Lorg/moe/natj/general/ann/Library;Z)Ljava/lang/String;");
  gGetReturnTypeMethod =
      env->GetMethodID(gMethodClass, "getReturnType", "()Ljava/lang/Class;");
  gGetParameterTypesMethod = env->GetMethodID(gMethodClass, "getParameterTypes",
                                              "()[Ljava/lang/Class;");
  gGetMethodNameMethod =
      env->GetMethodID(gMethodClass, "getName", "()Ljava/lang/String;");
  gGetAnnotationMethod =
      env->GetMethodID(gAnnotatedElementClass, "getAnnotation",
                       "(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;");
  gGetAnnotationsMethod =
      env->GetMethodID(gAnnotatedElementClass, "getAnnotations",
                       "()[Ljava/lang/annotation/Annotation;");
  gGetMethodDeclaringClassMethod = env->GetMethodID(
      gMethodClass, "getDeclaringClass", "()Ljava/lang/Class;");
  gToNativeStaticMethod =
      env->GetStaticMethodID(gNatJClass, "toNative",
                             "(Ljava/lang/Object;Lorg/moe/natj/general/"
                             "NatJ$NativeObjectConstructionInfo;)J");
  gToJavaStaticMethod = env->GetStaticMethodID(
      gNatJClass, "toJava",
      "(JLorg/moe/natj/general/NatJ$JavaObjectConstructionInfo;)Ljava/lang/"
      "Object;");
  gBuildNativeObjectInfoStaticMethod = env->GetStaticMethodID(
      gNatJClass, "buildNativeObjectConstructionInfo",
      "(Lorg/moe/natj/general/NativeRuntime;"
      "Ljava/lang/Class;"
      "Ljava/lang/Class;"
      "Ljava/lang/annotation/Annotation;"  // Annotaion marked with @Callable
      "ZZZ)"
      "Lorg/moe/natj/general/NatJ$NativeObjectConstructionInfo;");
  gBuildJavaObjectInfoStaticMethod = env->GetStaticMethodID(
      gNatJClass, "buildJavaObjectConstructionInfo",
      "(Lorg/moe/natj/general/NativeRuntime;"
      "Ljava/lang/Class;"
      "Ljava/lang/Class;"
      "Ljava/lang/annotation/Annotation;"  // Annotaion marked with @Callable
      "Ljava/lang/Object;"
      "ZZZ)"
      "Lorg/moe/natj/general/NatJ$JavaObjectConstructionInfo;");
  gGetMappedMethod =
      env->GetMethodID(gMappedClass, "value", "()Ljava/lang/Class;");
  gGetMappedReturnMethod =
      env->GetMethodID(gMappedReturnClass, "value", "()Ljava/lang/Class;");
  gGetParameterAnnotationsMethod =
      env->GetMethodID(gMethodClass, "getParameterAnnotations",
                       "()[[Ljava/lang/annotation/Annotation;");
  gGetParameterAnnotationsInheritedStaticMethod =
      env->GetStaticMethodID(gNatJClass, "getParameterAnnotationsInherited",
                       "(Ljava/lang/reflect/Method;)[[Ljava/lang/annotation/Annotation;");
  gGetRuntimeStaticMethod = env->GetStaticMethodID(
      gNatJClass, "getRuntime",
      "(Ljava/lang/Class;Z)Lorg/moe/natj/general/NativeRuntime;");
  gGetNativeExceptionMethod =
      env->GetMethodID(gNativeExceptionClass, "getNativeException",
                       "()Lorg/moe/natj/general/NativeObject;");
  gGetMessageMethod =
      env->GetMethodID(gThrowableClass, "getMessage", "()Ljava/lang/String;");
  gGetOrCreateInstanceOfRuntimeClassStaticMethod = env->GetStaticMethodID(
      gNatJClass, "getOrCreateInstanceOfRuntimeClass",
      "(Ljava/lang/Class;)Lorg/moe/natj/general/NativeRuntime;");
  gAddStrongReferenceStaticMethod = env->GetStaticMethodID(
      gNatJClass, "addStrongReference", "(Ljava/lang/Object;)J");
  gRemoveStrongReferenceStaticMethod =
      env->GetStaticMethodID(gNatJClass, "removeStrongReference", "(J)Z");
  gGetStrongReferenceStaticMethod = env->GetStaticMethodID(
      gNatJClass, "getStrongReference", "(J)Ljava/lang/Object;");
  gAddWeakReferenceStaticMethod = env->GetStaticMethodID(
      gNatJClass, "addWeakReference", "(Ljava/lang/Object;)J");
  gRemoveWeakReferenceStaticMethod =
      env->GetStaticMethodID(gNatJClass, "removeWeakReference", "(J)Z");
  gGetWeakReferenceStaticMethod = env->GetStaticMethodID(
      gNatJClass, "getWeakReference", "(J)Ljava/lang/Object;");
  gGetGenericParameterTypesMethod = env->GetMethodID(
      gMethodClass, "getGenericParameterTypes", "()[Ljava/lang/reflect/Type;");
  gGetActualTypeArgumentsMethod =
      env->GetMethodID(gParameterizedTypeClass, "getActualTypeArguments",
                       "()[Ljava/lang/reflect/Type;");
  gGetUpperBoundsMethodMethod = env->GetMethodID(
      gWildcardTypeClass, "getUpperBounds", "()[Ljava/lang/reflect/Type;");
  gGetVariadicArgInstanceMethod = env->GetMethodID(
      gVariadicArgClass, "getInstance", "()Ljava/lang/Object;");
  gGetMapVariadicArgMapperMethod = env->GetMethodID(
      gMapVariadicArgClass, "getMapper", "()Ljava/lang/Class;");
  gGetVariadicUnboxPolicyMethod =
      env->GetMethodID(gVariadicClass, "unboxPolicy", "()B");
  gGetNFloatVariadicArgNFloatMethod =
      env->GetMethodID(gNFloatVariadicArgClass, "getNFloat", "()D");
  gGetNUIntVariadicArgNUIntMethod =
      env->GetMethodID(gNUIntVariadicArgClass, "getNUInt", "()J");
  gGetNIntVariadicArgNIntMethod =
      env->GetMethodID(gNIntVariadicArgClass, "getNInt", "()J");
  gGetWCharTVariadicArgWCharTMethod =
      env->GetMethodID(gWCharTVariadicArgClass, "getWCharT", "()I");
  gGetNULongVariadicArgNULongMethod =
      env->GetMethodID(gNULongVariadicArgClass, "getNULong", "()J");
  gGetNLongVariadicArgNLongMethod =
      env->GetMethodID(gNLongVariadicArgClass, "getNLong", "()J");
  gGetDefaultUnboxPolicyMethod =
      env->GetMethodID(gNativeRuntimeClass, "getDefaultUnboxPolicy", "()B");

  env->PushLocalFrame(50);

  gBooleanArrayClass = (jclass)env->NewGlobalRef(env->FindClass("[Z"));
  gByteArrayClass = (jclass)env->NewGlobalRef(env->FindClass("[B"));
  gCharArrayClass = (jclass)env->NewGlobalRef(env->FindClass("[C"));
  gShortArrayClass = (jclass)env->NewGlobalRef(env->FindClass("[S"));
  gIntArrayClass = (jclass)env->NewGlobalRef(env->FindClass("[I"));
  gLongArrayClass = (jclass)env->NewGlobalRef(env->FindClass("[J"));
  gFloatArrayClass = (jclass)env->NewGlobalRef(env->FindClass("[F"));
  gDoubleArrayClass = (jclass)env->NewGlobalRef(env->FindClass("[D"));

  gBoxedBooleanClass =
      (jclass)env->NewGlobalRef(env->FindClass("java/lang/Boolean"));
  gBoxedVoidClass = (jclass)env->NewGlobalRef(env->FindClass("java/lang/Void"));
  gBoxedCharClass =
      (jclass)env->NewGlobalRef(env->FindClass("java/lang/Character"));
  gBoxedByteClass = (jclass)env->NewGlobalRef(env->FindClass("java/lang/Byte"));
  gBoxedShortClass =
      (jclass)env->NewGlobalRef(env->FindClass("java/lang/Short"));
  gBoxedIntClass =
      (jclass)env->NewGlobalRef(env->FindClass("java/lang/Integer"));
  gBoxedLongClass = (jclass)env->NewGlobalRef(env->FindClass("java/lang/Long"));
  gBoxedFloatClass =
      (jclass)env->NewGlobalRef(env->FindClass("java/lang/Float"));
  gBoxedDoubleClass =
      (jclass)env->NewGlobalRef(env->FindClass("java/lang/Double"));

  gBoxedLongConstructorMethod = env->GetMethodID(gBoxedLongClass, "<init>", "(J)V");

  gBooleanValueMethod =
      env->GetMethodID(gBoxedBooleanClass, "booleanValue", "()Z");
  gByteValueMethod = env->GetMethodID(gBoxedByteClass, "byteValue", "()B");
  gCharValueMethod = env->GetMethodID(gBoxedCharClass, "charValue", "()C");
  gShortValueMethod = env->GetMethodID(gBoxedShortClass, "shortValue", "()S");
  gIntValueMethod = env->GetMethodID(gBoxedIntClass, "intValue", "()I");
  gLongValueMethod = env->GetMethodID(gBoxedLongClass, "longValue", "()J");
  gFloatValueMethod = env->GetMethodID(gBoxedFloatClass, "floatValue", "()F");
  gDoubleValueMethod =
      env->GetMethodID(gBoxedDoubleClass, "doubleValue", "()D");

  jfieldID booleanTypeField =
      env->GetStaticFieldID(gBoxedBooleanClass, "TYPE", "Ljava/lang/Class;");
  jfieldID voidTypeField =
      env->GetStaticFieldID(gBoxedVoidClass, "TYPE", "Ljava/lang/Class;");
  jfieldID characterTypeField =
      env->GetStaticFieldID(gBoxedCharClass, "TYPE", "Ljava/lang/Class;");
  jfieldID byteTypeField =
      env->GetStaticFieldID(gBoxedByteClass, "TYPE", "Ljava/lang/Class;");
  jfieldID shortTypeField =
      env->GetStaticFieldID(gBoxedShortClass, "TYPE", "Ljava/lang/Class;");
  jfieldID intTypeField =
      env->GetStaticFieldID(gBoxedIntClass, "TYPE", "Ljava/lang/Class;");
  jfieldID longTypeField =
      env->GetStaticFieldID(gBoxedLongClass, "TYPE", "Ljava/lang/Class;");
  jfieldID floatTypeField =
      env->GetStaticFieldID(gBoxedFloatClass, "TYPE", "Ljava/lang/Class;");
  jfieldID doubleTypeField =
      env->GetStaticFieldID(gBoxedDoubleClass, "TYPE", "Ljava/lang/Class;");

  gBooleanClass = (jclass)env->NewGlobalRef(
      env->GetStaticObjectField(gBoxedBooleanClass, booleanTypeField));
  gVoidClass = (jclass)env->NewGlobalRef(
      env->GetStaticObjectField(gBoxedVoidClass, voidTypeField));
  gCharClass = (jclass)env->NewGlobalRef(
      env->GetStaticObjectField(gBoxedCharClass, characterTypeField));
  gByteClass = (jclass)env->NewGlobalRef(
      env->GetStaticObjectField(gBoxedByteClass, byteTypeField));
  gShortClass = (jclass)env->NewGlobalRef(
      env->GetStaticObjectField(gBoxedShortClass, shortTypeField));
  gIntClass = (jclass)env->NewGlobalRef(
      env->GetStaticObjectField(gBoxedIntClass, intTypeField));
  gLongClass = (jclass)env->NewGlobalRef(
      env->GetStaticObjectField(gBoxedLongClass, longTypeField));
  gFloatClass = (jclass)env->NewGlobalRef(
      env->GetStaticObjectField(gBoxedFloatClass, floatTypeField));
  gDoubleClass = (jclass)env->NewGlobalRef(
      env->GetStaticObjectField(gBoxedDoubleClass, doubleTypeField));

  jclass nilExceptionClass =
      env->FindClass("org/moe/natj/general/NilException");
  jmethodID nilExceptionConstructorMethod =
      env->GetMethodID(nilExceptionClass, "<init>", "()V");
  gNilExceptionInstance = (jthrowable)env->NewGlobalRef(
      env->NewObject(nilExceptionClass, nilExceptionConstructorMethod));

  gRuntimeVariadicPolicyValue = env->GetStaticByteField(
      gVariadicClass, env->GetStaticFieldID(gVariadicClass, "Runtime", "B"));
  assert(gRuntimeVariadicPolicyValue != -1);

  gBoxVariadicPolicyValue = env->GetStaticByteField(
      gVariadicClass, env->GetStaticFieldID(gVariadicClass, "Box", "B"));
  assert(gBoxVariadicPolicyValue != -1);

  gUnboxVariadicPolicyValue = env->GetStaticByteField(
      gVariadicClass, env->GetStaticFieldID(gVariadicClass, "Unbox", "B"));
  assert(gUnboxVariadicPolicyValue != -1);

#ifdef __APPLE__
  gObjCObjectPtrImplClass = (jclass)env->NewGlobalRef(
      env->FindClass("org/moe/natj/general/ptr/impl/ObjCObjectPtrImpl"));
#endif

  env->PopLocalFrame(NULL);

#ifdef __APPLE__
  gRefreshRetainListMethod =
      env->GetMethodID(gObjCObjectPtrImplClass, "refreshRetainList", "()V");
#endif
}

void JNICALL Java_org_moe_natj_general_NatJ_handleShutdown(JNIEnv* env,
                                                       jclass clazz) {
  handleShutdown(env);
}

jstring JNICALL Java_org_moe_natj_general_NatJ_getPlatformName(JNIEnv* env,
                                                           jclass clazz) {
  return env->NewStringUTF(NATJ_PLATFORM);
}

jstring JNICALL Java_org_moe_natj_general_NatJ_getSimulatorFrameworkPath(JNIEnv* env,
                                                                         jclass clazz) {

#ifdef __APPLE__
#if TARGET_OS_SIMULATOR
  Dl_info di;
  int ret = dladdr((const void *)CFArrayContainsValue, &di);
  if (!ret) {
      LOGF << "Failed to get framework path!";
  }
  return env->NewStringUTF(di.dli_fname);
#else
  // Only for simulator builds
  return NULL;
#endif
#else
  // Only for Darwin systems
  return NULL;
#endif
}

jboolean JNICALL Java_org_moe_natj_general_NatJ_loadFramework(JNIEnv* env,
                                                                 jclass clazz,
                                                                 jstring path) {
#ifdef __APPLE__
  const char* cPath = env->GetStringUTFChars(path, NULL);
  void* hdl = dlopen(cPath, RTLD_LAZY);
  env->ReleaseStringUTFChars(path, cPath);

  return hdl != NULL;
#else
  // This loader should be used only for loading
  // frameworks and only for Darwin systems
  return false;
#endif
}

jboolean JNICALL Java_org_moe_natj_general_NatJ_loadGlobalLinux(JNIEnv* env,
                                                                 jclass clazz,
                                                                 jstring path) {
#ifdef __linux__
  const char* cPath = env->GetStringUTFChars(path, NULL);
  void* hdl = dlopen(cPath, RTLD_LAZY | RTLD_GLOBAL);
  env->ReleaseStringUTFChars(path, cPath);
  return hdl != NULL;
#else
  // This loader should be used only for linux
  return false;
#endif
}

void handleShutdown(JNIEnv* env) { gJVMIsRunning = false; }

void* getJNICallFunction(JNIEnv* env, ffi_type* type, bool isStatic) {
  if (isStatic) {
    switch (type->type) {
      case FFI_TYPE_VOID:
        return (void*)env->functions->CallStaticVoidMethod;
      case FFI_TYPE_INT:
        return (void*)env->functions->CallStaticIntMethod;
      case FFI_TYPE_FLOAT:
        return (void*)env->functions->CallStaticFloatMethod;
      case FFI_TYPE_DOUBLE:
        return (void*)env->functions->CallStaticDoubleMethod;
      case FFI_TYPE_UINT8:
        return (void*)env->functions->CallStaticBooleanMethod;
      case FFI_TYPE_SINT8:
        return (void*)env->functions->CallStaticByteMethod;
      case FFI_TYPE_UINT16:
        return (void*)env->functions->CallStaticCharMethod;
      case FFI_TYPE_SINT16:
        return (void*)env->functions->CallStaticShortMethod;
      case FFI_TYPE_SINT32:
      case FFI_TYPE_UINT32:
        return (void*)env->functions->CallStaticIntMethod;  // TODO: is it okay?
      case FFI_TYPE_UINT64:
      case FFI_TYPE_SINT64:
        return (void*)env->functions->CallStaticLongMethod;
      case FFI_TYPE_STRUCT:
      case FFI_TYPE_POINTER:
        return (void*)env->functions->CallStaticObjectMethod;
      default:
        return NULL;
    }
  } else {
    switch (type->type) {
      case FFI_TYPE_VOID:
        return (void*)env->functions->CallVoidMethod;
      case FFI_TYPE_INT:
        return (void*)env->functions->CallIntMethod;
      case FFI_TYPE_FLOAT:
        return (void*)env->functions->CallFloatMethod;
      case FFI_TYPE_DOUBLE:
        return (void*)env->functions->CallDoubleMethod;
      case FFI_TYPE_UINT8:
        return (void*)env->functions->CallBooleanMethod;
      case FFI_TYPE_SINT8:
        return (void*)env->functions->CallByteMethod;
      case FFI_TYPE_UINT16:
        return (void*)env->functions->CallCharMethod;
      case FFI_TYPE_SINT16:
        return (void*)env->functions->CallShortMethod;
      case FFI_TYPE_SINT32:
      case FFI_TYPE_UINT32:
        return (void*)env->functions->CallIntMethod;  // TODO: is it okay?
      case FFI_TYPE_UINT64:
      case FFI_TYPE_SINT64:
        return (void*)env->functions->CallLongMethod;
      case FFI_TYPE_STRUCT:
      case FFI_TYPE_POINTER:
        return (void*)env->functions->CallObjectMethod;
      default:
        return NULL;
    }
  }
}

ffi_type* getFFIType(JNIEnv* env, jclass type, jboolean byValue,
#if !__NATJ_HAS_NATIVE_SIZED_TYPES__
                     jboolean promoted) {
#else
                     jboolean promoted, NativeSizedType native) {
#endif
  if (byValue) {
    return getCachedFFIType(env, type);
  } else {
    if (env->IsSameObject(gVoidClass, type))
      return &ffi_type_void;
    else if (env->IsSameObject(gBooleanClass, type))
      return promoted ? &ffi_type_uint32 : &ffi_type_uint8;
    else if (env->IsSameObject(gByteClass, type))
      return promoted ? &ffi_type_sint32 : &ffi_type_sint8;
    else if (env->IsSameObject(gCharClass, type))
      return promoted ? &ffi_type_uint32 : &ffi_type_uint16;
    else if (env->IsSameObject(gShortClass, type))
      return promoted ? &ffi_type_sint32 : &ffi_type_sint16;
    else if (env->IsSameObject(gIntClass, type)) {
#if !__NATJ_WCHART_TYPE_IS_32BIT__
      if (native == kWCharT) {
        return &ffi_type_wchart;
      }
#endif
      return &ffi_type_sint32;
    }
    else if (env->IsSameObject(gLongClass, type)) {
#if !__NATJ_IS_64BIT__
      if (native == kNUInt) {
        return &ffi_type_nuint;
      } else if (native == kNInt) {
        return &ffi_type_nint;
      }
#endif
#if !__NATJ_LONG_TYPE_IS_64BIT__
      if (native == kNLong) {
        return &ffi_type_nlong;
      } else if (native == kNULong) {
        return &ffi_type_nulong;
      }
#endif
      return &ffi_type_sint64;
    } else if (env->IsSameObject(gFloatClass, type))
      return promoted ? &ffi_type_double : &ffi_type_float;
    else if (env->IsSameObject(gDoubleClass, type)) {
#if __NATJ_IS_64BIT__
      return &ffi_type_double;
#else
      if (native == kNFloat) {
        return &ffi_type_nfloat;
      } else {
        return &ffi_type_double;
      }
#endif
    }
    return &ffi_type_pointer;
  }
}

ffi_type* getCachedFFIType(JNIEnv* env, jclass type) {
  if (!env->IsAssignableFrom(type, gNativeObjectClass)) {
    jstring className =
        (jstring)env->CallObjectMethod(type, gGetClassNameMethod);
    const char* classCName = env->GetStringUTFChars(className, NULL);
    LOGF << "Could not get native type description for " << classCName
         << ", because this class is not a NativeObject descendant."
         << " Possible cause for this problem is incorrecly marking a"
         << " value of this type by a @ByValue annotation.";
  }
  // Note: this line will force the android's jni implementation to initialize
  // the class (if it wasn't already).
  jfieldID nativeTypeStaticField =
      env->GetStaticFieldID(type, "__natjCache", "J");
  if (!nativeTypeStaticField) {
    jstring className =
        (jstring)env->CallObjectMethod(type, gGetClassNameMethod);
    const char* classCName = env->GetStringUTFChars(className, NULL);
    LOGF << "Could not get native type description for " << classCName
         << ", because the __natjCache cache field definition is not present"
         << " in that class.";
  }
  jlong cachedType = env->GetStaticLongField(type, nativeTypeStaticField);
  // This assert should not fail even in case of invalid use of NatJ and
  // failure would indicate presence of some serious internal bug in NatJ,
  // so I keep it as a simple assert instead of a LOGF.
  if (!cachedType) {
    jstring className =
      (jstring)env->CallObjectMethod(type, gGetClassNameMethod);
    const char* classCName = env->GetStringUTFChars(className, NULL);
    LOGF << "Could not get native type description for " << classCName
    << "  the __natjCache cache field is present but Structure annotation is not"
    << " in that class.";
  }
  assert(cachedType);
  return reinterpret_cast<ffi_type*>(cachedType);
}

void setCachedFFIType(JNIEnv* env, jclass type, ffi_type* cType) {
  jfieldID nativeTypeStaticField =
      env->GetStaticFieldID(type, "__natjCache", "J");
  env->SetStaticLongField(type, nativeTypeStaticField,
                          reinterpret_cast<jlong>(cType));
}

void buildInfos(JNIEnv* env, jobject method, bool toJava, jobject** paramInfos,
                jobject* returnInfo, int8_t* variadic, size_t* ptrBuff,
                size_t* ptrCount) {
  // Get default runtime
  jobject runtime = NULL;
  {
    jobjectArray annotations =
        (jobjectArray)env->CallObjectMethod(method, gGetAnnotationsMethod);
    jsize annCount = env->GetArrayLength(annotations);
    for (jsize i = 0; i < annCount; i++) {
      jobject ann = env->GetObjectArrayElement(annotations, i);
      jclass cls = env->GetObjectClass(ann);
      env->DeleteLocalRef(ann);
      runtime = env->CallStaticObjectMethod(gNatJClass, gGetRuntimeStaticMethod,
                                            cls, false);
      env->DeleteLocalRef(cls);
      if (!env->IsSameObject(runtime, NULL)) {
        break;
      }
    }
    env->DeleteLocalRef(annotations);
    if (env->IsSameObject(runtime, NULL)) {
      jclass cls =
          (jclass)env->CallObjectMethod(method, gGetMethodDeclaringClassMethod);
      runtime = env->CallStaticObjectMethod(gNatJClass, gGetRuntimeStaticMethod,
                                            cls, true);
      env->DeleteLocalRef(cls);
    }
  }

  // Build info for return type
  {
    env->PushLocalFrame(20);
    jclass returnType =
        (jclass)env->CallObjectMethod(method, gGetReturnTypeMethod);
    if (env->IsAssignableFrom(returnType, gObjectClass)) {
      jobject mappedType = env->CallObjectMethod(method, gGetAnnotationMethod,
                                                 gMappedReturnClass);
      jobject callable = NULL;
      {
        jobjectArray annotations =
            (jobjectArray)env->CallObjectMethod(method, gGetAnnotationsMethod);
        jint num = env->GetArrayLength(annotations);
        for (jint i = 0; i < num; i++) {
          jobject ann = env->GetObjectArrayElement(annotations, i);
          jobject annCls = env->CallObjectMethod(ann, gAnnotationTypeMethod);
          if (env->CallBooleanMethod(annCls, gIsAnnotationPresentMethod,
                                     gCallableClass)) {
            callable = ann;
            env->DeleteLocalRef(annCls);
            break;
          }
          env->DeleteLocalRef(ann);
          env->DeleteLocalRef(annCls);
        }
      }
      jobject referenceInfo =
          !toJava
              ? env->CallObjectMethod(method, gGetAnnotationMethod,
                                      gReferenceInfoClass)
              : NULL;
      jboolean owned = !env->IsSameObject(
          env->CallObjectMethod(method, gGetAnnotationMethod, gOwnedClass),
          NULL);
      jboolean byValue = env->CallBooleanMethod(
          method, gIsAnnotationPresentMethod, gByValueClass);
      if (!env->IsSameObject(mappedType, NULL)) {
        mappedType = env->CallObjectMethod(mappedType, gGetMappedReturnMethod);
      }
      owned |= byValue;  //@ByValue implicates @Owned
      if (toJava) {
        *returnInfo = env->NewGlobalRef(env->CallStaticObjectMethod(
            gNatJClass, gBuildNativeObjectInfoStaticMethod, runtime, returnType,
            mappedType, callable, owned, byValue, false));
      } else {
        *returnInfo = env->NewGlobalRef(env->CallStaticObjectMethod(
            gNatJClass, gBuildJavaObjectInfoStaticMethod, runtime, returnType,
            mappedType, callable, referenceInfo, owned, byValue, false));
      }
    } else {
      *returnInfo = NULL;
    }
    env->PopLocalFrame(NULL);
  }

  bool isVariadic = variadic && *variadic != kNotVariadic;

  // Build infos for parameter types
  std::vector<jobject> infos;
  {
#ifdef __APPLE__
    size_t skipPtrCount;
    if (ptrCount) {
      if (hasObjCRuntimeBeenInitialized()) {
        skipPtrCount = *ptrCount;
        *ptrCount = 0;
      } else {
        *ptrCount = 0;
        ptrCount = NULL;
      }
    }
#endif
    jobjectArray parameterTypes =
        (jobjectArray)env->CallObjectMethod(method, gGetParameterTypesMethod);
    jobjectArray parameterAnns = (jobjectArray)env->CallStaticObjectMethod(
        gNatJClass, gGetParameterAnnotationsInheritedStaticMethod, method);
    jsize parameterCount = env->GetArrayLength(parameterTypes);
    if (isVariadic) {
      parameterCount--;
    }
    infos.reserve(parameterCount);
    for (jsize i = 0; i < parameterCount; i++) {
      env->PushLocalFrame(20);
      jclass parameterType =
          (jclass)env->GetObjectArrayElement(parameterTypes, i);
      if (env->IsAssignableFrom(parameterType, gObjectClass)) {
#ifdef __APPLE__
        if (ptrCount && skipPtrCount <= i &&
            env->IsSameObject(parameterType, gPtrClass)) {
          ptrBuff[(*ptrCount)++] = i;
        }
#endif
        jobjectArray paramAnns =
            (jobjectArray)env->GetObjectArrayElement(parameterAnns, i);
        jsize annCount = env->GetArrayLength(paramAnns);
        jobject mappedType = NULL;
        jobject callable = NULL;
        jboolean byValue = false;
        jboolean owned = false;
        jobject referenceInfo = NULL;
        for (jsize j = 0; j < annCount; j++) {
          jobject paramAnn = env->GetObjectArrayElement(paramAnns, j);
          if (env->IsInstanceOf(paramAnn, gMappedClass)) {
            mappedType = env->CallObjectMethod(paramAnn, gGetMappedMethod);
          } else if (env->CallBooleanMethod(
                         env->CallObjectMethod(paramAnn, gAnnotationTypeMethod),
                         gIsAnnotationPresentMethod, gCallableClass)) {
            callable = paramAnn;
          } else if (!owned && env->IsInstanceOf(paramAnn, gOwnedClass)) {
            owned = true;
          } else if (env->IsInstanceOf(paramAnn, gByValueClass)) {
            owned = true;  //@ByValue implicates @Owned
            byValue = true;
          } else if (toJava && env->IsInstanceOf(paramAnn, gReferenceInfoClass)) {
            referenceInfo = paramAnn;
          }
          if (mappedType && callable && owned && byValue && (!toJava || referenceInfo)) {
            break;
          }
        }
        if (toJava) {
          infos.push_back(env->NewGlobalRef(env->CallStaticObjectMethod(
              gNatJClass, gBuildJavaObjectInfoStaticMethod, runtime,
              parameterType, mappedType, callable, referenceInfo, owned, byValue,
              true)));
        } else {
          infos.push_back(env->NewGlobalRef(env->CallStaticObjectMethod(
              gNatJClass, gBuildNativeObjectInfoStaticMethod, runtime,
              parameterType, mappedType, callable, owned, byValue, true)));
        }
      }
      env->PopLocalFrame(NULL);
    }
    if (isVariadic) {
      jclass parameterType =
          (jclass)env->GetObjectArrayElement(parameterTypes, parameterCount);
      if (env->IsSameObject(parameterType, gBooleanArrayClass)) {
        *variadic = kBooleanVariadic;
      } else if (env->IsSameObject(parameterType, gByteArrayClass)) {
        *variadic = kByteVariadic;
      } else if (env->IsSameObject(parameterType, gCharArrayClass)) {
        *variadic = kCharVariadic;
      } else if (env->IsSameObject(parameterType, gShortArrayClass)) {
        *variadic = kShortVariadic;
      } else if (env->IsSameObject(parameterType, gIntArrayClass)) {
#if __NATJ_WCHART_TYPE_IS_32BIT__
        *variadic = kIntVariadic;
#else
        bool isSet = false;
        jobjectArray paramAnns =
        (jobjectArray)env->GetObjectArrayElement(parameterAnns,
                                                 parameterCount);
        jsize annCount = env->GetArrayLength(paramAnns);
        for (jsize j = 0; j < annCount; j++) {
          jobject paramAnn = env->GetObjectArrayElement(paramAnns, j);
          if (env->IsInstanceOf(paramAnn, gWCharTClass)) {
            *variadic = kWCharTVariadic;
            isSet = true;
            break;
          }
          env->DeleteLocalRef(paramAnn);
        }
        if (!isSet) {
          *variadic = kIntVariadic;
        }
        env->DeleteLocalRef(paramAnns);
#endif
      } else if (env->IsSameObject(parameterType, gLongArrayClass)) {
#if __NATJ_IS_64BIT__ && __NATJ_LONG_TYPE_IS_64BIT__
        *variadic = kLongVariadic;
#else
        bool isSet = false;
        jobjectArray paramAnns =
            (jobjectArray)env->GetObjectArrayElement(parameterAnns,
                                                     parameterCount);
        jsize annCount = env->GetArrayLength(paramAnns);
        for (jsize j = 0; j < annCount; j++) {
          jobject paramAnn = env->GetObjectArrayElement(paramAnns, j);
#if !__NATJ_IS_64BIT__
          if (env->IsInstanceOf(paramAnn, gNUIntClass)) {
            *variadic = kNUIntVariadic;
            isSet = true;
            break;
          } else if (env->IsInstanceOf(paramAnn, gNIntClass)) {
            *variadic = kNIntVariadic;
            isSet = true;
            break;
          }
#endif
#if !__NATJ_LONG_TYPE_IS_64BIT__
          if (env->IsInstanceOf(paramAnn, gNULongClass)) {
            *variadic = kNULongVariadic;
            isSet = true;
            break;
          } else if (env->IsInstanceOf(paramAnn, gNLongClass)) {
            *variadic = kNLongVariadic;
            isSet = true;
            break;
          }
#endif
          env->DeleteLocalRef(paramAnn);
        }
        if (!isSet) {
          *variadic = kLongVariadic;
        }
        env->DeleteLocalRef(paramAnns);
#endif
      } else if (env->IsSameObject(parameterType, gFloatArrayClass)) {
        *variadic = kFloatVariadic;
      } else if (env->IsSameObject(parameterType, gDoubleArrayClass)) {
#if __NATJ_IS_64BIT__
        *variadic = kDoubleVariadic;
#else
        bool isSet = false;
        jobjectArray paramAnns =
        (jobjectArray)env->GetObjectArrayElement(parameterAnns,
                                                 parameterCount);
        jsize annCount = env->GetArrayLength(paramAnns);
        for (jsize j = 0; j < annCount; j++) {
          jobject paramAnn = env->GetObjectArrayElement(paramAnns, j);
          if (env->IsInstanceOf(paramAnn, gNFloatClass)) {
            *variadic = kNFloatVariadic;
            isSet = true;
            break;
          }
          env->DeleteLocalRef(paramAnn);
        }
        if (!isSet) {
          *variadic = kDoubleVariadic;
        }
        env->DeleteLocalRef(paramAnns);
#endif
      }
      env->DeleteLocalRef(parameterType);
    }
    env->DeleteLocalRef(parameterAnns);
    env->DeleteLocalRef(parameterTypes);
#ifdef __APPLE__
    if (ptrCount && *ptrCount) {
      size_t count = 0;
      jobjectArray typesArray = (jobjectArray)env->CallObjectMethod(
          method, gGetGenericParameterTypesMethod);
      for (size_t i = 0; i < *ptrCount; i++) {
        jobject type =
            env->GetObjectArrayElement(typesArray, (jsize)ptrBuff[i]);
        jobjectArray typeParametersArray = (jobjectArray)env->CallObjectMethod(
            type, gGetActualTypeArgumentsMethod);
        env->DeleteLocalRef(type);

        jobject typeParameter =
            env->GetObjectArrayElement(typeParametersArray, 0);
        env->DeleteLocalRef(typeParametersArray);
        if (env->IsInstanceOf(typeParameter, gClassClass)) {
          if (env->IsAssignableFrom((jclass)typeParameter, gObjCObjectClass)) {
            ptrBuff[count++] = ptrBuff[i];
          }
        } else if (env->IsInstanceOf(typeParameter, gWildcardTypeClass)) {
          jobjectArray upperBounds = (jobjectArray)env->CallObjectMethod(
              typeParameter, gGetUpperBoundsMethodMethod);
          jobject upperBound = env->GetObjectArrayElement(upperBounds, 0);
          env->DeleteLocalRef(upperBounds);
          if (env->IsInstanceOf(upperBound, gClassClass) &&
              env->IsAssignableFrom((jclass)upperBound, gObjCObjectClass)) {
            ptrBuff[count++] = ptrBuff[i];
          } else {
            LOGF << "Incorrect wildcard type upper bound in the argument. Wanted a descendent of ObjCObject";
          }
          env->DeleteLocalRef(upperBound);
        }
        env->DeleteLocalRef(typeParameter);
      }
      env->DeleteLocalRef(typesArray);
      *ptrCount = count;
    }
#endif
  }

  if (!env->IsSameObject(runtime, NULL)) {
    env->DeleteLocalRef(runtime);
  }

  size_t size = infos.size();
  if (size) {
    jobject* params = new jobject[size + 1];
    memcpy(params, infos.data(), size * sizeof(void*));
    params[size] = NULL;
    *paramInfos = params;
  } else {
    *paramInfos = NULL;
  }
}

void destroyInfos(JNIEnv* env, jobject* paramInfos, jobject returnInfo) {
  if (returnInfo) {
    env->DeleteGlobalRef(returnInfo);
  }
  if (paramInfos) {
    for (jobject* it = paramInfos; *it; it++) {
      env->DeleteGlobalRef(*it);
    }
    delete paramInfos;
  }
}

#define TYPE_FOR(type, ffi)                              \
  template <>                                            \
  template <>                                            \
  ffi_type* ValueConverter<kToJava>::typeFor<type>() {   \
    return &ffi;                                         \
  }                                                      \
                                                         \
  template <>                                            \
  template <>                                            \
  ffi_type* ValueConverter<kToNative>::typeFor<type>() { \
    return &ffi;                                         \
  }

TYPE_FOR(void*, ffi_type_pointer);
TYPE_FOR(uint8_t, ffi_type_uint8);
TYPE_FOR(int8_t, ffi_type_sint8);
TYPE_FOR(uint16_t, ffi_type_uint16);
TYPE_FOR(int16_t, ffi_type_sint16);
TYPE_FOR(uint32_t, ffi_type_uint32);
TYPE_FOR(int32_t, ffi_type_sint32);
TYPE_FOR(uint64_t, ffi_type_uint64);
TYPE_FOR(int64_t, ffi_type_sint64);
TYPE_FOR(float, ffi_type_float);
TYPE_FOR(double, ffi_type_double);
#undef TYPE_FOR

template <>
ffi_type* ValueConverter<kToJava>::getNeededType(ffi_type* type, bool promote) {
#if !__NATJ_IS_64BIT__
  if (type == &ffi_type_nfloat) {
    return &ffi_type_double;
  } else if (type == &ffi_type_nuint) {
    return &ffi_type_uint64;
  } else if (type == &ffi_type_nint) {
    return &ffi_type_sint64;
  }
#endif
#if !__NATJ_LONG_TYPE_IS_64BIT__
  if (type == &ffi_type_nlong) {
    return &ffi_type_sint64;
  } else if (type == &ffi_type_nulong) {
    return &ffi_type_uint64;
  }
#endif
#if !__NATJ_WCHART_TYPE_IS_32BIT__
  if (type == &ffi_type_wchart) {
    return &ffi_type_uint32;
  }
#endif

  if (type->type == FFI_TYPE_POINTER) {
    return &ffi_type_pointer;
  } else if (type->type == FFI_TYPE_STRUCT) {
    return &ffi_type_pointer;
  } else if (promote) {
    switch (type->type) {
      case FFI_TYPE_FLOAT:
        return &ffi_type_double;
      case FFI_TYPE_UINT8:
      case FFI_TYPE_SINT8:
      case FFI_TYPE_UINT16:
      case FFI_TYPE_SINT16:
        return &ffi_type_sint32;
    }
  }

  return nullptr;
}

template <>
unsigned ValueConverter<kToJava>::convert(
    const ValueConverter<kToJava>::Descriptor& desc) {
  for (unsigned i = 0; i < desc.nvalues; i++) {
    ffi_type* type = getOldType();

#if !__NATJ_IS_64BIT__
    if (type == &ffi_type_nfloat) {
      putAndNext((double)getOld<float>());
      continue;
    } else if (type == &ffi_type_nuint) {
      putAndNext((uint64_t)getOld<uint32_t>());
      continue;
    } else if (type == &ffi_type_nint) {
      putAndNext((int64_t)getOld<int32_t>());
      continue;
    }
#endif
#if !__NATJ_LONG_TYPE_IS_64BIT__
    if (type == &ffi_type_nlong) {
      putAndNext((int64_t)getOld<int32_t>());
      continue;
    } else if (type == &ffi_type_nulong) {
      putAndNext((uint64_t)getOld<uint32_t>());
      continue;
    }
#endif
#if !__NATJ_WCHART_TYPE_IS_32BIT__
    if (type == &ffi_type_wchart) {
      putAndNext((uint32_t)getOld<uint16_t>());
      continue;
    }
#endif

    if (type->type == FFI_TYPE_POINTER) {
      putAndNext((void*)desc.env->CallStaticObjectMethod(
          gNatJClass, gToJavaStaticMethod,
          reinterpret_cast<jlong>(getOld<void*>()), getInfoAndNext()));
    } else if (type->type == FFI_TYPE_STRUCT) {
      void* data = malloc(type->size);
      memcpy(data, getOldDirect(), type->size);
      putAndNext((void*)desc.env->CallStaticObjectMethod(
          gNatJClass, gToJavaStaticMethod, reinterpret_cast<jlong>(data),
          getInfoAndNext()));
    } else {
      if (desc.promote) {
        switch (type->type) {
          case FFI_TYPE_FLOAT: {
            putAndNext((double)getOld<float>());
            continue;
          }
          case FFI_TYPE_UINT8: {
            putAndNext((uint32_t)getOld<uint8_t>());
            continue;
          }
          case FFI_TYPE_SINT8: {
            putAndNext((int32_t)getOld<int8_t>());
            continue;
          }
          case FFI_TYPE_UINT16: {
            putAndNext((uint32_t)getOld<uint16_t>());
            continue;
          }
          case FFI_TYPE_SINT16: {
            putAndNext((int32_t)getOld<int16_t>());
            continue;
          }
        }
      }
      putOldAndNext();
    }
  }

  return desc.nvalues;
}

template <>
ffi_type* ValueConverter<kToNative>::getNeededType(ffi_type* type,
                                                   bool promote) {
#if !__NATJ_IS_64BIT__
  if (type == &ffi_type_nfloat) {
    return &ffi_type_float;
  } else if (type == &ffi_type_nuint) {
    return &ffi_type_uint32;
  } else if (type == &ffi_type_nint) {
    return &ffi_type_sint32;
  }
#endif
#if !__NATJ_LONG_TYPE_IS_64BIT__
  if (type == &ffi_type_nlong) {
    return &ffi_type_sint32;
  } else if (type == &ffi_type_nulong) {
    return &ffi_type_uint32;
  }
#endif
#if !__NATJ_WCHART_TYPE_IS_32BIT__
  if (type == &ffi_type_wchart) {
    return &ffi_type_uint16;
  }
#endif

  if (type->type == FFI_TYPE_POINTER) {
    return &ffi_type_pointer;
  } else if (type->type == FFI_TYPE_STRUCT) {
    return &ffi_type_pointer;
  }

  return nullptr;
}

template <>
unsigned ValueConverter<kToNative>::convert(
    const ValueConverter<kToNative>::Descriptor& desc) {
  unsigned c = desc.nvalues;

  for (unsigned i = 0; i < desc.nvalues; i++) {
    ffi_type* type = getOldType();

#if !__NATJ_IS_64BIT__
    if (type == &ffi_type_nfloat) {
      putAndNext((float)getOld<double>());
      continue;
    } else if (type == &ffi_type_nuint) {
      putAndNext((uint32_t)getOld<uint64_t>());
      continue;
    } else if (type == &ffi_type_nint) {
      putAndNext((int32_t)getOld<int64_t>());
      continue;
    }
#endif
#if !__NATJ_LONG_TYPE_IS_64BIT__
    if (type == &ffi_type_nlong) {
      putAndNext((int32_t)getOld<int64_t>());
      continue;
    } else if (type == &ffi_type_nulong) {
      putAndNext((uint32_t)getOld<uint64_t>());
      continue;
    }
#endif
#if !__NATJ_WCHART_TYPE_IS_32BIT__
    if (type == &ffi_type_wchart) {
      putAndNext((uint16_t)getOld<uint32_t>());
      continue;
    }
#endif

    if (type->type == FFI_TYPE_POINTER) {
      putAndNext((void*)desc.env->CallStaticLongMethod(
          gNatJClass, gToNativeStaticMethod, getOld<jobject>(),
          getInfoAndNext()));
    } else if (type->type == FFI_TYPE_STRUCT) {
      putDirectAndNext(type, (void*)desc.env->CallStaticLongMethod(
                                 gNatJClass, gToNativeStaticMethod,
                                 getOld<jobject>(), getInfoAndNext()));
    } else {
      putOldAndNext();
    }
  }

  if (desc.variadic != kNotVariadic) {
    jarray array = *(jarray*)desc.values[desc.nvalues];

    const jsize vc = desc.env->GetArrayLength(array);
    c += vc;

#define HANDLE_PRIMITIVE_CASE(name, cname, jname, cast)                  \
  if (desc.variadic == k##cname##Variadic) {                             \
    jboolean isCopy;                                                     \
    name##Array parray = (name##Array)array;                             \
    name* elems = desc.env->Get##jname##ArrayElements(parray, &isCopy);  \
    for (jint i = 0, n = vc; i < n; i++) {                               \
      putAndNext(cast elems[i]);                                         \
    }                                                                    \
    if (isCopy == JNI_TRUE) {                                            \
      desc.env->Release##jname##ArrayElements(parray, elems, JNI_ABORT); \
    }                                                                    \
  }

#if !__NATJ_IS_64BIT__
    HANDLE_PRIMITIVE_CASE(jlong, NUInt, Long, (uint32_t)) else
    HANDLE_PRIMITIVE_CASE(jlong, NInt, Long, (int32_t)) else
    HANDLE_PRIMITIVE_CASE(jdouble, NFloat, Double, ) else
#endif
#if !__NATJ_LONG_TYPE_IS_64BIT__
    HANDLE_PRIMITIVE_CASE(jlong, NULong, Long, (uint32_t)) else
    HANDLE_PRIMITIVE_CASE(jlong, NLong, Long, (int32_t)) else
#endif
#if !__NATJ_WCHART_TYPE_IS_32BIT__
    HANDLE_PRIMITIVE_CASE(jint, WCharT, Int, (uint16_t)) else
#endif

    HANDLE_PRIMITIVE_CASE(jboolean, Boolean, Boolean, (uint32_t)) else
    HANDLE_PRIMITIVE_CASE(jbyte, Byte, Byte, (int32_t)) else
    HANDLE_PRIMITIVE_CASE(jchar, Char, Char, (uint32_t)) else
    HANDLE_PRIMITIVE_CASE(jshort, Short, Short, (int32_t)) else
    HANDLE_PRIMITIVE_CASE(jint, Int, Int, ) else
    HANDLE_PRIMITIVE_CASE(jlong, Long, Long, (int64_t)) else
    HANDLE_PRIMITIVE_CASE(jfloat, Float, Float, (double)) else
    HANDLE_PRIMITIVE_CASE(jdouble, Double, Double, ) else {
#undef HANDLE_PRIMITIVE_CASE
      jobjectArray oarray = (jobjectArray)array;
      for (jint i = 0; i < vc; i++) {
        jobject elem = desc.env->GetObjectArrayElement(oarray, i);

        if (elem == nullptr) {
          putAndNext((void*)nullptr);
          continue;
        }

        jclass type = desc.env->GetObjectClass(elem);

        ffi_type* ntype = &ffi_type_pointer;
        uint8_t nvalue[8];

        jobject buildInfo = nullptr;

        jboolean byValue = false;
        jobject mapper = nullptr;
        if (desc.env->IsSameObject(type, gByValueVariadicArgClass)) {
          byValue = true;
          jobject instance =
              desc.env->CallObjectMethod(elem, gGetVariadicArgInstanceMethod);
          desc.env->DeleteLocalRef(elem);
          elem = instance;
          jclass itype = desc.env->GetObjectClass(instance);
          ntype = getFFIType(desc.env, itype, true);
          desc.env->DeleteLocalRef(type);
          type = itype;
          *(jobject*)nvalue = elem;
        } else if (desc.env->IsSameObject(type, gUnboxVariadicArgClass)) {
          jobject instance =
              desc.env->CallObjectMethod(elem, gGetVariadicArgInstanceMethod);
          jclass ptype = desc.env->GetObjectClass(instance);
          if (desc.env->IsSameObject(ptype, gBoxedBooleanClass)) {
            ntype = &ffi_type_uint32;
            *(uint32_t*)nvalue =
                desc.env->CallBooleanMethod(instance, gBooleanValueMethod);
          } else if (desc.env->IsSameObject(ptype, gBoxedByteClass)) {
            ntype = &ffi_type_sint32;
            *(int32_t*)nvalue =
                desc.env->CallByteMethod(instance, gByteValueMethod);
          } else if (desc.env->IsSameObject(ptype, gBoxedCharClass)) {
            ntype = &ffi_type_uint32;
            *(uint32_t*)nvalue =
                desc.env->CallCharMethod(instance, gCharValueMethod);
          } else if (desc.env->IsSameObject(ptype, gBoxedShortClass)) {
            ntype = &ffi_type_sint32;
            *(int32_t*)nvalue =
                desc.env->CallShortMethod(instance, gShortValueMethod);
          } else if (desc.env->IsSameObject(ptype, gBoxedIntClass)) {
            ntype = &ffi_type_sint32;
            *(int32_t*)nvalue =
                desc.env->CallIntMethod(instance, gIntValueMethod);
          } else if (desc.env->IsSameObject(ptype, gBoxedLongClass)) {
            ntype = &ffi_type_sint64;
            *(jlong*)nvalue =
                desc.env->CallLongMethod(instance, gLongValueMethod);
          } else if (desc.env->IsSameObject(ptype, gBoxedFloatClass)) {
            ntype = &ffi_type_double;
            *(jdouble*)nvalue =
                desc.env->CallFloatMethod(instance, gFloatValueMethod);
          } else if (desc.env->IsSameObject(ptype, gBoxedDoubleClass)) {
            ntype = &ffi_type_double;
            *(jdouble*)nvalue =
                desc.env->CallDoubleMethod(instance, gDoubleValueMethod);
          }
          desc.env->DeleteLocalRef(ptype);
          desc.env->DeleteLocalRef(instance);
#if __NATJ_IS_64BIT__
        } else if (desc.env->IsSameObject(type, gNUIntVariadicArgClass)) {
          ntype = &ffi_type_uint64;
          *(jlong*)nvalue =
              desc.env->CallLongMethod(elem, gGetNUIntVariadicArgNUIntMethod);
        } else if (desc.env->IsSameObject(type, gNIntVariadicArgClass)) {
          ntype = &ffi_type_sint64;
          *(jlong*)nvalue =
              desc.env->CallLongMethod(elem, gGetNIntVariadicArgNIntMethod);
#else
        } else if (desc.env->IsSameObject(type, gNUIntVariadicArgClass)) {
          ntype = &ffi_type_uint32;
          *(jint*)nvalue =
              (jint)desc.env->CallLongMethod(elem, gGetNUIntVariadicArgNUIntMethod);
        } else if (desc.env->IsSameObject(type, gNIntVariadicArgClass)) {
          ntype = &ffi_type_sint32;
          *(jint*)nvalue =
              (jint)desc.env->CallLongMethod(elem, gGetNIntVariadicArgNIntMethod);
#endif
#if __NATJ_LONG_TYPE_IS_64BIT__
        } else if (desc.env->IsSameObject(type, gNULongVariadicArgClass)) {
          ntype = &ffi_type_uint64;
          *(jlong*)nvalue =
              desc.env->CallLongMethod(elem, gGetNULongVariadicArgNULongMethod);
        } else if (desc.env->IsSameObject(type, gNLongVariadicArgClass)) {
          ntype = &ffi_type_sint64;
          *(jlong*)nvalue =
              desc.env->CallLongMethod(elem, gGetNLongVariadicArgNLongMethod);
#else
        } else if (desc.env->IsSameObject(type, gNULongVariadicArgClass)) {
          ntype = &ffi_type_uint32;
          *(jint*)nvalue =
              (jint)desc.env->CallLongMethod(elem, gGetNULongVariadicArgNULongMethod);
        } else if (desc.env->IsSameObject(type, gNLongVariadicArgClass)) {
          ntype = &ffi_type_sint32;
          *(jint*)nvalue =
              (jint)desc.env->CallLongMethod(elem, gGetNLongVariadicArgNLongMethod);
#endif
        } else if (desc.env->IsSameObject(type, gNFloatVariadicArgClass)) {
          ntype = &ffi_type_double;
          *(jdouble*)nvalue = desc.env->CallDoubleMethod(
              elem, gGetNFloatVariadicArgNFloatMethod);
        } else if (desc.env->IsSameObject(type, gWCharTVariadicArgClass)) {
          ntype = &ffi_type_uint32;
          *(jint*)nvalue = desc.env->CallIntMethod(
              elem, gGetWCharTVariadicArgWCharTMethod);
        } else if (desc.env->IsSameObject(type, gMapVariadicArgClass)) {
          mapper =
              desc.env->CallObjectMethod(elem, gGetMapVariadicArgMapperMethod);
          jobject instance =
              desc.env->CallObjectMethod(elem, gGetVariadicArgInstanceMethod);
          desc.env->DeleteLocalRef(elem);
          elem = instance;
          desc.env->DeleteLocalRef(type);
          type = desc.env->GetObjectClass(instance);
          *(jobject*)nvalue = elem;
        } else if (desc.env->IsSameObject(type, gBoxVariadicArgClass)) {
          jobject instance =
              desc.env->CallObjectMethod(elem, gGetVariadicArgInstanceMethod);
          desc.env->DeleteLocalRef(elem);
          elem = instance;
          desc.env->DeleteLocalRef(type);
          type = desc.env->GetObjectClass(instance);
          *(jobject*)nvalue = elem;
        } else if (desc.variadic == kUnboxVariadic) {
          if (desc.env->IsSameObject(type, gBoxedBooleanClass)) {
            ntype = &ffi_type_uint32;
            *(uint32_t*)nvalue =
                desc.env->CallBooleanMethod(elem, gBooleanValueMethod);
          } else if (desc.env->IsSameObject(type, gBoxedByteClass)) {
            ntype = &ffi_type_sint32;
            *(int32_t*)nvalue =
                desc.env->CallByteMethod(elem, gByteValueMethod);
          } else if (desc.env->IsSameObject(type, gBoxedCharClass)) {
            ntype = &ffi_type_uint32;
            *(uint32_t*)nvalue =
                desc.env->CallCharMethod(elem, gCharValueMethod);
          } else if (desc.env->IsSameObject(type, gBoxedShortClass)) {
            ntype = &ffi_type_sint32;
            *(int32_t*)nvalue =
                desc.env->CallShortMethod(elem, gShortValueMethod);
          } else if (desc.env->IsSameObject(type, gBoxedIntClass)) {
            ntype = &ffi_type_sint32;
            *(int32_t*)nvalue = desc.env->CallIntMethod(elem, gIntValueMethod);
          } else if (desc.env->IsSameObject(type, gBoxedLongClass)) {
            ntype = &ffi_type_sint64;
            *(jlong*)nvalue = desc.env->CallLongMethod(elem, gLongValueMethod);
          } else if (desc.env->IsSameObject(type, gBoxedFloatClass)) {
            ntype = &ffi_type_double;
            *(jdouble*)nvalue =
                desc.env->CallFloatMethod(elem, gFloatValueMethod);
          } else if (desc.env->IsSameObject(type, gBoxedDoubleClass)) {
            ntype = &ffi_type_double;
            *(jdouble*)nvalue =
                desc.env->CallDoubleMethod(elem, gDoubleValueMethod);
          } else {
            *(jobject*)nvalue = elem;
          }
        } else {
          *(jobject*)nvalue = elem;
        }

        if (ntype->type == FFI_TYPE_STRUCT || ntype->type == FFI_TYPE_POINTER) {
          jobject info = (jobject)desc.env->CallStaticObjectMethod(
              gNatJClass, gBuildNativeObjectInfoStaticMethod, desc.runtime,
              type, mapper, NULL, NULL, false, byValue, true);

          void* val = (void*)desc.env->CallStaticLongMethod(
              gNatJClass, gToNativeStaticMethod, *(jobject*)nvalue, info);

          desc.env->DeleteLocalRef(buildInfo);

          if (byValue) {
            putDirectAndNext(ntype, val);
          } else {
            putAndNext(ntype, &val);
          }
        } else {
          putAndNext(ntype, nvalue);
        }

        if (mapper) {
          desc.env->DeleteLocalRef(mapper);
        }
        desc.env->DeleteLocalRef(type);
        if (elem) {
          desc.env->DeleteLocalRef(elem);
        }
      }
    }
  }

  return c;
}

/*
 * Maybe a mutex pool would be a better idea?
 *
 * Btw. the size of the gMutexReferences container will be equal the number of
 * process threads at max.
 */

MutexInstance* getMutexInstanceForPointer(void* key) {
  gMutex.lock();
  auto pair = gMutexReferences.insert(std::make_pair(key, ReferencedMutex()));
  if (pair.second) {
    auto& ref = pair.first->second;
    ref.mutex = new std::mutex;
    ref.refs = 1;
  } else {
    pair.first->second.refs++;
  }
  gMutex.unlock();
  return (MutexInstance*)new MutexInstanceImpl{pair.first};
}

void releaseMutexInstance(MutexInstance* instance) {
  gMutex.lock();
  auto it = ((MutexInstanceImpl*)instance)->it;
  auto& ref = it->second;
  if (--ref.refs == 0) {
    delete (ref.mutex);
    gMutexReferences.erase(it);
  }
  gMutex.unlock();
  delete (instance);
}

void handleStartup(JNIEnv* env, const char* name) {
  jclass clazz = env->FindClass(name);

  if (env->ExceptionOccurred()) {
    env->ExceptionClear();
    return;
  }
  
HANDLE_NATIVE_EXCEPTION_ENTER(env);
  if (!(handleCStartup(env, clazz)
#ifdef __APPLE__
        || handleObjCStartup(env, clazz)
#endif
        )) {
    // If there aren't any runtime that can handle startup for the given class
    // then fallback to a simple static initialization.
    forceInitClass(env, clazz);
  }
  HANDLE_NATIVE_EXCEPTION_EXIT(env);

  env->DeleteLocalRef(clazz);
  
  THROW_NATIVE_EXCEPTION_TO_JAVA(env);
}

void forceInitClass(JNIEnv* env, jclass clazz) {
  // We look it up, but we don't have to call it, because JNI will initialize
  // the class,
  // thus the static initializer will be invoked.
  env->GetStaticMethodID(clazz, "<clinit>", "()V");

  if (env->ExceptionOccurred()) {
    env->ExceptionClear();
  }
}

void failCallbackWithMethod(const char* type, JNIEnv* env, jobject method) {
  if (method) {
    // Get declaring class' name
    jclass declarer =
        (jclass)env->CallObjectMethod(method, gGetDeclaringClassMethod);
    jstring className =
        (jstring)env->CallObjectMethod(declarer, gGetClassNameMethod);
    const char* classCName = env->GetStringUTFChars(className, NULL);

    // Get method's name
    jstring methodName =
        (jstring)env->CallObjectMethod(method, gGetMethodNameMethod);
    const char* methodCName = env->GetStringUTFChars(methodName, NULL);

    LOGF << type << " not found for method " << methodCName << " in class "
         << classCName << "!";
  } else {
    LOGF << type << " not found!";
  }
}

uint64_t addStrongReference(JNIEnv* env, jobject object) {
  return env->CallStaticLongMethod(gNatJClass, gAddStrongReferenceStaticMethod,
                                   object);
}

bool removeStrongReference(JNIEnv* env, uint64_t reference) {
  return env->CallStaticBooleanMethod(
      gNatJClass, gRemoveStrongReferenceStaticMethod, reference);
}

jobject getStrongReference(JNIEnv* env, uint64_t reference) {
  return env->CallStaticObjectMethod(
      gNatJClass, gGetStrongReferenceStaticMethod, reference);
}

uint64_t addWeakReference(JNIEnv* env, jobject object) {
  return env->CallStaticLongMethod(gNatJClass, gAddWeakReferenceStaticMethod,
                                   object);
}

bool removeWeakReference(JNIEnv* env, uint64_t reference) {
  return env->CallStaticBooleanMethod(
      gNatJClass, gRemoveWeakReferenceStaticMethod, reference);
}

jobject getWeakReference(JNIEnv* env, uint64_t reference) {
  return env->CallStaticObjectMethod(gNatJClass, gGetWeakReferenceStaticMethod,
                                     reference);
}

void natj_printJavaStackTrace(JNIEnv *env) {
  jclass cls = env->FindClass("java/lang/Exception");
  if (cls != NULL) {
    jmethodID constructor = env->GetMethodID(cls, "<init>", "()V");
    if(constructor != NULL) {
      jobject exc = env->NewObject(cls, constructor);
      if(exc != NULL) {
        jmethodID printStackTrace = env->GetMethodID(cls, "printStackTrace", "()V");
        if(printStackTrace != NULL) {
          env->CallObjectMethod(exc, printStackTrace);
        }
      }
      env->DeleteLocalRef(exc);
    }
  }
  env->DeleteLocalRef(cls);
}

#if STATIC_BUILD
// JVM8+ require this so System.loadLibrary() works with static linked lib
extern "C" jint JNI_OnLoad_natj(JavaVM* vm, void* p) {
  return JNI_VERSION_1_1;
}
#endif
