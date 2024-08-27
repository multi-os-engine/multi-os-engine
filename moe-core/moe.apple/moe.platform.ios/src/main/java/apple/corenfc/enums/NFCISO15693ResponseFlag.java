package apple.corenfc.enums;

import org.moe.natj.general.ann.Generated;

/**
 * API-Since: 14.0
 */
@Generated
public final class NFCISO15693ResponseFlag {
    @Generated
    private NFCISO15693ResponseFlag() {
    }

    /**
     * API-Since: 14.0
     */
    @Generated public static final byte Error = 1;
    /**
     * API-Since: 14.0
     */
    @Generated public static final byte ResponseBufferValid = 2;
    /**
     * API-Since: 14.0
     */
    @Generated public static final byte FinalResponse = 4;
    /**
     * API-Since: 14.0
     */
    @Generated public static final byte ProtocolExtension = 8;
    /**
     * API-Since: 14.0
     */
    @Generated public static final byte BlockSecurityStatusBit5 = 16;
    /**
     * API-Since: 14.0
     */
    @Generated public static final byte BlockSecurityStatusBit6 = 32;
    /**
     * API-Since: 14.0
     */
    @Generated public static final byte WaitTimeExtension = 64;
}