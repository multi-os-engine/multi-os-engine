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

package ios.accelerate.struct;


import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class vImage_YpCbCrPixelRange extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public vImage_YpCbCrPixelRange() {
		super(vImage_YpCbCrPixelRange.class);
	}

	@Generated
	protected vImage_YpCbCrPixelRange(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int Yp_bias();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setYp_bias(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int CbCr_bias();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setCbCr_bias(int value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native int YpRangeMax();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setYpRangeMax(int value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native int CbCrRangeMax();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setCbCrRangeMax(int value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native int YpMax();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setYpMax(int value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native int YpMin();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setYpMin(int value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native int CbCrMax();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setCbCrMax(int value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	public native int CbCrMin();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setCbCrMin(int value);
}
