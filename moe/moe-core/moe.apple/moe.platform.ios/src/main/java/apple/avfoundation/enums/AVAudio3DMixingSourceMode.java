package apple.avfoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * @enum AVAudio3DMixingSourceMode
 * @abstract   Source types available per input bus of the environment node
 * @discussion
 *     The source types differ in how the individual channels of an input bus are distributed
 *     in space.
 * 
 *     AVAudio3DMixingSourceModeSpatializeIfMono
 *         A mono input bus is rendered as a point source at the location of the source node.
 *         An input bus with more than one channel is bypassed. This corresponds to legacy
 *         behavior and is equivalent to AVAudio3DMixingSourceModePointSource for a mono bus
 *         and AVAudio3DMixingSourceModeBypass for a bus with more than one channel.
 * 
 *     AVAudio3DMixingSourceModeBypass
 *         No spatial rendering. If input and output AudioChannelLayouts are equivalent, all
 *         input channels are directly copied to corresponding output channels. If the input and
 *         output AudioChannelLayouts differ, mixing is done according to the
 *         kAudioFormatProperty_MatrixMixMap property of the layouts. No occlusion, obstruction,
 *         or reverb is applied in this mode.
 * 
 *     AVAudio3DMixingSourceModePointSource
 *         All channels of the bus are rendered as a single source at the location of the source
 *         node.
 * 
 *     AVAudio3DMixingSourceModeAmbienceBed
 *         The input channels are spatialized around the listener as far-field sources anchored to
 *         global space. This means that the rendering depends on listener orientation but not on
 *         listener position. The directions of the input channels are specified by the
 *         AudioChannelLayout of the bus. The rotation of the whole bed in the global space is
 *         controlled by the direction of the source node.
 */
@Generated
public final class AVAudio3DMixingSourceMode {
    @Generated
    private AVAudio3DMixingSourceMode() {
    }

    @Generated @NInt public static final long SpatializeIfMono = 0x0000000000000000L;
    @Generated @NInt public static final long Bypass = 0x0000000000000001L;
    @Generated @NInt public static final long PointSource = 0x0000000000000002L;
    @Generated @NInt public static final long AmbienceBed = 0x0000000000000003L;
}