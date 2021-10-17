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

    @Generated
    @Selector("accountName")
    public native String accountName();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MSServiceAccount alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    /**
     * authorizationScope is an optional OAuth 2.0 scope parameter provided when requesting a token.
     */
    @Generated
    @Selector("authorizationScope")
    public native String authorizationScope();

    /**
     * authorizationTokenURL is an OAuth 2.0 token service endpoint that can provide a Bearer token for retrieving configuration.
     */
    @Generated
    @Selector("authorizationTokenURL")
    public native NSURL authorizationTokenURL();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    /**
     * clientID is used to create a HTTP Basic auth for a token request and should be unique for an account, though it can also be unique per registration.
     */
    @Generated
    @Selector("clientID")
    public native String clientID();

    /**
     * clientSecret is used to create a HTTP Basic auth for a token request and is a freeform string that may be a hash, but not a plaintext password
     */
    @Generated
    @Selector("clientSecret")
    public native String clientSecret();

    /**
     * configurationURL is a URL to the configuration endpoint of the CloudExtension instance servicing this account. The configuration is retrieved with the Oauth2 Bearer token.
     */
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

    @Generated
    @Selector("initWithServiceName:accountName:")
    public native MSServiceAccount initWithServiceNameAccountName(String serviceName, String accountName);

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
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("serviceName")
    public native String serviceName();

    /**
     * authorizationScope is an optional OAuth 2.0 scope parameter provided when requesting a token.
     */
    @Generated
    @Selector("setAuthorizationScope:")
    public native void setAuthorizationScope(String value);

    /**
     * authorizationTokenURL is an OAuth 2.0 token service endpoint that can provide a Bearer token for retrieving configuration.
     */
    @Generated
    @Selector("setAuthorizationTokenURL:")
    public native void setAuthorizationTokenURL(NSURL value);

    /**
     * clientID is used to create a HTTP Basic auth for a token request and should be unique for an account, though it can also be unique per registration.
     */
    @Generated
    @Selector("setClientID:")
    public native void setClientID(String value);

    /**
     * clientSecret is used to create a HTTP Basic auth for a token request and is a freeform string that may be a hash, but not a plaintext password
     */
    @Generated
    @Selector("setClientSecret:")
    public native void setClientSecret(String value);

    /**
     * configurationURL is a URL to the configuration endpoint of the CloudExtension instance servicing this account. The configuration is retrieved with the Oauth2 Bearer token.
     */
    @Generated
    @Selector("setConfigurationURL:")
    public native void setConfigurationURL(NSURL value);

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
}
