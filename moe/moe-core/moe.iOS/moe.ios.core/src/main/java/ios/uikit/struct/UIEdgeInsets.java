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

package ios.uikit.struct;


import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NFloat;

@Generated
@Structure()
public final class UIEdgeInsets extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public UIEdgeInsets() {
		super(UIEdgeInsets.class);
	}

	@Generated
	protected UIEdgeInsets(Pointer peer) {
		super(peer);
	}

	@Generated
	public UIEdgeInsets(@NFloat double top, @NFloat double left,
			@NFloat double bottom, @NFloat double right) {
		super(UIEdgeInsets.class);
		setTop(top);
		setLeft(left);
		setBottom(bottom);
		setRight(right);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	@NFloat
	public native double top();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setTop(@NFloat double value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	@NFloat
	public native double left();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setLeft(@NFloat double value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	@NFloat
	public native double bottom();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setBottom(@NFloat double value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	@NFloat
	public native double right();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setRight(@NFloat double value);
}
