package apple.avfaudio.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] AVAudioConverterInputStatus
 * <p>
 * You must return one of these codes from your AVAudioConverterInputBlock.
 */
@Generated
public final class AVAudioConverterInputStatus {
    @Generated
    private AVAudioConverterInputStatus() {
    }

    /**
     * This is the normal case where you supply data to the converter.
     */
    @Generated @NInt public static final long HaveData = 0x0000000000000000L;
    /**
     * If you are out of data for now, set *ioNumberOfPackets = 0 and return
     * AVAudioConverterInputStatus_NoDataNow; the conversion routine will return as much output as
     * could be converted with the input already supplied.
     */
    @Generated @NInt public static final long NoDataNow = 0x0000000000000001L;
    /**
     * If you are at the end of stream, set *ioNumberOfPackets = 0 and return
     * AVAudioConverterInputStatus_EndOfStream.
     */
    @Generated @NInt public static final long EndOfStream = 0x0000000000000002L;
}
