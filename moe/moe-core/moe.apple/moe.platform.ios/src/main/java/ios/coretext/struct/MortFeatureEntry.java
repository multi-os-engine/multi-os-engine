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

@Generated
@Structure(alignment = 2)
public final class MortFeatureEntry extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public MortFeatureEntry() {
		super(MortFeatureEntry.class);
	}

	@Generated
	protected MortFeatureEntry(Pointer peer) {
		super(peer);
	}

	@Generated
	public MortFeatureEntry(char featureType, char featureSelector, int enableFlags, int disableFlags) {
		super(MortFeatureEntry.class);
		setFeatureType(featureType);
		setFeatureSelector(featureSelector);
		setEnableFlags(enableFlags);
		setDisableFlags(disableFlags);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native char featureType();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setFeatureType(char value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native char featureSelector();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setFeatureSelector(char value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native int enableFlags();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setEnableFlags(int value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native int disableFlags();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setDisableFlags(int value);
}
