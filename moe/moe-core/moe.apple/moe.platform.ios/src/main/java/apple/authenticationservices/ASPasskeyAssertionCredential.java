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
 * This class encapsulates a passkey assertion response created by a credential provider extension.
 * 
 * API-Since: 17.0
 */
@Generated
@Library("AuthenticationServices")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class ASPasskeyAssertionCredential extends NSObject implements ASAuthorizationCredential {
    static {
        NatJ.register();
    }

    @Generated
    protected ASPasskeyAssertionCredential(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native ASPasskeyAssertionCredential alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native ASPasskeyAssertionCredential allocWithZone(VoidPtr zone);

    /**
     * The authenticator data of the application that created this credential.
     */
    @Generated
    @Selector("authenticatorData")
    @NotNull
    public native NSData authenticatorData();

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
     * The hash of the client data for this assertion result.
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
     * The raw credential ID for this passkey credential.
     */
    @Generated
    @Selector("credentialID")
    @NotNull
    public native NSData credentialID();

    /**
     * Creates and initializes a new ASPasskeyCredential object.
     * 
     * @param userHandle   The identifier for the account the passkey is associated with.
     * @param relyingParty the relying party.
     * @param signature    the signature for the assertion challenge.
     */
    @Generated
    @Selector("credentialWithUserHandle:relyingParty:signature:clientDataHash:authenticatorData:credentialID:")
    public static native ASPasskeyAssertionCredential credentialWithUserHandleRelyingPartySignatureClientDataHashAuthenticatorDataCredentialID(
            @NotNull NSData userHandle, @NotNull String relyingParty, @NotNull NSData signature,
            @NotNull NSData clientDataHash, @NotNull NSData authenticatorData, @NotNull NSData credentialID);

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
    public native ASPasskeyAssertionCredential init();

    @Generated
    @Selector("initWithCoder:")
    public native ASPasskeyAssertionCredential initWithCoder(@NotNull NSCoder coder);

    /**
     * Initializes an ASPasskeyCredential object.
     * 
     * @param userHandle   The identifier for the account the passkey is associated with.
     * @param relyingParty the relying party.
     * @param signature    the signature for the assertion challenge.
     */
    @Generated
    @Selector("initWithUserHandle:relyingParty:signature:clientDataHash:authenticatorData:credentialID:")
    public native ASPasskeyAssertionCredential initWithUserHandleRelyingPartySignatureClientDataHashAuthenticatorDataCredentialID(
            @NotNull NSData userHandle, @NotNull String relyingParty, @NotNull NSData signature,
            @NotNull NSData clientDataHash, @NotNull NSData authenticatorData, @NotNull NSData credentialID);

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
    public static native ASPasskeyAssertionCredential new_objc();

    /**
     * The relying party of this credential.
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

    /**
     * The signature of this credential.
     */
    @Generated
    @Selector("signature")
    @NotNull
    public native NSData signature();

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

    /**
     * The user handle of this passkey.
     */
    @Generated
    @Selector("userHandle")
    @NotNull
    public native NSData userHandle();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}