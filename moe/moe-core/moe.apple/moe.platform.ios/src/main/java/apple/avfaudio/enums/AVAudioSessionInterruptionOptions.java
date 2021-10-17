package apple.avfaudio.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * Values for AVAudioSessionInterruptionOptionKey in AVAudioSessionInterruptionNotification's
 * userInfo dictionary.
 */
@Generated
public final class AVAudioSessionInterruptionOptions {
    @Generated
    private AVAudioSessionInterruptionOptions() {
    }

    /**
     * Indicates that you should resume playback now that the interruption has ended.
     */
    @Generated @NUInt public static final long AVAudioSessionInterruptionOptionShouldResume = 0x0000000000000001L;
}
