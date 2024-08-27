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


#include "DirectCallClassCFunctions.h"
#import "test_common.h"


// Native direct call tests

void nativeTestFunction()
{
    TESTLog(@"nativeTestFunction reports success");
}

void nativeTestFunctionTakesInt(int arg)
{
    TESTLog(@"nativeTestFunctionTakesInt reports %d", arg);
}

double nativeTestFunctionTakes2DoublesRetsDouble(double d1, double d2)
{
    return d1 * d2;
}

NativeCGPoint nativeTestFunctionTakes2DoublesRetsStruct(double d1, double d2)
{
    return createNativeCGPoint(d1, d2);
}

NativeCGPoint nativeTestFunctionTakes2StructsRetsStruct(NativeCGPoint p1, NativeCGPoint p2)
{
    return createNativeCGPoint(p1.x + p2.x, p1.y + p2.y);
}

void nativeTestFunctionTakeStructByValAndChange(NativeCGPoint p)
{
    p.x = 3.0;
    p.y = 4.0;
}

void nativeTestFunctionTakeStructByRefAndChange(NativeCGPoint* p)
{
    p->x = 5.0;
    p->y = 6.0;
}

NativeCGPoint* nativeTestFunctionTakeStructByRefAndReturn(NativeCGPoint* p)
{
    p->x = 5.0;
    p->y = 6.0;
    return p;
}
