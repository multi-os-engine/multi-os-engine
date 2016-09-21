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

package apple.coremidi.c;

import apple.corefoundation.opaque.CFDataRef;
import apple.corefoundation.opaque.CFDictionaryRef;
import apple.corefoundation.opaque.CFRunLoopRef;
import apple.corefoundation.opaque.CFStringRef;
import apple.coremidi.struct.MIDIDriverInterface;
import apple.coremidi.struct.MIDINotification;
import apple.coremidi.struct.MIDIPacket;
import apple.coremidi.struct.MIDIPacketList;
import apple.coremidi.struct.MIDISysexSendRequest;
import apple.coremidi.struct.MIDIThruConnectionParams;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Inline;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ann.UncertainReturn;
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.IntPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("CoreMIDI")
@Runtime(CRuntime.class)
public final class CoreMIDI {
    @Generated public static final int kMIDIObjectType_ExternalMask = 0x00000010;

    static {
        NatJ.register();
    }

    @Generated
    private CoreMIDI() {
    }

    @Generated
    @CFunction
    public static native int MIDIClientCreate(CFStringRef name,
            @FunctionPtr(name = "call_MIDIClientCreate") Function_MIDIClientCreate notifyProc, VoidPtr notifyRefCon,
            IntPtr outClient);

    @Generated
    @CFunction
    public static native int MIDIClientDispose(int client);

    @Generated
    @CFunction
    public static native int MIDIInputPortCreate(int client, CFStringRef portName,
            @FunctionPtr(name = "call_MIDIInputPortCreate") Function_MIDIInputPortCreate readProc, VoidPtr refCon,
            IntPtr outPort);

    @Generated
    @CFunction
    public static native int MIDIOutputPortCreate(int client, CFStringRef portName, IntPtr outPort);

    @Generated
    @CFunction
    public static native int MIDIPortDispose(int port);

    @Generated
    @CFunction
    public static native int MIDIPortConnectSource(int port, int source, VoidPtr connRefCon);

    @Generated
    @CFunction
    public static native int MIDIPortDisconnectSource(int port, int source);

    @Generated
    @CFunction
    @NUInt
    public static native long MIDIGetNumberOfDevices();

    @Generated
    @CFunction
    public static native int MIDIGetDevice(@NUInt long deviceIndex0);

    @Generated
    @CFunction
    @NUInt
    public static native long MIDIDeviceGetNumberOfEntities(int device);

    @Generated
    @CFunction
    public static native int MIDIDeviceGetEntity(int device, @NUInt long entityIndex0);

    @Generated
    @CFunction
    @NUInt
    public static native long MIDIEntityGetNumberOfSources(int entity);

    @Generated
    @CFunction
    public static native int MIDIEntityGetSource(int entity, @NUInt long sourceIndex0);

    @Generated
    @CFunction
    @NUInt
    public static native long MIDIEntityGetNumberOfDestinations(int entity);

    @Generated
    @CFunction
    public static native int MIDIEntityGetDestination(int entity, @NUInt long destIndex0);

    @Generated
    @CFunction
    public static native int MIDIEntityGetDevice(int inEntity, IntPtr outDevice);

    @Generated
    @CFunction
    @NUInt
    public static native long MIDIGetNumberOfSources();

    @Generated
    @CFunction
    public static native int MIDIGetSource(@NUInt long sourceIndex0);

    @Generated
    @CFunction
    @NUInt
    public static native long MIDIGetNumberOfDestinations();

    @Generated
    @CFunction
    public static native int MIDIGetDestination(@NUInt long destIndex0);

    @Generated
    @CFunction
    public static native int MIDIEndpointGetEntity(int inEndpoint, IntPtr outEntity);

    @Generated
    @CFunction
    public static native int MIDIDestinationCreate(int client, CFStringRef name,
            @FunctionPtr(name = "call_MIDIDestinationCreate") Function_MIDIDestinationCreate readProc, VoidPtr refCon,
            IntPtr outDest);

    @Generated
    @CFunction
    public static native int MIDISourceCreate(int client, CFStringRef name, IntPtr outSrc);

    @Generated
    @CFunction
    public static native int MIDIEndpointDispose(int endpt);

    @Generated
    @CFunction
    @NUInt
    public static native long MIDIGetNumberOfExternalDevices();

    @Generated
    @CFunction
    public static native int MIDIGetExternalDevice(@NUInt long deviceIndex0);

    @Generated
    @CFunction
    public static native int MIDIObjectGetIntegerProperty(int obj, CFStringRef propertyID, IntPtr outValue);

    @Generated
    @CFunction
    public static native int MIDIObjectSetIntegerProperty(int obj, CFStringRef propertyID, int value);

    @Generated
    @CFunction
    public static native int MIDIObjectGetStringProperty(int obj, CFStringRef propertyID, Ptr<CFStringRef> str);

    @Generated
    @CFunction
    public static native int MIDIObjectSetStringProperty(int obj, CFStringRef propertyID, CFStringRef str);

    @Generated
    @CFunction
    public static native int MIDIObjectGetDataProperty(int obj, CFStringRef propertyID, Ptr<CFDataRef> outData);

    @Generated
    @CFunction
    public static native int MIDIObjectSetDataProperty(int obj, CFStringRef propertyID, CFDataRef data);

    @Generated
    @CFunction
    public static native int MIDIObjectGetDictionaryProperty(int obj, CFStringRef propertyID,
            Ptr<CFDictionaryRef> outDict);

    @Generated
    @CFunction
    public static native int MIDIObjectSetDictionaryProperty(int obj, CFStringRef propertyID, CFDictionaryRef dict);

    @Generated
    @CFunction
    public static native int MIDIObjectGetProperties(int obj, Ptr<ConstVoidPtr> outProperties, byte deep);

    @Generated
    @CFunction
    public static native int MIDIObjectRemoveProperty(int obj, CFStringRef propertyID);

    @Generated
    @CFunction
    public static native int MIDIObjectFindByUniqueID(int inUniqueID, IntPtr outObject, IntPtr outObjectType);

    @Generated
    @CFunction
    public static native int MIDISend(int port, int dest,
            @UncertainArgument("Options: reference, array Fallback: reference") MIDIPacketList pktlist);

    @Generated
    @CFunction
    public static native int MIDISendSysex(
            @UncertainArgument("Options: reference, array Fallback: reference") MIDISysexSendRequest request);

    @Generated
    @CFunction
    public static native int MIDIReceived(int src,
            @UncertainArgument("Options: reference, array Fallback: reference") MIDIPacketList pktlist);

    @Generated
    @CFunction
    public static native int MIDIFlushOutput(int dest);

    @Generated
    @CFunction
    public static native int MIDIRestart();

    @Generated
    @CFunction
    @UncertainReturn("Options: reference, array Fallback: reference")
    public static native MIDIPacket MIDIPacketListInit(
            @UncertainArgument("Options: reference, array Fallback: reference") MIDIPacketList pktlist);

    @Generated
    @CFunction
    @UncertainReturn("Options: reference, array Fallback: reference")
    public static native MIDIPacket MIDIPacketListAdd(
            @UncertainArgument("Options: reference, array Fallback: reference") MIDIPacketList pktlist,
            @NUInt long listSize,
            @UncertainArgument("Options: reference, array Fallback: reference") MIDIPacket curPacket, long time,
            @NUInt long nData,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String data);

    @Generated
    @CFunction
    public static native int MIDIDeviceAddEntity(int device, CFStringRef name, byte embedded,
            @NUInt long numSourceEndpoints, @NUInt long numDestinationEndpoints, IntPtr newEntity);

    @Generated
    @CFunction
    public static native int MIDIDeviceRemoveEntity(int device, int entity);

    @Generated
    @CFunction
    public static native int MIDIEntityAddOrRemoveEndpoints(int entity, @NUInt long numSourceEndpoints,
            @NUInt long numDestinationEndpoints);

    @Generated
    @CFunction
    public static native int MIDISetupAddDevice(int device);

    @Generated
    @CFunction
    public static native int MIDISetupRemoveDevice(int device);

    @Generated
    @CFunction
    public static native int MIDISetupAddExternalDevice(int device);

    @Generated
    @CFunction
    public static native int MIDISetupRemoveExternalDevice(int device);

    @Generated
    @CFunction
    public static native int MIDIExternalDeviceCreate(CFStringRef name, CFStringRef manufacturer, CFStringRef model,
            IntPtr outDevice);

    @Generated
    @CFunction
    public static native void MIDIThruConnectionParamsInitialize(
            @UncertainArgument("Options: reference, array Fallback: reference") MIDIThruConnectionParams inConnectionParams);

    @Generated
    @CFunction
    public static native int MIDIThruConnectionCreate(CFStringRef inPersistentOwnerID, CFDataRef inConnectionParams,
            IntPtr outConnection);

    @Generated
    @CFunction
    public static native int MIDIThruConnectionDispose(int connection);

    @Generated
    @CFunction
    public static native int MIDIThruConnectionGetParams(int connection, Ptr<CFDataRef> outConnectionParams);

    @Generated
    @CFunction
    public static native int MIDIThruConnectionSetParams(int connection, CFDataRef inConnectionParams);

    @Generated
    @CFunction
    public static native int MIDIThruConnectionFind(CFStringRef inPersistentOwnerID, Ptr<CFDataRef> outConnectionList);

    @Generated
    @CFunction
    public static native int MIDIDeviceCreate(Ptr<Ptr<MIDIDriverInterface>> owner, CFStringRef name,
            CFStringRef manufacturer, CFStringRef model, IntPtr outDevice);

    @Generated
    @CFunction
    public static native int MIDIDeviceDispose(int device);

    @Generated
    @CFunction
    @NUInt
    public static native long MIDIDeviceListGetNumberOfDevices(int devList);

    @Generated
    @CFunction
    public static native int MIDIDeviceListGetDevice(int devList, @NUInt long index0);

    @Generated
    @CFunction
    public static native int MIDIDeviceListAddDevice(int devList, int dev);

    @Generated
    @CFunction
    public static native int MIDIDeviceListDispose(int devList);

    @Generated
    @CFunction
    public static native int MIDIEndpointSetRefCons(int endpt, VoidPtr ref1, VoidPtr ref2);

    @Generated
    @CFunction
    public static native int MIDIEndpointGetRefCons(int endpt, Ptr<VoidPtr> ref1, Ptr<VoidPtr> ref2);

    @Generated
    @CFunction
    public static native CFRunLoopRef MIDIGetDriverIORunLoop();

    @Generated
    @CFunction
    public static native int MIDIGetDriverDeviceList(Ptr<Ptr<MIDIDriverInterface>> driver);

    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertyName();

    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertyManufacturer();

    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertyModel();

    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertyUniqueID();

    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertyDeviceID();

    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertyReceiveChannels();

    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertyTransmitChannels();

    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertyMaxSysExSpeed();

    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertyAdvanceScheduleTimeMuSec();

    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertyIsEmbeddedEntity();

    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertyIsBroadcast();

    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertySingleRealtimeEntity();

    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertyConnectionUniqueID();

    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertyOffline();

    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertyPrivate();

    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertyDriverOwner();

    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertyNameConfiguration();

    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertyImage();

    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertyDriverVersion();

    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertySupportsGeneralMIDI();

    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertySupportsMMC();

    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertyCanRoute();

    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertyReceivesClock();

    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertyReceivesMTC();

    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertyReceivesNotes();

    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertyReceivesProgramChanges();

    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertyReceivesBankSelectMSB();

    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertyReceivesBankSelectLSB();

    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertyTransmitsClock();

    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertyTransmitsMTC();

    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertyTransmitsNotes();

    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertyTransmitsProgramChanges();

    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertyTransmitsBankSelectMSB();

    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertyTransmitsBankSelectLSB();

    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertyPanDisruptsStereo();

    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertyIsSampler();

    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertyIsDrumMachine();

    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertyIsMixer();

    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertyIsEffectUnit();

    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertyMaxReceiveChannels();

    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertyMaxTransmitChannels();

    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertyDriverDeviceEditorApp();

    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertySupportsShowControl();

    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertyDisplayName();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MIDINetworkBonjourServiceType();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MIDINetworkNotificationContactsDidChange();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MIDINetworkNotificationSessionDidChange();

    @Generated
    @CFunction
    public static native int MIDIClientCreateWithBlock(CFStringRef name, IntPtr outClient,
            @ObjCBlock(name = "call_MIDIClientCreateWithBlock") Block_MIDIClientCreateWithBlock notifyBlock);

    @Generated
    @CFunction
    public static native int MIDIInputPortCreateWithBlock(int client, CFStringRef portName, IntPtr outPort,
            @ObjCBlock(name = "call_MIDIInputPortCreateWithBlock") Block_MIDIInputPortCreateWithBlock readBlock);

    @Generated
    @CFunction
    public static native int MIDIDestinationCreateWithBlock(int client, CFStringRef name, IntPtr outDest,
            @ObjCBlock(name = "call_MIDIDestinationCreateWithBlock") Block_MIDIDestinationCreateWithBlock readBlock);

    @Generated
    @Inline
    @CFunction
    @UncertainReturn("Options: reference, array Fallback: reference")
    public static native MIDIPacket MIDIPacketNext(
            @UncertainArgument("Options: reference, array Fallback: reference") MIDIPacket pkt);

    @Generated
    @Inline
    @CFunction
    @NUInt
    public static native long MIDIThruConnectionParamsSize(
            @UncertainArgument("Options: reference, array Fallback: reference") MIDIThruConnectionParams ptr);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_MIDIClientCreate {
        @Generated
        void call_MIDIClientCreate(
                @UncertainArgument("Options: reference, array Fallback: reference") MIDINotification arg0,
                VoidPtr arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_MIDIInputPortCreate {
        @Generated
        void call_MIDIInputPortCreate(
                @UncertainArgument("Options: reference, array Fallback: reference") MIDIPacketList arg0, VoidPtr arg1,
                VoidPtr arg2);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_MIDIDestinationCreate {
        @Generated
        void call_MIDIDestinationCreate(
                @UncertainArgument("Options: reference, array Fallback: reference") MIDIPacketList arg0, VoidPtr arg1,
                VoidPtr arg2);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_MIDIClientCreateWithBlock {
        @Generated
        void call_MIDIClientCreateWithBlock(MIDINotification arg0);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_MIDIInputPortCreateWithBlock {
        @Generated
        void call_MIDIInputPortCreateWithBlock(MIDIPacketList arg0, VoidPtr arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_MIDIDestinationCreateWithBlock {
        @Generated
        void call_MIDIDestinationCreateWithBlock(MIDIPacketList arg0, VoidPtr arg1);
    }
}
