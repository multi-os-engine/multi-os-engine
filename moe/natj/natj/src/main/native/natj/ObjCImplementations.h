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

#ifndef __NatJ__ObjCImplementations__
#define __NatJ__ObjCImplementations__

#include "ObjCRuntime.h"

/**
 * Static initializer implementation of hybrid objects
 *
 * Force initializes the respective Java class.
 */
void initialize_hybrid(id, SEL);

/**
 * Initializer implementation of proxy objects
 *
 * Saves the respective Java object and do the initialization.
 */
id init_java(id, SEL, JNIEnv*, jobject);

/**
 * Alloc implementation of inherited and hybrid objects
 *
 * Creates the inherited or hybrid object
 */
id alloc_objc(id, SEL);

/**
 * Alloc implementation of proxy objects
 *
 * Creates the proxy object.
 */
id alloc_java(id, SEL);

/**
 * Common retain implementation
 *
 * Calls the original implememtation and requires a reference upgrade, if doing
 * so is appropriate.
 */
id retain_common(id, SEL);

/**
 * Common retainWeakReference implementation
 *
 * Calls the original implememtation and requires a reference upgrade, if doing
 * so is appropriate.
 */
BOOL retainWeakReference_common(id, SEL);

/**
 * Common release implementation
 *
 * Calls the original implememtation and requires a reference downgrade, if
 * doing so is appropriate.
 */
void release_common(id, SEL);

#endif /* defined(__NatJ__ObjCImplementations__) */
