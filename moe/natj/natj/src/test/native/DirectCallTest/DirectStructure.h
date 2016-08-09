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


#ifndef Binding_DirectStructure_h
#define Binding_DirectStructure_h

struct NativeCGPoint {
    double x;
    double y;
};
typedef struct NativeCGPoint NativeCGPoint;

struct NativeCGPointFloat {
    float x;
    float y;
};
typedef struct NativeCGPointFloat NativeCGPointFloat;

struct NativeCGSize {
    double width;
    double height;
};
typedef struct NativeCGSize NativeCGSize;

struct NativeCGRect {
    NativeCGPoint origin;
    NativeCGSize size;
};
typedef struct NativeCGRect NativeCGRect;


NativeCGPoint createNativeCGPoint(double x, double y);

struct NativeComplexCGPoint {
    NativeCGPoint x;
    float y;
};
typedef struct NativeComplexCGPoint NativeComplexCGPoint;

NativeComplexCGPoint createNativeComplexCGPoint(NativeCGPoint x, float y);

#endif
