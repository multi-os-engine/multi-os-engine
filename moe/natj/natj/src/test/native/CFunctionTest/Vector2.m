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

/** Copy of GLCVector2 */
union _Vector2
{
    struct { float x, y; };
    struct { float s, t; };
    float v[2];
} __attribute__((aligned(8)));
typedef union _Vector2 Vector2;

Vector2 Vector2Make(float x, float y)
{
    Vector2 v = { x, y };
    return v;
}

Vector2 Vector2AddScalar(Vector2 vector, float value)
{
    Vector2 v = { vector.v[0] + value,
        vector.v[1] + value };
    return v;
}

Vector2 Vector2Negate(Vector2 vector)
{
    Vector2 v = { -vector.v[0] , -vector.v[1] };
    return v;
}

