package apple.audiotoolbox.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@enum]			Property values for kAudioUnitProperty_SpatialMixerSourceMode
 * 
 * 	[@constant]		kSpatialMixerSourceMode_SpatializeIfMono
 * 
 * Mono input is spatialized using kAudioUnitProperty_SpatializationAlgorithm.
 * 				Any input with more than one channel is passed through without spatialization. This is
 * 					the default mode and corresponds to legacy behavior. The rendering is equivalent to
 * 				kSpatialMixerSourceMode_PointSource for mono input and
 * 				kSpatialMixerSourceMode_Bypass for input with more than one channel.
 * 
 * [@constant]		kSpatialMixerSourceMode_Bypass
 * 
 * No spatial rendering. If input and output AudioChannelLayouts are equivalent, all
 * 				input channels are copied to corresponding output channels. If the input and
 * 				output AudioChannelLayouts differ, mixing is done according to the
 * 				kAudioFormatProperty_MatrixMixMap property of the layouts. No occlusion, obstruction,
 * 				or reverb is applied in this mode.
 * 
 * [@constant]		kSpatialMixerSourceMode_PointSource
 * 
 * All channels of the input signal are rendered as a single source except if rendering
 * 				in-head with kSpatialMixerPointSourceInHeadMode_Bypass.
 * 
 * [@constant]		kSpatialMixerSourceMode_AmbienceBed
 * 
 * The input channels are spatialized around the listener as far-field sources.
 * 				The relative directions of the individual channels are specified by the
 * 				AudioChannelLayout of the bus. The rotation of the whole bed in the global space is
 * 				controlled by azimuth and elevation parameters.
 */
@Generated
public final class AUSpatialMixerSourceMode {
    @Generated
    private AUSpatialMixerSourceMode() {
    }

    @Generated public static final int SpatializeIfMono = 0x00000000;
    @Generated public static final int Bypass = 0x00000001;
    @Generated public static final int PointSource = 0x00000002;
    @Generated public static final int AmbienceBed = 0x00000003;
}