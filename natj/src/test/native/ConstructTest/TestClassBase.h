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

#import <Foundation/Foundation.h>

enum History
{
    INIT  = 1,
    INIT_WITH_PARAM  = 2,
    CREATE = 4,
    CREATE_WITH_PARAM = 8,

    INIT_MIDDLE  = 16,
    INIT_MIDDLE_WITH_PARAM = 32,
    CREATE_MIDDLE_WITH_PARAM = 64
};


@interface TestClassBase : NSObject

@property long history;

+ (id) createBase;
+ (id) createBaseWithParam:(long) param;

- (id) initWithParam:(long) param;

@end
