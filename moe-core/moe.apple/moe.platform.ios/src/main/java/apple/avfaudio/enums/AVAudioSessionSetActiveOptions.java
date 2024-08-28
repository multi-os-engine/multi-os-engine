package apple.avfaudio.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * options for use when calling setActive:withOptions:error:
 */
@Generated
public final class AVAudioSessionSetActiveOptions {
    @Generated
    private AVAudioSessionSetActiveOptions() {
    }

    /**
     * Notify an interrupted app that the interruption has ended and it may resume playback. Only
     * valid on session deactivation.
     */
    @Generated @NUInt public static final long AVAudioSessionSetActiveOptionNotifyOthersOnDeactivation = 0x0000000000000001L;
}
