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

package ios.corefoundation.struct;


import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class CFGregorianUnits extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public CFGregorianUnits() {
		super(CFGregorianUnits.class);
	}

	@Generated
	protected CFGregorianUnits(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int years();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setYears(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int months();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setMonths(int value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native int days();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setDays(int value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native int hours();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setHours(int value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native int minutes();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setMinutes(int value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native double seconds();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setSeconds(double value);
}
