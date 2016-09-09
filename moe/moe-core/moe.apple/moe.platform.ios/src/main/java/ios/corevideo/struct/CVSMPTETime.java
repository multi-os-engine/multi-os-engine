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

package ios.corevideo.struct;


import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class CVSMPTETime extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public CVSMPTETime() {
		super(CVSMPTETime.class);
	}

	@Generated
	protected CVSMPTETime(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native short subframes();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setSubframes(short value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native short subframeDivisor();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setSubframeDivisor(short value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native int counter();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setCounter(int value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native int type();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setType(int value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native int flags();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setFlags(int value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native short hours();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setHours(short value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native short minutes();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setMinutes(short value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	public native short seconds();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setSeconds(short value);

	@Generated
	@StructureField(order = 8, isGetter = true)
	public native short frames();

	@Generated
	@StructureField(order = 8, isGetter = false)
	public native void setFrames(short value);
}
