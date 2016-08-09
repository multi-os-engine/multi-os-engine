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

#ifndef Binding_SpecialObjects_hpp
#define Binding_SpecialObjects_hpp

#include "../BaseTypes.hpp"

#include <vector>
#include <memory>

namespace natj { namespace cxx { namespace tests { namespace binding {
    class PrivateDtor {
        ~PrivateDtor() {}

    public:
        void Release() { delete this; }
    };

    class StdVecUniqPtrElem {
    public:
    };
    typedef std::vector<std::unique_ptr<StdVecUniqPtrElem>> StdVecUniqPtr;
    inline StdVecUniqPtr getStdVecUniqPtr() {
        return StdVecUniqPtr{};
    }

    template<class T>
    struct Multiplier {
        const T by;
        Multiplier(T __by) : by(__by) {}
        T operator()( T t ) const { return t * by; }
    };
} } } }

#endif /* Binding_SpecialObjects_hpp */
