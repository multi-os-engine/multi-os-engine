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

package ios.coretext.struct;


import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ptr.ConstVoidPtr;

@Generated
@Structure()
public final class CTParagraphStyleSetting extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public CTParagraphStyleSetting() {
		super(CTParagraphStyleSetting.class);
	}

	@Generated
	protected CTParagraphStyleSetting(Pointer peer) {
		super(peer);
	}

	@Generated
	public CTParagraphStyleSetting(int spec, @NUInt long valueSize,
			ConstVoidPtr value) {
		super(CTParagraphStyleSetting.class);
		setSpec(spec);
		setValueSize(valueSize);
		setValue(value);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int spec();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setSpec(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	@NUInt
	public native long valueSize();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setValueSize(@NUInt long value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native ConstVoidPtr value();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setValue(ConstVoidPtr value);
}
