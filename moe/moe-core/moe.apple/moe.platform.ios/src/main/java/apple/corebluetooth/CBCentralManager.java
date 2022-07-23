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
import apple.corebluetooth.protocol.CBCentralManagerDelegate;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSUUID;
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
 * CBCentralManager
 * <p>
 * Entry point to the central role. Commands should only be issued when its state is
 * <code>CBCentralManagerStatePoweredOn</code>.
 */
@Generated
@Library("CoreBluetooth")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CBCentralManager extends CBManager {
    static {
        NatJ.register();
    }

    @Generated
    protected CBCentralManager(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CBCentralManager alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CBCentralManager allocWithZone(VoidPtr zone);

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
    public static native CBCentralManager new_objc();

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
     * cancelPeripheralConnection:
     * <p>
     * Cancels an active or pending connection to <i>peripheral</i>. Note that this is non-blocking, and any
     * <code>CBPeripheral</code>
     * commands that are still pending to <i>peripheral</i> may or may not complete.
     *
     * @param peripheral A <code>CBPeripheral</code>.
     * @see centralManager:didDisconnectPeripheral:error:
     */
    @Generated
    @Selector("cancelPeripheralConnection:")
    public native void cancelPeripheralConnection(CBPeripheral peripheral);

    /**
     * connectPeripheral:options:
     * <p>
     * Initiates a connection to <i>peripheral</i>. Connection attempts never time out and, depending on the outcome,
     * will result
     * in a call to either {@link centralManager:didConnectPeripheral:} or
     * {@link centralManager:didFailToConnectPeripheral:error:}.
     * Pending attempts are cancelled automatically upon deallocation of <i>peripheral</i>, and explicitly via
     * {@link cancelPeripheralConnection}.
     *
     * @param peripheral The <code>CBPeripheral</code> to be connected.
     * @param options    An optional dictionary specifying connection behavior options.
     * @see CBConnectPeripheralOptionRequiresANCS
     * @see centralManager:didConnectPeripheral:
     * @see centralManager:didFailToConnectPeripheral:error:
     * @see CBConnectPeripheralOptionNotifyOnConnectionKey
     * @see CBConnectPeripheralOptionNotifyOnDisconnectionKey
     * @see CBConnectPeripheralOptionNotifyOnNotificationKey
     * @see CBConnectPeripheralOptionEnableTransportBridgingKey
     */
    @Generated
    @Selector("connectPeripheral:options:")
    public native void connectPeripheralOptions(CBPeripheral peripheral, NSDictionary<String, ?> options);

    /**
     * [@property] delegate
     * <p>
     * The delegate object that will receive central events.
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native CBCentralManagerDelegate delegate();

    @Generated
    @Selector("init")
    public native CBCentralManager init();

    /**
     * initWithDelegate:queue:
     * <p>
     * The initialization call. The events of the central role will be dispatched on the provided queue.
     * If <i>nil</i>, the main queue will be used.
     *
     * @param delegate The delegate that will receive central role events.
     * @param queue    The dispatch queue on which the events will be dispatched.
     */
    @Generated
    @Selector("initWithDelegate:queue:")
    public native CBCentralManager initWithDelegateQueue(
            @Mapped(ObjCObjectMapper.class) CBCentralManagerDelegate delegate, NSObject queue);

    /**
     * initWithDelegate:queue:options:
     * <p>
     * The initialization call. The events of the central role will be dispatched on the provided queue.
     * If <i>nil</i>, the main queue will be used.
     *
     * @param delegate The delegate that will receive central role events.
     * @param queue    The dispatch queue on which the events will be dispatched.
     * @param options  An optional dictionary specifying options for the manager.
     * @see CBCentralManagerOptionShowPowerAlertKey
     * @see CBCentralManagerOptionRestoreIdentifierKey
     */
    @Generated
    @Selector("initWithDelegate:queue:options:")
    public native CBCentralManager initWithDelegateQueueOptions(
            @Mapped(ObjCObjectMapper.class) CBCentralManagerDelegate delegate, NSObject queue,
            NSDictionary<String, ?> options);

    /**
     * [@property] isScanning
     * <p>
     * Whether or not the central is currently scanning.
     */
    @Generated
    @Selector("isScanning")
    public native boolean isScanning();

    /**
     * retrieveConnectedPeripheralsWithServices
     * <p>
     * Retrieves all peripherals that are connected to the system and implement any of the services listed in
     * <i>serviceUUIDs</i>.
     * Note that this set can include peripherals which were connected by other applications, which will need to be
     * connected locally
     * via {@link connectPeripheral:options:} before they can be used.
     *
     * @return A list of <code>CBPeripheral</code> objects.
     */
    @Generated
    @Selector("retrieveConnectedPeripheralsWithServices:")
    public native NSArray<? extends CBPeripheral> retrieveConnectedPeripheralsWithServices(
            NSArray<? extends CBUUID> serviceUUIDs);

    /**
     * retrievePeripheralsWithIdentifiers:
     * <p>
     * Attempts to retrieve the <code>CBPeripheral</code> object(s) with the corresponding <i>identifiers</i>.
     *
     * @param identifiers A list of <code>NSUUID</code> objects.
     * @return A list of <code>CBPeripheral</code> objects.
     */
    @Generated
    @Selector("retrievePeripheralsWithIdentifiers:")
    public native NSArray<? extends CBPeripheral> retrievePeripheralsWithIdentifiers(
            NSArray<? extends NSUUID> identifiers);

    /**
     * scanForPeripheralsWithServices:options:
     * <p>
     * Starts scanning for peripherals that are advertising any of the services listed in <i>serviceUUIDs</i>. Although
     * strongly discouraged,
     * if <i>serviceUUIDs</i> is <i>nil</i> all discovered peripherals will be returned. If the central is already
     * scanning with different
     * <i>serviceUUIDs</i> or <i>options</i>, the provided parameters will replace them.
     * Applications that have specified the <code>bluetooth-central</code> background mode are allowed to scan while
     * backgrounded, with two
     * caveats: the scan must specify one or more service types in <i>serviceUUIDs</i>, and the
     * <code>CBCentralManagerScanOptionAllowDuplicatesKey</code>
     * scan option will be ignored.
     *
     * @param serviceUUIDs A list of <code>CBUUID</code> objects representing the service(s) to scan for.
     * @param options      An optional dictionary specifying options for the scan.
     * @see CBCentralManagerScanOptionSolicitedServiceUUIDsKey
     * @see centralManager:didDiscoverPeripheral:advertisementData:RSSI:
     * @see CBCentralManagerScanOptionAllowDuplicatesKey
     */
    @Generated
    @Selector("scanForPeripheralsWithServices:options:")
    public native void scanForPeripheralsWithServicesOptions(NSArray<? extends CBUUID> serviceUUIDs,
            NSDictionary<String, ?> options);

    /**
     * [@property] delegate
     * <p>
     * The delegate object that will receive central events.
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) CBCentralManagerDelegate value);

    /**
     * [@property] delegate
     * <p>
     * The delegate object that will receive central events.
     */
    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) CBCentralManagerDelegate value) {
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
     * stopScan:
     * <p>
     * Stops scanning for peripherals.
     */
    @Generated
    @Selector("stopScan")
    public native void stopScan();

    @Generated
    @Selector("authorization")
    @NInt
    public static native long authorization_static();

    /**
     * registerForConnectionEventsWithOptions:
     * <p>
     * Calls {@link centralManager:connectionEventDidOccur:forPeripheral:} when a connection event occurs matching any
     * of the given options.
     * Passing nil in the option parameter clears any prior registered matching options.
     *
     * @param options A dictionary specifying connection event options.
     * @see centralManager:connectionEventDidOccur:forPeripheral:
     * @see CBConnectionEventMatchingOptionServiceUUIDs
     * @see CBConnectionEventMatchingOptionPeripheralUUIDs
     */
    @Generated
    @Selector("registerForConnectionEventsWithOptions:")
    public native void registerForConnectionEventsWithOptions(NSDictionary<String, ?> options);

    /**
     * supportsFeatures
     * <p>
     * Returns a boolean value representing the support for the provided features.
     *
     * @param features One or more features you would like to check if supported.
     */
    @Generated
    @Selector("supportsFeatures:")
    public static native boolean supportsFeatures(@NUInt long features);
}
