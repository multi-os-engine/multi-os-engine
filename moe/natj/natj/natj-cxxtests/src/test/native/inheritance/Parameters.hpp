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

#ifndef Inheritance_Parameters_hpp
#define Inheritance_Parameters_hpp

#include "../BaseTypes.hpp"

namespace natj { namespace cxx { namespace tests { namespace inheritance {
    class Parameters {
    public:
        virtual bool forwardI1(bool value) = 0;
        virtual char forwardC8(char value) = 0;
        virtual char16_t forwardC16(char16_t value) = 0;
        virtual char32_t forwardC32(char32_t value) = 0;
        virtual wchar_t forwardCWI(wchar_t value) = 0;
        virtual signed char forwardI8(signed char value) = 0;
        virtual short forwardI16(short value) = 0;
        virtual int forwardI32(int value) = 0;
        virtual long forwardIL(long value) = 0;
        virtual long long forwardI64(long long value) = 0;
        virtual unsigned char forwardU8(unsigned char value) = 0;
        virtual unsigned short forwardU16(unsigned short value) = 0;
        virtual unsigned int forwardU32(unsigned int value) = 0;
        virtual unsigned long forwardUL(unsigned long value) = 0;
        virtual unsigned long long forwardU64(unsigned long long value) = 0;
        virtual float forwardF32(float value) = 0;
        virtual double forwardF64(double value) = 0;
        virtual natj_jobject_t forwardJ(natj_jobject_t value) = 0;
        virtual MyClass forwardV(MyClass value) = 0;
        virtual MyClass& forwardR(MyClass& value) = 0;
        virtual MyClass* forwardP(MyClass* value) = 0;
        virtual ~Parameters() {}
    };
    static inline bool invokeI1(Parameters* fwd, bool value) { return fwd->forwardI1(value); }
    static inline char invokeC8(Parameters* fwd, char value) { return fwd->forwardC8(value); }
    static inline char16_t invokeC16(Parameters* fwd, char16_t value) { return fwd->forwardC16(value); }
    static inline char32_t invokeC32(Parameters* fwd, char32_t value) { return fwd->forwardC32(value); }
    static inline wchar_t invokeCWI(Parameters* fwd, wchar_t value) { return fwd->forwardCWI(value); }
    static inline signed char invokeI8(Parameters* fwd, signed char value) { return fwd->forwardI8(value); }
    static inline short invokeI16(Parameters* fwd, short value) { return fwd->forwardI16(value); }
    static inline int invokeI32(Parameters* fwd, int value) { return fwd->forwardI32(value); }
    static inline long invokeIL(Parameters* fwd, long value) { return fwd->forwardIL(value); }
    static inline long long invokeI64(Parameters* fwd, long long value) { return fwd->forwardI64(value); }
    static inline unsigned char invokeU8(Parameters* fwd, unsigned char value) { return fwd->forwardU8(value); }
    static inline unsigned short invokeU16(Parameters* fwd, unsigned short value) { return fwd->forwardU16(value); }
    static inline unsigned int invokeU32(Parameters* fwd, unsigned int value) { return fwd->forwardU32(value); }
    static inline unsigned long invokeUL(Parameters* fwd, unsigned long value) { return fwd->forwardUL(value); }
    static inline unsigned long long invokeU64(Parameters* fwd, unsigned long long value) { return fwd->forwardU64(value); }
    static inline float invokeF32(Parameters* fwd, float value) { return fwd->forwardF32(value); }
    static inline double invokeF64(Parameters* fwd, double value) { return fwd->forwardF64(value); }
    static inline natj_jobject_t invokeJ(Parameters* fwd, natj_jobject_t value) { return fwd->forwardJ(value); }
    static inline MyClass invokeV(Parameters* fwd, MyClass value) { return fwd->forwardV(value); }
    static inline MyClass& invokeR(Parameters* fwd, MyClass& value) { return fwd->forwardR(value); }
    static inline MyClass* invokeP(Parameters* fwd, MyClass* value) { return fwd->forwardP(value); }
    class ComplexParameters {
    public:
        virtual bool method(bool pI1,
                            char pC8,
                            char16_t pC16,
                            char32_t pC32,
                            wchar_t pCWI,
                            signed char pI8,
                            short pI16,
                            int pI32,
                            long pIL,
                            long long pI64,
                            unsigned char pU8,
                            unsigned short pU16,
                            unsigned int pU32,
                            unsigned long pUL,
                            unsigned long long pU64,
                            float pF32,
                            double pF64,
                            natj_jobject_t pJ,
                            MyClass pV,
                            MyClass& pR,
                            MyClass* pP) = 0;
        virtual ~ComplexParameters() {}
    };
    static inline bool invoke(ComplexParameters* cp,
                              bool pI1,
                              char pC8,
                              char16_t pC16,
                              char32_t pC32,
                              wchar_t pCWI,
                              signed char pI8,
                              short pI16,
                              int pI32,
                              long pIL,
                              long long pI64,
                              unsigned char pU8,
                              unsigned short pU16,
                              unsigned int pU32,
                              unsigned long pUL,
                              unsigned long long pU64,
                              float pF32,
                              double pF64,
                              natj_jobject_t pJ,
                              MyClass pV,
                              MyClass& pR,
                              MyClass* pP) {
        return cp->method(pI1, pC8, pC16, pC32, pCWI, pI8, pI16, pI32, pIL,
                          pI64, pU8, pU16, pU32, pUL, pU64, pF32, pF64, pJ, pV,
                          pR, pP);
    }
} } } }

#endif /* Inheritance_Parameters_hpp */
