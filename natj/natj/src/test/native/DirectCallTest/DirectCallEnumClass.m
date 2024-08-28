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


#import "DirectCallEnumClass.h"

@implementation DirectCallEnumClass

BaseEnum en;

-(void)     methodDCallWBaseEnumArg:(BaseEnum) en   { TESTLog(@"[NATIVE] methodDCallWBaseEnumArg: %ld", en); }
-(BaseEnum) methodDCallWBaseEnumRet:(BaseEnum) en   { TESTLog(@"[NATIVE] methodDCallWBaseEnumRet: %ld", en); return en; }

-(void)     methodDCallWBaseEnumPtrArg:(BaseEnum*) ptr   { TESTLog(@"[NATIVE] methodDCallWBaseEnumPtrArg: %p", ptr); *ptr = Second; }
-(BaseEnum*) methodDCallWBaseEnumPtrRet:(BaseEnum) _en   { TESTLog(@"[NATIVE] methodDCallWBaseEnumPtrRet: %ld", en); en = _en; return &en; }

@end

@implementation DirectCallEnumClass (OCMockExtension)


/*-(id)initWithMock:(BOOL)m {
    
    self = [self init];
    if (m != YES) {
        id mock = OCMClassMock([self class]);
        [mock addClassInvocationWithSel:@selector(alloc)];
        
        [mock addInstanceInvocationWithSel:_cmd];
        
        return mock;
    } else {
        return self;
    }
}*/

@end
