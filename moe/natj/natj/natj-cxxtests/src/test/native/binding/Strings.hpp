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

#ifndef Binding_Strings_hpp
#define Binding_Strings_hpp

#include "../BaseTypes.hpp"

namespace natj { namespace cxx { namespace tests { namespace binding {
    inline std::string forwardStdString(const std::string& value) {
        return value;
    }
} } } }

namespace natj { namespace cxx { namespace tests { namespace inherited {
    class StringForwarder {
    public:
        virtual std::string forward(const std::string& string) = 0;
        virtual ~StringForwarder() {}
    };
} } } }

#endif /* Binding_Strings_hpp */
