package apple.avfaudio.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] AVAudio3DMixingPointSourceInHeadMode
 * 
 * In-head modes available for AVAudio3DMixingSourceModePointSource in AVAudio3DMixingRenderingAlgorithmAuto
 * 
 * The in-head modes differ in what happens when a point source moves inside the
 * listener's head while using AVAudio3DMixingRenderingAlgorithmAuto.
 * 
 * AVAudio3DMixingPointSourceInHeadModeMono
 * A point source remains a single mono source inside the listener's head regardless
 * of the channels it consists of.
 * 
 * AVAudio3DMixingPointSourceInHeadModeBypass
 * A point source splits into bypass inside the listener's head. This enables transitions
 * between traditional, non-spatialized rendering and spatialized sources outside the
 * listener's head.
 * 
 * API-Since: 13.0
 */
@Generated
public final class AVAudio3DMixingPointSourceInHeadMode {
    @Generated
    private AVAudio3DMixingPointSourceInHeadMode() {
    }

    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long Mono = 0x0000000000000000L;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long Bypass = 0x0000000000000001L;
}
