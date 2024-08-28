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

package cxx.tests;

import org.moe.natj.c.CRuntime;
import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.CxxRuntime;
import org.moe.natj.cxx.ann.CxxConstructor;
import cxx.interfaces.MyClass;
import cxx.interfaces.MyClass2;
import cxx.interfaces.Vector3f;

import java.util.HashSet;

public class NatJTest {

    public static final String JAVA_OBJECT = "hello";
    public static MyClass MY_CLASS;

    @CxxConstructor()
    public static native MyClass newMyClass();

    @CxxConstructor()
    public static native MyClass newMyClass(int value);

    @CxxConstructor()
    public static native MyClass2 newMyClass2(int value);

    public static MyClass2 newMyClass2() {
        return newMyClass2(0);
    }

    @CxxConstructor()
    public static native Vector3f newVector3f();

    static {
        // TODO: this is a workaround for compile issues produced by the need of static linking STL on Windows
        if (System.getProperty("moe.platform.name") == null) {
            if (!System.getProperty("os.name").startsWith("Windows")) {
                System.loadLibrary("natj");
            }
            System.loadLibrary("TestClassesCxx");
        }
        MY_CLASS = newMyClass();
    }

    public static class ObjectPool {
        private final HashSet<CxxObject> objects = new HashSet<CxxObject>();

        public synchronized <T extends CxxObject> T add(T object) {
            if (object != null) {
                objects.add(object);
            }
            return object;
        }

        public synchronized void clear() {
            for (CxxObject object : objects) {
                CxxRuntime.delete(object);
            }
            objects.clear();
        }
    }

    public static void assertIdentical(CxxObject a, CxxObject b) {
        if (a == null) throw new NullPointerException();
        if (!a.cxxIsIdenticalTo(b)) throw new RuntimeException("assertIdentical failed");
    }

    public static final float DELTA_F = 0.0f;
    public static final double DELTA_D = 0.0;

    public static final boolean VALUE_I1 = true;
    public static final byte VALUE_C8 = 32;
    public static final char VALUE_C16 = 32 * 16;
    public static final int VALUE_C32 = 32 * 32;
    public static final int VALUE_CWI;
    public static final byte VALUE_I8 = -64;
    public static final short VALUE_I16 = -16000;
    public static final int VALUE_I32 = -1073741824;
    public static final long VALUE_IL;
    public static final long VALUE_I64 = -4611686018427390000L;
    public static final byte VALUE_U8 = 64;
    public static final char VALUE_U16 = 16000;
    public static final int VALUE_U32 = 1073741824;
    public static final long VALUE_UL;
    public static final long VALUE_U64 = 4611686018427390000L;
    public static final float VALUE_F32 = 1000.123f;
    public static final double VALUE_F64 = 1000000.123456;

    public static final boolean VALUE_I1_2 = false;
    public static final byte VALUE_C8_2 = VALUE_C8 + 1;
    public static final char VALUE_C16_2 = VALUE_C16 + 1;
    public static final int VALUE_C32_2 = VALUE_C32 + 1;
    public static final int VALUE_CWI_2;
    public static final byte VALUE_I8_2 = VALUE_I8 + 1;
    public static final short VALUE_I16_2 = VALUE_I16 + 1;
    public static final int VALUE_I32_2 = VALUE_I32 + 1;
    public static final long VALUE_IL_2;
    public static final long VALUE_I64_2 = VALUE_I64 + 1;
    public static final byte VALUE_U8_2 = VALUE_U8 + 1;
    public static final char VALUE_U16_2 = VALUE_U16 + 1;
    public static final int VALUE_U32_2 = VALUE_U32 + 1;
    public static final long VALUE_UL_2;
    public static final long VALUE_U64_2 = VALUE_U64 + 1;
    public static final float VALUE_F32_2 = VALUE_F32 + 1;
    public static final double VALUE_F64_2 = VALUE_F64 + 1;

    static {
        if (CRuntime.NATIVE_LONG_SIZE == 8) {
            VALUE_IL = 0x8000000000000000L;
            VALUE_IL_2 = VALUE_IL + 1;
            VALUE_UL = 0x7000000000000000L;
            VALUE_UL_2 = VALUE_UL + 1;
        } else {
            VALUE_IL = 0x80000000;
            VALUE_IL_2 = VALUE_IL + 1;
            VALUE_UL = 0x70000000;
            VALUE_UL_2 = VALUE_UL + 1;
        }
        if (CRuntime.NATIVE_WCHART_SIZE == 4) {
            VALUE_CWI = 0x70000000;
            VALUE_CWI_2 = VALUE_CWI + 1;
        } else {
            VALUE_CWI = 0x7000;
            VALUE_CWI_2 = VALUE_CWI + 1;
        }
    }
}
