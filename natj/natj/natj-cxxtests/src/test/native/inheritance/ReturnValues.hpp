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

#ifndef Inheritance_ReturnValues_hpp
#define Inheritance_ReturnValues_hpp

#include "../BaseTypes.hpp"

namespace natj { namespace cxx { namespace tests { namespace inheritance {
    class ReturnValues {
    public:
        virtual void method() = 0;
        virtual bool methodI1() = 0;
        virtual char methodC8() = 0;
        virtual char16_t methodC16() = 0;
        virtual char32_t methodC32() = 0;
        virtual wchar_t methodCWI() = 0;
        virtual signed char methodI8() = 0;
        virtual short methodI16() = 0;
        virtual int methodI32() = 0;
        virtual long methodIL() = 0;
        virtual long long methodI64() = 0;
        virtual unsigned char methodU8() = 0;
        virtual unsigned short methodU16() = 0;
        virtual unsigned int methodU32() = 0;
        virtual unsigned long methodUL() = 0;
        virtual unsigned long long methodU64() = 0;
        virtual float methodF32() = 0;
        virtual double methodF64() = 0;
        virtual natj_jobject_t methodJ() = 0;
        virtual MyClass methodV() = 0;
        virtual MyClass& methodR() = 0;
        virtual MyClass* methodP() = 0;
        virtual ~ReturnValues() {}
    };
    static inline void invoke(ReturnValues* base) { base->method(); }
    static inline bool invokeI1(ReturnValues* base) { return base->methodI1(); }
    static inline char invokeC8(ReturnValues* base) { return base->methodC8(); }
    static inline char16_t invokeC16(ReturnValues* base) { return base->methodC16(); }
    static inline char32_t invokeC32(ReturnValues* base) { return base->methodC32(); }
    static inline wchar_t invokeCWI(ReturnValues* base) { return base->methodCWI(); }
    static inline signed char invokeI8(ReturnValues* base) { return base->methodI8(); }
    static inline short invokeI16(ReturnValues* base) { return base->methodI16(); }
    static inline int invokeI32(ReturnValues* base) { return base->methodI32(); }
    static inline long invokeIL(ReturnValues* base) { return base->methodIL(); }
    static inline long long invokeI64(ReturnValues* base) { return base->methodI64(); }
    static inline unsigned char invokeU8(ReturnValues* base) { return base->methodU8(); }
    static inline unsigned short invokeU16(ReturnValues* base) { return base->methodU16(); }
    static inline unsigned int invokeU32(ReturnValues* base) { return base->methodU32(); }
    static inline unsigned long invokeUL(ReturnValues* base) { return base->methodUL(); }
    static inline unsigned long long invokeU64(ReturnValues* base) { return base->methodU64(); }
    static inline float invokeF32(ReturnValues* base) { return base->methodF32(); }
    static inline double invokeF64(ReturnValues* base) { return base->methodF64(); }
    static inline natj_jobject_t invokeJ(ReturnValues* base) { return base->methodJ(); }
    static inline MyClass invokeV(ReturnValues* base) { return base->methodV(); }
    static inline MyClass& invokeR(ReturnValues* base) {
        MyClass& cls = base->methodR();
        __NATJ_ASSERT(cls.compare(&cls));
        return cls;
    }
    static inline MyClass* invokeP(ReturnValues* base) { return base->methodP(); }
} } } }

#endif /* Inheritance_ReturnValues_hpp */
