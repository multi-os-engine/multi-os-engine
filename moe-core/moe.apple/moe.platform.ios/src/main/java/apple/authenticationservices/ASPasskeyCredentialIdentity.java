package apple.authenticationservices;

import apple.NSObject;
import apple.authenticationservices.protocol.ASCredentialIdentity;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSData;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
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
 * ASPasskeyCredentialIdentity
 * An ASPasswordCredentialIdentity is used to describe an identity that can use a service upon successful passkey based
 * authentication.
 * Use this class to save entries into ASCredentialIdentityStore.
 * 
 * API-Since: 17.0
 */
@Generated
@Library("AuthenticationServices")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class ASPasskeyCredentialIdentity extends NSObject implements NSCopying, NSSecureCoding, ASCredentialIdentity {
    static {
        NatJ.register();
    }

    @Generated
    protected ASPasskeyCredentialIdentity(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native ASPasskeyCredentialIdentity alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native ASPasskeyCredentialIdentity allocWithZone(VoidPtr zone);

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

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    @NotNull
    public native Object copyWithZone(@Nullable VoidPtr zone);

    /**
     * The credential ID of this passkey credential.
     * 
     * This field is used to identify the correct credential to use based on relying party request parameters.
     */
    @Generated
    @Selector("credentialID")
    @NotNull
    public native NSData credentialID();

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
     * Create and initialize an instance of ASPasskeyCredentialIdentity.
     * 
     * @param relyingPartyIdentifier relying party for this credential.
     * @param userName               user name associated with this credential.
     * @param credentialID           credential ID of this passkey credential.
     * @param userHandle             user handle data of this passkey credential.
     * @param recordIdentifier       identifier used by credential provider extension to identify this credential.
     */
    @Generated
    @Selector("identityWithRelyingPartyIdentifier:userName:credentialID:userHandle:recordIdentifier:")
    public static native ASPasskeyCredentialIdentity identityWithRelyingPartyIdentifierUserNameCredentialIDUserHandleRecordIdentifier(
            @NotNull String relyingPartyIdentifier, @NotNull String userName, @NotNull NSData credentialID,
            @NotNull NSData userHandle, @Nullable String recordIdentifier);

    @Generated
    @Selector("init")
    public native ASPasskeyCredentialIdentity init();

    @Generated
    @Selector("initWithCoder:")
    public native ASPasskeyCredentialIdentity initWithCoder(@NotNull NSCoder coder);

    /**
     * Initialize an instance of ASPasskeyCredentialIdentity.
     * 
     * @param relyingPartyIdentifier relying party for this credential.
     * @param userName               user name associated with this credential.
     * @param credentialID           credential ID of this passkey credential.
     * @param userHandle             user handle data of this passkey credential.
     * @param recordIdentifier       identifier used by credential provider extension to identify this credential.
     */
    @Generated
    @Selector("initWithRelyingPartyIdentifier:userName:credentialID:userHandle:recordIdentifier:")
    public native ASPasskeyCredentialIdentity initWithRelyingPartyIdentifierUserNameCredentialIDUserHandleRecordIdentifier(
            @NotNull String relyingPartyIdentifier, @NotNull String userName, @NotNull NSData credentialID,
            @NotNull NSData userHandle, @Nullable String recordIdentifier);

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
    public static native ASPasskeyCredentialIdentity new_objc();

    @Generated
    @Selector("rank")
    @NInt
    public native long rank();

    @Generated
    @Selector("recordIdentifier")
    @Nullable
    public native String recordIdentifier();

    /**
     * The relying party identifier of this passkey credential.
     * 
     * This field is reported as the serviceIdentifier property of ASCredentialIdentity.
     */
    @Generated
    @Selector("relyingPartyIdentifier")
    @NotNull
    public native String relyingPartyIdentifier();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("serviceIdentifier")
    @NotNull
    public native ASCredentialServiceIdentifier serviceIdentifier();

    @Generated
    @Selector("setRank:")
    public native void setRank(@NInt long value);

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
    @Selector("user")
    @NotNull
    public native String user();

    /**
     * The user handle of this passkey credential.
     * 
     * This field is used to identify the correct credential to use based on relying party request parameters.
     */
    @Generated
    @Selector("userHandle")
    @NotNull
    public native NSData userHandle();

    /**
     * The user name of this passkey credential.
     * 
     * This field is reported as the user property of ASCredentialIdentity.
     */
    @Generated
    @Selector("userName")
    @NotNull
    public native String userName();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}