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

package apple.corebluetooth;

import apple.NSObject;
import apple.corebluetooth.protocol.CBPeripheralManagerDelegate;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * CBPeripheralManager
 * <p>
 * The <code>CBPeripheralManager</code> class is an abstraction of the Peripheral and Broadcaster GAP roles, and the
 * GATT Server
 * role. Its primary function is to allow you to manage published services within the GATT database, and to advertise
 * these services
 * to other devices.
 * Each application has sandboxed access to the shared GATT database. You can add services to the database by calling
 * {@link addService:};
 * they can be removed via {@link removeService:} and {@link removeAllServices}, as appropriate. While a service is in
 * the database,
 * it is visible to and can be accessed by any connected GATT Client. However, applications that have not specified the
 * "bluetooth-peripheral"
 * background mode will have the contents of their service(s) "disabled" when in the background. Any remote device
 * trying to access
 * characteristic values or descriptors during this time will receive an error response.
 * Once you've published services that you want to share, you can ask to advertise their availability and allow other
 * devices to connect
 * to you by calling {@link startAdvertising:}. Like the GATT database, advertisement is managed at the system level and
 * shared by all
 * applications. This means that even if you aren't advertising at the moment, someone else might be!
 */
@Generated
@Library("CoreBluetooth")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CBPeripheralManager extends CBManager {
    static {
        NatJ.register();
    }

    @Generated
    protected CBPeripheralManager(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CBPeripheralManager alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CBPeripheralManager allocWithZone(VoidPtr zone);

    /**
     * authorizationStatus
     * <p>
     * This method does not prompt the user for access. You can use it to detect restricted access and simply hide UI
     * instead of
     * prompting for access.
     *
     * @return The current authorization status for sharing data while backgrounded. For the constants returned, see
     *         {@link CBPeripheralManagerAuthorizationStatus}.
     * @see CBPeripheralManagerAuthorizationStatus
     */
    @Generated
    @Selector("authorizationStatus")
    @NInt
    public static native long authorizationStatus();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("instanceMethodForSelector:")
    @FunctionPtr(name = "call_instanceMethodForSelector_ret")
    public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(SEL aSelector);

    @Generated
    @Selector("instanceMethodSignatureForSelector:")
    public static native NSMethodSignature instanceMethodSignatureForSelector(SEL aSelector);

    @Generated
    @Selector("instancesRespondToSelector:")
    public static native boolean instancesRespondToSelector(SEL aSelector);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native CBPeripheralManager new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * addService:
     * <p>
     * Publishes a service and its associated characteristic(s) to the local database. If the service contains included
     * services,
     * they must be published first.
     *
     * @param service A GATT service.
     * @see peripheralManager:didAddService:error:
     */
    @Generated
    @Selector("addService:")
    public native void addService(CBMutableService service);

    /**
     * [@property] delegate
     * <p>
     * The delegate object that will receive peripheral events.
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native CBPeripheralManagerDelegate delegate();

    @Generated
    @Selector("init")
    public native CBPeripheralManager init();

    /**
     * initWithDelegate:queue:
     * <p>
     * The initialization call. The events of the peripheral role will be dispatched on the provided queue.
     * If <i>nil</i>, the main queue will be used.
     *
     * @param delegate The delegate that will receive peripheral role events.
     * @param queue    The dispatch queue on which the events will be dispatched.
     */
    @Generated
    @Selector("initWithDelegate:queue:")
    public native CBPeripheralManager initWithDelegateQueue(
            @Mapped(ObjCObjectMapper.class) CBPeripheralManagerDelegate delegate, NSObject queue);

    /**
     * initWithDelegate:queue:options:
     * <p>
     * The initialization call. The events of the peripheral role will be dispatched on the provided queue.
     * If <i>nil</i>, the main queue will be used.
     *
     * @param delegate The delegate that will receive peripheral role events.
     * @param queue    The dispatch queue on which the events will be dispatched.
     * @param options  An optional dictionary specifying options for the manager.
     * @see CBPeripheralManagerOptionShowPowerAlertKey
     * @see CBPeripheralManagerOptionRestoreIdentifierKey
     */
    @Generated
    @Selector("initWithDelegate:queue:options:")
    public native CBPeripheralManager initWithDelegateQueueOptions(
            @Mapped(ObjCObjectMapper.class) CBPeripheralManagerDelegate delegate, NSObject queue,
            NSDictionary<String, ?> options);

    /**
     * [@property] isAdvertising
     * <p>
     * Whether or not the peripheral is currently advertising data.
     */
    @Generated
    @Selector("isAdvertising")
    public native boolean isAdvertising();

    /**
     * removeAllServices
     * <p>
     * Removes all published services from the local database.
     */
    @Generated
    @Selector("removeAllServices")
    public native void removeAllServices();

    /**
     * removeService:
     * <p>
     * Removes a published service from the local database. If the service is included by other service(s), they must be
     * removed
     * first.
     *
     * @param service A GATT service.
     */
    @Generated
    @Selector("removeService:")
    public native void removeService(CBMutableService service);

    /**
     * respondToRequest:withResult:
     * <p>
     * Used to respond to request(s) received via the @link peripheralManager:didReceiveReadRequest: @/link or
     * [@link] peripheralManager:didReceiveWriteRequests: @/link delegate methods.
     *
     * @param request The original request that was received from the central.
     * @param result  The result of attempting to fulfill <i>request</i>.
     * @see peripheralManager:didReceiveReadRequest:
     * @see peripheralManager:didReceiveWriteRequests:
     */
    @Generated
    @Selector("respondToRequest:withResult:")
    public native void respondToRequestWithResult(CBATTRequest request, @NInt long result);

    /**
     * [@property] delegate
     * <p>
     * The delegate object that will receive peripheral events.
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) CBPeripheralManagerDelegate value);

    /**
     * [@property] delegate
     * <p>
     * The delegate object that will receive peripheral events.
     */
    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) CBPeripheralManagerDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * setDesiredConnectionLatency:forCentral:
     * <p>
     * Sets the desired connection latency for an existing connection to <i>central</i>. Connection latency changes are
     * not guaranteed, so the
     * resultant latency may vary. If a desired latency is not set, the latency chosen by <i>central</i> at the time of
     * connection establishment
     * will be used. Typically, it is not necessary to change the latency.
     *
     * @param latency The desired connection latency.
     * @param central A connected central.
     * @see CBPeripheralManagerConnectionLatency
     */
    @Generated
    @Selector("setDesiredConnectionLatency:forCentral:")
    public native void setDesiredConnectionLatencyForCentral(@NInt long latency, CBCentral central);

    /**
     * startAdvertising:
     * <p>
     * Starts advertising. Supported advertising data types are <code>CBAdvertisementDataLocalNameKey</code>
     * and <code>CBAdvertisementDataServiceUUIDsKey</code>.
     * When in the foreground, an application can utilize up to 28 bytes of space in the initial advertisement data for
     * any combination of the supported advertising data types. If this space is used up, there are an additional 10
     * bytes of
     * space in the scan response that can be used only for the local name. Note that these sizes do not include the 2
     * bytes
     * of header information that are required for each new data type. Any service UUIDs that do not fit in the allotted
     * space
     * will be added to a special "overflow" area, and can only be discovered by an iOS device that is explicitly
     * scanning
     * for them.
     * While an application is in the background, the local name will not be used and all service UUIDs will be placed
     * in the
     * "overflow" area. However, applications that have not specified the "bluetooth-peripheral" background mode will
     * not be able
     * to advertise anything while in the background.
     *
     * @param advertisementData An optional dictionary containing the data to be advertised.
     * @see peripheralManagerDidStartAdvertising:error:
     * @see CBAdvertisementData.h
     */
    @Generated
    @Selector("startAdvertising:")
    public native void startAdvertising(NSDictionary<String, ?> advertisementData);

    /**
     * stopAdvertising
     * <p>
     * Stops advertising.
     */
    @Generated
    @Selector("stopAdvertising")
    public native void stopAdvertising();

    /**
     * updateValue:forCharacteristic:onSubscribedCentrals:
     * <p>
     * Sends an updated characteristic value to one or more centrals, via a notification or indication. If <i>value</i>
     * exceeds
     * {@link maximumUpdateValueLength}, it will be truncated to fit.
     *
     * @param value          The value to be sent via a notification/indication.
     * @param characteristic The characteristic whose value has changed.
     * @param centrals       A list of <code>CBCentral</code> objects to receive the update. Note that centrals which
     *                       have not subscribed to
     *                       <i>characteristic</i> will be ignored. If <i>nil</i>, all centrals that are subscribed to
     *                       <i>characteristic</i> will be updated.
     * @return <i>YES</i> if the update could be sent, or <i>NO</i> if the underlying transmit queue is full. If
     *         <i>NO</i> was returned,
     *         the delegate method @link peripheralManagerIsReadyToUpdateSubscribers: @/link will be called once space
     *         has become
     *         available, and the update should be re-sent if so desired.
     * @see maximumUpdateValueLength
     * @see peripheralManager:central:didSubscribeToCharacteristic:
     * @see peripheralManager:central:didUnsubscribeFromCharacteristic:
     * @see peripheralManagerIsReadyToUpdateSubscribers:
     */
    @Generated
    @Selector("updateValue:forCharacteristic:onSubscribedCentrals:")
    public native boolean updateValueForCharacteristicOnSubscribedCentrals(NSData value,
            CBMutableCharacteristic characteristic, NSArray<? extends CBCentral> centrals);

    /**
     * publishL2CAPChannelWithEncryption:
     * <p>
     * Create a listener for incoming L2CAP Channel connections. The system will determine an unused PSM at the time of
     * publishing, which will be returned
     * with @link peripheralManager:didPublishL2CAPChannel:error: @/link. L2CAP Channels are not discoverable by
     * themselves, so it is the application's
     * responsibility to handle PSM discovery on the client.
     *
     * @param encryptionRequired YES if the service requires the link to be encrypted before a stream can be
     *                           established. NO if the service can be used over
     *                           an unsecured link.
     */
    @Generated
    @Selector("publishL2CAPChannelWithEncryption:")
    public native void publishL2CAPChannelWithEncryption(boolean encryptionRequired);

    /**
     * unpublishL2CAPChannel:
     * <p>
     * Removes a published service from the local system. No new connections for this PSM will be accepted, and any
     * existing L2CAP channels
     * using this PSM will be closed.
     *
     * @param PSM The service PSM to be removed from the system.
     */
    @Generated
    @Selector("unpublishL2CAPChannel:")
    public native void unpublishL2CAPChannel(char PSM);

    @Generated
    @Selector("authorization")
    @NInt
    public static native long authorization_static();
}
