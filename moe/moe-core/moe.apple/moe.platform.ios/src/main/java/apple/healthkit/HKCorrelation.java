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
 * HKCorrelation
 * <p>
 * An HKCorrelation is a collection of correlated objects.
 * <p>
 * When multiple readings are taken together, it may be beneficial to correlate them so that they can be
 * displayed together and share common metadata about how they were created.
 * <p>
 * For example, systolic and diastolic blood pressure readings are typically presented together so these
 * readings should be saved with a correlation of type blood pressure.
 */
@Generated
@Library("HealthKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class HKCorrelation extends HKSample {
    static {
        NatJ.register();
    }

    @Generated
    protected HKCorrelation(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native HKCorrelation alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native HKCorrelation allocWithZone(VoidPtr zone);

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

    /**
     * correlationWithType:startDate:endDate:objects:
     * <p>
     * Creates a new HKCorrelation with the given type, start date, end date, and objects.
     * <p>
     * objects must be a set of HKQuantitySamples and HKCategorySamples
     */
    @Generated
    @Selector("correlationWithType:startDate:endDate:objects:")
    public static native HKCorrelation correlationWithTypeStartDateEndDateObjects(HKCorrelationType correlationType,
            NSDate startDate, NSDate endDate, NSSet<? extends HKSample> objects);

    /**
     * correlationWithType:startDate:endDate:objects:device:metadata:
     * <p>
     * Creates a new HKCorrelation with the given type, start date, end date, objects, and metadata.
     * <p>
     * objects must be a set of HKQuantitySamples and HKCategorySamples
     *
     * @param correlationType The correlation type of the objects set.
     * @param startDate       The start date of the correlation.
     * @param endDate         The end date of the correlation.
     * @param device          The HKDevice that generated the samples (optional).
     * @param metadata        Metadata for the correlation (optional).
     */
    @Generated
    @Selector("correlationWithType:startDate:endDate:objects:device:metadata:")
    public static native HKCorrelation correlationWithTypeStartDateEndDateObjectsDeviceMetadata(
            HKCorrelationType correlationType, NSDate startDate, NSDate endDate, NSSet<? extends HKSample> objects,
            HKDevice device, NSDictionary<String, ?> metadata);

    /**
     * correlationWithType:startDate:endDate:objects:metadata:
     * <p>
     * Creates a new HKCorrelation with the given type, start date, end date, objects, and metadata.
     * <p>
     * objects must be a set of HKQuantitySamples and HKCategorySamples
     */
    @Generated
    @Selector("correlationWithType:startDate:endDate:objects:metadata:")
    public static native HKCorrelation correlationWithTypeStartDateEndDateObjectsMetadata(
            HKCorrelationType correlationType, NSDate startDate, NSDate endDate, NSSet<? extends HKSample> objects,
            NSDictionary<String, ?> metadata);

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
    public static native HKCorrelation new_objc();

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
    @Selector("correlationType")
    public native HKCorrelationType correlationType();

    @Generated
    @Selector("init")
    public native HKCorrelation init();

    @Generated
    @Selector("initWithCoder:")
    public native HKCorrelation initWithCoder(NSCoder coder);

    /**
     * [@property] objects
     * <p>
     * A set of HKSamples containing all of the objects that were saved with the receiver.
     */
    @Generated
    @Selector("objects")
    public native NSSet<? extends HKSample> objects();

    /**
     * objectsForType:
     * <p>
     * Returns the set of correlated objects with the specified type.
     */
    @Generated
    @Selector("objectsForType:")
    public native NSSet<? extends HKSample> objectsForType(HKObjectType objectType);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}
