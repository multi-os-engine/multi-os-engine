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

    @Generated @NInt public static final long NFCFeliCaEncryptionIdAES = 0x000000000000004FL;
    @Generated @NInt public static final long NFCFeliCaEncryptionIdAES_DES = 0x0000000000000041L;
    @Generated @NInt public static final long EncryptionIdAES = 0x000000000000004FL;
    @Generated @NInt public static final long EncryptionIdAES_DES = 0x0000000000000041L;
}