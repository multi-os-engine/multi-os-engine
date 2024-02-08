package apple.apptrackingtransparency;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * A class that provides a tracking authorization request and the tracking
 * authorization status of the app.
 * 
 * API-Since: 14.0
 */
@Generated
@Library("AppTrackingTransparency")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class ATTrackingManager extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected ATTrackingManager(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native ATTrackingManager alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native ATTrackingManager allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
    @Generated
    @Selector("classForKeyedUnarchiver")
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
    public native ATTrackingManager init();

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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native ATTrackingManager new_objc();

    /**
     * The request for user authorization to access app-related data.
     * 
     * The ``ATTrackingManager/requestTrackingAuthorizationWithCompletionHandler:``
     * is a one-time request to authorize or deny access to app-related data that
     * can be used for tracking the user or the device. The system remembers the
     * user’s choice and doesn’t prompt again unless a user uninstalls and then
     * reinstalls the app on the device.
     * 
     * Calls to the API only prompt when the application state
     * is `UIApplicationStateActive`. The authorization prompt doesn’t display if
     * another permission request is pending user confirmation. Concurrent requests
     * aren’t preserved by iOS, and calls to the API through an app extension don’t
     * prompt. Check the ``ATTrackingManager/trackingAuthorizationStatus`` for a
     * status of
     * ``ATTrackingManagerAuthorizationStatus/ATTrackingManagerAuthorizationStatusNotDetermined``
     * to determine if you need to make an additional call.
     * 
     * The completion handler will be called with the result of the user's
     * decision for granting or denying permission to use application tracking.
     * The completion handler will be called immediately if access to request
     * authorization is restricted.
     * 
     * - Important: To use
     * ``ATTrackingManager/requestTrackingAuthorizationWithCompletionHandler:``,
     * the
     * <doc://com.apple.documentation/documentation/bundleresources/information_property_list/NSUserTrackingUsageDescription>
     * key must be in the
     * <doc://com.apple.documentation/documentation/bundleresources/information_property_list>.
     */
    @Generated
    @Selector("requestTrackingAuthorizationWithCompletionHandler:")
    public static native void requestTrackingAuthorizationWithCompletionHandler(
            @NotNull @ObjCBlock(name = "call_requestTrackingAuthorizationWithCompletionHandler") Block_requestTrackingAuthorizationWithCompletionHandler completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestTrackingAuthorizationWithCompletionHandler {
        @Generated
        void call_requestTrackingAuthorizationWithCompletionHandler(@NUInt long status);
    }

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
     * The authorization status that is current for the calling application.
     * 
     * If the user has not yet been prompted to approve access, the return value
     * will either be ``ATTrackingManagerAuthorizationStatusNotDetermined``, or
     * ``ATTrackingManagerAuthorizationStatusRestricted`` if this value is
     * managed. Once the user has been prompted, the return value will be either
     * ``ATTrackingManagerAuthorizationStatusDenied`` or
     * ``ATTrackingManagerAuthorizationStatusAuthorized``.
     * 
     * Use the ``ATTrackingManager/trackingAuthorizationStatus`` property to check
     * authorization status.
     * 
     * - Returns: Information about your application’s tracking authorization
     * status. Users are able to grant or deny developers tracking privileges on
     * a per-app basis. Application developers must call
     * `requestTrackingAuthorizationWithCompletionHandler:` for the ability to
     * track users.
     */
    @Generated
    @Selector("trackingAuthorizationStatus")
    @NUInt
    public static native long trackingAuthorizationStatus();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
