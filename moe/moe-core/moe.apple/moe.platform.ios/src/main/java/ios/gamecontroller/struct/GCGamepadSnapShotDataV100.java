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

package ios.gamecontroller.struct;


import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure(alignment = 1)
public final class GCGamepadSnapShotDataV100 extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public GCGamepadSnapShotDataV100() {
		super(GCGamepadSnapShotDataV100.class);
	}

	@Generated
	protected GCGamepadSnapShotDataV100(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native char version();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setVersion(char value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native char size();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setSize(char value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native float dpadX();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setDpadX(float value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native float dpadY();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setDpadY(float value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native float buttonA();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setButtonA(float value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native float buttonB();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setButtonB(float value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native float buttonX();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setButtonX(float value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	public native float buttonY();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setButtonY(float value);

	@Generated
	@StructureField(order = 8, isGetter = true)
	public native float leftShoulder();

	@Generated
	@StructureField(order = 8, isGetter = false)
	public native void setLeftShoulder(float value);

	@Generated
	@StructureField(order = 9, isGetter = true)
	public native float rightShoulder();

	@Generated
	@StructureField(order = 9, isGetter = false)
	public native void setRightShoulder(float value);
}
