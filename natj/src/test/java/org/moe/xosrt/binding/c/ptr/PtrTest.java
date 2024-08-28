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

package org.moe.xosrt.binding.c.ptr;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.IntPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.general.ptr.impl.PtrFactory;
import org.junit.Test;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import static org.junit.Assert.assertTrue;

@Library("TestClasses")
@Runtime(CRuntime.class)
public class PtrTest {

    static {
        NatJ.register();
    }

    /**
     * Any unique long value
     * Used for test verification
     */
    private static long SOME_LONG_VALUE = 123456;

    /**
     * Just verify: *(int *)ptr == 123456
     */
    @CFunction
    private static native boolean isPointerOnInt123456(VoidPtr ptr);

    /********************************************
     * TESTS
     */
    @Test
    public void intPtr() {

        VoidPtr ptr = PtrFactory.newIntReference(123456);

        assertTrue( isPointerOnInt123456(ptr) );
    }

    @Test
    public void intPtrSetValue() {

        VoidPtr ptr = PtrFactory.newIntReference();
        ((IntPtr)ptr).setValue(123456);

        assertTrue( isPointerOnInt123456(ptr) );
    }

    @Test
    public void intPtrSet() {

        VoidPtr ptr = PtrFactory.newIntReference();
        ((IntPtr)ptr).set(123456);

        assertTrue( isPointerOnInt123456(ptr) );
    }

    @Test
    public void intArr() {

        VoidPtr ptr = PtrFactory.newIntArray(3, 123456);

        assertTrue( isPointerOnInt123456(ptr) );
    }

    @Test
    public void intArrFromBuff() {

        int[] buff = {123456, 2, 3};
        VoidPtr ptr = PtrFactory.newIntArray(buff);

        assertTrue( isPointerOnInt123456(ptr) );
    }

    @Test
    public void intArrSet_1() {

        VoidPtr ptr = PtrFactory.newIntArray(3);
        ((IntPtr)ptr).set(0, 123456);

        assertTrue( isPointerOnInt123456(ptr) );
    }

    @Test
    public void intArrSet_2() {

        VoidPtr ptr = PtrFactory.newIntArray(3);
        ((IntPtr)ptr).setValue(0, 123456);

        assertTrue( isPointerOnInt123456(ptr) );
    }

    @Test
    public void byteArr() {

        ByteBuffer bbuff = ByteBuffer.allocateDirect(3*2).order(ByteOrder.nativeOrder());
        bbuff.putInt(0, 123456);
        VoidPtr ptr = PtrFactory.newPtr(bbuff);

        assertTrue( isPointerOnInt123456(ptr) );
    }

}
