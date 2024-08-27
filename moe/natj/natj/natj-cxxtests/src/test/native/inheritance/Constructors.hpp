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

#ifndef Inheritance_Constructors_hpp
#define Inheritance_Constructors_hpp

#include "../BaseTypes.hpp"

namespace natj { namespace cxx { namespace tests { namespace inheritance {
    class Constructors {
    public:
        enum InvocationID : int {
            CTOR_I1,
            CTOR_C8,
            CTOR_C16,
            CTOR_C32,
            CTOR_CWI,
            CTOR_I8,
            CTOR_I16,
            CTOR_I32,
            CTOR_IL,
            CTOR_I64,
            CTOR_U8,
            CTOR_U16,
            CTOR_U32,
            CTOR_UL,
            CTOR_U64,
            CTOR_F32,
            CTOR_F64,
            CTOR_J,
            CTOR_V,
            CTOR_R,
            CTOR_P,
        };
    private:
        const InvocationID __invoked;
    public:
        Constructors(bool) : __invoked(CTOR_I1) {}
        Constructors(char) : __invoked(CTOR_C8) {}
        Constructors(char16_t) : __invoked(CTOR_C16) {}
        Constructors(char32_t) : __invoked(CTOR_C32) {}
        Constructors(wchar_t) : __invoked(CTOR_CWI) {}
        Constructors(signed char) : __invoked(CTOR_I8) {}
        Constructors(short) : __invoked(CTOR_I16) {}
        Constructors(int) : __invoked(CTOR_I32) {}
        Constructors(long) : __invoked(CTOR_IL) {}
        Constructors(long long) : __invoked(CTOR_I64) {}
        Constructors(unsigned char) : __invoked(CTOR_U8) {}
        Constructors(unsigned short) : __invoked(CTOR_U16) {}
        Constructors(unsigned int) : __invoked(CTOR_U32) {}
        Constructors(unsigned long) : __invoked(CTOR_UL) {}
        Constructors(unsigned long long) : __invoked(CTOR_U64) {}
        Constructors(float) : __invoked(CTOR_F32) {}
        Constructors(double) : __invoked(CTOR_F64) {}
        Constructors(natj_jobject_t) : __invoked(CTOR_J) {}
        Constructors(MyClass) : __invoked(CTOR_V) {}
        // C++ can't choose between this and the by value case
        // Constructors(MyClass&) : __invoked(CTOR_R) {}
        Constructors(MyClass*) : __invoked(CTOR_P) {}

        InvocationID invoked() const { return __invoked; }
    };
} } } }

#endif /* Inheritance_Constructors_hpp */
