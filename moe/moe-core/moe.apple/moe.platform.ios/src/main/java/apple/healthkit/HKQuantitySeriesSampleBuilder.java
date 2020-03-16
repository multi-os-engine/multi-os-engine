package apple.healthkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDate;
import apple.foundation.NSDateInterval;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("HealthKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class HKQuantitySeriesSampleBuilder extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected HKQuantitySeriesSampleBuilder(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native HKQuantitySeriesSampleBuilder alloc();

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
    @Selector("device")
    public native HKDevice device();

    @Generated
    @Selector("discard")
    public native void discard();

    @Generated
    @Selector("finishSeriesWithMetadata:completion:")
    public native void finishSeriesWithMetadataCompletion(NSDictionary<String, ?> metadata,
            @ObjCBlock(name = "call_finishSeriesWithMetadataCompletion") Block_finishSeriesWithMetadataCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_finishSeriesWithMetadataCompletion {
        @Generated
        void call_finishSeriesWithMetadataCompletion(NSArray<? extends HKQuantitySample> arg0, NSError arg1);
    }

    @Generated
    @Selector("finishSeriesWithMetadata:endDate:completion:")
    public native void finishSeriesWithMetadataEndDateCompletion(NSDictionary<String, ?> metadata, NSDate endDate,
            @ObjCBlock(name = "call_finishSeriesWithMetadataEndDateCompletion") Block_finishSeriesWithMetadataEndDateCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_finishSeriesWithMetadataEndDateCompletion {
        @Generated
        void call_finishSeriesWithMetadataEndDateCompletion(NSArray<? extends HKQuantitySample> arg0, NSError arg1);
    }

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native HKQuantitySeriesSampleBuilder init();

    @Generated
    @Selector("initWithHealthStore:quantityType:startDate:device:")
    public native HKQuantitySeriesSampleBuilder initWithHealthStoreQuantityTypeStartDateDevice(
            HKHealthStore healthStore, HKQuantityType quantityType, NSDate startDate, HKDevice device);

    @Generated
    @Selector("insertQuantity:date:error:")
    public native boolean insertQuantityDateError(HKQuantity quantity, NSDate date,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("insertQuantity:dateInterval:error:")
    public native boolean insertQuantityDateIntervalError(HKQuantity quantity, NSDateInterval dateInterval,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

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
    @Selector("quantityType")
    public native HKQuantityType quantityType();

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
    @Selector("startDate")
    public native NSDate startDate();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}