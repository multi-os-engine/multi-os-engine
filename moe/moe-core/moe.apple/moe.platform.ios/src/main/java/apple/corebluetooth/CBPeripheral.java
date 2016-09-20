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
    @Owned
    @Selector("alloc")
    public static native CBPeripheral alloc();

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

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
    @Selector("initialize")
    public static native void initialize();

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
    @Selector("load")
    public static native void load_objc_static();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * RSSI</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreBluetooth/Reference/CBPeripheral_Class/index.html#//apple_ref/occ/instp/CBPeripheral/RSSI">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("RSSI")
    public native NSNumber RSSI();

    /**
     * delegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreBluetooth/Reference/CBPeripheral_Class/index.html#//apple_ref/occ/instp/CBPeripheral/delegate">iOS Dev Center</a>
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native CBPeripheralDelegate delegate();

    /**
     * discoverCharacteristics:forService:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreBluetooth/Reference/CBPeripheral_Class/index.html#//apple_ref/occ/instm/CBPeripheral/discoverCharacteristics:forService:">iOS Dev Center</a>
     */
    @Generated
    @Selector("discoverCharacteristics:forService:")
    public native void discoverCharacteristicsForService(NSArray<? extends CBUUID> characteristicUUIDs,
            CBService service);

    /**
     * discoverDescriptorsForCharacteristic:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreBluetooth/Reference/CBPeripheral_Class/index.html#//apple_ref/occ/instm/CBPeripheral/discoverDescriptorsForCharacteristic:">iOS Dev Center</a>
     */
    @Generated
    @Selector("discoverDescriptorsForCharacteristic:")
    public native void discoverDescriptorsForCharacteristic(CBCharacteristic characteristic);

    /**
     * discoverIncludedServices:forService:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreBluetooth/Reference/CBPeripheral_Class/index.html#//apple_ref/occ/instm/CBPeripheral/discoverIncludedServices:forService:">iOS Dev Center</a>
     */
    @Generated
    @Selector("discoverIncludedServices:forService:")
    public native void discoverIncludedServicesForService(NSArray<? extends CBUUID> includedServiceUUIDs,
            CBService service);

    /**
     * discoverServices:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreBluetooth/Reference/CBPeripheral_Class/index.html#//apple_ref/occ/instm/CBPeripheral/discoverServices:">iOS Dev Center</a>
     */
    @Generated
    @Selector("discoverServices:")
    public native void discoverServices(NSArray<? extends CBUUID> serviceUUIDs);

    @Generated
    @Selector("init")
    public native CBPeripheral init();

    /**
     * name</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreBluetooth/Reference/CBPeripheral_Class/index.html#//apple_ref/occ/instp/CBPeripheral/name">iOS Dev Center</a>
     */
    @Generated
    @Selector("name")
    public native String name();

    /**
     * readRSSI</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreBluetooth/Reference/CBPeripheral_Class/index.html#//apple_ref/occ/instm/CBPeripheral/readRSSI">iOS Dev Center</a>
     */
    @Generated
    @Selector("readRSSI")
    public native void readRSSI();

    /**
     * readValueForCharacteristic:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreBluetooth/Reference/CBPeripheral_Class/index.html#//apple_ref/occ/instm/CBPeripheral/readValueForCharacteristic:">iOS Dev Center</a>
     */
    @Generated
    @Selector("readValueForCharacteristic:")
    public native void readValueForCharacteristic(CBCharacteristic characteristic);

    /**
     * readValueForDescriptor:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreBluetooth/Reference/CBPeripheral_Class/index.html#//apple_ref/occ/instm/CBPeripheral/readValueForDescriptor:">iOS Dev Center</a>
     */
    @Generated
    @Selector("readValueForDescriptor:")
    public native void readValueForDescriptor(CBDescriptor descriptor);

    /**
     * services</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreBluetooth/Reference/CBPeripheral_Class/index.html#//apple_ref/occ/instp/CBPeripheral/services">iOS Dev Center</a>
     */
    @Generated
    @Selector("services")
    public native NSArray<? extends CBService> services();

    /**
     * delegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreBluetooth/Reference/CBPeripheral_Class/index.html#//apple_ref/occ/instp/CBPeripheral/delegate">iOS Dev Center</a>
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) CBPeripheralDelegate value);

    /**
     * delegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreBluetooth/Reference/CBPeripheral_Class/index.html#//apple_ref/occ/instp/CBPeripheral/delegate">iOS Dev Center</a>
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
     * setNotifyValue:forCharacteristic:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreBluetooth/Reference/CBPeripheral_Class/index.html#//apple_ref/occ/instm/CBPeripheral/setNotifyValue:forCharacteristic:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setNotifyValue:forCharacteristic:")
    public native void setNotifyValueForCharacteristic(boolean enabled, CBCharacteristic characteristic);

    /**
     * state</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreBluetooth/Reference/CBPeripheral_Class/index.html#//apple_ref/occ/instp/CBPeripheral/state">iOS Dev Center</a>
     */
    @Generated
    @Selector("state")
    @NInt
    public native long state();

    /**
     * writeValue:forCharacteristic:type:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreBluetooth/Reference/CBPeripheral_Class/index.html#//apple_ref/occ/instm/CBPeripheral/writeValue:forCharacteristic:type:">iOS Dev Center</a>
     */
    @Generated
    @Selector("writeValue:forCharacteristic:type:")
    public native void writeValueForCharacteristicType(NSData data, CBCharacteristic characteristic, @NInt long type);

    /**
     * writeValue:forDescriptor:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreBluetooth/Reference/CBPeripheral_Class/index.html#//apple_ref/occ/instm/CBPeripheral/writeValue:forDescriptor:">iOS Dev Center</a>
     */
    @Generated
    @Selector("writeValue:forDescriptor:")
    public native void writeValueForDescriptor(NSData data, CBDescriptor descriptor);

    @Generated
    @Selector("maximumWriteValueLengthForType:")
    @NUInt
    public native long maximumWriteValueLengthForType(@NInt long type);
}
