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

#import "ObjCInstanceContainer.h"
#import "ObjCRuntime.h"
#import "ObjCHandlers.h"

#import <Foundation/NSNotification.h>

/**
 * Private interface for inherited classes
 */
@interface _ObjCInheritedInstanceContainer : ObjCInstanceContainer

- (id)initWithEnv:(JNIEnv*)env javaReference:(jobject)object;

@end

/**
 * Private interface for proxy classes
 */
@interface _ObjCProxyInstanceContainer : ObjCInstanceContainer

- (id)initWithEnv:(JNIEnv*)env javaReference:(jobject)object extensionJavaReference:(jobject)extension;

@end

/**
 * Private interface for hybrid classes
 */
@interface _ObjCHybridInstanceContainer : ObjCInstanceContainer

- (id)initWithEnv:(JNIEnv*)env javaReference:(jobject)object;

@end

/**
 * Private interface for binding classes
 */
@interface _ObjCBindingInstanceContainer : ObjCInstanceContainer

- (id)initWithEnv:(JNIEnv*)env javaReference:(jobject)object;

@end

/**
 * Private interface for binding classes
 */
@interface _ObjCBlockInstanceContainer : ObjCInstanceContainer

- (id)initWithEnv:(JNIEnv*)env
    javaReference:(jobject)object
          closure:(ffi_closure*)closure;

@end

/**
 * The factory super class
 */
@implementation ObjCInstanceContainer

- (id)init {
  self = [super init];
  if (self) {
    _ownerRetainCount = 1;
  }
  return self;
}

+ (id)inheritedContainerWithEnv:(JNIEnv*)env javaReference:(jobject)object {
  return [
      [[_ObjCInheritedInstanceContainer alloc] initWithEnv:env
                                             javaReference:object] autorelease];
}

+ (id)proxyContainerWithEnv:(JNIEnv*)env javaReference:(jobject)object extensionJavaReference:(jobject)extension {
  return [[[_ObjCProxyInstanceContainer alloc] initWithEnv:env
                                             javaReference:object
                                             extensionJavaReference:extension] autorelease];
}

+ (id)hybridContainerWithEnv:(JNIEnv*)env javaReference:(jobject)object {
  return
      [[[_ObjCHybridInstanceContainer alloc] initWithEnv:env
                                           javaReference:object] autorelease];
}

+ (id)bindingContainerWithEnv:(JNIEnv*)env javaReference:(jobject)object {
  return
      [[[_ObjCBindingInstanceContainer alloc] initWithEnv:env
                                            javaReference:object] autorelease];
}

+ (id)blockContainerWithEnv:(JNIEnv*)env
              javaReference:(jobject)object
                    closure:(ffi_closure*)closure {
  return
      [[[_ObjCBlockInstanceContainer alloc] initWithEnv:env
                                          javaReference:object
                                                closure:closure] autorelease];
}

- (void)upgrade {
}

- (void)downgrade {
}

@end

/**
 * Private implementation for inherited classes
 */
@implementation _ObjCInheritedInstanceContainer {
  BOOL isStrong;
  uint64_t javaReference;
}

- (id)initWithEnv:(JNIEnv*)env javaReference:(jobject)object {
  self = [super init];
  if (self) {
    javaReference = addStrongReference(env, object);
    isStrong = YES;
  }
  return self;
}

- (jobject)javaReferenceWithEnv:(JNIEnv*)env {
  @synchronized(self) {
    if (isStrong)
      return getStrongReference(env, javaReference);
    else
      return getWeakReference(env, javaReference);
  }
}

- (void)setJavaReference:(jobject)object withEnv:(JNIEnv*)env {
  @synchronized(self) {
    if (isStrong)
      removeStrongReference(env, javaReference);
    else
      removeWeakReference(env, javaReference);
    if (isStrong)
      javaReference = addStrongReference(env, object);
    else
      javaReference = addWeakReference(env, object);
  }
}

- (void)dealloc {
  if (gJVMIsRunning) {
    ATTACH_ENV();
    if (isStrong)
      removeStrongReference(env, javaReference);
    else
      removeWeakReference(env, javaReference);
    DETACH_ENV();
  }
  [super dealloc];
}

- (void)upgrade {
  @synchronized(self) {
    if (!isStrong) {
      isStrong = YES;
      ATTACH_ENV();
      jobject ref = getWeakReference(env, javaReference);
      removeWeakReference(env, javaReference);
      javaReference = addStrongReference(env, ref);
      env->DeleteLocalRef(ref);
      DETACH_ENV();
    }
  }
}

- (void)downgrade {
  @synchronized(self) {
    if (isStrong) {
      isStrong = NO;
      ATTACH_ENV();
      jobject ref = getStrongReference(env, javaReference);
      removeStrongReference(env, javaReference);
      javaReference = addWeakReference(env, ref);
      env->DeleteLocalRef(ref);
      DETACH_ENV();
    }
  }
}

@end

/**
 * Private implementation for proxy classes
 */
@implementation _ObjCProxyInstanceContainer {
  uint64_t javaReference;
  uint64_t extensionJavaReference;
}

- (id)initWithEnv:(JNIEnv*)env javaReference:(jobject)object extensionJavaReference:(jobject)extension {
  self = [super init];
  if (self) {
    javaReference = addStrongReference(env, object);
    extensionJavaReference = extension ? addStrongReference(env, extension) : 0L;
  }
  return self;
}

- (jobject)javaReferenceWithEnv:(JNIEnv*)env {
  @synchronized(self) {
    return getStrongReference(env, javaReference);
  }
}

- (jobject)extensionJavaReferenceWithEnv:(JNIEnv*)env {
  @synchronized(self) {
    return extensionJavaReference ? getStrongReference(env, extensionJavaReference) : nullptr;
  }
}

- (void)setJavaReference:(jobject)object withEnv:(JNIEnv*)env {
  @synchronized(self) {
    removeStrongReference(env, javaReference);
    javaReference = addStrongReference(env, object);
  }
}

- (void)setExtensionJavaReference:(jobject)extension withEnv:(JNIEnv*)env {
  @synchronized(self) {
    if (extensionJavaReference)
      removeStrongReference(env, extensionJavaReference);
    extensionJavaReference = extension ? addStrongReference(env, extension) : 0L;
  }
}

- (void)dealloc {
  if (gJVMIsRunning) {
    ATTACH_ENV();
    jobject ref = getStrongReference(env, javaReference);
    cleanupObjCProxy(env, ref);
    env->DeleteLocalRef(ref);
    removeStrongReference(env, javaReference);
    if (extensionJavaReference)
      removeStrongReference(env, extensionJavaReference);
    DETACH_ENV();
  }
  [super dealloc];
}

@end

/**
 * Private implementation for hybrid classes
 */
@implementation _ObjCHybridInstanceContainer {
  BOOL isStrong;
  uint64_t javaReference;
}

- (id)initWithEnv:(JNIEnv*)env javaReference:(jobject)object {
  self = [super init];
  if (self) {
    javaReference = addWeakReference(env, object);
    isStrong = NO;
  }
  return self;
}

- (jobject)javaReferenceWithEnv:(JNIEnv*)env {
  @synchronized(self) {
    if (isStrong)
      return getStrongReference(env, javaReference);
    else
      return getWeakReference(env, javaReference);
  }
}

- (void)setJavaReference:(jobject)object withEnv:(JNIEnv*)env {
  @synchronized(self) {
    if (isStrong)
      removeStrongReference(env, javaReference);
    else
      removeWeakReference(env, javaReference);
    if (isStrong)
      javaReference = addStrongReference(env, object);
    else
      javaReference = addWeakReference(env, object);
  }
}

- (void)dealloc {
  if (gJVMIsRunning) {
    ATTACH_ENV();
    if (isStrong)
      removeStrongReference(env, javaReference);
    else
      removeWeakReference(env, javaReference);
    DETACH_ENV();
  }
  [super dealloc];
}

- (void)upgrade {
  @synchronized(self) {
    if (!isStrong) {
      isStrong = YES;
      ATTACH_ENV();
      jobject ref = getWeakReference(env, javaReference);
      removeWeakReference(env, javaReference);
      javaReference = addStrongReference(env, ref);
      env->DeleteLocalRef(ref);
      DETACH_ENV();
    }
  }
}

- (void)downgrade {
  @synchronized(self) {
    if (isStrong) {
      isStrong = NO;
      ATTACH_ENV();
      jobject ref = getStrongReference(env, javaReference);
      removeStrongReference(env, javaReference);
      javaReference = addWeakReference(env, ref);
      env->DeleteLocalRef(ref);
      DETACH_ENV();
    }
  }
}

@end

/**
 * Private implementation for binding classes
 */
@implementation _ObjCBindingInstanceContainer {
  uint64_t javaReference;
}

- (id)initWithEnv:(JNIEnv*)env javaReference:(jobject)object {
  self = [super init];
  if (self) {
    javaReference = object ? addWeakReference(env, object) : 0L;
  }
  return self;
}

- (jobject)javaReferenceWithEnv:(JNIEnv*)env {
  @synchronized(self) {
    return javaReference ? getWeakReference(env, javaReference) : nullptr;
  }
}

- (void)setJavaReference:(jobject)object withEnv:(JNIEnv*)env {
  @synchronized(self) {
    if (javaReference) removeWeakReference(env, javaReference);
    javaReference = object ? addWeakReference(env, object) : 0L;
  }
}

- (void)dealloc {
  if (gJVMIsRunning) {
    if (javaReference) {
      ATTACH_ENV();
      removeWeakReference(env, javaReference);
      DETACH_ENV();
    }
  }
  [super dealloc];
}

@end

/**
 * Private implementation for block classes
 */
@implementation _ObjCBlockInstanceContainer {
  ffi_closure* _closure;
  uint64_t javaReference;
}

- (id)initWithEnv:(JNIEnv*)env
    javaReference:(jobject)object
          closure:(ffi_closure*)closure;
{
  self = [super init];
  if (self) {
    javaReference = addStrongReference(env, object);
    _closure = closure;
  }
  return self;
}

- (jobject)javaReferenceWithEnv:(JNIEnv*)env {
  @synchronized(self) {
    return getStrongReference(env, javaReference);
  }
}

- (void)dealloc {
  ToJavaBlockInfo* info = (ToJavaBlockInfo*)_closure->user_data;

  if (gJVMIsRunning) {
    ATTACH_ENV();
    jobject method;
    if (info->cached) {
      method =
          env->ToReflectedMethod(info->clazz, info->methodId, info->isStatic);
    } else {
      method = info->method;
    }
    jobject ref = getStrongReference(env, javaReference);
    cleanupObjCBlock(env, ref, method);
    env->DeleteLocalRef(ref);
    removeStrongReference(env, javaReference);
    if (info->cached) {
      env->DeleteLocalRef(method);
    }
    DETACH_ENV();
  }

  [super dealloc];
}

@end
