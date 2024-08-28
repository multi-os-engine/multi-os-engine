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

#ifndef __NatJ__ObjCHandlers__
#define __NatJ__ObjCHandlers__

#include "ObjCRuntime.h"

/**
 * @struct ToNativeMessageInfo
 * @brief Contains every information needed for sending messages to Objective-C
 * objects.
 */
struct ToNativeMessageInfo {
  /** The selector will be passed to the message handler */
  SEL sel;

  /** The callback of the message handler runtime function */
  void* callback;

  /** The callback of the message handler runtime function used for super calls
   */
  void* superCallback;

  /** Whether the call is static or not */
  bool isStatic;

  /** Whether the call is an initializer or not */
  bool isInit;

  /** Objective-C class object used for static calls */
  Class clazz;

  /** The method we will build construction infos for */
  jobject method;

  /** The declarer Java class of the method, used for determining whether the
   * call is super or not */
  jclass declarer;

  /** Set to false after the caching is done */
  bool cached;

  /** The built construction infos for the complex arguments */
  jobject* paramInfos;

  /** The built construction info for complex return value */
  jobject returnInfo;

  /** The ffi_cif needed for the native call */
  ffi_cif cif;

  /** Whether the call is for a category method */
  bool isCategory;

  /** Contains indexes of out arguments */
  std::vector<size_t> outObjectReferences;

  /** Info needed for variadic methods */
  int8_t variadic;

  /** Determined default runtime for the method */
  jobject runtime;
};

/**
 * @struct ToNativeProxyInfo
 * @brief Base class tath contains every information needed for sending messages to derived
 * objects like Objective-C blocks.
 */
struct ToNativeProxyInfo {
  /** The method we will build construction infos for */
  jobject method;

  /** Set to false after the caching is done */
  bool cached;

  /** The built construction infos for the complex arguments */
  jobject* paramInfos;

  /** The built construction info for complex return value */
  jobject returnInfo;

  /** The ffi_cif needed for the native call */
  ffi_cif cif;

  /** The number of bytes needed to allocate for value conversion **/
  size_t argsSize;

  /** The number of object references in the arguments lists **/
  size_t objArgNum;

  /** The type of return value **/
  ffi_type* returnType;

  /** Contains indexes of out arguments */
  std::vector<size_t> outObjectReferences;

  /** Info needed for variadic methods */
  int8_t variadic;

  /** Determined default runtime for the method */
  jobject runtime;
};

/**
 * @struct ToNativeProtocolProxyInfo
 * @brief Derived from ToNativeProxyInfo and contains every information needed for sending
 * messages to Objective-C protocol objects.
 */
struct ToNativeProtocolProxyInfo : ToNativeProxyInfo {
  /** The selector will be passed to the message handler */
  SEL sel;

  /** Whether the call is static or not */
  bool isStatic;

  /** Whether the call is an initializer or not */
  bool isInit;

  /** Objective-C class object used for static calls */
  Class clazz;
  
  /** The callback of the message handler runtime function */
  void* callback;
};

/**
 * @struct ToJavaBlockInfo
 * @brief Contains every information needed for sending messages to Java block
 * objects.
 */
struct ToJavaBlockInfo {
  /** The method we will build construction infos for */
  jobject method;

  /** Java class object used for static calls */
  jclass clazz;

  /** Whether the call is static or not */
  bool isStatic;

  /** Identifies the method we want to call */
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

  /** Whether the return value is returned in byvalue manner */
  bool byValue;
};

/**
 * @struct ToJavaMessageInfo
 * @brief Contains every information needed for sending messages to Java
 * objects.
 */
struct ToJavaMessageInfo {
  /** Extra information needed for constructing Java objects in case oh hybrid
   * methods */
  ObjCAllocInfo allocInfo;

  /** The jni call function to call */
  void* callback;

  /** Whether the call is static or not */
  bool isStatic;

  /** Whether the call is an initializer or not */
  bool isInit;

  /** Whether the call is of a hybrid method */
  bool isHybrid;

  /** Java class object used for static calls */
  jclass clazz;

  /** The method we will build construction infos for */
  jobject method;

  /** Identifies the method we want to call */
  jmethodID methodId;

  /** Set to false after the caching is done */
  bool cached;

  /** The built construction infos for the complex arguments */
  jobject* paramInfos;

  /** The built construction info for complex return value */
  jobject returnInfo;

  /** The ffi_cif needed for the native call */
  ffi_cif cif;

  /** Java class object used for static calls to selectors implemented by a proxy extension */
  jclass proxyExtensionClazz;
};

/**
 * @struct IvarInfo
 * @brief Contains every information needed for getting or setting Objective-C
 * instance variables.
 */
struct IvarInfo {
  /** The offset of the instance varaible we want to reach */
  size_t offset;

  /** Whether this is a getter or setter call */
  bool isGetter;

  /** The method we will build construction infos for */
  jobject method;

  /** Objective-C class object used for computing offsets */
  Class clazz;

  /** Name of the instance variable used for computing offsets */
  const char* name;

  /** Set to false after the caching is done */
  bool cached;

  /** The built construction infos for the complex arguments */
  jobject* paramInfos;

  /** The built construction info for complex return value */
  jobject returnInfo;

  /** The native type of the instance variable */
  ffi_type* ivarType;
};

/**
 * Call handler for native message sending
 *
 * If construction infos are not yet built in the info, then this will do the
 * building. If this is an initalizer call, then this handler will set the
 * extra information needed in thread local storage. If the target object's
 * class (or the target object itself in the case of static calls) and the
 * method declarer are not of the same object, then this handler will use the
 * super message sender runtime function. Converts the Java values to native
 * values, then does the message sending and converts the return value back
 * to java.
 *
 * @param cif FFI cif object of the closure
 * @param result Out argument pointing to the resulted value
 * @param args Pointer array containing the argument values
 * @param user The user data pointing to a ToNativeMessageInfo
 */
void javaToNativeMessageHandler(ffi_cif* cif, void* result, void** args,
                                void* user);

/**
 * Call handler for Objective-C proxy calling used for native blocks or protocols
 *
 * If construction infos are not yet built in the info, then this will do the
 * building. Converts the Java values to native values, then does the calling
 * itself and converts the return value back to java.
 *
 * This is not a closure function and it will be invoked directly from the
 * Objective-C runtime as a regular c++ function.
 *
 * @param env JNIEnv pointer for the current thread
 * @param data Pointer to a structure holding info
 * @param args Java array holding the incoming arguments
 * @param result Out argument pointing to the resulted value
 * @param args Pointer array containing the argument values
 * @param callback Callback to call
 * @param preNumber Number of incoming arguments already prepared by the caller
 * @param preTypes Type of the prepared arguments
 * @param prePtrs Pointer array of the prepared arguments
 */
void javaToNativeProxyHandler(JNIEnv* env, jlong data, jobjectArray args, void* result,
                              void* callback, unsigned preNumber, ffi_type** preTypes,
                              void** prePtrs);

/**
 * Call handler for Java block calling
 *
 * If construction infos are not yet built in the info, then this will do the
 * building. Converts the native values to Java values, then does the calling
 * itself and converts the return value back to native.
 *
 * @param cif FFI cif object of the closure
 * @param result Out argument pointing to the resulted value
 * @param args Pointer array containing the argument values
 * @param user The user data pointing to a ToJavaBlockInfo
 */
void nativeToJavaBlockHandler(ffi_cif* cif, void* result, void** args,
                              void* user);

/**
 * Call handler for sending messages to Java objects
 *
 * If construction infos are not yet built in the info, then this will do the
 * building. In the case of non-static calls this will get the javaInstance
 * instance variable and use it as the call target. In the case of static
 * calls this will use the clazz field as call target. Converts the native
 * values to Java values, then does the calling itself and converts the return
 * value back to native.
 *
 * @param cif FFI cif object of the closure
 * @param result Out argument pointing to the resulted value
 * @param args Pointer array containing the argument values
 * @param user The user data pointing to a ToJavaMessageInfo
 */
void nativeToJavaMessageHandler(ffi_cif* cif, void* result, void** args,
                                void* user);

/**
 * Call handler for native instance variable getters and setters
 *
 * If construction infos are not yet built in the info, then this will do the
 * building. Converts the Java values to native values, then does the storing
 * or loading itself and converts the return value back to java, if there is
 * any.
 *
 * @param cif FFI cif object of the closure
 * @param result Out argument pointing to the resulted value
 * @param args Pointer array containing the argument values
 * @param user The user data pointing to a IvarInfo
 */
void javaToNativeIvarHandler(ffi_cif* cif, void* result, void** args,
                             void* user);

#endif /* defined(__NatJ__ObjCHandlers__) */
