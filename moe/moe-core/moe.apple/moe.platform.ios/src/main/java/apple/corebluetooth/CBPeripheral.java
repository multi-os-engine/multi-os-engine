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
import apple.corebluetooth.protocol.CBPeripheralDelegate;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
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
 * CBPeripheral
 * <p>
 * Represents a peripheral.
 */
@Generated
@Library("CoreBluetooth")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CBPeripheral extends CBPeer {
    static {
        NatJ.register();
    }

    @Generated
    protected CBPeripheral(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CBPeripheral alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CBPeripheral allocWithZone(VoidPtr zone);

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
    public static native CBPeripheral new_objc();

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
     * [@property] RSSI
     * <p>
     * The most recently read RSSI, in decibels.
     *
     * @deprecated Use {@link peripheral:didReadRSSI:error:} instead.
     */
    @Generated
    @Deprecated
    @Selector("RSSI")
    public native NSNumber RSSI();

    /**
     * [@property] delegate
     * <p>
     * The delegate object that will receive peripheral events.
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native CBPeripheralDelegate delegate();

    /**
     * discoverCharacteristics:forService:
     * <p>
     * Discovers the specified characteristic(s) of <i>service</i>.
     *
     * @param characteristicUUIDs A list of <code>CBUUID</code> objects representing the characteristic types to be
     *                            discovered. If <i>nil</i>,
     *                            all characteristics of <i>service</i> will be discovered.
     * @param service             A GATT service.
     * @see peripheral:didDiscoverCharacteristicsForService:error:
     */
    @Generated
    @Selector("discoverCharacteristics:forService:")
    public native void discoverCharacteristicsForService(NSArray<? extends CBUUID> characteristicUUIDs,
            CBService service);

    /**
     * discoverDescriptorsForCharacteristic:
     * <p>
     * Discovers the characteristic descriptor(s) of <i>characteristic</i>.
     *
     * @param characteristic A GATT characteristic.
     * @see peripheral:didDiscoverDescriptorsForCharacteristic:error:
     */
    @Generated
    @Selector("discoverDescriptorsForCharacteristic:")
    public native void discoverDescriptorsForCharacteristic(CBCharacteristic characteristic);

    /**
     * discoverIncludedServices:forService:
     * <p>
     * Discovers the specified included service(s) of <i>service</i>.
     *
     * @param includedServiceUUIDs A list of <code>CBUUID</code> objects representing the included service types to be
     *                             discovered. If <i>nil</i>,
     *                             all of <i>service</i>s included services will be discovered, which is considerably
     *                             slower and not recommended.
     * @param service              A GATT service.
     * @see peripheral:didDiscoverIncludedServicesForService:error:
     */
    @Generated
    @Selector("discoverIncludedServices:forService:")
    public native void discoverIncludedServicesForService(NSArray<? extends CBUUID> includedServiceUUIDs,
            CBService service);

    /**
     * discoverServices:
     * <p>
     * Discovers available service(s) on the peripheral.
     *
     * @param serviceUUIDs A list of <code>CBUUID</code> objects representing the service types to be discovered. If
     *                     <i>nil</i>,
     *                     all services will be discovered.
     * @see peripheral:didDiscoverServices:
     */
    @Generated
    @Selector("discoverServices:")
    public native void discoverServices(NSArray<? extends CBUUID> serviceUUIDs);

    @Generated
    @Selector("init")
    public native CBPeripheral init();

    /**
     * maximumWriteValueLengthForType:
     * <p>
     * The maximum amount of data, in bytes, that can be sent to a characteristic in a single write type.
     *
     * @see writeValue:forCharacteristic:type:
     */
    @Generated
    @Selector("maximumWriteValueLengthForType:")
    @NUInt
    public native long maximumWriteValueLengthForType(@NInt long type);

    /**
     * [@property] name
     * <p>
     * The name of the peripheral.
     */
    @Generated
    @Selector("name")
    public native String name();

    /**
     * readRSSI
     * <p>
     * While connected, retrieves the current RSSI of the link.
     *
     * @see peripheral:didReadRSSI:error:
     */
    @Generated
    @Selector("readRSSI")
    public native void readRSSI();

    /**
     * readValueForCharacteristic:
     * <p>
     * Reads the characteristic value for <i>characteristic</i>.
     *
     * @param characteristic A GATT characteristic.
     * @see peripheral:didUpdateValueForCharacteristic:error:
     */
    @Generated
    @Selector("readValueForCharacteristic:")
    public native void readValueForCharacteristic(CBCharacteristic characteristic);

    /**
     * readValueForDescriptor:
     * <p>
     * Reads the value of <i>descriptor</i>.
     *
     * @param descriptor A GATT characteristic descriptor.
     * @see peripheral:didUpdateValueForDescriptor:error:
     */
    @Generated
    @Selector("readValueForDescriptor:")
    public native void readValueForDescriptor(CBDescriptor descriptor);

    /**
     * [@property] services
     * <p>
     * A list of <code>CBService</code> objects that have been discovered on the peripheral.
     */
    @Generated
    @Selector("services")
    public native NSArray<? extends CBService> services();

    /**
     * [@property] delegate
     * <p>
     * The delegate object that will receive peripheral events.
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) CBPeripheralDelegate value);

    /**
     * [@property] delegate
     * <p>
     * The delegate object that will receive peripheral events.
     */
    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) CBPeripheralDelegate value) {
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
     * setNotifyValue:forCharacteristic:
     * <p>
     * Enables or disables notifications/indications for the characteristic value of <i>characteristic</i>. If
     * <i>characteristic</i>
     * allows both, notifications will be used.
     * When notifications/indications are enabled, updates to the characteristic value will be received via delegate
     * method
     * [@link] peripheral:didUpdateValueForCharacteristic:error: @/link. Since it is the peripheral that chooses when to
     * send an update,
     * the application should be prepared to handle them as long as notifications/indications remain enabled.
     *
     * @param enabled        Whether or not notifications/indications should be enabled.
     * @param characteristic The characteristic containing the client characteristic configuration descriptor.
     * @see peripheral:didUpdateNotificationStateForCharacteristic:error:
     * @see CBConnectPeripheralOptionNotifyOnNotificationKey
     */
    @Generated
    @Selector("setNotifyValue:forCharacteristic:")
    public native void setNotifyValueForCharacteristic(boolean enabled, CBCharacteristic characteristic);

    /**
     * [@property] state
     * <p>
     * The current connection state of the peripheral.
     */
    @Generated
    @Selector("state")
    @NInt
    public native long state();

    /**
     * writeValue:forCharacteristic:type:
     * <p>
     * Writes <i>value</i> to <i>characteristic</i>'s characteristic value.
     * If the <code>CBCharacteristicWriteWithResponse</code> type is specified,
     * {@link peripheral:didWriteValueForCharacteristic:error:}
     * is called with the result of the write request.
     * If the <code>CBCharacteristicWriteWithoutResponse</code> type is specified, and canSendWriteWithoutResponse is
     * false, the delivery
     * of the data is best-effort and may not be guaranteed.
     *
     * @param data           The value to write.
     * @param characteristic The characteristic whose characteristic value will be written.
     * @param type           The type of write to be executed.
     * @see peripheral:didWriteValueForCharacteristic:error:
     * @see peripheralIsReadyToSendWriteWithoutResponse:
     * @see canSendWriteWithoutResponse
     * @see CBCharacteristicWriteType
     */
    @Generated
    @Selector("writeValue:forCharacteristic:type:")
    public native void writeValueForCharacteristicType(NSData data, CBCharacteristic characteristic, @NInt long type);

    /**
     * writeValue:forDescriptor:
     * <p>
     * Writes <i>data</i> to <i>descriptor</i>'s value. Client characteristic configuration descriptors cannot be
     * written using
     * this method, and should instead use @link setNotifyValue:forCharacteristic: @/link.
     *
     * @param data       The value to write.
     * @param descriptor A GATT characteristic descriptor.
     * @see peripheral:didWriteValueForCharacteristic:error:
     */
    @Generated
    @Selector("writeValue:forDescriptor:")
    public native void writeValueForDescriptor(NSData data, CBDescriptor descriptor);

    /**
     * [@property] canSendWriteWithoutResponse
     * <p>
     * YES if the remote device has space to send a write without response. If this value is NO,
     * the value will be set to YES after the current writes have been flushed, and
     * <link>peripheralIsReadyToSendWriteWithoutResponse:</link> will be called.
     */
    @Generated
    @Selector("canSendWriteWithoutResponse")
    public native boolean canSendWriteWithoutResponse();

    /**
     * openL2CAPChannel:
     * <p>
     * Attempt to open an L2CAP channel to the peripheral using the supplied PSM.
     *
     * @param PSM The PSM of the channel to open
     * @see peripheral:didWriteValueForCharacteristic:error:
     */
    @Generated
    @Selector("openL2CAPChannel:")
    public native void openL2CAPChannel(char PSM);

    /**
     * [@property] ancsAuthorized
     * <p>
     * YES if the remote device has been authorized to receive data over ANCS (Apple Notification Service Center)
     * protocol. If this value is NO,
     * the value will be set to YES after a user authorization occurs and
     * <link>didUpdateANCSAuthorizationForPeripheral:</link> will be called.
     */
    @Generated
    @Selector("ancsAuthorized")
    public native boolean ancsAuthorized();
}
