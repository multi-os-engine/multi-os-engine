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
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure(alignment = 2)
public final class MorxLigatureSubtable extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public MorxLigatureSubtable() {
		super(MorxLigatureSubtable.class);
	}

	@Generated
	protected MorxLigatureSubtable(Pointer peer) {
		super(peer);
	}

	@Generated
	public MorxLigatureSubtable(@ByValue STXHeader header,
			int ligatureActionTableOffset, int componentTableOffset,
			int ligatureTableOffset) {
		super(MorxLigatureSubtable.class);
		setHeader(header);
		setLigatureActionTableOffset(ligatureActionTableOffset);
		setComponentTableOffset(componentTableOffset);
		setLigatureTableOffset(ligatureTableOffset);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	@ByValue
	public native STXHeader header();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setHeader(@ByValue STXHeader value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int ligatureActionTableOffset();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setLigatureActionTableOffset(int value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native int componentTableOffset();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setComponentTableOffset(int value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native int ligatureTableOffset();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setLigatureTableOffset(int value);
}
