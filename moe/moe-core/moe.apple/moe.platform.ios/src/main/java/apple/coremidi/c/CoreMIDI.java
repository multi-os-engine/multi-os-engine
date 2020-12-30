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
import apple.coremidi.struct.MIDIEventList;
import apple.coremidi.struct.MIDIEventPacket;
import apple.coremidi.struct.MIDIMessage_64;
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
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ann.UncertainReturn;
import org.moe.natj.general.ptr.ConstIntPtr;
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

    /**
     * [@function]		MIDIClientCreate
     * 
     * Creates a MIDIClient object.
     * 
     * 	Note that notifyProc will always be called on the run loop which was current when
     * 	MIDIClientCreate was first called.
     * 
     * @param			name
     * 					The client's name.
     * @param			notifyProc
     * 					An optional (may be NULL) callback function through which the client
     * 					will receive notifications of changes to the system.
     * @param			notifyRefCon
     * 					A refCon passed back to notifyRefCon
     * @param			outClient
     * 					On successful return, points to the newly-created MIDIClientRef.
     * @return			An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int MIDIClientCreate(CFStringRef name,
            @FunctionPtr(name = "call_MIDIClientCreate") Function_MIDIClientCreate notifyProc, VoidPtr notifyRefCon,
            IntPtr outClient);

    /**
     * [@function]		MIDIClientCreateWithBlock
     * 
     * Creates a MIDIClient object.
     * 
     * 	Note that notifyBlock is called on a thread chosen by the implementation.
     * 	Thread-safety is the block's responsibility.
     * 
     * @param			name
     * 					The client's name.
     * @param			outClient
     * 					On successful return, points to the newly-created MIDIClientRef.
     * @param			notifyBlock
     * 					An optional (may be NULL) block via which the client
     * 					will receive notifications of changes to the system.
     * @return			An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int MIDIClientCreateWithBlock(CFStringRef name, IntPtr outClient,
            @ObjCBlock(name = "call_MIDIClientCreateWithBlock") Block_MIDIClientCreateWithBlock notifyBlock);

    /**
     * [@function]   	MIDIClientDispose
     * 
     * Disposes a MIDIClient object.
     * 
     * 	It is not essential to call this function; the CoreMIDI framework will automatically
     * 	dispose all MIDIClients when an application terminates. However, if this method is
     * 	called to dispose the last/only MIDIClient owned by an application, the MIDI server may
     * 	exit if there are no other MIDIClients remaining in the system, causing all subsequent calls
     * 	to MIDIClientCreate and MIDIClientCreateWithBlock by that application to fail. For this reason,
     * 	disposing all of an application's MIDIClients is strongly discouraged.
     * 
     * @param  		client
     * 					The client to dispose.
     * @return			An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int MIDIClientDispose(int client);

    /**
     * [@function]		MIDIInputPortCreate
     * 
     * Creates an input port through which the client may receive
     * 				incoming MIDI messages from any MIDI source.
     * 
     * 	After creating a port, use MIDIPortConnectSource to establish an input connection from
     * 	any number of sources to your port.
     * 
     * 	readProc will be called on a separate high-priority thread owned by CoreMIDI.
     * 
     * @param			client
     * 					The client to own the newly-created port.
     * @param			portName
     * 					The name of the port.
     * @param			readProc
     * 					The MIDIReadProc which will be called with incoming MIDI,
     * 					from sources connected to this port.
     * @param			refCon
     * 					The refCon passed to readHook.
     * @param			outPort
     * 					On successful return, points to the newly-created
     * 					MIDIPort.
     * @return			An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int MIDIInputPortCreate(int client, CFStringRef portName,
            @FunctionPtr(name = "call_MIDIInputPortCreate") Function_MIDIInputPortCreate readProc, VoidPtr refCon,
            IntPtr outPort);

    /**
     * [@function]		MIDIInputPortCreateWithBlock
     * 
     * Creates an input port through which the client may receive
     * 				incoming MIDI messages from any MIDI source.
     * 
     * 	After creating a port, use MIDIPortConnectSource to establish an input connection from
     * 	any number of sources to your port.
     * 
     * 	readBlock will be called on a separate high-priority thread owned by CoreMIDI.
     * 
     * @param			client
     * 					The client to own the newly-created port.
     * @param			portName
     * 					The name of the port.
     * @param			outPort
     * 					On successful return, points to the newly-created
     * 					MIDIPort.
     * @param			readBlock
     * 					The MIDIReadBlock which will be called with incoming MIDI, from sources
     * 					connected to this port.
     * @return			An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int MIDIInputPortCreateWithBlock(int client, CFStringRef portName, IntPtr outPort,
            @ObjCBlock(name = "call_MIDIInputPortCreateWithBlock") Block_MIDIInputPortCreateWithBlock readBlock);

    /**
     * [@function]		MIDIOutputPortCreate
     * 
     * Creates an output port through which the client may send
     * 				outgoing MIDI messages to any MIDI destination.
     * 
     * 	Output ports provide a mechanism for MIDI merging.  CoreMIDI assumes that each output
     * 	port will be responsible for sending only a single MIDI stream to each destination,
     * 	although a single port may address all of the destinations in the system.
     * 
     * 	Multiple output ports are only necessary when an application is capable of directing
     * 	multiple simultaneous MIDI streams to the same destination.
     * 
     * @param			client
     * 					The client to own the newly-created port
     * @param			portName
     * 					The name of the port.
     * @param			outPort
     * 					On successful return, points to the newly-created
     * 					MIDIPort.
     * @return			An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int MIDIOutputPortCreate(int client, CFStringRef portName, IntPtr outPort);

    /**
     * [@function]		MIDIPortDispose
     * 
     * Disposes a MIDIPort object.
     * 
     * 	It is not usually necessary to call this function; when an application's MIDIClient's
     * 	are automatically disposed at termination, or explicitly, via MIDIClientDispose, the
     * 	client's ports are automatically disposed at that time.
     * 
     * @param			port
     * 					The port to dispose.
     * @return			An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int MIDIPortDispose(int port);

    /**
     * [@function]		MIDIPortConnectSource
     * 
     * Establishes a connection from a source to a client's input port.
     * 
     * @param			port
     * 					The port to which to create the connection.  This port's
     * 					readProc is called with incoming MIDI from the source.
     * @param			source
     * 					The source from which to create the connection.
     * @param			connRefCon
     * 					This refCon is passed to the port's MIDIReadProc or MIDIReadBlock, as a way to
     * 					identify the source.
     * @return			An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int MIDIPortConnectSource(int port, int source, VoidPtr connRefCon);

    /**
     * [@function]		MIDIPortDisconnectSource
     * 
     * Closes a previously-established source-to-input port
     * 				connection.
     * 
     * @param			port
     * 					The port whose connection is being closed.
     * @param			source
     * 					The source from which to close a connection to the
     * 					specified port.
     * @return			An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int MIDIPortDisconnectSource(int port, int source);

    /**
     * [@function]		MIDIGetNumberOfDevices
     * 
     * Returns the number of devices in the system.
     * 
     * @return			The number of devices in the system, or 0 if an error
     * 				occurred.
     */
    @Generated
    @CFunction
    @NUInt
    public static native long MIDIGetNumberOfDevices();

    /**
     * [@function]		MIDIGetDevice
     * 
     * Returns one of the devices in the system.
     * 
     * 	Use this to enumerate the devices in the system.
     * 
     * 	To enumerate the entities in the system, you can walk through the devices, then walk
     * 	through the devices' entities.
     * 
     * 	Note: If a client iterates through the devices and entities in the system, it will not
     * 	ever visit any virtual sources and destinations created by other clients.  Also, a
     * 	device iteration will return devices which are "offline" (were present in the past but
     * 	are not currently present), while iterations through the system's sources and
     * 	destinations will not include the endpoints of offline devices.
     * 
     * 	Thus clients should usually use MIDIGetNumberOfSources, MIDIGetSource,
     * 	MIDIGetNumberOfDestinations and MIDIGetDestination, rather iterating through devices and
     * 	entities to locate endpoints.
     * 
     * @param			deviceIndex0
     * 					The index (0...MIDIGetNumberOfDevices()-1) of the device
     * 					to return.
     * @return			A reference to a device, or NULL if an error occurred.
     */
    @Generated
    @CFunction
    public static native int MIDIGetDevice(@NUInt long deviceIndex0);

    /**
     * [@function]		MIDIDeviceGetNumberOfEntities
     * 
     * Returns the number of entities in a given device.
     * 
     * @param			device
     * 					The device being queried.
     * 
     * @return			The number of entities the device contains, or 0 if an
     * 				error occurred.
     */
    @Generated
    @CFunction
    @NUInt
    public static native long MIDIDeviceGetNumberOfEntities(int device);

    /**
     * [@function]		MIDIDeviceGetEntity
     * 
     * Returns one of a given device's entities.
     * 
     * @param			device
     * 					The device being queried.
     * @param			entityIndex0
     * 					The index (0...MIDIDeviceGetNumberOfEntities(device)-1)
     * 					of the entity to return
     * 
     * @return			A reference to an entity, or NULL if an error occurred.
     */
    @Generated
    @CFunction
    public static native int MIDIDeviceGetEntity(int device, @NUInt long entityIndex0);

    /**
     * [@function]		MIDIEntityGetNumberOfSources
     * 
     * Returns the number of sources in a given entity.
     * 
     * @param			entity
     * 					The entity being queried
     * 
     * @return			The number of sources the entity contains, or 0 if an
     * 				error occurred.
     */
    @Generated
    @CFunction
    @NUInt
    public static native long MIDIEntityGetNumberOfSources(int entity);

    /**
     * [@function]		MIDIEntityGetSource
     * 
     * Returns one of a given entity's sources.
     * 
     * @param			entity
     * 					The entity being queried.
     * @param			sourceIndex0
     * 					The index (0...MIDIEntityGetNumberOfSources(entity)-1) of
     * 					the source to return
     * 
     * @return			A reference to a source, or NULL if an error occurred.
     */
    @Generated
    @CFunction
    public static native int MIDIEntityGetSource(int entity, @NUInt long sourceIndex0);

    /**
     * [@function]		MIDIEntityGetNumberOfDestinations
     * 
     * Returns the number of destinations in a given entity.
     * 
     * @param			entity
     * 					The entity being queried
     * 
     * @return			The number of destinations the entity contains, or 0
     * 				if an error occurred.
     */
    @Generated
    @CFunction
    @NUInt
    public static native long MIDIEntityGetNumberOfDestinations(int entity);

    /**
     * [@function]		MIDIEntityGetDestination
     * 
     * Returns one of a given entity's destinations.
     * 
     * @param			entity
     * 					The entity being queried.
     * @param			destIndex0
     * 					The index (0...MIDIEntityGetNumberOfDestinations(entity)
     * 					- 1) of the destination to return
     * 
     * @return			A reference to a destination, or NULL if an error occurred.
     */
    @Generated
    @CFunction
    public static native int MIDIEntityGetDestination(int entity, @NUInt long destIndex0);

    /**
     * [@function]		MIDIEntityGetDevice
     * 
     * Returns an entity's device.
     * 
     * @param			inEntity
     * 					The entity being queried.
     * @param			outDevice
     * 					On successful return, the entity's owning device.
     */
    @Generated
    @CFunction
    public static native int MIDIEntityGetDevice(int inEntity, IntPtr outDevice);

    /**
     * [@function]		MIDIGetNumberOfSources
     * 
     * Returns the number of sources in the system.
     * 
     * @return			The number of sources in the system, or 0 if an error
     * 				occurred.
     */
    @Generated
    @CFunction
    @NUInt
    public static native long MIDIGetNumberOfSources();

    /**
     * [@function]		MIDIGetSource
     * 
     * Returns one of the sources in the system.
     * 
     * @param			sourceIndex0
     * 					The index (0...MIDIGetNumberOfSources()-1) of the source
     * 					to return
     * @return			A reference to a source, or NULL if an error occurred.
     */
    @Generated
    @CFunction
    public static native int MIDIGetSource(@NUInt long sourceIndex0);

    /**
     * [@function]		MIDIGetNumberOfDestinations
     * 
     * Returns the number of destinations in the system.
     * 
     * @return			The number of destinations in the system, or 0 if an error
     * 				occurred.
     */
    @Generated
    @CFunction
    @NUInt
    public static native long MIDIGetNumberOfDestinations();

    /**
     * [@function]		MIDIGetDestination
     * 
     * Returns one of the destinations in the system.
     * 
     * @param			destIndex0
     * 					The index (0...MIDIGetNumberOfDestinations()-1) of the
     * 					destination to return
     * @return			A reference to a destination, or NULL if an error occurred.
     */
    @Generated
    @CFunction
    public static native int MIDIGetDestination(@NUInt long destIndex0);

    /**
     * [@function]		MIDIEndpointGetEntity
     * 
     * Returns an endpoint's entity.
     * 
     * 	Virtual sources and destinations don't have entities.
     * 
     * @param			inEndpoint
     * 					The endpoint being queried.
     * @param			outEntity
     * 					On exit, the endpoint's owning entity, or NULL if none.
     */
    @Generated
    @CFunction
    public static native int MIDIEndpointGetEntity(int inEndpoint, IntPtr outEntity);

    /**
     * [@function]		MIDIDestinationCreate
     * 
     * Creates a virtual destination in a client.
     * 
     * 	The specified readProc gets called when clients send MIDI to your virtual destination.
     * 
     * 	Drivers need not call this; when they create devices and entities, sources and
     * 	destinations are created at that time.
     * 
     * 	After creating a virtual destination, it's a good idea to assign it the same unique ID
     * 	it had the last time your application created it. (Although you should be prepared for
     * 	this to fail in the unlikely event of a collision.) This will permit other clients
     * 	to retain persistent references to your virtual destination more easily.
     * 
     * 	See the discussion of kMIDIPropertyAdvanceScheduleTimeMuSec for notes about the
     * 	relationship between when a sender sends MIDI to the destination and when it is
     * 	received.
     * 
     * @param			client
     * 					The client owning the virtual destination.
     * @param			name
     * 					The name of the virtual destination.
     * @param			readProc
     * 					The MIDIReadProc to be called when a client sends MIDI to
     * 					the virtual destination.
     * @param			refCon
     * 					The refCon to be passed to the readProc.
     * @param			outDest
     * 					On successful return, a pointer to the newly-created
     * 					destination.
     * @return			An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int MIDIDestinationCreate(int client, CFStringRef name,
            @FunctionPtr(name = "call_MIDIDestinationCreate") Function_MIDIDestinationCreate readProc, VoidPtr refCon,
            IntPtr outDest);

    /**
     * [@function]		MIDIDestinationCreateWithBlock
     * 
     * Creates a virtual destination in a client.
     * 
     * 	The specified readBlock gets called when clients send MIDI to your virtual destination.
     * 
     * 	Drivers need not call this; when they create devices and entities, sources and
     * 	destinations are created at that time.
     * 
     * 	After creating a virtual destination, it's a good idea to assign it the same unique ID
     * 	it had the last time your application created it. (Although you should be prepared for
     * 	this to fail in the unlikely event of a collision.) This will permit other clients
     * 	to retain persistent references to your virtual destination more easily.
     * 
     * 	See the discussion of kMIDIPropertyAdvanceScheduleTimeMuSec for notes about the
     * 	relationship between when a sender sends MIDI to the destination and when it is
     * 	received.
     * 
     * @param			client
     * 					The client owning the virtual destination.
     * @param			name
     * 					The name of the virtual destination.
     * @param			outDest
     * 					On successful return, a pointer to the newly-created
     * 					destination.
     * @param			readBlock
     * 					The MIDIReadBlock to be called when a client sends MIDI to the virtual
     * 					destination.
     * @return			An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int MIDIDestinationCreateWithBlock(int client, CFStringRef name, IntPtr outDest,
            @ObjCBlock(name = "call_MIDIDestinationCreateWithBlock") Block_MIDIDestinationCreateWithBlock readBlock);

    /**
     * [@function]		MIDISourceCreate
     * 
     * Creates a virtual source in a client.
     * 
     * 	Drivers need not call this; when they create devices and entities, sources and
     * 	destinations are created at that time.
     * 
     * 	After creating a virtual source, use MIDIReceived to transmit MIDI messages from your
     * 	virtual source to any clients connected to the virtual source.
     * 
     * 	After creating a virtual source, it's a good idea to assign it the same unique ID it had
     * 	the last time your application created it. (Although you should be prepared for this to
     * 	fail in the unlikely event of a collision.) This will permit other clients to retain
     * 	persistent references to your virtual source more easily.
     * 
     * @param			client
     * 					The client owning the virtual source.
     * @param			name
     * 					The name of the virtual source.
     * @param			outSrc
     * 					On successful return, a pointer to the newly-created
     * 					source.
     * @return			An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int MIDISourceCreate(int client, CFStringRef name, IntPtr outSrc);

    /**
     * [@function]		MIDIEndpointDispose
     * 
     * Disposes a virtual source or destination your client created.
     * 
     * @param			endpt
     * 					The endpoint to be disposed.
     * 
     * @return			An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int MIDIEndpointDispose(int endpt);

    /**
     * [@function]		MIDIGetNumberOfExternalDevices
     * 
     * Returns the number of external MIDI devices in the system.
     * 
     * 	External MIDI devices are MIDI devices connected to driver endpoints via a standard MIDI
     * 	cable. Their presence is completely optional, only when a UI (such as Audio MIDI Setup)
     * 	adds them.
     * 
     * @return			The number of external devices in the system, or 0 if an error
     * 				occurred.
     */
    @Generated
    @CFunction
    @NUInt
    public static native long MIDIGetNumberOfExternalDevices();

    /**
     * [@function]		MIDIGetExternalDevice
     * 
     * Returns one of the external devices in the system.
     * 
     * 	Use this to enumerate the external devices in the system.
     * 
     * @param			deviceIndex0
     * 					The index (0...MIDIGetNumberOfDevices()-1) of the device
     * 					to return.
     * @return			A reference to a device, or NULL if an error occurred.
     */
    @Generated
    @CFunction
    public static native int MIDIGetExternalDevice(@NUInt long deviceIndex0);

    /**
     * [@function]		MIDIObjectGetIntegerProperty
     * 
     * Gets an object's integer-type property.
     * 
     * 	(See the MIDIObjectRef documentation for information about properties.)
     * 
     * @param			obj
     * 					The object whose property is to be returned.
     * @param			propertyID
     * 					Name of the property to return.
     * @param			outValue
     * 					On successful return, the value of the property.
     * @return			An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int MIDIObjectGetIntegerProperty(int obj, CFStringRef propertyID, IntPtr outValue);

    /**
     * [@function]		MIDIObjectSetIntegerProperty
     * 
     * Sets an object's integer-type property.
     * 
     * 	(See the MIDIObjectRef documentation for information about properties.)
     * 
     * @param			obj
     * 					The object whose property is to be altered.
     * @param			propertyID
     * 					Name of the property to set.
     * @param			value
     * 					New value of the property.
     * @return			An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int MIDIObjectSetIntegerProperty(int obj, CFStringRef propertyID, int value);

    /**
     * [@function]		MIDIObjectGetStringProperty
     * 
     * Gets an object's string-type property.
     * 
     * 	(See the MIDIObjectRef documentation for information about properties.)
     * 
     * @param			obj
     * 					The object whose property is to be returned.
     * @param			propertyID
     * 					Name of the property to return.
     * @param			str
     * 					On successful return, the value of the property.
     * @return			An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int MIDIObjectGetStringProperty(int obj, CFStringRef propertyID, Ptr<CFStringRef> str);

    /**
     * [@function]		MIDIObjectSetStringProperty
     * 
     * Sets an object's string-type property.
     * 
     * 	(See the MIDIObjectRef documentation for information about properties.)
     * 
     * @param			obj
     * 					The object whose property is to be altered.
     * @param			propertyID
     * 					Name of the property to set.
     * @param			str
     * 					New value of the property.
     * @return			An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int MIDIObjectSetStringProperty(int obj, CFStringRef propertyID, CFStringRef str);

    /**
     * 	[@function]		MIDIObjectGetDataProperty
     * 
     * Gets an object's data-type property.
     * 
     * (See the MIDIObjectRef documentation for information
     * 					about properties.)
     * 
     * 	@param			obj
     * 						The object whose property is to be returned.
     * 	@param			propertyID
     * 						Name of the property to return.
     * 	@param			outData
     * 						On successful return, the value of the property.
     * 	@return			An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int MIDIObjectGetDataProperty(int obj, CFStringRef propertyID, Ptr<CFDataRef> outData);

    /**
     * [@function]		MIDIObjectSetDataProperty
     * 
     * Sets an object's data-type property.
     * 
     * 	(See the MIDIObjectRef documentation for information about properties.)
     * 
     * @param			obj
     * 					The object whose property is to be altered.
     * @param			propertyID
     * 					Name of the property to set.
     * @param			data
     * 					New value of the property.
     * @return			An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int MIDIObjectSetDataProperty(int obj, CFStringRef propertyID, CFDataRef data);

    /**
     * [@function]		MIDIObjectGetDictionaryProperty
     * 
     * Gets an object's dictionary-type property.
     * 
     * 	(See the MIDIObjectRef documentation for information about properties.)
     * 
     * @param			obj
     * 					The object whose property is to be returned.
     * @param			propertyID
     * 					Name of the property to return.
     * @param			outDict
     * 					On successful return, the value of the property.
     * @return			An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int MIDIObjectGetDictionaryProperty(int obj, CFStringRef propertyID,
            Ptr<CFDictionaryRef> outDict);

    /**
     * [@function]		MIDIObjectSetDictionaryProperty
     * 
     * Sets an object's dictionary-type property.
     * 
     * 	(See the MIDIObjectRef documentation for information about properties.)
     * 
     * @param			obj
     * 					The object whose property is to be altered.
     * @param			propertyID
     * 					Name of the property to set.
     * @param			dict
     * 					New value of the property.
     * @return			An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int MIDIObjectSetDictionaryProperty(int obj, CFStringRef propertyID, CFDictionaryRef dict);

    /**
     * [@function]		MIDIObjectGetProperties
     * 
     * Gets all of an object's properties.
     * 
     * 	Returns a CFPropertyList of all of an object's properties. The property list may be a
     * 	dictionary or an array. Dictionaries map property names (CFString) to values, which may
     * 	be CFNumber, CFString, or CFData.  Arrays are arrays of such values.
     * 
     * 	Properties which an object inherits from its owning object (if any) are not included.
     * 
     * @param			obj
     * 					The object whose properties are to be returned.
     * @param			outProperties
     * 					On successful return, the object's properties.
     * @param			deep
     * 					true if the object's child objects are to be included
     * 					(e.g. a device's entities, or an entity's endpoints).
     * @return			An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int MIDIObjectGetProperties(int obj, Ptr<ConstVoidPtr> outProperties, byte deep);

    /**
     * [@function]		MIDIObjectRemoveProperty
     * 
     * Removes an object's property.
     * 
     * @param			obj
     * 					The object whose property is to be removed.
     * @param			propertyID
     * 					The property to be removed.
     * @return			An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int MIDIObjectRemoveProperty(int obj, CFStringRef propertyID);

    /**
     * [@function]		MIDIObjectFindByUniqueID
     * 
     * Locates a device, external device, entity, or endpoint
     * 				by its uniqueID.
     * 
     * @param			inUniqueID
     * 					The uniqueID of the object to search for.  (This should
     * 					be the result of an earlier call to MIDIObjectGetIntegerProperty
     * 					for the property kMIDIPropertyUniqueID).
     * @param			outObject
     * 					The returned object, or 0 if the object was not found or
     * 					an error occurred.  This should be cast to the appropriate
     * 					type (MIDIDeviceRef, MIDIEntityRef, MIDIEndpointRef),
     * 					according to *outObjectType.
     * @param			outObjectType
     * 					On exit, the type of object which was found; undefined
     * 					if none found.
     * @return			An OSStatus error code, including kMIDIObjectNotFound if there
     * 				is no object with the specified uniqueID.
     */
    @Generated
    @CFunction
    public static native int MIDIObjectFindByUniqueID(int inUniqueID, IntPtr outObject, IntPtr outObjectType);

    /**
     * [@function]		MIDISend
     * 
     * Sends MIDI to a destination.
     * 
     * 	Events with future timestamps are scheduled for future delivery.  CoreMIDI performs
     * 	any needed MIDI merging.
     * 
     * @param			port
     * 					The output port through which the MIDI is to be sent.
     * @param			dest
     * 					The destination to receive the events.
     * @param			pktlist
     * 					The MIDI events to be sent.
     * @return			An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int MIDISend(int port, int dest,
            @UncertainArgument("Options: reference, array Fallback: reference") MIDIPacketList pktlist);

    /**
     * [@function]		MIDISendSysex
     * 
     * Sends a single system-exclusive event, asynchronously.
     * 
     * 	request->data must point to a single MIDI system-exclusive message, or portion thereof.
     * 
     * @param			request
     * 					Contains the destination, and a pointer to the MIDI data to be sent.
     * @return			An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int MIDISendSysex(
            @UncertainArgument("Options: reference, array Fallback: reference") MIDISysexSendRequest request);

    /**
     * [@function]		MIDIReceived
     * 
     * Distributes incoming MIDI from a source to the client input ports
     * 				which are connected to that source.
     * 
     * 	Drivers should call this function when receiving MIDI from a source.
     * 
     * 	Clients which have created virtual sources, using MIDISourceCreate, should call this
     * 	function when the source is generating MIDI.
     * 
     * 	Unlike MIDISend(), a timestamp of 0 is not equivalent to "now"; the driver or virtual
     * 	source is responsible for putting proper timestamps in the packets.
     * 
     * @param			src
     * 					The source which is transmitting MIDI.
     * @param			pktlist
     * 					The MIDI events to be transmitted.
     * @return			An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int MIDIReceived(int src,
            @UncertainArgument("Options: reference, array Fallback: reference") MIDIPacketList pktlist);

    /**
     * [@function]		MIDIFlushOutput
     * 
     * Unschedules previously-sent packets.
     * 
     * 	Clients may use MIDIFlushOutput to cancel the sending of packets that were previously
     * 	scheduled for future delivery.
     * 
     * @param			dest
     * 					All pending events scheduled to be sent to this destination
     * 					are unscheduled.  If NULL, the operation applies to
     * 					all destinations.
     */
    @Generated
    @CFunction
    public static native int MIDIFlushOutput(int dest);

    /**
     * [@function]		MIDIRestart
     * 
     * Stops and restarts MIDI I/O.
     * 
     * 	This is useful for forcing CoreMIDI to ask its drivers to rescan for hardware.
     * 
     * @return			An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int MIDIRestart();

    /**
     * [@function]		MIDIPacketNext
     * 
     * Advances a MIDIPacket pointer to the MIDIPacket which immediately follows it
     * 				in memory if it is part of a MIDIPacketList.
     * 
     * @param			pkt
     * 					A pointer to a MIDIPacket in a MIDIPacketList.
     * 
     * @return			The subsequent packet in the MIDIPacketList.
     */
    @Generated
    @Inline
    @CFunction
    @UncertainReturn("Options: reference, array Fallback: reference")
    public static native MIDIPacket MIDIPacketNext(
            @UncertainArgument("Options: reference, array Fallback: reference") MIDIPacket pkt);

    /**
     * [@function]		MIDIPacketListInit
     * 
     * Prepares a MIDIPacketList to be built up dynamically.
     * 
     * @param			pktlist
     * 					The packet list to be initialized.
     * 
     * @return			A pointer to the first MIDIPacket in the packet list.
     */
    @Generated
    @CFunction
    @UncertainReturn("Options: reference, array Fallback: reference")
    public static native MIDIPacket MIDIPacketListInit(
            @UncertainArgument("Options: reference, array Fallback: reference") MIDIPacketList pktlist);

    /**
     * [@function]		MIDIPacketListAdd
     * 
     * Adds a MIDI event to a MIDIPacketList.
     * 
     * 	The maximum size of a packet list is 65536 bytes. Large sysex messages must be sent in
     * 	smaller packet lists.
     * 
     * @param			pktlist
     * 					The packet list to which the event is to be added.
     * @param			listSize
     * 					The size, in bytes, of the packet list.
     * @param			curPacket
     * 					A packet pointer returned by a previous call to
     * 					MIDIPacketListInit or MIDIPacketListAdd for this packet
     * 					list.
     * @param			time
     * 					The new event's time.
     * @param			nData
     * 					The length of the new event, in bytes.
     * @param			data
     * 					The new event.  May be a single MIDI event, or a partial
     * 					sys-ex event.  Running status is <b>not</b> permitted.
     * @return			Returns null if there was not room in the packet for the
     * 				event; otherwise returns a packet pointer which should be
     * 				passed as curPacket in a subsequent call to this function.
     */
    @Generated
    @CFunction
    @UncertainReturn("Options: reference, array Fallback: reference")
    public static native MIDIPacket MIDIPacketListAdd(
            @UncertainArgument("Options: reference, array Fallback: reference") MIDIPacketList pktlist,
            @NUInt long listSize,
            @UncertainArgument("Options: reference, array Fallback: reference") MIDIPacket curPacket, long time,
            @NUInt long nData,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String data);

    /**
     *   -----------------------------------------------------------------------------
     * [@function]		MIDIDeviceAddEntity
     * 
     * Drivers call this function to specify one of the entities that
     * 				comprise a device.
     * 
     * 				Non-drivers may call this function as of CoreMIDI 1.1 to
     * 				add entities to external devices.
     * 
     * @param			device
     * 					The device to which an entity is to be added.
     * @param			name
     * 					The name of the new entity.
     * @param			embedded
     * 					True if this entity is inside the device, false if the
     * 					entity simply consists of external connectors to which
     * 					other devices can be attached.
     * @param			numSourceEndpoints
     * 					The number of source endpoints the entity has.
     * @param			numDestinationEndpoints
     * 					The number of destination endpoints the entity has.
     * @param			newEntity
     * 					On successful return, points to the newly-created entity.
     * @return			An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int MIDIDeviceAddEntity(int device, CFStringRef name, byte embedded,
            @NUInt long numSourceEndpoints, @NUInt long numDestinationEndpoints, IntPtr newEntity);

    /**
     *   -----------------------------------------------------------------------------
     * [@function]		MIDIDeviceRemoveEntity
     * 
     * Drivers may call this function to remove one of a device's
     * 				entities.
     * 
     * 				New for CoreMIDI 1.1.
     * 
     * @param			device
     * 					The device from which an entity is to be removed.
     * @param			entity
     * 					The entity to be removed.
     * @return			An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int MIDIDeviceRemoveEntity(int device, int entity);

    /**
     *   -----------------------------------------------------------------------------
     * [@function]		MIDIEntityAddOrRemoveEndpoints
     * 
     * Drivers and configuration editors may call this function to add to
     * 				or remove an entity's endpoints.
     * 
     * 				New for CoreMIDI 1.3.
     * 
     * 				The MIDIProtocolID of new endpoints is initially the same as that of
     * 				the entity.
     * 
     * @param			entity
     * 					The entity whose endpoints are to be manipulated.
     * @param			numSourceEndpoints
     * 					The desired new number of source endpoints.
     * @param			numDestinationEndpoints
     * 					The desired new number of destination endpoints.
     * @return			An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int MIDIEntityAddOrRemoveEndpoints(int entity, @NUInt long numSourceEndpoints,
            @NUInt long numDestinationEndpoints);

    /**
     *   -----------------------------------------------------------------------------
     * [@function]		MIDISetupAddDevice
     * 
     * Adds a driver-owner MIDI device to the current MIDISetup
     * 
     * Only MIDI drivers may make this call; it is in this header
     * 				file only for consistency with MIDISetupRemoveDevice.
     * 
     * 				New for CoreMIDI 1.1.
     * 
     * @param			device
     * 					The device to be added.
     */
    @Generated
    @CFunction
    public static native int MIDISetupAddDevice(int device);

    /**
     *   -----------------------------------------------------------------------------
     * [@function]		MIDISetupRemoveDevice
     * 
     * Removes a driver-owned MIDI device from the current MIDISetup
     * 
     * Generally this should only be called from a studio configuration
     * 				editor, to remove a device which is offline and which the user
     * 				has specified as being permanently missing.
     * 
     * 				Instead of removing devices from the setup, drivers should
     * 				set the device's kMIDIPropertyOffline to 1 so that if the
     * 				device reappears later, none of its properties are lost.
     * 
     * 				New for CoreMIDI 1.1.
     * 
     * @param			device
     * 					The device to be added.
     */
    @Generated
    @CFunction
    public static native int MIDISetupRemoveDevice(int device);

    /**
     *   -----------------------------------------------------------------------------
     * [@function]		MIDISetupAddExternalDevice
     * 
     * Adds an external MIDI device to the current MIDISetup
     * 
     * Useful for a studio configuration editor.  New for CoreMIDI 1.1.
     * 
     * @param			device
     * 					The device to be added.
     */
    @Generated
    @CFunction
    public static native int MIDISetupAddExternalDevice(int device);

    /**
     *   -----------------------------------------------------------------------------
     * [@function]		MIDISetupRemoveExternalDevice
     * 
     * Removes an external MIDI device from the current MIDISetup
     * 
     * Useful for a studio configuration editor.  New for CoreMIDI 1.1.
     * 
     * @param			device
     * 					The device to be removed.
     */
    @Generated
    @CFunction
    public static native int MIDISetupRemoveExternalDevice(int device);

    /**
     *   -----------------------------------------------------------------------------
     * [@function]		MIDIExternalDeviceCreate
     * 
     * Create a new external MIDI device.
     * 
     * Non-drivers may call this function as of CoreMIDI 1.1, to
     * 				create external devices.
     * 
     * 				The new device is not added to the current MIDISetupRef;
     * 				to do this, use MIDISetupAddExternalDevice.
     * 
     * @param			name
     * 					The name of the new device.
     * @param			manufacturer
     * 					The name of the device's manufacturer.
     * @param			model
     * 					The device's model name.
     * @param			outDevice
     * 					On successful return, points to the newly-created device.
     * @return			An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int MIDIExternalDeviceCreate(CFStringRef name, CFStringRef manufacturer, CFStringRef model,
            IntPtr outDevice);

    /**
     *    [@defined]    MIDIThruConnectionParamsSize
     * 
     * Returns the size of a MIDIThruConnectionParams.
     * 
     * Accounts for the variable-length elements in the structure and returns its true
     * size in bytes.
     */
    @Generated
    @Inline
    @CFunction
    @NUInt
    public static native long MIDIThruConnectionParamsSize(
            @UncertainArgument("Options: reference, array Fallback: reference") MIDIThruConnectionParams ptr);

    /**
     *    [@function]   MIDIThruConnectionParamsInitialize
     * 
     * Fills a MIDIThruConnectionParams with default values.
     * 
     *    @param      inConnectionParams  The struct to be initialized.
     * 
     * This convenience function fills the connection structure with default values: no endpoints,
     * no transformations (mostly zeroes except for the channel map). Then, just filling in the
     * source and adding one destination will create a simple, unmodified thru connection.
     */
    @Generated
    @CFunction
    public static native void MIDIThruConnectionParamsInitialize(
            @UncertainArgument("Options: reference, array Fallback: reference") MIDIThruConnectionParams inConnectionParams);

    /**
     * [@function]   MIDIThruConnectionCreate
     * 
     * Creates a thru connection.
     * 
     * @param      inPersistentOwnerID
     *                 If null, then the connection is marked as owned by the client
     *                 and will be automatically disposed with the client.  if it is non-null, then it
     *                 should be a unique identifier, e.g. "com.mycompany.MyCoolProgram".
     * @param      inConnectionParams
     *                 A MIDIThruConnectionParams contained in a CFDataRef.
     * @param      outConnection
     *                 On successful return, a reference to the newly-created connection.
     * @return     An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int MIDIThruConnectionCreate(CFStringRef inPersistentOwnerID, CFDataRef inConnectionParams,
            IntPtr outConnection);

    /**
     * [@function]   MIDIThruConnectionDispose
     * 
     * Disposes a thru connection.
     * 
     * @param      connection
     *                 The connection to be disposed
     * @return     An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int MIDIThruConnectionDispose(int connection);

    /**
     *    [@function]   MIDIThruConnectionGetParams
     * 
     * Obtains a thru connection's MIDIThruConnectionParams.
     * 
     *    @param      connection
     *                    The connection to be disposed.
     *    @param      outConnectionParams
     *                    On successful return, the connection's MIDIThruConnectionParams in a CFDataRef
     *    @return     An OSStatus result code.
     * 
     * The returned CFDataRef contains a MIDIThruConnectionParams structure. The caller is responsible
     * for releasing it.
     */
    @Generated
    @CFunction
    public static native int MIDIThruConnectionGetParams(int connection, Ptr<CFDataRef> outConnectionParams);

    /**
     * [@function]   MIDIThruConnectionSetParams
     * 
     * Alters a thru connection's MIDIThruConnectionParams.
     * 
     * @param      connection
     *                 The connection to be modified.
     * @param      inConnectionParams
     *                 The connection's new MIDIThruConnectionParams in a CFDataRef
     * @return     An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int MIDIThruConnectionSetParams(int connection, CFDataRef inConnectionParams);

    /**
     * [@function]   MIDIThruConnectionFind
     * 
     * Returns all of the persistent thru connections created by a client.
     * 
     * @param      inPersistentOwnerID
     *                 The ID of the owner whose connections are to be returned.
     * @param      outConnectionList
     *                 On successful return, a CFDataRef containing an array of MIDIThruConnectionRef's.
     * @return     An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int MIDIThruConnectionFind(CFStringRef inPersistentOwnerID, Ptr<CFDataRef> outConnectionList);

    /**
     *   -----------------------------------------------------------------------------
     * [@function]		MIDIDeviceCreate
     * 
     * Drivers call this function to create new MIDIDevice objects
     * 				corresponding to the hardware that is present.
     * 
     * 				Non-drivers may call this function as of CoreMIDI 1.1, to
     * 				create external devices.
     * 
     * @param			owner
     * 					The driver creating the device.  NULL if a non-driver.
     * @param			name
     * 					The name of the new device.
     * @param			manufacturer
     * 					The name of the device's manufacturer.
     * @param			model
     * 					The device's model name.
     * @param			outDevice
     * 					On successful return, points to the newly-created device.
     * @return			An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int MIDIDeviceCreate(Ptr<Ptr<MIDIDriverInterface>> owner, CFStringRef name,
            CFStringRef manufacturer, CFStringRef model, IntPtr outDevice);

    /**
     * [@function]		MIDIDeviceDispose
     * 
     * Drivers may call this function to dispose MIDIDevice objects
     * 				which have not yet been added to the system via MIDISetupAddDevice.
     * 				Once a device has been added to the system with MIDISetupAddDevice,
     * 				the driver must not use this call to destroy it; it must
     * 				use MIDISetupRemoveDevice to do so.
     * 
     * 				Non-drivers do not have access to this function; they must call
     * 				MIDISetupAddDevice and MIDISetupRemoveDevice.
     * 
     * @param			device
     * 					The device to be disposed.
     * @return			An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int MIDIDeviceDispose(int device);

    /**
     *   -----------------------------------------------------------------------------
     * [@function]		MIDIDeviceListGetNumberOfDevices
     * 
     * Returns the number of devices in a device list.
     * 
     * @param			devList
     * 					The device list.
     * @return			The number of devices in the list, or 0 if an error occurred.
     */
    @Generated
    @CFunction
    @NUInt
    public static native long MIDIDeviceListGetNumberOfDevices(int devList);

    /**
     *   -----------------------------------------------------------------------------
     * [@function]		MIDIDeviceListGetDevice
     * 
     * Return one of the devices in a device list.
     * 
     * @param			devList
     * 					The device list.
     * @param			index0
     * 					The index (0...MIDIDeviceListGetNumberOfDevices()-1) of the device
     * 					to return.
     * @return			A reference to a device, or NULL if an error occurred.
     */
    @Generated
    @CFunction
    public static native int MIDIDeviceListGetDevice(int devList, @NUInt long index0);

    /**
     *   -----------------------------------------------------------------------------
     * [@function]		MIDIDeviceListAddDevice
     * 
     * Add a device to a device list.
     * 
     * @param			devList
     * 					The device list.
     * @param			dev
     * 					The device to add to the list.
     * @return			An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int MIDIDeviceListAddDevice(int devList, int dev);

    /**
     *   -----------------------------------------------------------------------------
     * [@function]		MIDIDeviceListDispose
     * 
     * Dispose a device list, but not the contained devices.
     * 
     * @param			devList
     * 					The device list to be disposed.
     * @return			An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int MIDIDeviceListDispose(int devList);

    /**
     *   -----------------------------------------------------------------------------
     * [@function]		MIDIEndpointSetRefCons
     * 
     * Drivers need an efficient way to translate from a MIDIEndpoint (source or
     * 				destination) to their own internal data structures corresponding to
     * 				that endpoint.  This function provides a way for the driver to
     * 				assign its own refCons to endpoints.
     * 
     * 				These refCons are passed back to the driver in its Send() and Flush()
     * 				methods.
     * 
     * 				RefCons are not persistent (i.e. they are not saved as part of a
     * 				MIDISetup).  They need to be re-initialized in each call to Start().
     * 
     * 				A typical use is to use one refCon to refer to a device, and a second
     * 				to refer to a port on the device.
     * 
     * @param			endpt
     * 					The endpoint whose refCons are to be set
     * @param			ref1
     * 					The first refCon.
     * @param			ref2
     * 					The second refCon.
     * @return			An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int MIDIEndpointSetRefCons(int endpt, VoidPtr ref1, VoidPtr ref2);

    /**
     *   -----------------------------------------------------------------------------
     * [@function]		MIDIEndpointGetRefCons
     * 
     * Obtain the refCons assigned to the endpoints
     * 
     * @param			endpt
     * 					The endpoint whose refCons are to be return
     * @param			ref1
     * 					On exit, the first refCon.
     * @param			ref2
     * 					On exit, the second refCon.
     * @return			An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int MIDIEndpointGetRefCons(int endpt, Ptr<VoidPtr> ref1, Ptr<VoidPtr> ref2);

    /**
     *   -----------------------------------------------------------------------------
     * [@function]		MIDIGetDriverIORunLoop
     * 
     * Drivers typically need to receive asynchronous I/O completion callbacks
     * 				on a high-priority thread.  To save drivers from the trouble of
     * 				creating their own threads for this purpose, and to make efficient
     * 				use of system resources, the MIDIServer provides a thread which
     * 				drivers may use.
     * 
     * 				Drivers should do as little work as possible in this thread; typically,
     * 				just dequeueing and encoding output packets, and decoding input packets
     * 				into MIDIPacketLists to be passed to MIDIReceived.
     * 
     * 				This is a realtime-priority thread and shouldn't be used for anything other
     * 				than I/O.  For lower-priority tasks, drivers can use the runloop which
     * 				was current when they were constructed.
     * 
     * @return			The CFRunLoopRef of the server's driver I/O thread.
     */
    @Generated
    @CFunction
    public static native CFRunLoopRef MIDIGetDriverIORunLoop();

    /**
     *   -----------------------------------------------------------------------------
     * [@function]		MIDIGetDriverDeviceList
     * 
     * Returns the list of devices which are in the current MIDISetup
     * 				and which were created/owned by the specified driver.
     * 
     * 				The returned device list should be disposed (using MIDIDeviceListDispose)
     * 				by the caller.
     * 
     * @param			driver
     * 					The driver whose devices are to be returned.
     * 
     * @return			The requested device list.
     */
    @Generated
    @CFunction
    public static native int MIDIGetDriverDeviceList(Ptr<Ptr<MIDIDriverInterface>> driver);

    /**
     * [@constant]		kMIDIPropertyName
     * 
     * 	device/entity/endpoint property, string
     * 
     * 	Devices, entities, and endpoints may all have names.  The recommended way to display an
     * 	endpoint's name is to ask for the endpoint name, and display only that name if it is
     * 	unique.  If it is non-unique, prepend the device name.
     * 
     * 	A setup editor may allow the user to set the names of both driver-owned and external
     * 	devices.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertyName();

    /**
     * [@constant]		kMIDIPropertyManufacturer
     * 
     * 	device/endpoint property, string
     * 
     * 	Drivers should set this property on their devices.
     * 
     * 	Setup editors may allow the user to set this property on external devices.
     * 
     * 	Creators of virtual endpoints may set this property on their endpoints.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertyManufacturer();

    /**
     * [@constant]		kMIDIPropertyModel
     * 
     * 	device/endpoint property, string
     * 
     * 	Drivers should set this property on their devices.
     * 
     * 	Setup editors may allow the user to set this property on external devices.
     * 
     * 	Creators of virtual endpoints may set this property on their endpoints.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertyModel();

    /**
     * [@constant]		kMIDIPropertyUniqueID
     * 
     * 	devices, entities, endpoints all have unique ID's, integer
     * 
     * 	The system assigns unique ID's to all objects.  Creators of virtual endpoints may set
     * 	this property on their endpoints, though doing so may fail if the chosen ID is not
     * 	unique.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertyUniqueID();

    /**
     * [@constant]		kMIDIPropertyDeviceID
     * 
     * 	device/entity property, integer
     * 
     * 	The entity's system-exclusive ID, in user-visible form
     * 
     * 	Drivers may set this property on their devices or entities.
     * 
     * 	Setup editors may allow the user to set this property on external devices.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertyDeviceID();

    /**
     * [@constant]		kMIDIPropertyReceiveChannels
     * 
     * 	endpoint property, integer
     * 
     * 	The value is a bitmap of channels on which the object receives: 1=ch 1, 2=ch 2, 4=ch 3
     * 	... 0x8000=ch 16.
     * 
     * 	Drivers may set this property on their entities or endpoints.
     * 
     * 	Setup editors may allow the user to set this property on external endpoints.
     * 
     * 	Virtual destination may set this property on their endpoints.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertyReceiveChannels();

    /**
     * [@constant]		kMIDIPropertyTransmitChannels
     * 
     * 	endpoint property, integer
     * 
     * 	The value is a bitmap of channels on which the object transmits: 1=ch 1, 2=ch 2, 4=ch 3
     * 	... 0x8000=ch 16.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertyTransmitChannels();

    /**
     * [@constant]		kMIDIPropertyMaxSysExSpeed
     * 
     * 	device/entity/endpoint property, integer
     * 
     * 	Set by the owning driver; should not be touched by other clients.
     * 	The value is the maximum rate, in bytes/second, at which sysex messages may
     * 	be sent reliably to this object. (The default value is 3125, as with MIDI 1.0)
     */
    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertyMaxSysExSpeed();

    /**
     * [@constant]		kMIDIPropertyAdvanceScheduleTimeMuSec
     * 
     * 	device/entity/endpoint property, integer
     * 
     * 	Set by the owning driver; should not be touched by other clients. If it is non-zero,
     * 	then it is a recommendation of how many microseconds in advance clients should schedule
     * 	output. Clients should treat this value as a minimum.  For devices with a non-zero
     * 	advance schedule time, drivers will receive outgoing messages to the device at the time
     * 	they are sent by the client, via MIDISend, and the driver is responsible for scheduling
     * 	events to be played at the right times according to their timestamps.
     * 
     * 	As of CoreMIDI 1.3, this property may also be set on virtual destinations (but only the
     * 	creator of the destination should do so). When a client sends to a virtual destination
     * 	with an advance schedule time of 0, the virtual destination receives its messages at
     * 	their scheduled delivery time.  If a virtual destination has a non-zero advance schedule
     * 	time, it receives timestamped messages as soon as they are sent, and must do its own
     * 	internal scheduling of received events.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertyAdvanceScheduleTimeMuSec();

    /**
     * [@constant]		kMIDIPropertyIsEmbeddedEntity
     * 
     * 	entity/endpoint property, integer
     * 
     * 	0 if there are external MIDI connectors, 1 if not.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertyIsEmbeddedEntity();

    /**
     * [@constant]		kMIDIPropertyIsBroadcast
     * 
     * 	entity/endpoint property, integer
     * 
     * 	1 if the endpoint broadcasts messages to all of the other endpoints in the device, 0 if
     * 	not.  Set by the owning driver; should not be touched by other clients.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertyIsBroadcast();

    /**
     * [@constant]		kMIDIPropertySingleRealtimeEntity
     * 
     * 	device property, integer
     * 
     * 	Some MIDI interfaces cannot route MIDI realtime messages to individual outputs; they are
     * 	broadcast.  On such devices the inverse is usually also true -- incoming realtime
     * 	messages cannot be identified as originating from any particular source.
     * 
     * 	When this property is set on a driver device, it signifies the 0-based index of the
     * 	entity on which incoming realtime messages from the device will appear to have
     * 	originated from.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertySingleRealtimeEntity();

    /**
     * [@constant]		kMIDIPropertyConnectionUniqueID
     * 
     * 	device/entity/endpoint property, integer or CFDataRef
     * 
     * 	UniqueID of an external device/entity/endpoint attached to this one. As of Mac OS X
     * 	10.3, Audio MIDI Setup maintains endpoint-to-external endpoint connections (in 10.2, it
     * 	connected devices to devices).
     * 
     * 	The property is non-existant or 0 if there is no connection.
     * 
     * 	Beginning with CoreMIDI 1.3 (Mac OS X 10.2), this property may also be a CFDataRef containing an array of
     * 	big-endian SInt32's, to allow specifying that a driver object connects to multiple
     * 	external objects (via MIDI thru-ing or splitting).
     * 
     * 	This property may also exist for external devices/entities/endpoints, in which case it
     * 	signifies a MIDI Thru connection to another external device/entity/endpoint (again,
     * 	it is strongly recommended that it be an endpoint).
     */
    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertyConnectionUniqueID();

    /**
     * [@constant]		kMIDIPropertyOffline
     * 
     * 	device/entity/endpoint property, integer
     * 
     * 	1 = device is offline (is temporarily absent), 0 = present. Set by the owning driver, on
     * 	the device; should not be touched by other clients. Property is inherited from the
     * 	device by its entities and endpoints.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertyOffline();

    /**
     * [@constant]		kMIDIPropertyPrivate
     * 
     * 	device/entity/endpoint property, integer
     * 
     * 	1 = endpoint is private, hidden from other clients. May be set on a device or entity,
     * 	but they will still appear in the API; only affects whether the owned endpoints are
     * 	hidden.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertyPrivate();

    /**
     * [@constant]		kMIDIPropertyDriverOwner
     * 
     * 	device/entity/endpoint property, string
     * 
     * 	Name of the driver that owns a device. Set by the owning driver, on the device; should
     * 	not be touched by other clients. Property is inherited from the device by its entities
     * 	and endpoints.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertyDriverOwner();

    /**
     * [@constant]		kMIDIPropertyNameConfiguration
     * 
     * 	device/entity/endpoint property, CFDictionary
     * 
     * 	This specifies the device's current patch, note and control name values using the
     * 	MIDINameDocument XML format.  This specification requires the use of higher-level,
     * 	OS-specific constructs outside of the specification to fully define the current names
     * 	for a device.
     * 
     * 	The MIDINameConfiguration property is implementated as a CFDictionary:
     * 
     * 	key "master" maps to a CFDataRef containing an AliasHandle referring to the device's
     * 	master name document. This is deprecated as of Mac OS X 10.10.
     * 
     * 	key "masterDocumentPath" maps to a CFStringRef containing the filesystem path to the device's
     * 	master name document. (This is new as of Mac OS X 10.10, but since the CoreMIDI
     * 	implementation does not parse this dictionary, the convention can be safely ported
     * 	to earlier versions of Mac OS X.)
     * 
     * 	key "banks" maps to a CFDictionaryRef.  This dictionary's keys are CFStringRef names of
     * 	patchBank elements in the master document, and its values are each a CFDictionaryRef:
     * 	key "file" maps to a CFDataRef containing an AliasHandle to a document containing
     * 	patches that override those in the master document, and key "patchNameList" maps to a
     * 	CFStringRef which is the name of the patchNameList element in the overriding document.
     * 
     * 	key "currentChannelNameSets" maps to a 16-element CFArrayRef, each element of which is a
     * 	CFStringRef of the name of the current mode for each of the 16 MIDI channels.
     * 
     * 	key "currentDeviceMode" maps to a CFStringRef containing the name of the device's mode.
     * 
     * 	Clients setting this property must take particular care to preserve dictionary values
     * 	other than the ones they are interested in changing and to properly structure the
     * 	dictionary.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertyNameConfiguration();

    /**
     * [@constant]		kMIDIPropertyImage
     * 
     * 	device property, CFStringRef which is a full POSIX path to a device or external device's
     * 	icon, stored in any standard graphic file format such as JPEG, GIF, PNG and TIFF are all
     * 	acceptable.  (See CFURL for functions to convert between POSIX paths and other ways of
     * 	specifying files.)  The image's maximum size should be 128x128.
     * 
     * 	Drivers should set the icon on the devices they add.
     * 
     * 	A studio setup editor should allow the user to choose icons for external devices.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertyImage();

    /**
     * [@constant]		kMIDIPropertyDriverVersion
     * 
     * 	device/entity/endpoint property, integer, returns the driver version API of the owning
     * 	driver (only for driver- owned devices).  Drivers need not set this property;
     * 	applications should not write to it.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertyDriverVersion();

    /**
     * [@constant]		kMIDIPropertySupportsGeneralMIDI
     * 
     * 	device/entity property, integer (0/1). Indicates whether the device or entity implements
     * 	the General MIDI specification.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertySupportsGeneralMIDI();

    /**
     * [@constant]		kMIDIPropertySupportsMMC
     * 
     * 	device/entity property, integer (0/1). Indicates whether the device or entity implements
     * 	the MIDI Machine Control portion of the MIDI specification.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertySupportsMMC();

    /**
     * [@constant]		kMIDIPropertyCanRoute
     * 
     * 	device/entity property, integer (0/1). Indicates whether the device or entity can route
     * 	MIDI messages to or from other external MIDI devices (as with MIDI patch bays). This
     * 	should NOT be set on devices which are controlled by drivers.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertyCanRoute();

    /**
     * [@constant]		kMIDIPropertyReceivesClock
     * 
     * 	device/entity property, integer (0/1). Indicates whether the device or entity  responds
     * 	to MIDI beat clock messages.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertyReceivesClock();

    /**
     * [@constant]		kMIDIPropertyReceivesMTC
     * 
     * 	device/entity property, integer (0/1). Indicates whether the device or entity responds
     * 	to MIDI Time Code messages.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertyReceivesMTC();

    /**
     * [@constant]		kMIDIPropertyReceivesNotes
     * 
     * 	device/entity property, integer (0/1). Indicates whether the device or entity responds
     * 	to MIDI Note On messages.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertyReceivesNotes();

    /**
     * [@constant]		kMIDIPropertyReceivesProgramChanges
     * 
     * 	device/entity property, integer (0/1). Indicates whether the device or entity responds
     * 	to MIDI program change messages.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertyReceivesProgramChanges();

    /**
     * [@constant]		kMIDIPropertyReceivesBankSelectMSB
     * 
     * 	device/entity property, integer (0/1). Indicates whether the device or entity responds
     * 	to MIDI bank select MSB messages (control 0).
     */
    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertyReceivesBankSelectMSB();

    /**
     * [@constant]		kMIDIPropertyReceivesBankSelectLSB
     * 
     * 	device/entity property, integer (0/1). Indicates whether the device or entity responds
     * 	to MIDI bank select LSB messages (control 32).
     */
    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertyReceivesBankSelectLSB();

    /**
     * [@constant]		kMIDIPropertyTransmitsClock
     * 
     * 	device/entity property, integer (0/1). Indicates whether the device or entity transmits
     * 	MIDI beat clock messages.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertyTransmitsClock();

    /**
     * [@constant]		kMIDIPropertyTransmitsMTC
     * 
     * 	device/entity property, integer (0/1). Indicates whether the device or entity transmits
     * 	MIDI Time Code messages.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertyTransmitsMTC();

    /**
     * [@constant]		kMIDIPropertyTransmitsNotes
     * 
     * 	device/entity property, integer (0/1). Indicates whether the device or entity transmits
     * 	MIDI note messages.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertyTransmitsNotes();

    /**
     * [@constant]		kMIDIPropertyTransmitsProgramChanges
     * 
     * 	device/entity property, integer (0/1). Indicates whether the device or entity transmits
     * 	MIDI program change messages.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertyTransmitsProgramChanges();

    /**
     * [@constant]		kMIDIPropertyTransmitsBankSelectMSB
     * 
     * 	device/entity property, integer (0/1). Indicates whether the device or entity transmits
     * 	MIDI bank select MSB messages (control 0).
     */
    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertyTransmitsBankSelectMSB();

    /**
     * [@constant]		kMIDIPropertyTransmitsBankSelectLSB
     * 
     * 	device/entity property, integer (0/1). Indicates whether the device or entity transmits
     * 	MIDI bank select LSB messages (control 32).
     */
    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertyTransmitsBankSelectLSB();

    /**
     * [@constant]		kMIDIPropertyPanDisruptsStereo
     * 
     * 	device/entity property, integer (0/1). Indicates whether the MIDI pan messages (control
     * 	10), when sent to the device or entity, cause undesirable effects when playing stereo
     * 	sounds (e.g. converting the signal to mono).
     */
    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertyPanDisruptsStereo();

    /**
     * [@constant]		kMIDIPropertyIsSampler
     * 
     * 	device/entity property, integer (0/1). Indicates whether the device or entity plays
     * 	audio samples in response to MIDI note messages.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertyIsSampler();

    /**
     * [@constant]		kMIDIPropertyIsDrumMachine
     * 
     * 	device/entity property, integer (0/1). Indicates whether the device or entity's sound
     * 	presets tend to be collections of non-transposable samples (e.g. drum kits).
     */
    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertyIsDrumMachine();

    /**
     * [@constant]		kMIDIPropertyIsMixer
     * 
     * 	device/entity property, integer (0/1). Indicates whether the device or entity mixes
     * 	external audio signals, controlled by MIDI messages.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertyIsMixer();

    /**
     * [@constant]		kMIDIPropertyIsEffectUnit
     * 
     * 	device/entity property, integer (0/1). Indicates whether the device or entity is
     * 	primarily a MIDI-controlled audio effect unit (i.e. does not generate sound on its own).
     */
    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertyIsEffectUnit();

    /**
     * [@constant]		kMIDIPropertyMaxReceiveChannels
     * 
     * 	device/entity property, integer (0-16). Indicates the maximum number of MIDI channels on
     * 	which a device may simultaneously receive MIDI Channel Messages. Common values are 0
     * 	(devices which only respond to System Messages), 1 (non-multitimbral devices), and 16
     * 	(fully multitimbral devices). Other values are possible, for example devices which are
     * 	multi-timbral but have fewer than 16 "parts".
     */
    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertyMaxReceiveChannels();

    /**
     * [@constant]		kMIDIPropertyMaxTransmitChannels
     * 
     * 	device/entity property, integer (0/1). Indicates the maximum number of MIDI channels on
     * 	which a device may simultaneously transmit MIDI Channel Messages. Common values are 0, 1
     * 	and 16.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertyMaxTransmitChannels();

    /**
     * [@constant]		kMIDIPropertyDriverDeviceEditorApp
     * 
     * 	device property, string, contains the full path to an application which knows how to
     * 	configure this driver-owned devices. Drivers may set this property on their owned
     * 	devices. Applications must not write to it.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertyDriverDeviceEditorApp();

    /**
     * [@constant]		kMIDIPropertySupportsShowControl
     * 
     * 	device/entity property, integer (0/1). Indicates whether the device implements the MIDI
     * 	Show Control specification.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertySupportsShowControl();

    /**
     * [@constant]		kMIDIPropertyDisplayName
     * 
     * 	device/entity/endpoint property, string.
     * 
     * 	Provides the Apple-recommended user-visible name for an endpoint, by combining the
     * 	device and endpoint names.
     * 
     * 	For objects other than endpoints, the display name is the same as the name.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertyDisplayName();

    /**
     * This is the Bonjour service type.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MIDINetworkBonjourServiceType();

    /**
     * These are NSNotifications posted by MIDINetworkSession objects. 
     * 
     * MIDINetworkNotificationContactsDidChange signifies that the list of contacts changed.
     * MIDINetworkNotificationSessionDidChange signifies that other aspects of the session changed,
     * such as the connection list, connection policy, etc.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MIDINetworkNotificationContactsDidChange();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MIDINetworkNotificationSessionDidChange();

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
    public interface Block_MIDIClientCreateWithBlock {
        @Generated
        void call_MIDIClientCreateWithBlock(MIDINotification message);
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
    public interface Block_MIDIInputPortCreateWithBlock {
        @Generated
        void call_MIDIInputPortCreateWithBlock(MIDIPacketList pktlist, VoidPtr srcConnRefCon);
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
    public interface Block_MIDIDestinationCreateWithBlock {
        @Generated
        void call_MIDIDestinationCreateWithBlock(MIDIPacketList pktlist, VoidPtr srcConnRefCon);
    }

    /**
     * [@constant]        kMIDIPropertyNameConfigurationDictionary
     * 
     *     device/entity/endpoint property, CFDictionary
     * 
     *     This specifies the device's current patch, note and control name values using the
     *     MIDINameDocument XML format.  This specification requires the use of higher-level,
     *     OS-specific constructs outside of the specification to fully define the current names
     *     for a device.
     * 
     *     The MIDINameConfiguration property is implementated as a CFDictionary:
     * 
     *     key "masterDocumentPath" maps to a CFStringRef containing the filesystem path to the device's
     *     master name document.
     * 
     *     key "banks" maps to a CFDictionaryRef.  This dictionary's keys are CFStringRef names of
     *     patchBank elements in the master document, and its values are each a CFDictionaryRef:
     *     key "file" maps to a CFDataRef containing URL bookmark data to a document containing
     *     patches that override those in the master document, and key "patchNameList" maps to a
     *     CFStringRef which is the name of the patchNameList element in the overriding document.
     * 
     *     key "currentChannelNameSets" maps to a 16-element CFArrayRef, each element of which is a
     *     CFStringRef of the name of the current mode for each of the 16 MIDI channels.
     * 
     *     key "currentDeviceMode" maps to a CFStringRef containing the name of the device's mode.
     * 
     *     Clients setting this property must take particular care to preserve dictionary values
     *     other than the ones they are interested in changing and to properly structure the
     *     dictionary.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertyNameConfigurationDictionary();

    /**
     * All MIDI-CI methods involving a channel number use 0x7f to mean "the whole port", i.e. all
     * channels.
     */
    @Generated public static final byte MIDIChannelsWholePort = 127;

    /**
     * [@function]		MIDIInputPortCreateWithProtocol
     * 
     * Creates an input port through which the client may receive
     * 				incoming MIDI messages from any MIDI source.
     * 
     * 	After creating a port, use MIDIPortConnectSource to establish an input connection from
     * 	any number of sources to your port.
     * 
     * 	readBlock will be called on a separate high-priority thread owned by CoreMIDI.
     * 
     * @param			client
     * 					The client to own the newly-created port.
     * @param			portName
     * 					The name of the port.
     * @param			protocol
     * 						The MIDI protocol variant to be delivered to this port. The system
     * 					will automatically convert to this protocol as needed.
     * @param			outPort
     * 					On successful return, points to the newly-created
     * 					MIDIPort.
     * @param			receiveBlock
     * 					The MIDIReceiveBlock which will be called with incoming MIDI, from sources
     * 					connected to this port.
     * @return			An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int MIDIInputPortCreateWithProtocol(int client, CFStringRef portName, int protocol,
            IntPtr outPort,
            @ObjCBlock(name = "call_MIDIInputPortCreateWithProtocol") Block_MIDIInputPortCreateWithProtocol receiveBlock);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_MIDIInputPortCreateWithProtocol {
        @Generated
        void call_MIDIInputPortCreateWithProtocol(
                @UncertainArgument("Options: reference, array Fallback: reference") MIDIEventList evtlist,
                VoidPtr srcConnRefCon);
    }

    /**
     * [@function]		MIDIDestinationCreateWithProtocol
     * 
     * Creates a virtual destination in a client.
     * 
     * 	The specified readBlock gets called when clients send MIDI to your virtual destination.
     * 
     * 	Drivers need not call this; when they create devices and entities, sources and
     * 	destinations are created at that time.
     * 
     * 	After creating a virtual destination, it's a good idea to assign it the same unique ID
     * 	it had the last time your application created it. (Although you should be prepared for
     * 	this to fail in the unlikely event of a collision.) This will permit other clients
     * 	to retain persistent references to your virtual destination more easily.
     * 
     * 	See the discussion of kMIDIPropertyAdvanceScheduleTimeMuSec for notes about the
     * 	relationship between when a sender sends MIDI to the destination and when it is
     * 	received.
     * 
     * @param			client
     * 					The client owning the virtual destination.
     * @param			name
     * 					The name of the virtual destination.
     * @param			protocol
     * 						The MIDI protocol variant to be delivered to this destination. The system
     * 					will automatically convert to this protocol as needed.
     * @param			outDest
     * 					On successful return, a pointer to the newly-created
     * 					destination.
     * @param			readBlock
     * 					The MIDIReceiveBlock to be called when a client sends MIDI to the virtual
     * 					destination.
     * @return			An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int MIDIDestinationCreateWithProtocol(int client, CFStringRef name, int protocol,
            IntPtr outDest,
            @ObjCBlock(name = "call_MIDIDestinationCreateWithProtocol") Block_MIDIDestinationCreateWithProtocol readBlock);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_MIDIDestinationCreateWithProtocol {
        @Generated
        void call_MIDIDestinationCreateWithProtocol(
                @UncertainArgument("Options: reference, array Fallback: reference") MIDIEventList evtlist,
                VoidPtr srcConnRefCon);
    }

    /**
     * [@function]		MIDISourceCreateWithProtocol
     * 
     * Creates a virtual source in a client.
     * 
     * Drivers need not call this; when they create devices and entities, sources and
     * destinations are created at that time.
     * 
     * After creating a virtual source, use MIDIReceivedEventList to transmit MIDI messages from your
     * virtual source to any clients connected to the virtual source.
     * 
     * After creating a virtual source, it's a good idea to assign it the same unique ID it had
     * the last time your application created it. (Although you should be prepared for this to
     * fail in the unlikely event of a collision.) This will permit other clients to retain
     * persistent references to your virtual source more easily.
     * 
     * @param			client
     *  					The client owning the virtual source.
     * @param			name
     * 					The name of the virtual source.
     * 	@param			protocol
     * 						The MIDI protocol variant to be sent from this source. The system
     * 						will automatically convert from this protocol to the protocol of
     * 						the destination as needed.
     * @param			outSrc
     *  					On successful return, a pointer to the newly-created
     *  					source.
     * @return			An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int MIDISourceCreateWithProtocol(int client, CFStringRef name, int protocol, IntPtr outSrc);

    /**
     * [@function]		MIDISendEventList
     * 
     * Sends MIDI to a destination.
     * 
     * 	Events with future timestamps are scheduled for future delivery.  CoreMIDI performs
     * 	any needed MIDI merging.
     * 
     * @param			port
     * 					The output port through which the MIDI is to be sent.
     * @param			dest
     * 					The destination to receive the events.
     * @param			evtlist
     * 					The MIDI events to be sent.
     * @return			An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int MIDISendEventList(int port, int dest,
            @UncertainArgument("Options: reference, array Fallback: reference") MIDIEventList evtlist);

    /**
     * [@function]		MIDIReceivedEventList
     * 
     * Distributes incoming MIDI from a source to the client input ports
     * 				which are connected to that source.
     * 
     * 	Drivers should call this function when receiving MIDI from a source.
     * 
     * 	Clients which have created virtual sources, using MIDISourceCreateWithProtocol, should call this
     * 	function when the source is generating MIDI.
     * 
     * 	Unlike MIDISendEventList(), a timestamp of 0 is not equivalent to "now"; the driver or virtual
     * 	source is responsible for putting proper timestamps in the packets.
     * 
     * @param			src
     * 					The source which is transmitting MIDI.
     * @param			evtlist
     * 					The MIDI events to be transmitted.
     * @return			An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int MIDIReceivedEventList(int src,
            @UncertainArgument("Options: reference, array Fallback: reference") MIDIEventList evtlist);

    /**
     * [@function]		MIDIEventPacketNext
     * 
     * Advances a MIDIEventPacket pointer to the MIDIEventPacket which immediately follows it
     * in memory if it is part of a MIDIEventList.
     * 
     * @param			pkt
     * 	A pointer to a MIDIEventPacket in a MIDIEventList.
     * @return		The subsequent packet in the MIDIEventList.
     */
    @Generated
    @Inline
    @CFunction
    @UncertainReturn("Options: reference, array Fallback: reference")
    public static native MIDIEventPacket MIDIEventPacketNext(
            @UncertainArgument("Options: reference, array Fallback: reference") MIDIEventPacket pkt);

    /**
     * [@function]		MIDIEventListInit
     * 
     * Prepares a MIDIEventList to be built up dynamically.
     * 
     * @param			evtlist
     * 					The event list to be initialized.
     * 
     * @return			A pointer to the first MIDIEventPacket in the event list.
     */
    @Generated
    @CFunction
    @UncertainReturn("Options: reference, array Fallback: reference")
    public static native MIDIEventPacket MIDIEventListInit(
            @UncertainArgument("Options: reference, array Fallback: reference") MIDIEventList evtlist, int protocol);

    /**
     * [@function]		MIDIEventListAdd
     * 
     * Adds a MIDI event to a MIDIEventList.
     * 
     * 	The maximum size of a event list is 65536 bytes. Large sysex messages must be sent in
     * 	smaller event lists.
     * 
     * 	Note that events must use the same protocol as was passed to MIDIEventListInit().
     * 
     * @param			evtlist
     * 					The event list to which the event is to be added.
     * @param			listSize
     * 					The capacity, in bytes, of the event list.
     * @param			curPacket
     * 					A packet pointer returned by a previous call to
     * 					MIDIEventListInit or MIDIEventListAdd for this packet
     * 					list.
     * @param			time
     * 					The new event's time.
     * @param			wordCount
     * 					The number of valid MIDI 32-bit words which follow, in data.
     * @param			words
     * 					The new event.  May be a single MIDI event, or a partial
     * 					sys-ex event.  Running status is <b>not</b> permitted.
     * @return			Returns null if there was not room in the packet for the
     * 				event; otherwise returns a packet pointer which should be
     * 				passed as curPacket in a subsequent call to this function.
     */
    @Generated
    @CFunction
    @UncertainReturn("Options: reference, array Fallback: reference")
    public static native MIDIEventPacket MIDIEventListAdd(
            @UncertainArgument("Options: reference, array Fallback: reference") MIDIEventList evtlist,
            @NUInt long listSize,
            @UncertainArgument("Options: reference, array Fallback: reference") MIDIEventPacket curPacket, long time,
            @NUInt long wordCount, ConstIntPtr words);

    /**
     *   -----------------------------------------------------------------------------
     * [@function]		MIDIDeviceNewEntity
     * 
     * Drivers call this function to specify one of the entities that
     * 				comprise a device.
     * 
     * 				Non-drivers may call this function as of macOS 10.16 & iOS 14 to
     * 				add entities to external devices.
     * 
     * @param			device
     * 					The device to which an entity is to be added.
     * @param			name
     * 					The name of the new entity.
     * @param			protocol
     * 					The MIDI protocol variant used by the sources and
     * 					destinations that comprise this entity.
     * @param			embedded
     * 					True if this entity is inside the device, false if the
     * 					entity simply consists of external connectors to which
     * 					other devices can be attached.
     * @param			numSourceEndpoints
     * 					The number of source endpoints the entity has.
     * @param			numDestinationEndpoints
     * 					The number of destination endpoints the entity has.
     * @param			newEntity
     * 					On successful return, points to the newly-created entity.
     * @return			An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int MIDIDeviceNewEntity(int device, CFStringRef name, int protocol, byte embedded,
            @NUInt long numSourceEndpoints, @NUInt long numDestinationEndpoints, IntPtr newEntity);

    @Generated
    @Inline
    @CFunction
    public static native int MIDIMessageTypeForUPWord(int word);

    /**
     * MIDI 1.0 Universal MIDI Packet (MIDI-1UP) Channel Voice Message generalized structure
     * 
     * Word0: [aaaa][bbbb][cccc][dddd][0eeeeeee][0fffffff]
     * 
     * a: Universal MIDI Packet Message Type (0x2 for all voice messages)
     * b: Channel group number
     * c: MIDI status
     * d: MIDI channel
     * e: MIDI note number
     * f: Velocity
     * 
     * The following set of functions will correctly construct voice channel messages as MIDI-1UP.
     */
    @Generated
    @Inline
    @CFunction
    public static native int MIDI1UPChannelVoiceMessage(byte group, byte status, byte channel, byte data1, byte data2);

    @Generated
    @Inline
    @CFunction
    public static native int MIDI1UPNoteOff(byte group, byte channel, byte noteNumber, byte velocity);

    @Generated
    @Inline
    @CFunction
    public static native int MIDI1UPNoteOn(byte group, byte channel, byte noteNumber, byte velocity);

    @Generated
    @Inline
    @CFunction
    public static native int MIDI1UPControlChange(byte group, byte channel, byte index, byte data);

    @Generated
    @Inline
    @CFunction
    public static native int MIDI1UPPitchBend(byte group, byte channel, byte lsb, byte msb);

    @Generated
    @Inline
    @CFunction
    public static native int MIDI1UPSystemCommon(byte group, byte status, byte byte1, byte byte2);

    /**
     * MIDI 2.0 Channel Voice Message generalized structure
     * 
     * Word0: [aaaa][bbbb][cccc][dddd][eeeeeeeeeeeeeeee]
     * Word1: [nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn]
     * 
     * a: Message Type (type 1 for all voice messages)
     * b: Channel group number
     * c: MIDI status
     * d: MIDI channel
     * e: "Index" -- the contents of this field vary based on message type
     * n: Data payload
     * 
     * The following set of functions will correctly construct voice channel messages as two 32-bit words.
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native MIDIMessage_64 MIDI2ChannelVoiceMessage(byte group, byte status, byte channel, char index,
            int value);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native MIDIMessage_64 MIDI2NoteOn(byte group, byte channel, byte noteNumber, byte attributeType,
            char attributeData, char velocity);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native MIDIMessage_64 MIDI2NoteOff(byte group, byte channel, byte noteNumber, byte attributeType,
            char attributeData, char velocity);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native MIDIMessage_64 MIDI2PolyPressure(byte group, byte channel, byte noteNumber, int value);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native MIDIMessage_64 MIDI2RegisteredPNC(byte group, byte channel, byte noteNumber, byte index,
            int value);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native MIDIMessage_64 MIDI2AssignablePNC(byte group, byte channel, byte noteNumber, byte index,
            int value);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native MIDIMessage_64 MIDI2PerNoteManagment(byte group, byte channel, byte noteNumber,
            boolean detachPNCs, boolean resetPNCsToDefault);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native MIDIMessage_64 MIDI2ControlChange(byte group, byte channel, byte index, int value);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native MIDIMessage_64 MIDI2RegisteredControl(byte group, byte channel, byte bank, byte index,
            int value);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native MIDIMessage_64 MIDI2AssignableControl(byte group, byte channel, byte bank, byte index,
            int value);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native MIDIMessage_64 MIDI2RelRegisteredControl(byte group, byte channel, byte bank, byte index,
            int value);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native MIDIMessage_64 MIDI2RelAssignableControl(byte group, byte channel, byte bank, byte index,
            int value);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native MIDIMessage_64 MIDI2ProgramChange(byte group, byte channel, boolean bankIsValid, byte program,
            byte bank_msb, byte bank_lsb);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native MIDIMessage_64 MIDI2ChannelPressure(byte group, byte channel, int value);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native MIDIMessage_64 MIDI2PitchBend(byte group, byte channel, int value);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native MIDIMessage_64 MIDI2PerNotePitchBend(byte group, byte channel, byte noteNumber, int value);

    /**
     * constant		kMIDIPropertyProtocolID
     * 
     * 	device/entity/endpoint property, MIDIProtocolID. Indicates the native protocol in which
     * 	the endpoint communicates. The value is set by the system on endpoints, when they are
     * 	created. Drivers may dynamically change the protocol of an endpoint as a result of a MIDI-CI
     * 	negotiation, by setting this property on the endpoint. Clients can observe changes to
     * 	this property.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kMIDIPropertyProtocolID();
}
