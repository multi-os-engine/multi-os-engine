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
public final class mach_port_status extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public mach_port_status() {
		super(mach_port_status.class);
	}

	@Generated
	protected mach_port_status(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int mps_pset();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setMps_pset(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int mps_seqno();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setMps_seqno(int value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native int mps_mscount();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setMps_mscount(int value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native int mps_qlimit();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setMps_qlimit(int value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native int mps_msgcount();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setMps_msgcount(int value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native int mps_sorights();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setMps_sorights(int value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native int mps_srights();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setMps_srights(int value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	public native int mps_pdrequest();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setMps_pdrequest(int value);

	@Generated
	@StructureField(order = 8, isGetter = true)
	public native int mps_nsrequest();

	@Generated
	@StructureField(order = 8, isGetter = false)
	public native void setMps_nsrequest(int value);

	@Generated
	@StructureField(order = 9, isGetter = true)
	public native int mps_flags();

	@Generated
	@StructureField(order = 9, isGetter = false)
	public native void setMps_flags(int value);
}
