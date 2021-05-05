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

/**
 * HKQuantitySeriesSampleBuilder
 * 
 * An HKQuantitySeriesSampleBuilder is used to generate HKQuantitySample(s) with multiple
 *                quantities.
 * 
 * An HKQuantitySeriesSampleBuilder is used to incrementally create a new quantity series
 *                sample in the HealthKit database. This class may be used to create long-running quantity
 *                series samples that are associated with an activity like a workout. After inserting each
 *                of the quantities that make up the series, the series may be finalized by calling
 *                -finishSeriesWithMetadata:completion:. Calling -discard invalidates the series and
 *                discards any data that was previously associated with it.
 */
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

    /**
     * [@property]      device
     */
    @Generated
    @Selector("device")
    public native HKDevice device();

    /**
     * discard
     * 
     * Discards all previously inserted data and invalidates the series.
     * 
     * Calling this method will delete all quantities that were previously inserted into
     *                    the series and invalidate the receiver. Calling other methods on the receiver
     *                    after calling -discard will result in an exception.
     */
    @Generated
    @Selector("discard")
    public native void discard();

    /**
     * finishSeriesWithMetadata:completion:
     * 
     * Finalizes the series and returns the resulting HKQuantitySample(s).
     * 
     * Call this method when all quantities for the series have been inserted.
     *                    The completion handler will return the resulting HKQuantitySample(s)
     *                    Note that it is possible for a single HKQuantitySeriesSampleBuilder to produce
     *                    multiple samples. If no quantity data was added, then samples will be nil and
     *                    an error will be returned. This method functions as a convenience for
     *                    finishSeriesWithMetadata:endDate:completion: when endDate is nil.
     *                    After calling this method, the receiver will be considered invalid
     *                    and calling any other method will result in an error.
     * 
     * @param             metadata    Optional metadata may be added to associate with the series.
     *                                Predefined keys are found in HKMetadata.h, or custom NSString
     *                                keys used by the client are allowed. Acceptable metadata value types
     *                                are NSString, NSDate, NSNumber and HKQuantity.
     * @param             completion  The completion handler will return the resulting HKQuantitySample(s)
     *                                for the series. Note that it is possible for a single
     *                                HKQuantitySeriesSampleBuilder to produce multiple samples.
     *                                If data could not be inserted because of an authorization failure,
     *                                samples will be nil and and an error with code
     *                                HKErrorAuthorizationDenied or HKErrorAuthorizationNotDetermined
     *                                will be returned. If the resulting sample(s) could not be accessed
     *                                after they have been created, then samples will be nil and an error
     *                                with code HKErrorDatabaseInaccessible will be returned. Any other
     *                                error indicates the resulting samples could not be returned.
     *                                After calling this method, the receiver will be considered invalid
     *                                and calling any other method will result in an error.
     */
    @Generated
    @Selector("finishSeriesWithMetadata:completion:")
    public native void finishSeriesWithMetadataCompletion(NSDictionary<String, ?> metadata,
            @ObjCBlock(name = "call_finishSeriesWithMetadataCompletion") Block_finishSeriesWithMetadataCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_finishSeriesWithMetadataCompletion {
        @Generated
        void call_finishSeriesWithMetadataCompletion(NSArray<? extends HKQuantitySample> samples, NSError error);
    }

    /**
     * finishSeriesWithMetadata:endDate:completion:
     * 
     * Finalizes the series and returns the resulting HKQuantitySample(s).
     * 
     * Call this method when all quantities for the series have been inserted.
     *                    The completion handler will return the resulting HKQuantitySample(s)
     *                    Note that it is possible for a single HKQuantitySeriesSampleBuilder to produce
     *                    multiple samples. If no quantity data was added, then samples will be nil and
     *                    an error will be returned. After calling this method, the receiver will be
     *                    considered invalid and calling any other method will result in an error.
     * 
     * @param             metadata    Optional metadata may be added to associate with the series.
     *                                Predefined keys are found in HKMetadata.h, or custom NSString
     *                                keys used by the client are allowed. Acceptable metadata value types
     *                                are NSString, NSDate, NSNumber and HKQuantity.
     * @param             endDate     Optional date at which the produced sample(s) end.
     *                                An HKErrorInvalidArgument will be returned if endDate
     *                                is earlier than the receiver's startDate,
     *                                or is earlier than the dateInterval.endDate of any inserted quantity.
     * @param             completion  The completion handler will return the resulting HKQuantitySample(s)
     *                                for the series. Note that it is possible for a single
     *                                HKQuantitySeriesSampleBuilder to produce multiple samples.
     *                                If data could not be inserted because of an authorization failure,
     *                                samples will be nil and and an error with code
     *                                HKErrorAuthorizationDenied or HKErrorAuthorizationNotDetermined
     *                                will be returned. If the resulting sample(s) could not be accessed
     *                                after they have been created, then samples will be nil and an error
     *                                with code HKErrorDatabaseInaccessible will be returned. Any other
     *                                error indicates the resulting samples could not be returned.
     *                                After calling this method, the receiver will be considered invalid
     *                                and calling any other method will result in an error.
     */
    @Generated
    @Selector("finishSeriesWithMetadata:endDate:completion:")
    public native void finishSeriesWithMetadataEndDateCompletion(NSDictionary<String, ?> metadata, NSDate endDate,
            @ObjCBlock(name = "call_finishSeriesWithMetadataEndDateCompletion") Block_finishSeriesWithMetadataEndDateCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_finishSeriesWithMetadataEndDateCompletion {
        @Generated
        void call_finishSeriesWithMetadataEndDateCompletion(NSArray<? extends HKQuantitySample> samples, NSError error);
    }

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native HKQuantitySeriesSampleBuilder init();

    /**
     * initWithHealthStore:quantityType:device:
     * 
     * The designated initializer to create an HKQuantitySeriesSampleBuilder.
     * 
     * The HKHealthStore is retained during the life of the object for the saving of the
     *                series data and final return of the series sample.
     * 
     * @param         healthStore     Specifies the HKHealthStore object to use for building the series.
     * @param         quantityType    Specifies the quantity type for which to build the series.
     * @param         startDate       The date from which the produced sample(s) start.
     * @param         device          The optional device represents the HKDevice from which the data is
     *                                provided.
     */
    @Generated
    @Selector("initWithHealthStore:quantityType:startDate:device:")
    public native HKQuantitySeriesSampleBuilder initWithHealthStoreQuantityTypeStartDateDevice(
            HKHealthStore healthStore, HKQuantityType quantityType, NSDate startDate, HKDevice device);

    /**
     * insertQuantity:date:completion:
     * 
     * Associate a new quantity with the receiver at a specific instantaneous
     *                    date interval.
     * 
     * This method acts as a convenience for insertQuantity:dateInterval:completion:
     *                    where dateInterval has a duration of 0.
     * 
     * @param             quantity    The quantity to insert.
     * @param             date        The start date associated with the quantity. If this is the same
     *                                start date as a previously-provided quantity, the new value will
     *                                replace the old value. An HKErrorInvalidArgument will be returned
     *                                if date is earlier than the receiver's startDate.
     */
    @Generated
    @Selector("insertQuantity:date:error:")
    public native boolean insertQuantityDateError(HKQuantity quantity, NSDate date,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * insertQuantity:dateInterval:completion:
     * 
     * Associate a new quantity with the receiver with a specific date interval.
     * 
     * Use this method to add a quantity to the series. The quantity must have a unit
     *                    that is compatible with the receiver's quantity type.
     *                    See -[HKQuantityType isCompatibleWithUnit:].
     *                    Note that quantities may be inserted in any order,
     *                    but will be sorted by dateInterval.startDate when the series is finished.
     * 
     * @param             quantity        The quantity to insert.
     * @param             dateInterval    The dateInterval associated with the quantity.
     *                                    If dateInterval.startDate is the same as a previously-provided
     *                                    quantity, the new value will replace the old value.
     *                                    An HKErrorInvalidArgument will be returned if
     *                                    dateInterval.startDate is earlier than the receiver's startDate.
     */
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

    /**
     * [@property]      quantityType
     */
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

    /**
     * [@property]      startDate
     */
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