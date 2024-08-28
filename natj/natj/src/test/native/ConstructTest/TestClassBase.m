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


#import "TestClassBase.h"

@implementation TestClassBase

+ (id) createBase
{
    TestClassBase *obj = [[TestClassBase alloc] init];
    obj->_history |= CREATE;
    
    return obj;
}

+ (id) createBaseWithParam:(long) param
{
    TestClassBase *obj = [[TestClassBase alloc] init];
    obj->_history |= CREATE_WITH_PARAM;
    
    return obj;
}

- (id) init
{
    self = [super init];
    if (self == nil) return nil;
    
    _history |= INIT;
    
    return self;
}

- (id) initWithParam:(long) param
{
    self = [super init];
    if (self == nil) return nil;
    
    _history |= INIT_WITH_PARAM;
    
    return self;
}

@end
