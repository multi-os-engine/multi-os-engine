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
public final class accessx_descriptor extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public accessx_descriptor() {
		super(accessx_descriptor.class);
	}

	@Generated
	protected accessx_descriptor(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int ad_name_offset();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setAd_name_offset(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int ad_flags();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setAd_flags(int value);

	@Generated
	@StructureField(order = 2, isGetter = true, count = 2)
	public native int ad_pad(int field_idx);

	@Generated
	@StructureField(order = 2, isGetter = false, count = 2)
	public native void setAd_pad(int value, int field_idx);
}
