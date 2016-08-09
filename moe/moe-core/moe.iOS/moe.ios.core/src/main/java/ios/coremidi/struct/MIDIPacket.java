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

package ios.coremidi.struct;


import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure(alignment = 4)
public final class MIDIPacket extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public MIDIPacket() {
		super(MIDIPacket.class);
	}

	@Generated
	protected MIDIPacket(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native long timeStamp();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setTimeStamp(long value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native char length();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setLength(char value);

	@Generated
	@StructureField(order = 2, isGetter = true, count = 256)
	public native byte data(int field_idx);

	@Generated
	@StructureField(order = 2, isGetter = false, count = 256)
	public native void setData(byte value, int field_idx);
}
