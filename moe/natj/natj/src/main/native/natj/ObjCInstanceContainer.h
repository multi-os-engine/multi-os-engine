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

#import <objc/NSObject.h>

#include "jni.h"

#include "NatJ.h"

/**
 * Interface for storing Java references.
 * Contains the respective Java references for the Objective-C object it is
 * assigned to.
 */
@interface ObjCInstanceContainer : NSObject

/** Initializes the inherited instance container */
+ (id)inheritedContainerWithEnv:(JNIEnv*)env javaReference:(jobject)object;

/** Initializes the proxy instance container */
+ (id)proxyContainerWithEnv:(JNIEnv*)env javaReference:(jobject)object extensionJavaReference:(jobject)extension;

/** Initializes the hybrid instance container */
+ (id)hybridContainerWithEnv:(JNIEnv*)env javaReference:(jobject)object;

/** Initializes the binding instance container */
+ (id)bindingContainerWithEnv:(JNIEnv*)env javaReference:(jobject)object;

/** Initializes the block instance container */
+ (id)blockContainerWithEnv:(JNIEnv*)env
              javaReference:(jobject)object
                    closure:(ffi_closure*)closure;

/** Property for following the retain count of the owner objects */
@property(assign, nonatomic) NSUInteger ownerRetainCount;

/** Property for Objective-C ascenadnt class */
@property(assign, nonatomic) Class objcAscendant;

/** For upgrading Java references to strong */
- (void)upgrade;

/** For downgrading Java references to weak */
- (void)downgrade;

@end

@protocol ObjCInstanceContainerImplementable

/** Getter for Java instance */
- (jobject)javaReferenceWithEnv:(JNIEnv*)env;

/** Setter for Java instance */
- (void)setJavaReference:(jobject)object withEnv:(JNIEnv*)env;

/** Getter for Java extension instance, only used for proxies */
@optional
- (jobject)extensionJavaReferenceWithEnv:(JNIEnv*)env;

/** Setter for Java extension instance, only used for proxies */
@optional
- (jobject)setExtensionJavaReference:(jobject)object withEnv:(JNIEnv*)env;

@end

@interface ObjCInstanceContainer (Implementable) <ObjCInstanceContainerImplementable>

@end
