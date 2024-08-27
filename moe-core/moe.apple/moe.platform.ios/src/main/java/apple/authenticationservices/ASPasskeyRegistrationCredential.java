package apple.authenticationservices;

import apple.NSObject;
import apple.authenticationservices.protocol.ASAuthorizationCredential;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSData;
import apple.foundation.NSMethodSignature;
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
 * This class encapsulates a passkey registration response created by a credential provider extension.
 * 
 * API-Since: 17.0
 */
@Generated
@Library("AuthenticationServices")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class ASPasskeyRegistrationCredential extends NSObject implements ASAuthorizationCredential {
    static {
        NatJ.register();
    }

    @Generated
    protected ASPasskeyRegistrationCredential(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native ASPasskeyRegistrationCredential alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native ASPasskeyRegistrationCredential allocWithZone(VoidPtr zone);

    /**
     * The attestation object for this passkey registration result.
     */
    @Generated
    @Selector("attestationObject")
    @NotNull
    public native NSData attestationObject();

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
     * The hash of the client data for this registration result.
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

    /**
     * The raw credential identifier of this passkey.
     */
    @Generated
    @Selector("credentialID")
    @NotNull
    public native NSData credentialID();

    /**
     * Creates and initializes an ASPasskeyRegistrationCredential object.
     * 
     * @param relyingParty      the relying party identifier associated with this passkey.
     * @param clientDataHash    the JSON encoded client data for this registration result.
     * @param credentialID      The unique identifier for this passkey.
     * @param attestationObject the attestation object for this passkey registration result.
     */
    @Generated
    @Selector("credentialWithRelyingParty:clientDataHash:credentialID:attestationObject:")
    public static native ASPasskeyRegistrationCredential credentialWithRelyingPartyClientDataHashCredentialIDAttestationObject(
            @NotNull String relyingParty, @NotNull NSData clientDataHash, @NotNull NSData credentialID,
            @NotNull NSData attestationObject);

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
    public native ASPasskeyRegistrationCredential init();

    @Generated
    @Selector("initWithCoder:")
    public native ASPasskeyRegistrationCredential initWithCoder(@NotNull NSCoder coder);

    /**
     * Initializes an ASPasskeyRegistrationCredential object.
     * 
     * @param relyingParty      the relying party identifier associated with this passkey.
     * @param clientDataHash    the JSON encoded client data for this registration result.
     * @param credentialID      The unique identifier for this passkey.
     * @param attestationObject the attestation object for this passkey registration result.
     */
    @Generated
    @Selector("initWithRelyingParty:clientDataHash:credentialID:attestationObject:")
    public native ASPasskeyRegistrationCredential initWithRelyingPartyClientDataHashCredentialIDAttestationObject(
            @NotNull String relyingParty, @NotNull NSData clientDataHash, @NotNull NSData credentialID,
            @NotNull NSData attestationObject);

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
    public static native ASPasskeyRegistrationCredential new_objc();

    /**
     * The relying party identifier associated with this passkey.
     */
    @Generated
    @Selector("relyingParty")
    @NotNull
    public native String relyingParty();

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
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}