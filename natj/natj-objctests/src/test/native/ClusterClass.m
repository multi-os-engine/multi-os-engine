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

#import "ClusterClass.h"

@class ClusterClass;

@interface SubClass : ClusterClass {
    NSString* _string;
}
@end

@implementation ClusterClass

- (id)initWithString:(NSString *)string {
    self = [super init];
    if(self) {
        [self release];
        self = [[SubClass alloc] initWithString:string];
    }
    return self;
}

@end

@implementation SubClass
- (id)initWithString:(NSString *)string {
    self = [super init];
    if(self) {
        _string = [string retain];
    }
    return self;
}

- (NSString*)string {
    return [[_string retain] autorelease];
}

- (void)dealloc {
    [_string release];
    [super dealloc];
}
@end
