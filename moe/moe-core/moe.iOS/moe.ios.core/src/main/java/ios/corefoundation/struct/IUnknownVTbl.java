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

package ios.corefoundation.struct;


import org.moe.natj.c.CRuntime;
import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure()
public final class IUnknownVTbl extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public IUnknownVTbl() {
		super(IUnknownVTbl.class);
	}

	@Generated
	protected IUnknownVTbl(Pointer peer) {
		super(peer);
	}

	@Generated
	public IUnknownVTbl(VoidPtr _reserved,
			@FunctionPtr(name = "call_QueryInterface") Function_QueryInterface QueryInterface,
			@FunctionPtr(name = "call_AddRef") Function_AddRef AddRef,
			@FunctionPtr(name = "call_Release") Function_Release Release) {
		super(IUnknownVTbl.class);
		set_reserved(_reserved);
		setQueryInterface(QueryInterface);
		setAddRef(AddRef);
		setRelease(Release);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native VoidPtr _reserved();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void set_reserved(VoidPtr value);

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setQueryInterface(
			@FunctionPtr(name = "call_QueryInterface") Function_QueryInterface value);

	@Runtime(CRuntime.class)
	@Generated
	public interface Function_QueryInterface {
		@Generated
		int call_QueryInterface(VoidPtr arg0, @ByValue CFUUIDBytes arg1,
				@ReferenceInfo(type = Void.class, depth = 2) Ptr<VoidPtr> arg2);
	}

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setAddRef(
			@FunctionPtr(name = "call_AddRef") Function_AddRef value);

	@Runtime(CRuntime.class)
	@Generated
	public interface Function_AddRef {
		@Generated
		int call_AddRef(VoidPtr arg0);
	}

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setRelease(
			@FunctionPtr(name = "call_Release") Function_Release value);

	@Runtime(CRuntime.class)
	@Generated
	public interface Function_Release {
		@Generated
		int call_Release(VoidPtr arg0);
	}

	@Generated
	@StructureField(order = 1, isGetter = true)
	@FunctionPtr(name = "call_QueryInterface")
	public native Function_QueryInterface QueryInterface();

	@Generated
	@StructureField(order = 2, isGetter = true)
	@FunctionPtr(name = "call_AddRef")
	public native Function_AddRef AddRef();

	@Generated
	@StructureField(order = 3, isGetter = true)
	@FunctionPtr(name = "call_Release")
	public native Function_Release Release();
}
