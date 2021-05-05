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

package apple.corebluetooth.protocol;

import apple.corebluetooth.CBCentralManager;
import apple.corebluetooth.CBPeripheral;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSNumber;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * [@protocol] CBCentralManagerDelegate
 * 
 * The delegate of a {@link CBCentralManager} object must adopt the <code>CBCentralManagerDelegate</code> protocol. The
 *             single required method indicates the availability of the central manager, while the optional methods allow for the discovery and
 *             connection of peripherals.
 */
@Generated
@Library("CoreBluetooth")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CBCentralManagerDelegate")
public interface CBCentralManagerDelegate {
    /**
     * centralManager:didConnectPeripheral:
     * 
     * This method is invoked when a connection initiated by {@link connectPeripheral:options:} has succeeded.
     * 
     * @param central      The central manager providing this information.
     * @param peripheral   The <code>CBPeripheral</code> that has connected.
     */
    @Generated
    @IsOptional
    @Selector("centralManager:didConnectPeripheral:")
    default void centralManagerDidConnectPeripheral(CBCentralManager central, CBPeripheral peripheral) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * centralManager:didDisconnectPeripheral:error:
     * 
     * This method is invoked upon the disconnection of a peripheral that was connected by {@link connectPeripheral:options:}. If the disconnection
     *                     was not initiated by {@link cancelPeripheralConnection}, the cause will be detailed in the <i>error</i> parameter. Once this method has been
     *                     called, no more methods will be invoked on <i>peripheral</i>'s <code>CBPeripheralDelegate</code>.
     * 
     * @param central      The central manager providing this information.
     * @param peripheral   The <code>CBPeripheral</code> that has disconnected.
     * @param error        If an error occurred, the cause of the failure.
     */
    @Generated
    @IsOptional
    @Selector("centralManager:didDisconnectPeripheral:error:")
    default void centralManagerDidDisconnectPeripheralError(CBCentralManager central, CBPeripheral peripheral,
            NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * centralManager:didDiscoverPeripheral:advertisementData:RSSI:
     * 
     * This method is invoked while scanning, upon the discovery of <i>peripheral</i> by <i>central</i>. A discovered peripheral must
     *                             be retained in order to use it; otherwise, it is assumed to not be of interest and will be cleaned up by the central manager. For
     *                             a list of <i>advertisementData</i> keys, see {@link CBAdvertisementDataLocalNameKey} and other similar constants.
     * 
     * @param central              The central manager providing this update.
     * @param peripheral           A <code>CBPeripheral</code> object.
     * @param advertisementData    A dictionary containing any advertisement and scan response data.
     * @param RSSI                 The current RSSI of <i>peripheral</i>, in dBm. A value of <code>127</code> is reserved and indicates the RSSI
     * 						was not available.
     * 
     * @see                    CBAdvertisementData.h
     */
    @Generated
    @IsOptional
    @Selector("centralManager:didDiscoverPeripheral:advertisementData:RSSI:")
    default void centralManagerDidDiscoverPeripheralAdvertisementDataRSSI(CBCentralManager central,
            CBPeripheral peripheral, NSDictionary<String, ?> advertisementData, NSNumber RSSI) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * centralManager:didFailToConnectPeripheral:error:
     * 
     * This method is invoked when a connection initiated by {@link connectPeripheral:options:} has failed to complete. As connection attempts do not
     *                     timeout, the failure of a connection is atypical and usually indicative of a transient issue.
     * 
     * @param central      The central manager providing this information.
     * @param peripheral   The <code>CBPeripheral</code> that has failed to connect.
     * @param error        The cause of the failure.
     */
    @Generated
    @IsOptional
    @Selector("centralManager:didFailToConnectPeripheral:error:")
    default void centralManagerDidFailToConnectPeripheralError(CBCentralManager central, CBPeripheral peripheral,
            NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * centralManager:willRestoreState:
     * 
     * For apps that opt-in to state preservation and restoration, this is the first method invoked when your app is relaunched into
     * 				the background to complete some Bluetooth-related task. Use this method to synchronize your app's state with the state of the
     * 				Bluetooth system.
     * 
     * @param central      The central manager providing this information.
     * @param dict			A dictionary containing information about <i>central</i> that was preserved by the system at the time the app was terminated.
     * 
     * @see            CBCentralManagerRestoredStatePeripheralsKey;
     * @see            CBCentralManagerRestoredStateScanServicesKey;
     * @see            CBCentralManagerRestoredStateScanOptionsKey;
     */
    @Generated
    @IsOptional
    @Selector("centralManager:willRestoreState:")
    default void centralManagerWillRestoreState(CBCentralManager central, NSDictionary<String, ?> dict) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * centralManagerDidUpdateState:
     * 
     * Invoked whenever the central manager's state has been updated. Commands should only be issued when the state is
     *                 <code>CBCentralManagerStatePoweredOn</code>. A state below <code>CBCentralManagerStatePoweredOn</code>
     *                 implies that scanning has stopped and any connected peripherals have been disconnected. If the state moves below
     *                 <code>CBCentralManagerStatePoweredOff</code>, all <code>CBPeripheral</code> objects obtained from this central
     *                 manager become invalid and must be retrieved or discovered again.
     * 
     * @param central  The central manager whose state has changed.
     * 
     * @see            state
     */
    @Generated
    @Selector("centralManagerDidUpdateState:")
    void centralManagerDidUpdateState(CBCentralManager central);

    /**
     * centralManager:connectionEventDidOccur:forPeripheral:
     * 
     * This method is invoked upon the connection or disconnection of a peripheral that matches any of the options provided in {@link registerForConnectionEventsWithOptions:}.
     * 
     * @param central      The central manager providing this information.
     * @param event		The <code>CBConnectionEvent</code> that has occurred.
     * @param peripheral   The <code>CBPeripheral</code> that caused the event.
     */
    @Generated
    @IsOptional
    @Selector("centralManager:connectionEventDidOccur:forPeripheral:")
    default void centralManagerConnectionEventDidOccurForPeripheral(CBCentralManager central, @NInt long event,
            CBPeripheral peripheral) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * centralManager:didUpdateANCSAuthorizationForPeripheral:
     * 
     * This method is invoked when the authorization status changes for a peripheral connected with {@link connectPeripheral:} option {@link CBConnectPeripheralOptionRequiresANCS}.
     * 
     * @param central      The central manager providing this information.
     * @param peripheral   The <code>CBPeripheral</code> that caused the event.
     */
    @Generated
    @IsOptional
    @Selector("centralManager:didUpdateANCSAuthorizationForPeripheral:")
    default void centralManagerDidUpdateANCSAuthorizationForPeripheral(CBCentralManager central,
            CBPeripheral peripheral) {
        throw new java.lang.UnsupportedOperationException();
    }
}
