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
#import "DirectStructure.h"
#import "ExtMock.h"
#import "test_common.h"

@interface DirectCallClass : NSObject

@property (strong, nonatomic) NSObject *stringProp;
@property(nonatomic,readonly) NativeCGRect  bounds;
@property (strong, nonatomic) id<NSCopying> dataCopy;

-(id) initWithBounds;
+(NSObject *)staticStringProp;
+(void)setStaticStringProp:(NSObject *) object;

//the base void method without arguments
-(int)methodDCall;

//methods with signed primitive arguments
-(char)methodDCallWithCharArg:(char)arg;
-(short)methodDCallWithShortArg:(short)arg;
-(int)methodDCallWithIntArg:(int)arg;
-(long)methodDCallWithLongArg:(long)arg;
-(long long)methodDCallWithLongLongArg:(long long)arg;

//methods with unsigned primitive arguments
-(unsigned char)methodDCallWithUCharArg:(unsigned char)arg;
-(unsigned short)methodDCallWithUShortArg:(unsigned short)arg;
-(unsigned int)methodDCallWithUIntArg:(unsigned int)arg;
-(unsigned long)methodDCallWithULongArg:(unsigned long)arg;
-(unsigned long long)methodDCallWithULongLongArg:(unsigned long long)arg;

//methods with other primitive arguments
-(float)methodDCallWithFloatArg:(float)arg;
-(double)methodDCallWithDoubleArg:(double)arg;
-(bool)methodDCallWithBooleanArg:(bool)arg;

//methods which return primitives
-(char)methodDCallWithCharRet;
-(short)methodDCallWithShortRet;
-(int)methodDCallWithIntRet;
-(long)methodDCallWithLongRet;
-(long long)methodDCallWithLongLongRet;
-(unsigned char)methodDCallWithUCharRet;
-(unsigned short)methodDCallWithUShortRet;
-(unsigned int)methodDCallWithUIntRet;
-(unsigned long)methodDCallWithULongRet;
-(unsigned long long)methodDCallWithULongLongRet;
-(float)methodDCallWithFloatRet;
-(double)methodDCallWithDoubleRet;
-(bool)methodDCallWithBooleanRet;

//methods with complex argument
-(NSString*)methodDCallWithNSStringArg:(NSString*)string;
-(id)methodDCallWithObjectArg:(id)object;

//method with two arguments
-(NSString*)methodDCallWithFirst:(long)longParam andSecondParam:(NSString*) stringParam;

//methods wich return complex types
-(NSString*)methodDCallWithNSStringRet;
-(id)methodDCallWithObjectRet;

//static method without arguments
+(NSString*)staticMethodDCallWithNSStringRet;

//methods with structures
-(void)methodDCallWithStructArg:(NativeCGPoint)arg;
-(NativeCGPoint)methodDCallWithStructRet:(NativeCGPoint)arg;
-(NativeCGPoint)methodDCallWithStructRetX:(double)x Y:(double)y;
-(NativeComplexCGPoint) methodDCallWithComplexStructRetX:(NativeCGPoint)x Y:(float)y;
-(NativeCGPointFloat) methodDStructRetStructFloat:(float)x Y:(float)y;
-(NativeCGPointFloat) methodDStructRetStructFloatFromStruct:(NativeCGPointFloat)x;
-(NativeCGRect) methodDCallRetCGRectX:(double)x Y:(double)y;
-(NativeCGRect) methodDCallRetCGRectProperty;

//methods with selectors
-(void)methodDCallWithSelectorArg:(SEL)arg;
-(SEL)methodDCallWithSelectorRet;
-(long)methodDCall:(id)object WithJavaSelectorArg:(SEL)selector;

//methods with to id pointer
-(void)methodDCallWithToIdPtrBase:(id*)arg;
-(void)methodDCallWithToIdPtrArg:(id*)arg;
-(void)methodDCallWithFirst:(id*)idPtr1 andSecondToIdPtr:(id*)idPtr2;
-(void)methodDCallWithToNSErrorPtr:(NSError**)error;

-(NSObject *)producingNativeObjects;
-(void) raiseExceptionMethod;
-(bool) assertMethodCall:(NSString *)selector times:(long) times;
@end


