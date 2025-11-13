package apple.healthkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.healthkit.protocol.HKLiveWorkoutBuilderDelegate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * API-Since: 26.0
 */
@Generated
@Library("HealthKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class HKLiveWorkoutBuilder extends HKWorkoutBuilder {
    static {
        NatJ.register();
    }

    @Generated
    protected HKLiveWorkoutBuilder(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native HKLiveWorkoutBuilder alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native HKLiveWorkoutBuilder allocWithZone(VoidPtr zone);

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

    /**
     * [@property] currentWorkoutActivity
     * 
     * The latest activity that has been added to this builder.
     * 
     * When an activity is in progress it will be returned by this property. The end date of this activity will always
     * be nil. When the activity is ended, the property would be set to nil until a new activity begins.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("currentWorkoutActivity")
    @Nullable
    public native HKWorkoutActivity currentWorkoutActivity();

    /**
     * [@property] dataSource
     * 
     * The data source that will provide data to this workout builder.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("dataSource")
    @Nullable
    public native HKLiveWorkoutDataSource dataSource();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    /**
     * [@property] delegate
     * 
     * The delegate object which will be notified of changes to collected data and elapsed workout time.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    public native HKLiveWorkoutBuilderDelegate delegate();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * [@property] elapsedTime
     * 
     * The elapsed duration of the workout as constructed thus far, considering paused time. When the builder
     * is reading events from an active session, it is possible for this value to increase or decrease;
     * when this occurs, the workoutBuilderDidCollectEvent: delegate method will be called.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("elapsedTime")
    public native double elapsedTime();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native HKLiveWorkoutBuilder init();

    @Generated
    @Selector("initWithHealthStore:configuration:device:")
    public native HKLiveWorkoutBuilder initWithHealthStoreConfigurationDevice(@NotNull HKHealthStore healthStore,
            @NotNull HKWorkoutConfiguration configuration, @Nullable HKDevice device);

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
    public static native HKLiveWorkoutBuilder new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] dataSource
     * 
     * The data source that will provide data to this workout builder.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setDataSource:")
    public native void setDataSource(@Nullable HKLiveWorkoutDataSource value);

    /**
     * [@property] delegate
     * 
     * The delegate object which will be notified of changes to collected data and elapsed workout time.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) @Nullable HKLiveWorkoutBuilderDelegate value);

    /**
     * [@property] delegate
     * 
     * The delegate object which will be notified of changes to collected data and elapsed workout time.
     * 
     * API-Since: 26.0
     */
    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) @Nullable HKLiveWorkoutBuilderDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * [@property] shouldCollectWorkoutEvents
     * 
     * Whether or not the builder should automatically incorporate events generated by the session.
     * 
     * YES if the builder should automatically incorporate events from the associated session. If NO, the client
     * is expected to add relevant events directly to the builder and those generated by the session will be
     * ignored. Defaults to YES. The result of changing this value after a call to
     * beginCollectionWithStartDate:completion: is undefined.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setShouldCollectWorkoutEvents:")
    public native void setShouldCollectWorkoutEvents(boolean value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * [@property] shouldCollectWorkoutEvents
     * 
     * Whether or not the builder should automatically incorporate events generated by the session.
     * 
     * YES if the builder should automatically incorporate events from the associated session. If NO, the client
     * is expected to add relevant events directly to the builder and those generated by the session will be
     * ignored. Defaults to YES. The result of changing this value after a call to
     * beginCollectionWithStartDate:completion: is undefined.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("shouldCollectWorkoutEvents")
    public native boolean shouldCollectWorkoutEvents();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * [@property] workoutSession
     * 
     * The workout session with which this builder is associated.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("workoutSession")
    @Nullable
    public native HKWorkoutSession workoutSession();
}