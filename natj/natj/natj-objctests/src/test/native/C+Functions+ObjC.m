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

#import "C+Functions+ObjC.h"

id NGIdCreate() { return [[[NSObject alloc] init] autorelease]; }
id NGIdPass(id obj) { return [[obj retain] autorelease]; }

id *NGIdArrayCreate(NSUInteger capacity) { return calloc(capacity, sizeof(id)); }
id NGIdGetAtIndex(id *objects, NSUInteger idx) { return [[objects[idx] retain] autorelease]; }
id NGIdSetAtIndex(id *objects, NSUInteger idx, id object) {
    id old = NGIdGetAtIndex(objects, idx);
    objects[idx] = [object retain];
    if (old != nil) { [old release]; }
    return old;
}
void NGIdArrayFree(id *objects, NSUInteger capacity) {
    for (NSUInteger i = 0; i < capacity; ++i) {
        NGIdSetAtIndex(objects, i, nil);
    }
    free(objects);
}

NSObject *NGObjectCreate() { return [[[NSObject alloc] init] autorelease]; }
NSObject *NGObjectPass(NSObject *obj) { return [[obj retain] autorelease]; }

NSObject **NGObjectArrayCreate(NSUInteger capacity) { return calloc(capacity, sizeof(NSObject *)); }
NSObject *NGObjectGetAtIndex(NSObject **objects, NSUInteger idx) { return [[objects[idx] retain] autorelease]; }
NSObject *NGObjectSetAtIndex(NSObject **objects, NSUInteger idx, NSObject *object) {
    NSObject *old = NGObjectGetAtIndex(objects, idx);
    objects[idx] = [object retain];
    if (old != nil) { [old release]; }
    return old;
}
void NGObjectArrayFree(NSObject **objects, NSUInteger capacity) {
    for (NSUInteger i = 0; i < capacity; ++i) {
        NGObjectSetAtIndex(objects, i, nil);
    }
    free(objects);
}

NSString *NGStringCreate() { return [[[NSString alloc] init] autorelease]; }
NSString *NGStringPass(NSString *obj) { return [[obj retain] autorelease]; }

NSString **NGStringArrayCreate(NSUInteger capacity) { return calloc(capacity, sizeof(NSString *)); }
NSString *NGStringGetAtIndex(NSString **objects, NSUInteger idx) { return [[objects[idx] retain] autorelease]; }
NSString *NGStringSetAtIndex(NSString **objects, NSUInteger idx, NSString *object) {
    NSString *old = NGStringGetAtIndex(objects, idx);
    objects[idx] = [object retain];
    if (old != nil) { [old release]; }
    return old;
}
void NGStringArrayFree(NSString **objects, NSUInteger capacity) {
    for (NSUInteger i = 0; i < capacity; ++i) {
        NGStringSetAtIndex(objects, i, nil);
    }
    free(objects);
}

NSNumber *NGNumberCreate() { return [[[NSNumber alloc] initWithInt:0] autorelease]; }
NSNumber *NGNumberPass(NSNumber *obj) { return [[obj retain] autorelease]; }

NSNumber **NGNumberArrayCreate(NSUInteger capacity) { return calloc(capacity, sizeof(NSNumber *)); }
NSNumber *NGNumberGetAtIndex(NSNumber **objects, NSUInteger idx) { return [[objects[idx] retain] autorelease]; }
NSNumber *NGNumberSetAtIndex(NSNumber **objects, NSUInteger idx, NSNumber *object) {
    NSNumber *old = NGNumberGetAtIndex(objects, idx);
    objects[idx] = [object retain];
    if (old != nil) { [old release]; }
    return old;
}
void NGNumberArrayFree(NSNumber **objects, NSUInteger capacity) {
    for (NSUInteger i = 0; i < capacity; ++i) {
        NGNumberSetAtIndex(objects, i, nil);
    }
    free(objects);
}
