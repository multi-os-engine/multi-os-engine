package apple.authenticationservices;

import apple.NSObject;
import apple.authenticationservices.protocol.ASAuthorizationCredential;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSData;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSPersonNameComponents;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * API-Since: 13.0
 */
@Generated
@Library("AuthenticationServices")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class ASAuthorizationAppleIDCredential extends NSObject implements ASAuthorizationCredential {
    static {
        NatJ.register();
    }

    @Generated
    protected ASAuthorizationAppleIDCredential(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native ASAuthorizationAppleIDCredential alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native ASAuthorizationAppleIDCredential allocWithZone(VoidPtr zone);

    /**
     * A short-lived, one-time valid token that provides proof of authorization to the server component of the app. The
     * authorization code is bound to the specific transaction using the state attribute passed in the authorization
     * request. The server component of the app can validate the code using Apple’s identity service endpoint provided
     * for this purpose.
     */
    @Generated
    @Selector("authorizationCode")
    public native NSData authorizationCode();

    /**
     * This value will contain a list of scopes for which the user provided authorization. These may contain a subset of
     * the requested scopes on @see ASAuthorizationAppleIDRequest. The application should query this value to identify
     * which scopes were returned as it maybe different from ones requested.
     */
    @Generated
    @Selector("authorizedScopes")
    public native NSArray<String> authorizedScopes();

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
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * An optional email shared by the user. This field is populated with a value that the user authorized.
     */
    @Generated
    @Selector("email")
    public native String email();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    /**
     * An optional full name shared by the user. This field is populated with a value that the user authorized.
     */
    @Generated
    @Selector("fullName")
    public native NSPersonNameComponents fullName();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * A JSON Web Token (JWT) used to communicate information about the identity of the user in a secure way to the app.
     * The ID token will contain the following information: Issuer Identifier, Subject Identifier, Audience, Expiry Time
     * and Issuance Time signed by Apple's identity service.
     */
    @Generated
    @Selector("identityToken")
    public native NSData identityToken();

    @Generated
    @Selector("init")
    public native ASAuthorizationAppleIDCredential init();

    @Generated
    @Selector("initWithCoder:")
    public native ASAuthorizationAppleIDCredential initWithCoder(NSCoder coder);

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
    public static native ASAuthorizationAppleIDCredential new_objc();

    /**
     * Check this property for a hint as to whether the current user is a "real user". @see ASUserDetectionStatus for
     * guidelines on handling each status
     */
    @Generated
    @Selector("realUserStatus")
    @NInt
    public native long realUserStatus();

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
     * A copy of the state value that was passed to ASAuthorizationRequest.
     */
    @Generated
    @Selector("state")
    public native String state();

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

    /**
     * An opaque user ID associated with the AppleID used for the sign in. This identifier will be stable across the
     * 'developer team', it can later be used as an input to @see ASAuthorizationRequest to request user contact
     * information.
     * 
     * The identifier will remain stable as long as the user is connected with the requesting client. The value may
     * change upon user disconnecting from the identity provider.
     */
    @Generated
    @Selector("user")
    public native String user();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
