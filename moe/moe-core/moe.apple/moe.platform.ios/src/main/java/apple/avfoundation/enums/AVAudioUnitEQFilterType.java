/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package apple.avfoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * @enum AVAudioUnitEQFilterType
 * @abstract Filter types available to use with AVAudioUnitEQ.
 * @discussion
 *     Depending on the filter type, a combination of one or all of the filter parameters defined 
 *     in AVAudioUnitEQFilterParameters are used to set the filter.
 * 
 *     AVAudioUnitEQFilterTypeParametric
 *         Parametric filter based on Butterworth analog prototype.
 *         Required parameters: frequency (center), bandwidth, gain
 * 
 *     AVAudioUnitEQFilterTypeLowPass
 *         Simple Butterworth 2nd order low pass filter
 *         Required parameters: frequency (-3 dB cutoff at specified frequency)
 * 
 *     AVAudioUnitEQFilterTypeHighPass
 *         Simple Butterworth 2nd order high pass filter
 *         Required parameters: frequency (-3 dB cutoff at specified frequency)
 * 
 *     AVAudioUnitEQFilterTypeResonantLowPass
 *         Low pass filter with resonance support (via bandwidth parameter)
 *         Required parameters: frequency (-3 dB cutoff at specified frequency), bandwidth
 * 
 *     AVAudioUnitEQFilterTypeResonantHighPass
 *         High pass filter with resonance support (via bandwidth parameter)
 *         Required parameters: frequency (-3 dB cutoff at specified frequency), bandwidth
 * 
 *     AVAudioUnitEQFilterTypeBandPass
 *         Band pass filter
 *         Required parameters: frequency (center), bandwidth
 * 
 *     AVAudioUnitEQFilterTypeBandStop
 *         Band stop filter (aka "notch filter")
 *         Required parameters: frequency (center), bandwidth
 * 
 *     AVAudioUnitEQFilterTypeLowShelf
 *         Low shelf filter
 *         Required parameters: frequency (center), gain
 * 
 *     AVAudioUnitEQFilterTypeHighShelf
 *         High shelf filter
 *         Required parameters: frequency (center), gain
 * 
 *     AVAudioUnitEQFilterTypeResonantLowShelf
 *         Low shelf filter with resonance support (via bandwidth parameter)
 *         Required parameters: frequency (center), bandwidth, gain
 * 
 *     AVAudioUnitEQFilterTypeResonantHighShelf
 *         High shelf filter with resonance support (via bandwidth parameter)
 *         Required parameters: frequency (center), bandwidth, gain
 */
@Generated
public final class AVAudioUnitEQFilterType {
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

    @Generated
    private AVAudioUnitEQFilterType() {
    }
}
