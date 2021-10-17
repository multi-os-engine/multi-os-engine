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
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
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

/**
 * HKQuantitySample
 * <p>
 * An abstract HKSample subclass representing a quantity measurement.
 */
@Generated
@Library("HealthKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class HKQuantitySample extends HKSample {
    static {
        NatJ.register();
    }

    @Generated
    protected HKQuantitySample(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native HKQuantitySample alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native HKQuantitySample allocWithZone(VoidPtr zone);

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
    public static native HKQuantitySample new_objc();

    /**
     * quantitySampleWithType:quantity:startDate:endDate:
     * <p>
     * Creates a new HKQuantitySample with the given type, quantity, start date, and end date.
     * <p>
     * The quantity must have a unit that is compatible with the given quantity type.
     * See -[HKQuantityType isCompatibleWithUnit:].
     */
    @Generated
    @Selector("quantitySampleWithType:quantity:startDate:endDate:")
    public static native HKQuantitySample quantitySampleWithTypeQuantityStartDateEndDate(HKQuantityType quantityType,
            HKQuantity quantity, NSDate startDate, NSDate endDate);

    /**
     * quantitySampleWithType:quantity:startDate:endDate:device:metadata:
     * <p>
     * Creates a new HKQuantitySample with the given type, quantity, start date, end date, and metadata.
     * <p>
     * The quantity must have a unit that is compatible with the given quantity type.
     * See -[HKQuantityType isCompatibleWithUnit:].
     *
     * @param quantityType The type of the sample.
     * @param startDate    The start date of the sample.
     * @param endDate      The end date of the sample.
     * @param device       The HKDevice that generated the sample (optional).
     * @param metadata     Metadata for the sample (optional).
     */
    @Generated
    @Selector("quantitySampleWithType:quantity:startDate:endDate:device:metadata:")
    public static native HKQuantitySample quantitySampleWithTypeQuantityStartDateEndDateDeviceMetadata(
            HKQuantityType quantityType, HKQuantity quantity, NSDate startDate, NSDate endDate, HKDevice device,
            NSDictionary<String, ?> metadata);

    /**
     * quantitySampleWithType:quantity:startDate:endDate:metadata:
     * <p>
     * Creates a new HKQuantitySample with the given type, quantity, start date, end date, and metadata.
     * <p>
     * The quantity must have a unit that is compatible with the given quantity type.
     * See -[HKQuantityType isCompatibleWithUnit:].
     */
    @Generated
    @Selector("quantitySampleWithType:quantity:startDate:endDate:metadata:")
    public static native HKQuantitySample quantitySampleWithTypeQuantityStartDateEndDateMetadata(
            HKQuantityType quantityType, HKQuantity quantity, NSDate startDate, NSDate endDate,
            NSDictionary<String, ?> metadata);

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
    public native HKQuantitySample init();

    @Generated
    @Selector("initWithCoder:")
    public native HKQuantitySample initWithCoder(NSCoder coder);

    @Generated
    @Selector("quantity")
    public native HKQuantity quantity();

    @Generated
    @Selector("quantityType")
    public native HKQuantityType quantityType();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * [@property]      count
     * <p>
     * The number of individual values making up the receiver's quantity.
     * <p>
     * Requests for the individual series quantities can be made using HKQuantitySeriesSampleQuery.
     */
    @Generated
    @Selector("count")
    @NInt
    public native long count();
}
