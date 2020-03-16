package apple.foundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class NSURLSessionWebSocketCloseCode {
    @Generated
    private NSURLSessionWebSocketCloseCode() {
    }

    @Generated @NInt public static final long Invalid = 0x0000000000000000L;
    @Generated @NInt public static final long NormalClosure = 0x00000000000003E8L;
    @Generated @NInt public static final long GoingAway = 0x00000000000003E9L;
    @Generated @NInt public static final long ProtocolError = 0x00000000000003EAL;
    @Generated @NInt public static final long UnsupportedData = 0x00000000000003EBL;
    @Generated @NInt public static final long NoStatusReceived = 0x00000000000003EDL;
    @Generated @NInt public static final long AbnormalClosure = 0x00000000000003EEL;
    @Generated @NInt public static final long InvalidFramePayloadData = 0x00000000000003EFL;
    @Generated @NInt public static final long PolicyViolation = 0x00000000000003F0L;
    @Generated @NInt public static final long MessageTooBig = 0x00000000000003F1L;
    @Generated @NInt public static final long MandatoryExtensionMissing = 0x00000000000003F2L;
    @Generated @NInt public static final long InternalServerError = 0x00000000000003F3L;
    @Generated @NInt public static final long TLSHandshakeFailure = 0x00000000000003F7L;
}