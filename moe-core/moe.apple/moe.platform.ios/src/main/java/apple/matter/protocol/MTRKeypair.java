package apple.matter.protocol;

import apple.foundation.NSData;
import apple.security.opaque.SecKeyRef;
import org.jetbrains.annotations.NotNull;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * This protocol is used by the Matter framework to sign messages with a private
 * key and verify signatures with a public key.
 * 
 * The Matter framework may call keypair methods from arbitrary threads and
 * concurrently.
 * 
 * Implementations of the keypair methods must not call into any Matter
 * framework APIs.
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTRKeypair")
public interface MTRKeypair {
    /**
     * Return public key for the keypair.
     */
    @Generated
    @Selector("publicKey")
    @NotNull
    SecKeyRef publicKey();

    /**
     * A function to sign a message using ECDSA
     * 
     * @param message Message that needs to be signed
     * 
     * @return An ASN.1 DER-encoded signature (per X9.62).
     * 
     *         Either this selector or signMessageECDSA_RAW must be supported by a
     *         MTRKeypair.
     */
    @Generated
    @IsOptional
    @Selector("signMessageECDSA_DER:")
    @NotNull
    default NSData signMessageECDSA_DER(@NotNull NSData message) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * A function to sign a message using ECDSA
     * 
     * @param message Message that needs to be signed
     * 
     * @return A signature that consists of: 2 EC elements (r and s), in raw <r,s>
     *         point form (see SEC1). Sometimes also called RFC 4754 form or P1363
     *         form.
     * 
     *         Either this selector or signMessageECDSA_DER must be supported by a
     *         MTRKeypair.
     */
    @Generated
    @IsOptional
    @Selector("signMessageECDSA_RAW:")
    @NotNull
    default NSData signMessageECDSA_RAW(@NotNull NSData message) {
        throw new java.lang.UnsupportedOperationException();
    }
}