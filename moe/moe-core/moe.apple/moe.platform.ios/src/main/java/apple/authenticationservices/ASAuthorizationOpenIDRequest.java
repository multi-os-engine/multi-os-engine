package apple.authenticationservices;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
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
public class ASAuthorizationOpenIDRequest extends ASAuthorizationRequest {
    static {
        NatJ.register();
    }

    @Generated
    protected ASAuthorizationOpenIDRequest(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native ASAuthorizationOpenIDRequest alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native ASAuthorizationOpenIDRequest allocWithZone(VoidPtr zone);

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
    public native ASAuthorizationOpenIDRequest init();

    @Generated
    @Selector("initWithCoder:")
    public native ASAuthorizationOpenIDRequest initWithCoder(@NotNull NSCoder coder);

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
    public static native ASAuthorizationOpenIDRequest new_objc();

    /**
     * Nonce to be passed to the identity provider. This value can be verified with the identity token provided as a
     * part of successful ASAuthorization response.
     * [@note] The nonce size may depend on the actual technology used and an error might be returned by the request
     * execution.
     */
    @Nullable
    @Generated
    @Selector("nonce")
    public native String nonce();

    /**
     * Operation to be executed by the request. The ASAuthorizationOperationImplicit operation interpretation depends on
     * the credential provider implementation.
     */
    @NotNull
    @Generated
    @Selector("requestedOperation")
    public native String requestedOperation();

    /**
     * The contact information to be requested from the user. Only scopes for which this app was authorized for will be
     * returned.
     */
    @Nullable
    @Generated
    @Selector("requestedScopes")
    public native NSArray<String> requestedScopes();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Nonce to be passed to the identity provider. This value can be verified with the identity token provided as a
     * part of successful ASAuthorization response.
     * [@note] The nonce size may depend on the actual technology used and an error might be returned by the request
     * execution.
     */
    @Generated
    @Selector("setNonce:")
    public native void setNonce(@Nullable String value);

    /**
     * Operation to be executed by the request. The ASAuthorizationOperationImplicit operation interpretation depends on
     * the credential provider implementation.
     */
    @Generated
    @Selector("setRequestedOperation:")
    public native void setRequestedOperation(@NotNull String value);

    /**
     * The contact information to be requested from the user. Only scopes for which this app was authorized for will be
     * returned.
     */
    @Generated
    @Selector("setRequestedScopes:")
    public native void setRequestedScopes(@Nullable NSArray<String> value);

    /**
     * State to be passed to the identity provider. This value will be returned as a part of successful ASAuthorization
     * response.
     * [@note] The state size may depend on the actual technology used and an error might be returned by the request
     * execution.
     */
    @Generated
    @Selector("setState:")
    public native void setState(@Nullable String value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * State to be passed to the identity provider. This value will be returned as a part of successful ASAuthorization
     * response.
     * [@note] The state size may depend on the actual technology used and an error might be returned by the request
     * execution.
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

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
