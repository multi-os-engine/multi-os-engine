package apple.audiotoolbox.enums;

import org.moe.natj.general.ann.Generated;

/**
 * @enum			Property values for kAudioUnitProperty_SpatialMixerPointSourceInHeadMode
 * @abstract		This setting only affects spatialization when using kSpatializationAlgorithm_UseOutputType
 * 				with kSpatialMixerSourceMode_PointSource.
 * 
 * @constant		kSpatialMixerPointSourceInHeadMode_Mono
 * @discussion		A point source remains a single mono source inside the listener's head regardless
 * 				of the channels it consists of.
 * 
 * @constant		kSpatialMixerPointSourceInHeadMode_Bypass
 * @discussion		A point source splits into bypass inside the listener's head. This enables transitions
 * 				between traditional, non-spatialized rendering and spatialized sources outside the
 * 				listener's head.
 */
@Generated
public final class AUSpatialMixerPointSourceInHeadMode {
    @Generated
    private AUSpatialMixerPointSourceInHeadMode() {
    }

    @Generated public static final int Mono = 0x00000000;
    @Generated public static final int Bypass = 0x00000001;
}