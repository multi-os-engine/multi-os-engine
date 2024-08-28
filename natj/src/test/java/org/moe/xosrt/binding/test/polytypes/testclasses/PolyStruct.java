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

package org.moe.xosrt.binding.test.polytypes.testclasses;


import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;

@Structure
public class PolyStruct extends StructObject {
	private static long __natjCache; //Used by NatJ for optimizations

	static {
		NatJ.register();
	}

	@Generated
	public PolyStruct() {
		super(PolyStruct.class);
	}

	@Generated
	protected PolyStruct(Pointer peer) {
		super(peer);
	}

	@StructureField(order = 0, isGetter = true)
	public native float getValue();

	@StructureField(order = 0, isGetter = false)
	public native void setValue(float value);
	
	public PolyStruct(float value) {
		super(PolyStruct.class);
		setValue(value);
	}
	
	// C functions
	@CFunction("setPolyStructValue")
	@Generated
	public static native float setPolyStructValue(PolyStruct pps, float val);

	@CFunction("getPolyStructValue")
	@Generated
	public static native float getPolyStructValue(@ByValue PolyStruct ps);
}
