package apple.foundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * The WebSocket close codes follow the close codes given in the RFC
 * 
 * API-Since: 13.0
 */
@Generated
public final class NSURLSessionWebSocketCloseCode {
    @Generated
    private NSURLSessionWebSocketCloseCode() {
    }

    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long Invalid = 0x0000000000000000L;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long NormalClosure = 0x00000000000003E8L;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long GoingAway = 0x00000000000003E9L;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long ProtocolError = 0x00000000000003EAL;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long UnsupportedData = 0x00000000000003EBL;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long NoStatusReceived = 0x00000000000003EDL;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long AbnormalClosure = 0x00000000000003EEL;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long InvalidFramePayloadData = 0x00000000000003EFL;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long PolicyViolation = 0x00000000000003F0L;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long MessageTooBig = 0x00000000000003F1L;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long MandatoryExtensionMissing = 0x00000000000003F2L;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long InternalServerError = 0x00000000000003F3L;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long TLSHandshakeFailure = 0x00000000000003F7L;
}