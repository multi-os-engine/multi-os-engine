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

package cxx.tests.binding;

import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.CxxRuntime;
import org.moe.natj.cxx.ann.CxxClass;
import org.moe.natj.cxx.ann.CxxConst;
import org.moe.natj.cxx.ann.CxxFunction;
import org.moe.natj.cxx.ann.CxxHeader;
import cxx.tests.NatJTest;
import org.junit.Test;

import static org.junit.Assert.*;

@CxxHeader("binding/DynamicTypes.hpp")
public class DynamicTypeTests extends NatJTest {

    @CxxClass("natj::cxx::tests::binding::DynTypeA")
    private interface DynTypeA extends CxxObject {
    }

    @CxxClass("natj::cxx::tests::binding::DynTypeB")
    private interface DynTypeB extends DynTypeA {
    }

    @CxxClass("natj::cxx::tests::binding::DynTypeC")
    private interface DynTypeC extends DynTypeA {
    }

    @CxxClass("natj::cxx::tests::binding::DynTypeD")
    private interface DynTypeD extends DynTypeC {
    }

    @CxxClass("natj::cxx::tests::binding::DynTypeX")
    private interface DynTypeX extends CxxObject {
    }

    @CxxClass("natj::cxx::tests::binding::DynTypeY")
    private interface DynTypeY extends DynTypeX {
    }

    @CxxClass("natj::cxx::tests::binding::DynTypeZ")
    private interface DynTypeZ extends DynTypeY {
    }

    @CxxClass("natj::cxx::tests::binding::DynTypeW")
    private interface DynTypeW extends DynTypeZ {
    }

    @CxxClass("natj::cxx::tests::binding::DynTypeM")
    private interface DynTypeM extends DynTypeD, DynTypeZ {
    }

    @CxxClass("natj::cxx::tests::binding::DynTypeN")
    private interface DynTypeN extends DynTypeM {
    }

    @CxxFunction("natj::cxx::tests::binding::getDynTypeA")
    private static native DynTypeA getDynTypeA();

    @CxxFunction("natj::cxx::tests::binding::getDynTypeB")
    private static native DynTypeA getDynTypeB();

    @CxxFunction("natj::cxx::tests::binding::getDynTypeC")
    private static native DynTypeA getDynTypeC();

    @CxxFunction("natj::cxx::tests::binding::getDynTypeD")
    private static native DynTypeA getDynTypeD();

    @CxxFunction("natj::cxx::tests::binding::getDynTypeX")
    private static native DynTypeX getDynTypeX();

    @CxxFunction("natj::cxx::tests::binding::getDynTypeY")
    private static native DynTypeX getDynTypeY();

    @CxxFunction("natj::cxx::tests::binding::getDynTypeZ")
    private static native DynTypeX getDynTypeZ();

    @CxxFunction("natj::cxx::tests::binding::getDynTypeW")
    private static native DynTypeX getDynTypeW();

    @CxxFunction("natj::cxx::tests::binding::getDynTypeM")
    private static native DynTypeA getDynTypeM();

    @CxxFunction("natj::cxx::tests::binding::getDynTypeN")
    private static native DynTypeA getDynTypeN();

    @CxxFunction("natj::cxx::tests::binding::getConstDynTypeA")
    @CxxConst
    private static native DynTypeA getConstDynTypeA();

    @CxxFunction("natj::cxx::tests::binding::getConstDynTypeB")
    @CxxConst
    private static native DynTypeA getConstDynTypeB();

    @CxxFunction("natj::cxx::tests::binding::getConstDynTypeC")
    @CxxConst
    private static native DynTypeA getConstDynTypeC();

    @CxxFunction("natj::cxx::tests::binding::getConstDynTypeD")
    @CxxConst
    private static native DynTypeA getConstDynTypeD();

    @CxxFunction("natj::cxx::tests::binding::getConstDynTypeX")
    @CxxConst
    private static native DynTypeX getConstDynTypeX();

    @CxxFunction("natj::cxx::tests::binding::getConstDynTypeY")
    @CxxConst
    private static native DynTypeX getConstDynTypeY();

    @CxxFunction("natj::cxx::tests::binding::getConstDynTypeZ")
    @CxxConst
    private static native DynTypeX getConstDynTypeZ();

    @CxxFunction("natj::cxx::tests::binding::getConstDynTypeW")
    @CxxConst
    private static native DynTypeX getConstDynTypeW();

    @CxxFunction("natj::cxx::tests::binding::getConstDynTypeM")
    @CxxConst
    private static native DynTypeA getConstDynTypeM();

    @CxxFunction("natj::cxx::tests::binding::getConstDynTypeN")
    @CxxConst
    private static native DynTypeA getConstDynTypeN();

    @CxxFunction("natj::cxx::tests::binding::getDynTypeA")
    private static native DynTypeD getDynTypeAAsD();

    @CxxFunction("natj::cxx::tests::binding::getConstDynTypeA")
    @CxxConst
    private static native DynTypeD getConstDynTypeAAsD();

    private static CxxObject fwd(CxxObject obj) {
        assertNotNull(obj);
        return obj;
    }

    @Test
    public void testA() {
        CxxObject tmp = fwd(getDynTypeA());
        try {
            assertFalse(tmp.cxxIsConstInterface());
            assertTrue(tmp instanceof DynTypeA);
            assertFalse(tmp instanceof DynTypeB);
            assertFalse(tmp instanceof DynTypeC);
            assertFalse(tmp instanceof DynTypeX);
        } finally {
            CxxRuntime.delete(tmp);
        }
    }

    @Test
    public void testB() {
        CxxObject tmp = fwd(getDynTypeB());
        try {
            assertFalse(tmp.cxxIsConstInterface());
            assertTrue(tmp instanceof DynTypeA);
            assertTrue(tmp instanceof DynTypeB);
            assertFalse(tmp instanceof DynTypeC);
            assertFalse(tmp instanceof DynTypeX);
        } finally {
            CxxRuntime.delete(tmp);
        }
    }

    @Test
    public void testC() {
        CxxObject tmp = fwd(getDynTypeC());
        try {
            assertFalse(tmp.cxxIsConstInterface());
            assertTrue(tmp instanceof DynTypeA);
            assertFalse(tmp instanceof DynTypeB);
            assertTrue(tmp instanceof DynTypeC);
            assertFalse(tmp instanceof DynTypeD);
            assertFalse(tmp instanceof DynTypeX);
        } finally {
            CxxRuntime.delete(tmp);
        }
    }

    @Test
    public void testD() {
        CxxObject tmp = fwd(getDynTypeD());
        try {
            assertFalse(tmp.cxxIsConstInterface());
            assertTrue(tmp instanceof DynTypeA);
            assertFalse(tmp instanceof DynTypeB);
            assertTrue(tmp instanceof DynTypeC);
            assertTrue(tmp instanceof DynTypeD);
            assertFalse(tmp instanceof DynTypeX);
        } finally {
            CxxRuntime.delete(tmp);
        }
    }

    @Test
    public void testX() {
        CxxObject tmp = fwd(getDynTypeX());
        try {
            assertFalse(tmp.cxxIsConstInterface());
            assertFalse(tmp instanceof DynTypeA);
            assertTrue(tmp instanceof DynTypeX);
            assertFalse(tmp instanceof DynTypeY);
        } finally {
            CxxRuntime.delete(tmp);
        }
    }

    @Test
    public void testY() {
        CxxObject tmp = fwd(getDynTypeY());
        try {
            assertFalse(tmp.cxxIsConstInterface());
            assertFalse(tmp instanceof DynTypeA);
            assertTrue(tmp instanceof DynTypeX);
            assertTrue(tmp instanceof DynTypeY);
            assertFalse(tmp instanceof DynTypeZ);
        } finally {
            CxxRuntime.delete(tmp);
        }
    }

    @Test
    public void testZ() {
        CxxObject tmp = fwd(getDynTypeZ());
        try {
            assertFalse(tmp.cxxIsConstInterface());
            assertFalse(tmp instanceof DynTypeA);
            assertTrue(tmp instanceof DynTypeX);
            assertTrue(tmp instanceof DynTypeY);
            assertTrue(tmp instanceof DynTypeZ);
            assertFalse(tmp instanceof DynTypeW);
        } finally {
            CxxRuntime.delete(tmp);
        }
    }

    @Test
    public void testW() {
        CxxObject tmp = fwd(getDynTypeW());
        try {
            assertFalse(tmp.cxxIsConstInterface());
            assertFalse(tmp instanceof DynTypeA);
            assertTrue(tmp instanceof DynTypeX);
            assertTrue(tmp instanceof DynTypeY);
            assertTrue(tmp instanceof DynTypeZ);
            assertTrue(tmp instanceof DynTypeW);
        } finally {
            CxxRuntime.delete(tmp);
        }
    }

    @Test
    public void testM() {
        CxxObject tmp = fwd(getDynTypeM());
        try {
            assertFalse(tmp.cxxIsConstInterface());
            assertTrue(tmp instanceof DynTypeA);
            assertFalse(tmp instanceof DynTypeB);
            assertTrue(tmp instanceof DynTypeC);
            assertTrue(tmp instanceof DynTypeD);
            assertTrue(tmp instanceof DynTypeX);
            assertTrue(tmp instanceof DynTypeY);
            assertTrue(tmp instanceof DynTypeZ);
            assertFalse(tmp instanceof DynTypeW);
            assertTrue(tmp instanceof DynTypeM);
            assertFalse(tmp instanceof DynTypeN);
        } finally {
            CxxRuntime.delete(tmp);
        }
    }

    @Test
    public void testN() {
        CxxObject tmp = fwd(getDynTypeN());
        try {
            assertFalse(tmp.cxxIsConstInterface());
            assertTrue(tmp instanceof DynTypeA);
            assertFalse(tmp instanceof DynTypeB);
            assertTrue(tmp instanceof DynTypeC);
            assertTrue(tmp instanceof DynTypeD);
            assertTrue(tmp instanceof DynTypeX);
            assertTrue(tmp instanceof DynTypeY);
            assertTrue(tmp instanceof DynTypeZ);
            assertFalse(tmp instanceof DynTypeW);
            assertTrue(tmp instanceof DynTypeM);
            assertTrue(tmp instanceof DynTypeN);
        } finally {
            CxxRuntime.delete(tmp);
        }
    }

    @Test
    public void testConstA() {
        CxxObject tmp = fwd(getConstDynTypeA());
        try {
            assertTrue(tmp.cxxIsConstInterface());
            assertTrue(tmp instanceof DynTypeA);
            assertFalse(tmp instanceof DynTypeB);
            assertFalse(tmp instanceof DynTypeC);
            assertFalse(tmp instanceof DynTypeX);
        } finally {
            CxxRuntime.delete(tmp);
        }
    }

    @Test
    public void testConstB() {
        CxxObject tmp = fwd(getConstDynTypeB());
        try {
            assertTrue(tmp.cxxIsConstInterface());
            assertTrue(tmp instanceof DynTypeA);
            assertTrue(tmp instanceof DynTypeB);
            assertFalse(tmp instanceof DynTypeC);
            assertFalse(tmp instanceof DynTypeX);
        } finally {
            CxxRuntime.delete(tmp);
        }
    }

    @Test
    public void testConstC() {
        CxxObject tmp = fwd(getConstDynTypeC());
        try {
            assertTrue(tmp.cxxIsConstInterface());
            assertTrue(tmp instanceof DynTypeA);
            assertFalse(tmp instanceof DynTypeB);
            assertTrue(tmp instanceof DynTypeC);
            assertFalse(tmp instanceof DynTypeD);
            assertFalse(tmp instanceof DynTypeX);
        } finally {
            CxxRuntime.delete(tmp);
        }
    }

    @Test
    public void testConstD() {
        CxxObject tmp = fwd(getConstDynTypeD());
        try {
            assertTrue(tmp.cxxIsConstInterface());
            assertTrue(tmp instanceof DynTypeA);
            assertFalse(tmp instanceof DynTypeB);
            assertTrue(tmp instanceof DynTypeC);
            assertTrue(tmp instanceof DynTypeD);
            assertFalse(tmp instanceof DynTypeX);
        } finally {
            CxxRuntime.delete(tmp);
        }
    }

    @Test
    public void testConstX() {
        CxxObject tmp = fwd(getConstDynTypeX());
        try {
            assertTrue(tmp.cxxIsConstInterface());
            assertFalse(tmp instanceof DynTypeA);
            assertTrue(tmp instanceof DynTypeX);
            assertFalse(tmp instanceof DynTypeY);
        } finally {
            CxxRuntime.delete(tmp);
        }
    }

    @Test
    public void testConstY() {
        CxxObject tmp = fwd(getConstDynTypeY());
        try {
            assertTrue(tmp.cxxIsConstInterface());
            assertFalse(tmp instanceof DynTypeA);
            assertTrue(tmp instanceof DynTypeX);
            assertTrue(tmp instanceof DynTypeY);
            assertFalse(tmp instanceof DynTypeZ);
        } finally {
            CxxRuntime.delete(tmp);
        }
    }

    @Test
    public void testConstZ() {
        CxxObject tmp = fwd(getConstDynTypeZ());
        try {
            assertTrue(tmp.cxxIsConstInterface());
            assertFalse(tmp instanceof DynTypeA);
            assertTrue(tmp instanceof DynTypeX);
            assertTrue(tmp instanceof DynTypeY);
            assertTrue(tmp instanceof DynTypeZ);
            assertFalse(tmp instanceof DynTypeW);
        } finally {
            CxxRuntime.delete(tmp);
        }
    }

    @Test
    public void testConstW() {
        CxxObject tmp = fwd(getConstDynTypeW());
        try {
            assertTrue(tmp.cxxIsConstInterface());
            assertFalse(tmp instanceof DynTypeA);
            assertTrue(tmp instanceof DynTypeX);
            assertTrue(tmp instanceof DynTypeY);
            assertTrue(tmp instanceof DynTypeZ);
            assertTrue(tmp instanceof DynTypeW);
        } finally {
            CxxRuntime.delete(tmp);
        }
    }

    @Test
    public void testConstM() {
        CxxObject tmp = fwd(getConstDynTypeM());
        try {
            assertTrue(tmp.cxxIsConstInterface());
            assertTrue(tmp instanceof DynTypeA);
            assertFalse(tmp instanceof DynTypeB);
            assertTrue(tmp instanceof DynTypeC);
            assertTrue(tmp instanceof DynTypeD);
            assertTrue(tmp instanceof DynTypeX);
            assertTrue(tmp instanceof DynTypeY);
            assertTrue(tmp instanceof DynTypeZ);
            assertFalse(tmp instanceof DynTypeW);
            assertTrue(tmp instanceof DynTypeM);
            assertFalse(tmp instanceof DynTypeN);
        } finally {
            CxxRuntime.delete(tmp);
        }
    }

    @Test
    public void testConstN() {
        CxxObject tmp = fwd(getConstDynTypeN());
        try {
            assertTrue(tmp.cxxIsConstInterface());
            assertTrue(tmp instanceof DynTypeA);
            assertFalse(tmp instanceof DynTypeB);
            assertTrue(tmp instanceof DynTypeC);
            assertTrue(tmp instanceof DynTypeD);
            assertTrue(tmp instanceof DynTypeX);
            assertTrue(tmp instanceof DynTypeY);
            assertTrue(tmp instanceof DynTypeZ);
            assertFalse(tmp instanceof DynTypeW);
            assertTrue(tmp instanceof DynTypeM);
            assertTrue(tmp instanceof DynTypeN);
        } finally {
            CxxRuntime.delete(tmp);
        }
    }

    @Test(expected = java.lang.ClassCastException.class)
    public void testBadBinding() {
        assertNotNull(getDynTypeAAsD());
    }

    @Test(expected = java.lang.ClassCastException.class)
    public void testBadConstBinding() {
        assertNotNull(getConstDynTypeAAsD());
    }
}
