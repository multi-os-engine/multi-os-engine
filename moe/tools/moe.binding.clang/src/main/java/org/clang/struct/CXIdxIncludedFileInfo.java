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
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure()
public final class CXIdxIncludedFileInfo extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public CXIdxIncludedFileInfo() {
		super(CXIdxIncludedFileInfo.class);
	}

	@Generated
	protected CXIdxIncludedFileInfo(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	@ByValue
	public native CXIdxLoc hashLoc();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setHashLoc(@ByValue CXIdxLoc value);

	@UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
	@Generated
	@StructureField(order = 1, isGetter = true)
	public native String filename();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setFilename(@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native VoidPtr file();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setFile(VoidPtr value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native int isImport();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setIsImport(int value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native int isAngled();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setIsAngled(int value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native int isModuleImport();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setIsModuleImport(int value);
}
