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

package org.moe.xosrt.binding.test.structTest;

import org.moe.xosrt.binding.test.common.NativeCGPoint;
import org.moe.xosrt.binding.test.common.NativeCGRect;
import org.moe.xosrt.binding.test.common.XrtTest;
import org.moe.xosrt.binding.test.structTest.TestClasses.StructFactory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class StructTest extends XrtTest {

    @Test
    public void simpleStructWrite()
    {
        /*
         * In native expected struct with
         * 100.0f and 200.0f
         */

        NativeCGPoint point = new NativeCGPoint(100.0f, 200.0f);
        StructFactory test = StructFactory.alloc().init();

        assertTrue(test.checkCGPoint(point));
    }

    @Test
    public void simpleStructRead()
    {
        /*
         * Native prepared struct with
         * { 100.0f, 200.0f }
         */

        StructFactory test = StructFactory.alloc().init();
        NativeCGPoint point = test.prepareCGPoint();

        assertEquals(point.getX(), 100.0f, 0.0f);
        assertEquals(point.getY(), 200.0f, 0.0f);
    }


    @Test
    public void nestedStructWrite()
    {
        /*
         * In native expected struct with
         * { { 100.0f, 200.0f }, { 300.0f, 400.0f } }
         */

        NativeCGRect rect = new NativeCGRect(100.0, 200.0, 300.0, 400.0);
        StructFactory test = StructFactory.alloc().init();

        assertTrue(test.checkCGRect(rect));
    }

    @Test
    public void nestedStructRead()
    {
        /*
         * Native prepared struct with
         * { { 100.0f, 200.0f }, { 300.0f, 400.0f } }
         */

        StructFactory test = StructFactory.alloc().init();
        NativeCGRect point = test.prepareCGRect();

        assertEquals(point.getOrigin().getX(), 100.0f, 0.0f);
        assertEquals(point.getOrigin().getY(), 200.0f, 0.0f);
        assertEquals(point.getSize().getWidth(), 300.0f, 0.0f);
        assertEquals(point.getSize().getHeight(), 400.0f, 0.0f);
    }

    @Test
    public void createWithCFunction()
    {
        /*
         * Struct returned from C function
         */

        NativeCGRect point = NativeCGRect.make(100.0f, 200.0f, 300.0f, 400.0f);

        assertEquals(point.getOrigin().getX(), 100.0f, 0.0f);
        assertEquals(point.getOrigin().getY(), 200.0f, 0.0f);
        assertEquals(point.getSize().getWidth(), 300.0f, 0.0f);
        assertEquals(point.getSize().getHeight(), 400.0f, 0.0f);
    }


}
