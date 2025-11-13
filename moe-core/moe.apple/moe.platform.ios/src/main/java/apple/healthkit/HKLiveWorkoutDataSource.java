package apple.healthkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSPredicate;
import apple.foundation.NSSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * HKLiveWorkoutDataSource
 * 
 * An HKLiveWorkoutDataSource is to be used with an HKWorkoutBuilder to automatically collect samples
 * 
 * API-Since: 26.0
 */
@Generated
@Library("HealthKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class HKLiveWorkoutDataSource extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected HKLiveWorkoutDataSource(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native HKLiveWorkoutDataSource alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native HKLiveWorkoutDataSource allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget, @NotNull SEL aSelector,
            @Mapped(ObjCObjectMapper.class) @Nullable Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    @NotNull
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    @NotNull
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * disableCollectionForType:
     * 
     * Removes the specified quantity type from the types to collect.
     * 
     * @param quantityType The type of sample to no longer collect.
     * 
     *                     API-Since: 26.0
     */
    @Generated
    @Selector("disableCollectionForType:")
    public native void disableCollectionForType(@NotNull HKQuantityType quantityType);

    /**
     * enableCollectionForType:predicate
     * 
     * Adds a new type of quantity sample to collect.
     * 
     * Calling this method for a type that is already being collected will override the predicate for that type.
     * 
     * @param quantityType The type of sample to collect.
     * @param predicate    If non-nil, collected samples must match this predicate.
     * 
     *                     API-Since: 26.0
     */
    @Generated
    @Selector("enableCollectionForType:predicate:")
    public native void enableCollectionForTypePredicate(@NotNull HKQuantityType quantityType,
            @Nullable NSPredicate predicate);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native HKLiveWorkoutDataSource init();

    /**
     * initWithHealthStore:workoutConfiguration:
     * 
     * The designated initializer of HKLiveWorkoutDataSource.
     * 
     * @param healthStore   The HKHealthStore. This should match the one used to create the corresponding
     *                      HKWorkoutBuilder.
     * @param configuration An optional workout configuration. typesToCollect will be populated with default
     *                      types for the workout configuration
     * 
     *                      API-Since: 26.0
     */
    @Generated
    @Selector("initWithHealthStore:workoutConfiguration:")
    public native HKLiveWorkoutDataSource initWithHealthStoreWorkoutConfiguration(@NotNull HKHealthStore healthStore,
            @Nullable HKWorkoutConfiguration configuration);

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
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native HKLiveWorkoutDataSource new_objc();

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

    /**
     * [@property] typesToCollect
     * 
     * The quantity types the receiver is collecting.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("typesToCollect")
    @NotNull
    public native NSSet<? extends HKQuantityType> typesToCollect();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}