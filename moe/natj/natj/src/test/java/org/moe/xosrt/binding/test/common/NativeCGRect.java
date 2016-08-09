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
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.NFloat;

@Structure
public class NativeCGRect extends StructObject {

	private static long __natjCache; //Used by NatJ for optimizations

	static {
		NatJ.register();
	}

	public NativeCGRect() {
		super(NativeCGRect.class);
	}

	protected NativeCGRect(Pointer peer) {
		super(peer);
	}

	@StructureField(order = 0, isGetter = true)
	@ByValue
	public native NativeCGPoint getOrigin();

	@StructureField(order = 0, isGetter = false)
	public native void setOrigin(@ByValue NativeCGPoint origin);

	@StructureField(order = 1, isGetter = true)
	@ByValue
	public native NativeCGSize getSize();

	@StructureField(order = 1, isGetter = false)
	public native void setSize(@ByValue NativeCGSize size);

    public NativeCGRect(@NFloat double a,
                        @NFloat double b,
                        @NFloat double c,
                        @NFloat double d)
    {
		super(NativeCGRect.class);
		setOrigin(new NativeCGPoint(a, b));
        setSize(new NativeCGSize(c, d));
    }

	public NativeCGRect(@ByValue NativeCGPoint origin, @ByValue NativeCGSize size)
	{
		super(NativeCGRect.class);
		setOrigin(origin);
		setSize(size);
	}

    @CFunction("inline_test_CGRectMake")
    public static native @ByValue NativeCGRect make(@NFloat double a,
													@NFloat double b,
													@NFloat double c,
													@NFloat double d);

}
