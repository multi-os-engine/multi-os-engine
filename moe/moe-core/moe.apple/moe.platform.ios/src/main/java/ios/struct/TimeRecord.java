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

import ios.opaque.TimeBase;

@Generated
@Structure(alignment = 2)
public final class TimeRecord extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public TimeRecord() {
		super(TimeRecord.class);
	}

	@Generated
	protected TimeRecord(Pointer peer) {
		super(peer);
	}

	@Generated
	public TimeRecord(@ByValue wide value, int scale, TimeBase base) {
		super(TimeRecord.class);
		setValue(value);
		setScale(scale);
		setBase(base);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	@ByValue
	public native wide value();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setValue(@ByValue wide value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int scale();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setScale(int value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native TimeBase base();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setBase(TimeBase value);
}
