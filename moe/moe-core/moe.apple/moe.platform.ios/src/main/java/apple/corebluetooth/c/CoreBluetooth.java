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

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CBAdvertisementDataLocalNameKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CBAdvertisementDataTxPowerLevelKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CBAdvertisementDataServiceUUIDsKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CBAdvertisementDataServiceDataKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CBAdvertisementDataManufacturerDataKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CBAdvertisementDataOverflowServiceUUIDsKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CBAdvertisementDataIsConnectable();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CBAdvertisementDataSolicitedServiceUUIDsKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CBCentralManagerOptionShowPowerAlertKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CBCentralManagerOptionRestoreIdentifierKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CBCentralManagerScanOptionAllowDuplicatesKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CBCentralManagerScanOptionSolicitedServiceUUIDsKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CBConnectPeripheralOptionNotifyOnConnectionKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CBConnectPeripheralOptionNotifyOnDisconnectionKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CBConnectPeripheralOptionNotifyOnNotificationKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CBCentralManagerRestoredStatePeripheralsKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CBCentralManagerRestoredStateScanServicesKey();

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

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CBPeripheralManagerOptionShowPowerAlertKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CBPeripheralManagerOptionRestoreIdentifierKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CBPeripheralManagerRestoredStateServicesKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CBPeripheralManagerRestoredStateAdvertisementDataKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CBUUIDCharacteristicExtendedPropertiesString();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CBUUIDCharacteristicUserDescriptionString();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CBUUIDClientCharacteristicConfigurationString();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CBUUIDServerCharacteristicConfigurationString();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CBUUIDCharacteristicFormatString();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CBUUIDCharacteristicAggregateFormatString();
}
