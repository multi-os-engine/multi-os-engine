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

#ifndef Binding_Hierarchy_hpp
#define Binding_Hierarchy_hpp

#include "../BaseTypes.hpp"

namespace natj { namespace cxx { namespace tests { namespace binding {
    class SingleA {
    public:
        enum InvocationID : int {
            ILLEGAL,
            A_CTOR,
            A_FOO0,
            A_FOO1,
            A_FOO2,
            A_FOO3,
            A_ADD,
            A_SUB,
            A_CAST_BOOL,
            A_BAR_A,
            B_CTOR,
            B_FOO0,
            B_FOO1,
            B_FOO2,
            B_FOO3,
            B_ADD,
            B_SUB,
            B_CAST_BOOL,
            B_BAR_B,
            C_CTOR,
            C_FOO0,
            C_FOO1,
            C_FOO2,
            C_FOO3,
            C_BAR_C,
            D_CTOR,
            D_FOO0,
            D_FOO1,
            D_FOO2,
            D_FOO3,
            D_BAR_D,
        };
        static InvocationID lastInvocation;
    public:
        SingleA() { lastInvocation = A_CTOR; }
        virtual ~SingleA() {}

        void foo0() { lastInvocation = A_FOO0; }
        virtual void foo1() { lastInvocation = A_FOO1; }
        virtual void foo2() { lastInvocation = A_FOO2; }
        virtual void foo3() { lastInvocation = A_FOO3; }
        virtual SingleA operator+(int rhs) const { lastInvocation = A_ADD; return *this; }
        virtual SingleA operator-(int rhs) const { lastInvocation = A_SUB; return *this; }
        virtual operator bool() { lastInvocation = A_CAST_BOOL; return true; }

        void barA() { lastInvocation = A_BAR_A; }
    };
    class SingleB : public  SingleA {
    public:
        SingleB() { lastInvocation = B_CTOR; }
        virtual ~SingleB() {}

        void foo0() { lastInvocation = B_FOO0; }
        void foo1() override { lastInvocation = B_FOO1; }
        virtual void foo2() override { lastInvocation = B_FOO2; }
        virtual void foo3() override { lastInvocation = B_FOO3; }
        virtual SingleA operator+(int rhs) const override { lastInvocation = B_ADD; return *this; }
        virtual SingleA operator-(const SingleB& rhs) const { lastInvocation = B_SUB; return *this; }
        virtual operator bool() override { lastInvocation = B_CAST_BOOL; return false; }

        void barB() { lastInvocation = B_BAR_B; }
    };
    class SingleC : public  SingleB {
    public:
        SingleC() { lastInvocation = C_CTOR; }
        virtual ~SingleC() {}

        void foo0() { lastInvocation = C_FOO0; }
        void foo1() override { lastInvocation = C_FOO1; }
        void foo2() override { lastInvocation = C_FOO2; }
        virtual void foo3() override { lastInvocation = C_FOO3; }

        void barC() { lastInvocation = C_BAR_C; }
    };
    class SingleD : public  SingleC {
    public:
        SingleD() { lastInvocation = D_CTOR; }
        virtual ~SingleD() {}

        void foo0() { lastInvocation = D_FOO0; }
        void foo1() override { lastInvocation = D_FOO1; }
        void foo2() override { lastInvocation = D_FOO2; }
        void foo3() override { lastInvocation = D_FOO3; }

        void barD() { lastInvocation = D_BAR_D; }
    };
    inline SingleA* getTrickyCInstance() {
        return new SingleC;
    }

    class PureA {
    public:
        PureA() { }
        virtual ~PureA() {}
        virtual void foo() = 0;
    };
    class NonPureB : public  PureA {
    public:
        NonPureB() { }
        void foo() override { }
    };
} } } }

#endif /* Binding_Hierarchy_hpp */
