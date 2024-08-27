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

#ifndef Templates_Inheritance_hpp
#define Templates_Inheritance_hpp

#include <vector>

namespace natj { namespace cxx { namespace tests { namespace templates {
    template<typename T>
    class Base {
    public:
        T forward(const T& what) { return what; }
    };
    template<typename T>
    class Inherited: public Base<T> {
    public:
        T forwardDouble(const T& what) { return T(what.value * 2); }
    };
    template<typename T, typename U>
    class SecondInherited: public Inherited<U> {
    public:
        T forwardNTimes(const T& what, const U& howmany) {
            return T(what.value * howmany.value);
        }
    };
    class SpecializedInherited: public Inherited<MyClass> {
    public:
    };
} } } }

#endif /* Templates_Inheritance_hpp */
