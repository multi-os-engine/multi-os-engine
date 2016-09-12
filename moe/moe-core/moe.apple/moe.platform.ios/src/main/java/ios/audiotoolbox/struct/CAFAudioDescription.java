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
import org.moe.natj.general.ann.Generated;

@Generated
@Structure(alignment = 1)
public final class CAFAudioDescription extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public CAFAudioDescription() {
		super(CAFAudioDescription.class);
	}

	@Generated
	protected CAFAudioDescription(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native double mSampleRate();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setMSampleRate(double value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int mFormatID();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setMFormatID(int value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native int mFormatFlags();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setMFormatFlags(int value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native int mBytesPerPacket();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setMBytesPerPacket(int value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native int mFramesPerPacket();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setMFramesPerPacket(int value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native int mChannelsPerFrame();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setMChannelsPerFrame(int value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native int mBitsPerChannel();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setMBitsPerChannel(int value);
}
