package apple.authenticationservices;

import apple.NSObject;
import apple.authenticationservices.protocol.ASCredentialIdentity;
import apple.authenticationservices.protocol.ASCredentialRequest;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSData;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
 * This class encapsulates a password assertion request made to a credential provider extension.
 * 
 * API-Since: 17.0
 */
@Generated
@Library("AuthenticationServices")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class ASPasskeyCredentialRequest extends NSObject implements ASCredentialRequest {
    static {
        NatJ.register();
    }

    @Generated
    protected ASPasskeyCredentialRequest(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native ASPasskeyCredentialRequest alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native ASPasskeyCredentialRequest allocWithZone(VoidPtr zone);

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

    /**
     * Hash of client data for credential provider to sign as part of the assertion/registration operation.
     */
    @Generated
    @Selector("clientDataHash")
    @NotNull
    public native NSData clientDataHash();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    @NotNull
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("credentialIdentity")
    @MappedReturn(ObjCObjectMapper.class)
    @NotNull
    public native ASCredentialIdentity credentialIdentity();

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

    @Generated
    @Selector("init")
    public native ASPasskeyCredentialRequest init();

    @Generated
    @Selector("initWithCoder:")
    public native ASPasskeyCredentialRequest initWithCoder(@NotNull NSCoder coder);

    /**
     * Initializes an instance of ASPasskeyCredentialRequest.
     * 
     * @param credentialIdentity         credential identity to used for this request.
     * @param clientDataHash             the client data to be signed for this assertion request.
     * @param userVerificationPreference user verification preference setting of this assertion request.
     */
    @Generated
    @Selector("initWithCredentialIdentity:clientDataHash:userVerificationPreference:supportedAlgorithms:")
    public native ASPasskeyCredentialRequest initWithCredentialIdentityClientDataHashUserVerificationPreferenceSupportedAlgorithms(
            @NotNull ASPasskeyCredentialIdentity credentialIdentity, @NotNull NSData clientDataHash,
            @NotNull String userVerificationPreference, @NotNull NSArray<? extends NSNumber> supportedAlgorithms);

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

    @Generated
    @Owned
    @Selector("new")
    public static native ASPasskeyCredentialRequest new_objc();

    /**
     * Creates and initializes an instance of ASPasskeyCredentialRequest.
     * 
     * @param credentialIdentity         credential identity to used for this request.
     * @param clientDataHash             the client data to be signed for this assertion request.
     * @param userVerificationPreference user verification preference setting of this assertion request.
     */
    @Generated
    @Selector("requestWithCredentialIdentity:clientDataHash:userVerificationPreference:supportedAlgorithms:")
    public static native ASPasskeyCredentialRequest requestWithCredentialIdentityClientDataHashUserVerificationPreferenceSupportedAlgorithms(
            @NotNull ASPasskeyCredentialIdentity credentialIdentity, @NotNull NSData clientDataHash,
            @NotNull String userVerificationPreference, @NotNull NSArray<? extends NSNumber> supportedAlgorithms);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * A preference for whether the authenticator should attempt to verify that
     * it is being used by its owner, such as through a PIN or biometrics.
     */
    @Generated
    @Selector("setUserVerificationPreference:")
    public native void setUserVerificationPreference(@NotNull String value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * A list of signing algorithms supported by the relying party. Will be empty for assertion requests.
     */
    @Generated
    @Selector("supportedAlgorithms")
    @NotNull
    public native NSArray<? extends NSNumber> supportedAlgorithms();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("type")
    @NInt
    public native long type();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    /**
     * A preference for whether the authenticator should attempt to verify that
     * it is being used by its owner, such as through a PIN or biometrics.
     */
    @Generated
    @Selector("userVerificationPreference")
    @NotNull
    public native String userVerificationPreference();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}