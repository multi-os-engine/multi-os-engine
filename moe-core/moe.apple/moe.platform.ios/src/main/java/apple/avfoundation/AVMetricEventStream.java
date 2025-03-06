package apple.avfoundation;

import apple.NSObject;
import apple.avfoundation.protocol.AVMetricEventStreamPublisher;
import apple.avfoundation.protocol.AVMetricEventStreamSubscriber;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * AVMetricEventStream
 * 
 * AVMetricEventStream allows clients to add publishers and then subscribe to specific metric event classes from those
 * publishers. Publishers are AVFoundation instances implementing AVMetricEventStreamPublisher. The interface allows
 * clients to receive metric events via a subscriber delegate which implements AVMetricEventStreamSubscriber.
 * 
 * API-Since: 18.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVMetricEventStream extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVMetricEventStream(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * addPublisher:
     * 
     * The publisher should be an AVFoundation instance conforming to AVMetricEventStreamPublisher.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("addPublisher:")
    public native boolean addPublisher(@Mapped(ObjCObjectMapper.class) @NotNull AVMetricEventStreamPublisher publisher);

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVMetricEventStream alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native AVMetricEventStream allocWithZone(VoidPtr zone);

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
     * eventStream
     * 
     * Returns an autoreleased instance.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("eventStream")
    public static native AVMetricEventStream eventStream();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native AVMetricEventStream init();

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
    public static native AVMetricEventStream new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * setSubscriber:queue:
     * 
     * Set a subscriber delegate.
     * 
     * @param subscriber A subscriber delegate object conforming to AVMetricEventStreamSubscriber.
     * @param queue      Dispatch queue for the delegate callbacks.
     * 
     *                   API-Since: 18.0
     */
    @Generated
    @Selector("setSubscriber:queue:")
    public native boolean setSubscriberQueue(
            @Mapped(ObjCObjectMapper.class) @NotNull AVMetricEventStreamSubscriber subscriber,
            @Nullable dispatch_queue_t queue);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * subscribeToAllMetricEvents:
     * 
     * Subscribe to all metric event classes.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("subscribeToAllMetricEvents")
    public native void subscribeToAllMetricEvents();

    /**
     * subscribeToMetricEvent:
     * 
     * Subscribe to a specific metric event class.
     * 
     * @param metricEventClass Type of metric event class to subscribe to.
     * 
     *                         API-Since: 18.0
     */
    @Generated
    @Selector("subscribeToMetricEvent:")
    public native void subscribeToMetricEvent(@NotNull Class metricEventClass);

    /**
     * subscribeToMetricEvents:
     * 
     * Subscribe to set of metric event classes.
     * 
     * @param metricEventClasses Set of metric event classes to subscribe to.
     * 
     *                           API-Since: 18.0
     */
    @Generated
    @Selector("subscribeToMetricEvents:")
    public native void subscribeToMetricEvents(@NotNull NSArray<? extends Class> metricEventClasses);

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