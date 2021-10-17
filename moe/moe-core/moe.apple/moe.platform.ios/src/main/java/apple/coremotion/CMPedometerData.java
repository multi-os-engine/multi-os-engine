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

package apple.coremotion;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSDate;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
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

/**
 * CMPedometerData
 * <p>
 * Discussion:
 * A description of the user's pedestrian activity. At a minimum this
 * object contains a step count. On supported platforms it also contains
 * distance, flights of stairs, pace, and cadence.
 */
@Generated
@Library("CoreMotion")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CMPedometerData extends NSObject implements NSSecureCoding, NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected CMPedometerData(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CMPedometerData alloc();

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
     * averageActivePace
     * <p>
     * <p>
     * Discussion:
     * <p>
     * For updates this returns the average active pace since
     * startPedometerUpdatesFromDate:withHandler:, in s/m (seconds per meter).
     * For historical queries this returns average active pace between startDate
     * and endDate. The average active pace omits the non-active time, giving
     * the average pace from when the user was moving. Value is nil if any of
     * the following are true:
     * <p>
     * (1) (For historical queries) this information is not available,
     * e.g. the user did not move between startDate and endDate;
     * (2) Unsupported platform.
     */
    @Generated
    @Selector("averageActivePace")
    public native NSNumber averageActivePace();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * currentCadence
     * <p>
     * <p>
     * Discussion:
     * For updates this returns the rate at which steps are taken, in steps per second.
     * Value is nil if any of the following are true:
     * <p>
     * (1) Information not yet available;
     * (2) Historical query;
     * (3) Unsupported platform.
     */
    @Generated
    @Selector("currentCadence")
    public native NSNumber currentCadence();

    /**
     * currentPace
     * <p>
     * <p>
     * Discussion:
     * For updates this returns the current pace, in s/m (seconds per meter).
     * Value is nil if any of the following are true:
     * <p>
     * (1) Information not yet available;
     * (2) Historical query;
     * (3) Unsupported platform.
     */
    @Generated
    @Selector("currentPace")
    public native NSNumber currentPace();

    /**
     * distance
     * <p>
     * Discussion:
     * Estimated distance in meters traveled by the user while walking and
     * running. Value is nil unsupported platforms.
     */
    @Generated
    @Selector("distance")
    public native NSNumber distance();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    /**
     * endDate
     * <p>
     * Discussion:
     * The end time of the period for which the pedometer data is valid.
     * <p>
     * For updates this is the time for the most recent update. For historical
     * queries this is the end time requested.
     */
    @Generated
    @Selector("endDate")
    public native NSDate endDate();

    /**
     * floorsAscended
     * <p>
     * Discussion:
     * Approximate number of floors ascended by way of stairs. Value is nil
     * on unsupported platforms.
     */
    @Generated
    @Selector("floorsAscended")
    public native NSNumber floorsAscended();

    /**
     * floorsDescended
     * <p>
     * Discussion:
     * Approximate number of floors descended by way of stairs. Value is nil
     * on unsupported platforms.
     */
    @Generated
    @Selector("floorsDescended")
    public native NSNumber floorsDescended();

    @Generated
    @Selector("init")
    public native CMPedometerData init();

    @Generated
    @Selector("initWithCoder:")
    public native CMPedometerData initWithCoder(NSCoder coder);

    /**
     * numberOfSteps
     * <p>
     * Discussion:
     * Number of steps taken by the user.
     */
    @Generated
    @Selector("numberOfSteps")
    public native NSNumber numberOfSteps();

    /**
     * startDate
     * <p>
     * Discussion:
     * The start time of the period for which the pedometer data is valid.
     * <p>
     * This is the start time requested for the session or historical query.
     */
    @Generated
    @Selector("startDate")
    public native NSDate startDate();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}
