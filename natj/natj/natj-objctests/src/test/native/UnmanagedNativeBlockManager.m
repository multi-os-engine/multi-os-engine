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

#import "UnmanagedNativeBlockManager.h"

static NSUInteger instanceCount = 0;

@interface UnmanagedNativeBlockCounter : NSObject

@end

@implementation UnmanagedNativeBlockCounter

- (UnmanagedNativeBlockCounter*) init {
    self = [super init];
    if (self) {
        instanceCount++;
    }
    return self;
}

- (void)dealloc {
    [super dealloc];
    instanceCount--;
}

@end

@implementation UnmanagedNativeBlockManager

+ (NSUInteger) instanceCount {
    return instanceCount;
}

+ (int (^)(int, int)) unmanagedNativeBlock {
    return [[UnmanagedNativeBlockManager createUnmanagedNativeBlock] autorelease];
}

+ (int (^)(int, int)) createUnmanagedNativeBlock {
    UnmanagedNativeBlockCounter* counter = [[UnmanagedNativeBlockCounter alloc] init];
    id ret = ^int (int a, int b) {
        if (counter) {
            return a + b;
        } else {
            return 0;
        }
    };
    ret = [ret copy];
    [counter release];
    return ret;
}

@end
