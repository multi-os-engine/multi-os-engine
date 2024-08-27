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

package org.moe.xosrt.binding.test.common;


import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;

@Structure
public class NativeComplexCGPointByRef extends StructObject {

	/*
	 * struct NativeComplexCGPointByRef {
	 * 		NativeCGPoint* x;
	 * 		float y;
	 * }
	 */

	private static long __natjCache; //Used by NatJ for optimizations

	static {
		NatJ.register();
	}

	@StructureField(order = 0, isGetter = true)
	public native NativeCGPoint getX();

	@StructureField(order = 1, isGetter = true)
	public native float getY();

	@StructureField(order = 0, isGetter = false)
	public native void setX(NativeCGPoint point);

	@StructureField(order = 1, isGetter = false)
	public native void setY(float y);
	
	public NativeComplexCGPointByRef(NativeCGPoint x, float y)
	{
		super(NativeComplexCGPointByRef.class);
		setX(x);
		setY(y);
	}

}
