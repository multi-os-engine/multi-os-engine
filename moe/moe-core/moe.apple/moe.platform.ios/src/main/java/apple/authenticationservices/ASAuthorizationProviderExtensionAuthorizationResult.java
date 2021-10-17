package apple.authenticationservices;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSDictionary;
import apple.foundation.NSHTTPURLResponse;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
@Library("AuthenticationServices")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class ASAuthorizationProviderExtensionAuthorizationResult extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected ASAuthorizationProviderExtensionAuthorizationResult(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native ASAuthorizationProviderExtensionAuthorizationResult alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

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
     * HTTP extra headers for addition with credentials.
     */
    @Generated
    @Selector("httpAuthorizationHeaders")
    public native NSDictionary<String, String> httpAuthorizationHeaders();

    /**
     * HTTP response body for OAUth and SAML based authentications.
     */
    @Generated
    @Selector("httpBody")
    public native NSData httpBody();

    /**
     * HTTP response for OAUth and SAML based authentications.
     */
    @Generated
    @Selector("httpResponse")
    public native NSHTTPURLResponse httpResponse();

    @Generated
    @Selector("init")
    public native ASAuthorizationProviderExtensionAuthorizationResult init();

    /**
     * Authorization succeeded with an authorization tokens stored in HTTP headers.
     */
    @Generated
    @Selector("initWithHTTPAuthorizationHeaders:")
    public native ASAuthorizationProviderExtensionAuthorizationResult initWithHTTPAuthorizationHeaders(
            NSDictionary<String, String> httpAuthorizationHeaders);

    /**
     * Authorization succeeded with a HTTP response.
     */
    @Generated
    @Selector("initWithHTTPResponse:httpBody:")
    public native ASAuthorizationProviderExtensionAuthorizationResult initWithHTTPResponseHttpBody(
            NSHTTPURLResponse httpResponse, NSData httpBody);

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

    /**
     * Private SecKeys.
     */
    @Generated
    @Selector("privateKeys")
    public native NSArray<?> privateKeys();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * HTTP extra headers for addition with credentials.
     */
    @Generated
    @Selector("setHttpAuthorizationHeaders:")
    public native void setHttpAuthorizationHeaders(NSDictionary<String, String> value);

    /**
     * HTTP response body for OAUth and SAML based authentications.
     */
    @Generated
    @Selector("setHttpBody:")
    public native void setHttpBody(NSData value);

    /**
     * HTTP response for OAUth and SAML based authentications.
     */
    @Generated
    @Selector("setHttpResponse:")
    public native void setHttpResponse(NSHTTPURLResponse value);

    /**
     * Private SecKeys.
     */
    @Generated
    @Selector("setPrivateKeys:")
    public native void setPrivateKeys(NSArray<?> value);

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
