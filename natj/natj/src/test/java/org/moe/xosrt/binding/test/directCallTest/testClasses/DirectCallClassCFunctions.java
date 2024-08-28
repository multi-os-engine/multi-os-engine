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

package org.moe.xosrt.binding.test.directCallTest.testClasses;


import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.map.CObjectMapper;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.xosrt.binding.test.common.NativeCGPoint;

public class DirectCallClassCFunctions {
	
	static
	{
		NatJ.register();
	}

	@CFunction("nativeTestFunction")
	@Generated
	public native static void nativeTestFunction();

	@CFunction("nativeTestFunctionTakesInt")
	@Generated
	public native static void nativeTestFunctionTakesInt(int val);

	@CFunction("nativeTestFunctionTakes2DoublesRetsDouble")
	@Generated
	public native static double nativeTestFunctionTakes2DoublesRetsDouble(double d1, double d2);

	@CFunction("nativeTestFunctionTakes2DoublesRetsStruct")
	@Generated
	public native @ByValue NativeCGPoint nativeTestFunctionTakes2DoublesRetsStruct(double d1, double d2);

	@CFunction("nativeTestFunctionTakes2StructsRetsStruct")
	@Generated
	public native static @ByValue NativeCGPoint nativeTestFunctionTakes2StructsRetsStruct(@ByValue NativeCGPoint p1, @ByValue NativeCGPoint p2);

	@CFunction("nativeTestFunctionTakeStructByValAndChange")
	@Generated
	public native static void nativeTestFunctionTakeStructByValAndChange(@ByValue NativeCGPoint p);

	@CFunction("nativeTestFunctionTakeStructByRefAndChange")
	@Generated
	public native static void nativeTestFunctionTakeStructByRefAndChange(NativeCGPoint p);

	@CFunction("nativeTestFunctionTakeStructByRefAndReturn")
	@Generated
	@MappedReturn(CObjectMapper.class)
	public native static NativeCGPoint nativeTestFunctionTakeStructByRefAndReturn(@Mapped(CObjectMapper.class) NativeCGPoint p);
	
}
