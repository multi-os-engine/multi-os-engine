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
#import "BaseController.h"
#import "test_common.h"


@implementation BaseController

@synthesize baseDelegate;
@synthesize upperDelegate;
@synthesize mixedDelegate;

-(id)initWithBase:(id)baseDel andUpper:(id)upperDel andMixedDelegate:(id)mixedDel {
    
    @protocol(BaseProtocol);
    @protocol(MiddleProtocolOne);
    @protocol(MiddleProtocolTwo);
    @protocol(UpperProtocol);
    
    self = [super init];
    [self setBaseDelegate:baseDel];
    [self setUpperDelegate:upperDel];
    [self setMixedDelegate:mixedDel];
    return self;
}

/*
 *Methods for baseDelegate
 */
-(id)initWithBaseDelegate:(id)baseDel {
    self = [super init];
    [self setBaseDelegate:baseDel];
    return self;
}

-(void)callMethodBase { [self.baseDelegate methodBase]; }

//methods with signed primitive arguments
-(void)     callMethodBaseWithCharArg:      (char)arg       { [self.baseDelegate methodBaseWithCharArg:arg]; }
-(void)     callMethodBaseWithShortArg:     (short)arg      { [self.baseDelegate methodBaseWithShortArg:arg]; }
-(void)     callMethodBaseWithIntArg:       (int)arg        { [self.baseDelegate methodBaseWithIntArg:arg]; }
-(void)     callMethodBaseWithLongArg:      (long)arg       { [self.baseDelegate methodBaseWithLongArg:arg]; }
-(void)     callMethodBaseWithLongLongArg:  (long long)arg  { [self.baseDelegate methodBaseWithLongLongArg:arg]; }

//methods with unsigned primitive arguments
-(void)     callMethodBaseWithUCharArg:     (unsigned char)arg      { [self.baseDelegate methodBaseWithUCharArg:arg]; }
-(void)     callMethodBaseWithUShortArg:    (unsigned short)arg     { [self.baseDelegate methodBaseWithUShortArg:arg]; }
-(void)     callMethodBaseWithUIntArg:      (unsigned int)arg       { [self.baseDelegate methodBaseWithUIntArg:arg]; }
-(void)     callMethodBaseWithULongArg:     (unsigned long)arg      { [self.baseDelegate methodBaseWithULongArg:arg]; }
-(void)     callMethodBaseWithULongLongArg: (unsigned long long)arg { [self.baseDelegate methodBaseWithULongLongArg:arg]; }

//methods with other primitive arguments
-(void)     callMethodBaseWithFloatArg:     (float)arg      {
    TESTLog(@"Float arg:%f", arg);
    [self.baseDelegate methodBaseWithFloatArg:arg];
}
-(void)     callMethodBaseWithDoubleArg:    (double)arg     { [self.baseDelegate methodBaseWithDoubleArg:arg]; }
-(void)     callMethodBaseWithBooleanArg:   (bool)arg       { [self.baseDelegate methodBaseWithBooleanArg:arg]; }

//methods which return primitives
-(char)                 callMethodBaseWithCharRet       { return [self.baseDelegate methodBaseWithCharRet]; }
-(short)                callMethodBaseWithShortRet      { return [self.baseDelegate methodBaseWithShortRet]; }
-(int)                  callMethodBaseWithIntRet        { return [self.baseDelegate methodBaseWithIntRet]; }
-(long)                 callMethodBaseWithLongRet       { return [self.baseDelegate methodBaseWithLongRet]; }
-(long long)            callMethodBaseWithLongLongRet   { return [self.baseDelegate methodBaseWithLongLongRet]; }
-(unsigned char)        callMethodBaseWithUCharRet      { return [self.baseDelegate methodBaseWithUCharRet]; }
-(unsigned short)       callMethodBaseWithUShortRet     { return [self.baseDelegate methodBaseWithUShortRet]; }
-(unsigned int)         callMethodBaseWithUIntRet       { return [self.baseDelegate methodBaseWithUIntRet]; }
-(unsigned long)        callMethodBaseWithULongRet      { return [self.baseDelegate methodBaseWithULongRet]; }
-(unsigned long long)   callMethodBaseWithULongLongRet  { return [self.baseDelegate methodBaseWithULongLongRet]; }
-(float)                callMethodBaseWithFloatRet      { return [self.baseDelegate methodBaseWithFloatRet]; }
-(double)               callMethodBaseWithDoubleRet     { return [self.baseDelegate methodBaseWithDoubleRet]; }
-(bool)                 callMethodBaseWithBooleanRet    { return [self.baseDelegate methodBaseWithBooleanRet]; }

//methods with complex argument
-(void)     callMethodBaseWithNSStringArg:  (NSString*)string   { [self.baseDelegate methodBaseWithNSStringArg:string]; }
-(void)     callMethodBaseWithObjectArg:    (id)object          { [self.baseDelegate methodBaseWithObjectArg:object]; }

//method with two arguments
-(void)     callMethodBaseWithFirst:(long)longParam
                     andSecondParam:(double)stringParam
            { [self.baseDelegate methodBaseWithFirst:longParam andSecondParam:stringParam]; }

//methods wich return complex types
-(NSString*)    callMethodBaseWithNSStringRet   { return[self.baseDelegate methodBaseWithNSStringRet]; }
-(id)           callMethodBaseWithObjectRet     { return [self.baseDelegate methodBaseWithObjectRet]; }

//method for Mikhail
-(id)callMethod:(float)firstFloatArg Base:(float)secondFloatArg For:(id)objectToReturn Mikhail:(id)Misha {
    id ret = [self.baseDelegate method:firstFloatArg Base:secondFloatArg For:objectToReturn Mikhail:Misha];
    return ret;
}


/*
 *  Methods for upperDelegate
 */
-(id)initWithUpperDelegate:(id)upperDel {
    self = [super init];
    [self setUpperDelegate:upperDel];
    return self;
}

-(void)callUpperDelegate {
    [self.upperDelegate methodBase];
    [self.upperDelegate methodMiddleOne];
    [self.upperDelegate methodMiddleTwo];
    [self.upperDelegate methodUpper];
}

/*
 *Method for mixedDelegate
 */
-(id)initWithMixedDelegate:(id)mixedDel {
    self = [super init];
    [self setMixedDelegate:mixedDel];
    return self;
}

-(void)callMixedDelegate {
    [self.mixedDelegate methodBase];
    [self.mixedDelegate methodMiddleOne];
    [self.mixedDelegate methodMiddleTwo];
}

-(void)callMethodUpperWithStruct {
    CGPoint p ;
    p.x = 100;
    p.y = 200;
    [self.upperDelegate methodUpperWithStruct:p];
}

-(void)callMethodUpperWithStructPointer {
    CGPoint *p = malloc(sizeof(CGPoint));
    p->x = 100;
    p->y = 200;
    [self.upperDelegate methodUpperWithStructPointer:p];
    
}

-(NSObject *)callMethodBasePureCallback:(NSObject *)object {
    SEL s = NSSelectorFromString(@"pureCallBack:");
    return [self.baseDelegate performSelector:s withObject:object];
}

-(NSObject *)callStaticMethodBaseCallback:(NSObject *)object
{
    SEL s = NSSelectorFromString(@"staticCallBack:");
    return [self.baseDelegate performSelector:s withObject:object];
}

@end
