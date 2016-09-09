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

package ios.struct;


import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class __darwin_mcontext32 extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public __darwin_mcontext32() {
		super(__darwin_mcontext32.class);
	}

	@Generated
	protected __darwin_mcontext32(Pointer peer) {
		super(peer);
	}

	@Generated
	public __darwin_mcontext32(@ByValue __darwin_arm_exception_state __es,
			@ByValue __darwin_arm_thread_state __ss,
			@ByValue __darwin_arm_vfp_state __fs) {
		super(__darwin_mcontext32.class);
		set__es(__es);
		set__ss(__ss);
		set__fs(__fs);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	@ByValue
	public native __darwin_arm_exception_state __es();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void set__es(@ByValue __darwin_arm_exception_state value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	@ByValue
	public native __darwin_arm_thread_state __ss();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void set__ss(@ByValue __darwin_arm_thread_state value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	@ByValue
	public native __darwin_arm_vfp_state __fs();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void set__fs(@ByValue __darwin_arm_vfp_state value);
}
