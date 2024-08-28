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

#ifndef NatJ_CRuntime_h
#define NatJ_CRuntime_h

#include "NatJ.h"

/**
 * Handles C startup
 *
 * If this rintume is not responsible for the given class nothing will happen
 * and false will be returned.
 */
extern bool handleCStartup(JNIEnv*, jclass);

/**
 * Returns the C runtime instance
 */
extern jobject getCRuntime();

extern "C" {
/**
 * Initializes the CRuntime, looks up Java classes and methods.
 *
 * Also documented in CRuntime.java
 *
 * @param env JNIEnv pointer for the current thread
 * @param clazz Java class of CRuntime, used for nothing
 * @param instance CRuntime singleton object
 */
JNIEXPORT void JNICALL
    Java_org_moe_natj_c_CRuntime_initialize(JNIEnv* env, jclass clazz,
                                                jobject instance);

/**
 * If it is a structure then process every fields at first.
 * If it has any c functions, then they will be processed and registered with
 * JNI.
 *
 * Also documented in CRuntime.java
 *
 * @param env JNIEnv pointer for the current thread
 * @param clazz Java class of CRuntime, used for nothing
 * @param type The Java type we want to process
 */
JNIEXPORT void JNICALL
    Java_org_moe_natj_c_CRuntime_registerClass(JNIEnv* env, jclass clazz,
                                                   jclass type);

/**
 * Constructs a Java string from a c string.
 *
 * Also documented in CRuntime.java
 *
 * @param env JNIEnv pointer for the current thread
 * @param clazz Java class of CRuntime, used for nothing
 * @param string The c string
 * @return The Java string
 */
JNIEXPORT jstring JNICALL
    Java_org_moe_natj_c_CRuntime_createJavaString(JNIEnv* env, jclass clazz,
                                                      jlong string);

/**
 * Constructs a c string from a Java string.
 *
 * Also documented in CRuntime.java
 *
 * @param env JNIEnv pointer for the current thread
 * @param clazz Java class of CRuntime, used for nothing
 * @param string The Java string
 * @return The native string
 */
JNIEXPORT jlong JNICALL
    Java_org_moe_natj_c_CRuntime_createNativeString(JNIEnv* env,
                                                        jclass clazz,
                                                        jstring string);

/**
 * JNI method for using c malloc function from java.
 *
 * Also documented in CRuntime.java
 *
 * @param env JNIEnv pointer for the current thread
 * @param clazz Java class of CRuntime, used for nothing
 * @param size the size to allocate
 * @return The pointer
 */
JNIEXPORT jlong JNICALL Java_org_moe_natj_c_CRuntime_malloc(JNIEnv* env,
                                                                jclass clazz,
                                                                jlong size);

/**
 * JNI method for using c free function from java.
 *
 * Also documented in CRuntime.java
 *
 * @param env JNIEnv pointer for the current thread
 * @param clazz Java class of CRuntime, used for nothing
 * @param ptr The memory space to release
 */
JNIEXPORT void JNICALL
    Java_org_moe_natj_c_CRuntime_free(JNIEnv* env, jclass clazz, jlong ptr);

/**
 * Constructs a native string array from a Java string array.
 *
 * The c string array will be constructed into one continuous memory block:
 * @verbatim <ptr1>|<ptr2>|...|<first char of first string>|<second char of
 * first string>|...|<first char of second string>|... @endverbatim
 * Because of this we can release every c string array we created by doing so
 * with only one free call.
 *
 * Also documented in CRuntime.java
 *
 * @param env JNIEnv pointer for the current thread
 * @param clazz Java class of CRuntime, used for nothing
 * @param array Java string array we want to convert
 * @return The native string array
 */
JNIEXPORT jlong JNICALL
    Java_org_moe_natj_c_CRuntime_createNativeStringArray(
        JNIEnv* env, jclass clazz, jobjectArray array);

/**
 * Allocate one continuous memory block with sufficient size for containing @a
 * count instances of @a type.
 *
 * Also documented in CRuntime.java
 *
 * @param env JNIEnv pointer for the current thread
 * @param clazz Java class of CRuntime, used for nothing
 * @param type Java class of native object
 * @param count Count of native object
 * @return The pointer of the newly allocated space
 */
JNIEXPORT jlong JNICALL
    Java_org_moe_natj_c_CRuntime_allocNativeObject(JNIEnv* env,
                                                       jclass clazz,
                                                       jclass type, jint count);

/**
 * Returns the native size of a NativeObject.
 *
 * Also documented in CRuntime.java
 *
 * @param env JNIEnv pointer for the current thread
 * @param clazz Java class of CRuntime, used for nothing
 * @param type The NativeObject we want to get the size of
 * @return The size of the NativeObject
 */
JNIEXPORT jlong JNICALL
    Java_org_moe_natj_c_CRuntime_sizeOfNativeObject(JNIEnv* env,
                                                        jclass clazz,
                                                        jclass type);

/**
 * Copies one instance of @a type from @a src to @a dst.
 *
 * Also documented in CRuntime.java
 *
 * @param env JNIEnv pointer for the current thread
 * @param clazz Java class of CRuntime, used for nothing
 * @param type The type of the native object
 * @param dst The destination memory space of the copy
 * @param src The source memory space of the copy
 */
JNIEXPORT void JNICALL
    Java_org_moe_natj_c_CRuntime_copyNativeObject(JNIEnv* env, jclass clazz,
                                                      jclass type, jlong dst,
                                                      jlong src);

/**
 * Copies the native content of the NativeObject array to a new memory space.
 *
 * Also documented in CRuntime.java
 *
 * @param env JNIEnv pointer for the current thread
 * @param clazz Java class of CRuntime, used for nothing
 * @param array The array we want to copy
 * @return The pointer of the new native array
 */
JNIEXPORT jlong JNICALL
    Java_org_moe_natj_c_CRuntime_copyNativeObjectArray(JNIEnv* env,
                                                           jclass clazz,
                                                           jobjectArray array);

/**
 * Returns the pointer size for the actual architecture.
 *
 * Also documented in CRuntime.java
 *
 * @param env JNIEnv pointer for the current thread
 * @param clazz Java class of CRuntime, used for nothing
 * @return The pointer size
 */
JNIEXPORT jint JNICALL
    Java_org_moe_natj_c_CRuntime_sizeOfPointer(JNIEnv* env, jclass clazz);

/**
 * Returns the long size for the actual architecture.
 *
 * Also documented in CRuntime.java
 *
 * @param env JNIEnv pointer for the current thread
 * @param clazz Java class of CRuntime, used for nothing
 * @return The long size
 */
JNIEXPORT jint JNICALL
    Java_org_moe_natj_c_CRuntime_sizeOfLong(JNIEnv* env, jclass clazz);

/**
 * Returns the wchar_t size for the actual architecture.
 *
 * Also documented in CRuntime.java
 *
 * @param env JNIEnv pointer for the current thread
 * @param clazz Java class of CRuntime, used for nothing
 * @return The wchar_t size
 */
JNIEXPORT jint JNICALL
    Java_org_moe_natj_c_CRuntime_sizeOfWCharT(JNIEnv* env, jclass clazz);

/**
 * Allocates space for @a count pointer
 *
 * Also documented in CRuntime.java
 *
 * @param env JNIEnv pointer for the current thread
 * @param clazz Java class of CRuntime, used for nothing
 * @param count The length of the array we want to create
 * @return The pointer of the allocated space
 */
JNIEXPORT jlong JNICALL
    Java_org_moe_natj_c_CRuntime_allocPointer(JNIEnv* env, jclass clazz,
                                                  jint count);

/**
 * Copies the native content of the @a array to @a dst.
 *
 * Also documented in CRuntime.java
 *
 * @param env JNIEnv pointer for the current thread
 * @param clazz Java class of CRuntime, used for nothing
 * @param dst Where we want to copy
 * @param array The array we want to copy
 */
JNIEXPORT void JNICALL
    Java_org_moe_natj_c_CRuntime_copyPointerArray(JNIEnv* env, jclass clazz,
                                                      jlong dst,
                                                      jlongArray array);

/**
 * Loads a pointer from @a ptr with index @a idx.
 *
 * Also documented in CRuntime.java
 *
 * @param env JNIEnv pointer for the current thread
 * @param clazz Java class of CRuntime, used for nothing
 * @param ptr The pointer from where we want to load
 * @param idx The index we want to offset with
 * @return The loaded pointer
 */
JNIEXPORT jlong JNICALL
    Java_org_moe_natj_c_CRuntime_loadPointer(JNIEnv* env, jclass clazz,
                                                 jlong ptr, jint idx);

/**
 * Stores @a value to @a ptr with index @a idx.
 *
 * Also documented in CRuntime.java
 *
 * @param env JNIEnv pointer for the current thread
 * @param clazz Java class of CRuntime, used for nothing
 * @param ptr The pointer to where we want to store
 * @param idx The index we want to offset with
 * @param value The pointer we want to store
 */
JNIEXPORT void JNICALL
    Java_org_moe_natj_c_CRuntime_storePointer(JNIEnv* env, jclass clazz,
                                                  jlong ptr, jint idx,
                                                  jlong value);

/**
 * Construct a native callback from a Java method.
 *
 * Also documented in CRuntime.java
 *
 * @param env JNIEnv pointer for the current thread
 * @param clazz Java class of CRuntime, used for nothing
 * @param instance The Java instance we want to create native callback for
 * @param method The Java method we want to create native callback from
 * @param extra The out parameter used for extra
 * @return The native callbck
 */
JNIEXPORT jlong JNICALL Java_org_moe_natj_c_CRuntime_allocNativeCallback(
    JNIEnv* env, jclass clazz, jobject instance, jobject method,
    jlongArray extra);

/**
 * Releases a native callback specified by it's extra.
 *
 * Works only with callbacks we create with
 * Java_org_moe_natj_c_CRuntime_allocNativeCallback().
 *
 * Also documented in CRuntime.java
 *
 * @param env JNIEnv pointer for the current thread
 * @param clazz Java class of CRuntime, used for nothing
 * @param extra Extra information needed for the callback
 */
JNIEXPORT void JNICALL
    Java_org_moe_natj_c_CRuntime_deallocNativeCallback(JNIEnv* env,
                                                           jclass clazz,
                                                           jlong extra);

/**
 * Returns a Java instance from a given callback specified by it's extra.
 *
 * Works only with callbacks we create with
 * Java_org_moe_natj_c_CRuntime_allocNativeCallback().
 *
 * Also documented in CRuntime.java
 *
 * @param env JNIEnv pointer for the current thread
 * @param clazz Java class of CRuntime, used for nothing
 * @param extra Extra info pointer
 * @return The Java instance
 */
JNIEXPORT jobject JNICALL
    Java_org_moe_natj_c_CRuntime_createJavaCallback(JNIEnv* env,
                                                        jclass clazz,
                                                        jlong extra);

/**
 * Bride for native memset
 *
 * Also documented in CRuntime.java
 *
 * @param env JNIEnv pointer for the current thread
 * @param clazz Java class of CRuntime, used for nothing
 * @param dst The pointer we want to do memset on
 * @param idx The offset of the memsetting
 * @param length The length of the memsetting
 * @param vale The value by we want to overwrite
 * @return The Java instance
 */
JNIEXPORT void JNICALL
    Java_org_moe_natj_c_CRuntime_memset(JNIEnv* env, jclass clazz,
                                            jlong dst, jint idx, jint length,
                                            jbyte value);

/**
 * Bride for native memset
 *
 * Also documented in CRuntime.java
 *
 * @param env JNIEnv pointer for the current thread
 * @param clazz Java class of CRuntime, used for nothing
 * @param dst the pointer to copy to
 * @param src the pointer to copy from
 * @param length nember of bytes to copy
 */
JNIEXPORT void JNICALL
    Java_org_moe_natj_c_CRuntime_memcpy(JNIEnv* env, jclass clazz,
                                            jlong dst, jlong src, jint length);

/**
 * Macros for declaring accessor CRuntime JNI methods for primitive types
 */
#define PRIMITIVE_ACCESS(name, type)                                         \
  JNIEXPORT jlong JNICALL                                                    \
      Java_org_moe_natj_c_CRuntime_alloc##name(JNIEnv*, jclass, jint);   \
  JNIEXPORT void JNICALL Java_org_moe_natj_c_CRuntime_copy##name##Array( \
      JNIEnv*, jclass, jlong, jint, type##Array, jint, jint);                \
  JNIEXPORT void JNICALL                                                     \
      Java_org_moe_natj_c_CRuntime_copyNative##name##Array(              \
          JNIEnv*, jclass, jlong, jint, jlong, jint, jint);                  \
  JNIEXPORT void JNICALL                                                     \
      Java_org_moe_natj_c_CRuntime_copyFromNative##name##Array(   \
          JNIEnv* env, jclass clazz, type##Array dst, jint startOffset,      \
          jlong array, jint buffOffset, jint length);                        \
  JNIEXPORT type JNICALL Java_org_moe_natj_c_CRuntime_load##name(        \
      JNIEnv*, jclass, jlong, jint);                                         \
  JNIEXPORT void JNICALL Java_org_moe_natj_c_CRuntime_store##name(       \
      JNIEnv*, jclass, jlong, jint, type);                                   \
  JNIEXPORT type##Array JNICALL                                              \
      Java_org_moe_natj_c_CRuntime_create##name##Array(JNIEnv*, jclass,  \
                                                           jlong, jint);
#define BUFFER_PRIMITIVE_ACCESS(name)                            \
  JNIEXPORT jlong JNICALL                                        \
      Java_org_moe_natj_c_CRuntime_get##name##BufferPointer( \
          JNIEnv*, jclass, jobject);

/** Acecssors for jboolean */
PRIMITIVE_ACCESS(Boolean, jboolean)
// NIO Buffer for boolean is not present

/** Acecssors for jchar */
PRIMITIVE_ACCESS(Char, jchar)
BUFFER_PRIMITIVE_ACCESS(Char)

/** Acecssors for jbyte */
PRIMITIVE_ACCESS(Byte, jbyte)
BUFFER_PRIMITIVE_ACCESS(Byte)

/** Acecssors for jshort */
PRIMITIVE_ACCESS(Short, jshort)
BUFFER_PRIMITIVE_ACCESS(Short)

/** Acecssors for jint */
PRIMITIVE_ACCESS(Int, jint)
BUFFER_PRIMITIVE_ACCESS(Int)

/** Acecssors for jlong */
PRIMITIVE_ACCESS(Long, jlong)
BUFFER_PRIMITIVE_ACCESS(Long)

/** Acecssors for jfloat */
PRIMITIVE_ACCESS(Float, jfloat)
BUFFER_PRIMITIVE_ACCESS(Float)

/** Acecssors for jdouble */
PRIMITIVE_ACCESS(Double, jdouble)
BUFFER_PRIMITIVE_ACCESS(Double)

#undef PRIMITIVE_ACCESS
#undef BUFFER_PRIMITIVE_ACCESS
}

#endif
