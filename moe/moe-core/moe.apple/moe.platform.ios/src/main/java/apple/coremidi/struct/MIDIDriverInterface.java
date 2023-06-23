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

package apple.coremidi.struct;

import apple.corefoundation.struct.CFUUIDBytes;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Generated
@Structure()
public final class MIDIDriverInterface extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public MIDIDriverInterface() {
        super(MIDIDriverInterface.class);
    }

    @Generated
    protected MIDIDriverInterface(Pointer peer) {
        super(peer);
    }

    @NotNull
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native VoidPtr _reserved();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void set_reserved(@NotNull VoidPtr value);

    @NotNull
    @Generated
    @StructureField(order = 1, isGetter = true)
    @FunctionPtr(name = "call_QueryInterface")
    public native Function_QueryInterface QueryInterface();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setQueryInterface(
            @NotNull @FunctionPtr(name = "call_QueryInterface") Function_QueryInterface value);

    @NotNull
    @Generated
    @StructureField(order = 2, isGetter = true)
    @FunctionPtr(name = "call_AddRef")
    public native Function_AddRef AddRef();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setAddRef(@NotNull @FunctionPtr(name = "call_AddRef") Function_AddRef value);

    @NotNull
    @Generated
    @StructureField(order = 3, isGetter = true)
    @FunctionPtr(name = "call_Release")
    public native Function_Release Release();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setRelease(@NotNull @FunctionPtr(name = "call_Release") Function_Release value);

    /**
     * [@fn] FindDevices
     * 
     * This is only called for version 1 drivers. The server is requesting that the driver
     * detect the devices which are present. For each device present, the driver should
     * create a MIDIDeviceRef with entities, using MIDIDeviceCreate and
     * MIDIDeviceAddEntity, and add the device to the supplied MIDIDeviceListRef, using
     * MIDIDeviceListAddDevice.
     * 
     * The driver should not retain any references to the created devices and entities.
     */
    @NotNull
    @Generated
    @StructureField(order = 4, isGetter = true)
    @FunctionPtr(name = "call_FindDevices")
    public native Function_FindDevices FindDevices();

    /**
     * [@fn] FindDevices
     * 
     * This is only called for version 1 drivers. The server is requesting that the driver
     * detect the devices which are present. For each device present, the driver should
     * create a MIDIDeviceRef with entities, using MIDIDeviceCreate and
     * MIDIDeviceAddEntity, and add the device to the supplied MIDIDeviceListRef, using
     * MIDIDeviceListAddDevice.
     * 
     * The driver should not retain any references to the created devices and entities.
     */
    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setFindDevices(@NotNull @FunctionPtr(name = "call_FindDevices") Function_FindDevices value);

    /**
     * [@fn] Start
     * 
     * The server is telling the driver to begin MIDI I/O.
     * 
     * The provided device list contains the devices which were previously located by
     * FindDevices (in the case of a version 1 driver), or the devices which are owned by
     * this driver and are currently in the current MIDISetup (for version 2 drivers).
     * 
     * The provided devices may or may not still be present. A version 1 driver should
     * attempt to use as many of the devices as are actually present.
     * 
     * A version 2 driver may make calls such as MIDISetupAddDevice, MIDIDeviceAddEntity,
     * MIDIDeviceRemoveEntity to dynamically modify the system's current state. For devices
     * in the provided device list which are not present, the driver should set their
     * kMIDIPropertyOffline property to 1. A version 2 driver may also set up
     * notifications when the IORegistry changes, to detect connection and disconnection of
     * devices it wishes to control. At these times also, the driver may change the
     * devices' kMIDIPropertyOffline, and dynamically modify the system's current state to
     * reflect the devices which are present. When passing a CFRunLoopRef to IOKit for
     * notification purposes, the driver must use the server's main runloop, which is
     * obtained with CFRunLoopGetCurrent().
     * 
     * The driver will probably want to iterate through the destination endpoints and
     * assign their driver refCons, so as to identify multiple destinations when Send() is
     * called.
     * 
     * The provided device list remains owned by the system and can be assumed to contain
     * only devices owned by this driver. The driver may retain references to the devices
     * in this list and any it creates while running.
     */
    @NotNull
    @Generated
    @StructureField(order = 5, isGetter = true)
    @FunctionPtr(name = "call_Start")
    public native Function_Start Start();

    /**
     * [@fn] Start
     * 
     * The server is telling the driver to begin MIDI I/O.
     * 
     * The provided device list contains the devices which were previously located by
     * FindDevices (in the case of a version 1 driver), or the devices which are owned by
     * this driver and are currently in the current MIDISetup (for version 2 drivers).
     * 
     * The provided devices may or may not still be present. A version 1 driver should
     * attempt to use as many of the devices as are actually present.
     * 
     * A version 2 driver may make calls such as MIDISetupAddDevice, MIDIDeviceAddEntity,
     * MIDIDeviceRemoveEntity to dynamically modify the system's current state. For devices
     * in the provided device list which are not present, the driver should set their
     * kMIDIPropertyOffline property to 1. A version 2 driver may also set up
     * notifications when the IORegistry changes, to detect connection and disconnection of
     * devices it wishes to control. At these times also, the driver may change the
     * devices' kMIDIPropertyOffline, and dynamically modify the system's current state to
     * reflect the devices which are present. When passing a CFRunLoopRef to IOKit for
     * notification purposes, the driver must use the server's main runloop, which is
     * obtained with CFRunLoopGetCurrent().
     * 
     * The driver will probably want to iterate through the destination endpoints and
     * assign their driver refCons, so as to identify multiple destinations when Send() is
     * called.
     * 
     * The provided device list remains owned by the system and can be assumed to contain
     * only devices owned by this driver. The driver may retain references to the devices
     * in this list and any it creates while running.
     */
    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setStart(@NotNull @FunctionPtr(name = "call_Start") Function_Start value);

    /**
     * [@fn] Stop
     * 
     * The server is telling the driver to terminate MIDI I/O. All I/O operations that
     * were begun in Start, or as a result of a subsequent IOKit notification, should be
     * terminated.
     */
    @NotNull
    @Generated
    @StructureField(order = 6, isGetter = true)
    @FunctionPtr(name = "call_Stop")
    public native Function_Stop Stop();

    /**
     * [@fn] Stop
     * 
     * The server is telling the driver to terminate MIDI I/O. All I/O operations that
     * were begun in Start, or as a result of a subsequent IOKit notification, should be
     * terminated.
     */
    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setStop(@NotNull @FunctionPtr(name = "call_Stop") Function_Stop value);

    /**
     * [@fn] Configure
     * 
     * not currently used
     */
    @NotNull
    @Generated
    @StructureField(order = 7, isGetter = true)
    @FunctionPtr(name = "call_Configure")
    public native Function_Configure Configure();

    /**
     * [@fn] Configure
     * 
     * not currently used
     */
    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void setConfigure(@NotNull @FunctionPtr(name = "call_Configure") Function_Configure value);

    /**
     * [@fn] Send
     * 
     * Send a MIDIPacketList to the destination endpoint whose refCons are being passed as
     * arguments.
     */
    @NotNull
    @Generated
    @StructureField(order = 8, isGetter = true)
    @FunctionPtr(name = "call_Send")
    public native Function_Send Send();

    /**
     * [@fn] Send
     * 
     * Send a MIDIPacketList to the destination endpoint whose refCons are being passed as
     * arguments.
     */
    @Generated
    @StructureField(order = 8, isGetter = false)
    public native void setSend(@NotNull @FunctionPtr(name = "call_Send") Function_Send value);

    /**
     * [@fn] EnableSource
     * 
     * A client has opened or closed a connection, and now the server is telling the driver
     * that input from a particular source either does or does not have any listeners in
     * the system. The driver may use this information to decide whether to pass messages
     * from the source to the server, and it may even be able to tell the source hardware
     * not to generate incoming MIDI I/O for that source.
     */
    @NotNull
    @Generated
    @StructureField(order = 9, isGetter = true)
    @FunctionPtr(name = "call_EnableSource")
    public native Function_EnableSource EnableSource();

    /**
     * [@fn] EnableSource
     * 
     * A client has opened or closed a connection, and now the server is telling the driver
     * that input from a particular source either does or does not have any listeners in
     * the system. The driver may use this information to decide whether to pass messages
     * from the source to the server, and it may even be able to tell the source hardware
     * not to generate incoming MIDI I/O for that source.
     */
    @Generated
    @StructureField(order = 9, isGetter = false)
    public native void setEnableSource(@NotNull @FunctionPtr(name = "call_EnableSource") Function_EnableSource value);

    /**
     * [@fn] Flush
     * 
     * Only for version 2 drivers (new for CoreMIDI 1.1).
     * 
     * Drivers which support schedule-ahead, when receiving this message, should unschedule
     * all pending output to the specified destination. If the destination is null/0, the
     * driver should unschedule all pending output to all destinations.
     */
    @NotNull
    @Generated
    @StructureField(order = 10, isGetter = true)
    @FunctionPtr(name = "call_Flush")
    public native Function_Flush Flush();

    /**
     * [@fn] Flush
     * 
     * Only for version 2 drivers (new for CoreMIDI 1.1).
     * 
     * Drivers which support schedule-ahead, when receiving this message, should unschedule
     * all pending output to the specified destination. If the destination is null/0, the
     * driver should unschedule all pending output to all destinations.
     */
    @Generated
    @StructureField(order = 10, isGetter = false)
    public native void setFlush(@NotNull @FunctionPtr(name = "call_Flush") Function_Flush value);

    /**
     * [@fn] Monitor
     * 
     * Only for version 2 drivers (new for CoreMIDI 1.1).
     * 
     * Some specialized drivers (e.g. a MIDI monitor display) may wish to intercept and
     * look at all outgoing MIDI messages. After a driver calls
     * MIDIDriverEnableMonitoring(true) on itself, this function is called with the
     * outgoing MIDI packets for all destinations in the system. The Monitor function
     * cannot rely on the MIDI events arriving in order, due to MIDIServer's schedule-ahead
     * facilities.
     */
    @NotNull
    @Generated
    @StructureField(order = 11, isGetter = true)
    @FunctionPtr(name = "call_Monitor")
    public native Function_Monitor Monitor();

    /**
     * [@fn] Monitor
     * 
     * Only for version 2 drivers (new for CoreMIDI 1.1).
     * 
     * Some specialized drivers (e.g. a MIDI monitor display) may wish to intercept and
     * look at all outgoing MIDI messages. After a driver calls
     * MIDIDriverEnableMonitoring(true) on itself, this function is called with the
     * outgoing MIDI packets for all destinations in the system. The Monitor function
     * cannot rely on the MIDI events arriving in order, due to MIDIServer's schedule-ahead
     * facilities.
     */
    @Generated
    @StructureField(order = 11, isGetter = false)
    public native void setMonitor(@NotNull @FunctionPtr(name = "call_Monitor") Function_Monitor value);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_QueryInterface {
        @Generated
        int call_QueryInterface(@NotNull VoidPtr arg0, @ByValue CFUUIDBytes arg1,
                @ReferenceInfo(type = Void.class, depth = 2) Ptr<VoidPtr> arg2);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_AddRef {
        @Generated
        int call_AddRef(@NotNull VoidPtr arg0);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_Release {
        @Generated
        int call_Release(@NotNull VoidPtr arg0);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_FindDevices {
        @Generated
        int call_FindDevices(
                @NotNull @ReferenceInfo(type = MIDIDriverInterface.class, depth = 2) Ptr<Ptr<MIDIDriverInterface>> arg0,
                int arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_Start {
        @Generated
        int call_Start(
                @NotNull @ReferenceInfo(type = MIDIDriverInterface.class, depth = 2) Ptr<Ptr<MIDIDriverInterface>> arg0,
                int arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_Stop {
        @Generated
        int call_Stop(
                @NotNull @ReferenceInfo(type = MIDIDriverInterface.class, depth = 2) Ptr<Ptr<MIDIDriverInterface>> arg0);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_Configure {
        @Generated
        int call_Configure(
                @NotNull @ReferenceInfo(type = MIDIDriverInterface.class, depth = 2) Ptr<Ptr<MIDIDriverInterface>> arg0,
                int arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_Send {
        @Generated
        int call_Send(
                @NotNull @ReferenceInfo(type = MIDIDriverInterface.class, depth = 2) Ptr<Ptr<MIDIDriverInterface>> arg0,
                @NotNull @UncertainArgument("Options: reference, array Fallback: reference") MIDIPacketList arg1,
                @NotNull VoidPtr arg2, @NotNull VoidPtr arg3);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_EnableSource {
        @Generated
        int call_EnableSource(
                @NotNull @ReferenceInfo(type = MIDIDriverInterface.class, depth = 2) Ptr<Ptr<MIDIDriverInterface>> arg0,
                int arg1, byte arg2);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_Flush {
        @Generated
        int call_Flush(
                @NotNull @ReferenceInfo(type = MIDIDriverInterface.class, depth = 2) Ptr<Ptr<MIDIDriverInterface>> arg0,
                int arg1, @Nullable VoidPtr arg2, @Nullable VoidPtr arg3);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_Monitor {
        @Generated
        int call_Monitor(
                @NotNull @ReferenceInfo(type = MIDIDriverInterface.class, depth = 2) Ptr<Ptr<MIDIDriverInterface>> arg0,
                int arg1,
                @NotNull @UncertainArgument("Options: reference, array Fallback: reference") MIDIPacketList arg2);
    }

    /**
     * [@fn] SendPackets
     * 
     * Only for version 3 drivers (new for macOS 12.0).
     * 
     * Send a MIDIEventList to the destination endpoint whose refCons are being passed as
     * arguments.
     */
    @NotNull
    @Generated
    @StructureField(order = 12, isGetter = true)
    @FunctionPtr(name = "call_SendPackets")
    public native Function_SendPackets SendPackets();

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_SendPackets {
        @Generated
        int call_SendPackets(
                @NotNull @ReferenceInfo(type = MIDIDriverInterface.class, depth = 2) Ptr<Ptr<MIDIDriverInterface>> arg0,
                @NotNull @UncertainArgument("Options: reference, array Fallback: reference") MIDIEventList arg1,
                @NotNull VoidPtr arg2, @NotNull VoidPtr arg3);
    }

    /**
     * [@fn] SendPackets
     * 
     * Only for version 3 drivers (new for macOS 12.0).
     * 
     * Send a MIDIEventList to the destination endpoint whose refCons are being passed as
     * arguments.
     */
    @Generated
    @StructureField(order = 12, isGetter = false)
    public native void setSendPackets(@NotNull @FunctionPtr(name = "call_SendPackets") Function_SendPackets value);

    /**
     * [@fn] MonitorEvents
     * 
     * Only for version 3 drivers (new for macOS 12.0).
     * 
     * Same as Monitor but uses MIDEventList, whose protocol may vary from MIDI 1.0.
     */
    @NotNull
    @Generated
    @StructureField(order = 13, isGetter = true)
    @FunctionPtr(name = "call_MonitorEvents")
    public native Function_MonitorEvents MonitorEvents();

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_MonitorEvents {
        @Generated
        int call_MonitorEvents(
                @NotNull @ReferenceInfo(type = MIDIDriverInterface.class, depth = 2) Ptr<Ptr<MIDIDriverInterface>> arg0,
                int arg1,
                @NotNull @UncertainArgument("Options: reference, array Fallback: reference") MIDIEventList arg2);
    }

    /**
     * [@fn] MonitorEvents
     * 
     * Only for version 3 drivers (new for macOS 12.0).
     * 
     * Same as Monitor but uses MIDEventList, whose protocol may vary from MIDI 1.0.
     */
    @Generated
    @StructureField(order = 13, isGetter = false)
    public native void setMonitorEvents(
            @NotNull @FunctionPtr(name = "call_MonitorEvents") Function_MonitorEvents value);
}
