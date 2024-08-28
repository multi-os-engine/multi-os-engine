package apple.corelocation;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.opaque.dispatch_queue_t;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * API-Since: 17.0
 */
@Generated
@Library("CoreLocation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CLLocationUpdater extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected CLLocationUpdater(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CLLocationUpdater alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native CLLocationUpdater allocWithZone(VoidPtr zone);

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

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native CLLocationUpdater init();

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

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("invalidate")
    public native void invalidate();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * liveUpdaterWithConfiguration:queue:handler:
     * 
     * Discussion:
     * Returns a new CLLocationUpdater with the given a CLLiveUpdateConfiguration,
     * queue and handler.
     * 
     * configuration: Specifies the live update configuration which should
     * be used.
     * queue: Specifies the queue to which the handler is submitted with each
     * available update.
     * handler: Specifies the block that will be invoked with each update.
     * 
     * CoreLocation will ensure the app has a few seconds of runtime to process
     * each location update it is authorized to receive. If the app crashes,
     * crashes, or exits for any reason while updates are flowing,
     * it will be launched for the next update, which it may receive by
     * calling this method again to express resumed interest.
     * If this method is not called again, or the resulting updater
     * is not resumed again, then CoreLocation will automatically stop the flow
     * of updates.
     * 
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("liveUpdaterWithConfiguration:queue:handler:")
    @Nullable
    public static native CLLocationUpdater liveUpdaterWithConfigurationQueueHandler(@NInt long configuration,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_liveUpdaterWithConfigurationQueueHandler") @NotNull Block_liveUpdaterWithConfigurationQueueHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_liveUpdaterWithConfigurationQueueHandler {
        @Generated
        void call_liveUpdaterWithConfigurationQueueHandler(@Nullable CLUpdate update);
    }

    /**
     * liveUpdaterWithQueue:handler:
     * 
     * Discussion:
     * Returns a new CLLocationUpdater with the given queue and handler,
     * using the default live update configuration.
     * 
     * queue: Specifies the queue to which the handler is submitted with each
     * available update.
     * handler: Specifies the block that will be invoked with each update.
     * 
     * CoreLocation will ensure the app has a few seconds of runtime to process
     * each location update it is authorized to receive. If the app crashes,
     * or exits for any reason while updates are flowing,
     * it will be launched for the next update, which it may receive by
     * calling this method again to express resumed interest.
     * If this method is not called again, or the resulting updater
     * is not resumed again, then CoreLocation will automatically stop the flow
     * of updates.
     * 
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("liveUpdaterWithQueue:handler:")
    @Nullable
    public static native CLLocationUpdater liveUpdaterWithQueueHandler(@NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_liveUpdaterWithQueueHandler") @NotNull Block_liveUpdaterWithQueueHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_liveUpdaterWithQueueHandler {
        @Generated
        void call_liveUpdaterWithQueueHandler(@Nullable CLUpdate update);
    }

    @Generated
    @Owned
    @Selector("new")
    public static native CLLocationUpdater new_objc();

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("pause")
    public native void pause();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("resume")
    public native void resume();

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

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
}