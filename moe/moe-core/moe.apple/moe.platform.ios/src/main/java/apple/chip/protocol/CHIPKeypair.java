package apple.chip.protocol;

import apple.foundation.NSData;
import apple.security.opaque.SecKeyRef;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("CHIP")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CHIPKeypair")
public interface CHIPKeypair {
    /**
     * A function to sign a hash using ECDSA
     *
     * @param hash Hash that needs to be signed
     * @return Returns A signature that consists of: 2 EC elements (r and s), in raw <r,s> point form (see SEC1).
     */
    @Generated
    @Selector("ECDSA_sign_hash:")
    NSData ECDSA_sign_hash(NSData hash);

    /**
     * Initialize the keypair.
     *
     * @return Should return whether or not the keypair was successfully initialized
     */
    @Generated
    @Selector("initialize")
    boolean initialize();

    /**
     * Return public key for the keypair.
     */
    @Generated
    @Selector("pubkey")
    SecKeyRef pubkey();
}
