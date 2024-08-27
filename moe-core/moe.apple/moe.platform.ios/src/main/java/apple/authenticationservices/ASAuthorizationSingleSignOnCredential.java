package apple.authenticationservices;

import apple.NSObject;
import apple.authenticationservices.protocol.ASAuthorizationCredential;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSData;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
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
public class ASAuthorizationSingleSignOnCredential extends NSObject implements ASAuthorizationCredential {
    static {
        NatJ.register();
    }

    @Generated
    protected ASAuthorizationSingleSignOnCredential(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * An access token used to access other systems with the authorized scopes.
     */
    @Nullable
    @Generated
    @Selector("accessToken")
    public native NSData accessToken();

    @Generated
    @Owned
    @Selector("alloc")
    public static native ASAuthorizationSingleSignOnCredential alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native ASAuthorizationSingleSignOnCredential allocWithZone(VoidPtr zone);

    /**
     * The complete AuthenticationServices extension response with the additional outputs used by the specific
     * technology used by the Authorization Server instance and AuthenticationServices Extension.
     * [@note] for some operations all properties can be null and the response will indicate just successful result of
     * the operation.
     */
    @Nullable
    @Generated
    @Selector("authenticatedResponse")
    public native NSHTTPURLResponse authenticatedResponse();

    /**
     * This value will contain a list of scopes for which the user provided authorization. These may contain a subset of
     * the requested scopes on @see ASAuthorizationOpenIDRequest. The application should query this value to identify
     * which scopes were returned as it maybe different from ones requested.
     */
    @NotNull
    @Generated
    @Selector("authorizedScopes")
    public native NSArray<String> authorizedScopes();

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

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

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
     * A JSON Web Token (JWT) used to communicate information about the identity of the user in a secure way to the app.
     */
    @Nullable
    @Generated
    @Selector("identityToken")
    public native NSData identityToken();

    @Generated
    @Selector("init")
    public native ASAuthorizationSingleSignOnCredential init();

    @Generated
    @Selector("initWithCoder:")
    public native ASAuthorizationSingleSignOnCredential initWithCoder(@NotNull NSCoder coder);

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
    public static native ASAuthorizationSingleSignOnCredential new_objc();

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
     * A state returned from the AuthenticationServices extension.
     */
    @Nullable
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

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Private SecKeys returned from the AuthenticationServices extension.
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("privateKeys")
    public native NSArray<?> privateKeys();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
