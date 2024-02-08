package apple.matter;

import apple.NSObject;
import apple.foundation.NSArray;
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

/**
 * Represents information relating to a certificate signing request for a Matter
 * operational certificate.
 * 
 * API-Since: 16.4
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTROperationalCSRInfo extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MTROperationalCSRInfo(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTROperationalCSRInfo alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTROperationalCSRInfo allocWithZone(VoidPtr zone);

    /**
     * A signature, using the device attestation private key of the device that
     * created the CSR, over the concatenation of csrElementsTLV and the attestation
     * challenge from the secure session.
     * 
     * The attestation challenge is available in MTRAttestionInfo.
     */
    @Generated
    @Selector("attestationSignature")
    @NotNull
    public native NSData attestationSignature();

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
     * DER-encoded certificate signing request.
     */
    @Generated
    @Selector("csr")
    @NotNull
    public native NSData csr();

    /**
     * TLV-encoded nocsr-elements structure. This includes the "csr" and "csrNonce"
     * fields, and can include additional vendor-specific information.
     */
    @Generated
    @Selector("csrElementsTLV")
    @NotNull
    public native NSData csrElementsTLV();

    /**
     * The nonce associated with this CSR.
     */
    @Generated
    @Selector("csrNonce")
    @NotNull
    public native NSData csrNonce();

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
    public native MTROperationalCSRInfo init();

    /**
     * Initialize an MTROperationalCSRInfo by providing all the fields. It's the
     * caller's responsibility to ensure that csr and csrNonce match the csrElementsTLV.
     * 
     * API-Since: 16.4
     * Deprecated-Since: 17.0
     * Deprecated-Message: Please use one of the initializers that validates the input
     */
    @Generated
    @Deprecated
    @Selector("initWithCSR:csrNonce:csrElementsTLV:attestationSignature:")
    public native MTROperationalCSRInfo initWithCSRCsrNonceCsrElementsTLVAttestationSignature(@NotNull NSData csr,
            @NotNull NSData csrNonce, @NotNull NSData csrElementsTLV, @NotNull NSData attestationSignature);

    /**
     * Initialize an MTROperationalCSRInfo by providing just the csrElementsTLV and
     * attestationSignature (which can come from an
     * MTROperationalCredentialsClusterCSRResponseParams). This will extract the
     * csr and csrNonce from the csrElementsTLV, if possible, and return nil if that
     * fails.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("initWithCSRElementsTLV:attestationSignature:")
    public native MTROperationalCSRInfo initWithCSRElementsTLVAttestationSignature(@NotNull NSData csrElementsTLV,
            @NotNull NSData attestationSignature);

    /**
     * Initialize an MTROperationalCSRInfo by providing the csrNonce (for example,
     * the nonce the client initially supplied), and the csrElementsTLV and
     * attestationSignature that the server returned. This will ensure that
     * csrNonce matches the data in csrElementsTLV, returning nil if it does not,
     * and extract the csr from csrElementsTLV.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("initWithCSRNonce:csrElementsTLV:attestationSignature:")
    public native MTROperationalCSRInfo initWithCSRNonceCsrElementsTLVAttestationSignature(@NotNull NSData csrNonce,
            @NotNull NSData csrElementsTLV, @NotNull NSData attestationSignature);

    /**
     * Initialize an MTROperationalCSRInfo by providing an
     * MTROperationalCredentialsClusterCSRResponseParams. This will extract the
     * relevant fields from the response data.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("initWithCSRResponseParams:")
    public native MTROperationalCSRInfo initWithCSRResponseParams(
            @NotNull MTROperationalCredentialsClusterCSRResponseParams responseParams);

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
    public static native MTROperationalCSRInfo new_objc();

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
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}