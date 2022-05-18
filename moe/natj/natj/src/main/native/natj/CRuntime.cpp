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

#include "CRuntime.h"
#include "CHandlers.h"

#include <stdlib.h>
#include <stdint.h>
#include <map>
#include <vector>
#include <string>
#include <limits>

#ifdef _WIN32
#include <psapi.h>
#endif

static jobject gRuntime = NULL;

jclass gStructureClass = NULL;
jclass gStructureFieldClass = NULL;
jclass gCFunctionClass = NULL;
jclass gCVariableClass = NULL;
jclass gInlineClass = NULL;
jclass gBufferClass = NULL;

jmethodID gGetStructAlignmentMethod = NULL;
jmethodID gGetStructFieldOrderMethod = NULL;
jmethodID gGetStructFieldIsGetterMethod = NULL;
jmethodID gGetStructFieldCountMethod = NULL;
jmethodID gGetCFunctionNameMethod = NULL;
jmethodID gGetCVariableNameMethod = NULL;
jmethodID gGetCVariableIsGetterMethod = NULL;
jmethodID gGetBufferPositionMethod = NULL;

static int8_t gDefaultUnboxPolicy;

jobject getCRuntime() {
  return gRuntime;
}

static const char gInlinePrefix[] = "__natj_inline_";

static void registerCClass(JNIEnv*, jclass);

bool handleCStartup(JNIEnv*, jclass) { return false; }

void JNICALL Java_org_moe_natj_c_CRuntime_initialize(JNIEnv* env, jclass clazz,
                                                 jobject instance) {
  gRuntime = env->NewGlobalRef(instance);

  env->PushLocalFrame(6);

  gStructureClass = (jclass)env->NewGlobalRef(
      env->FindClass("org/moe/natj/c/ann/Structure"));
  gStructureFieldClass = (jclass)env->NewGlobalRef(
      env->FindClass("org/moe/natj/c/ann/StructureField"));
  gCFunctionClass = (jclass)env->NewGlobalRef(
      env->FindClass("org/moe/natj/c/ann/CFunction"));
  gCVariableClass = (jclass)env->NewGlobalRef(
      env->FindClass("org/moe/natj/c/ann/CVariable"));
  gInlineClass = (jclass)env->NewGlobalRef(
      env->FindClass("org/moe/natj/c/ann/Inline"));
  gBufferClass = (jclass)env->NewGlobalRef(env->FindClass("java/nio/Buffer"));

  env->PopLocalFrame(NULL);

  gGetStructAlignmentMethod =
      env->GetMethodID(gStructureClass, "alignment", "()I");
  gGetStructFieldOrderMethod =
      env->GetMethodID(gStructureFieldClass, "order", "()I");
  gGetStructFieldIsGetterMethod =
      env->GetMethodID(gStructureFieldClass, "isGetter", "()Z");
  gGetStructFieldCountMethod =
      env->GetMethodID(gStructureFieldClass, "count", "()I");
  gGetCFunctionNameMethod =
      env->GetMethodID(gCFunctionClass, "value", "()Ljava/lang/String;");
  gGetCVariableNameMethod =
      env->GetMethodID(gCVariableClass, "name", "()Ljava/lang/String;");
  gGetCVariableIsGetterMethod =
      env->GetMethodID(gCVariableClass, "isGetter", "()Z");
  gGetBufferPositionMethod = env->GetMethodID(gBufferClass, "position", "()I");

  gDefaultUnboxPolicy =
      env->CallByteMethod(instance, gGetDefaultUnboxPolicyMethod);
  if (gDefaultUnboxPolicy == gUnboxVariadicPolicyValue) {
    gDefaultUnboxPolicy = kUnboxVariadic;
  } else if (gDefaultUnboxPolicy == gBoxVariadicPolicyValue) {
    gDefaultUnboxPolicy = kBoxVariadic;
  } else {
    assert(!"Invalid default unbox policy for the C runtime!");
  }
}

void JNICALL Java_org_moe_natj_c_CRuntime_registerClass(JNIEnv* env, jclass clazz,
                                                    jclass type) {
  registerCClass(env, type);
}

jstring JNICALL Java_org_moe_natj_c_CRuntime_createJavaString(JNIEnv* env,
                                                          jclass clazz,
                                                          jlong address) {
  return env->NewStringUTF(reinterpret_cast<const char*>(address));
}

jlong JNICALL Java_org_moe_natj_c_CRuntime_createNativeString(JNIEnv* env,
                                                          jclass clazz,
                                                          jstring string) {
  const char* cStr = env->GetStringUTFChars(string, NULL);
  jsize len = env->GetStringUTFLength(string) + 1;
  void* ret = malloc(len);
  memcpy(ret, cStr, len);
  env->ReleaseStringUTFChars(string, cStr);
  return reinterpret_cast<jlong>(ret);
}

jlong JNICALL Java_org_moe_natj_c_CRuntime_malloc(JNIEnv* env, jclass clazz,
                                              jlong size) {
  return reinterpret_cast<jlong>(malloc(size));
}

void JNICALL Java_org_moe_natj_c_CRuntime_free(JNIEnv* env, jclass clazz,
                                           jlong address) {
  free(reinterpret_cast<void*>(address));
}

jlong JNICALL Java_org_moe_natj_c_CRuntime_createNativeStringArray(
    JNIEnv* env, jclass clazz, jobjectArray array) {
  jsize count = env->GetArrayLength(array);
  jsize* lens = (jsize*)alloca(sizeof(jsize) * count);

  jsize ptrBlockSize = sizeof(char*) * count;

  jsize blockSize = ptrBlockSize;
  for (jsize i = 0; i < count; i++) {
    jstring element = (jstring)env->GetObjectArrayElement(array, i);
    lens[i] = env->GetStringUTFLength(element) + 1;
    env->DeleteLocalRef(element);
    blockSize += lens[i];
  }

  void** cArray = (void**)malloc(blockSize);

  char* strIt = (char*)cArray + ptrBlockSize;
  for (jsize i = 0; i < count; i++) {
    jstring element = (jstring)env->GetObjectArrayElement(array, i);
    const char* cStr = env->GetStringUTFChars(element, NULL);
    memcpy(strIt, cStr, lens[i]);
    env->ReleaseStringUTFChars(element, cStr);
    env->DeleteLocalRef(element);
    cArray[i] = strIt;
    strIt += lens[i];
  }

  return reinterpret_cast<jlong>(cArray);
}

jlong JNICALL Java_org_moe_natj_c_CRuntime_allocNativeObject(JNIEnv* env,
                                                         jclass clazz,
                                                         jclass type,
                                                         jint count) {
  return reinterpret_cast<jlong>(
      calloc(count, getFFIType(env, type, true)->size));
}

jlong JNICALL Java_org_moe_natj_c_CRuntime_sizeOfNativeObject(JNIEnv* env,
                                                          jclass clazz,
                                                          jclass type) {
  return getFFIType(env, type, true)->size;
}

void JNICALL Java_org_moe_natj_c_CRuntime_copyNativeObject(JNIEnv* env,
                                                       jclass clazz,
                                                       jclass type, jlong dst,
                                                       jlong src) {
  memcpy(reinterpret_cast<void*>(dst), reinterpret_cast<void*>(src),
         getFFIType(env, type, true)->size);
}

jlong JNICALL Java_org_moe_natj_c_CRuntime_copyNativeObjectArray(
    JNIEnv* env, jclass clazz, jobjectArray array) {
  jsize count = env->GetArrayLength(array);

  std::vector<std::pair<void*, size_t> > toCopy;
  toCopy.reserve(count);

  size_t bytes = 0;
  for (jsize i = 0; i < count; i++) {
    jobject obj = env->GetObjectArrayElement(array, i);

    jclass cls = env->GetObjectClass(obj);
    ffi_type* type = getFFIType(env, cls, true);

    jobject pointer = env->CallObjectMethod(obj, gGetNativeObjectPeerMethod);
    char* ptr = reinterpret_cast<char*>(
        env->CallLongMethod(pointer, gGetPointerPeerMethod));

    toCopy.push_back(std::make_pair(ptr, type->size));

    bytes += type->size;

    env->DeleteLocalRef(pointer);
    env->DeleteLocalRef(cls);
    env->DeleteLocalRef(obj);
  }

  void* cArray = malloc(bytes);

  char* it = (char*)(cArray);
  for (const auto& pair : toCopy) {
    memcpy(it, pair.first, pair.second);
    it += pair.second;
  }

  return reinterpret_cast<jlong>(cArray);
}

jint JNICALL Java_org_moe_natj_c_CRuntime_sizeOfPointer(JNIEnv* env, jclass clazz) {
  return sizeof(void*);
}

jint JNICALL Java_org_moe_natj_c_CRuntime_sizeOfLong(JNIEnv* env, jclass clazz) {
  return sizeof(long);
}

jint JNICALL Java_org_moe_natj_c_CRuntime_sizeOfWCharT(JNIEnv* env, jclass clazz) {
  return sizeof(wchar_t);
}

jlong JNICALL Java_org_moe_natj_c_CRuntime_allocPointer(JNIEnv* env, jclass clazz,
                                                    jint count) {
  return reinterpret_cast<jlong>(calloc(count, sizeof(void*)));
}

void JNICALL Java_org_moe_natj_c_CRuntime_copyPointerArray(JNIEnv* env,
                                                       jclass clazz, jlong dst,
                                                       jlongArray array) {
  jsize count = env->GetArrayLength(array);
  jlong* cArray = env->GetLongArrayElements(array, NULL);
  void** ptr = reinterpret_cast<void**>(dst);
  jlong* it = (jlong*)cArray;
  for (jsize i = 0; i < count; i++) {
    *ptr = reinterpret_cast<void*>(*it);
    ptr++;
    it++;
  }
  env->ReleaseLongArrayElements(array, cArray, 0);
}

jlong JNICALL Java_org_moe_natj_c_CRuntime_loadPointer(JNIEnv* env, jclass clazz,
                                                   jlong ptr, jint idx) {
  return reinterpret_cast<jlong>(*(reinterpret_cast<void**>(ptr) + idx));
}

void JNICALL Java_org_moe_natj_c_CRuntime_storePointer(JNIEnv* env, jclass clazz,
                                                   jlong dst, jint idx,
                                                   jlong value) {
  *(reinterpret_cast<void**>(dst) + idx) = reinterpret_cast<void*>(value);
}

void JNICALL Java_org_moe_natj_c_CRuntime_memset(JNIEnv* env, jclass clazz,
                                             jlong dst, jint idx, jint length,
                                             jbyte value) {
  memset(reinterpret_cast<jbyte*>(dst) + idx, value, length);
}

void JNICALL Java_org_moe_natj_c_CRuntime_memcpy(JNIEnv* env, jclass clazz,
                                             jlong dst, jlong src,
                                             jint length) {
  memcpy(reinterpret_cast<jbyte*>(dst), reinterpret_cast<jbyte*>(src), length);
}

#define PRIMITIVE_ACCESS_IMPL(name, type)                                     \
  jlong JNICALL Java_org_moe_natj_c_CRuntime_alloc##name(                         \
      JNIEnv* env, jclass clazz, jint count) {                                \
    return reinterpret_cast<jlong>(calloc(count, sizeof(type)));              \
  }                                                                           \
  void JNICALL Java_org_moe_natj_c_CRuntime_copy##name##Array(                    \
      JNIEnv* env, jclass clazz, jlong dst, jint startOffset,                 \
      type##Array array, jint buffOffset, jint length) {                      \
    type* cArray = env->Get##name##ArrayElements(array, NULL);                \
    memcpy(reinterpret_cast<type*>(dst) + startOffset, cArray + buffOffset,   \
           length * sizeof(type));                                            \
    env->Release##name##ArrayElements(array, cArray, 0);                      \
  }                                                                           \
  void JNICALL Java_org_moe_natj_c_CRuntime_copyNative##name##Array(              \
      JNIEnv* env, jclass clazz, jlong dst, jint startOffset, jlong array,    \
      jint buffOffset, jint length) {                                         \
    memcpy(reinterpret_cast<type*>(dst) + startOffset,                        \
           reinterpret_cast<type*>(array) + buffOffset,                       \
           length * sizeof(type));                                            \
  }                                                                           \
  void JNICALL Java_org_moe_natj_c_CRuntime_copyFromNative##name##Array(   \
      JNIEnv* env, jclass clazz, type##Array dst, jint startOffset,           \
      jlong array, jint buffOffset, jint length) {                            \
    type* cArray = env->Get##name##ArrayElements(dst, NULL);                  \
    memcpy(cArray + startOffset, reinterpret_cast<type*>(array) + buffOffset, \
           length * sizeof(type));                                            \
    env->Release##name##ArrayElements(dst, cArray, 0);                        \
  }                                                                           \
  type JNICALL Java_org_moe_natj_c_CRuntime_load##name(JNIEnv* env, jclass clazz, \
                                                   jlong src, jint idx) {     \
    return *(reinterpret_cast<type*>(src) + idx);                             \
  }                                                                           \
  void JNICALL Java_org_moe_natj_c_CRuntime_store##name(                          \
      JNIEnv* env, jclass clazz, jlong dst, jint idx, type value) {           \
    *(reinterpret_cast<type*>(dst) + idx) = value;                            \
  }                                                                           \
  type##Array JNICALL Java_org_moe_natj_c_CRuntime_create##name##Array(           \
      JNIEnv* env, jclass clazz, jlong src, jint length) {                    \
    type##Array jarray = env->New##name##Array(length);                       \
    env->Set##name##ArrayRegion(jarray, 0, length,                            \
                                reinterpret_cast<type*>(src));                \
    return jarray;                                                            \
  }
#define BUFFER_PRIMITIVE_ACCESS_IMPL(name, type)                               \
  jlong JNICALL Java_org_moe_natj_c_CRuntime_get##name##BufferPointer(             \
      JNIEnv* env, jclass clazz, jobject buffer) {                             \
    jint position = env->CallIntMethod(buffer, gGetBufferPositionMethod);      \
    type* ptr = reinterpret_cast<type*>(env->GetDirectBufferAddress(buffer)) + \
                position;                                                      \
    return reinterpret_cast<jlong>(ptr);                                       \
  }

PRIMITIVE_ACCESS_IMPL(Boolean, jboolean)
PRIMITIVE_ACCESS_IMPL(Char, jchar)
BUFFER_PRIMITIVE_ACCESS_IMPL(Char, jchar)
PRIMITIVE_ACCESS_IMPL(Byte, jbyte)
BUFFER_PRIMITIVE_ACCESS_IMPL(Byte, jbyte)
PRIMITIVE_ACCESS_IMPL(Short, jshort)
BUFFER_PRIMITIVE_ACCESS_IMPL(Short, jshort)
PRIMITIVE_ACCESS_IMPL(Int, jint)
BUFFER_PRIMITIVE_ACCESS_IMPL(Int, jint)
PRIMITIVE_ACCESS_IMPL(Long, jlong)
BUFFER_PRIMITIVE_ACCESS_IMPL(Long, jlong)
PRIMITIVE_ACCESS_IMPL(Float, jfloat)
BUFFER_PRIMITIVE_ACCESS_IMPL(Float, jfloat)
PRIMITIVE_ACCESS_IMPL(Double, jdouble)
BUFFER_PRIMITIVE_ACCESS_IMPL(Double, jdouble)

#undef PRIMITIVE_ACCESS_IMPL
#undef BUFFER_PRIMITIVE_ACCESS_IMPL

jlong JNICALL Java_org_moe_natj_c_CRuntime_allocNativeCallback(JNIEnv* env,
                                                           jclass clazz,
                                                           jobject instance,
                                                           jobject method,
                                                           jlongArray extra) {
  ToJavaCallbackInfo* info = new ToJavaCallbackInfo;

  jint modifiers = env->CallIntMethod(method, gGetModifiersMethod);
  bool isStatic = modifiers & ACC_STATIC;

  // Is this static?
  info->isStatic = isStatic;

  // We will cache later
  info->cached = false;

  // We will generate cachce from this
  info->method = env->NewGlobalRef(method);

  // In case of static methods we will use this object
  jclass objectClass = env->GetObjectClass(instance);
  info->clazz = (jclass)env->NewGlobalRef(objectClass);
  env->DeleteLocalRef(objectClass);

  // In case of non-static methods we will use this object
  info->instance = env->NewGlobalRef(instance);

  // Generate ffi type for the method
  jboolean byValue =
      env->CallBooleanMethod(method, gIsAnnotationPresentMethod, gByValueClass);
  jclass returnType =
      (jclass)env->CallObjectMethod(method, gGetReturnTypeMethod);
  ffi_type* returnCType = getFFIType(env, returnType, false);
#if !__NATJ_HAS_NATIVE_SIZED_TYPES__
  ffi_type* nativeReturnCType = getFFIType(env, returnType, byValue);
#else
  NativeSizedType nativeSized = kNo;
  if (!byValue) {
    if (false) {}
#if !__NATJ_IS_64BIT__
    else if (env->CallBooleanMethod(method, gIsAnnotationPresentMethod,
                                    gNFloatClass)) {
      nativeSized = kNFloat;
    } else if (env->CallBooleanMethod(method, gIsAnnotationPresentMethod,
                                      gNUIntClass)) {
      nativeSized = kNUInt;
    } else if (env->CallBooleanMethod(method, gIsAnnotationPresentMethod,
                                      gNIntClass)) {
      nativeSized = kNInt;
    }
#endif
#if !__NATJ_LONG_TYPE_IS_64BIT__
    else if (env->CallBooleanMethod(method, gIsAnnotationPresentMethod,
                                    gNULongClass)) {
      nativeSized = kNULong;
    } else if (env->CallBooleanMethod(method, gIsAnnotationPresentMethod,
                                      gNLongClass)) {
      nativeSized = kNLong;
    }
#endif
#if !__NATJ_WCHART_TYPE_IS_32BIT__
    else if (env->CallBooleanMethod(method, gIsAnnotationPresentMethod,
                                    gWCharTClass)) {
      nativeSized = kWCharT;
    }
#endif
  }
  ffi_type* nativeReturnCType =
      getFFIType(env, returnType, byValue, false, nativeSized);
#endif
  env->DeleteLocalRef(returnType);

  // Select the appropriate jni method
  info->callback = getJNICallFunction(env, returnCType, isStatic);

  // Generate ffi types for the parameters
  jobjectArray parameterAnns = (jobjectArray)env->CallStaticObjectMethod(
     gNatJClass, gGetParameterAnnotationsInheritedStaticMethod, method);
  jobjectArray parameterTypes =
      (jobjectArray)env->CallObjectMethod(method, gGetParameterTypesMethod);
  jsize nativeParameterCount = env->GetArrayLength(parameterTypes);
  jsize parameterCount = nativeParameterCount + 3;
  ffi_type** parameterCTypes = new ffi_type* [parameterCount];
  ffi_type** nativeParameterCTypes = new ffi_type* [nativeParameterCount];
  parameterCTypes[0] = &ffi_type_pointer;  // JNIEnv*
  parameterCTypes[1] = &ffi_type_pointer;  // jclass/jobject
  parameterCTypes[2] = &ffi_type_pointer;  // jmethodID
  for (jsize j = 3; j < parameterCount; j++) {
    jclass parameterType =
        (jclass)env->GetObjectArrayElement(parameterTypes, j - 3);
    jobjectArray paramAnns =
        (jobjectArray)env->GetObjectArrayElement(parameterAnns, j - 3);
    jsize annCount = env->GetArrayLength(paramAnns);
    jboolean byValue = false;
#if !__NATJ_HAS_NATIVE_SIZED_TYPES__
    for (jsize k = 0; k < annCount && !byValue; k++) {
#else
    NativeSizedType nativeSized = kNo;
    for (jsize k = 0; k < annCount && !byValue && nativeSized == kNo; k++) {
#endif
      jobject paramAnn = env->GetObjectArrayElement(paramAnns, k);
      if (env->IsInstanceOf(paramAnn, gByValueClass)) {
        byValue = true;
#if !__NATJ_IS_64BIT__
      } else if (env->IsInstanceOf(paramAnn, gNFloatClass)) {
        nativeSized = kNFloat;
      } else if (env->IsInstanceOf(paramAnn, gNUIntClass)) {
        nativeSized = kNUInt;
      } else if (env->IsInstanceOf(paramAnn, gNIntClass)) {
        nativeSized = kNInt;
#endif
#if !__NATJ_LONG_TYPE_IS_64BIT__
      } else if (env->IsInstanceOf(paramAnn, gNLongClass)) {
        nativeSized = kNLong;
      } else if (env->IsInstanceOf(paramAnn, gNULongClass)) {
        nativeSized = kNULong;
#endif
#if !__NATJ_WCHART_TYPE_IS_32BIT__
      } else if (env->IsInstanceOf(paramAnn, gWCharTClass)) {
        nativeSized = kWCharT;
#endif
      }
      env->DeleteLocalRef(paramAnn);
    }
    parameterCTypes[j] = getFFIType(env, parameterType, false, true);
#if !__NATJ_HAS_NATIVE_SIZED_TYPES__
    nativeParameterCTypes[j - 3] = getFFIType(env, parameterType, byValue);
#else
    nativeParameterCTypes[j - 3] =
        getFFIType(env, parameterType, byValue, false, nativeSized);
#endif
    env->DeleteLocalRef(parameterType);
    env->DeleteLocalRef(paramAnns);
  }
  env->DeleteLocalRef(parameterAnns);
  env->DeleteLocalRef(parameterTypes);

  // Prepare ffi_cif for the Java method call
  ffi_prep_cif_var(&info->cif, FFI_DEFAULT_ABI, 3, parameterCount, returnCType,
                   parameterCTypes);

  // Create the closure
  void* code;
  ffi_cif* cif = new ffi_cif;
  ffi_closure* closure =
      (ffi_closure*)ffi_closure_alloc(sizeof(ffi_closure), &code);
  ffi_prep_cif(cif, FFI_DEFAULT_ABI, nativeParameterCount, nativeReturnCType,
               nativeParameterCTypes);
  ffi_prep_closure_loc(closure, cif, nativeToJavaCallbackHandler, info, code);

  // Set the extra out parameter
  jlong extraValue = reinterpret_cast<jlong>(closure);
  env->SetLongArrayRegion(extra, 0, 1, &extraValue);

  return reinterpret_cast<jlong>(code);
}

void JNICALL Java_org_moe_natj_c_CRuntime_deallocNativeCallback(JNIEnv* env,
                                                            jclass clazz,
                                                            jlong extra) {
  ffi_closure* closure = reinterpret_cast<ffi_closure*>(extra);
  ToJavaCallbackInfo* info = (ToJavaCallbackInfo*)closure->user_data;
  env->DeleteGlobalRef(info->instance);
  env->DeleteGlobalRef(info->clazz);
  if (info->cached) {
    destroyInfos(env, info->paramInfos, info->returnInfo);
  } else {
    env->DeleteGlobalRef(info->method);
  }
  delete info->cif.arg_types;
  delete info;
  delete closure->cif->arg_types;
  delete closure->cif;
  ffi_closure_free(closure);
}

jobject JNICALL Java_org_moe_natj_c_CRuntime_createJavaCallback(JNIEnv* env,
                                                            jclass clazz,
                                                            jlong extra) {
  ffi_closure* closure = reinterpret_cast<ffi_closure*>(extra);
  return ((ToJavaCallbackInfo*)closure->user_data)->instance;
}

void processStructureFields(JNIEnv* env, jclass type) {
  // Helpers for structures
  std::map<jint, std::pair<ffi_type*, jint> > fields;
  std::vector<std::pair<jint, ToNativeFieldInfo*> > fieldInfos;
  jsize maxFieldOrder = 0;
  jsize maxCheckerOrder = 0;
  ffi_type* ret;

  // Get class methods elements
  jobjectArray methods =
      (jobjectArray)env->CallObjectMethod(type, gGetDeclaredMethodsMethod);
  jsize methodCount = env->GetArrayLength(methods);

  // Initialize struct type
  ret = new ffi_type;
  ret->type = FFI_TYPE_STRUCT;
  ret->size = 0;
  fieldInfos.reserve(methodCount);

  // Store alignment
  {
    jobject ann =
        env->CallObjectMethod(type, gGetAnnotationMethod, gStructureClass);
    ret->alignment = env->CallIntMethod(ann, gGetStructAlignmentMethod);
    env->DeleteLocalRef(ann);
  }

  // For computing field item count
  jsize fieldItemCount = 0;

  // Iterate over every method
  for (jsize i = 0; i < methodCount; i++) {
    env->PushLocalFrame(100);

    jobject method = env->GetObjectArrayElement(methods, i);

    jint modifiers = env->CallIntMethod(method, gGetModifiersMethod);
    bool isNative = modifiers & ACC_NATIVE;
    bool isStatic = modifiers & ACC_STATIC;
    bool isAbstract = modifiers & ACC_ABSTRACT;

    // We are handling non-static, non-synthetic and native methods only
    if (isAbstract || !isNative || isStatic ||
        env->CallBooleanMethod(method, gIsSyntheticMethodMethod)) {
      env->PopLocalFrame(NULL);
      continue;
    }

    // Fetch informations
    void* code = NULL;
    ffi_type* returnCType;
    jsize parameterCount;
    ffi_type** parameterCTypes;
    void (*handler)(ffi_cif*, void*, void**, void*);
    void* userinfo;
    jobject field;
    if ((field = env->CallObjectMethod(method, gGetAnnotationMethod,
                                       gStructureFieldClass)) &&
        !env->IsSameObject(field, NULL)) {
      // Handle field
      ToNativeFieldInfo* info = new ToNativeFieldInfo;
      userinfo = info;

      // We will cache later
      info->cached = false;

      // We will generate cache from this
      info->method = env->NewGlobalRef(method);

      // Store whether it is a getter
      info->isGetter =
          env->CallBooleanMethod(field, gGetStructFieldIsGetterMethod);

      // Get the field count and store whether it is greater than one
      jint count = env->CallIntMethod(field, gGetStructFieldCountMethod);
      info->isConstantArrayField = count > 1;

      // Compute and store the type of the field
      jboolean byValue;
#if __NATJ_HAS_NATIVE_SIZED_TYPES__
      NativeSizedType nativeSized;
#endif
      jclass elementType;
      ffi_type* nativeType;
      if (info->isGetter) {
        elementType =
            (jclass)env->CallObjectMethod(method, gGetReturnTypeMethod);
        returnCType = getFFIType(env, elementType, false);
        byValue = env->CallBooleanMethod(method, gIsAnnotationPresentMethod,
                                         gByValueClass);
#if __NATJ_HAS_NATIVE_SIZED_TYPES__
        nativeSized = kNo;
        if (!byValue) {
          if (false) {}
#if !__NATJ_IS_64BIT__
          else if (env->CallBooleanMethod(method, gIsAnnotationPresentMethod,
                                          gNFloatClass)) {
            nativeSized = kNFloat;
          } else if (env->CallBooleanMethod(method, gIsAnnotationPresentMethod,
                                            gNUIntClass)) {
            nativeSized = kNUInt;
          } else if (env->CallBooleanMethod(method, gIsAnnotationPresentMethod,
                                            gNIntClass)) {
            nativeSized = kNInt;
          }
#endif
#if !__NATJ_LONG_TYPE_IS_64BIT__
          else if (env->CallBooleanMethod(method, gIsAnnotationPresentMethod,
                                          gNLongClass)) {
              nativeSized = kNLong;
          } else if (env->CallBooleanMethod(method, gIsAnnotationPresentMethod,
                                            gNULongClass)) {
              nativeSized = kNLong;
          }
#endif
#if !__NATJ_WCHART_TYPE_IS_32BIT__
          else if (env->CallBooleanMethod(method, gIsAnnotationPresentMethod,
                                          gWCharTClass)) {
              nativeSized = kWCharT;
          }
#endif
        }
#endif
        if (info->isConstantArrayField) {
          parameterCTypes = new ffi_type* [3];
          parameterCount = 3;
          parameterCTypes[2] = &ffi_type_sint32;
        } else {
          parameterCTypes = new ffi_type* [2];
          parameterCount = 2;
        }
      } else {
        jobjectArray parameterTypes = (jobjectArray)env->CallObjectMethod(
            method, gGetParameterTypesMethod);
        elementType = (jclass)env->GetObjectArrayElement(parameterTypes, 0);
        jobjectArray paramsAnns = (jobjectArray)env->CallObjectMethod(
            method, gGetParameterAnnotationsMethod);
        jobjectArray paramAnns =
            (jobjectArray)env->GetObjectArrayElement(paramsAnns, 0);
        jsize annCount = env->GetArrayLength(paramAnns);
        byValue = false;
#if !__NATJ_HAS_NATIVE_SIZED_TYPES__
        for (jsize j = 0; j < annCount && !byValue; j++) {
#else
        nativeSized = kNo;
        for (jsize j = 0; j < annCount && !byValue && nativeSized == kNo; j++) {
#endif
          jobject paramAnn = env->GetObjectArrayElement(paramAnns, j);
          if (env->IsInstanceOf(paramAnn, gByValueClass)) {
            byValue = true;
#if !__NATJ_IS_64BIT__
          } else if (env->IsInstanceOf(paramAnn, gNFloatClass)) {
            nativeSized = kNFloat;
          } else if (env->IsInstanceOf(paramAnn, gNUIntClass)) {
            nativeSized = kNUInt;
          } else if (env->IsInstanceOf(paramAnn, gNIntClass)) {
            nativeSized = kNInt;
#endif
#if !__NATJ_LONG_TYPE_IS_64BIT__
          } else if (env->IsInstanceOf(paramAnn, gNLongClass)) {
            nativeSized = kNLong;
          } else if (env->IsInstanceOf(paramAnn, gNULongClass)) {
            nativeSized = kNULong;
#endif
#if !__NATJ_WCHART_TYPE_IS_32BIT__
          } else if (env->IsInstanceOf(paramAnn, gWCharTClass)) {
            nativeSized = kWCharT;
#endif
          }
        }
        returnCType = &ffi_type_void;
        if (info->isConstantArrayField) {
          parameterCTypes = new ffi_type* [4];
          parameterCount = 4;
          parameterCTypes[2] = getFFIType(env, elementType, false);
          parameterCTypes[3] = &ffi_type_sint32;
        } else {
          parameterCTypes = new ffi_type* [3];
          parameterCount = 3;
          parameterCTypes[2] = getFFIType(env, elementType, false);
        }
      }
#if !__NATJ_HAS_NATIVE_SIZED_TYPES__
      nativeType = getFFIType(env, elementType, byValue);
#else
      nativeType = getFFIType(env, elementType, byValue, false, nativeSized);
#endif
      info->fieldType = nativeType;

      parameterCTypes[0] = &ffi_type_pointer;  // JNIEnv*
      parameterCTypes[1] = &ffi_type_pointer;  // jobject

      // Get the order and store its value and update the field item count
      jint order = env->CallIntMethod(field, gGetStructFieldOrderMethod);
      if (!nativeType->size) {
        jstring structName =
            (jstring)env->CallObjectMethod(type, gGetClassNameMethod);
        const char* structCName = env->GetStringUTFChars(structName, NULL);
        LOGF << order << ". field of structure " << structCName
             << " has an opaque type and by-value specifier, this will cause "
                "problems.";
      }
      if (fields.find(order) == fields.end()) {
        auto& pair = fields[order];
        pair.first = nativeType;
        pair.second = count;
        fieldItemCount += count;
        if (order > maxFieldOrder) maxFieldOrder = order;
      }

      // Store the info with its order to be able to set its offset attribute
      // offset after every field processed
      fieldInfos.push_back(std::make_pair(order, info));

      // Set the callback handler
      handler = javaToNativeFieldHandler;
    } else {
      env->PopLocalFrame(NULL);
      continue;
    }

    // Create the closure
    ffi_cif* cif = new ffi_cif;
    ffi_closure* closure =
        (ffi_closure*)ffi_closure_alloc(sizeof(ffi_closure), &code);
    ffi_prep_cif(cif, FFI_DEFAULT_ABI, parameterCount, returnCType,
                 parameterCTypes);
    ffi_prep_closure_loc(closure, cif, handler, userinfo, code);

    // Register method
    jstring methodName =
        (jstring)env->CallObjectMethod(method, gGetMethodNameMethod);
    const char* methodCName = env->GetStringUTFChars(methodName, NULL);
    jstring methodDesc = (jstring)env->CallStaticObjectMethod(
        gAsmTypeClass, gGetMethodDescriptorStaticMethod, method);
    const char* methodCDesc = env->GetStringUTFChars(methodDesc, NULL);
    JNINativeMethod nativeMethod;
    nativeMethod.name = methodCName;
    nativeMethod.signature = methodCDesc;
    nativeMethod.fnPtr = code;
    env->RegisterNatives(type, &nativeMethod, 1);
    env->ReleaseStringUTFChars(methodDesc, methodCDesc);
    env->ReleaseStringUTFChars(methodName, methodCName);

    env->PopLocalFrame(NULL);
  }

  // Cleanup
  env->DeleteLocalRef(methods);

  // Check whether there is a missing field index
  size_t fieldCount = fields.size();
  assert(fieldCount >= 0 && fieldCount <= std::numeric_limits<jsize>::max());
  if (fieldCount != 0 && maxFieldOrder >= (jsize)fieldCount) {
    jstring structName =
        (jstring)env->CallObjectMethod(type, gGetClassNameMethod);
    const char* structCName = env->GetStringUTFChars(structName, NULL);
    LOGF << "Invalid field orders have been specified for structure "
         << structCName << ". Maximum field order number is " << maxFieldOrder
         << ", number of fields is " << fieldCount;
  }

  // Check validity of maximum checker index
  if (maxCheckerOrder > maxFieldOrder) {
    jstring structName =
        (jstring)env->CallObjectMethod(type, gGetClassNameMethod);
    const char* structCName = env->GetStringUTFChars(structName, NULL);
    LOGF << "Invalid field checker orders have been specified for structure "
         << structCName << ". Maximum field order number is " << maxFieldOrder
         << ", specified field checker order " << fieldCount;
  }

  // Build the type of the structure and compute the offsets
  std::vector<size_t> offsets;
  {
    offsets.reserve(fieldCount);
    bool implicitAlignment = ret->alignment == 0;
    jsize actualItemCount = 0;
    ret->elements = new ffi_type* [fieldItemCount + 1];
    ret->elements[fieldItemCount] = NULL;
    for (auto& pair : fields) {
      size_t items = pair.second.second;
      ffi_type* element = pair.second.first;

      for (size_t i = 0; i < items; i++) {
        ret->elements[actualItemCount++] = element;
      }

      ret->size = ((ret->size - 1) | (element->alignment - 1)) + 1;
      offsets.push_back(ret->size);
      ret->size += element->size * items;
      if (implicitAlignment && ret->alignment < element->alignment) {
        ret->alignment = element->alignment;
      }
    }
    ret->size = ((ret->size - 1) | (ret->alignment - 1)) + 1;
  }

  // Cache the type
  setCachedFFIType(env, type, ret);

  // Save the offets in the field infos
  for (auto& pair : fieldInfos) {
    pair.second->offset = offsets[pair.first];
  }
}

#ifdef _WIN32
void* getProc(HMODULE module, LPCSTR name) {
  if (module != NULL) {
    return (void*)GetProcAddress(module, name);
  }

  HANDLE hProcess = GetCurrentProcess();
  DWORD cbNeeded;
  if (!EnumProcessModules(hProcess, NULL, 0, &cbNeeded)) {
    return NULL;
  }
  HMODULE* hMods = (HMODULE*)alloca(cbNeeded);
  EnumProcessModules(hProcess, hMods, cbNeeded, &cbNeeded);

  for (uint32_t i = 0; i < (cbNeeded / sizeof(HMODULE)); i++) {
    FARPROC proc = GetProcAddress(hMods[i], name);
    if (proc != NULL) return (void*)proc;
  }
  return NULL;
}
#endif

void processStructureFunctions(JNIEnv* env, jclass type) {
  // We will need this to lookup c symbols
#ifdef _WIN32
  HMODULE libHandle = NULL;
#else
  void* libHandle = NULL;
#endif

  // Get handle for this
#ifdef _WIN32
  constexpr HMODULE thisHandle = NULL;
#else
  void* thisHandle = dlopen(NULL, RTLD_LAZY);
#endif

  // Load library if possible
  jobject libAnn =
      env->CallObjectMethod(type, gGetAnnotationMethod, gLibraryClass);
  if (!env->IsSameObject(libAnn, NULL)) {
    jobject libName = env->CallObjectMethod(libAnn, gGetLibraryMethod);
    env->DeleteLocalRef(libAnn);
    jstring libPath = (jstring)env->CallStaticObjectMethod(
        gNatJClass, gLookUpLibraryStaticMethod, libName, false);
    env->DeleteLocalRef(libName);
    if (env->IsSameObject(libPath, NULL)) {
      libHandle = thisHandle;
    } else {
      const char* libCPath = env->GetStringUTFChars(libPath, NULL);
#ifdef _WIN32
      // TODO: We should support Unicode paths.
      libHandle = LoadLibraryA(libCPath);
#else
      libHandle = dlopen(libCPath, RTLD_LAZY);
#endif
      env->ReleaseStringUTFChars(libPath, libCPath);
      env->DeleteLocalRef(libPath);
    }
  } else {
    libHandle = thisHandle;
  }

  // Get class methods elements
  jobjectArray methods =
      (jobjectArray)env->CallObjectMethod(type, gGetDeclaredMethodsMethod);
  jsize methodCount = env->GetArrayLength(methods);

  // Iterate over every method
  for (jsize i = 0; i < methodCount; i++) {
    env->PushLocalFrame(100);

    jobject method = env->GetObjectArrayElement(methods, i);

    jint modifiers = env->CallIntMethod(method, gGetModifiersMethod);
    bool isNative = modifiers & ACC_NATIVE;
    bool isStatic = modifiers & ACC_STATIC;
    bool isAbstract = modifiers & ACC_ABSTRACT;

    // We are handling static native methods only
    if (isAbstract || !isNative || !isStatic ||
        env->CallBooleanMethod(method, gIsSyntheticMethodMethod)) {
      env->PopLocalFrame(NULL);
      continue;
    }

    // Fetch informations
    void* code = NULL;
    ffi_type* returnCType;
    jsize parameterCount;
    ffi_type** parameterCTypes;
    void (*handler)(ffi_cif*, void*, void**, void*);
    void* userinfo;
    jobject fieldAnn;
    if ((fieldAnn = env->CallObjectMethod(method, gGetAnnotationMethod,
                                          gCFunctionClass)) &&
        !env->IsSameObject(fieldAnn, NULL)) {
      // Handle c function
      ToNativeCallInfo* info = new ToNativeCallInfo;
      userinfo = info;

      // We will cache it later
      info->cached = false;

      // We will generate cache from this
      info->method = env->NewGlobalRef(method);

      // Get variadic info
      jobject var =
          env->CallObjectMethod(method, gGetAnnotationMethod, gVariadicClass);
      if (env->IsSameObject(var, NULL)) {
        info->variadic = kNotVariadic;
      } else {
        info->variadic = env->CallByteMethod(var, gGetVariadicUnboxPolicyMethod);
        if (info->variadic == gRuntimeVariadicPolicyValue) {
          info->variadic = gDefaultUnboxPolicy;
        } else if (info->variadic == gUnboxVariadicPolicyValue) {
          info->variadic = kUnboxVariadic;
        } else {
          info->variadic = kBoxVariadic;
        }
        env->DeleteLocalRef(var);
      }

      // Generate ffi type for the method
      jboolean byValue = env->CallBooleanMethod(
          method, gIsAnnotationPresentMethod, gByValueClass);
      jclass returnType =
          (jclass)env->CallObjectMethod(method, gGetReturnTypeMethod);
      returnCType = getFFIType(env, returnType, false);
#if !__NATJ_HAS_NATIVE_SIZED_TYPES__
      ffi_type* nativeReturnCType = getFFIType(env, returnType, byValue);
#else
      NativeSizedType nativeSized = kNo;
      if (!byValue) {
        if (false) {}
#if !__NATJ_IS_64BIT__
        else if (env->CallBooleanMethod(method, gIsAnnotationPresentMethod,
                                        gNFloatClass)) {
          nativeSized = kNFloat;
        } else if (env->CallBooleanMethod(method, gIsAnnotationPresentMethod,
                                          gNUIntClass)) {
          nativeSized = kNUInt;
        } else if (env->CallBooleanMethod(method, gIsAnnotationPresentMethod,
                                          gNIntClass)) {
          nativeSized = kNInt;
        }
#endif
#if !__NATJ_LONG_TYPE_IS_64BIT__
        else if (env->CallBooleanMethod(method, gIsAnnotationPresentMethod,
                                        gNLongClass)) {
          nativeSized = kNLong;
        } else if (env->CallBooleanMethod(method, gIsAnnotationPresentMethod,
                                          gNULongClass)) {
          nativeSized = kNULong;
        }
#endif
#if !__NATJ_WCHART_TYPE_IS_32BIT__
        else if (env->CallBooleanMethod(method, gIsAnnotationPresentMethod,
                                        gWCharTClass)) {
          nativeSized = kWCharT;
        }
#endif
      }
      ffi_type* nativeReturnCType =
          getFFIType(env, returnType, byValue, false, nativeSized);
#endif

      // Get method name
      jstring methodName =
          (jstring)env->CallObjectMethod(fieldAnn, gGetCFunctionNameMethod);
      if (env->GetStringUTFLength(methodName) == 0) {
        methodName =
            (jstring)env->CallObjectMethod(method, gGetMethodNameMethod);
      }
      const char* methodCName = env->GetStringUTFChars(methodName, NULL);

      // If this is an inline method, then we are going to use a prefixed name
      // and the lookup will be done in this handle
      std::string nativeMethodCName;
#ifdef _WIN32
      HMODULE symHandle;
#else
      void* symHandle;
#endif
      if (env->CallBooleanMethod(method, gIsAnnotationPresentMethod,
                                 gInlineClass)) {
        nativeMethodCName.reserve(sizeof(gInlinePrefix) + strlen(methodCName));
        nativeMethodCName += gInlinePrefix;
        nativeMethodCName += methodCName;
        symHandle = thisHandle;
      } else {
        nativeMethodCName = methodCName;
        symHandle = libHandle;
      }
#ifdef _WIN32
      info->callback = getProc(symHandle, nativeMethodCName.c_str());
#else
      info->callback = dlsym(symHandle, nativeMethodCName.c_str());
#endif
      env->ReleaseStringUTFChars(methodName, methodCName);

      // Log for not found symbol
      /*if (!info->callback) {
          LOGW << "symbol " << nativeMethodCName << " not found, this might
      cause problems!";
      }*/

      // Generate ffi types for the parameters
      bool createCIF = info->variadic == kNotVariadic;
      jobjectArray parameterAnns = (jobjectArray)env->CallObjectMethod(
          method, gGetParameterAnnotationsMethod);
      jobjectArray parameterTypes =
          (jobjectArray)env->CallObjectMethod(method, gGetParameterTypesMethod);
      jsize nativeParameterCount = env->GetArrayLength(parameterTypes);
      parameterCount = nativeParameterCount + 2;
      parameterCTypes = new ffi_type* [parameterCount];
      if (!createCIF) {
        nativeParameterCount--;
      }
      ffi_type** nativeParameterCTypes = new ffi_type* [nativeParameterCount];
      parameterCTypes[0] = &ffi_type_pointer;  // JNIEnv*
      parameterCTypes[1] = &ffi_type_pointer;  // jclass/jobject
      for (jsize j = 2; j < parameterCount; j++) {
        jclass parameterType =
            (jclass)env->GetObjectArrayElement(parameterTypes, j - 2);
        parameterCTypes[j] = getFFIType(env, parameterType, false);
        if (createCIF || j < parameterCount - 1) {
          jobjectArray paramAnns =
              (jobjectArray)env->GetObjectArrayElement(parameterAnns, j - 2);
          jsize annCount = env->GetArrayLength(paramAnns);
          jboolean byValue = false;
#if !__NATJ_HAS_NATIVE_SIZED_TYPES__
          for (jsize k = 0; k < annCount && !byValue; k++) {
#else
          NativeSizedType nativeSized = kNo;
          for (jsize k = 0; k < annCount && !byValue && nativeSized == kNo;
               k++) {
#endif
            jobject paramAnn = env->GetObjectArrayElement(paramAnns, k);
            if (env->IsInstanceOf(paramAnn, gByValueClass)) {
              byValue = true;
#if !__NATJ_IS_64BIT__
            } else if (env->IsInstanceOf(paramAnn, gNFloatClass)) {
              nativeSized = kNFloat;
            } else if (env->IsInstanceOf(paramAnn, gNUIntClass)) {
              nativeSized = kNUInt;
            } else if (env->IsInstanceOf(paramAnn, gNIntClass)) {
              nativeSized = kNInt;
#endif
#if !__NATJ_LONG_TYPE_IS_64BIT__
            } else if (env->IsInstanceOf(paramAnn, gNLongClass)) {
              nativeSized = kNLong;
            } else if (env->IsInstanceOf(paramAnn, gNULongClass)) {
              nativeSized = kNULong;
#endif
#if !__NATJ_WCHART_TYPE_IS_32BIT__
            } else if (env->IsInstanceOf(paramAnn, gWCharTClass)) {
              nativeSized = kWCharT;
#endif
            }
          }

#if !__NATJ_HAS_NATIVE_SIZED_TYPES__
          nativeParameterCTypes[j - 2] =
              getFFIType(env, parameterType, byValue);
#else
          nativeParameterCTypes[j - 2] =
              getFFIType(env, parameterType, byValue, false, nativeSized);
#endif
        }
      }

      // Prepare ffi_cif for the c function call
      if (createCIF) {
        ffi_prep_cif(&info->cif, FFI_DEFAULT_ABI, nativeParameterCount,
                     nativeReturnCType, nativeParameterCTypes);
      } else {
        info->cif.arg_types = nativeParameterCTypes;
        info->cif.rtype = nativeReturnCType;
        info->cif.abi = FFI_DEFAULT_ABI;
        info->cif.nargs = nativeParameterCount;
      }

      // Set the callback handler
      handler = javaToNativeCallHandler;
    } else if ((fieldAnn = env->CallObjectMethod(method, gGetAnnotationMethod,
                                                 gCVariableClass)) &&
               !env->IsSameObject(fieldAnn, NULL)) {
      // Handle variable
      ToNativeVariableInfo* info = new ToNativeVariableInfo;
      userinfo = info;

      // We will cache later
      info->cached = false;

      // We will generate cache from this
      info->method = env->NewGlobalRef(method);

      // Store whether it is a getter
      info->isGetter =
          env->CallBooleanMethod(fieldAnn, gGetCVariableIsGetterMethod);

      // Store the pointer of the variable
      jstring variableName =
          (jstring)env->CallObjectMethod(fieldAnn, gGetCVariableNameMethod);
      if (env->GetStringUTFLength(variableName) == 0) {
        variableName =
            (jstring)env->CallObjectMethod(method, gGetMethodNameMethod);
      }
      const char* variableCName = env->GetStringUTFChars(variableName, NULL);
#ifdef _WIN32
      info->pointer = getProc(libHandle, variableCName);
#else
      info->pointer = dlsym(libHandle, variableCName);
#endif

      env->ReleaseStringUTFChars(variableName, variableCName);

      // Compute and store the type of the variable
      jboolean byValue;
#if __NATJ_HAS_NATIVE_SIZED_TYPES__
      NativeSizedType nativeSized;
#endif
      jclass elementType;
      if (info->isGetter) {
        elementType =
            (jclass)env->CallObjectMethod(method, gGetReturnTypeMethod);
        returnCType = getFFIType(env, elementType, false);
        byValue = env->CallBooleanMethod(method, gIsAnnotationPresentMethod,
                                         gByValueClass);
#if __NATJ_HAS_NATIVE_SIZED_TYPES__
        nativeSized = kNo;
        if (!byValue) {
          if (false) {}
#if !__NATJ_IS_64BIT__
          else if (env->CallBooleanMethod(method, gIsAnnotationPresentMethod,
                                          gNFloatClass)) {
            nativeSized = kNFloat;
          } else if (env->CallBooleanMethod(method, gIsAnnotationPresentMethod,
                                            gNUIntClass)) {
            nativeSized = kNUInt;
          } else if (env->CallBooleanMethod(method, gIsAnnotationPresentMethod,
                                            gNIntClass)) {
            nativeSized = kNInt;
          }
#endif
#if !__NATJ_LONG_TYPE_IS_64BIT__
          else if (env->CallBooleanMethod(method, gIsAnnotationPresentMethod,
                                          gNLongClass)) {
            nativeSized = kNLong;
          } else if (env->CallBooleanMethod(method, gIsAnnotationPresentMethod,
                                            gNULongClass)) {
            nativeSized = kNULong;
          }
#endif
#if !__NATJ_WCHART_TYPE_IS_32BIT__
          else if (env->CallBooleanMethod(method, gIsAnnotationPresentMethod,
                                          gWCharTClass)) {
            nativeSized = kWCharT;
          }
#endif
        }
#endif
        parameterCTypes = new ffi_type* [2];
        parameterCount = 2;
      } else {
        jobjectArray parameterTypes = (jobjectArray)env->CallObjectMethod(
            method, gGetParameterTypesMethod);
        elementType = (jclass)env->GetObjectArrayElement(parameterTypes, 0);
        jobjectArray paramsAnns = (jobjectArray)env->CallObjectMethod(
            method, gGetParameterAnnotationsMethod);
        jobjectArray paramAnns =
            (jobjectArray)env->GetObjectArrayElement(paramsAnns, 0);
        jsize annCount = env->GetArrayLength(paramAnns);
        byValue = false;
#if !__NATJ_HAS_NATIVE_SIZED_TYPES__
        for (jsize j = 0; j < annCount && !byValue; j++) {
#else
        nativeSized = kNo;
        for (jsize j = 0; j < annCount && !byValue && nativeSized == kNo; j++) {
#endif
          jobject paramAnn = env->GetObjectArrayElement(paramAnns, j);
          if (env->IsInstanceOf(paramAnn, gByValueClass)) {
            byValue = true;
#if !__NATJ_IS_64BIT__
          } else if (env->IsInstanceOf(paramAnn, gNFloatClass)) {
            nativeSized = kNFloat;
          } else if (env->IsInstanceOf(paramAnn, gNUIntClass)) {
            nativeSized = kNUInt;
          } else if (env->IsInstanceOf(paramAnn, gNIntClass)) {
            nativeSized = kNInt;
#endif
#if !__NATJ_LONG_TYPE_IS_64BIT__
          } else if (env->IsInstanceOf(paramAnn, gNLongClass)) {
              nativeSized = kNLong;
          } else if (env->IsInstanceOf(paramAnn, gNULongClass)) {
              nativeSized = kNULong;
#endif
#if !__NATJ_WCHART_TYPE_IS_32BIT__
          } else if (env->IsInstanceOf(paramAnn, gWCharTClass)) {
              nativeSized = kWCharT;
#endif
          }
        }
        returnCType = &ffi_type_void;
        parameterCTypes = new ffi_type* [3];
        parameterCount = 3;
        parameterCTypes[2] = getFFIType(env, elementType, false);
      }
#if !__NATJ_HAS_NATIVE_SIZED_TYPES__
      info->fieldType = getFFIType(env, elementType, byValue);
#else
      info->fieldType =
          getFFIType(env, elementType, byValue, false, nativeSized);
#endif
      parameterCTypes[0] = &ffi_type_pointer;  // JNIEnv*
      parameterCTypes[1] = &ffi_type_pointer;  // jclass

      // Set the callback handler
      handler = javaToNativeVariableHandler;
    } else {
      env->PopLocalFrame(NULL);
      continue;
    }

    // Create the closure
    ffi_cif* cif = new ffi_cif;
    ffi_closure* closure =
        (ffi_closure*)ffi_closure_alloc(sizeof(ffi_closure), &code);
    ffi_prep_cif(cif, FFI_DEFAULT_ABI, parameterCount, returnCType,
                 parameterCTypes);
    ffi_prep_closure_loc(closure, cif, handler, userinfo, code);

    // Register method
    jstring methodName =
        (jstring)env->CallObjectMethod(method, gGetMethodNameMethod);
    const char* methodCName = env->GetStringUTFChars(methodName, NULL);
    jstring methodDesc = (jstring)env->CallStaticObjectMethod(
        gAsmTypeClass, gGetMethodDescriptorStaticMethod, method);
    const char* methodCDesc = env->GetStringUTFChars(methodDesc, NULL);
    JNINativeMethod nativeMethod;
    nativeMethod.name = methodCName;
    nativeMethod.signature = methodCDesc;
    nativeMethod.fnPtr = code;
    env->RegisterNatives(type, &nativeMethod, 1);
    env->ReleaseStringUTFChars(methodDesc, methodCDesc);
    env->ReleaseStringUTFChars(methodName, methodCName);

    env->PopLocalFrame(NULL);
  }

  // Cleanup
  env->DeleteLocalRef(methods);
}

void registerCClass(JNIEnv* env, jclass type) {
  bool isStructure =
      env->CallBooleanMethod(type, gIsAnnotationPresentMethod, gStructureClass);

  if (isStructure) {
    processStructureFields(env, type);
  }

  processStructureFunctions(env, type);
}
