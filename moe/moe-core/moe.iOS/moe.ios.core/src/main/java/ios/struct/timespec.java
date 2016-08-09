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
import org.moe.natj.general.ann.NInt;

@Generated
@Structure()
public final class timespec extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public timespec() {
		super(timespec.class);
	}

	@Generated
	protected timespec(Pointer peer) {
		super(peer);
	}

	@Generated
	public timespec(@NInt long tv_sec, @NInt long tv_nsec) {
		super(timespec.class);
		setTv_sec(tv_sec);
		setTv_nsec(tv_nsec);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	@NInt
	public native long tv_sec();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setTv_sec(@NInt long value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	@NInt
	public native long tv_nsec();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setTv_nsec(@NInt long value);
}
