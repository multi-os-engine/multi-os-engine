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
#import <CoreGraphics/CoreGraphics.h>

@protocol TestProtocol <NSObject>

- (void)pmeth0;
- (int )pmeth1;
- (void)pmeth2:(int)a;
- (int )pmeth3:(int)a;
- (void)pmeth4:(int)a :(float)b;
- (int )pmeth5:(int)a :(float)b;
- (void)pmeth6:(int)a cont:(float)b;
- (int )pmeth7:(int)a cont:(float)b;

@property (retain) NSString *pString;
@end

@interface TestClass : NSObject <TestProtocol> {
    int a;
    float b;
    CGSize c;
}

+ (void)smeth0;
+ (int )smeth1;
+ (void)smeth2:(int)a;
+ (int )smeth3:(int)a;
+ (void)smeth4:(int)a :(float)b;
+ (int )smeth5:(int)a :(float)b;
+ (void)smeth6:(int)a cont:(float)b;
+ (int )smeth7:(int)a cont:(float)b;

- (void)meth0;
- (int )meth1;
- (void)meth2:(int)a;
- (int )meth3:(int)a;
- (void)meth4:(int)a :(float)b;
- (int )meth5:(int)a :(float)b;
- (void)meth6:(int)a cont:(float)b;
- (int )meth7:(int)a cont:(float)b;

- (void)pmeth0;
- (int )pmeth1;
- (void)pmeth2:(int)a;
- (int )pmeth3:(int)a;
- (void)pmeth4:(int)a :(float)b;
- (int )pmeth5:(int)a :(float)b;
- (void)pmeth6:(int)a cont:(float)b;
- (int )pmeth7:(int)a cont:(float)b;

@property (readonly, assign, nonatomic) int value;
@property (readwrite, copy, atomic) NSString *string;
@property (retain) NSArray *values;
@property (retain) NSString *pString;
@end

@interface TestClass (TestCategory)

- (void)cmeth0;
- (int )cmeth1;
- (void)cmeth2:(int)a;
- (int )cmeth3:(int)a;
- (void)cmeth4:(int)a :(float)b;
- (int )cmeth5:(int)a :(float)b;
- (void)cmeth6:(int)a cont:(float)b;
- (int )cmeth7:(int)a cont:(float)b;

@end
