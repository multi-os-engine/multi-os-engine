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
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ann.UncertainReturn;

@Generated
@Structure()
public final class CXIdxObjCInterfaceDeclInfo extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public CXIdxObjCInterfaceDeclInfo() {
		super(CXIdxObjCInterfaceDeclInfo.class);
	}

	@Generated
	protected CXIdxObjCInterfaceDeclInfo(Pointer peer) {
		super(peer);
	}

	@Generated
	public CXIdxObjCInterfaceDeclInfo(
			@UncertainArgument("Options: reference, array Fallback: reference") CXIdxObjCContainerDeclInfo containerInfo,
			@UncertainArgument("Options: reference, array Fallback: reference") CXIdxBaseClassInfo superInfo,
			@UncertainArgument("Options: reference, array Fallback: reference") CXIdxObjCProtocolRefListInfo protocols) {
		super(CXIdxObjCInterfaceDeclInfo.class);
		setContainerInfo(containerInfo);
		setSuperInfo(superInfo);
		setProtocols(protocols);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	@UncertainReturn("Options: reference, array Fallback: reference")
	public native CXIdxObjCContainerDeclInfo containerInfo();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setContainerInfo(
			@UncertainArgument("Options: reference, array Fallback: reference") CXIdxObjCContainerDeclInfo value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	@UncertainReturn("Options: reference, array Fallback: reference")
	public native CXIdxBaseClassInfo superInfo();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setSuperInfo(
			@UncertainArgument("Options: reference, array Fallback: reference") CXIdxBaseClassInfo value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	@UncertainReturn("Options: reference, array Fallback: reference")
	public native CXIdxObjCProtocolRefListInfo protocols();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setProtocols(
			@UncertainArgument("Options: reference, array Fallback: reference") CXIdxObjCProtocolRefListInfo value);
}
