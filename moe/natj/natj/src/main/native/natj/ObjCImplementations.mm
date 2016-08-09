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

#include "ObjCImplementations.h"
#include "ObjCInstanceContainer.h"

#import <Foundation/NSDictionary.h>
#import <Foundation/NSString.h>

#import <objc/runtime.h>
#import <objc/message.h>

void initialize_hybrid(id obj, SEL sel) {
  @autoreleasepool {
    if ([obj respondsToSelector:gObjCOriginalInitializeSelector]) {
      [obj performSelector:gObjCOriginalInitializeSelector];
    }

    NSString* className;

    @synchronized(gObjCHybridMap) {
      className = [gObjCHybridMap objectForKey:[NSValue valueWithPointer:obj]];

      if (className == nil) {
        return;
      }

      // We don't need this info anymore.
      [gObjCHybridMap removeObjectForKey:obj];
    }

    {
      ATTACH_ENV();

      jclass clazz = env->FindClass([className UTF8String]);
      if (env->ExceptionOccurred()) {
        env->ExceptionClear();
        return;
      }

      forceInitClass(env, clazz);

      env->DeleteLocalRef(clazz);

      DETACH_ENV();
    }
  }
}

id init_java(id obj, SEL sel, JNIEnv* env, jobject theJavaInstance) {
  Class cls = object_getClass(obj);
  objc_super super = {obj, class_getSuperclass(cls)};
  obj = ((id (*)(id, SEL))objc_msgSendSuper)((id)&super, @selector(init));
  if (obj) {
    auto container = getCustomInstanceContainer(obj);
    [container setJavaReference:theJavaInstance withEnv:env];
    ProxyExtensionInfo* info = getExtensionInfoForProxyClass(cls);
    if (info->extensionClass) {
        [container setExtensionJavaReference:env->NewObject(info->extensionClass,
                                                            info->extensionConstructor,
                                                            theJavaInstance)
                                     withEnv:env];
    }
  }
  return obj;
}

id alloc_objc(id obj, SEL sel) {
  bool isHybrid = isHybridClass(obj);

  id o = class_createInstance(obj, sizeof(id));

  // Determine closest pure Objective-C ascendant
  Class ascendant = class_getSuperclass(obj);
  if (!isHybrid) {
    while (isInheritedClass(ascendant)) {
      ascendant = class_getSuperclass(ascendant);
    }
  }

  @autoreleasepool {
    ObjCInstanceContainer* container;
    {
      ATTACH_ENV();

      if (isHybrid) {
        container = [ObjCInstanceContainer hybridContainerWithEnv:env
                                                    javaReference:NULL];
      } else {
        // Get construction info
        ObjCAllocInfo* info = getAllocInfoForClass(obj);

        // Retain for Java connection
        Class objcClass = ascendant;
        while (isHybridClass(objcClass)) {
          objcClass = class_getSuperclass(objcClass);
        }
        objc_super super = {o, objcClass};
        ((void (*)(id, SEL))objc_msgSendSuper)((id)&super, @selector(retain));

        // Create and attach Java instance
        jobject javaInstance = env->CallStaticObjectMethod(
            gNatJClass, gToJavaStaticMethod, reinterpret_cast<jlong>(o),
            info->constructionInfo);
        container =
            [ObjCInstanceContainer inheritedContainerWithEnv:env
                                               javaReference:javaInstance];
        env->DeleteLocalRef(javaInstance);

        // Update retain count in the container
        container.ownerRetainCount = 2;
      }

      DETACH_ENV();
    }
    setCustomInstanceContainer(o, container);
    [container setObjcAscendant:ascendant];
  }

  return o;
}

id alloc_java(id obj, SEL sel) {
  id o = class_createInstance(obj, sizeof(id));
  @autoreleasepool {
    ATTACH_ENV();

    ObjCInstanceContainer* container =
        [ObjCInstanceContainer proxyContainerWithEnv:env javaReference:NULL extensionJavaReference:NULL];
    [container setObjcAscendant:[NSObject class]];
    setCustomInstanceContainer(o, container);

    DETACH_ENV();
  }
  return o;
}

id retain_common(id obj, SEL sel) {
  ObjCInstanceContainer* container = getCustomInstanceContainer(obj);

  Class ascendant = [container objcAscendant];
  while (isHybridClass(ascendant)) {
    ascendant = class_getSuperclass(ascendant);
  }
  objc_super super = {obj, ascendant};
  ((void (*)(id, SEL))objc_msgSendSuper)((id)&super, @selector(retain));

  @synchronized(container) {
    if ([container ownerRetainCount] == 1) {
      [container upgrade];
    }
    container.ownerRetainCount++;
  }

  return obj;
}

BOOL retainWeakReference_common(id obj, SEL sel) {
  // At this point the object may have been already deallocated, so we
  // need to be extra cautious about how we call the super implementation.
  Class cls = object_getClass(obj);
  IMP imp;
  while ((imp = class_getMethodImplementation(cls, @selector(retainWeakReference))) == (IMP)retainWeakReference_common) {
    cls = class_getSuperclass(cls);
  }
  
  BOOL ret = ((BOOL (*)(id, SEL))imp)(obj, @selector(retainWeakReference));
  if (ret) {
    ObjCInstanceContainer* container = getCustomInstanceContainer(obj);
    @synchronized(container) {
      if ([container ownerRetainCount] == 1) {
        [container upgrade];
      }
      container.ownerRetainCount++;
    }
  }

  return ret;
}

void release_common(id obj, SEL sel) {
  ObjCInstanceContainer* container = getCustomInstanceContainer(obj);
  [container retain];

  @synchronized(container) {
    BOOL toWeak = [container ownerRetainCount] == 2;
    if (toWeak) {
      [container downgrade];
    }
    container.ownerRetainCount--;
  }

  Class ascendant = [container objcAscendant];
  while (isHybridClass(ascendant)) {
    ascendant = class_getSuperclass(ascendant);
  }
  objc_super super = {obj, ascendant};
  ((void (*)(id, SEL))objc_msgSendSuper)((id)&super, @selector(release));

  [container release];
}
