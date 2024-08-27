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

#import "ObjC+Methods+Exception.h"

@implementation ObjCExceptionClass

+ (void) throwExceptionWithMessage:(NSString*)message {
    @throw [[[NSException alloc] initWithName:@"name" reason:message userInfo:nil] autorelease];
}

+ (void) expectExceptionWithMessage:(NSString*)message withBlock:(void (^)(NSString*))block {
    @try {
        block(message);
    } @catch (NSException* ex) {
        if ([message compare:[ex reason]] == NSOrderedSame) {
            @throw ex;
        }
    }
}

@end
