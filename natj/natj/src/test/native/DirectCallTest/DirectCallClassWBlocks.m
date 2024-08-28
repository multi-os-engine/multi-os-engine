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
#import "DirectCallClassWBlocks.h"
#import "test_common.h"


@implementation DirectCallClassWBlocks : NSObject

@synthesize completionBlock;


-(void) DirectCallWBlock:(void (^)()) argBlock
{
    argBlock();
}

-(void) DirectCallWBlockFloat:(void (^)(float a, float b)) argBlock
{
    TESTLog(@"Trying to call block in DirectCallWBlockFloat");
    argBlock(10, 20);
}

-(void) DirectCallWBlockObject:(void (^)(int a, double s,  NSObject *object, int b, double z, NSObject *secObject, NSObject *thirdObject)) argBlock
                    withObject: (NSObject *)fobject
                       andSObj:(NSObject *)sobject
                       andTObj:(NSObject *)tobject
{
    
    //TESTLog(@"Trying to call block in DirectCallWBlockFloat");
    argBlock(15 ,100,fobject, 27, 350,  sobject, tobject);
}

-(void) DirectCallWObjectOnlyBlock:(void (^)(NSObject *object, NSObject *secObject, NSObject *thirdObject)) argBlock
                        withObject:(NSObject *)fobject
                           andSObj:(NSObject *)sobject
                           andTObj:(NSObject *)tobject
{
    argBlock(fobject,sobject, tobject);
}

-(NSObject *) DirectCallWObjectBlockRetObject:(NSObject* (^)(NSObject *object)) argBlock
                                   withObject:(NSObject *)fobject
{
   NSObject* newObject = argBlock(fobject);
    
    TESTLog(@"NEW Object: %@", newObject);
    
    return newObject;
}

-(NSObject *) DirectCallFloatBlockRetObject:(NSObject* (^)(float a, float b, NSObject *object)) argBlock fFloat:(float) aArg sFloat:(float) bArg
                                   withObject:(NSObject *)fobject
{
    
    TESTLog(@"DirectCallFloatBlockRetObject:%f:%f:%@", aArg, bArg, fobject);
    NSObject* newObject = argBlock(aArg, bArg,fobject);
    TESTLog(@"NEW Object: %@", newObject);
    
    return newObject;
}

- (NSObject *) DirectCallCharBlockRetObject:(NSObject* (^)(char a, Byte b, NSObject *object)) argBlock charArg:(char) aArg byteArg:(Byte) bArg
withObject:(NSObject *)fobject
{
    return argBlock(aArg,bArg,fobject);
}

- (float) DirectCallFloatBlockRetFloat:(float (^)(float a, Byte b, NSObject *object, float c)) argBlock fFloat:(float) aArg byteArg:(Byte) bArg
                                 withObject:(NSObject *)fobject sFloat:(float) cArg
{
    return argBlock(aArg,bArg,fobject, cArg);
}

-(void) DirectCallDerniBlock
{
    completionBlock();
}

-(float) DirectCallWithBlock:(float(^)(float a, float b))block FFloat:(float) ffloat SFloat:(float) sfloat
{
    return block(ffloat, sfloat);
}

@end
