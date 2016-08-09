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
public final class vImage_ARGBToYpCbCrMatrix extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public vImage_ARGBToYpCbCrMatrix() {
		super(vImage_ARGBToYpCbCrMatrix.class);
	}

	@Generated
	protected vImage_ARGBToYpCbCrMatrix(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native float R_Yp();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setR_Yp(float value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native float G_Yp();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setG_Yp(float value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native float B_Yp();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setB_Yp(float value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native float R_Cb();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setR_Cb(float value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native float G_Cb();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setG_Cb(float value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native float B_Cb_R_Cr();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setB_Cb_R_Cr(float value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native float G_Cr();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setG_Cr(float value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	public native float B_Cr();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setB_Cr(float value);
}
