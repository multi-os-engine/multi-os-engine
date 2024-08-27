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

package apple.corelocation;

import apple.NSObject;
import apple.corelocation.struct.CLLocationCoordinate2D;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSMutableDictionary;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.foundation.NSUUID;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
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
 * API-Since: 7.0
 * Deprecated-Since: 100000.0
 */
@Deprecated
@Generated
@Library("CoreLocation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CLBeaconRegion extends CLRegion {
    static {
        NatJ.register();
    }

    @Generated
    protected CLBeaconRegion(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CLBeaconRegion alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CLBeaconRegion allocWithZone(VoidPtr zone);

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

    @Generated
    @Owned
    @Selector("new")
    public static native CLBeaconRegion new_objc();

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

    @Generated
    @Selector("init")
    public native CLBeaconRegion init();

    @Generated
    @Deprecated
    @Selector("initCircularRegionWithCenter:radius:identifier:")
    public native CLBeaconRegion initCircularRegionWithCenterRadiusIdentifier(@ByValue CLLocationCoordinate2D center,
            double radius, @NotNull String identifier);

    @Generated
    @Selector("initWithCoder:")
    public native CLBeaconRegion initWithCoder(@NotNull NSCoder coder);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 13.0
     */
    @Deprecated
    @Generated
    @Selector("initWithProximityUUID:identifier:")
    public native CLBeaconRegion initWithProximityUUIDIdentifier(@NotNull NSUUID proximityUUID,
            @NotNull String identifier);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 13.0
     */
    @Deprecated
    @Generated
    @Selector("initWithProximityUUID:major:identifier:")
    public native CLBeaconRegion initWithProximityUUIDMajorIdentifier(@NotNull NSUUID proximityUUID, char major,
            @NotNull String identifier);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 13.0
     */
    @Deprecated
    @Generated
    @Selector("initWithProximityUUID:major:minor:identifier:")
    public native CLBeaconRegion initWithProximityUUIDMajorMinorIdentifier(@NotNull NSUUID proximityUUID, char major,
            char minor, @NotNull String identifier);

    /**
     * major
     * 
     * Discussion:
     * Most significant value associated with the region. If a major value wasn't specified, this will be nil.
     */
    @Nullable
    @Generated
    @Selector("major")
    public native NSNumber major();

    /**
     * minor
     * 
     * Discussion:
     * Least significant value associated with the region. If a minor value wasn't specified, this will be nil.
     */
    @Nullable
    @Generated
    @Selector("minor")
    public native NSNumber minor();

    /**
     * notifyEntryStateOnDisplay
     * 
     * Discussion:
     * App will be launched and the delegate will be notified via locationManager:didDetermineState:forRegion:
     * when the device's screen is turned on and the user is in the region. By default, this is NO.
     */
    @Generated
    @Selector("notifyEntryStateOnDisplay")
    public native boolean notifyEntryStateOnDisplay();

    /**
     * peripheralDataWithMeasuredPower:
     * 
     * Discussion:
     * This dictionary can be used to advertise the current device as a beacon when
     * used in conjunction with CoreBluetooth's CBPeripheralManager startAdvertising: method.
     * The dictionary will contain data that represents the current region in addition to a measured power value.
     * 
     * measuredPower is the RSSI of the device observed from one meter in its intended environment.
     * This value is optional, but should be specified to achieve the best ranging performance.
     * If not specified, it will default to a pre-determined value for the device.
     */
    @NotNull
    @Generated
    @Selector("peripheralDataWithMeasuredPower:")
    public native NSMutableDictionary<String, Object> peripheralDataWithMeasuredPower(@Nullable NSNumber measuredPower);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 13.0
     */
    @NotNull
    @Deprecated
    @Generated
    @Selector("proximityUUID")
    public native NSUUID proximityUUID();

    /**
     * notifyEntryStateOnDisplay
     * 
     * Discussion:
     * App will be launched and the delegate will be notified via locationManager:didDetermineState:forRegion:
     * when the device's screen is turned on and the user is in the region. By default, this is NO.
     */
    @Generated
    @Selector("setNotifyEntryStateOnDisplay:")
    public native void setNotifyEntryStateOnDisplay(boolean value);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("UUID")
    public native NSUUID UUID();

    /**
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("beaconIdentityConstraint")
    public native CLBeaconIdentityConstraint beaconIdentityConstraint();

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("initWithBeaconIdentityConstraint:identifier:")
    public native CLBeaconRegion initWithBeaconIdentityConstraintIdentifier(
            @NotNull CLBeaconIdentityConstraint beaconIdentityConstraint, @NotNull String identifier);

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("initWithUUID:identifier:")
    public native CLBeaconRegion initWithUUIDIdentifier(@NotNull NSUUID uuid, @NotNull String identifier);

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("initWithUUID:major:identifier:")
    public native CLBeaconRegion initWithUUIDMajorIdentifier(@NotNull NSUUID uuid, char major,
            @NotNull String identifier);

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("initWithUUID:major:minor:identifier:")
    public native CLBeaconRegion initWithUUIDMajorMinorIdentifier(@NotNull NSUUID uuid, char major, char minor,
            @NotNull String identifier);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
