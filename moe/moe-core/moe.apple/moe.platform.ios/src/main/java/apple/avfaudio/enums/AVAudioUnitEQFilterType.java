package apple.avfaudio.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] AVAudioUnitEQFilterType
 * 
 * Filter types available to use with AVAudioUnitEQ.
 * 
 * Depending on the filter type, a combination of one or all of the filter parameters defined
 * in AVAudioUnitEQFilterParameters are used to set the filter.
 * 
 * AVAudioUnitEQFilterTypeParametric
 * Parametric filter based on Butterworth analog prototype.
 * Required parameters: frequency (center), bandwidth, gain
 * 
 * AVAudioUnitEQFilterTypeLowPass
 * Simple Butterworth 2nd order low pass filter
 * Required parameters: frequency (-3 dB cutoff at specified frequency)
 * 
 * AVAudioUnitEQFilterTypeHighPass
 * Simple Butterworth 2nd order high pass filter
 * Required parameters: frequency (-3 dB cutoff at specified frequency)
 * 
 * AVAudioUnitEQFilterTypeResonantLowPass
 * Low pass filter with resonance support (via bandwidth parameter)
 * Required parameters: frequency (-3 dB cutoff at specified frequency), bandwidth
 * 
 * AVAudioUnitEQFilterTypeResonantHighPass
 * High pass filter with resonance support (via bandwidth parameter)
 * Required parameters: frequency (-3 dB cutoff at specified frequency), bandwidth
 * 
 * AVAudioUnitEQFilterTypeBandPass
 * Band pass filter
 * Required parameters: frequency (center), bandwidth
 * 
 * AVAudioUnitEQFilterTypeBandStop
 * Band stop filter (aka "notch filter")
 * Required parameters: frequency (center), bandwidth
 * 
 * AVAudioUnitEQFilterTypeLowShelf
 * Low shelf filter
 * Required parameters: frequency (center), gain
 * 
 * AVAudioUnitEQFilterTypeHighShelf
 * High shelf filter
 * Required parameters: frequency (center), gain
 * 
 * AVAudioUnitEQFilterTypeResonantLowShelf
 * Low shelf filter with resonance support (via bandwidth parameter)
 * Required parameters: frequency (center), bandwidth, gain
 * 
 * AVAudioUnitEQFilterTypeResonantHighShelf
 * High shelf filter with resonance support (via bandwidth parameter)
 * Required parameters: frequency (center), bandwidth, gain
 * 
 * 
 * API-Since: 8.0
 */
@Generated
public final class AVAudioUnitEQFilterType {
    @Generated
    private AVAudioUnitEQFilterType() {
    }

    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long Parametric = 0x0000000000000000L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long LowPass = 0x0000000000000001L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long HighPass = 0x0000000000000002L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long ResonantLowPass = 0x0000000000000003L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long ResonantHighPass = 0x0000000000000004L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long BandPass = 0x0000000000000005L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long BandStop = 0x0000000000000006L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long LowShelf = 0x0000000000000007L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long HighShelf = 0x0000000000000008L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long ResonantLowShelf = 0x0000000000000009L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long ResonantHighShelf = 0x000000000000000AL;
}
