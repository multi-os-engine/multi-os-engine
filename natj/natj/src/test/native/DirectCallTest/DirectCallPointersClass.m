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


#import "DirectCallPointersClass.h"
#import <dlfcn.h>

const char * helloStr = "Hello";

@implementation DirectCallPointersClass

-(void) DirectCallAllPointers:(float *)floatArg wBool:(bool *)boolArg wDouble:(double *)doubleArg
                        wByte:(char *)byteArg wInt:(int *)intArg wShort:(short *)shortArg wLong:(long *)longArg
{
    *floatArg*= 3;
    *boolArg =true;
    *doubleArg*=3;
    *byteArg*=3;
    *intArg*=3;
    *shortArg*=3;
    *longArg*=3;
}

-(void) DirectCallCharPtrPtr:(const char**)strPtr {
    *strPtr = helloStr;
}

-(double) DirectCallWithFunctionPointer:(double) a sDouble:(double) b funcPtr:(double(*)(double a, double b))func
{
    return func(a, b);
}

-(unsigned long)DirectCallWithReturnFncPointer
{
    const char *funcCName = "nativeTestFunctionTakes2DoublesRetsDouble";
    void * dlHandler = dlopen(0, RTLD_NOW|RTLD_GLOBAL);
    unsigned long handler = (unsigned long)dlsym(dlHandler, funcCName);
    return handler;
 
}

-(void) DirectCallWithFunctionPointer:(void(*)())func
{
    func();
}

-(float) DirectCallWithFunctionPointer:(float(*)(float a, float b))func FFloat:(float) ffloat SFloat:(float) sfloat
{
    return func(ffloat, sfloat);
}

@end
