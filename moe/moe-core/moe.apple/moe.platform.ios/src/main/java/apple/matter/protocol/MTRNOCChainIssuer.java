package apple.matter.protocol;

import apple.foundation.NSData;
import apple.foundation.NSError;
import apple.foundation.NSNumber;
import apple.matter.AttestationInfo;
import apple.matter.CSRInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * API-Since: 16.1
 * Deprecated-Since: 16.4
 * Deprecated-Message: Please use MTROperationalCertificateIssuer
 */
@Generated
@Deprecated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTRNOCChainIssuer")
public interface MTRNOCChainIssuer {
    @Generated
    @Selector("onNOCChainGenerationNeeded:attestationInfo:onNOCChainGenerationComplete:")
    void onNOCChainGenerationNeededAttestationInfoOnNOCChainGenerationComplete(@NotNull CSRInfo csrInfo,
            @NotNull AttestationInfo attestationInfo,
            @ObjCBlock(name = "call_onNOCChainGenerationNeededAttestationInfoOnNOCChainGenerationComplete") @NotNull Block_onNOCChainGenerationNeededAttestationInfoOnNOCChainGenerationComplete onNOCChainGenerationComplete);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_onNOCChainGenerationNeededAttestationInfoOnNOCChainGenerationComplete {
        @Generated
        void call_onNOCChainGenerationNeededAttestationInfoOnNOCChainGenerationComplete(@NotNull NSData arg0,
                @NotNull NSData arg1, @NotNull NSData arg2, @Nullable NSData arg3, @Nullable NSNumber arg4,
                @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> arg5);
    }
}