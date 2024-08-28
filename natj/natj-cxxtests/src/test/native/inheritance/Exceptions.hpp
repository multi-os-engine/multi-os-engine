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

#ifndef Inheritance_Exceptions_hpp
#define Inheritance_Exceptions_hpp

#include "../BaseTypes.hpp"

namespace natj { namespace cxx { namespace tests { namespace inheritance {
    class Exceptions {
    public:
        Exceptions() {}
        virtual ~Exceptions() {}
        virtual void throwException() {}
    };
    inline void callExceptionThrower(Exceptions *exc) {
        exc->throwException();
    }
} } } }

#endif /* Inheritance_Exceptions_hpp */
