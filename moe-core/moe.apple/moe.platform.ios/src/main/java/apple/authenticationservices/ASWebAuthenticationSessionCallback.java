package apple.authenticationservices;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
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
 * An object used to evaluate navigation events in an authentication session. When the session navigates
 * to a matching URL, it will pass the URL to the session completion handler.
 * 
 * API-Since: 17.4
 */
@Generated
@Library("AuthenticationServices")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class ASWebAuthenticationSessionCallback extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected ASWebAuthenticationSessionCallback(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native ASWebAuthenticationSessionCallback alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native ASWebAuthenticationSessionCallback allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * Creates a callback object that matches against URLs with the given custom scheme.
     * 
     * @param customScheme The custom scheme that the app expects in the callback URL.
     * 
     *                     API-Since: 17.4
     */
    @Generated
    @Selector("callbackWithCustomScheme:")
    public static native ASWebAuthenticationSessionCallback callbackWithCustomScheme(@NotNull String customScheme);

    /**
     * Creates a callback object that matches against HTTPS URLs with the given host and path.
     * 
     * @param host The host that the app expects in the callback URL. The host must be associated with the
     *             app using associated web credentials domains.
     * @param path The path that the app expects in the callback URL.
     * 
     *             API-Since: 17.4
     */
    @Generated
    @Selector("callbackWithHTTPSHost:path:")
    public static native ASWebAuthenticationSessionCallback callbackWithHTTPSHostPath(@NotNull String host,
            @NotNull String path);

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
    public native ASWebAuthenticationSessionCallback init();

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

    /**
     * Check whether a given main-frame navigation URL matches the callback expected by the client app. Handles all
     * URL-based callback strategies, including custom schemes and HTTPS navigations.
     * This is mainly meant for web browsers adopting the ASWebAuthenticationWebBrowser API, but may also be useful for
     * other apps for debugging purposes.
     * 
     * @param url The URL to check.
     * 
     *            API-Since: 17.4
     */
    @Generated
    @Selector("matchesURL:")
    public native boolean matchesURL(@NotNull NSURL url);

    @Generated
    @Owned
    @Selector("new")
    public static native ASWebAuthenticationSessionCallback new_objc();

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
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}