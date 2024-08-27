package apple.authenticationservices;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSHTTPURLResponse;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
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
 * API-Since: 13.0
 */
@Generated
@Library("AuthenticationServices")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class ASAuthorizationProviderExtensionAuthorizationRequest extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected ASAuthorizationProviderExtensionAuthorizationRequest(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native ASAuthorizationProviderExtensionAuthorizationRequest alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native ASAuthorizationProviderExtensionAuthorizationRequest allocWithZone(VoidPtr zone);

    /**
     * Authorization options.
     */
    @NotNull
    @Generated
    @Selector("authorizationOptions")
    public native NSDictionary<?, ?> authorizationOptions();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * Identification of the calling application.
     */
    @NotNull
    @Generated
    @Selector("callerBundleIdentifier")
    public native String callerBundleIdentifier();

    /**
     * Call when authorization needs to be canceled from some reason (for example user pressed Cancel button).
     */
    @Generated
    @Selector("cancel")
    public native void cancel();

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

    /**
     * Call when authorization succeeded without any output.
     */
    @Generated
    @Selector("complete")
    public native void complete();

    /**
     * Call when authorization failed with an error.
     */
    @Generated
    @Selector("completeWithError:")
    public native void completeWithError(@NotNull NSError error);

    /**
     * Call when authorization succeeded with an authorization tokens stored in HTTP headers.
     */
    @Generated
    @Selector("completeWithHTTPAuthorizationHeaders:")
    public native void completeWithHTTPAuthorizationHeaders(
            @NotNull NSDictionary<String, String> httpAuthorizationHeaders);

    /**
     * Call when authorization succeeded with a HTTP response.
     */
    @Generated
    @Selector("completeWithHTTPResponse:httpBody:")
    public native void completeWithHTTPResponseHttpBody(@NotNull NSHTTPURLResponse httpResponse,
            @Nullable NSData httpBody);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Call when authorization was not handled.
     */
    @Generated
    @Selector("doNotHandle")
    public native void doNotHandle();

    /**
     * Extension data from extension configuration provided by MDM stored as a property-list.
     */
    @NotNull
    @Generated
    @Selector("extensionData")
    public native NSDictionary<?, ?> extensionData();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * Request body.
     */
    @NotNull
    @Generated
    @Selector("httpBody")
    public native NSData httpBody();

    /**
     * Request HTTP headers.
     */
    @NotNull
    @Generated
    @Selector("httpHeaders")
    public native NSDictionary<String, String> httpHeaders();

    @Generated
    @Selector("init")
    public native ASAuthorizationProviderExtensionAuthorizationRequest init();

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
    public static native ASAuthorizationProviderExtensionAuthorizationRequest new_objc();

    /**
     * Asks authorization service to show extension view controller. If the controller cannot be shown an error is
     * returned.
     */
    @Generated
    @Selector("presentAuthorizationViewControllerWithCompletion:")
    public native void presentAuthorizationViewControllerWithCompletion(
            @NotNull @ObjCBlock(name = "call_presentAuthorizationViewControllerWithCompletion") Block_presentAuthorizationViewControllerWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_presentAuthorizationViewControllerWithCompletion {
        @Generated
        void call_presentAuthorizationViewControllerWithCompletion(boolean success, @Nullable NSError error);
    }

    /**
     * Realm.
     */
    @NotNull
    @Generated
    @Selector("realm")
    public native String realm();

    /**
     * Operation to be executed by the extension.
     */
    @NotNull
    @Generated
    @Selector("requestedOperation")
    public native String requestedOperation();

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
     * Request URL with all components.
     */
    @NotNull
    @Generated
    @Selector("url")
    public native NSURL url();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Team identifier of the calling application.
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @Selector("callerTeamIdentifier")
    public native String callerTeamIdentifier();

    /**
     * Indicates whether the calling application is managed.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("isCallerManaged")
    public native boolean isCallerManaged();

    /**
     * Localized display name of the calling application.
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @Selector("localizedCallerDisplayName")
    public native String localizedCallerDisplayName();

    /**
     * Call when authorization succeeded with @see ASAuthorizationProviderExtensionAuthorizationResult.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("completeWithAuthorizationResult:")
    public native void completeWithAuthorizationResult(
            @NotNull ASAuthorizationProviderExtensionAuthorizationResult authorizationResult);

    /**
     * Indicates whether the authorization user interface is enabled.
     * 
     * If user interface is not enabled, then the authorization will fail with @see ASAuthorizationErrorNotInteractive
     * if it attempts to display the authorization user interface via @see
     * presentAuthorizationViewControllerWithCompletion.
     * 
     * API-Since: 15.4
     */
    @Generated
    @Selector("isUserInterfaceEnabled")
    public native boolean isUserInterfaceEnabled();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
