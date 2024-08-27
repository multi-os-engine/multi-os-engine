package apple.matter.protocol;

import apple.foundation.NSError;
import apple.matter.MTRDeviceAttestationInfo;
import apple.matter.MTRDeviceController;
import apple.matter.MTROperationalCSRInfo;
import apple.matter.MTROperationalCertificateChain;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * API-Since: 16.4
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTROperationalCertificateIssuer")
public interface MTROperationalCertificateIssuer {
    /**
     * When an MTROperationalCertificateIssuer is set for an
     * MTRDeviceController, it will be used to issue operational certificates as
     * needed during commissioning.
     * 
     * Commissioning will pause when
     * issueOperationalCertificateForRequest:attestationInfo:completion: is called,
     * and resume when the completion is invoked with a non-nil
     * MTROperationalCertificateChain. When the completion is invoked with an error,
     * commissioning will fail.
     * 
     * This will be called on the dispatch queue passed as
     * operationalCertificateIssuerQueue in the MTRDeviceControllerFactoryParams.
     * 
     * The csrNonce in the provided MTROperationalCSRInfo will be the nonce that was
     * sent in the CSRRequest command, which will be guaranteed, at this point, to
     * match the nonce in the CSRResponse command.
     */
    @Generated
    @Selector("issueOperationalCertificateForRequest:attestationInfo:controller:completion:")
    void issueOperationalCertificateForRequestAttestationInfoControllerCompletion(
            @NotNull MTROperationalCSRInfo csrInfo, @NotNull MTRDeviceAttestationInfo attestationInfo,
            @NotNull MTRDeviceController controller,
            @ObjCBlock(name = "call_issueOperationalCertificateForRequestAttestationInfoControllerCompletion") @NotNull Block_issueOperationalCertificateForRequestAttestationInfoControllerCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_issueOperationalCertificateForRequestAttestationInfoControllerCompletion {
        @Generated
        void call_issueOperationalCertificateForRequestAttestationInfoControllerCompletion(
                @Nullable MTROperationalCertificateChain info, @Nullable NSError error);
    }

    /**
     * A way for MTROperationalCertificateIssuer to control whether it wants the
     * Matter framework to perform device attestation checks that require trust
     * anchors. If this returns NO, then productAttestationAuthorityCertificates
     * should be passed in via MTRDeviceControllerFactoryParams, as well as any
     * desired additional certificationDeclarationCertificates.
     * 
     * If this returns YES, then all device attestation checks that require some
     * sort of trust anchors are delegated to this MTROperationalCertificateIssuer,
     * which can use the arguments passed to
     * issueOperationalCertificateForRequest:attestationInfo:controller:completion:
     * to perform the checks.
     * 
     * Specifically, the following device attestation checks are not performed and
     * must be done by the MTROperationalCertificateIssuer:
     * 
     * (1) Make sure the PAA is valid and approved by CSA.
     * (2) VID-scoped PAA check: if the PAA is VID scoped, then its VID must match the DAC VID.
     * (3) cert chain check: verify PAI is signed by PAA, and DAC is signed by PAI.
     * (4) PAA subject key id extraction: the PAA subject key must match the PAA key referenced in the PAI.
     * (5) CD signature check: make sure a valid CSA CD key is used to sign the CD.
     * 
     * This will be read on an arbitrary queue and must not block or call any
     * Matter APIs.
     */
    @Generated
    @Selector("shouldSkipAttestationCertificateValidation")
    boolean shouldSkipAttestationCertificateValidation();
}