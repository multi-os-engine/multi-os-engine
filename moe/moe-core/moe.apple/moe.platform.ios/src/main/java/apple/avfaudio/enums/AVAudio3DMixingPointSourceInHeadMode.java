package apple.avfaudio.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] AVAudio3DMixingPointSourceInHeadMode
 * <p>
 * In-head modes available for AVAudio3DMixingSourceModePointSource in AVAudio3DMixingRenderingAlgorithmAuto
 * <p>
 * The in-head modes differ in what happens when a point source moves inside the
 * listener's head while using AVAudio3DMixingRenderingAlgorithmAuto.
 * <p>
 * AVAudio3DMixingPointSourceInHeadModeMono
 * A point source remains a single mono source inside the listener's head regardless
 * of the channels it consists of.
 * <p>
 * AVAudio3DMixingPointSourceInHeadModeBypass
 * A point source splits into bypass inside the listener's head. This enables transitions
 * between traditional, non-spatialized rendering and spatialized sources outside the
 * listener's head.
 */
@Generated
public final class AVAudio3DMixingPointSourceInHeadMode {
    @Generated
    private AVAudio3DMixingPointSourceInHeadMode() {
    }

    @Generated @NInt public static final long Mono = 0x0000000000000000L;
    @Generated @NInt public static final long Bypass = 0x0000000000000001L;
}
