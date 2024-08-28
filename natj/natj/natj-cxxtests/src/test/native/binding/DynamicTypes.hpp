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

#ifndef Binding_DynamicTypes_hpp
#define Binding_DynamicTypes_hpp

#include "../BaseTypes.hpp"

namespace natj { namespace cxx { namespace tests { namespace binding {

#define INIT_DYNTYPE(T, tid) public: static constexpr int TID = tid; \
  virtual int getTID() const override { return TID; } \
  virtual ~T() {}

    class DynTypeRoot {
    public:
        virtual int getTID() const = 0;
        virtual ~DynTypeRoot() {}
    };
    class DynTypeA : public DynTypeRoot { INIT_DYNTYPE(DynTypeA, 1) };
    class DynTypeB : public DynTypeA { INIT_DYNTYPE(DynTypeB, 2) };
    class DynTypeC : public DynTypeA { INIT_DYNTYPE(DynTypeC, 3) };
    class DynTypeD : public DynTypeC { INIT_DYNTYPE(DynTypeD, 4) };
    class DynTypeX : public DynTypeRoot { INIT_DYNTYPE(DynTypeX, 11) };
    class DynTypeY : public DynTypeX { INIT_DYNTYPE(DynTypeY, 12) };
    class DynTypeZ : public DynTypeY { INIT_DYNTYPE(DynTypeZ, 13) };
    class DynTypeW : public DynTypeZ { INIT_DYNTYPE(DynTypeW, 14) };
    class DynTypeM : public DynTypeD, public DynTypeZ {
        INIT_DYNTYPE(DynTypeM, 21)
    };
    class DynTypeN : public DynTypeM { INIT_DYNTYPE(DynTypeN, 22) };

    inline DynTypeA* getDynTypeA() { return new DynTypeA(); }
    inline DynTypeA* getDynTypeB() { return new DynTypeB(); }
    inline DynTypeA* getDynTypeC() { return new DynTypeC(); }
    inline DynTypeA* getDynTypeD() { return new DynTypeD(); }
    inline DynTypeX* getDynTypeX() { return new DynTypeX(); }
    inline DynTypeX* getDynTypeY() { return new DynTypeY(); }
    inline DynTypeX* getDynTypeZ() { return new DynTypeZ(); }
    inline DynTypeX* getDynTypeW() { return new DynTypeW(); }
    inline DynTypeA* getDynTypeM() { return new DynTypeM(); }
    inline DynTypeA* getDynTypeN() { return new DynTypeN(); }

    inline const DynTypeA* getConstDynTypeA() { return new DynTypeA(); }
    inline const DynTypeA* getConstDynTypeB() { return new DynTypeB(); }
    inline const DynTypeA* getConstDynTypeC() { return new DynTypeC(); }
    inline const DynTypeA* getConstDynTypeD() { return new DynTypeD(); }
    inline const DynTypeX* getConstDynTypeX() { return new DynTypeX(); }
    inline const DynTypeX* getConstDynTypeY() { return new DynTypeY(); }
    inline const DynTypeX* getConstDynTypeZ() { return new DynTypeZ(); }
    inline const DynTypeX* getConstDynTypeW() { return new DynTypeW(); }
    inline const DynTypeA* getConstDynTypeM() { return new DynTypeM(); }
    inline const DynTypeA* getConstDynTypeN() { return new DynTypeN(); }
} } } }

#endif /* Binding_DynamicTypes_hpp */
