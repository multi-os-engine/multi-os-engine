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

#include "Fields.hpp"

namespace natj { namespace cxx { namespace tests { namespace binding {
    m_int_t FieldA::sfI32 = 1000;
    const m_float_t M_PI_IN_NAMESPACE = 3.14f;

    void resetVariableAndFieldValues() {
        FieldA::sfI32 = 1000;
        ::ThisIsALongGlobal = 100;
    }
} } } }

m_longlong_t ThisIsALongGlobal(100);
