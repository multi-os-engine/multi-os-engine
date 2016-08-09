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

package ios.coremidi.struct;


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
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;

import ios.corefoundation.struct.CFUUIDBytes;

@Generated
@Structure()
public final class MIDIDriverInterface extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public MIDIDriverInterface() {
		super(MIDIDriverInterface.class);
	}

	@Generated
	protected MIDIDriverInterface(Pointer peer) {
		super(peer);
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
	@StructureField(order = 4, isGetter = false)
	public native void setFindDevices(
			@FunctionPtr(name = "call_FindDevices") Function_FindDevices value);

	@Runtime(CRuntime.class)
	@Generated
	public interface Function_FindDevices {
		@Generated
		int call_FindDevices(@ReferenceInfo(type = MIDIDriverInterface.class, depth = 2) Ptr<Ptr<MIDIDriverInterface>> arg0, int arg1);
	}

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setStart(
			@FunctionPtr(name = "call_Start") Function_Start value);

	@Runtime(CRuntime.class)
	@Generated
	public interface Function_Start {
		@Generated
		int call_Start(@ReferenceInfo(type = MIDIDriverInterface.class, depth = 2) Ptr<Ptr<MIDIDriverInterface>> arg0, int arg1);
	}

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setStop(
			@FunctionPtr(name = "call_Stop") Function_Stop value);

	@Runtime(CRuntime.class)
	@Generated
	public interface Function_Stop {
		@Generated
		int call_Stop(@ReferenceInfo(type = MIDIDriverInterface.class, depth = 2) Ptr<Ptr<MIDIDriverInterface>> arg0);
	}

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setConfigure(
			@FunctionPtr(name = "call_Configure") Function_Configure value);

	@Runtime(CRuntime.class)
	@Generated
	public interface Function_Configure {
		@Generated
		int call_Configure(@ReferenceInfo(type = MIDIDriverInterface.class, depth = 2) Ptr<Ptr<MIDIDriverInterface>> arg0, int arg1);
	}

	@Generated
	@StructureField(order = 8, isGetter = false)
	public native void setSend(
			@FunctionPtr(name = "call_Send") Function_Send value);

	@Runtime(CRuntime.class)
	@Generated
	public interface Function_Send {
		@Generated
		int call_Send(
				@ReferenceInfo(type = MIDIDriverInterface.class, depth = 2) Ptr<Ptr<MIDIDriverInterface>> arg0,
				@UncertainArgument("Options: reference, array Fallback: reference") MIDIPacketList arg1,
				VoidPtr arg2, VoidPtr arg3);
	}

	@Generated
	@StructureField(order = 9, isGetter = false)
	public native void setEnableSource(
			@FunctionPtr(name = "call_EnableSource") Function_EnableSource value);

	@Runtime(CRuntime.class)
	@Generated
	public interface Function_EnableSource {
		@Generated
		int call_EnableSource(@ReferenceInfo(type = MIDIDriverInterface.class, depth = 2) Ptr<Ptr<MIDIDriverInterface>> arg0,
				int arg1, byte arg2);
	}

	@Generated
	@StructureField(order = 10, isGetter = false)
	public native void setFlush(
			@FunctionPtr(name = "call_Flush") Function_Flush value);

	@Runtime(CRuntime.class)
	@Generated
	public interface Function_Flush {
		@Generated
		int call_Flush(@ReferenceInfo(type = MIDIDriverInterface.class, depth = 2) Ptr<Ptr<MIDIDriverInterface>> arg0, int arg1,
				VoidPtr arg2, VoidPtr arg3);
	}

	@Generated
	@StructureField(order = 11, isGetter = false)
	public native void setMonitor(
			@FunctionPtr(name = "call_Monitor") Function_Monitor value);

	@Runtime(CRuntime.class)
	@Generated
	public interface Function_Monitor {
		@Generated
		int call_Monitor(
				@ReferenceInfo(type = MIDIDriverInterface.class, depth = 2) Ptr<Ptr<MIDIDriverInterface>> arg0,
				int arg1,
				@UncertainArgument("Options: reference, array Fallback: reference") MIDIPacketList arg2);
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

	@Generated
	@StructureField(order = 4, isGetter = true)
	@FunctionPtr(name = "call_FindDevices")
	public native Function_FindDevices FindDevices();

	@Generated
	@StructureField(order = 5, isGetter = true)
	@FunctionPtr(name = "call_Start")
	public native Function_Start Start();

	@Generated
	@StructureField(order = 6, isGetter = true)
	@FunctionPtr(name = "call_Stop")
	public native Function_Stop Stop();

	@Generated
	@StructureField(order = 7, isGetter = true)
	@FunctionPtr(name = "call_Configure")
	public native Function_Configure Configure();

	@Generated
	@StructureField(order = 8, isGetter = true)
	@FunctionPtr(name = "call_Send")
	public native Function_Send Send();

	@Generated
	@StructureField(order = 9, isGetter = true)
	@FunctionPtr(name = "call_EnableSource")
	public native Function_EnableSource EnableSource();

	@Generated
	@StructureField(order = 10, isGetter = true)
	@FunctionPtr(name = "call_Flush")
	public native Function_Flush Flush();

	@Generated
	@StructureField(order = 11, isGetter = true)
	@FunctionPtr(name = "call_Monitor")
	public native Function_Monitor Monitor();
}
