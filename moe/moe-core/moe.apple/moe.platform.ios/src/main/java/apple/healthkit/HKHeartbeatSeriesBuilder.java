package apple.healthkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDate;
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
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * HKHeartbeatSeriesBuilder
 * 
 * An HKHeartbeatSeriesBuilder is used to generate an HKHeartbeatSeriesSample.
 * 
 * This class is intended for generating an HKHeartbeatSeriesSample which represents a series of
 *                     heartbeats. If the discard method is called, collected data will be deleted.
 *                     Calling finishSeriesWithcompletion: will stop and complete the series. If the builder is deleted,
 *                     or the client goes away before calling the finish method, data will be lost.
 */
@Generated
@Library("HealthKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class HKHeartbeatSeriesBuilder extends HKSeriesBuilder {
    static {
        NatJ.register();
    }

    @Generated
    protected HKHeartbeatSeriesBuilder(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * addHeartbeatWithTimeIntervalSinceSeriesStartDate:precededByGap:completion:
     * 
     * Associate a heartbeat with the receiver.
     * 
     * Use this method to asynchronously add a heartbeat to the series.
     * 
     * @param              timeInterval   The elapsed time between the series startDate and the heartbeat occurence. Must be
     *                                    a positive value.
     * @param              precededByGap  Whether or not this heartbeat was preceded by a gap in data collection.
     * @param              completion     The completion callback handler returns the status of the save. If the completion
     *                                    handler success is NO, then error is non-nil. An error here is considered fatal and
     *                                    the series builder will be complete.
     */
    @Generated
    @Selector("addHeartbeatWithTimeIntervalSinceSeriesStartDate:precededByGap:completion:")
    public native void addHeartbeatWithTimeIntervalSinceSeriesStartDatePrecededByGapCompletion(double timeInterval,
            boolean precededByGap,
            @ObjCBlock(name = "call_addHeartbeatWithTimeIntervalSinceSeriesStartDatePrecededByGapCompletion") Block_addHeartbeatWithTimeIntervalSinceSeriesStartDatePrecededByGapCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addHeartbeatWithTimeIntervalSinceSeriesStartDatePrecededByGapCompletion {
        @Generated
        void call_addHeartbeatWithTimeIntervalSinceSeriesStartDatePrecededByGapCompletion(boolean success,
                NSError error);
    }

    /**
     * addMetadata:completion:
     * 
     * Adds new metadata to the builder instance. This method can be called more than once; each time
     *                     the newly provided metadata will be incorporated in the same manner as
     *                     -[NSMutableDictionary addEntriesFromDictionary:].
     *                     This operation is performed asynchronously and the completion will be executed on an arbitrary
     *                     background queue.
     * 
     * @param              metadata    The metadata to add to the builder.
     * @param              completion  Block to be called when the addition of metadata to the builder is complete.
     *                                 If success is YES, the metadata has been added to the builder successfully. If success
     *                                 is NO, error will be non-null and will contain the error encountered during the
     *                                 insertion operation. When an error occurs, the builder's metadata will remain unchanged.
     */
    @Generated
    @Selector("addMetadata:completion:")
    public native void addMetadataCompletion(NSDictionary<String, ?> metadata,
            @ObjCBlock(name = "call_addMetadataCompletion") Block_addMetadataCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addMetadataCompletion {
        @Generated
        void call_addMetadataCompletion(boolean success, NSError error);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native HKHeartbeatSeriesBuilder alloc();

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
     * finishSeriesWithCompletion:
     * 
     * Method to stop data collection and return the associated HKHeartbeatSeriesSample.
     * 
     * Call this method when you have added all heartbeats to this builder. The completion handler will
     *                     return the saved HKHeartbeatSeriesSample. If no heartbeat was added, then heartbeatSeries will be
     *                     nil and an error returned. The receiver will be considered invalid afterwards and any further calls
     *                     to it will result in an error.
     * 
     * @param              completion  The completion callback handler returns the saved HKHeartbeatSeriesSample object. If
     *                                 heartbeatSeries is nil, an error will indicate why the series could not be returned
     *                                 including database inaccessibility during device lock. Subsequent requests for the
     *                                 HKHeartbeatSeriesSample can be made through HKSampleQuery or similar queries. To
     *                                 retrieve the data stored with an HKHeartbeatSeriesSample use HKHeartbeatSeriesQuery.
     */
    @Generated
    @Selector("finishSeriesWithCompletion:")
    public native void finishSeriesWithCompletion(
            @ObjCBlock(name = "call_finishSeriesWithCompletion") Block_finishSeriesWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_finishSeriesWithCompletion {
        @Generated
        void call_finishSeriesWithCompletion(HKHeartbeatSeriesSample heartbeatSeries, NSError error);
    }

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native HKHeartbeatSeriesBuilder init();

    /**
     * initWithHealthStore:device:startDate:
     * 
     * The designated initializer to create an HKHeartbeatSeriesBuilder.
     * 
     * The HKHealthStore is retained during the life of the object for the saving of the series data and final
     *                     return of the series sample.
     * 
     * @param              healthStore  Specifies the HKHealthStore object to use for building the series.
     * @param              device       The optional device represents the HKDevice from which the data is provided.
     * @param              startDate    The start date of the HKHeartbeatSeriesSample that will be generated.
     */
    @Generated
    @Selector("initWithHealthStore:device:startDate:")
    public native HKHeartbeatSeriesBuilder initWithHealthStoreDeviceStartDate(HKHealthStore healthStore,
            HKDevice device, NSDate startDate);

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

    /**
     * [@property]           maximumCount
     * 
     * The maximum number of heartbeats that can be added to an HKHeartbeatSeriesBuilder.
     * 
     * Any calls to addHeartbeatWithTimeIntervalSinceSeriesStartDate:precededByGap:completion: once
     *                     maximumCount has been reached will fail and an error will be returned in the completion handler.
     */
    @Generated
    @Selector("maximumCount")
    @NUInt
    public static native long maximumCount();

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
    @Selector("version")
    @NInt
    public static native long version_static();
}