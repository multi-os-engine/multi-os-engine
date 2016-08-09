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

@protocol BaseProtocol <NSObject>

//the base void method without arguments
-(void)methodBase;

//methods with signed primitive arguments
-(void)methodBaseWithCharArg:(char)arg;
-(void)methodBaseWithShortArg:(short)arg;
-(void)methodBaseWithIntArg:(int)arg;
-(void)methodBaseWithLongArg:(long)arg;
-(void)methodBaseWithLongLongArg:(long long)arg;

//methods with unsigned primitive arguments
-(void)methodBaseWithUCharArg:(unsigned char)arg;
-(void)methodBaseWithUShortArg:(unsigned short)arg;
-(void)methodBaseWithUIntArg:(unsigned int)arg;
-(void)methodBaseWithULongArg:(unsigned long)arg;
-(void)methodBaseWithULongLongArg:(unsigned long long)arg;

//methods with other primitive arguments
-(void)methodBaseWithFloatArg:(float)arg;
-(void)methodBaseWithDoubleArg:(double)arg;
-(void)methodBaseWithBooleanArg:(bool)arg;

//methods which return primitives
-(char)methodBaseWithCharRet;
-(short)methodBaseWithShortRet;
-(int)methodBaseWithIntRet;
-(long)methodBaseWithLongRet;
-(long long)methodBaseWithLongLongRet;
-(unsigned char)methodBaseWithUCharRet;
-(unsigned short)methodBaseWithUShortRet;
-(unsigned int)methodBaseWithUIntRet;
-(unsigned long)methodBaseWithULongRet;
-(unsigned long long)methodBaseWithULongLongRet;
-(float)methodBaseWithFloatRet;
-(double)methodBaseWithDoubleRet;
-(bool)methodBaseWithBooleanRet;

//methods with complex argument
-(void)methodBaseWithNSStringArg:(NSString*)string;
-(void)methodBaseWithObjectArg:(id)object;

//method with two arguments
-(void)methodBaseWithFirst:(long)longParam andSecondParam:(double) stringParam;

//methods wich return complex types
-(NSString*)methodBaseWithNSStringRet;
-(id)methodBaseWithObjectRet;

//method for Mikhail
-(id)method:(float)firstFloatArg Base:(float)secondFloatArg For:(id)objectToReturn Mikhail:(id)Misha;

@end


