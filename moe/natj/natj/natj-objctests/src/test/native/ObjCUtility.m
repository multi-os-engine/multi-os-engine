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

#import "ObjCUtility.h"
#import <objc/runtime.h>


#define RETURN_MOE_ERROR(err_code) { return [NSError errorWithDomain:@"org.moe" code:err_code userInfo:nil]; }

#define MOE_ASSERT_WITH_ERROR(value, err_code) { if (!value) RETURN_MOE_ERROR(err_code) }

typedef id (objretimpl)(id obj, SEL sel);

@implementation ObjCUtility

+ (id)objectReturnFromClass:(NSString *)className selector:(SEL)sel {
    MOE_ASSERT_WITH_ERROR(className, -1)
    MOE_ASSERT_WITH_ERROR(sel, -2)
    
    Class cls = objc_getClass([className UTF8String]);
    MOE_ASSERT_WITH_ERROR(cls, -10)
    
    Method mth = class_getClassMethod(cls, sel);
    MOE_ASSERT_WITH_ERROR(mth, -20);
    
    IMP impl = method_getImplementation(mth);
    MOE_ASSERT_WITH_ERROR(impl, -30);
    
    id result = ((id(*)(Class, SEL))impl)(cls, sel);
    return result;
}

+ (id)objectReturnFromObject:(id)object selector:(SEL)sel {
    MOE_ASSERT_WITH_ERROR(object, -1)
    MOE_ASSERT_WITH_ERROR(sel, -2)
    
    Class cls = object_getClass(object);
    MOE_ASSERT_WITH_ERROR(cls, -10)
    
    Method mth = class_getInstanceMethod(cls, sel);
    MOE_ASSERT_WITH_ERROR(mth, -20);
    
    IMP impl = method_getImplementation(mth);
    MOE_ASSERT_WITH_ERROR(impl, -30);
    
    id result = ((id(*)(id, SEL))impl)(object, sel);
    return result;
}

@end
