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

#import "InstrumentedParent.h"

@import Darwin.libkern.OSAtomic;
#if __LP64__
#define AtomicNSUIntegerIncrement(val) OSAtomicIncrement64((volatile int64_t*)&val)
#define AtomicNSUIntegerDecrement(val) OSAtomicDecrement64((volatile int64_t*)&val)
#else
#define AtomicNSUIntegerIncrement(val) OSAtomicIncrement32((volatile int32_t*)&val)
#define AtomicNSUIntegerDecrement(val) OSAtomicDecrement32((volatile int32_t*)&val)
#endif

static NSUInteger allocCount;
static NSUInteger deallocCount;

@implementation InstrumentedParent

- (id)init {
    self = [super init];
    if(self) {
        [InstrumentedParent incrementAllocCount];
    }
    return self;
}

- (void)dealloc {
    [InstrumentedParent incrementDeallocCount];
    [super dealloc];
}

+ (void)reset {
    allocCount = 0;
    deallocCount = 0;
}

+ (NSUInteger) allocCount {
    return allocCount;
}

+ (NSUInteger) deallocCount {
    return deallocCount;
}

+ (void)incrementAllocCount {
    AtomicNSUIntegerIncrement(allocCount);
}

+ (void)incrementDeallocCount {
    AtomicNSUIntegerIncrement(deallocCount);
}

@end
