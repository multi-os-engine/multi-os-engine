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

#include "CHandlers.h"

#ifdef __APPLE__
#import <Foundation/NSAutoreleasePool.h>
#endif

void javaToNativeCallHandler(ffi_cif* cif, void* result, void** args,
                             void* user) {
  // Get info
  ToNativeCallInfo* info = (ToNativeCallInfo*)user;

  // Get env and object
  JNIEnv* env = *(JNIEnv**)args[0];

  // Check for null callback
  if (!info->callback) {
    failCallbackWithMethod("C callback", env, info->method);
  }

  // Build cache if needed
  if (info->cached == false) {
    LOCK_POINTER(info);
    if (info->cached == false) {
#ifdef __APPLE__
      size_t ptrBuff[info->cif.nargs];
      size_t ptrCount = 0;
      buildInfos(env, info->method, false, &info->paramInfos, &info->returnInfo,
                 &info->variadic, ptrBuff, &ptrCount);
#else
      buildInfos(env, info->method, false, &info->paramInfos, &info->returnInfo,
                 &info->variadic);
#endif

      // Collect object out args
      PREPARE_FOR_OUT_ARG_HANDLING(ptrBuff, ptrCount, info->outObjectReferences,
                                   2);

      env->DeleteGlobalRef(info->method);
      info->method = NULL;

      info->cached = true;
    }
    UNLOCK_POINTER();
  }

  // Save pointer object references
  SAVE_FOR_OUT_ARG_HANDLING(info->outObjectReferences);

#ifdef __APPLE__
  NSAutoreleasePool* pool = [[NSAutoreleasePool alloc] init];
#endif

  // Finally do the calling
  void* value =
      ALIGN(alloca(info->cif.rtype->size + info->cif.rtype->alignment - 1),
            info->cif.rtype->alignment);
  HANDLE_NATIVE_EXCEPTION_ENTER(env);
  ValueConverter<kToNative>(
      {.env = env,
       .nvalues = info->cif.nargs,
       .types = info->cif.arg_types,
       .values = &args[2],
       .infos = info->paramInfos,
       .variadic = info->variadic,
       .promote = false,
       .runtime = getCRuntime()},
      [value, info](unsigned n, ffi_type** types, void** values) {
        if (info->variadic == kNotVariadic) {
          ffi_call(&info->cif, (void (*)())info->callback, value, values);
        } else {
          ffi_cif cif;
          ffi_prep_cif_var(&cif, info->cif.abi, info->cif.nargs, n,
                           info->cif.rtype, types);
          ffi_call(&cif, (void (*)())info->callback, value, values);
        }
      });
  HANDLE_NATIVE_EXCEPTION_EXIT(env);

  if (!NATIVE_EXC) {
    // Refresh pointer arguments
    REFRESH_FOR_OUT_ARG_HANDLING(info->outObjectReferences);

    if (&ffi_type_void != cif->rtype) {
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
    }
  }

#ifdef __APPLE__
  [pool release];
#endif

  THROW_NATIVE_EXCEPTION_TO_JAVA(env);
}

void nativeToJavaCallbackHandler(ffi_cif* cif, void* result, void** args,
                                 void* user) {
  // Get info
  ToJavaCallbackInfo* info = (ToJavaCallbackInfo*)user;

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
  if (info->isStatic) {
    jargs[1] = &info->clazz;
  } else {
    jargs[1] = &info->instance;
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
       .nvalues = cif->nargs,
       .types = cif->arg_types,
       .values = &args[0],
       .infos = info->paramInfos,
       .variadic = false,
       .promote = true,
       .runtime = nullptr,
       .preTypes = info->cif.arg_types,
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

  THROW_JAVA_EXCEPTION_TO_NATIVE(env);

  // Detach if needed
  DETACH_ENV();
}

void javaToNativeFieldHandler(ffi_cif* cif, void* result, void** args,
                              void* user) {
  // Get info
  ToNativeFieldInfo* info = (ToNativeFieldInfo*)user;

  // Get env and object
  JNIEnv* env = *(JNIEnv**)args[0];
  jobject object = *(jobject*)args[1];

  // Get the field pointer
  jobject pointer = env->CallObjectMethod(object, gGetNativeObjectPeerMethod);
  char* ptr = reinterpret_cast<char*>(
      env->CallLongMethod(pointer, gGetPointerPeerMethod));
  env->DeleteLocalRef(pointer);
  ptr = ptr + info->offset;

  // Build cache if needed
  if (info->cached == false) {
    LOCK_POINTER(info);
    if (info->cached == false) {
      buildInfos(env, info->method, false, &info->paramInfos,
                 &info->returnInfo);
      env->DeleteGlobalRef(info->method);
      info->method = NULL;
      info->cached = true;
    }
    UNLOCK_POINTER();
  }

  // Finally do the loading/storing
  if (info->isGetter) {
    if (info->isConstantArrayField) {
      ptr += (info->fieldType->size * *(int32_t*)args[2]);
    }
    ValueConverter<kToJava>(
        {.env = env,
         .nvalues = 1,
         .types = &info->fieldType,
         .values = (void**)&ptr,
         .infos = &info->returnInfo},
        [result, cif](unsigned n, ffi_type** types, void** values) {
          memcpy(result, values[0], cif->rtype->size);
        });
  } else {
    if (info->isConstantArrayField) {
      ptr += (info->fieldType->size * *(int32_t*)args[3]);
    }
    ValueConverter<kToNative>(
        {.env = env,
         .nvalues = 1,
         .types = &info->fieldType,
         .values = &args[2],
         .infos = info->paramInfos},
        [ptr, info](unsigned n, ffi_type** types, void** values) {
          memcpy(ptr, values[0], info->fieldType->size);
        });
  }
}

void javaToNativeVariableHandler(ffi_cif* cif, void* result, void** args,
                                 void* user) {
  // Get info
  ToNativeVariableInfo* info = (ToNativeVariableInfo*)user;

  // Get env and object
  JNIEnv* env = *(JNIEnv**)args[0];

  // Get the variable pointer
  void* ptr = info->pointer;

  // Check for null callback
  if (!ptr) {
    failCallbackWithMethod("C variable", env, info->method);
  }

  // Build cache if needed
  if (info->cached == false) {
    LOCK_POINTER(info);
    if (info->cached == false) {
      buildInfos(env, info->method, false, &info->paramInfos,
                 &info->returnInfo);
      env->DeleteGlobalRef(info->method);
      info->method = NULL;
      info->cached = true;
    }
    UNLOCK_POINTER();
  }

  // Finally do the loading/storing
  if (info->isGetter) {
    ValueConverter<kToJava>(
        {.env = env,
         .nvalues = 1,
         .types = &info->fieldType,
         .values = (void**)&ptr,
         .infos = &info->returnInfo},
        [result, cif](unsigned n, ffi_type** types, void** values) {
          memcpy(result, values[0], cif->rtype->size);
        });
  } else {
    ValueConverter<kToNative>(
        {.env = env,
         .nvalues = 1,
         .types = &info->fieldType,
         .values = &args[2],
         .infos = info->paramInfos},
        [ptr, info](unsigned n, ffi_type** types, void** values) {
          memcpy(ptr, values[0], info->fieldType->size);
        });
  }
}
