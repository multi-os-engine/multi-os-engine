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

package cxx.interfaces;

import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.ann.*;
import org.moe.natj.general.ann.NLong;
import org.moe.natj.general.ann.NULong;
import org.moe.natj.general.ann.WCharT;

@CxxHeader("binding/Primitives.hpp")
@CxxClass("natj::cxx::tests::binding::Primitives")
public interface Primitives extends CxxObject {

    @CxxMethod(isConst = true)
    boolean getI1();

    @CxxMethod(isConst = true)
    @CxxSigned
    byte getI8();

    @CxxMethod(isConst = true)
    byte getC8();

    @CxxMethod(isConst = true)
    @CxxChar16T
    char getC16();

    @CxxMethod(isConst = true)
    @CxxChar32T
    int getC32();

    @CxxMethod(isConst = true)
    @WCharT
    int getCWI();

    @CxxMethod(isConst = true)
    short getI16();

    @CxxMethod(isConst = true)
    int getI32();

    @CxxMethod(isConst = true)
    @NLong
    long getIL();

    @CxxMethod(isConst = true)
    long getI64();

    @CxxMethod(isConst = true)
    @CxxUnsigned
    byte getU8();

    @CxxMethod(isConst = true)
    char getU16();

    @CxxMethod(isConst = true)
    @CxxUnsigned
    int getU32();

    @CxxMethod(isConst = true)
    @NULong
    long getUL();

    @CxxMethod(isConst = true)
    @CxxUnsigned
    long getU64();

    @CxxMethod(isConst = true)
    float getF32();

    @CxxMethod(isConst = true)
    double getF64();

    @CxxMethod()
    void set(boolean value);

    @CxxMethod()
    void set(byte value);

    @CxxMethod("set")
    void set__3c16(@CxxChar16T char value);

    @CxxMethod("set")
    void set__3c32(@CxxChar32T int value);

    @CxxMethod("set")
    void set__3cwi(@WCharT int value);

    @CxxMethod("set")
    void set__1s(@CxxSigned byte value);

    @CxxMethod()
    void set(short value);

    @CxxMethod()
    void set(int value);

    @CxxMethod("set")
    void set__1n(@NLong long value);

    @CxxMethod()
    void set(long value);

    @CxxMethod("set")
    void set__1u(@CxxUnsigned byte value);

    @CxxMethod()
    void set(char value);

    @CxxMethod("set")
    void set__1u(@CxxUnsigned int value);

    @CxxMethod("set")
    void set__1un(@NULong long value);

    @CxxMethod("set")
    void set__1u(@CxxUnsigned long value);

    @CxxMethod()
    void set(float value);

    @CxxMethod()
    void set(double value);

    /* Requires Java 8
    @CxxMethod()
    static boolean pass(boolean value) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxMethod()
    static byte pass(byte value) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxMethod("pass")
    @CxxSigned
    static byte pass__1s(@CxxSigned byte value) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxMethod()
    static short pass(short value) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxMethod()
    static int pass(int value) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxMethod("pass")
    static long pass__1n(@NLong long value) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxMethod()
    static long pass(long value) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxMethod("pass")
    static byte pass__1u(@CxxUnsigned byte value) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxMethod()
    static char pass(char value) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxMethod("pass")
    static int pass__1u(@CxxUnsigned int value) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxMethod("pass")
    static long pass__1un(@NULong long value) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxMethod("pass")
    static long pass__1u(@CxxUnsigned long value) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxMethod()
    static float pass(float value) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxMethod()
    static double pass(double value) {
        throw new CxxExpectedGeneratedCodeException();
    }
    */
}
