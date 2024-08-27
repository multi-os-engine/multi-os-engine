package apple.avfaudio.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] AVAudioConverterOutputStatus
 * 
 * These values are returned from convertToBuffer:error:withInputFromBlock:
 * 
 * API-Since: 9.0
 */
@Generated
public final class AVAudioConverterOutputStatus {
    @Generated
    private AVAudioConverterOutputStatus() {
    }

    /**
     * All of the requested data was returned.
     * 
     * API-Since: 9.0
     */
    @Generated @NInt public static final long HaveData = 0x0000000000000000L;
    /**
     * Not enough input was available to satisfy the request at the current time. The output buffer
     * contains as much as could be converted.
     * 
     * API-Since: 9.0
     */
    @Generated @NInt public static final long InputRanDry = 0x0000000000000001L;
    /**
     * The end of stream has been reached. No data was returned.
     * 
     * API-Since: 9.0
     */
    @Generated @NInt public static final long EndOfStream = 0x0000000000000002L;
    /**
     * An error occurred.
     * 
     * API-Since: 9.0
     */
    @Generated @NInt public static final long Error = 0x0000000000000003L;
}
