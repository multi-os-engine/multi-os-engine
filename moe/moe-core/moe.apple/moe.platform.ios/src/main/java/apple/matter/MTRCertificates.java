package apple.matter;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSDateInterval;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.matter.protocol.MTRKeypair;
import apple.security.opaque.SecKeyRef;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRCertificates extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRCertificates(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRCertificates alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRCertificates allocWithZone(VoidPtr zone);

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
     * Convert the given Matter TLV encoded certificate to the X.509v3 DER encoded
     * format.
     * 
     * Returns nil if the conversion fails (e.g. if the input data cannot be parsed
     * as a Matter TLV encoded certificate, or if the certificate cannot be
     * represented in the X.509v3 DER format).
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("convertMatterCertificate:")
    @Nullable
    public static native NSData convertMatterCertificate(@NotNull NSData matterCertificate);

    /**
     * Convert the given X.509v3 DER encoded certificate to the Matter certificate
     * format.
     * 
     * Returns nil if the conversion fails (e.g. if the input data cannot be parsed
     * as a DER encoded X.509 certificate, or if the certificate cannot be
     * represented in the Matter certificate format).
     */
    @Generated
    @Selector("convertX509Certificate:")
    @Nullable
    public static native NSData convertX509Certificate(@NotNull NSData x509Certificate);

    /**
     * Generate a PKCS#10 certificate signing request from a MTRKeypair. This can
     * then be used to request an operational or ICA certificate from an external
     * certificate authority.
     * 
     * The CSR will have the subject OU DN set to 'CSA', because omitting all
     * identifying information altogether often trips up CSR parsing code. The CA
     * being used should expect this and ignore the request subject, producing a
     * subject that matches the rules for Matter certificates.
     * 
     * On failure returns nil and if "error" is not null sets *error to the relevant
     * error.
     */
    @Generated
    @Selector("createCertificateSigningRequest:error:")
    @Nullable
    public static native NSData createCertificateSigningRequestError(
            @Mapped(ObjCObjectMapper.class) @NotNull MTRKeypair keypair,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    /**
     * As above, but defaults to no expiration time.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("createIntermediateCertificate:rootCertificate:intermediatePublicKey:issuerID:fabricID:error:")
    @Nullable
    public static native NSData createIntermediateCertificateRootCertificateIntermediatePublicKeyIssuerIDFabricIDError(
            @Mapped(ObjCObjectMapper.class) @NotNull MTRKeypair rootKeypair, @NotNull NSData rootCertificate,
            @NotNull SecKeyRef intermediatePublicKey, @Nullable NSNumber issuerID, @Nullable NSNumber fabricID,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    /**
     * Create an intermediate X.509 DER encoded certificate that has the
     * right fields to be a valid Matter intermediate certificate.
     * 
     * If issuerID is not nil, it's unsignedLongLongValue will be used for the
     * matter-icac-id attribute in the subject distinguished name of the resulting
     * certificate.
     * 
     * If issuerID is nil, a random value will be generated for matter-icac-id.
     * 
     * If fabricID is not nil, it will be included in the subject DN of the
     * certificate. In this case it must be a valid Matter fabric id.
     * 
     * validityPeriod specifies when the certificate will be valid. A certificate
     * with no expiration time can be created by specifying [NSDate distantFuture]
     * for the end of the period.
     * 
     * On failure returns nil and if "error" is not null sets *error to the relevant
     * error.
     * 
     * API-Since: 16.6
     */
    @Generated
    @Selector("createIntermediateCertificate:rootCertificate:intermediatePublicKey:issuerID:fabricID:validityPeriod:error:")
    @Nullable
    public static native NSData createIntermediateCertificateRootCertificateIntermediatePublicKeyIssuerIDFabricIDValidityPeriodError(
            @Mapped(ObjCObjectMapper.class) @NotNull MTRKeypair rootKeypair, @NotNull NSData rootCertificate,
            @NotNull SecKeyRef intermediatePublicKey, @Nullable NSNumber issuerID, @Nullable NSNumber fabricID,
            @NotNull NSDateInterval validityPeriod, @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    /**
     * As above, but defaults to no expiration time.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("createOperationalCertificate:signingCertificate:operationalPublicKey:fabricID:nodeID:caseAuthenticatedTags:error:")
    @Nullable
    public static native NSData createOperationalCertificateSigningCertificateOperationalPublicKeyFabricIDNodeIDCaseAuthenticatedTagsError(
            @Mapped(ObjCObjectMapper.class) @NotNull MTRKeypair signingKeypair, @NotNull NSData signingCertificate,
            @NotNull SecKeyRef operationalPublicKey, @NotNull NSNumber fabricID, @NotNull NSNumber nodeID,
            @Nullable NSSet<? extends NSNumber> caseAuthenticatedTags,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    /**
     * Create an X.509 DER encoded certificate that has the
     * right fields to be a valid Matter operational certificate.
     * 
     * signingKeypair and signingCertificate are the root or intermediate that is
     * signing the operational certificate.
     * 
     * nodeID and fabricID are expected to be 64-bit unsigned integers.
     * 
     * nodeID must be a valid Matter operational node id.
     * 
     * fabricID must be a valid Matter fabric id.
     * 
     * caseAuthenticatedTags may be nil to indicate no CASE Authenticated Tags
     * should be used. If caseAuthenticatedTags is not nil, it must contain at most
     * 3 numbers, which are expected to be 32-bit unsigned Case Authenticated Tag
     * values.
     * 
     * validityPeriod specifies when the certificate will be valid. A certificate
     * with no expiration time can be created by specifying [NSDate distantFuture]
     * for the end of the period.
     * 
     * On failure returns nil and if "error" is not null sets *error to the relevant
     * error.
     * 
     * API-Since: 16.6
     */
    @Generated
    @Selector("createOperationalCertificate:signingCertificate:operationalPublicKey:fabricID:nodeID:caseAuthenticatedTags:validityPeriod:error:")
    @Nullable
    public static native NSData createOperationalCertificateSigningCertificateOperationalPublicKeyFabricIDNodeIDCaseAuthenticatedTagsValidityPeriodError(
            @Mapped(ObjCObjectMapper.class) @NotNull MTRKeypair signingKeypair, @NotNull NSData signingCertificate,
            @NotNull SecKeyRef operationalPublicKey, @NotNull NSNumber fabricID, @NotNull NSNumber nodeID,
            @Nullable NSSet<? extends NSNumber> caseAuthenticatedTags, @NotNull NSDateInterval validityPeriod,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    /**
     * As above, but defaults to no expiration time.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("createRootCertificate:issuerID:fabricID:error:")
    @Nullable
    public static native NSData createRootCertificateIssuerIDFabricIDError(
            @Mapped(ObjCObjectMapper.class) @NotNull MTRKeypair keypair, @Nullable NSNumber issuerID,
            @Nullable NSNumber fabricID, @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    /**
     * Create a root (self-signed) X.509 DER encoded certificate that has the
     * right fields to be a valid Matter root certificate.
     * 
     * If issuerID is not nil, it's unsignedLongLongValue will be used for the
     * matter-rcac-id attribute in the subject distinguished name of the resulting
     * certificate.
     * 
     * If issuerID is nil, a random value will be generated for matter-rcac-id.
     * 
     * If fabricID is not nil, it will be included in the subject DN of the
     * certificate. In this case it must be a valid Matter fabric id.
     * 
     * validityPeriod specifies when the certificate will be valid. Note that
     * there is currently no mechanism available in Matter to update or rotate
     * the root certificate of a fabric installed on a device. A certificate with
     * no expiration time can be created by specifying [NSDate distantFuture] for
     * the end of the period.
     * 
     * On failure returns nil and if "error" is not null sets *error to the relevant
     * error.
     * 
     * API-Since: 16.6
     */
    @Generated
    @Selector("createRootCertificate:issuerID:fabricID:validityPeriod:error:")
    @Nullable
    public static native NSData createRootCertificateIssuerIDFabricIDValidityPeriodError(
            @Mapped(ObjCObjectMapper.class) @NotNull MTRKeypair keypair, @Nullable NSNumber issuerID,
            @Nullable NSNumber fabricID, @NotNull NSDateInterval validityPeriod,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use createCertificateSigningRequest:error:
     */
    @Generated
    @Deprecated
    @Selector("generateCertificateSigningRequest:error:")
    @Nullable
    public static native NSData generateCertificateSigningRequestError(
            @Mapped(ObjCObjectMapper.class) @NotNull MTRKeypair keypair,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * createIntermediateCertificate:rootCertificate:intermediatePublicKey:issuerID:fabricID:error:
     */
    @Generated
    @Deprecated
    @Selector("generateIntermediateCertificate:rootCertificate:intermediatePublicKey:issuerId:fabricId:error:")
    @Nullable
    public static native NSData generateIntermediateCertificateRootCertificateIntermediatePublicKeyIssuerIdFabricIdError(
            @Mapped(ObjCObjectMapper.class) @NotNull MTRKeypair rootKeypair, @NotNull NSData rootCertificate,
            @NotNull SecKeyRef intermediatePublicKey, @Nullable NSNumber issuerId, @Nullable NSNumber fabricId,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Plase use
     * createOperationalCertificate:signingCertificate:operationalPublicKey:fabricID:nodeID:caseAuthenticatedTags:error:
     */
    @Generated
    @Deprecated
    @Selector("generateOperationalCertificate:signingCertificate:operationalPublicKey:fabricId:nodeId:caseAuthenticatedTags:error:")
    @Nullable
    public static native NSData generateOperationalCertificateSigningCertificateOperationalPublicKeyFabricIdNodeIdCaseAuthenticatedTagsError(
            @Mapped(ObjCObjectMapper.class) @NotNull MTRKeypair signingKeypair, @NotNull NSData signingCertificate,
            @NotNull SecKeyRef operationalPublicKey, @NotNull NSNumber fabricId, @NotNull NSNumber nodeId,
            @Nullable NSArray<? extends NSNumber> caseAuthenticatedTags,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use createRootCertificate:issuerID:fabricID:error:
     */
    @Generated
    @Deprecated
    @Selector("generateRootCertificate:issuerId:fabricId:error:")
    @Nullable
    public static native NSData generateRootCertificateIssuerIdFabricIdError(
            @Mapped(ObjCObjectMapper.class) @NotNull MTRKeypair keypair, @Nullable NSNumber issuerId,
            @Nullable NSNumber fabricId, @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MTRCertificates init();

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

    /**
     * Check whether two X.509 DER encoded certificates are equivalent, in the sense
     * of having the same public key and the same subject DN. Returns NO if public
     * keys or subject DNs cannot be extracted from the certificates.
     */
    @Generated
    @Selector("isCertificate:equalTo:")
    public static native boolean isCertificateEqualTo(@NotNull NSData certificate1, @NotNull NSData certificate2);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * Check whether the given keypair's public key matches the given certificate's
     * public key. The certificate is expected to be an X.509 DER encoded
     * certificate.
     * 
     * Will return NO on failures to extract public keys from the objects.
     */
    @Generated
    @Selector("keypair:matchesCertificate:")
    public static native boolean keypairMatchesCertificate(@Mapped(ObjCObjectMapper.class) @NotNull MTRKeypair keypair,
            @NotNull NSData certificate);

    @Generated
    @Owned
    @Selector("new")
    public static native MTRCertificates new_objc();

    /**
     * Extract the public key from the given PKCS#10 certificate signing request.
     * This is the public key that a certificate issued in response to the request
     * would need to have.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("publicKeyFromCSR:error:")
    @Nullable
    public static native NSData publicKeyFromCSRError(@NotNull NSData csr,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

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