package apple.phase.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] PHASESpatializationMode
 * <p>
 * Spatialization mode.
 * [@constant] PHASESpatializationModeAutomatic
 * Automatically select the spatialization mode based on the current output device.
 * [@constant] PHASESpatializationModeAlwaysUseBinaural
 * Always use binaural rendering, whether playing back on headphones or speakers.
 * Note that when rendering binaural over speakers, special filters are applied to achieve the expected behavior.
 * [@constant] PHASESpatializationModeAlwaysUseChannelBased
 * Always use the appropriate channel-based panning algorithm for the output layout.
 * Note that when rendering channel-based over headphones, the sound will play back in stereo.
 */
@Generated
public final class PHASESpatializationMode {
    @Generated
    private PHASESpatializationMode() {
    }

    @Generated @NInt public static final long Automatic = 0x0000000000000000L;
    @Generated @NInt public static final long AlwaysUseBinaural = 0x0000000000000001L;
    @Generated @NInt public static final long AlwaysUseChannelBased = 0x0000000000000002L;
}
