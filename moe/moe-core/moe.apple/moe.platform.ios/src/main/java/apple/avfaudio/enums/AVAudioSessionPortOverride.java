package apple.avfaudio.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * For use with overrideOutputAudioPort:error:
 */
@Generated
public final class AVAudioSessionPortOverride {
    @Generated
    private AVAudioSessionPortOverride() {
    }

    /**
     * No override.  Return audio routing to the default state for the current audio category.
     */
    @Generated @NUInt public static final long None = 0x0000000000000000L;
    /**
     * Route audio output to speaker.  Use this override with AVAudioSessionCategoryPlayAndRecord,
     * which by default routes the output to the receiver.
     */
    @Generated @NUInt public static final long Speaker = 0x0000000073706B72L;
}
