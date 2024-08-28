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

#ifndef Binding_Functions_hpp
#define Binding_Functions_hpp

#include "../BaseTypes.hpp"

void testFunctionSimple();

namespace natj { namespace cxx { namespace tests { namespace binding {
    namespace functions {
        extern enum FunctionID : int {
            ILLEGAL,
            SIMPLE,
            UNIQUENAME,
            TEST1,
            TEST2,
        } lastInvocation;
        void testFunctionWhichHasAUniqueName();
    }
} } } }

void testFunctionLotsOfArgsTest1(int a, float b, long long c, bool d, double e);

void testFunctionLotsOfArgsTest2(int p1, int p2, int p3, int p4, int p5, int p6, int p7,
                                 int p8, int p9, int p10, int p11, int p12, int p13, int p14,
                                 int p15, int p16, int p17, int p18, int p19, int p20,
                                 int p21, int p22, int p23, int p24, int p25, int p26,
                                 int p27, int p28, int p29, int p30, int p31, int p32,
                                 int p33, int p34, int p35, int p36, int p37, int p38,
                                 int p39, int p40, long long p41, int p42, int p43, int p44,
                                 int p45, int p46, int p47, int p48, int p49, int p50,
                                 int p51, int p52, int p53, int p54, int p55, int p56,
                                 int p57, int p58, int p59, int p60, int p61, int p62,
                                 int p63, int p64);

void testThrowsIntegerException();

template <class T>
void* getAddressOfReferenceAndSet(T value, T& target) {
    target = value;
    return &target;
}

template <class T>
const T& getReferenceFromAddress(const T* target) {
    return *target;
}

inline const natj::cxx::tests::MyClass* getMyClass() {
    return new natj::cxx::tests::MyClass(0);
}

inline void checkMyClass(natj::cxx::tests::MyClass* mc) {
    __NATJ_ASSERT(mc != nullptr);
}

template<class T>
T addTemplateTypes(T a, T b) { return a + b; }

#endif /* Binding_Functions_hpp */
