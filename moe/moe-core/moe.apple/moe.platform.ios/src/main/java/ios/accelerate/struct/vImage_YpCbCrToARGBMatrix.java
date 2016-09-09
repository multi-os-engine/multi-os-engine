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
public final class vImage_YpCbCrToARGBMatrix extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public vImage_YpCbCrToARGBMatrix() {
		super(vImage_YpCbCrToARGBMatrix.class);
	}

	@Generated
	protected vImage_YpCbCrToARGBMatrix(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native float Yp();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setYp(float value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native float Cr_R();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setCr_R(float value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native float Cr_G();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setCr_G(float value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native float Cb_G();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setCb_G(float value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native float Cb_B();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setCb_B(float value);
}
