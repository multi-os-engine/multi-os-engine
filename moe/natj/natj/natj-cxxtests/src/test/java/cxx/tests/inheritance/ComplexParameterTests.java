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

package cxx.tests.inheritance;

import org.moe.natj.cxx.CxxInheritedObject;
import org.moe.natj.cxx.CxxMethodVirtuality;
import org.moe.natj.cxx.CxxRuntime;
import org.moe.natj.cxx.ann.*;
import org.moe.natj.general.ann.NLong;
import org.moe.natj.general.ann.NULong;
import org.moe.natj.general.ann.WCharT;
import cxx.interfaces.MyClass;
import cxx.tests.NatJTest;
import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexParameterTests extends NatJTest {

    @CxxClass("natj::cxx::tests::inheritance::ComplexParameters")
    @CxxHeader("inheritance/Parameters.hpp")
    private interface ComplexParameters {

        @CxxMethod(virtuality = CxxMethodVirtuality.PURE_VIRTUAL)
        boolean method(boolean pI1,
                       byte pC8,
                       @CxxChar16T char pC16,
                       @CxxChar32T int pC32,
                       @WCharT int pCWI,
                       @CxxSigned byte pI8,
                       short pI16,
                       int pI32,
                       @NLong long pIL,
                       long pI64,
                       @CxxUnsigned byte pU8,
                       char pU16,
                       @CxxUnsigned int pU32,
                       @NULong long pUL,
                       @CxxUnsigned long pU64,
                       float pF32,
                       double pF64,
                       @CxxJavaObject Object pO,
                       @CxxByValue MyClass pV,
                       @CxxByReference MyClass pR,
                       MyClass pP);
    }


    @CxxFunction("natj::cxx::tests::inheritance::invoke")
    private static native boolean invoke(ComplexParameters cp,
                                         boolean pI1,
                                         byte pC8,
                                         @CxxChar16T char pC16,
                                         @CxxChar32T int pC32,
                                         @WCharT int pCWI,
                                         @CxxSigned byte pI8,
                                         short pI16,
                                         int pI32,
                                         @NLong long pIL,
                                         long pI64,
                                         @CxxUnsigned byte pU8,
                                         char pU16,
                                         @CxxUnsigned int pU32,
                                         @NULong long pUL,
                                         @CxxUnsigned long pU64,
                                         float pF32,
                                         double pF64,
                                         @CxxJavaObject Object pO,
                                         @CxxByValue MyClass pV,
                                         @CxxByReference MyClass pR,
                                         MyClass pP);

    @CxxInheritedClass("natj::java::tests::inheritance::ComplexParameters")
    private static class Inherited extends CxxInheritedObject implements ComplexParameters {

        private boolean invoked = false;

        @CxxInheritedConstructor()
        private static native long newInherited(long java);

        public Inherited() {
            super(new ICxxConstructor() {
                @Override
                public long construct(long java) {
                    return Inherited.newInherited(java);
                }
            });
        }

        @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
        public boolean method(boolean pI1,
                              byte pC8,
                              @CxxChar16T char pC16,
                              @CxxChar32T int pC32,
                              @WCharT int pCWI,
                              @CxxSigned byte pI8,
                              short pI16,
                              int pI32,
                              @NLong long pIL,
                              long pI64,
                              @CxxUnsigned byte pU8,
                              char pU16,
                              @CxxUnsigned int pU32,
                              @NULong long pUL,
                              @CxxUnsigned long pU64,
                              float pF32,
                              double pF64,
                              @CxxJavaObject Object pO,
                              @CxxByValue MyClass pV,
                              @CxxByReference MyClass pR,
                              MyClass pP) {
            invoked = true;
            return pI1 == VALUE_I1
                    && pC8 == VALUE_C8
                    && pC16 == VALUE_C16
                    && pC32 == VALUE_C32
                    && pCWI == VALUE_CWI
                    && pI8 == VALUE_I8
                    && pI16 == VALUE_I16
                    && pI32 == VALUE_I32
                    && pIL == VALUE_IL
                    && pI64 == VALUE_I64
                    && pU8 == VALUE_U8
                    && pU16 == VALUE_U16
                    && pU32 == VALUE_U32
                    && pUL == VALUE_UL
                    && pU64 == VALUE_U64
                    && pF32 == VALUE_F32
                    && pF64 == VALUE_F64
                    && pO.equals(JAVA_OBJECT)
                    && pV != null
                    && pR == MY_CLASS
                    && pP == MY_CLASS;
        }
    }

    @Test
    public void testComplexParameters() {
        Inherited inherited = new Inherited();
        assertNotNull(inherited);
        assertNotEquals(inherited._cxx_rt_peer(), 0);
        assertFalse(inherited.invoked);
        assertTrue(invoke(inherited, VALUE_I1, VALUE_C8, VALUE_C16, VALUE_C32, VALUE_CWI, VALUE_I8, VALUE_I16,
                VALUE_I32, VALUE_IL, VALUE_I64, VALUE_U8, VALUE_U16, VALUE_U32, VALUE_UL, VALUE_U64, VALUE_F32,
                VALUE_F64, JAVA_OBJECT, MY_CLASS, MY_CLASS, MY_CLASS));
        assertTrue(inherited.invoked);
        CxxRuntime.delete(inherited);
    }
}
