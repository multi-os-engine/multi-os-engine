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

package org.moe.xosrt.binding.test.CFunctionWithStruct.testClasses;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;

@Library("TestClasses")
@Generated
@Runtime(CRuntime.class)
@Structure(alignment = 8)
public class nativeVector2 extends StructObject {


	private static long __natjCache; //Used by NatJ for optimizations

	static {
		NatJ.register();
	}

	protected nativeVector2(Pointer peer) {
	    super(peer);
	}
	
//	@StructureField(order = 0, isGetter = true)
//	public native float getX();
//	@StructureField(order = 1, isGetter = true)
//	public native float getY();
//
//	@StructureField(order = 0, isGetter = false)
//	public native void setX(float x);
//	@StructureField(order = 1, isGetter = false)
//	public native void setY(float y);
//
//	public float getS() { return getX(); }
//	public float getT() { return getY(); }

//	public void setS(float s) { setX(s); }
//	public void setT(float t) { setY(t); }
	
	@Generated
	@StructureField(order = 0, isGetter = true, count = 2)
	public native float getV(int field_idx);

	@Generated
	@StructureField(order = 0, isGetter = false, count = 2)
	public native void setV(float value, int field_idx);

//	public float getV(int index) {
//		switch (index) {
//		case 0: return getX();
//		case 1: return getY();
//		default: throw new RuntimeException("Incorrect index");
//		}
//	}

//	public void setV(int index, float value) {
//		switch (index) {
//		case 0: setX(value); break;
//		case 1: setY(value); break;
//		default: throw new RuntimeException("Incorrect index");
//		}
//	}

	public nativeVector2() {
		super(nativeVector2.class);
	}
	
	@CFunction("Vector2Make")
	@Generated
	@ByValue
	public static native nativeVector2 make(float x, float y);
	
	// TODO Handle arrays
	@CFunction("Vector2Negate")
	@Generated
	@ByValue
	public static native nativeVector2 negate(@ByValue nativeVector2 vector);

	@CFunction
	@Generated
	@ByValue
	public static native nativeVector2 Vector2AddScalar(@ByValue nativeVector2 vector, float value);

}
