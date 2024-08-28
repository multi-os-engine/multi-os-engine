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

#import "BaseProtocol.h"
#import "MiddleProtocolOne.h"
#import "MiddleProtocolTwo.h"
#import "UpperProtocol.h"

@interface BaseController : NSObject

@property (nonatomic, strong) id <BaseProtocol> baseDelegate;
@property (nonatomic, strong) id <UpperProtocol> upperDelegate;
@property (nonatomic, strong) id <MiddleProtocolOne, MiddleProtocolTwo> mixedDelegate;

-(id)initWithBase:(id)base andUpper:(id)upper andMixedDelegate:(id)mixed;

//Methods for baseDelegate
    -(id)initWithBaseDelegate:(id)base;
    -(void)callMethodBase;

    //methods with signed primitive arguments
    -(void)callMethodBaseWithCharArg:(char)arg;
    -(void)callMethodBaseWithShortArg:(short)arg;
    -(void)callMethodBaseWithIntArg:(int)arg;
    -(void)callMethodBaseWithLongArg:(long)arg;
    -(void)callMethodBaseWithLongLongArg:(long long)arg;

    //methods with unsigned primitive arguments
    -(void)callMethodBaseWithUCharArg:(unsigned char)arg;
    -(void)callMethodBaseWithUShortArg:(unsigned short)arg;
    -(void)callMethodBaseWithUIntArg:(unsigned int)arg;
    -(void)callMethodBaseWithULongArg:(unsigned long)arg;
    -(void)callMethodBaseWithULongLongArg:(unsigned long long)arg;

    //methods with other primitive arguments
    -(void)callMethodBaseWithFloatArg:(float)arg;
    -(void)callMethodBaseWithDoubleArg:(double)arg;
    -(void)callMethodBaseWithBooleanArg:(bool)arg;

    //methods which return primitives
    -(char)callMethodBaseWithCharRet;
    -(short)callMethodBaseWithShortRet;
    -(int)callMethodBaseWithIntRet;
    -(long)callMethodBaseWithLongRet;
    -(long long)callMethodBaseWithLongLongRet;
    -(unsigned char)callMethodBaseWithUCharRet;
    -(unsigned short)callMethodBaseWithUShortRet;
    -(unsigned int)callMethodBaseWithUIntRet;
    -(unsigned long)callMethodBaseWithULongRet;
    -(unsigned long long)callMethodBaseWithULongLongRet;
    -(float)callMethodBaseWithFloatRet;
    -(double)callMethodBaseWithDoubleRet;
    -(bool)callMethodBaseWithBooleanRet;

    //methods with complex argument
    -(void)callMethodBaseWithNSStringArg:(NSString*)string;
    -(void)callMethodBaseWithObjectArg:(id)object;

    //method with two arguments
    -(void)callMethodBaseWithFirst:(long)longParam andSecondParam:(double) stringParam;

    //methods wich return complex types
    -(NSString*)callMethodBaseWithNSStringRet;
    -(id)callMethodBaseWithObjectRet;

    //method for Mikhail
    -(id)callMethod:(float)firstFloatArg Base:(float)secondFloatArg For:(id)objectToReturn Mikhail:(id)Misha;

//Methods for upperDelegate
    -(id)initWithUpperDelegate:(id)upper;
    -(void)callUpperDelegate;

//Methods for mixedDelegate
    -(id)initWithMixedDelegate:(id)mixed;
    -(void)callMixedDelegate;
    -(void)callMethodUpperWithStruct;
    -(void)callMethodUpperWithStructPointer;
    -(NSObject *)callMethodBasePureCallback:(NSObject *)object;
    -(NSObject *)callStaticMethodBaseCallback:(NSObject *)object;

@end
