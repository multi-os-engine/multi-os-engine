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


#ifndef Binding_DirectCallCalssWBlocks_h
#define Binding_DirectCallCalssWBlocks_h

#import <Foundation/Foundation.h>


@interface DirectCallClassWBlocks : NSObject

@property (copy) void (^completionBlock)(void);

-(void) DirectCallWBlock:(void (^)()) argBlock;

-(void) DirectCallWBlockObject:(void (^)(int a, double s,  NSObject *object, int b, double z, NSObject *secObject, NSObject *thirdObject)) argBlock
                    withObject: (NSObject *)fobject
                       andSObj:(NSObject *)sobject
                       andTObj:(NSObject *)tobject;

-(void) DirectCallWObjectOnlyBlock:(void (^)(NSObject *object, NSObject *secObject, NSObject *thirdObject)) argBlock
                        withObject:(NSObject *)fobject
                           andSObj:(NSObject *)sobject
                           andTObj:(NSObject *)tobject;

-(NSObject *) DirectCallWObjectBlockRetObject:(NSObject* (^)(NSObject *object)) argBlock
                        withObject:(NSObject *)fobject;

-(NSObject *) DirectCallFloatBlockRetObject:(NSObject* (^)(float a, float b, NSObject *object)) argBlock fFloat:(float) aArg sFloat:(float) bArg
                                 withObject:(NSObject *)fobject;

-(NSObject *) DirectCallCharBlockRetObject:(NSObject* (^)(char a, Byte b, NSObject *object)) argBlock charArg:(char) aArg byteArg:(Byte) bArg
                                 withObject:(NSObject *)fobject;


- (float) DirectCallFloatBlockRetFloat:(float (^)(float a, Byte b, NSObject *object, float c)) argBlock fFloat:(float) aArg byteArg:(Byte) bArg
                                 withObject:(NSObject *)fobject sFloat:(float) cArg;

-(void) DirectCallDerniBlock;

-(float) DirectCallWithBlock:(float(^)(float a, float b))block FFloat:(float) ffloat SFloat:(float) sfloat;
@end

#endif
