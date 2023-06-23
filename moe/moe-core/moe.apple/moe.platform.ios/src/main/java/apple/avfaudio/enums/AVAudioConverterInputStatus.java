package apple.avfaudio.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] AVAudioConverterInputStatus
 * 
 * You must return one of these codes from your AVAudioConverterInputBlock.
 * 
 * API-Since: 9.0
 */
@Generated
public final class AVAudioConverterInputStatus {
    @Generated
    private AVAudioConverterInputStatus() {
    }

    /**
     * This is the normal case where you supply data to the converter.
     * 
     * API-Since: 9.0
     */
    @Generated @NInt public static final long HaveData = 0x0000000000000000L;
    /**
     * If you are out of data for now, set *ioNumberOfPackets = 0 and return
     * AVAudioConverterInputStatus_NoDataNow; it is possible that some of the supplied input data
     * may not be converted to output immediately, but instead may be converted to output only
     * if/when more input is provided or the end-of-stream is indicated with the
     * AVAudioConverterInputStatus_EndOfStream status code.
     * 
     * API-Since: 9.0
     */
    @Generated @NInt public static final long NoDataNow = 0x0000000000000001L;
    /**
     * If you are at the end of stream, set *ioNumberOfPackets = 0 and return
     * AVAudioConverterInputStatus_EndOfStream.
     * 
     * API-Since: 9.0
     */
    @Generated @NInt public static final long EndOfStream = 0x0000000000000002L;
}
