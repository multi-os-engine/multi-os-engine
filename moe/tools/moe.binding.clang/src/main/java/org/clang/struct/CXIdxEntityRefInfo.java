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

package org.clang.struct;


import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ann.UncertainReturn;

@Generated
@Structure()
public final class CXIdxEntityRefInfo extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public CXIdxEntityRefInfo() {
		super(CXIdxEntityRefInfo.class);
	}

	@Generated
	protected CXIdxEntityRefInfo(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int kind();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setKind(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	@ByValue
	public native CXCursor cursor();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setCursor(@ByValue CXCursor value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	@ByValue
	public native CXIdxLoc loc();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setLoc(@ByValue CXIdxLoc value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	@UncertainReturn("Options: reference, array Fallback: reference")
	public native CXIdxEntityInfo referencedEntity();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setReferencedEntity(
			@UncertainArgument("Options: reference, array Fallback: reference") CXIdxEntityInfo value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	@UncertainReturn("Options: reference, array Fallback: reference")
	public native CXIdxEntityInfo parentEntity();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setParentEntity(
			@UncertainArgument("Options: reference, array Fallback: reference") CXIdxEntityInfo value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	@UncertainReturn("Options: reference, array Fallback: reference")
	public native CXIdxContainerInfo container();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setContainer(
			@UncertainArgument("Options: reference, array Fallback: reference") CXIdxContainerInfo value);
}
