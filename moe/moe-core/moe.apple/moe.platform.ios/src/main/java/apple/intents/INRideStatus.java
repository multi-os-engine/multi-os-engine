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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 10.0
 */
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

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native INRideStatus allocWithZone(VoidPtr zone);

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
    public static native INRideStatus new_objc();

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
     * When shown, the .title of each activity will presented to the user. Selecting an activity will open your
     * application to continue it.
     */
    @Nullable
    @Generated
    @Selector("additionalActionActivities")
    public native NSArray<? extends NSUserActivity> additionalActionActivities();

    /**
     * This property should be set if the phase is INRidePhaseCompleted.
     */
    @Nullable
    @Generated
    @Selector("completionStatus")
    public native INRideCompletionStatus completionStatus();

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Nullable
    @Generated
    @Selector("driver")
    public native INRideDriver driver();

    @Nullable
    @Generated
    @Selector("dropOffLocation")
    public native CLPlacemark dropOffLocation();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Nullable
    @Generated
    @Selector("estimatedDropOffDate")
    public native NSDate estimatedDropOffDate();

    @Nullable
    @Generated
    @Selector("estimatedPickupDate")
    public native NSDate estimatedPickupDate();

    /**
     * This is the date after arrival at the pickup location after which the ride may stop waiting for the passenger to
     * be picked up.
     * The passenger is expected to arrive at pickup before this date.
     */
    @Nullable
    @Generated
    @Selector("estimatedPickupEndDate")
    public native NSDate estimatedPickupEndDate();

    @Generated
    @Selector("init")
    public native INRideStatus init();

    @Generated
    @Selector("initWithCoder:")
    public native INRideStatus initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("phase")
    @NInt
    public native long phase();

    @Nullable
    @Generated
    @Selector("pickupLocation")
    public native CLPlacemark pickupLocation();

    @Nullable
    @Generated
    @Selector("rideIdentifier")
    public native String rideIdentifier();

    @Nullable
    @Generated
    @Selector("rideOption")
    public native INRideOption rideOption();

    /**
     * These actions may be available for the user to choose during the ride.
     * When shown, the .title of each activity will presented to the user. Selecting an activity will open your
     * application to continue it.
     */
    @Generated
    @Selector("setAdditionalActionActivities:")
    public native void setAdditionalActionActivities(@Nullable NSArray<? extends NSUserActivity> value);

    /**
     * This property should be set if the phase is INRidePhaseCompleted.
     */
    @Generated
    @Selector("setCompletionStatus:")
    public native void setCompletionStatus(@Nullable INRideCompletionStatus value);

    @Generated
    @Selector("setDriver:")
    public native void setDriver(@Nullable INRideDriver value);

    @Generated
    @Selector("setDropOffLocation:")
    public native void setDropOffLocation(@Nullable CLPlacemark value);

    @Generated
    @Selector("setEstimatedDropOffDate:")
    public native void setEstimatedDropOffDate(@Nullable NSDate value);

    @Generated
    @Selector("setEstimatedPickupDate:")
    public native void setEstimatedPickupDate(@Nullable NSDate value);

    /**
     * This is the date after arrival at the pickup location after which the ride may stop waiting for the passenger to
     * be picked up.
     * The passenger is expected to arrive at pickup before this date.
     */
    @Generated
    @Selector("setEstimatedPickupEndDate:")
    public native void setEstimatedPickupEndDate(@Nullable NSDate value);

    @Generated
    @Selector("setPhase:")
    public native void setPhase(@NInt long value);

    @Generated
    @Selector("setPickupLocation:")
    public native void setPickupLocation(@Nullable CLPlacemark value);

    @Generated
    @Selector("setRideIdentifier:")
    public native void setRideIdentifier(@Nullable String value);

    @Generated
    @Selector("setRideOption:")
    public native void setRideOption(@Nullable INRideOption value);

    /**
     * If set, and the ride hasn't completed or been canceled yet, the system may open the containing application and
     * request continuation of this activity to request that the ride be canceled. It is appropriate to show
     * confirmation UI to the user when this happens.
     */
    @Generated
    @Selector("setUserActivityForCancelingInApplication:")
    public native void setUserActivityForCancelingInApplication(@Nullable NSUserActivity value);

    @Generated
    @Selector("setVehicle:")
    public native void setVehicle(@Nullable INRideVehicle value);

    @Generated
    @Selector("setWaypoints:")
    public native void setWaypoints(@Nullable NSArray<? extends CLPlacemark> value);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * If set, and the ride hasn't completed or been canceled yet, the system may open the containing application and
     * request continuation of this activity to request that the ride be canceled. It is appropriate to show
     * confirmation UI to the user when this happens.
     */
    @Nullable
    @Generated
    @Selector("userActivityForCancelingInApplication")
    public native NSUserActivity userActivityForCancelingInApplication();

    @Nullable
    @Generated
    @Selector("vehicle")
    public native INRideVehicle vehicle();

    @Nullable
    @Generated
    @Selector("waypoints")
    public native NSArray<? extends CLPlacemark> waypoints();

    /**
     * Time range for the scheduled pickup.
     * 
     * API-Since: 10.3
     */
    @Nullable
    @Generated
    @Selector("scheduledPickupTime")
    public native INDateComponentsRange scheduledPickupTime();

    /**
     * Time range for the scheduled pickup.
     * 
     * API-Since: 10.3
     */
    @Generated
    @Selector("setScheduledPickupTime:")
    public native void setScheduledPickupTime(@Nullable INDateComponentsRange value);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
