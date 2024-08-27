package apple.mediasetup;

import apple.NSObject;
import apple.foundation.NSArray;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Account details for accessing a streaming media service.
 * 
 * API-Since: 14.0
 */
@Generated
@Library("MediaSetup")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MSServiceAccount extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MSServiceAccount(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * The user’s display name, email address, or other identifier in a streaming media service.
     */
    @NotNull
    @Generated
    @Selector("accountName")
    public native String accountName();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MSServiceAccount alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MSServiceAccount allocWithZone(VoidPtr zone);

    /**
     * A list of permissions for the token request.
     * 
     * The authorization scope is an optional OAuth 2.0 scope parameter the system provides
     * when requesting a token.
     */
    @Nullable
    @Generated
    @Selector("authorizationScope")
    public native String authorizationScope();

    /**
     * A URL that provides a token for the user’s HomePod speakers.
     * 
     * The authorization token URL is an OAuth 2.0 token service endpoint that provides a
     * Bearer Token for retrieving configuration.
     */
    @Nullable
    @Generated
    @Selector("authorizationTokenURL")
    public native NSURL authorizationTokenURL();

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

    /**
     * A user identifier for the token request.
     * 
     * The Media Setup framework uses the ``MSServiceAccount/clientID`` to create a
     * token request. You can choose the identifier format, but the identifier must
     * be unique to the current account. You can provide a new identifier each time
     * the user begins the home setup.
     */
    @Nullable
    @Generated
    @Selector("clientID")
    public native String clientID();

    /**
     * A string that authenticates the user’s setup request.
     * 
     * The Media Setup framework uses the `clientSecret` to create a token request.
     * Hashed passwords are acceptable, but plaintext passwords aren't.
     */
    @Nullable
    @Generated
    @Selector("clientSecret")
    public native String clientSecret();

    /**
     * The path to access the configuration endpoint of your streaming media
     * service for the home.
     * 
     * The device retrieves the configuration with the OAuth 2.0 Bearer token.
     */
    @Nullable
    @Generated
    @Selector("configurationURL")
    public native NSURL configurationURL();

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
    public native MSServiceAccount init();

    /**
     * Creates a new account.
     * 
     * - Parameters:
     * - serviceName: The name of the streaming media service.
     * 
     * - accountName: The user’s display name in the streaming media service.
     */
    @Generated
    @Selector("initWithServiceName:accountName:")
    public native MSServiceAccount initWithServiceNameAccountName(@NotNull String serviceName,
            @NotNull String accountName);

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
    public static native MSServiceAccount new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The localized name of the streaming media service.
     */
    @NotNull
    @Generated
    @Selector("serviceName")
    public native String serviceName();

    /**
     * A list of permissions for the token request.
     * 
     * The authorization scope is an optional OAuth 2.0 scope parameter the system provides
     * when requesting a token.
     */
    @Generated
    @Selector("setAuthorizationScope:")
    public native void setAuthorizationScope(@Nullable String value);

    /**
     * A URL that provides a token for the user’s HomePod speakers.
     * 
     * The authorization token URL is an OAuth 2.0 token service endpoint that provides a
     * Bearer Token for retrieving configuration.
     */
    @Generated
    @Selector("setAuthorizationTokenURL:")
    public native void setAuthorizationTokenURL(@Nullable NSURL value);

    /**
     * A user identifier for the token request.
     * 
     * The Media Setup framework uses the ``MSServiceAccount/clientID`` to create a
     * token request. You can choose the identifier format, but the identifier must
     * be unique to the current account. You can provide a new identifier each time
     * the user begins the home setup.
     */
    @Generated
    @Selector("setClientID:")
    public native void setClientID(@Nullable String value);

    /**
     * A string that authenticates the user’s setup request.
     * 
     * The Media Setup framework uses the `clientSecret` to create a token request.
     * Hashed passwords are acceptable, but plaintext passwords aren't.
     */
    @Generated
    @Selector("setClientSecret:")
    public native void setClientSecret(@Nullable String value);

    /**
     * The path to access the configuration endpoint of your streaming media
     * service for the home.
     * 
     * The device retrieves the configuration with the OAuth 2.0 Bearer token.
     */
    @Generated
    @Selector("setConfigurationURL:")
    public native void setConfigurationURL(@Nullable NSURL value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
