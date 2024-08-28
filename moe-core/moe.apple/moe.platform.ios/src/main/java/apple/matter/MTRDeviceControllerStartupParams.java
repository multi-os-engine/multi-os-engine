package apple.matter;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.matter.protocol.MTRKeypair;
import apple.matter.protocol.MTROperationalCertificateIssuer;
import apple.opaque.dispatch_queue_t;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRDeviceControllerStartupParams extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRDeviceControllerStartupParams(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRDeviceControllerStartupParams alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRDeviceControllerStartupParams allocWithZone(VoidPtr zone);

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

    /**
     * CASE authenticated tags to use for this controller's operational certificate.
     * 
     * Only allowed to be not nil if nodeID is not nil. In particular, if
     * operationalCertificate is not nil, must be nil. The provided operational
     * certificate will be used as-is.
     * 
     * If not nil, must contain at most 3 numbers, which are expected to be 32-bit
     * unsigned Case Authenticated Tag values.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("caseAuthenticatedTags")
    @Nullable
    public native NSSet<? extends NSNumber> caseAuthenticatedTags();

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    @NotNull
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    @NotNull
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Fabric id for the controller. Must be set to a nonzero value. This is
     * scoped by the root public key, which is determined as follows:
     * 
     * * If a root certificate is provided, it is the public key of the root
     * certificate.
     * 
     * * If a root certificate is not provided, the root public key is the public
     * key of the nocSigner keypair, since in this case we are not using an
     * intermediate certificate.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("fabricID")
    @NotNull
    public native NSNumber fabricID();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use fabricID
     */
    @Generated
    @Deprecated
    @Selector("fabricId")
    public native long fabricId();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MTRDeviceControllerStartupParams init();

    /**
     * * Prepare to initialize a controller given a keypair to use for signing
     * * operational certificates.
     * *
     * * A controller created from MTRDeviceControllerStartupParams initialized with
     * * this method will be able to issue operational certificates to devices it
     * * commissions, using nocSigner to sign them.
     * 
     * * @param ipk The Identity Protection Key, must be 16 bytes in length
     * * @param fabricID The fabric identifier, must be non-zero.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("initWithIPK:fabricID:nocSigner:")
    public native MTRDeviceControllerStartupParams initWithIPKFabricIDNocSigner(@NotNull NSData ipk,
            @NotNull NSNumber fabricID, @Mapped(ObjCObjectMapper.class) @NotNull MTRKeypair nocSigner);

    /**
     * Prepare to initialize a controller that is not able to sign operational
     * certificates itself, and therefore needs to be provided with a complete
     * operational certificate chain. This initialization method should be used
     * when none of the certificate-signing private keys are available locally.
     * 
     * A controller created from MTRDeviceControllerStartupParams initialized with
     * this method will not be able to commission devices unless
     * operationalCertificateIssuer and operationalCertificateIssuerQueue are set.
     * 
     * The fabric id and node id to use for the controller will be derived from the provided
     * operationalCertificate.
     * 
     * @param ipk                     The Identity Protection Key, must be 16 bytes in length
     * @param intermediateCertificate may be nil if operationalCertificate is directly signed by rootCertificate.
     * 
     *                                API-Since: 16.4
     */
    @Generated
    @Selector("initWithIPK:operationalKeypair:operationalCertificate:intermediateCertificate:rootCertificate:")
    public native MTRDeviceControllerStartupParams initWithIPKOperationalKeypairOperationalCertificateIntermediateCertificateRootCertificate(
            @NotNull NSData ipk, @Mapped(ObjCObjectMapper.class) @NotNull MTRKeypair operationalKeypair,
            @NotNull NSData operationalCertificate, @Nullable NSData intermediateCertificate,
            @NotNull NSData rootCertificate);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * initWithIPK:operationalKeypair:operationalCertificate:intermediateCertificate:rootCertificate:
     */
    @Generated
    @Deprecated
    @Selector("initWithOperationalKeypair:operationalCertificate:intermediateCertificate:rootCertificate:ipk:")
    public native MTRDeviceControllerStartupParams initWithOperationalKeypairOperationalCertificateIntermediateCertificateRootCertificateIpk(
            @Mapped(ObjCObjectMapper.class) @NotNull MTRKeypair operationalKeypair,
            @NotNull NSData operationalCertificate, @Nullable NSData intermediateCertificate,
            @NotNull NSData rootCertificate, @NotNull NSData ipk);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use initWithIPK:fabricID:nocSigner:
     */
    @Generated
    @Deprecated
    @Selector("initWithSigningKeypair:fabricId:ipk:")
    public native MTRDeviceControllerStartupParams initWithSigningKeypairFabricIdIpk(
            @Mapped(ObjCObjectMapper.class) @NotNull MTRKeypair nocSigner, long fabricId, @NotNull NSData ipk);

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
     * Intermediate certificate, in X.509 DER form, to use.
     * 
     * If not nil, rootCertificate must not be nil, and the intermediate certificate
     * must be signed by rootCertificate.
     * 
     * If not nil, and nocSigner is not nil, the public key of this certificate must
     * match the public key of nocSigner.
     * 
     * When creating a new fabric:
     * 
     * * Must not be nil if an intermediate CA is being used.
     * 
     * * Must be nil if an intermediate CA is not being used.
     * 
     * When using an existing fabric:
     * 
     * * If not nil, will be used as the intermediate certificate for issuing
     * operational certificates.
     * 
     * * If nil:
     * 
     * * If nocSigner is not nil, there is an existing intermediate certificate,
     * and it matches the nocSigner public key, the existing intermediate
     * certificate will be used.
     * 
     * * Otherwise the fabric will not use an intermediate certificate. This
     * allows switching from using an intermediate CA to not using one.
     */
    @Generated
    @Selector("intermediateCertificate")
    @Nullable
    public native NSData intermediateCertificate();

    /**
     * IPK to use for the controller's fabric. Allowed to change from the last time
     * a controller was started on this fabric if a new IPK has been distributed to
     * all the devices the controller wants to interact with.
     */
    @Generated
    @Selector("ipk")
    @NotNull
    public native NSData ipk();

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
    public static native MTRDeviceControllerStartupParams new_objc();

    /**
     * Keypair used to sign operational certificates. This is the root CA keypair
     * if not using an intermediate CA, the intermediate CA's keypair otherwise.
     * 
     * Allowed to be nil if this controller will not be issuing internally-generated
     * operational certificates. In that case, the MTRDeviceControllerStartupParams
     * object must be initialized using
     * initWithIPK:operationalKeypair:operationalCertificate:intermediateCertificate:rootCertificate:
     * (to provide the operational credentials for t2he controller itself).
     */
    @Generated
    @Selector("nocSigner")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    public native MTRKeypair nocSigner();

    /**
     * Node id for this controller.
     * 
     * If operationalCertificate is not nil, must be nil. The provided operational
     * certificate will be used as-is.
     * 
     * If not nil, must be a valid Matter operational node id.
     * 
     * If operationalCertificate is nil, nodeID and operationalKeypair are used to
     * determine an operational certificate, as follows:
     * 
     * * When creating a new fabric:
     * 
     * ** nodeID is allowed to be nil to indicate that a random node id should be
     * generated.
     * 
     * * When using an existing fabric:
     * 
     * ** nodeID is allowed to be nil to indicate that the existing operational node
     * id should be used. The existing operational keys will also be used,
     * unless operationalKeypair is provided. The existing caseAuthenticatedTags
     * will be used.
     * 
     * ** If nodeID is not nil, a new operational certificate will be generated for
     * the provided node id (even if that matches the existing node id), using
     * either the operationalKeypair if that is provided or a new randomly
     * generated operational key, and using the provided caseAuthenticatedTags.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("nodeID")
    @Nullable
    public native NSNumber nodeID();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use nodeID
     */
    @Generated
    @Deprecated
    @Selector("nodeId")
    @Nullable
    public native NSNumber nodeId();

    /**
     * Operational certificate, in X.509 DER form, to use.
     * 
     * If not nil, will be used as the operational certificate. In this case
     * operationalKeypair must not be nil.
     * 
     * If nil, an operational certificate will be determined as described in the
     * documentation for nodeID.
     */
    @Generated
    @Selector("operationalCertificate")
    @Nullable
    public native NSData operationalCertificate();

    /**
     * The certificate issuer delegate to use for issuing operational certificates
     * when commmissioning devices. Allowed to be nil if this controller either
     * does not issue operational certificates at all or internally generates the
     * certificates to be issued. In the latter case, nocSigner must not be nil.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("operationalCertificateIssuer")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    public native MTROperationalCertificateIssuer operationalCertificateIssuer();

    /**
     * The dispatch queue on which operationalCertificateIssuer should be called.
     * Allowed to be nil if and only if operationalCertificateIssuer is nil.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("operationalCertificateIssuerQueue")
    @Nullable
    public native dispatch_queue_t operationalCertificateIssuerQueue();

    /**
     * Operational keypair to use. If operationalCertificate is not nil, the public
     * key must match operationalCertificate.
     * 
     * If not nil, and if operationalCertificate is nil, a new operational
     * certificate will be generated for the given operationalKeypair. The node id
     * for that certificate will be determined as described in the documentation for
     * nodeID.
     */
    @Generated
    @Selector("operationalKeypair")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    public native MTRKeypair operationalKeypair();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Root certificate, in X.509 DER form, to use.
     * 
     * Must not be nil if an intermediate CA is being used, to allow determination
     * of the root public key.
     * 
     * If not nil, and if an intermediate CA is not being used, the public key of
     * this certificate must match the public key of nocSigner, if nocSigner is not
     * nil.
     * 
     * When creating a new fabric:
     * 
     * * May be nil if nocSigner is not nil and an intermediate CA is not being
     * used. In that case the nocSigner keypair, which is the keypair for the
     * root certificate, will be used to generate and sign a root certificate,
     * with a random issuer id. In this case, the fabricID will be included in
     * the root certificate's subject DN.
     * 
     * When using an existing fabric:
     * 
     * * May be nil if nocSigner is not nil and an intermediate CA is not being
     * used. In that case, the existing root certificate for the fabric will be
     * used.
     * 
     * * If not nil must satisfy the following properties:
     * 
     * 1) The public key must match the public key of the existing root
     * certificate.
     * 2) The subject DN must match the subject DN of the existing root
     * certificate.
     */
    @Generated
    @Selector("rootCertificate")
    @Nullable
    public native NSData rootCertificate();

    /**
     * CASE authenticated tags to use for this controller's operational certificate.
     * 
     * Only allowed to be not nil if nodeID is not nil. In particular, if
     * operationalCertificate is not nil, must be nil. The provided operational
     * certificate will be used as-is.
     * 
     * If not nil, must contain at most 3 numbers, which are expected to be 32-bit
     * unsigned Case Authenticated Tag values.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("setCaseAuthenticatedTags:")
    public native void setCaseAuthenticatedTags(@Nullable NSSet<? extends NSNumber> value);

    /**
     * Intermediate certificate, in X.509 DER form, to use.
     * 
     * If not nil, rootCertificate must not be nil, and the intermediate certificate
     * must be signed by rootCertificate.
     * 
     * If not nil, and nocSigner is not nil, the public key of this certificate must
     * match the public key of nocSigner.
     * 
     * When creating a new fabric:
     * 
     * * Must not be nil if an intermediate CA is being used.
     * 
     * * Must be nil if an intermediate CA is not being used.
     * 
     * When using an existing fabric:
     * 
     * * If not nil, will be used as the intermediate certificate for issuing
     * operational certificates.
     * 
     * * If nil:
     * 
     * * If nocSigner is not nil, there is an existing intermediate certificate,
     * and it matches the nocSigner public key, the existing intermediate
     * certificate will be used.
     * 
     * * Otherwise the fabric will not use an intermediate certificate. This
     * allows switching from using an intermediate CA to not using one.
     */
    @Generated
    @Selector("setIntermediateCertificate:")
    public native void setIntermediateCertificate(@Nullable NSData value);

    /**
     * Node id for this controller.
     * 
     * If operationalCertificate is not nil, must be nil. The provided operational
     * certificate will be used as-is.
     * 
     * If not nil, must be a valid Matter operational node id.
     * 
     * If operationalCertificate is nil, nodeID and operationalKeypair are used to
     * determine an operational certificate, as follows:
     * 
     * * When creating a new fabric:
     * 
     * ** nodeID is allowed to be nil to indicate that a random node id should be
     * generated.
     * 
     * * When using an existing fabric:
     * 
     * ** nodeID is allowed to be nil to indicate that the existing operational node
     * id should be used. The existing operational keys will also be used,
     * unless operationalKeypair is provided. The existing caseAuthenticatedTags
     * will be used.
     * 
     * ** If nodeID is not nil, a new operational certificate will be generated for
     * the provided node id (even if that matches the existing node id), using
     * either the operationalKeypair if that is provided or a new randomly
     * generated operational key, and using the provided caseAuthenticatedTags.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("setNodeID:")
    public native void setNodeID(@Nullable NSNumber value);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use nodeID
     */
    @Generated
    @Deprecated
    @Selector("setNodeId:")
    public native void setNodeId(@Nullable NSNumber value);

    /**
     * The certificate issuer delegate to use for issuing operational certificates
     * when commmissioning devices. Allowed to be nil if this controller either
     * does not issue operational certificates at all or internally generates the
     * certificates to be issued. In the latter case, nocSigner must not be nil.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("setOperationalCertificateIssuer:")
    public native void setOperationalCertificateIssuer(
            @Mapped(ObjCObjectMapper.class) @Nullable MTROperationalCertificateIssuer value);

    /**
     * The dispatch queue on which operationalCertificateIssuer should be called.
     * Allowed to be nil if and only if operationalCertificateIssuer is nil.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("setOperationalCertificateIssuerQueue:")
    public native void setOperationalCertificateIssuerQueue(@Nullable dispatch_queue_t value);

    /**
     * Operational keypair to use. If operationalCertificate is not nil, the public
     * key must match operationalCertificate.
     * 
     * If not nil, and if operationalCertificate is nil, a new operational
     * certificate will be generated for the given operationalKeypair. The node id
     * for that certificate will be determined as described in the documentation for
     * nodeID.
     */
    @Generated
    @Selector("setOperationalKeypair:")
    public native void setOperationalKeypair(@Mapped(ObjCObjectMapper.class) @Nullable MTRKeypair value);

    /**
     * Root certificate, in X.509 DER form, to use.
     * 
     * Must not be nil if an intermediate CA is being used, to allow determination
     * of the root public key.
     * 
     * If not nil, and if an intermediate CA is not being used, the public key of
     * this certificate must match the public key of nocSigner, if nocSigner is not
     * nil.
     * 
     * When creating a new fabric:
     * 
     * * May be nil if nocSigner is not nil and an intermediate CA is not being
     * used. In that case the nocSigner keypair, which is the keypair for the
     * root certificate, will be used to generate and sign a root certificate,
     * with a random issuer id. In this case, the fabricID will be included in
     * the root certificate's subject DN.
     * 
     * When using an existing fabric:
     * 
     * * May be nil if nocSigner is not nil and an intermediate CA is not being
     * used. In that case, the existing root certificate for the fabric will be
     * used.
     * 
     * * If not nil must satisfy the following properties:
     * 
     * 1) The public key must match the public key of the existing root
     * certificate.
     * 2) The subject DN must match the subject DN of the existing root
     * certificate.
     */
    @Generated
    @Selector("setRootCertificate:")
    public native void setRootCertificate(@Nullable NSData value);

    /**
     * Vendor ID (allocated by the Connectivity Standards Alliance) for
     * this controller.
     * 
     * If not nil, must not be the "standard" vendor id (0).
     * 
     * When creating a new fabric:
     * 
     * * Must not be nil.
     * 
     * When using an existing fabric:
     * 
     * * Will override existing value if not nil. Otherwise existing value will be
     * used.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("setVendorID:")
    public native void setVendorID(@Nullable NSNumber value);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use vendorID
     */
    @Generated
    @Deprecated
    @Selector("setVendorId:")
    public native void setVendorId(@Nullable NSNumber value);

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

    /**
     * Vendor ID (allocated by the Connectivity Standards Alliance) for
     * this controller.
     * 
     * If not nil, must not be the "standard" vendor id (0).
     * 
     * When creating a new fabric:
     * 
     * * Must not be nil.
     * 
     * When using an existing fabric:
     * 
     * * Will override existing value if not nil. Otherwise existing value will be
     * used.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("vendorID")
    @Nullable
    public native NSNumber vendorID();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use vendorID
     */
    @Generated
    @Deprecated
    @Selector("vendorId")
    @Nullable
    public native NSNumber vendorId();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}