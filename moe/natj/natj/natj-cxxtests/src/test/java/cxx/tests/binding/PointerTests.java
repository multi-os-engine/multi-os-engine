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

import org.moe.natj.cxx.ann.CxxFunction;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.impl.PtrFactory;
import cxx.interfaces.MyClass;
import cxx.interfaces.MyClass2;
import cxx.tests.NatJTest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PointerTests extends NatJTest {

    @CxxFunction("natj::cxx::tests::MyClass::getArray")
    private static native Ptr<MyClass> getMyClassArray(int size);

    @Test
    public void testMyClassArray() {
        final Ptr<MyClass> array = getMyClassArray(5);
        for (int i = 0; i < 5; ++i) {
            assertEquals(i, array.get(i).value());
        }
        array.free();
    }

    @Test
    public void testCustomAllocatedMyClassArray() {
        final Ptr<MyClass> array = PtrFactory.newCxxObjectPtr(MyClass.class, 5, true);
        for (int i = 0; i < 5; ++i)
            assertEquals(0, array.get(i).value());
        for (int i = 0; i < 5; ++i)
            array.set(i, newMyClass(i));
        for (int i = 0; i < 5; ++i)
            assertEquals(i, array.get(i).value());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testOwnedAllocFree() {
        final Ptr<MyClass> array = PtrFactory.newCxxObjectPtr(MyClass.class, 5, true);
        array.free();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testNoDefaultConstructorAlloc() {
        PtrFactory.newCxxObjectPtr(MyClass2.class, 5, true);
    }
}
