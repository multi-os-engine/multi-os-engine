package apple.avfaudio.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * [@enum] AVAudioCommonFormat
 * [@constant] AVAudioOtherFormat
 * A format other than one of the common ones below.
 * [@constant] AVAudioPCMFormatFloat32
 * Native-endian floats (this is the standard format).
 * [@constant] AVAudioPCMFormatFloat64
 * Native-endian doubles.
 * [@constant] AVAudioPCMFormatInt16
 * Signed 16-bit native-endian integers.
 * [@constant] AVAudioPCMFormatInt32
 * Signed 32-bit native-endian integers.
 * 
 * API-Since: 8.0
 */
@Generated
public final class AVAudioCommonFormat {
    @Generated
    private AVAudioCommonFormat() {
    }

    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long OtherFormat = 0x0000000000000000L;
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long PCMFormatFloat32 = 0x0000000000000001L;
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long PCMFormatFloat64 = 0x0000000000000002L;
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long PCMFormatInt16 = 0x0000000000000003L;
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long PCMFormatInt32 = 0x0000000000000004L;
}
