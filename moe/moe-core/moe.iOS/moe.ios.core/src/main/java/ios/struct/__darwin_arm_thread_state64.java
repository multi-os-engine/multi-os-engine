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
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class __darwin_arm_thread_state64 extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public __darwin_arm_thread_state64() {
		super(__darwin_arm_thread_state64.class);
	}

	@Generated
	protected __darwin_arm_thread_state64(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true, count = 29)
	public native long __x(int field_idx);

	@Generated
	@StructureField(order = 0, isGetter = false, count = 29)
	public native void set__x(long value, int field_idx);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native long __fp();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void set__fp(long value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native long __lr();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void set__lr(long value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native long __sp();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void set__sp(long value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native long __pc();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void set__pc(long value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native int __cpsr();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void set__cpsr(int value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native int __pad();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void set__pad(int value);
}
