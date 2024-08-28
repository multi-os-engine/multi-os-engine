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

import org.moe.natj.cxx.CxxRuntime;
import org.moe.natj.general.ptr.FloatPtr;
import org.moe.natj.general.ptr.VoidPtr;
import cxx.interfaces.Vector3f;
import cxx.tests.NatJTest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ObjectCastTests extends NatJTest {

    @Test
    public void testCasting() {
        final Vector3f obj = newVector3f();
        assertNotNull(obj);
        try {
            final VoidPtr ptr = CxxRuntime.castToPtr(obj);
            assertNotNull(ptr);
            assertEquals(obj._cxx_rt_peer(), ptr.getPeer().getPeer());

            final FloatPtr floatPtr = ptr.getFloatPtr();
            assertEquals(0.0f, floatPtr.getValue(0), 0.0f);
            assertEquals(0.0f, floatPtr.getValue(1), 0.0f);
            assertEquals(0.0f, floatPtr.getValue(2), 0.0f);

            floatPtr.setValue(0, 1.0f);
            floatPtr.setValue(1, 2.0f);
            floatPtr.setValue(2, 3.0f);
            assertEquals(1.0f, floatPtr.getValue(0), 0.0f);
            assertEquals(2.0f, floatPtr.getValue(1), 0.0f);
            assertEquals(3.0f, floatPtr.getValue(2), 0.0f);

            assertEquals(1.0f, obj.getX(), 0.0f);
            assertEquals(2.0f, obj.getY(), 0.0f);
            assertEquals(3.0f, obj.getZ(), 0.0f);
        } finally {
            CxxRuntime.delete(obj);
        }
    }

}
