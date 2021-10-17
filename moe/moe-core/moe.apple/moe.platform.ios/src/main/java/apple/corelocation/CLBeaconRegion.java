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

/**
 * CLBeaconRegion
 * <p>
 * Discussion:
 * A region containing similar beacons.
 * <p>
 * Such a region can be defined by UUID, major and minor values.
 * UUID must be specified. If only UUID is specified, the major and
 * minor values will be wildcarded and the region will match any
 * beacons with the same UUID. Similarly if only UUID and major
 * value are specified, the minor value will be wildcarded and the
 * region will match against any beacons with the same UUID and
 * major value.
 */
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
            double radius, String identifier);

    @Generated
    @Selector("initWithCoder:")
    public native CLBeaconRegion initWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithProximityUUID:identifier:")
    public native CLBeaconRegion initWithProximityUUIDIdentifier(NSUUID proximityUUID, String identifier);

    @Generated
    @Selector("initWithProximityUUID:major:identifier:")
    public native CLBeaconRegion initWithProximityUUIDMajorIdentifier(NSUUID proximityUUID, char major,
            String identifier);

    @Generated
    @Selector("initWithProximityUUID:major:minor:identifier:")
    public native CLBeaconRegion initWithProximityUUIDMajorMinorIdentifier(NSUUID proximityUUID, char major, char minor,
            String identifier);

    /**
     * major
     * <p>
     * Discussion:
     * Most significant value associated with the region. If a major value wasn't specified, this will be nil.
     */
    @Generated
    @Selector("major")
    public native NSNumber major();

    /**
     * minor
     * <p>
     * Discussion:
     * Least significant value associated with the region. If a minor value wasn't specified, this will be nil.
     */
    @Generated
    @Selector("minor")
    public native NSNumber minor();

    /**
     * notifyEntryStateOnDisplay
     * <p>
     * Discussion:
     * App will be launched and the delegate will be notified via locationManager:didDetermineState:forRegion:
     * when the device's screen is turned on and the user is in the region. By default, this is NO.
     */
    @Generated
    @Selector("notifyEntryStateOnDisplay")
    public native boolean notifyEntryStateOnDisplay();

    /**
     * peripheralDataWithMeasuredPower:
     * <p>
     * Discussion:
     * This dictionary can be used to advertise the current device as a beacon when
     * used in conjunction with CoreBluetooth's CBPeripheralManager startAdvertising: method.
     * The dictionary will contain data that represents the current region in addition to a measured power value.
     * <p>
     * measuredPower is the RSSI of the device observed from one meter in its intended environment.
     * This value is optional, but should be specified to achieve the best ranging performance.
     * If not specified, it will default to a pre-determined value for the device.
     */
    @Generated
    @Selector("peripheralDataWithMeasuredPower:")
    public native NSMutableDictionary<String, Object> peripheralDataWithMeasuredPower(NSNumber measuredPower);

    @Generated
    @Selector("proximityUUID")
    public native NSUUID proximityUUID();

    /**
     * notifyEntryStateOnDisplay
     * <p>
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
     * UUID
     * <p>
     * Discussion:
     * UUID associated with the region.
     */
    @Generated
    @Selector("UUID")
    public native NSUUID UUID();

    /**
     * beaconIdentityConstraint
     * <p>
     * Discussion:
     * Returns a CLBeaconIdentityConstraint describing the beacons this region monitors.
     */
    @Generated
    @Selector("beaconIdentityConstraint")
    public native CLBeaconIdentityConstraint beaconIdentityConstraint();

    /**
     * initWithBeaconIdentityConstraint:identifier:
     * <p>
     * Discussion:
     * Initialize a beacon region described by a beacon identity
     * constraint.
     */
    @Generated
    @Selector("initWithBeaconIdentityConstraint:identifier:")
    public native CLBeaconRegion initWithBeaconIdentityConstraintIdentifier(
            CLBeaconIdentityConstraint beaconIdentityConstraint, String identifier);

    /**
     * initWithUUID:identifier:
     * <p>
     * Discussion:
     * Initialize a beacon region with a UUID. Major and minor values will be wildcarded.
     */
    @Generated
    @Selector("initWithUUID:identifier:")
    public native CLBeaconRegion initWithUUIDIdentifier(NSUUID uuid, String identifier);

    /**
     * initWithUUID:major:identifier:
     * <p>
     * Discussion:
     * Initialize a beacon region with a UUID and major value. Minor value will be wildcarded.
     */
    @Generated
    @Selector("initWithUUID:major:identifier:")
    public native CLBeaconRegion initWithUUIDMajorIdentifier(NSUUID uuid, char major, String identifier);

    /**
     * initWithUUID:major:minor:identifier:
     * <p>
     * Discussion:
     * Initialize a beacon region identified by a UUID, major and minor values.
     */
    @Generated
    @Selector("initWithUUID:major:minor:identifier:")
    public native CLBeaconRegion initWithUUIDMajorMinorIdentifier(NSUUID uuid, char major, char minor,
            String identifier);
}
