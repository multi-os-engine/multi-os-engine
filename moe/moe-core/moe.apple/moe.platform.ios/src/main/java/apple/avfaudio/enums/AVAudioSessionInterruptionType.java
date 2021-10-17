package apple.avfaudio.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * Values for AVAudioSessionInterruptionTypeKey in AVAudioSessionInterruptionNotification's
 * userInfo dictionary.
 */
@Generated
public final class AVAudioSessionInterruptionType {
    @Generated
    private AVAudioSessionInterruptionType() {
    }

    /**
     * < the system has interrupted your audio session
     */
    @Generated @NUInt public static final long Began = 0x0000000000000001L;
    /**
     * < the interruption has ended
     */
    @Generated @NUInt public static final long Ended = 0x0000000000000000L;
}
