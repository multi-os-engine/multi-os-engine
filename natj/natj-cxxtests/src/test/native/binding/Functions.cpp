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

#include "Functions.hpp"

namespace ns_fn = natj::cxx::tests::binding::functions;

void testFunctionSimple() {
    ns_fn::lastInvocation = ns_fn::FunctionID::SIMPLE;
}

namespace natj { namespace cxx { namespace tests { namespace binding {
    namespace functions {
        enum FunctionID lastInvocation = FunctionID::ILLEGAL;

        void testFunctionWhichHasAUniqueName() {
            lastInvocation = FunctionID::UNIQUENAME;
        }
    }
} } } }

void testFunctionLotsOfArgsTest1(int a, float b, long long c, bool d, double e) {
    __NATJ_ASSERT(a == 1);
    __NATJ_ASSERT(b == 3.5);
    __NATJ_ASSERT(c == 156);
    __NATJ_ASSERT(d == 0);
    __NATJ_ASSERT(e == 89165.4151);
    ns_fn::lastInvocation = ns_fn::FunctionID::TEST1;
}

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
                                 int p63, int p64) {
    auto result = p1 + p2 + p3 + p4 + p5 + p6 + p7 + p8 + p9 + p10 + p11 + p12 +
    p13 + p14 + p15 + p16 + p17 + p18 + p19 + p20 + p21 + p22 + p23 + p24 + p25
    + p26 + p27 + p28 + p29 + p30 + p31 + p32 + p33 + p34 + p35 + p36 + p37
    + p38 + p39 + p40 + p41 + p42 + p43 + p44 + p45 + p46 + p47 + p48 + p49
    + p50 + p51 + p52 + p53 + p54 + p55 + p56 + p57 + p58 + p59 + p60 + p61
    + p62 + p63 + p64;
    ns_fn::lastInvocation = ns_fn::FunctionID::TEST2;
    __NATJ_ASSERT(result == 2080);
}

void testThrowsIntegerException() {
    throw 20;
}
