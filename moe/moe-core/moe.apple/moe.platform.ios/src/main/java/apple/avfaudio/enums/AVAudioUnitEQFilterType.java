package apple.avfaudio.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] AVAudioUnitEQFilterType
 * <p>
 * Filter types available to use with AVAudioUnitEQ.
 * <p>
 * Depending on the filter type, a combination of one or all of the filter parameters defined
 * in AVAudioUnitEQFilterParameters are used to set the filter.
 * <p>
 * AVAudioUnitEQFilterTypeParametric
 * Parametric filter based on Butterworth analog prototype.
 * Required parameters: frequency (center), bandwidth, gain
 * <p>
 * AVAudioUnitEQFilterTypeLowPass
 * Simple Butterworth 2nd order low pass filter
 * Required parameters: frequency (-3 dB cutoff at specified frequency)
 * <p>
 * AVAudioUnitEQFilterTypeHighPass
 * Simple Butterworth 2nd order high pass filter
 * Required parameters: frequency (-3 dB cutoff at specified frequency)
 * <p>
 * AVAudioUnitEQFilterTypeResonantLowPass
 * Low pass filter with resonance support (via bandwidth parameter)
 * Required parameters: frequency (-3 dB cutoff at specified frequency), bandwidth
 * <p>
 * AVAudioUnitEQFilterTypeResonantHighPass
 * High pass filter with resonance support (via bandwidth parameter)
 * Required parameters: frequency (-3 dB cutoff at specified frequency), bandwidth
 * <p>
 * AVAudioUnitEQFilterTypeBandPass
 * Band pass filter
 * Required parameters: frequency (center), bandwidth
 * <p>
 * AVAudioUnitEQFilterTypeBandStop
 * Band stop filter (aka "notch filter")
 * Required parameters: frequency (center), bandwidth
 * <p>
 * AVAudioUnitEQFilterTypeLowShelf
 * Low shelf filter
 * Required parameters: frequency (center), gain
 * <p>
 * AVAudioUnitEQFilterTypeHighShelf
 * High shelf filter
 * Required parameters: frequency (center), gain
 * <p>
 * AVAudioUnitEQFilterTypeResonantLowShelf
 * Low shelf filter with resonance support (via bandwidth parameter)
 * Required parameters: frequency (center), bandwidth, gain
 * <p>
 * AVAudioUnitEQFilterTypeResonantHighShelf
 * High shelf filter with resonance support (via bandwidth parameter)
 * Required parameters: frequency (center), bandwidth, gain
 */
@Generated
public final class AVAudioUnitEQFilterType {
    @Generated
    private AVAudioUnitEQFilterType() {
    }

    @Generated @NInt public static final long Parametric = 0x0000000000000000L;
    @Generated @NInt public static final long LowPass = 0x0000000000000001L;
    @Generated @NInt public static final long HighPass = 0x0000000000000002L;
    @Generated @NInt public static final long ResonantLowPass = 0x0000000000000003L;
    @Generated @NInt public static final long ResonantHighPass = 0x0000000000000004L;
    @Generated @NInt public static final long BandPass = 0x0000000000000005L;
    @Generated @NInt public static final long BandStop = 0x0000000000000006L;
    @Generated @NInt public static final long LowShelf = 0x0000000000000007L;
    @Generated @NInt public static final long HighShelf = 0x0000000000000008L;
    @Generated @NInt public static final long ResonantLowShelf = 0x0000000000000009L;
    @Generated @NInt public static final long ResonantHighShelf = 0x000000000000000AL;
}
