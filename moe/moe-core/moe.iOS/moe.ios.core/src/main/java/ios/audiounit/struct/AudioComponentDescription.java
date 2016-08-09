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

package ios.audiounit.struct;


import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class AudioComponentDescription extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public AudioComponentDescription() {
		super(AudioComponentDescription.class);
	}

	@Generated
	protected AudioComponentDescription(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int componentType();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setComponentType(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int componentSubType();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setComponentSubType(int value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native int componentManufacturer();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setComponentManufacturer(int value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native int componentFlags();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setComponentFlags(int value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native int componentFlagsMask();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setComponentFlagsMask(int value);
}
