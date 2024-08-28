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

#import "Common_Defines.h"

NATJ_TEST_EXTERN id NGIdCreate();
NATJ_TEST_EXTERN id NGIdPass(id obj);

NATJ_TEST_EXTERN id *NGIdArrayCreate(NSUInteger capacity);
NATJ_TEST_EXTERN id NGIdGetAtIndex(id *objects, NSUInteger idx);
NATJ_TEST_EXTERN id NGIdSetAtIndex(id *objects, NSUInteger idx, id object);
NATJ_TEST_EXTERN void NGIdArrayFree(id *objects, NSUInteger capacity);

NATJ_TEST_EXTERN NSObject *NGObjectCreate();
NATJ_TEST_EXTERN NSObject *NGObjectPass(NSObject *obj);

NATJ_TEST_EXTERN NSObject **NGObjectArrayCreate(NSUInteger capacity);
NATJ_TEST_EXTERN NSObject *NGObjectGetAtIndex(NSObject **objects, NSUInteger idx);
NATJ_TEST_EXTERN NSObject *NGObjectSetAtIndex(NSObject **objects, NSUInteger idx, NSObject *object);
NATJ_TEST_EXTERN void NGObjectArrayFree(NSObject **objects, NSUInteger capacity);

NATJ_TEST_EXTERN NSString *NGStringCreate();
NATJ_TEST_EXTERN NSString *NGStringPass(NSString *obj);

NATJ_TEST_EXTERN NSString **NGStringArrayCreate(NSUInteger capacity);
NATJ_TEST_EXTERN NSString *NGStringGetAtIndex(NSString **objects, NSUInteger idx);
NATJ_TEST_EXTERN NSString *NGStringSetAtIndex(NSString **objects, NSUInteger idx, NSString *object);
NATJ_TEST_EXTERN void NGStringArrayFree(NSString **objects, NSUInteger capacity);

NATJ_TEST_EXTERN NSNumber *NGNumberCreate();
NATJ_TEST_EXTERN NSNumber *NGNumberPass(NSNumber *obj);

NATJ_TEST_EXTERN NSNumber **NGNumberArrayCreate(NSUInteger capacity);
NATJ_TEST_EXTERN NSNumber *NGNumberGetAtIndex(NSNumber **objects, NSUInteger idx);
NATJ_TEST_EXTERN NSNumber *NGNumberSetAtIndex(NSNumber **objects, NSUInteger idx, NSNumber *object);
NATJ_TEST_EXTERN void NGNumberArrayFree(NSNumber **objects, NSUInteger capacity);
