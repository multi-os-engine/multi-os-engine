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

package ios.audiotoolbox.struct;


import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class CAF_UUID_ChunkHeader extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public CAF_UUID_ChunkHeader() {
		super(CAF_UUID_ChunkHeader.class);
	}

	@Generated
	protected CAF_UUID_ChunkHeader(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	@ByValue
	public native CAFChunkHeader mHeader();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setMHeader(@ByValue CAFChunkHeader value);

	@Generated
	@StructureField(order = 1, isGetter = true, count = 16)
	public native byte mUUID(int field_idx);

	@Generated
	@StructureField(order = 1, isGetter = false, count = 16)
	public native void setMUUID(byte value, int field_idx);
}
