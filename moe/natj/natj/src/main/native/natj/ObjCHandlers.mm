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

#include "ObjCHandlers.h"
#include "ObjCInstanceContainer.h"

#import <objc/runtime.h>
#import <objc/message.h>

#import <Foundation/NSAutoreleasePool.h>

void javaToNativeMessageHandler(ffi_cif* cif, void* result, void** args,
                                void* user) {
  // Get info
  ToNativeMessageInfo* info = (ToNativeMessageInfo*)user;

  // Get env
  JNIEnv* env = *(JNIEnv**)args[0];

  // Determine whether we have to skip the first argument
  bool toSkipFirst = info->isCategory && !info->isStatic;

  // Build cache if needed
  if (info->cached == false) {
    LOCK_POINTER(info);
    if (info->cached == false) {
      size_t ptrBuff[info->cif.nargs - 2];
      size_t ptrCount = (toSkipFirst ? 1 : 0);
      buildInfos(env, info->method, false, &info->paramInfos, &info->returnInfo,
                 &info->variadic, ptrBuff, &ptrCount);
      jclass declarer = (jclass)env->CallObjectMethod(
          info->method, gGetMethodDeclaringClassMethod);
      info->declarer = (jclass)env->NewGlobalRef(declarer);
      env->DeleteLocalRef(declarer);

      // Collect object out args
      PREPARE_FOR_OUT_ARG_HANDLING(ptrBuff, ptrCount, info->outObjectReferences,
                                   (toSkipFirst ? 3 : 2));

      env->DeleteGlobalRef(info->method);
      info->method = NULL;

      info->cached = true;
    }
    UNLOCK_POINTER();
  }

  // Save pointer object references
  SAVE_FOR_OUT_ARG_HANDLING(info->outObjectReferences);

  // Get object/class
  if (toSkipFirst) {
    args++;
    ValueConverter<kToNative>(
        {.env = env,
         .nvalues = 1,
         .types = &cif->arg_types[2],
         .values = &args[1],
         .infos = &info->paramInfos[0]},
        [args](unsigned n, ffi_type** types,
               void** values) { *(jobject*)args[1] = *(jobject*)values[0]; });
  }
  jobject object = *(jobject*)args[1];

  // Set the selector
  *(SEL*)args[1] = info->sel;

  // Set the target object and the right message handler
  void* callback;
  id target;
  objc_super super;
  {
    if (info->isStatic) {
      target = info->clazz;
      callback = info->callback;
    } else {
      if (toSkipFirst) {
        target = (id)object;
      } else {
        target = reinterpret_cast<id>(
            env->CallLongMethod(object, gGetNativeObjectPeerPointerMethod));
      }
      Class nativeCls = [target class];
      NatJClassType nativeClsT = getNatJClassType(nativeCls);
      jclass objectClass = NULL;
      if (info->isCategory ||
          !(isProxyNatJClass(nativeClsT) || isInheritedNatJClass(nativeClsT) ||
            isHybridNatJClass(nativeClsT)) ||
          ((objectClass = env->GetObjectClass(object)) &&
           env->IsSameObject(objectClass, info->declarer))) {
        callback = info->callback;
      } else {
        Class parent;
        if (isBindingClass(info->clazz)) {
          parent = [getCustomInstanceContainer(target) objcAscendant];
          while (isHybridClass(parent)) {
            parent = class_getSuperclass(parent);
          }
        } else {
          parent = info->clazz;
        }
        super = {target, parent};
        target = (id)&super;
        callback = info->superCallback;
      }
      if (objectClass) {
        env->DeleteLocalRef(objectClass);
      }
    }
    *(id*)args[0] = target;
  }

  NSAutoreleasePool* pool = [[NSAutoreleasePool alloc] init];

  // Finally do the calling
  void* value =
      ALIGN(alloca(info->cif.rtype->size + info->cif.rtype->alignment - 1),
            info->cif.rtype->alignment);
  HANDLE_NATIVE_EXCEPTION_ENTER(env);
  ValueConverter<kToNative>(
      {.env = env,
       .nvalues = info->cif.nargs - 2,
       .types = &info->cif.arg_types[2],
       .values = &args[2],
       .infos = info->paramInfos + (toSkipFirst ? 1 : 0),
       .variadic = info->variadic,
       .runtime = getObjCRuntime(),
       .preTypes = &info->cif.arg_types[0],
       .preValues = &args[0],
       .preNumber = 2},
      [value, info, callback](unsigned n, ffi_type** types, void** values) {
        if (info->variadic == kNotVariadic) {
          ffi_call(&info->cif, (void (*)())callback, value, values);
        } else {
          ffi_cif cif;
          ffi_prep_cif_var(&cif, info->cif.abi, info->cif.nargs, n,
                           info->cif.rtype, types);
          ffi_call(&cif, (void (*)())callback, value, values);
        }
      });
  HANDLE_NATIVE_EXCEPTION_EXIT(env);

  if (!NATIVE_EXC) {
    // Refresh pointer arguments
    REFRESH_FOR_OUT_ARG_HANDLING(info->outObjectReferences);

    if (&ffi_type_void != cif->rtype) {
      // Set extra info for init call
      if (info->isInit) {
        setCurrentInitTargetOnCurrentThread(object);
      }

      // Convert native value to Java
      ValueConverter<kToJava>(
          {.env = env,
           .nvalues = 1,
           .types = &info->cif.rtype,
           .values = &value,
           .infos = &info->returnInfo},
          [result, cif](unsigned n, ffi_type** types, void** values) {
            memcpy(result, values[0], cif->rtype->size);
          });

      // Unset extra info
      if (info->isInit) {
        unsetCurrentInitTargetOnCurrentThread();
      }
    }
  }

  [pool release];

  THROW_NATIVE_EXCEPTION_TO_JAVA(env);
}

void nativeToJavaMessageHandler(ffi_cif* cif, void* result, void** args,
                                void* user) {
  // Get info
  ToJavaMessageInfo* info = (ToJavaMessageInfo*)user;

  // Get id
  id object = *(id*)args[0];

  // Get env for current thread
  ATTACH_ENV();

  // Create ptr array for the first three arguments
  void* jargs[3];

  // Set env
  jargs[0] = &env;

  // Build cache if needed
  if (info->cached == false) {
    LOCK_POINTER(info);
    if (info->cached == false) {
      info->methodId = env->FromReflectedMethod(info->method);
      // TODO: check if method ID is available.
      // This will only work properly if the method is added into the JNI config file, which
      // might be missing then the application will fail at `ffi_call` below with a
      // EXC_BAD_ACCESS (code=1, address=0x20) error because of the null pointer here.
      buildInfos(env, info->method, true, &info->paramInfos, &info->returnInfo);
      env->DeleteGlobalRef(info->method);
      info->method = NULL;
      info->cached = true;
    }
    UNLOCK_POINTER();
  }

  // Set the target object
  void* helpStack = alloca(info->isStatic ? 0 : sizeof(jobject));
  jobject localTarget = NULL;
  if (info->isStatic) {
    if (info->proxyExtensionClazz) {
      jargs[1] = &info->proxyExtensionClazz;
    } else {
      jargs[1] = &info->clazz;
    }
  } else {
    if (info->isHybrid) {
      jobject target;
      @synchronized(object) {
        ObjCInstanceContainer* container = getCustomInstanceContainer(object);
        target = [container javaReferenceWithEnv:env];
        if (target == NULL) {
          target = env->CallStaticObjectMethod(
              gNatJClass, gToJavaStaticMethod, reinterpret_cast<jlong>(object),
              info->allocInfo.constructionInfo);
        }
        localTarget = target;
      }
      *(jobject*)helpStack = target;
      jargs[1] = helpStack;
    } else {
      if (info->proxyExtensionClazz) {
        localTarget =
            [getCustomInstanceContainer(object) extensionJavaReferenceWithEnv:env];
      } else {
        localTarget =
            [getCustomInstanceContainer(object) javaReferenceWithEnv:env];
      }
      *(jobject*)helpStack = localTarget;
      jargs[1] = helpStack;
    }
  }

  // Set the method
  jargs[2] = &info->methodId;

  // Push local frame
  env->PushLocalFrame(100);

  // Finally do the calling
  void* value =
      ALIGN(alloca(info->cif.rtype->size + info->cif.rtype->alignment - 1),
            info->cif.rtype->alignment);
  ValueConverter<kToJava>(
      {.env = env,
       .nvalues = cif->nargs - 2,
       .types = &cif->arg_types[2],
       .values = &args[2],
       .infos = info->paramInfos,
       .promote = true,
       .preTypes = &info->cif.arg_types[0],
       .preValues = &jargs[0],
       .preNumber = 3},
      [value, info](unsigned n, ffi_type** types, void** values) {
        ffi_call(&info->cif, (void (*)())info->callback, value, values);
      });
  HANDLE_JAVA_EXCEPTION(env);

  if (!JAVA_EXC) {
    if (&ffi_type_void != cif->rtype) {
      // Set extra info for init call
      if (info->isInit) {
        setCurrentInitTargetOnCurrentThread(*(jobject*)jargs[1]);
      }

      // Convert native value to Java
      ValueConverter<kToNative>(
          {.env = env,
           .nvalues = 1,
           .types = &cif->rtype,
           .values = &value,
           .infos = &info->returnInfo},
          [result, cif](unsigned n, ffi_type** types, void** values) {
            memcpy(result, values[0], cif->rtype->size);
          });

      // Unset extra info
      if (info->isInit) {
        unsetCurrentInitTargetOnCurrentThread();
      }
    }
  }

  // Pop local frame
  env->PopLocalFrame(NULL);

  // Cleanup
  if (localTarget) {
    env->DeleteLocalRef(localTarget);
  }

  THROW_JAVA_EXCEPTION_TO_NATIVE(env);

  // Detach if needed
  DETACH_ENV();
}

void javaToNativeProxyHandler(JNIEnv* env, jlong data, jobjectArray args, void* result,
                              void* callback, unsigned preNumber, ffi_type** preTypes,
                              void** prePtrs) {
  ToNativeProxyInfo* info = reinterpret_cast<ToNativeProxyInfo*>(data);

  // Build cache if needed
  if (info->cached == false) {
    LOCK_POINTER(info);
    if (info->cached == false) {
      // Get variadic info
      jobject var = env->CallObjectMethod(info->method, gGetAnnotationMethod,
                                          gVariadicClass);
      if (env->IsSameObject(var, NULL)) {
        info->variadic = kNotVariadic;
      } else {
        info->variadic = env->CallByteMethod(var, gGetVariadicUnboxPolicyMethod);
        if (info->variadic == gRuntimeVariadicPolicyValue) {
          info->variadic = getDefaultVariadicUnboxPolicy();
        } else if (info->variadic == gUnboxVariadicPolicyValue) {
          info->variadic = kUnboxVariadic;
        } else {
          info->variadic = kBoxVariadic;
        }
        env->DeleteLocalRef(var);
      }

      // Generate ffi type for the method
      jboolean byValue = env->CallBooleanMethod(
          info->method, gIsAnnotationPresentMethod, gByValueClass);
      jclass returnType =
          (jclass)env->CallObjectMethod(info->method, gGetReturnTypeMethod);
#if !__NATJ_HAS_NATIVE_SIZED_TYPES__
      ffi_type* nativeReturnCType = getFFIType(env, returnType, byValue);
#else
      NativeSizedType nativeSized = kNo;
      if (!byValue) {
        if (false) {}
#if !__NATJ_IS_64BIT__
        else if (env->CallBooleanMethod(info->method, gIsAnnotationPresentMethod,
                                        gNFloatClass)) {
          nativeSized = kNFloat;
        } else if (env->CallBooleanMethod(
                       info->method, gIsAnnotationPresentMethod, gNUIntClass)) {
          nativeSized = kNUInt;
        } else if (env->CallBooleanMethod(
                       info->method, gIsAnnotationPresentMethod, gNIntClass)) {
          nativeSized = kNInt;
        }
#endif
#if !__NATJ_LONG_TYPE_IS_64BIT__
        else if (env->CallBooleanMethod(info->method, gIsAnnotationPresentMethod,
                                        gNLongClass)) {
            nativeSized = kNLong;
        } else if (env->CallBooleanMethod(info->method, gIsAnnotationPresentMethod,
                                          gNULongClass)) {
            nativeSized = kNULong;
        }
#endif
#if !__NATJ_WCHART_TYPE_IS_32BIT__
        else if (env->CallBooleanMethod(info->method, gIsAnnotationPresentMethod,
                                        gWCharTClass)) {
            nativeSized = kWCharT;
        }
#endif
      }
      ffi_type* nativeReturnCType =
          getFFIType(env, returnType, byValue, false, nativeSized);
#endif
      info->returnType = getFFIType(env, returnType, false);
      env->DeleteLocalRef(returnType);

      // Generate ffi types for the parameters
      bool createCIF = info->variadic == kNotVariadic;
      jobjectArray parameterAnns = (jobjectArray)env->CallObjectMethod(
          info->method, gGetParameterAnnotationsMethod);
      jobjectArray parameterTypes = (jobjectArray)env->CallObjectMethod(
          info->method, gGetParameterTypesMethod);
      jsize nativeParameterCount =
          env->GetArrayLength(parameterTypes) + preNumber - (createCIF ? 0 : 1);
      ffi_type** nativeParameterCTypes = new ffi_type* [nativeParameterCount];
      for (size_t i = 0; i < preNumber; i++) {
        nativeParameterCTypes[i] = preTypes[i];
      }
      for (jsize j = preNumber; j < nativeParameterCount; j++) {
        jclass parameterType =
            (jclass)env->GetObjectArrayElement(parameterTypes, j - preNumber);
        jobjectArray paramAnns =
            (jobjectArray)env->GetObjectArrayElement(parameterAnns, j - preNumber);
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
#if !__NATJ_HAS_NATIVE_SIZED_TYPES__
        nativeParameterCTypes[j] = getFFIType(env, parameterType, byValue);
#else
        nativeParameterCTypes[j] =
            getFFIType(env, parameterType, byValue, false, nativeSized);
#endif
        env->DeleteLocalRef(parameterType);
        env->DeleteLocalRef(paramAnns);
      }
      env->DeleteLocalRef(parameterAnns);
      env->DeleteLocalRef(parameterTypes);

      if (createCIF) {
        ffi_prep_cif(&info->cif, FFI_DEFAULT_ABI, nativeParameterCount,
                     nativeReturnCType, nativeParameterCTypes);
      } else {
        info->cif.arg_types = nativeParameterCTypes;
        info->cif.rtype = nativeReturnCType;
        info->cif.abi = FFI_DEFAULT_ABI;
        info->cif.nargs = nativeParameterCount;
      }

      size_t ptrBuff[info->cif.nargs - preNumber];
      size_t ptrCount = 0;
      buildInfos(env, info->method, false, &info->paramInfos, &info->returnInfo,
                 &info->variadic, ptrBuff, &ptrCount);

      // Collect object out args
      PREPARE_FOR_OUT_ARG_HANDLING(ptrBuff, ptrCount, info->outObjectReferences,
                                   0);

      for (size_t i = 0, j = preNumber, k = 0;
           j < info->cif.nargs && i < info->outObjectReferences.size(); j++) {
        if (j - preNumber == info->outObjectReferences[i]) {
          info->outObjectReferences[i] = k;
          i++;
        }
        if (info->cif.arg_types[j]->type == FFI_TYPE_POINTER ||
            info->cif.arg_types[j]->type == FFI_TYPE_STRUCT) {
          k++;
        }
      }

      env->DeleteGlobalRef(info->method);
      info->method = NULL;

      size_t jargsSize = 0;
      size_t jobjArgNum = 0;
      for (jsize j = preNumber; j < info->cif.nargs; j++) {
        ffi_type* argType = info->cif.arg_types[j];
#if !__NATJ_IS_64BIT__
        if (argType == &ffi_type_nint || argType == &ffi_type_nuint) {
          jargsSize += alignof(jlong) - (jargsSize % alignof(jlong));
          jargsSize += sizeof(jlong);
          continue;
        } else if (argType == &ffi_type_nfloat) {
          jargsSize += alignof(jdouble) - (jargsSize % alignof(jdouble));
          jargsSize += sizeof(jdouble);
          continue;
        }
#endif
#if !__NATJ_LONG_TYPE_IS_64BIT__
        if (argType == &ffi_type_nlong || argType == &ffi_type_nulong) {
          jargsSize += alignof(jlong) - (jargsSize % alignof(jlong));
          jargsSize += sizeof(jlong);
          continue;
        }
#endif
#if !__NATJ_WCHART_TYPE_IS_32BIT__
        if (argType == &ffi_type_wchart) {
          jargsSize += alignof(jint) - (jargsSize % alignof(jint));
          jargsSize += sizeof(jint);
          continue;
        }
#endif
        if (argType == &ffi_type_uint8) {
          jargsSize += alignof(jboolean) - (jargsSize % alignof(jboolean));
          jargsSize += sizeof(jboolean);
        } else if (argType == &ffi_type_sint8) {
          jargsSize += alignof(jbyte) - (jargsSize % alignof(jbyte));
          jargsSize += sizeof(jbyte);
        } else if (argType == &ffi_type_uint16) {
          jargsSize += alignof(jchar) - (jargsSize % alignof(jchar));
          jargsSize += sizeof(jchar);
        } else if (argType == &ffi_type_sint16) {
          jargsSize += alignof(jshort) - (jargsSize % alignof(jshort));
          jargsSize += sizeof(jshort);
        } else if (argType == &ffi_type_sint32) {
          jargsSize += alignof(jint) - (jargsSize % alignof(jint));
          jargsSize += sizeof(jint);
        } else if (argType == &ffi_type_sint64) {
          jargsSize += alignof(jlong) - (jargsSize % alignof(jlong));
          jargsSize += sizeof(jlong);
        } else if (argType == &ffi_type_float) {
          jargsSize += alignof(jfloat) - (jargsSize % alignof(jfloat));
          jargsSize += sizeof(jfloat);
        } else if (argType == &ffi_type_double) {
          jargsSize += alignof(jdouble) - (jargsSize % alignof(jdouble));
          jargsSize += sizeof(jdouble);
        } else {
          jargsSize += alignof(jobject) - (jargsSize % alignof(jobject));
          jargsSize += sizeof(jobject);
          jobjArgNum++;
        }
      }

      if (info->variadic != kNotVariadic) {
        jargsSize += alignof(jobject) - (jargsSize % alignof(jobject));
        jargsSize += sizeof(jobject);
        jobjArgNum++;
      }

      info->argsSize = jargsSize;
      info->objArgNum = jobjArgNum;

      info->cached = true;
    }
    UNLOCK_POINTER();
  }

  void* jargs = alloca(info->argsSize);
  uint8_t* jargsPtr = (uint8_t*)jargs;
  void** jargsArray = (void**)alloca(sizeof(void*) *
      (info->cif.nargs + (info->variadic == kNotVariadic ? 0 : 1)));
  for (size_t i = 0; i < preNumber; i++) {
    jargsArray[i] = prePtrs[i];
  }

  jobject* objRefs = (jobject*)alloca(sizeof(jobject) * info->objArgNum);
  size_t objRefIdx = 0;

  for (jsize j = preNumber; j < info->cif.nargs; j++) {
    ffi_type* argType = info->cif.arg_types[j];
    jobject parameter = env->GetObjectArrayElement(args, j - preNumber);
#if !__NATJ_IS_64BIT__
    if (argType == &ffi_type_nint || argType == &ffi_type_nuint) {
      jargsPtr += alignof(jlong) - ((uintptr_t)jargsPtr % alignof(jlong));
      jargsArray[j] = jargsPtr;
      *(jlong*)jargsPtr = env->CallLongMethod(parameter, gLongValueMethod);
      jargsPtr += sizeof(jlong);
      env->DeleteLocalRef(parameter);
      continue;
    } else if (argType == &ffi_type_nfloat) {
      jargsPtr += alignof(jdouble) - ((uintptr_t)jargsPtr % alignof(jdouble));
      jargsArray[j] = jargsPtr;
      *(jdouble*)jargsPtr =
          env->CallDoubleMethod(parameter, gDoubleValueMethod);
      jargsPtr += sizeof(jdouble);
      env->DeleteLocalRef(parameter);
      continue;
    }
#endif
#if !__NATJ_LONG_TYPE_IS_64BIT__
    if (argType == &ffi_type_nlong || argType == &ffi_type_nulong) {
      jargsPtr += alignof(jlong) - ((uintptr_t)jargsPtr % alignof(jlong));
      jargsArray[j] = jargsPtr;
      *(jlong*)jargsPtr = env->CallLongMethod(parameter, gLongValueMethod);
      jargsPtr += sizeof(jlong);
      env->DeleteLocalRef(parameter);
      continue;
    }
#endif
#if !__NATJ_WCHART_TYPE_IS_32BIT__
    if (argType == &ffi_type_wchart) {
      jargsPtr += alignof(jint) - ((uintptr_t)jargsPtr % alignof(jint));
      jargsArray[j] = jargsPtr;
      *(jint*)jargsPtr = env->CallIntMethod(parameter, gIntValueMethod);
      jargsPtr += sizeof(jint);
      env->DeleteLocalRef(parameter);
      continue;
    }
#endif
    if (argType == &ffi_type_uint8) {
      jargsPtr += alignof(jboolean) - ((uintptr_t)jargsPtr % alignof(jboolean));
      jargsArray[j] = jargsPtr;
      *(jboolean*)jargsPtr =
          env->CallBooleanMethod(parameter, gBooleanValueMethod);
      jargsPtr += sizeof(jboolean);
      env->DeleteLocalRef(parameter);
    } else if (argType == &ffi_type_sint8) {
      jargsPtr += alignof(jbyte) - ((uintptr_t)jargsPtr % alignof(jbyte));
      jargsArray[j] = jargsPtr;
      *(jbyte*)jargsPtr = env->CallByteMethod(parameter, gByteValueMethod);
      jargsPtr += sizeof(jbyte);
      env->DeleteLocalRef(parameter);
    } else if (argType == &ffi_type_uint16) {
      jargsPtr += alignof(jchar) - ((uintptr_t)jargsPtr % alignof(jchar));
      jargsArray[j] = jargsPtr;
      *(jchar*)jargsPtr = env->CallCharMethod(parameter, gCharValueMethod);
      jargsPtr += sizeof(jchar);
      env->DeleteLocalRef(parameter);
    } else if (argType == &ffi_type_sint16) {
      jargsPtr += alignof(jshort) - ((uintptr_t)jargsPtr % alignof(jshort));
      jargsArray[j] = jargsPtr;
      *(jshort*)jargsPtr = env->CallShortMethod(parameter, gShortValueMethod);
      jargsPtr += sizeof(jshort);
      env->DeleteLocalRef(parameter);
    } else if (argType == &ffi_type_sint32) {
      jargsPtr += alignof(jint) - ((uintptr_t)jargsPtr % alignof(jint));
      jargsArray[j] = jargsPtr;
      *(jint*)jargsPtr = env->CallIntMethod(parameter, gIntValueMethod);
      jargsPtr += sizeof(jint);
      env->DeleteLocalRef(parameter);
    } else if (argType == &ffi_type_sint64) {
      jargsPtr += alignof(jlong) - ((uintptr_t)jargsPtr % alignof(jlong));
      jargsArray[j] = jargsPtr;
      *(jlong*)jargsPtr = env->CallLongMethod(parameter, gLongValueMethod);
      jargsPtr += sizeof(jlong);
      env->DeleteLocalRef(parameter);
    } else if (argType == &ffi_type_float) {
      jargsPtr += alignof(jfloat) - ((uintptr_t)jargsPtr % alignof(jfloat));
      jargsArray[j] = jargsPtr;
      *(jfloat*)jargsPtr = env->CallFloatMethod(parameter, gFloatValueMethod);
      jargsPtr += sizeof(jfloat);
      env->DeleteLocalRef(parameter);
    } else if (argType == &ffi_type_double) {
      jargsPtr += alignof(jdouble) - ((uintptr_t)jargsPtr % alignof(jdouble));
      jargsArray[j] = jargsPtr;
      *(jdouble*)jargsPtr =
          env->CallDoubleMethod(parameter, gDoubleValueMethod);
      jargsPtr += sizeof(jdouble);
      env->DeleteLocalRef(parameter);
    } else {
      jargsPtr += alignof(jobject) - ((uintptr_t)jargsPtr % alignof(jobject));
      jargsArray[j] = jargsPtr;
      *(jobject*)jargsPtr = parameter;
      jargsPtr += sizeof(jobject);
      objRefs[objRefIdx++] = parameter;
    }
  }
  if (info->variadic != kNotVariadic) {
    jargsPtr += alignof(jobject) - ((uintptr_t)jargsPtr % alignof(jobject));
    jargsArray[info->cif.nargs] = jargsPtr;
    jobject parameter = env->GetObjectArrayElement(args, info->cif.nargs - 1);
    *(jobject*)jargsPtr = parameter;
    objRefs[objRefIdx++] = parameter;
  }

  NSAutoreleasePool* pool = [[NSAutoreleasePool alloc] init];

  // Finally do the calling
  void* value =
      ALIGN(alloca(info->cif.rtype->size + info->cif.rtype->alignment - 1),
            info->cif.rtype->alignment);
  HANDLE_NATIVE_EXCEPTION_ENTER(env);
  ValueConverter<kToNative>({.env = env,
                             .nvalues = info->cif.nargs - preNumber,
                             .types = &info->cif.arg_types[preNumber],
                             .values = &jargsArray[preNumber],
                             .infos = info->paramInfos,
                             .variadic = info->variadic,
                             .runtime = getObjCRuntime(),
                             .preTypes = &info->cif.arg_types[0],
                             .preValues = &jargsArray[0],
                             .preNumber = preNumber},
                            [value, info, callback](unsigned n, ffi_type** types, void** values) {
    if (info->variadic == kNotVariadic) {
      ffi_call(&info->cif, (void (*)())callback, value, values);
    } else {
      ffi_cif cif;
      ffi_prep_cif_var(&cif, info->cif.abi, info->cif.nargs, n, info->cif.rtype,
                       types);
      ffi_call(&cif, (void (*)())callback, value, values);
    }
  });
  HANDLE_NATIVE_EXCEPTION_EXIT(env);

  if (!NATIVE_EXC) {
    for (size_t i = 0; i < info->outObjectReferences.size(); i++) {
      jobject obj = objRefs[info->outObjectReferences[i]];
      if (obj) {
        env->CallVoidMethod(obj, gRefreshRetainListMethod);
      }
    }

    if (&ffi_type_void != info->cif.rtype) {
      // Convert native value to Java
      ValueConverter<kToJava>(
          {.env = env,
           .nvalues = 1,
           .types = &info->cif.rtype,
           .values = &value,
           .infos = &info->returnInfo},
          [result, info](unsigned n, ffi_type** types, void** values) {
            memcpy(result, values[0], info->returnType->size);
          });
    }
  }

  [pool release];

  while (objRefIdx--) {
    env->DeleteLocalRef(objRefs[objRefIdx]);
  }

  THROW_NATIVE_EXCEPTION_TO_JAVA(env);
}

void nativeToJavaBlockHandler(ffi_cif* cif, void* result, void** args,
                              void* user) {
  // Get info
  ToJavaBlockInfo* info = (ToJavaBlockInfo*)user;

  // Get peer
  id peer = *(id*)args[0];

  // Get env for current thread
  ATTACH_ENV();

  // Create ptr array for the first three arguments
  void* jargs[3];

  // Set env
  jargs[0] = &env;

  // Build cache if needed
  if (info->cached == false) {
    LOCK_POINTER(info);
    if (info->cached == false) {
      info->methodId = env->FromReflectedMethod(info->method);
      buildInfos(env, info->method, true, &info->paramInfos, &info->returnInfo);
      env->DeleteGlobalRef(info->method);
      info->method = NULL;
      info->cached = true;
    }
    UNLOCK_POINTER();
  }

  // Set the target object
  jobject target;
  jobject localTarget = NULL;
  if (info->isStatic) {
    target = info->clazz;
  } else {
    target = [getJavaBlockInstanceContainer(peer) javaReferenceWithEnv:env];
    localTarget = target;
  }
  jargs[1] = &target;

  // Set the method
  jargs[2] = &info->methodId;

  // Push local frame
  env->PushLocalFrame(100);

  // Finally do the calling
  void* value =
      ALIGN(alloca(info->cif.rtype->size + info->cif.rtype->alignment - 1),
            info->cif.rtype->alignment);
  ValueConverter<kToJava>(
      {.env = env,
       .nvalues = cif->nargs - 1,
       .types = &cif->arg_types[1],
       .values = &args[1],
       .infos = info->paramInfos,
       .promote = true,
       .preTypes = &info->cif.arg_types[0],
       .preValues = &jargs[0],
       .preNumber = 3},
      [value, info](unsigned n, ffi_type** types, void** values) {
        ffi_call(&info->cif, (void (*)())info->callback, value, values);
      });
  HANDLE_JAVA_EXCEPTION(env);

  if (!JAVA_EXC) {
    if (&ffi_type_void != cif->rtype) {
      // Convert native value to Java
      ValueConverter<kToNative>(
          {.env = env,
           .nvalues = 1,
           .types = &cif->rtype,
           .values = &value,
           .infos = &info->returnInfo},
          [result, cif](unsigned n, ffi_type** types, void** values) {
            memcpy(result, values[0], cif->rtype->size);
          });
    }
  }

  // Pop local frame
  env->PopLocalFrame(NULL);

  // Cleanup
  if (localTarget) {
    env->DeleteLocalRef(localTarget);
  }

  THROW_JAVA_EXCEPTION_TO_NATIVE(env);

  // Detach if needed
  DETACH_ENV();
}

void javaToNativeIvarHandler(ffi_cif* cif, void* result, void** args,
                             void* user) {
  // Get info
  IvarInfo* info = (IvarInfo*)user;

  // Get env and object
  JNIEnv* env = *(JNIEnv**)args[0];
  jobject object = *(jobject*)args[1];

  // Build cache if needed
  if (info->cached == false) {
    LOCK_POINTER(info);
    if (info->cached == false) {
      buildInfos(env, info->method, false, &info->paramInfos,
                 &info->returnInfo);

      // Get the ivar offset
      Ivar ivar = class_getInstanceVariable(info->clazz, info->name);
      info->offset = ivar_getOffset(ivar);

      free((void*)info->name);
      env->DeleteGlobalRef(info->method);
      info->method = NULL;

      info->cached = true;
    }
    UNLOCK_POINTER();
  }

  // Get the ivar pointer
  char* ptr;
  {
    jobject pointer = env->CallObjectMethod(object, gGetNativeObjectPeerMethod);
    ptr = reinterpret_cast<char*>(
        env->CallLongMethod(pointer, gGetPointerPeerMethod));
    env->DeleteLocalRef(pointer);
    ptr += info->offset;
  }

  // Finally do the loading/storing
  if (info->isGetter) {
    ValueConverter<kToJava>(
        {.env = env,
         .nvalues = 1,
         .types = &info->ivarType,
         .values = (void**)&ptr,
         .infos = &info->returnInfo},
        [result, cif](unsigned n, ffi_type** types, void** values) {
          memcpy(result, values[0], cif->rtype->size);
        });
  } else {
    ValueConverter<kToNative>(
        {.env = env,
         .nvalues = 1,
         .types = &info->ivarType,
         .values = &args[2],
         .infos = info->paramInfos},
        [ptr, info](unsigned n, ffi_type** types, void** values) {
          memcpy(ptr, values[0], info->ivarType->size);
        });
  }
}
