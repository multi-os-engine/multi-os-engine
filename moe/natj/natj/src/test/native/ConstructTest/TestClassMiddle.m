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


#import "TestClassMiddle.h"

@implementation TestClassMiddle

+ (id) createMiddleWithParam:(long) param
{
    TestClassMiddle *obj = [[TestClassMiddle alloc] initWithParam:param];
    
    obj.history |= CREATE_MIDDLE_WITH_PARAM;
    
    return obj;
}

- (id) initWithParam
{
    self = [super init];
    if (self == nil) return nil;
    
    self.history |= INIT_MIDDLE;
    
    return self;
}

- (id) initWithParam:(long) param
{
    self = [super init];
    if (self == nil) return nil;
    
    self.history |= INIT_MIDDLE_WITH_PARAM;
    
    return self;
}


@end
