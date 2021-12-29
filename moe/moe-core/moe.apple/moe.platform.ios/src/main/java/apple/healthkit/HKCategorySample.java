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
 * HKCategorySample
 * <p>
 * An HKObject subclass representing an category measurement
 * <p>
 * Category samples are samples that can be categorized into an enum of concrete values
 */
@Generated
@Library("HealthKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class HKCategorySample extends HKSample {
    static {
        NatJ.register();
    }

    @Generated
    protected HKCategorySample(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native HKCategorySample alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native HKCategorySample allocWithZone(VoidPtr zone);

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

    /**
     * categorySampleWithType:value:startDate:endDate:
     * <p>
     * Creates a new HKCategorySample.
     *
     * @param type      The type of the sample.
     * @param value     The enumeration value for the sample. See HKCategoryTypeIdentifier for appropriate value.
     * @param startDate The start date of the sample.
     * @param endDate   The end date of the sample.
     */
    @Generated
    @Selector("categorySampleWithType:value:startDate:endDate:")
    public static native HKCategorySample categorySampleWithTypeValueStartDateEndDate(HKCategoryType type,
            @NInt long value, NSDate startDate, NSDate endDate);

    /**
     * categorySampleWithType:value:startDate:endDate:device:metadata:
     * <p>
     * Creates a new HKCategorySample.
     *
     * @param type      The type of the sample.
     * @param value     The enumeration value for the sample. See HKCategoryTypeIdentifier for appropriate value.
     * @param startDate The start date of the sample.
     * @param endDate   The end date of the sample.
     * @param device    The HKDevice that generated the sample (optional).
     * @param metadata  Metadata for the sample (optional).
     */
    @Generated
    @Selector("categorySampleWithType:value:startDate:endDate:device:metadata:")
    public static native HKCategorySample categorySampleWithTypeValueStartDateEndDateDeviceMetadata(HKCategoryType type,
            @NInt long value, NSDate startDate, NSDate endDate, HKDevice device, NSDictionary<String, ?> metadata);

    /**
     * categorySampleWithType:value:startDate:endDate:metadata:
     * <p>
     * Creates a new HKCategorySample.
     *
     * @param type      The type of the sample.
     * @param value     The enumeration value for the sample. See HKCategoryTypeIdentifier for appropriate value.
     * @param startDate The start date of the sample.
     * @param endDate   The end date of the sample.
     * @param metadata  Metadata for the sample (optional).
     */
    @Generated
    @Selector("categorySampleWithType:value:startDate:endDate:metadata:")
    public static native HKCategorySample categorySampleWithTypeValueStartDateEndDateMetadata(HKCategoryType type,
            @NInt long value, NSDate startDate, NSDate endDate, NSDictionary<String, ?> metadata);

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
    public static native HKCategorySample new_objc();

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
    @Selector("categoryType")
    public native HKCategoryType categoryType();

    @Generated
    @Selector("init")
    public native HKCategorySample init();

    @Generated
    @Selector("initWithCoder:")
    public native HKCategorySample initWithCoder(NSCoder coder);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * [@property]   value
     * <p>
     * The preferred enum for the value is determined by the receiver's category type.
     */
    @Generated
    @Selector("value")
    @NInt
    public native long value();
}
