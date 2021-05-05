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

package apple.intents;

import apple.NSObject;
import apple.corelocation.CLPlacemark;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSDate;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSUserActivity;
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

@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class INRideStatus extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected INRideStatus(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native INRideStatus alloc();

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

    /**
     * These actions may be available for the user to choose during the ride.
     * When shown, the .title of each activity will presented to the user. Selecting an activity will open your application to continue it.
     */
    @Generated
    @Selector("additionalActionActivities")
    public native NSArray<? extends NSUserActivity> additionalActionActivities();

    /**
     * This property should be set if the phase is INRidePhaseCompleted.
     */
    @Generated
    @Selector("completionStatus")
    public native INRideCompletionStatus completionStatus();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("driver")
    public native INRideDriver driver();

    @Generated
    @Selector("dropOffLocation")
    public native CLPlacemark dropOffLocation();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("estimatedDropOffDate")
    public native NSDate estimatedDropOffDate();

    @Generated
    @Selector("estimatedPickupDate")
    public native NSDate estimatedPickupDate();

    /**
     * This is the date after arrival at the pickup location after which the ride may stop waiting for the passenger to be picked up.
     * The passenger is expected to arrive at pickup before this date.
     */
    @Generated
    @Selector("estimatedPickupEndDate")
    public native NSDate estimatedPickupEndDate();

    @Generated
    @Selector("init")
    public native INRideStatus init();

    @Generated
    @Selector("initWithCoder:")
    public native INRideStatus initWithCoder(NSCoder coder);

    @Generated
    @Selector("phase")
    @NInt
    public native long phase();

    @Generated
    @Selector("pickupLocation")
    public native CLPlacemark pickupLocation();

    @Generated
    @Selector("rideIdentifier")
    public native String rideIdentifier();

    @Generated
    @Selector("rideOption")
    public native INRideOption rideOption();

    /**
     * These actions may be available for the user to choose during the ride.
     * When shown, the .title of each activity will presented to the user. Selecting an activity will open your application to continue it.
     */
    @Generated
    @Selector("setAdditionalActionActivities:")
    public native void setAdditionalActionActivities(NSArray<? extends NSUserActivity> value);

    /**
     * This property should be set if the phase is INRidePhaseCompleted.
     */
    @Generated
    @Selector("setCompletionStatus:")
    public native void setCompletionStatus(INRideCompletionStatus value);

    @Generated
    @Selector("setDriver:")
    public native void setDriver(INRideDriver value);

    @Generated
    @Selector("setDropOffLocation:")
    public native void setDropOffLocation(CLPlacemark value);

    @Generated
    @Selector("setEstimatedDropOffDate:")
    public native void setEstimatedDropOffDate(NSDate value);

    @Generated
    @Selector("setEstimatedPickupDate:")
    public native void setEstimatedPickupDate(NSDate value);

    /**
     * This is the date after arrival at the pickup location after which the ride may stop waiting for the passenger to be picked up.
     * The passenger is expected to arrive at pickup before this date.
     */
    @Generated
    @Selector("setEstimatedPickupEndDate:")
    public native void setEstimatedPickupEndDate(NSDate value);

    @Generated
    @Selector("setPhase:")
    public native void setPhase(@NInt long value);

    @Generated
    @Selector("setPickupLocation:")
    public native void setPickupLocation(CLPlacemark value);

    @Generated
    @Selector("setRideIdentifier:")
    public native void setRideIdentifier(String value);

    @Generated
    @Selector("setRideOption:")
    public native void setRideOption(INRideOption value);

    /**
     * If set, and the ride hasn't completed or been canceled yet, the system may open the containing application and request continuation of this activity to request that the ride be canceled. It is appropriate to show confirmation UI to the user when this happens.
     */
    @Generated
    @Selector("setUserActivityForCancelingInApplication:")
    public native void setUserActivityForCancelingInApplication(NSUserActivity value);

    @Generated
    @Selector("setVehicle:")
    public native void setVehicle(INRideVehicle value);

    @Generated
    @Selector("setWaypoints:")
    public native void setWaypoints(NSArray<? extends CLPlacemark> value);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * If set, and the ride hasn't completed or been canceled yet, the system may open the containing application and request continuation of this activity to request that the ride be canceled. It is appropriate to show confirmation UI to the user when this happens.
     */
    @Generated
    @Selector("userActivityForCancelingInApplication")
    public native NSUserActivity userActivityForCancelingInApplication();

    @Generated
    @Selector("vehicle")
    public native INRideVehicle vehicle();

    @Generated
    @Selector("waypoints")
    public native NSArray<? extends CLPlacemark> waypoints();

    /**
     * Time range for the scheduled pickup.
     */
    @Generated
    @Selector("scheduledPickupTime")
    public native INDateComponentsRange scheduledPickupTime();

    /**
     * Time range for the scheduled pickup.
     */
    @Generated
    @Selector("setScheduledPickupTime:")
    public native void setScheduledPickupTime(INDateComponentsRange value);
}
