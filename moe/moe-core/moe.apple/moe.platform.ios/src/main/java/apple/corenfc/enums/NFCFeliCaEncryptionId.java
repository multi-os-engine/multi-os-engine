package apple.corenfc.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Encryption Identifier parameter in response of Request Service V2
 */
@Generated
public final class NFCFeliCaEncryptionId {
    @Generated
    private NFCFeliCaEncryptionId() {
    }

    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long NFCFeliCaEncryptionIdAES = 0x000000000000004FL;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long NFCFeliCaEncryptionIdAES_DES = 0x0000000000000041L;
    /**
     * API-Since: 13.0
     * Deprecated-Since: 14.0
     */
    @Deprecated @Generated @NInt public static final long EncryptionIdAES = 0x000000000000004FL;
    /**
     * API-Since: 13.0
     * Deprecated-Since: 14.0
     */
    @Deprecated @Generated @NInt public static final long EncryptionIdAES_DES = 0x0000000000000041L;
}