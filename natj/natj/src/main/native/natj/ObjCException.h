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

#import <Foundation/NSException.h>

#include "NatJ.h"

/**
 * Interface for holding Java exceptions.
 */
@interface ObjCException : NSException

/** Property for the Java exception */
@property(assign, readonly) jthrowable javaException;

/** Initializes an Objective-C exception with a Java one */
- (id)initWithEnv:(JNIEnv*)env javaException:(jthrowable)javaExc;

/** Releases Java exception */
- (void)dealloc;

@end
