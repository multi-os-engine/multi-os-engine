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

package apple.corebluetooth.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("CoreBluetooth")
@Runtime(CRuntime.class)
public final class CoreBluetooth {
    static {
        NatJ.register();
    }

    @Generated
    private CoreBluetooth() {
    }

    /**
     * @constant CBAdvertisementDataLocalNameKey
     * 
     * @discussion A <code>NSString</code> containing the local name of a peripheral.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CBAdvertisementDataLocalNameKey();

    /**
     * @constant CBAdvertisementDataTxPowerLevelKey
     * 
     * @discussion A <code>NSNumber</code> containing the transmit power of a peripheral.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CBAdvertisementDataTxPowerLevelKey();

    /**
     * @constant CBAdvertisementDataServiceUUIDsKey
     * 
     * @discussion A list of one or more <code>CBUUID</code> objects, representing <code>CBService</code> UUIDs.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CBAdvertisementDataServiceUUIDsKey();

    /**
     * @constant CBAdvertisementDataServiceDataKey
     * 
     * @discussion A dictionary containing service-specific advertisement data. Keys are <code>CBUUID</code> objects, representing
     *             <code>CBService</code> UUIDs. Values are <code>NSData</code> objects.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CBAdvertisementDataServiceDataKey();

    /**
     * @constant CBAdvertisementDataManufacturerDataKey
     * 
     * @discussion A <code>NSData</code> object containing the manufacturer data of a peripheral.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CBAdvertisementDataManufacturerDataKey();

    /**
     * @constant CBAdvertisementDataOverflowServiceUUIDsKey
     * 
     * @discussion A list of one or more <code>CBUUID</code> objects, representing <code>CBService</code> UUIDs that were
     *             found in the "overflow" area of the advertising data. Due to the nature of the data stored in this area,
     *             UUIDs listed here are "best effort" and may not always be accurate.
     * 
     * @see        startAdvertising:
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CBAdvertisementDataOverflowServiceUUIDsKey();

    /**
     * @constant CBAdvertisementDataIsConnectable
     * 
     * @discussion An NSNumber (Boolean) indicating whether or not the advertising event type was connectable. This can be used to determine
     * 		whether or not a peripheral is connectable in that instant.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CBAdvertisementDataIsConnectable();

    /**
     * @constant CBAdvertisementDataSolicitedServiceUUIDsKey
     * 
     * @discussion A list of one or more <code>CBUUID</code> objects, representing <code>CBService</code> UUIDs.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CBAdvertisementDataSolicitedServiceUUIDsKey();

    /**
     * @const  CBCentralManagerOptionShowPowerAlertKey
     * 
     * @discussion An NSNumber (Boolean) indicating that the system should, if Bluetooth is powered off when <code>CBCentralManager</code> is instantiated, display
     * 		a warning dialog to the user.
     * 
     * @see		initWithDelegate:queue:options:
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CBCentralManagerOptionShowPowerAlertKey();

    /**
     * @const  CBCentralManagerOptionRestoreIdentifierKey
     * 
     * @discussion An NSString containing a unique identifier (UID) for the <code>CBCentralManager</code> that is being instantiated. This UID is used
     * 		by the system to identify a specific <code>CBCentralManager</code> instance for restoration and, therefore, must remain the same for
     * 		subsequent application executions in order for the manager to be restored.
     * 
     * @see		initWithDelegate:queue:options:
     * @seealso	centralManager:willRestoreState:
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CBCentralManagerOptionRestoreIdentifierKey();

    /**
     * @const CBCentralManagerScanOptionAllowDuplicatesKey
     * 
     * @discussion An NSNumber (Boolean) indicating that the scan should run without duplicate filtering. By default, multiple discoveries of the
     *             same peripheral are coalesced into a single discovery event. Specifying this option will cause a discovery event to be generated
     * 		every time the peripheral is seen, which may be many times per second. This can be useful in specific situations, such as making
     * 		a connection based on a peripheral's RSSI, but may have an adverse affect on battery-life and application performance.
     * 
     * @see        scanForPeripheralsWithServices:options:
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CBCentralManagerScanOptionAllowDuplicatesKey();

    /**
     * @const CBCentralManagerScanOptionSolicitedServiceUUIDsKey
     * 
     * @discussion An NSArray of <code>CBUUID</code> objects respresenting service UUIDs. Causes the scan to also look for peripherals soliciting
     * 		any of the services contained in the list.
     * 
     * @see        scanForPeripheralsWithServices:options:
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CBCentralManagerScanOptionSolicitedServiceUUIDsKey();

    /**
     * @const CBConnectPeripheralOptionNotifyOnConnectionKey
     * 
     * @discussion An NSNumber (Boolean) indicating that the system should display a connection alert for a given peripheral, if the application is suspended
     *             when a successful connection is made.
     *             This is useful for applications that have not specified the <code>bluetooth-central</code> background mode and cannot display their
     *             own alert. If more than one application has requested notification for a given peripheral, the one that was most recently in the foreground
     *             will receive the alert.
     * 
     * @see        connectPeripheral:
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CBConnectPeripheralOptionNotifyOnConnectionKey();

    /**
     * @const CBConnectPeripheralOptionNotifyOnDisconnectionKey
     * 
     * @discussion An NSNumber (Boolean) indicating that the system should display a disconnection alert for a given peripheral, if the application
     *             is suspended at the time of the disconnection.
     *             This is useful for applications that have not specified the <code>bluetooth-central</code> background mode and cannot display their
     *             own alert. If more than one application has requested notification for a given peripheral, the one that was most recently in the foreground
     *             will receive the alert.
     * 
     * @see        connectPeripheral:
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CBConnectPeripheralOptionNotifyOnDisconnectionKey();

    /**
     * @const CBConnectPeripheralOptionNotifyOnNotificationKey
     * 
     * @discussion An NSNumber (Boolean) indicating that the system should display an alert for all notifications received from a given peripheral, if
     *             the application is suspended at the time.
     *             This is useful for applications that have not specified the <code>bluetooth-central</code> background mode and cannot display their
     *             own alert. If more than one application has requested notification for a given peripheral, the one that was most recently in the foreground
     *             will receive the alert.
     * 
     * @see        connectPeripheral:
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CBConnectPeripheralOptionNotifyOnNotificationKey();

    /**
     *  @const  CBCentralManagerRestoredStatePeripheralsKey
     * 
     *  @discussion An NSArray of <code>CBPeripheral</code> objects containing all peripherals that were connected or pending connection at the time the
     * 			application was terminated by the system. When possible, all known information for each peripheral will be restored, including any discovered
     * 			services, characteristics and descriptors, as well as characteristic notification states.
     * 
     *  @see		centralManager:willRestoreState:
     * @seealso	connectPeripheral:options:
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CBCentralManagerRestoredStatePeripheralsKey();

    /**
     *  @const  CBCentralManagerRestoredStateScanServicesKey
     * 
     *  @discussion An NSArray of <code>CBUUID</code> objects containing the service(s) being scanned for at the time the application was terminated by the system.
     * 
     *  @see		centralManager:willRestoreState:
     * @seealso	scanForPeripheralsWithServices:options:
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CBCentralManagerRestoredStateScanServicesKey();

    /**
     *  @const  CBCentralManagerRestoredStateScanOptionsKey
     * 
     *  @discussion An NSDictionary containing the scan options at the time the application was terminated by the system.
     * 
     *  @see		centralManager:willRestoreState:
     * @seealso	scanForPeripheralsWithServices:options:
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CBCentralManagerRestoredStateScanOptionsKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CBErrorDomain();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CBATTErrorDomain();

    /**
     * @const  CBPeripheralManagerOptionShowPowerAlertKey
     * 
     * @discussion An NSNumber (Boolean) indicating that the system should, if Bluetooth is powered off when <code>CBPeripheralManager</code> is instantiated, display
     * 		a warning dialog to the user.
     * 
     * @see		initWithDelegate:queue:options:
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CBPeripheralManagerOptionShowPowerAlertKey();

    /**
     * @const  CBPeripheralManagerOptionRestoreIdentifierKey
     * 
     * @discussion An NSString containing a unique identifier (UID) for the <code>CBPeripheralManager</code> that is being instantiated. This UID is used
     * 		by the system to identify a specific <code>CBPeripheralManager</code> instance for restoration and, therefore, must remain the same for
     * 		subsequent application executions in order for the manager to be restored.
     * 
     * @see		initWithDelegate:queue:options:
     * @seealso	centralManager:willRestoreState:
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CBPeripheralManagerOptionRestoreIdentifierKey();

    /**
     * @const  CBPeripheralManagerRestoredStateServicesKey
     * 
     * @discussion An NSArray of <code>CBMutableService</code> objects containing all services that were published to the local database at the time the
     * 		application was terminated by the system. All information for each service will be restored, including all discovered
     * 		services, characteristics and descriptors, as well as characteristic notification states.
     * 
     * @see		peripheralManager:willRestoreState:
     * @seealso	addService:
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CBPeripheralManagerRestoredStateServicesKey();

    /**
     * @const  CBPeripheralManagerRestoredStateAdvertisementDataKey
     * 
     * @discussion An NSDictionary containing the data being advertised at the time the application was terminated by the system.
     * 
     * @see		peripheralManager:willRestoreState:
     * @seealso	startAdvertising:
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CBPeripheralManagerRestoredStateAdvertisementDataKey();

    /**
     * @const CBUUIDCharacteristicExtendedPropertiesString
     * @discussion The string representation of the UUID for the extended properties descriptor.
     * 		The corresponding value for this descriptor is an <code>NSNumber</code> object.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CBUUIDCharacteristicExtendedPropertiesString();

    /**
     * @const CBUUIDCharacteristicUserDescriptionString
     * @discussion The string representation of the UUID for the user description descriptor.
     * 		The corresponding value for this descriptor is an <code>NSString</code> object.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CBUUIDCharacteristicUserDescriptionString();

    /**
     * @const CBUUIDClientCharacteristicConfigurationString
     * @discussion The string representation of the UUID for the client configuration descriptor.
     * 		The corresponding value for this descriptor is an <code>NSNumber</code> object.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CBUUIDClientCharacteristicConfigurationString();

    /**
     * @const CBUUIDServerCharacteristicConfigurationString
     * @discussion The string representation of the UUID for the server configuration descriptor.
     * 		The corresponding value for this descriptor is an <code>NSNumber</code> object.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CBUUIDServerCharacteristicConfigurationString();

    /**
     * @const CBUUIDCharacteristicFormatString
     * @discussion The string representation of the UUID for the presentation format descriptor.
     * 		The corresponding value for this descriptor is an <code>NSData</code> object.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CBUUIDCharacteristicFormatString();

    /**
     * @const CBUUIDCharacteristicAggregateFormatString
     * @discussion The string representation of the UUID for the aggregate descriptor.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CBUUIDCharacteristicAggregateFormatString();

    /**
     * @const CBUUIDCharacteristicValidRangeString
     * @discussion Data representing the valid min/max values accepted for a characteristic.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CBUUIDCharacteristicValidRangeString();

    /**
     * @const CBUUIDL2CAPPSMCharacteristicString
     * @discussion The PSM (a little endian uint16_t) of an L2CAP Channel associated with the GATT service
     * 		containing this characteristic.  Servers can publish this characteristic with the UUID
     * 		ABDD3056-28FA-441D-A470-55A75A52553A
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CBUUIDL2CAPPSMCharacteristicString();

    /**
     * @const CBConnectPeripheralOptionStartDelayKey
     * 
     * @discussion An NSNumber indicating the number of seconds for the system to wait before starting a connection.
     * 
     * @see        connectPeripheral:
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CBConnectPeripheralOptionStartDelayKey();

    /**
     * @const CBConnectPeripheralOptionEnableTransportBridgingKey
     * 
     * @discussion An NSNumber (Boolean) indicating that the system will bring up classic transport profiles when low energy transport for peripheral is connected.
     * 
     * @see        connectPeripheral:
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CBConnectPeripheralOptionEnableTransportBridgingKey();

    /**
     * @const CBConnectPeripheralOptionRequiresANCS
     * 
     * @discussion An NSNumber (Boolean) indicating that the ANCS (Apple Notification Center Service) is required for the peripheral is connected.
     * 
     * @see        connectPeripheral:
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CBConnectPeripheralOptionRequiresANCS();

    /**
     *  @const  CBConnectionEventMatchingOptionServiceUUIDs
     * 
     *  @discussion An NSArray of <code>CBUUID</code> objects respresenting service UUIDs. A connected peer with any matching service UUIDs will result
     *         		in a call to {@link centralManager:connectionEventDidOccur:}.
     *              A maximum of 4 services can be registered.
     * 
     *  @see		centralManager:connectionEventDidOccur:forPeripheral:
     * @seealso	registerForConnectionEventsWithOptions:
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CBConnectionEventMatchingOptionServiceUUIDs();

    /**
     *  @const  CBConnectionEventMatchingOptionPeripheralUUIDs
     * 
     *  @discussion An NSArray of <code>NSUUID</code> objects respresenting <i>peripheral</i> identifiers. A connected peer with any matching identifier(s) will result
     *         		in a call to {@link centralManager:connectionEventDidOccur:}.
     * 
     *  @see		centralManager:connectionEventDidOccur:forPeripheral:
     * @seealso	registerForConnectionEventsWithOptions:
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CBConnectionEventMatchingOptionPeripheralUUIDs();
}
