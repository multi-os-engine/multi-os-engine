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

package org.moe.xosrt.binding.test.constructTest;

import org.moe.xosrt.binding.test.common.XrtTest;
import org.moe.xosrt.binding.test.constructTest.testClasses.BaseClass;
import org.moe.xosrt.binding.test.constructTest.testClasses.MiddleClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConstructTest extends XrtTest {

    static long INIT = 1;
    static long INIT_WITH_PARAM = 2;
    static long CREATE = 4;
    static long CREATE_WITH_PARAM = 8;

    static long INIT_MIDDLE  = 16;
    static long INIT_MIDDLE_WITH_PARAM = 32;
    static long CREATE_MIDDLE_WITH_PARAM = 64;

    @Test
	public void BaseClass_alloc_init() {

		BaseClass testObject = BaseClass.alloc();
        testObject = testObject.init();

		assertEquals(INIT, testObject.getHistory());
	}

    @Test
    public void BaseClass_new() {

        BaseClass testObject = BaseClass.alloc().init();

        assertEquals(INIT, testObject.getHistory());
    }

    @Test
	public void BaseClass_staticCreate() {

		BaseClass testObject = BaseClass.createBase();

        assertEquals(CREATE | INIT, testObject.getHistory());
	}
	
	@Test
	public void BaseClass_initWithParam() {

		BaseClass testObject = BaseClass.alloc().initWithParam(100500L);

        assertEquals(INIT_WITH_PARAM, testObject.getHistory());
	}

	@Test
	public void BaseClass_staticCreateWithParam() {
		
		BaseClass testObject = BaseClass.createBaseWithParam(100500L);

        assertEquals(CREATE_WITH_PARAM | INIT, testObject.getHistory());
	}

	@Test
	public void MiddleClass_init() {

        MiddleClass testObject = MiddleClass.alloc().init();

        assertEquals(INIT, testObject.getHistory());
	}

	@Test
	public void MiddleClass_initWithParam() {
		/*
		 * Simple constructor without parameters 
		 */
		MiddleClass testObject = MiddleClass.alloc().initWithParam(100500L);

        assertEquals(INIT_MIDDLE_WITH_PARAM | INIT, testObject.getHistory());
	}

    @Test
    public void MiddleClass_createWithParam() {
		/*
		 * Simple constructor without parameters
		 */
        MiddleClass testObject = MiddleClass.createMiddleWithParam(100500L);

        assertEquals(CREATE_MIDDLE_WITH_PARAM| INIT_MIDDLE_WITH_PARAM | INIT, testObject.getHistory());
    }

}
