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
import org.moe.natj.general.ann.NUInt;

@Generated
@Structure(alignment = 4)
public final class mach_msg_mac_trailer_t extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public mach_msg_mac_trailer_t() {
		super(mach_msg_mac_trailer_t.class);
	}

	@Generated
	protected mach_msg_mac_trailer_t(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int msgh_trailer_type();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setMsgh_trailer_type(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int msgh_trailer_size();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setMsgh_trailer_size(int value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native int msgh_seqno();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setMsgh_seqno(int value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	@ByValue
	public native security_token_t msgh_sender();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setMsgh_sender(@ByValue security_token_t value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	@ByValue
	public native audit_token_t msgh_audit();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setMsgh_audit(@ByValue audit_token_t value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	@NUInt
	public native long msgh_context();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setMsgh_context(@NUInt long value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native int msgh_ad();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setMsgh_ad(int value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	@ByValue
	public native msg_labels_t msgh_labels();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setMsgh_labels(@ByValue msg_labels_t value);
}
