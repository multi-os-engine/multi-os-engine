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
public final class CXIdxIBOutletCollectionAttrInfo extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public CXIdxIBOutletCollectionAttrInfo() {
		super(CXIdxIBOutletCollectionAttrInfo.class);
	}

	@Generated
	protected CXIdxIBOutletCollectionAttrInfo(Pointer peer) {
		super(peer);
	}

	@Generated
	public CXIdxIBOutletCollectionAttrInfo(
			@UncertainArgument("Options: reference, array Fallback: reference") CXIdxAttrInfo attrInfo,
			@UncertainArgument("Options: reference, array Fallback: reference") CXIdxEntityInfo objcClass,
			@ByValue CXCursor classCursor, @ByValue CXIdxLoc classLoc) {
		super(CXIdxIBOutletCollectionAttrInfo.class);
		setAttrInfo(attrInfo);
		setObjcClass(objcClass);
		setClassCursor(classCursor);
		setClassLoc(classLoc);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	@UncertainReturn("Options: reference, array Fallback: reference")
	public native CXIdxAttrInfo attrInfo();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setAttrInfo(
			@UncertainArgument("Options: reference, array Fallback: reference") CXIdxAttrInfo value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	@UncertainReturn("Options: reference, array Fallback: reference")
	public native CXIdxEntityInfo objcClass();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setObjcClass(
			@UncertainArgument("Options: reference, array Fallback: reference") CXIdxEntityInfo value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	@ByValue
	public native CXCursor classCursor();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setClassCursor(@ByValue CXCursor value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	@ByValue
	public native CXIdxLoc classLoc();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setClassLoc(@ByValue CXIdxLoc value);
}
