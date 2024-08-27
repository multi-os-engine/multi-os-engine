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

#ifndef Binding_ObjectContainer_hpp
#define Binding_ObjectContainer_hpp

#include "../BaseTypes.hpp"

namespace natj { namespace cxx { namespace tests { namespace binding {
    class ObjectContainer {
    public:
        enum InvocationID : int {
            ILLEGAL,
            BY_VALUE,
            BY_REFERENCE,
            BY_POINTER,
            CONST_BY_VALUE,
            CONST_BY_REFERENCE,
            CONST_BY_POINTER,
            SET_BY_VALUE,
            SET_BY_REFERENCE,
            SET_BY_POINTER,
        };
        static InvocationID lastInvocation;
    private:
        MyClass *ref = new MyClass(0);
        bool didIAlloc = true;
        void swap(MyClass* instance, bool isNew = false) {
            if (didIAlloc && ref) delete ref;
            ref = instance;
            didIAlloc = isNew;
        }
    public:
        MyClass byValue() { lastInvocation = BY_VALUE; return *ref; }
        const MyClass byValue() const { lastInvocation = CONST_BY_VALUE; return *ref; }
        void setByValue(MyClass p) {
            swap(new MyClass(p), true);
            lastInvocation = SET_BY_VALUE;
        }

        MyClass& byReference() { lastInvocation = BY_REFERENCE; return *ref; }
        const MyClass& byReference() const { lastInvocation = CONST_BY_REFERENCE; return *ref; }
        void setByReference(MyClass& p) {
            __NATJ_ASSERT(p.compare(&p));
            swap(&p);
            lastInvocation = SET_BY_REFERENCE;
        }

        MyClass* byPointer() { lastInvocation = BY_POINTER; return ref; }
        const MyClass* byPointer() const { lastInvocation = CONST_BY_POINTER; return ref; }
        void setByPointer(MyClass* p) {
            swap(p);
            lastInvocation = SET_BY_POINTER;
        }
        const ObjectContainer* thisAsConst() const {
            return this;
        }
    };
} } } }

#endif /* Binding_ObjectContainer_hpp */
