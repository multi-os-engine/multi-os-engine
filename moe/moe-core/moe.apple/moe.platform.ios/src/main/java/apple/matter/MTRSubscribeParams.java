package apple.matter;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
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
 * MTRSubscribeParams
 * This is used to control the behavior of attribute/event subscribes. If not
 * provided (i.e. nil passed for the MTRSubscribeParams argument), will be
 * treated as if a default-initialized object was passed in.
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRSubscribeParams extends MTRReadParams {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRSubscribeParams(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRSubscribeParams alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRSubscribeParams allocWithZone(VoidPtr zone);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use resubscribeAutomatically
     */
    @Generated
    @Deprecated
    @Selector("autoResubscribe")
    @Nullable
    public native NSNumber autoResubscribe();

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

    /**
     * init and new exist for now, for backwards compatibility, and initialize with
     * minInterval set to 1 and maxInterval set to 0, which will not work on its
     * own. Uses of MTRSubscribeParams that rely on init must all be using
     * (deprecated) APIs that pass in a separate minInterval and maxInterval.
     * 
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use initWithMinInterval
     */
    @Generated
    @Deprecated
    @Selector("init")
    public native MTRSubscribeParams init();

    /**
     * Initialize an MTRSubscribeParams. Must provide a minInterval and
     * maxInterval; there are no default values for those.
     */
    @Generated
    @Selector("initWithMinInterval:maxInterval:")
    public native MTRSubscribeParams initWithMinIntervalMaxInterval(@NotNull NSNumber minInterval,
            @NotNull NSNumber maxInterval);

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

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use replaceExistingSubscriptions
     */
    @Generated
    @Deprecated
    @Selector("keepPreviousSubscriptions")
    @Nullable
    public native NSNumber keepPreviousSubscriptions();

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * The suggested maximum time, in seconds, during which the server is allowed to
     * send no reports at all for this subscription. Must be at least as large as
     * minInterval. The server is allowed to use a larger time than this as the
     * maxInterval it selects if it needs to (e.g. to meet its power budget).
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("maxInterval")
    @NotNull
    public native NSNumber maxInterval();

    /**
     * The minimum time, in seconds, between consecutive reports a server will send
     * for this subscription. This can be used to rate-limit the subscription
     * traffic. Any non-negative value is allowed, including 0.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("minInterval")
    @NotNull
    public native NSNumber minInterval();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use initWithMinInterval
     */
    @Generated
    @Owned
    @Deprecated
    @Selector("new")
    public static native MTRSubscribeParams new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use resubscribeAutomatically
     */
    @Generated
    @Deprecated
    @Selector("setAutoResubscribe:")
    public native void setAutoResubscribe(@Nullable NSNumber value);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use replaceExistingSubscriptions
     */
    @Generated
    @Deprecated
    @Selector("setKeepPreviousSubscriptions:")
    public native void setKeepPreviousSubscriptions(@Nullable NSNumber value);

    /**
     * The suggested maximum time, in seconds, during which the server is allowed to
     * send no reports at all for this subscription. Must be at least as large as
     * minInterval. The server is allowed to use a larger time than this as the
     * maxInterval it selects if it needs to (e.g. to meet its power budget).
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("setMaxInterval:")
    public native void setMaxInterval(@NotNull NSNumber value);

    /**
     * The minimum time, in seconds, between consecutive reports a server will send
     * for this subscription. This can be used to rate-limit the subscription
     * traffic. Any non-negative value is allowed, including 0.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("setMinInterval:")
    public native void setMinInterval(@NotNull NSNumber value);

    /**
     * Whether the subscribe should replace already-existing
     * subscriptions. The default value is YES.
     * 
     * If YES, the subscribe will cancel any existing subscriptions to the target
     * node when it sets up the new one.
     * 
     * If NO, the subscribe will allow any previous subscriptions to remain.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("setReplaceExistingSubscriptions:")
    public native void setReplaceExistingSubscriptions(boolean value);

    /**
     * Controls whether events will be reported urgently. The default value is YES.
     * 
     * If YES, the events will be reported as soon as the minInterval does not prevent it.
     * 
     * If NO, the events will be reported at the maximum interval.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("setReportEventsUrgently:")
    public native void setReportEventsUrgently(boolean value);

    /**
     * Whether the subscription should automatically try to re-establish if it
     * drops. The default value is YES.
     * 
     * If NO, loss of subscription will simply lead to an error report. Some
     * subscription APIs do not support this value.
     * 
     * If YES, loss of subscription will lead to an automatic resubscription
     * attempt. If this succeeds, the subscriptionEstablished callback will be
     * called again.
     * 
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("setResubscribeAutomatically:")
    public native void setResubscribeAutomatically(boolean value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Whether the subscribe should replace already-existing
     * subscriptions. The default value is YES.
     * 
     * If YES, the subscribe will cancel any existing subscriptions to the target
     * node when it sets up the new one.
     * 
     * If NO, the subscribe will allow any previous subscriptions to remain.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("shouldReplaceExistingSubscriptions")
    public native boolean shouldReplaceExistingSubscriptions();

    /**
     * Controls whether events will be reported urgently. The default value is YES.
     * 
     * If YES, the events will be reported as soon as the minInterval does not prevent it.
     * 
     * If NO, the events will be reported at the maximum interval.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("shouldReportEventsUrgently")
    public native boolean shouldReportEventsUrgently();

    /**
     * Whether the subscription should automatically try to re-establish if it
     * drops. The default value is YES.
     * 
     * If NO, loss of subscription will simply lead to an error report. Some
     * subscription APIs do not support this value.
     * 
     * If YES, loss of subscription will lead to an automatic resubscription
     * attempt. If this succeeds, the subscriptionEstablished callback will be
     * called again.
     * 
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("shouldResubscribeAutomatically")
    public native boolean shouldResubscribeAutomatically();

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