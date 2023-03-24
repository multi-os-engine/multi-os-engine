package apple.passkit.protocol;

import apple.passkit.PKBarcodeEventConfigurationRequest;
import apple.passkit.PKBarcodeEventMetadataRequest;
import apple.passkit.PKBarcodeEventMetadataResponse;
import apple.passkit.PKBarcodeEventSignatureRequest;
import apple.passkit.PKBarcodeEventSignatureResponse;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;

@Generated
@Library("PassKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("PKPaymentInformationRequestHandling")
public interface PKPaymentInformationRequestHandling {
    @Generated
    @Selector("handleConfigurationRequest:completion:")
    void handleConfigurationRequestCompletion(@NotNull PKBarcodeEventConfigurationRequest configurationRequest,
            @NotNull @ObjCBlock(name = "call_handleConfigurationRequestCompletion") Block_handleConfigurationRequestCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleConfigurationRequestCompletion {
        @Generated
        void call_handleConfigurationRequestCompletion();
    }

    @Generated
    @Selector("handleInformationRequest:completion:")
    void handleInformationRequestCompletion(@NotNull PKBarcodeEventMetadataRequest infoRequest,
            @NotNull @ObjCBlock(name = "call_handleInformationRequestCompletion") Block_handleInformationRequestCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleInformationRequestCompletion {
        @Generated
        void call_handleInformationRequestCompletion(@NotNull PKBarcodeEventMetadataResponse arg0);
    }

    @Generated
    @Selector("handleSignatureRequest:completion:")
    void handleSignatureRequestCompletion(@NotNull PKBarcodeEventSignatureRequest signatureRequest,
            @NotNull @ObjCBlock(name = "call_handleSignatureRequestCompletion") Block_handleSignatureRequestCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleSignatureRequestCompletion {
        @Generated
        void call_handleSignatureRequestCompletion(@NotNull PKBarcodeEventSignatureResponse arg0);
    }
}