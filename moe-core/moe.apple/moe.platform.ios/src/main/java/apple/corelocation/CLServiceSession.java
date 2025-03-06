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
 * API-Since: 18.0
 */
@Generated
@Library("CoreLocation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CLServiceSession extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected CLServiceSession(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CLServiceSession alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native CLServiceSession allocWithZone(VoidPtr zone);

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
    public native CLServiceSession init();

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
     * invalidate
     * 
     * Discussion:
     * Ends the session immediately. Once the session is
     * invalidated it cannot become active again.
     * 
     * API-Since: 18.0
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

    @Generated
    @Owned
    @Selector("new")
    public static native CLServiceSession new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * sessionRequiringAuthorization:
     * 
     * Discussion:
     * Creates a CLServiceSession instance with specified authorization requirement.
     * 
     * authorizationRequirement: Passing None for authorization requirement
     * creates a session object which does not seek authorization from the user,
     * but meets a requested Explicit Service Session requirement if authorization
     * has already been obtained.
     * 
     * Passing an authorization requirement other than .none will cause
     * Location Services to seek the corresponding level of authorization
     * from the user when possible.
     * 
     * Like a CLBackgroundActivitySession instance, a CLServiceSession
     * instance should be created while in-use, or immediately when launched
     * in the background if a matching session was held when previously
     * running. If an instance is created that does not meet either
     * requirement, it will yield the .insufficientlyInUse diagnostic until
     * the app returns to the foreground (off-course to receive updates use the below
     * variant which specifies a handler)
     * 
     * Note: A CLServiceSession instance with an authorization requirement of
     * .always must be held, and reporting no relevant diagnostic properties,
     * whenever Always authorization is to be leveraged. An app with Always
     * authorization, but which is not holding such a CLServiceSession will
     * not be able to receive CLLocationUpdate.liveUpdates() or CLMonitor.events()
     * when it is not in-use. So be careful to take one when the user
     * configures always-operation, and retake it promptly during launch
     * after background termination.
     * 
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("sessionRequiringAuthorization:")
    @NotNull
    public static native CLServiceSession sessionRequiringAuthorization(@NInt long authorizationRequirement);

    /**
     * sessionRequiringAuthorization:fullAccuracyPurposeKey:
     * 
     * Discussion:
     * Creates a CLServiceSession instance with specified authorization requirement
     * and fullAccuracy Purpose Key
     * 
     * authorizationRequirement:
     * Same as applicable for sessionRequiringAuthorization: i.e Passing an
     * authorization requirement other than .none will cause Location Services
     * to seek the corresponding level of authorization from the user when possible.
     * 
     * fullAccuracyPurposeKey:
     * Names a string in the NSLocationTemporaryUsageDescriptionDictionary.
     * Location Services will request temporary full accuracy authorization
     * from the user using this string if necessary while this session is
     * outstanding.
     * 
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("sessionRequiringAuthorization:fullAccuracyPurposeKey:")
    @NotNull
    public static native CLServiceSession sessionRequiringAuthorizationFullAccuracyPurposeKey(
            @NInt long authorizationRequirement, @NotNull String purposeKey);

    /**
     * sessionRequiringAuthorization:fullAccuracyPurposeKey:queue:handler:
     * 
     * Discussion:
     * Creates a CLServiceSession instance with specified authorization requirement
     * and fullAccuracy Purpose Key same as sessionRequiringAuthorization:fullAccuracyPurposeKey:
     * 
     * This variant allows to specify a queue to which specified callback handler
     * will be submitted for receiving diagnostic updates.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("sessionRequiringAuthorization:fullAccuracyPurposeKey:queue:handler:")
    @NotNull
    public static native CLServiceSession sessionRequiringAuthorizationFullAccuracyPurposeKeyQueueHandler(
            @NInt long authorizationRequirement, @NotNull String purposeKey, @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_sessionRequiringAuthorizationFullAccuracyPurposeKeyQueueHandler") @NotNull Block_sessionRequiringAuthorizationFullAccuracyPurposeKeyQueueHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_sessionRequiringAuthorizationFullAccuracyPurposeKeyQueueHandler {
        @Generated
        void call_sessionRequiringAuthorizationFullAccuracyPurposeKeyQueueHandler(
                @NotNull CLServiceSessionDiagnostic diagnostic);
    }

    /**
     * sessionRequiringAuthorization:queue:handler:
     * Discussion:
     * Creates a CLServiceSession instance with specified authorization requirement.
     * Session behaves the same as decribed for sessionRequiringAuthorization:
     * 
     * queue: Specifies the queue to which the handler is submitted for receiving
     * diagnostic updates
     * 
     * handler: Specifies the block that will be invoked with each diagnostic update.
     * 
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("sessionRequiringAuthorization:queue:handler:")
    @NotNull
    public static native CLServiceSession sessionRequiringAuthorizationQueueHandler(@NInt long authorizationRequirement,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_sessionRequiringAuthorizationQueueHandler") @NotNull Block_sessionRequiringAuthorizationQueueHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_sessionRequiringAuthorizationQueueHandler {
        @Generated
        void call_sessionRequiringAuthorizationQueueHandler(@NotNull CLServiceSessionDiagnostic diagnostic);
    }

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