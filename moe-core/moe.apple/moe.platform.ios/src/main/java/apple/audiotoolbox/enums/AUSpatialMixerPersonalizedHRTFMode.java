package apple.audiotoolbox.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@enum] Property values for kAudioUnitProperty_SpatialMixerPersonalizedHRTFMode
 * 
 * [@constant] kSpatialMixerPersonalizedHRTFMode_Off
 * 
 * Use generic head-related transfer function (HRTF).
 * 
 * [@constant] kSpatialMixerPersonalizedHRTFMode_On
 * 
 * Use personalized head-related transfer function (HRTF), if available.
 * 
 * [@constant] kSpatialMixerPersonalizedHRTFMode_Auto
 * 
 * Follow system preferences to choose between personalized vs generic
 * head-related transfer function (HRTF).
 */
@Generated
public final class AUSpatialMixerPersonalizedHRTFMode {
    @Generated
    private AUSpatialMixerPersonalizedHRTFMode() {
    }

    /**
     * API-Since: 18.0
     */
    @Generated public static final int Off = 0x00000000;
    /**
     * API-Since: 18.0
     */
    @Generated public static final int On = 0x00000001;
    /**
     * API-Since: 18.0
     */
    @Generated public static final int Auto = 0x00000002;
}