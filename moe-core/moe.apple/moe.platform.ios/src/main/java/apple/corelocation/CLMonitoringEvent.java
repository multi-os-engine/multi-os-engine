package apple.corelocation;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSDate;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSSecureCoding;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * Event object that would be passed to the callback handler upon an event
 * 
 * Discussion:
 * Instances of `CLMonitoringEvent` contain detailed information about
 * an event in the monitoring of a `CLCondition` by a `CLMonitor`.
 * 
 * 
 * API-Since: 17.0
 */
@Generated
@Library("CoreLocation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CLMonitoringEvent extends NSObject implements NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected CLMonitoringEvent(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CLMonitoringEvent alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native CLMonitoringEvent allocWithZone(VoidPtr zone);

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
     * date
     * 
     * Discussion:
     * An instance of NSDate indicating the time of the event.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("date")
    @NotNull
    public native NSDate date();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * identifier
     * 
     * Discussion:
     * An `NSString` representing the identifier under which the condition
     * was added for monitoring.
     * 
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("identifier")
    @NotNull
    public native String identifier();

    @Generated
    @Selector("init")
    public native CLMonitoringEvent init();

    @Generated
    @Selector("initWithCoder:")
    public native CLMonitoringEvent initWithCoder(@NotNull NSCoder coder);

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
    public static native CLMonitoringEvent new_objc();

    /**
     * refinement
     * 
     * Discussion:
     * An optional instance of CLCondition that represents the most specific
     * condition to which this event could apply. The type of the refinement
     * condition depends onthe monitored condition itself.
     * 
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("refinement")
    @Nullable
    public native CLCondition refinement();

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
     * state
     * 
     * Discussion:
     * State of the condition at the time of the event.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("state")
    @NUInt
    public native long state();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * accuracyLimited
     * 
     * Discussion:
     * True if events will not be delivered because the app is subject
     * to accuracy limitation.
     * 
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("accuracyLimited")
    public native boolean accuracyLimited();

    /**
     * authorizationDenied
     * 
     * Discussion:
     * True if events will be suspended while the app has been denied
     * location authorization.
     * 
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("authorizationDenied")
    public native boolean authorizationDenied();

    /**
     * authorizationDeniedGlobally
     * 
     * Discussion:
     * True if events will be suspended while the user has disabled Location
     * Services system-wide.
     * 
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("authorizationDeniedGlobally")
    public native boolean authorizationDeniedGlobally();

    /**
     * authorizationRequestInProgress
     * 
     * Discussion:
     * True if the system is requesting authorization from the user on behalf of the app, but no response has been
     * received yet.
     * 
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("authorizationRequestInProgress")
    public native boolean authorizationRequestInProgress();

    /**
     * authorizationRestricted
     * 
     * Discussion:
     * True if events will be suspended while the app lacks authorization,
     * and authorization changes are prevented by parental restrictions,
     * MDM configuration, or other factors.
     * 
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("authorizationRestricted")
    public native boolean authorizationRestricted();

    /**
     * conditionLimitExceeded
     * 
     * Discussion:
     * True if events will be suspended for this condition while the app
     * has too many other conditions of this type monitored.
     * 
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("conditionLimitExceeded")
    public native boolean conditionLimitExceeded();

    /**
     * conditionUnsupported
     * 
     * Discussion:
     * True if events will be suspended for this condition because
     * monitoring is not supported for conditions of its type.
     * 
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("conditionUnsupported")
    public native boolean conditionUnsupported();

    /**
     * insufficientlyInUse
     * 
     * Discussion:
     * True if events will be suspended while the app is not sufficiently
     * in-use.
     * 
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("insufficientlyInUse")
    public native boolean insufficientlyInUse();

    /**
     * persistenceUnavailable
     * 
     * Discussion:
     * True if monitoring is not possible due to persistence failure.
     * Some or all properties of the condition, if identified, or all conditions,
     * and events associated with the monitoring of affected conditions may not
     * be stored persistently.
     * 
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("persistenceUnavailable")
    public native boolean persistenceUnavailable();

    /**
     * serviceSessionRequired
     * 
     * Discussion:
     * True if LocationServices are disabled because the app has adopted CLRequireExplicitServiceSession
     * info.plist key but no CLServiceSession requiring authorization is outstanding yet.
     * 
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("serviceSessionRequired")
    public native boolean serviceSessionRequired();
}