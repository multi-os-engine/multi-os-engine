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

#import "NSStringInstrumentor.h"
#import <objc/runtime.h>

@import Darwin.libkern.OSAtomic;
#if __LP64__
#define AtomicNSUIntegerIncrement(val) OSAtomicIncrement64((volatile int64_t*)&val)
#define AtomicNSUIntegerDecrement(val) OSAtomicDecrement64((volatile int64_t*)&val)
#else
#define AtomicNSUIntegerIncrement(val) OSAtomicIncrement32((volatile int32_t*)&val)
#define AtomicNSUIntegerDecrement(val) OSAtomicDecrement32((volatile int32_t*)&val)
#endif

static Class rootCls;
static IMP customImp;
static IMP originalImp;
static Method method;
static char COUNTER_KEY;
static NSUInteger allocCount;
static NSUInteger deallocCount;

@interface NSStringDeallocCountUpdater : NSObject

@end

@implementation NSStringInstrumentor

+ (void)initialize {
    if(self == [NSStringInstrumentor class]) {
        id dummy = [NSString alloc];
        rootCls = [dummy class];
        [dummy release];
        method = class_getInstanceMethod(rootCls, @selector(initWithUTF8String:));
        customImp = method_getImplementation(class_getInstanceMethod([NSStringInstrumentor class], @selector(_initWithUTF8String:)));
        originalImp = method_getImplementation(method);
    }
}

+ (NSUInteger)allocCount {
    return allocCount;
}

+ (NSUInteger)deallocCount {
    return deallocCount;
}

+ (void)incrementAllocCount {
    AtomicNSUIntegerIncrement(allocCount);
}

+ (void)incrementDeallocCount {
    AtomicNSUIntegerIncrement(deallocCount);
}

- (id)_initWithUTF8String:(const char*)nullTerminatedCString {
    id obj = ((id (*)(id, void *, const char *))originalImp)(self, _cmd, nullTerminatedCString);
    id counter = [[NSStringDeallocCountUpdater alloc] init];
    objc_setAssociatedObject(obj, &COUNTER_KEY, counter, OBJC_ASSOCIATION_RETAIN_NONATOMIC);
    [counter release];
    [NSStringInstrumentor incrementAllocCount];
    return obj;
}

+ (void)enter {
    method_setImplementation(method, customImp);
}

+ (void)exit {
    method_setImplementation(method, originalImp);
}

@end

@implementation NSStringDeallocCountUpdater

- (void)dealloc {
    [NSStringInstrumentor incrementDeallocCount];
    [super dealloc];
}

@end
