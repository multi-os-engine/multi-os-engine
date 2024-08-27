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

package org.moe.xosrt.binding.test.polytypes;

import org.moe.xosrt.binding.test.common.XrtTest;
import org.moe.xosrt.binding.test.polytypes.testclasses.PolyStruct;
import org.moe.xosrt.binding.test.polytypes.testclasses.PolyStructCaller;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PolyTypesTests extends XrtTest {

	@Test
	public void alwaysConvertedFloatGettersSetters() {
		PolyStruct ps = new PolyStruct(123);

		assertEquals(123, ps.getValue(), 0.1);
	}

	@Test
	public void alwaysConvertedFloatCFunctions() {
		PolyStruct ps = new PolyStruct(123);

		PolyStruct.setPolyStructValue(ps, 456);
		assertEquals(456f, PolyStruct.getPolyStructValue(ps), 0.1f);
	}
	
	@Test 
	public void alwaysConvertedFloatObjC() {
		PolyStruct ps = new PolyStruct(123);

		PolyStructCaller psc = PolyStructCaller.alloc().init();
		psc.setPolyStructValue(ps, 456);
		assertEquals(456f, psc.getPolyStructValue(ps), 0.1f);

	}

	// TODO: Should be more testes for real float-double, int32-int62 value
}
