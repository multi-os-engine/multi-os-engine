package apple.healthkit;

import apple.NSObject;
import apple.corelocation.CLLocation;
import apple.foundation.NSArray;
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
 * @class              HKWorkoutRouteBuilder
 * @abstract           An HKWorkoutRouteBuilder is used to generate an HKWorkoutRoute.
 * @discussion         This class is intended for generating long-running location data collection such as
 *                     might be associated with a workout. If the discard method is called, collected data will be deleted.
 *                     Calling finishRouteWithWorkout:metadata: will stop and complete the route. If the builder is deleted,
 *                     or the client goes away before calling the finish method, data will be lost.
 */
@Generated
@Library("HealthKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class HKWorkoutRouteBuilder extends HKSeriesBuilder {
    static {
        NatJ.register();
    }

    @Generated
    protected HKWorkoutRouteBuilder(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native HKWorkoutRouteBuilder alloc();

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
     * @method             finishRouteWithWorkout:Metadata:completion:
     * @abstract           Method to stop data collection and return the associated HKWorkoutRoute. If you are using this route
     *                     builder with a workout builder, you should never call this method. The route will be finished when you
     *                     finish the workout builder.
     * @discussion         Call this method when the route has been completed. The completion handler will return the saved
     * HKWorkoutRoute.     If no series data was added, then workoutRoute will be nil and an error returned. The
     *                     receiver will be considered invalid afterwards and any further calls to it will result in an error.
     * 
     * @param workout      The HKWorkout object to which the route will be associated. Must be saved to HealthKit
     * @param metadata     Optional metadata may be added to associate with the series. Predefined keys are found in
     *                     HKMetadata.h, or private NSString keys used by the client are allowed. Acceptable metadata value
     *                     types are NSString, NSDate, NSNumber and HKQuantity
     * @param completion   The completion callback handler returns the saved HKWorkoutRoute object. If workoutRoute is nil, an
     *                     error will indicate why the series could not be returned including database inaccessibility during
     *                     device lock. Subsequent requests for the HKWorkoutRoute can be made through HKSampleQuery or similar
     *                     queries. workoutRoute cannot be associated to another workout.
     */
    @Generated
    @Selector("finishRouteWithWorkout:metadata:completion:")
    public native void finishRouteWithWorkoutMetadataCompletion(HKWorkout workout, NSDictionary<String, ?> metadata,
            @ObjCBlock(name = "call_finishRouteWithWorkoutMetadataCompletion") Block_finishRouteWithWorkoutMetadataCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_finishRouteWithWorkoutMetadataCompletion {
        @Generated
        void call_finishRouteWithWorkoutMetadataCompletion(HKWorkoutRoute workoutRoute, NSError error);
    }

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native HKWorkoutRouteBuilder init();

    /**
     * @method             initWithHealthStore:device:
     * @abstract           The designated initializer to create an HKWorkoutRouteBuilder. If you are using an HKWorkoutBuilder , you
     *                     should not create an HKWorkoutRouteBuilder, instead use -[HKWorkoutBuilder seriesBuilderForType:]
     * @discussion         The HKHealthStore is retained during the life of the object for the saving of the series data and final
     *                     return of the series sample.
     * 
     * @param healthStore  Specifies the HKHealthStore object to use for building the series.
     * @param device       The optional device represents the HKDevice from which the data is provided.
     */
    @Generated
    @Selector("initWithHealthStore:device:")
    public native HKWorkoutRouteBuilder initWithHealthStoreDevice(HKHealthStore healthStore, HKDevice device);

    /**
     * @method             insertRouteData:completion:
     * @abstract           Associate CLLocation with the receiver.
     * @discussion         Use this method to asynchronously add one or more CLLocation to the
     *                     series. Note that CLLocation may be inserted in any order but will be
     *                     sorted according to date when the series is finalized.
     * 
     * @param routeData    An array of one or more CLLocation.
     * @param completion   The completion callback handler returns the status of the save. If the completion handler success is
     *                     NO, then error is non-nil. An error here is considered fatal and the series builder will be complete.
     *                     If data was previously saved, then the HKWorkoutRoute may be retrieved by the
     *                     finishRouteWithMetadata: method.
     */
    @Generated
    @Selector("insertRouteData:completion:")
    public native void insertRouteDataCompletion(NSArray<? extends CLLocation> routeData,
            @ObjCBlock(name = "call_insertRouteDataCompletion") Block_insertRouteDataCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_insertRouteDataCompletion {
        @Generated
        void call_insertRouteDataCompletion(boolean success, NSError error);
    }

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
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * @method             addMetadata:completion:
     * @discussion         Adds new metadata to the builder instance. This method can be called more than once; each time
     *                     the newly provided metadata will be incorporated in the same manner as
     *                     -[NSMutableDictionary addEntriesFromDictionary:].
     *                     This operation is performed asynchronously and the completion will be executed on an arbitrary
     *                     background queue.
     * 
     * @param metadata     The metadata to add to the builder.
     * @param completion   Block to be called when the addition of metadata to the builder is complete. If success is YES, the
     *                     metadata has been added to the builder successfully. If success is NO, error will be non-null and
     *                     will contain the error encountered during the insertion operation. When an error occurs, the builder's
     *                     metadata will remain unchanged.
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
}