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

#ifndef __NatJ__CHandlers__
#define __NatJ__CHandlers__

#include "CRuntime.h"

/**
 * @struct ToNativeCallInfo
 * @brief Contains every information needed for calling native c functions.
 */
struct ToNativeCallInfo {
  /** The method we will build construction infos for */
  jobject method;

  /** Set to false after the caching is done */
  bool cached;

  /** The built construction infos for the complex arguments */
  jobject* paramInfos;

  /** The built construction info for complex return value */
  jobject returnInfo;

  /** The c callback to call */
  void* callback;

  /** The ffi_cif needed for the native call */
  ffi_cif cif;

  /** Info needed for variadic methods */
  int8_t variadic;

#ifdef __APPLE__
  /** Contains indexes of out arguments */
  std::vector<size_t> outObjectReferences;
#endif
};

/**
 * @struct ToJavaCallbackInfo
 * @brief Contains every information needed for calling Java functions as a
 * callback.
 */
struct ToJavaCallbackInfo {
  /** The method we will build construction infos for */
  jobject method;

  /** Java class object used for static calls */
  jclass clazz;

  /** Whether the call is static or not */
  bool isStatic;

  /** Java object used for non-static calls */
  jobject instance;

  /** Identifies whom we are going to call */
  jmethodID methodId;

  /** Set to false after the caching is done */
  bool cached;

  /** The built construction infos for the complex arguments */
  jobject* paramInfos;

  /** The built construction info for complex return value */
  jobject returnInfo;

  /** The jni call function to call */
  void* callback;

  /** The ffi_cif needed for the native call */
  ffi_cif cif;
};

/**
 * @struct ToNativeFieldInfo
 * @brief Contains every information needed for getting or setting native fields
 * from java.
 */
struct ToNativeFieldInfo {
  /** Whether this is a getter for the field or not */
  bool isGetter;

  /** Whether the field is a constant array type or not */
  bool isConstantArrayField;

  /** The method we will build construction infos for */
  jobject method;

  /** Set to false after the caching is done */
  bool cached;

  /** The built construction infos for the complex arguments */
  jobject* paramInfos;

  /** The built construction info for complex return value */
  jobject returnInfo;

  /** The offset of the field */
  size_t offset;

  /** The native type of the field */
  ffi_type* fieldType;
};

/**
 * @struct ToNativeVariableInfo
 * @brief Contains every information needed for getting or setting native
 * variable from java.
 */
struct ToNativeVariableInfo {
  /** Whether this is a getter for the field or not */
  bool isGetter;

  /** The method we will build construction infos for */
  jobject method;

  /** Set to false after the caching is done */
  bool cached;

  /** The built construction infos for the complex arguments */
  jobject* paramInfos;

  /** The built construction info for complex return value */
  jobject returnInfo;

  /** The pointer of the variable */
  void* pointer;

  /** The native type of the field */
  ffi_type* fieldType;
};

/**
 * Call handler for native c function calls
 *
 * If construction infos are not yet built in the info, then this will do the
 * building. Converts the Java values to native values, then does the calling
 * itself and converts the return value back to java.
 *
 * @param cif JNIEnv pointer for the current thread
 * @param result Out argument pointing to the resulted value
 * @param args Pointer array contains the argument values
 * @param user The user data pointing to a ToNativeCallInfo
 */
void javaToNativeCallHandler(ffi_cif* cif, void* result, void** args,
                             void* user);

/**
 * Call handler for Java method calls
 *
 * If construction infos are not yet built in the info, then this will do the
 * building. Converts the native values to Java values, then does the calling
 * itself and converts the return value back to native.
 *
 * @param cif JNIEnv pointer for the current thread
 * @param result Out argument pointing to the resulted value
 * @param args Pointer array contains the argument values
 * @param user The user data pointing to a ToJavaCallbackInfo
 */
void nativeToJavaCallbackHandler(ffi_cif* cif, void* result, void** args,
                                 void* user);

/**
 * Call handler for native field getters and setters
 *
 * If construction infos are not yet built in the info, then this will do the
 * building. Converts the Java values to native values, then does the storing
 * or loading itself and converts the return value back to java, if there is
 * any.
 *
 * @param cif JNIEnv pointer for the current thread
 * @param result Out argument pointing to the resulted value
 * @param args Pointer array contains the argument values
 * @param user The user data pointing to a ToJavaCallbackInfo
 */
void javaToNativeFieldHandler(ffi_cif* cif, void* result, void** args,
                              void* user);

/**
 * Call handler for native variable getters and setters
 *
 * If construction infos are not yet built in the info, then this will do the
 * building. Converts the Java values to native values, then does the storing
 * or loading itself and converts the return value back to java, if there is
 * any.
 *
 * @param cif JNIEnv pointer for the current thread
 * @param result Out argument pointing to the resulted value
 * @param args Pointer array contains the argument values
 * @param user The user data pointing to a ToNativeVariableInfo
 */
void javaToNativeVariableHandler(ffi_cif* cif, void* result, void** args,
                                 void* user);

#endif /* defined(__NatJ__CHandlers__) */
