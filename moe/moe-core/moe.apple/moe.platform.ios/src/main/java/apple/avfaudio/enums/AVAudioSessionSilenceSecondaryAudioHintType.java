package apple.avfaudio.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * Values for AVAudioSessionSilenceSecondaryAudioHintTypeKey in
 * AVAudioSessionSilenceSecondaryAudioHintNotification's userInfo dictionary, to indicate whether
 * optional secondary audio muting should begin or end.
 */
@Generated
public final class AVAudioSessionSilenceSecondaryAudioHintType {
    @Generated
    private AVAudioSessionSilenceSecondaryAudioHintType() {
    }

    /**
     * Another application's primary audio has started.
     */
    @Generated @NUInt public static final long Begin = 0x0000000000000001L;
    /**
     * Another application's primary audio has stopped.
     */
    @Generated @NUInt public static final long End = 0x0000000000000000L;
}
