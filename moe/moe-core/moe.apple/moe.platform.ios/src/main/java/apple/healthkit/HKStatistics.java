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
import apple.foundation.NSDate;
import apple.foundation.NSDateInterval;
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

/**
 * HKStatistics
 * <p>
 * Represents statistics for quantity samples over a period of time.
 */
@Generated
@Library("HealthKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class HKStatistics extends NSObject implements NSSecureCoding, NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected HKStatistics(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native HKStatistics alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native HKStatistics allocWithZone(VoidPtr zone);

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
    public static native HKStatistics new_objc();

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
     * averageQuantity
     * <p>
     * Returns the average quantity in the time period represented by the receiver.
     */
    @Generated
    @Selector("averageQuantity")
    public native HKQuantity averageQuantity();

    /**
     * averageQuantityForSource:
     * <p>
     * Returns the average quantity for the given source in the time period represented by the receiver.
     * <p>
     * If HKStatisticsOptionSeparateBySource is not specified, then this will always be nil.
     */
    @Generated
    @Selector("averageQuantityForSource:")
    public native HKQuantity averageQuantityForSource(HKSource source);

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("endDate")
    public native NSDate endDate();

    @Generated
    @Selector("init")
    public native HKStatistics init();

    @Generated
    @Selector("initWithCoder:")
    public native HKStatistics initWithCoder(NSCoder coder);

    /**
     * maximumQuantity
     * <p>
     * Returns the maximum quantity in the time period represented by the receiver.
     */
    @Generated
    @Selector("maximumQuantity")
    public native HKQuantity maximumQuantity();

    /**
     * maximumQuantityForSource:
     * <p>
     * Returns the maximum quantity for the given source in the time period represented by the receiver.
     * <p>
     * If HKStatisticsOptionSeparateBySource is not specified, then this will always be nil.
     */
    @Generated
    @Selector("maximumQuantityForSource:")
    public native HKQuantity maximumQuantityForSource(HKSource source);

    /**
     * minimumQuantity
     * <p>
     * Returns the minimum quantity in the time period represented by the receiver.
     */
    @Generated
    @Selector("minimumQuantity")
    public native HKQuantity minimumQuantity();

    /**
     * minimumQuantityForSource:
     * <p>
     * Returns the minimum quantity for the given source in the time period represented by the receiver.
     * <p>
     * If HKStatisticsOptionSeparateBySource is not specified, then this will always be nil.
     */
    @Generated
    @Selector("minimumQuantityForSource:")
    public native HKQuantity minimumQuantityForSource(HKSource source);

    @Generated
    @Selector("quantityType")
    public native HKQuantityType quantityType();

    @Generated
    @Selector("sources")
    public native NSArray<? extends HKSource> sources();

    @Generated
    @Selector("startDate")
    public native NSDate startDate();

    /**
     * sumQuantity
     * <p>
     * Returns the sum of quantities in the time period represented by the receiver.
     */
    @Generated
    @Selector("sumQuantity")
    public native HKQuantity sumQuantity();

    /**
     * sumQuantityForSource:
     * <p>
     * Returns the sum quantity for the given source in the time period represented by the receiver.
     * <p>
     * If HKStatisticsOptionSeparateBySource is not specified, then this will always be nil.
     */
    @Generated
    @Selector("sumQuantityForSource:")
    public native HKQuantity sumQuantityForSource(HKSource source);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * Total duration (in seconds) covered by the samples represented by these statistics.
     * Only present if HKStatisticsOptionDuration is is specified.
     * <p>
     * duration
     * <p>
     * Total duration, as a time-unit compatible quantity, covered by the samples represented by these statistics.
     * <p>
     * Only present if HKStatisticsOptionDuration is is specified.
     */
    @Generated
    @Selector("duration")
    public native HKQuantity duration();

    /**
     * durationForSource:
     * <p>
     * Returns the duration, as a time-unit compatible quantity, for the given source in the time period represented by the receiver.
     * <p>
     * If HKStatisticsOptionSeparateBySource is not specified, then this will always be nil.
     */
    @Generated
    @Selector("durationForSource:")
    public native HKQuantity durationForSource(HKSource source);

    /**
     * mostRecentQuantity
     * <p>
     * Returns the most recent quantity in the time period represented by the receiver.
     */
    @Generated
    @Selector("mostRecentQuantity")
    public native HKQuantity mostRecentQuantity();

    /**
     * mostRecentQuantityDateInterval
     * <p>
     * Returns the date interval of the most recent quantity in the time period represented by the receiver.
     */
    @Generated
    @Selector("mostRecentQuantityDateInterval")
    public native NSDateInterval mostRecentQuantityDateInterval();

    /**
     * mostRecentQuantityDateIntervalForSource:
     * <p>
     * Returns the date interval of the most recent quantity for the given source in the time period
     * represented by the receiver.
     * <p>
     * If HKStatisticsOptionSeparateBySource is not specified, then this will always be nil.
     */
    @Generated
    @Selector("mostRecentQuantityDateIntervalForSource:")
    public native NSDateInterval mostRecentQuantityDateIntervalForSource(HKSource source);

    /**
     * mostRecentQuantityForSource:
     * <p>
     * Returns the most recent quantity for the given source in the time period represented by the receiver.
     * <p>
     * If HKStatisticsOptionSeparateBySource is not specified, then this will always be nil.
     */
    @Generated
    @Selector("mostRecentQuantityForSource:")
    public native HKQuantity mostRecentQuantityForSource(HKSource source);
}
