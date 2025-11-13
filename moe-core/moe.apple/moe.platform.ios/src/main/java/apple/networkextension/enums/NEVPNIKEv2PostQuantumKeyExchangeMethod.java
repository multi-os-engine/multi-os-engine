package apple.networkextension.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@typedef] NEVPNIKEv2PostQuantumKeyExchangeMethod
 * 
 * IKEv2 post-quantum key exchange methods
 * 
 * API-Since: 26.0
 */
@Generated
public final class NEVPNIKEv2PostQuantumKeyExchangeMethod {
    @Generated
    private NEVPNIKEv2PostQuantumKeyExchangeMethod() {
    }

    /**
     * [@const] NEVPNIKEv2PostQuantumKeyExchangeMethodNone Do not perform a post-quantum key exchange
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long MethodNone = 0x0000000000000000L;
    /**
     * [@const] NEVPNIKEv2PostQuantumKeyExchangeMethod36 Post-Quantum Key Exchange method 36 (ML-KEM-768)
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Method36 = 0x0000000000000024L;
    /**
     * [@const] NEVPNIKEv2PostQuantumKeyExchangeMethod37 Post-Quantum Key Exchange method 37 (ML-KEM-1024)
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Method37 = 0x0000000000000025L;
}