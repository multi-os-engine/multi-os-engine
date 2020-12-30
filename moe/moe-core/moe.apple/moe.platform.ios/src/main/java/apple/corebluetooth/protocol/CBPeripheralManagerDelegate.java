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

import apple.corebluetooth.CBATTRequest;
import apple.corebluetooth.CBCentral;
import apple.corebluetooth.CBCharacteristic;
import apple.corebluetooth.CBL2CAPChannel;
import apple.corebluetooth.CBPeripheralManager;
import apple.corebluetooth.CBService;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * @protocol CBPeripheralManagerDelegate
 * 
 * @discussion The delegate of a @link CBPeripheralManager @/link object must adopt the <code>CBPeripheralManagerDelegate</code> protocol. The
 *             single required method indicates the availability of the peripheral manager, while the optional methods provide information about
 *             centrals, which can connect and access the local database.
 */
@Generated
@Library("CoreBluetooth")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CBPeripheralManagerDelegate")
public interface CBPeripheralManagerDelegate {
    /**
     * @method peripheralManager:central:didSubscribeToCharacteristic:
     * 
     * @param peripheral       The peripheral manager providing this update.
     * @param central          The central that issued the command.
     * @param characteristic   The characteristic on which notifications or indications were enabled.
     * 
     * @discussion             This method is invoked when a central configures <i>characteristic</i> to notify or indicate.
     *                         It should be used as a cue to start sending updates as the characteristic value changes.
     */
    @Generated
    @IsOptional
    @Selector("peripheralManager:central:didSubscribeToCharacteristic:")
    default void peripheralManagerCentralDidSubscribeToCharacteristic(CBPeripheralManager peripheral, CBCentral central,
            CBCharacteristic characteristic) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * @method peripheralManager:central:didUnsubscribeFromCharacteristic:
     * 
     * @param peripheral       The peripheral manager providing this update.
     * @param central          The central that issued the command.
     * @param characteristic   The characteristic on which notifications or indications were disabled.
     * 
     * @discussion             This method is invoked when a central removes notifications/indications from <i>characteristic</i>.
     */
    @Generated
    @IsOptional
    @Selector("peripheralManager:central:didUnsubscribeFromCharacteristic:")
    default void peripheralManagerCentralDidUnsubscribeFromCharacteristic(CBPeripheralManager peripheral,
            CBCentral central, CBCharacteristic characteristic) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * @method peripheralManager:didAddService:error:
     * 
     * @param peripheral   The peripheral manager providing this information.
     * @param service      The service that was added to the local database.
     * @param error        If an error occurred, the cause of the failure.
     * 
     * @discussion         This method returns the result of an @link addService: @/link call. If the service could
     *                     not be published to the local database, the cause will be detailed in the <i>error</i> parameter.
     */
    @Generated
    @IsOptional
    @Selector("peripheralManager:didAddService:error:")
    default void peripheralManagerDidAddServiceError(CBPeripheralManager peripheral, CBService service, NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * @method peripheralManager:didReceiveReadRequest:
     * 
     * @param peripheral   The peripheral manager requesting this information.
     * @param request      A <code>CBATTRequest</code> object.
     * 
     * @discussion         This method is invoked when <i>peripheral</i> receives an ATT request for a characteristic with a dynamic value.
     *                     For every invocation of this method, @link respondToRequest:withResult: @/link must be called.
     * 
     * @see                CBATTRequest
     */
    @Generated
    @IsOptional
    @Selector("peripheralManager:didReceiveReadRequest:")
    default void peripheralManagerDidReceiveReadRequest(CBPeripheralManager peripheral, CBATTRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * @method peripheralManager:didReceiveWriteRequests:
     * 
     * @param peripheral   The peripheral manager requesting this information.
     * @param requests     A list of one or more <code>CBATTRequest</code> objects.
     * 
     * @discussion         This method is invoked when <i>peripheral</i> receives an ATT request or command for one or more characteristics with a dynamic value.
     *                     For every invocation of this method, @link respondToRequest:withResult: @/link should be called exactly once. If <i>requests</i> contains
     *                     multiple requests, they must be treated as an atomic unit. If the execution of one of the requests would cause a failure, the request
     *                     and error reason should be provided to <code>respondToRequest:withResult:</code> and none of the requests should be executed.
     * 
     * @see                CBATTRequest
     */
    @Generated
    @IsOptional
    @Selector("peripheralManager:didReceiveWriteRequests:")
    default void peripheralManagerDidReceiveWriteRequests(CBPeripheralManager peripheral,
            NSArray<? extends CBATTRequest> requests) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * @method peripheralManager:willRestoreState:
     * 
     * @param peripheral	The peripheral manager providing this information.
     * @param dict			A dictionary containing information about <i>peripheral</i> that was preserved by the system at the time the app was terminated.
     * 
     * @discussion			For apps that opt-in to state preservation and restoration, this is the first method invoked when your app is relaunched into
     * 				the background to complete some Bluetooth-related task. Use this method to synchronize your app's state with the state of the
     * 				Bluetooth system.
     * 
     * @seealso            CBPeripheralManagerRestoredStateServicesKey;
     * @seealso            CBPeripheralManagerRestoredStateAdvertisementDataKey;
     */
    @Generated
    @IsOptional
    @Selector("peripheralManager:willRestoreState:")
    default void peripheralManagerWillRestoreState(CBPeripheralManager peripheral, NSDictionary<String, ?> dict) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * @method peripheralManagerDidStartAdvertising:error:
     * 
     * @param peripheral   The peripheral manager providing this information.
     * @param error        If an error occurred, the cause of the failure.
     * 
     * @discussion         This method returns the result of a @link startAdvertising: @/link call. If advertisement could
     *                     not be started, the cause will be detailed in the <i>error</i> parameter.
     */
    @Generated
    @IsOptional
    @Selector("peripheralManagerDidStartAdvertising:error:")
    default void peripheralManagerDidStartAdvertisingError(CBPeripheralManager peripheral, NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * @method peripheralManagerDidUpdateState:
     * 
     * @param peripheral   The peripheral manager whose state has changed.
     * 
     * @discussion         Invoked whenever the peripheral manager's state has been updated. Commands should only be issued when the state is
     *                     <code>CBPeripheralManagerStatePoweredOn</code>. A state below <code>CBPeripheralManagerStatePoweredOn</code>
     *                     implies that advertisement has paused and any connected centrals have been disconnected. If the state moves below
     *                     <code>CBPeripheralManagerStatePoweredOff</code>, advertisement is stopped and must be explicitly restarted, and the
     *                     local database is cleared and all services must be re-added.
     * 
     * @see                state
     */
    @Generated
    @Selector("peripheralManagerDidUpdateState:")
    void peripheralManagerDidUpdateState(CBPeripheralManager peripheral);

    /**
     * @method peripheralManagerIsReadyToUpdateSubscribers:
     * 
     * @param peripheral   The peripheral manager providing this update.
     * 
     * @discussion         This method is invoked after a failed call to @link updateValue:forCharacteristic:onSubscribedCentrals: @/link, when <i>peripheral</i> is again
     *                     ready to send characteristic value updates.
     */
    @Generated
    @IsOptional
    @Selector("peripheralManagerIsReadyToUpdateSubscribers:")
    default void peripheralManagerIsReadyToUpdateSubscribers(CBPeripheralManager peripheral) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     *  @method peripheralManager:didOpenL2CAPChannel:error:
     * 
     *  @param peripheral   	The peripheral manager requesting this information.
     *  @param channel	      	A <code>CBL2CAPChannel</code> object.
     * @param error		If an error occurred, the cause of the failure.
     * 
     *  @discussion			This method returns the result of establishing an incoming L2CAP channel , following publishing a channel using @link publishL2CAPChannel: @link call.
     */
    @Generated
    @IsOptional
    @Selector("peripheralManager:didOpenL2CAPChannel:error:")
    default void peripheralManagerDidOpenL2CAPChannelError(CBPeripheralManager peripheral, CBL2CAPChannel channel,
            NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * @method peripheralManager:didPublishL2CAPChannel:error:
     * 
     * @param peripheral   The peripheral manager requesting this information.
     * @param PSM			The PSM of the channel that was published.
     * @param error		If an error occurred, the cause of the failure.
     * 
     * @discussion         This method is the response to a  @link publishL2CAPChannel: @/link call.  The PSM will contain the PSM that was assigned for the published
     * 				channel
     */
    @Generated
    @IsOptional
    @Selector("peripheralManager:didPublishL2CAPChannel:error:")
    default void peripheralManagerDidPublishL2CAPChannelError(CBPeripheralManager peripheral, char PSM, NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * @method peripheralManager:didUnublishL2CAPChannel:error:
     * 
     * @param peripheral   The peripheral manager requesting this information.
     * @param PSM			The PSM of the channel that was published.
     * @param error		If an error occurred, the cause of the failure.
     * 
     * @discussion         This method is the response to a  @link unpublishL2CAPChannel: @/link call.
     */
    @Generated
    @IsOptional
    @Selector("peripheralManager:didUnpublishL2CAPChannel:error:")
    default void peripheralManagerDidUnpublishL2CAPChannelError(CBPeripheralManager peripheral, char PSM,
            NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }
}
