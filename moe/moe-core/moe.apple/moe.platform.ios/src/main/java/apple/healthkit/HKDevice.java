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

package apple.healthkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 9.0
 */
@Generated
@Library("HealthKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class HKDevice extends NSObject implements NSSecureCoding, NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected HKDevice(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native HKDevice alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native HKDevice allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * localDevice
     * 
     * Returns a device representing the host.
     * 
     * If an app chooses to save samples that were retrieved from the local device, e.g. an HKWorkout with a
     * totalDistance HKQuantity gathered from CoreLocation GPS distances, then this would be an appropriate
     * HKDevice to use.
     */
    @NotNull
    @Generated
    @Selector("localDevice")
    public static native HKDevice localDevice();

    @Generated
    @Owned
    @Selector("new")
    public static native HKDevice new_objc();

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
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * [@property] UDIDeviceIdentifier
     * 
     * Represents the device identifier portion of a device's FDA UDI (Unique Device Identifier).
     * 
     * The device identifier can be used to reference the FDA's GUDID (Globally Unique Device
     * Identifier Database). Note that for user privacy concerns this field should not be used to
     * persist the production identifier portion of the device UDI. HealthKit clients should manage
     * the production identifier independently, if needed.
     * See http://www.fda.gov/MedicalDevices/DeviceRegulationandGuidance/UniqueDeviceIdentification/ for more
     * information.
     */
    @Nullable
    @Generated
    @Selector("UDIDeviceIdentifier")
    public native String UDIDeviceIdentifier();

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    /**
     * [@property] firmwareVersion
     * 
     * The firmware revision of the receiver.
     */
    @Nullable
    @Generated
    @Selector("firmwareVersion")
    public native String firmwareVersion();

    /**
     * [@property] hardwareVersion
     * 
     * The hardware revision of the receiver.
     */
    @Nullable
    @Generated
    @Selector("hardwareVersion")
    public native String hardwareVersion();

    @Generated
    @Selector("init")
    public native HKDevice init();

    @Generated
    @Selector("initWithCoder:")
    public native HKDevice initWithCoder(@NotNull NSCoder coder);

    /**
     * initWithName:manufacturer:model:hardwareVersion:firmwareVersion:softwareVersion:localIdentifier:UDIDeviceIdentifier:
     * 
     * Initialize a new HKDevice with the specified values.
     * 
     * This allows initialization of an HKDevice object based on the
     * information provided.
     */
    @Generated
    @Selector("initWithName:manufacturer:model:hardwareVersion:firmwareVersion:softwareVersion:localIdentifier:UDIDeviceIdentifier:")
    public native HKDevice initWithNameManufacturerModelHardwareVersionFirmwareVersionSoftwareVersionLocalIdentifierUDIDeviceIdentifier(
            @Nullable String name, @Nullable String manufacturer, @Nullable String model,
            @Nullable String hardwareVersion, @Nullable String firmwareVersion, @Nullable String softwareVersion,
            @Nullable String localIdentifier, @Nullable String UDIDeviceIdentifier);

    /**
     * [@property] localIdentifier
     * 
     * A unique identifier for the receiver.
     * 
     * This property is available to clients for a local identifier.
     * For example, Bluetooth peripherals managed by HealthKit use this
     * for the CoreBluetooth UUID which is valid only on the local
     * device and thus distinguish the same Bluetooth peripheral used
     * between multiple devices.
     */
    @Nullable
    @Generated
    @Selector("localIdentifier")
    public native String localIdentifier();

    /**
     * [@property] manufacturer
     * 
     * The manufacturer of the receiver.
     */
    @Nullable
    @Generated
    @Selector("manufacturer")
    public native String manufacturer();

    /**
     * [@property] model
     * 
     * The model of the receiver.
     */
    @Nullable
    @Generated
    @Selector("model")
    public native String model();

    /**
     * [@property] name
     * 
     * The name of the receiver.
     * 
     * The user-facing name, such as the one displayed in the Bluetooth Settings for a BLE device.
     */
    @Nullable
    @Generated
    @Selector("name")
    public native String name();

    /**
     * [@property] softwareVersion
     * 
     * The software revision of the receiver.
     */
    @Nullable
    @Generated
    @Selector("softwareVersion")
    public native String softwareVersion();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}
