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
 * [@enum] AVAudio3DMixingRenderingAlgorithm
 * 
 * Types of rendering algorithms available per input bus of the environment node
 * 
 * The rendering algorithms differ in terms of quality and cpu cost.
 * AVAudio3DMixingRenderingAlgorithmEqualPowerPanning is the simplest panning algorithm and also
 * the least expensive computationally.
 * 
 * When rendering to multi-channel hardware, audio data will only be rendered to channels 1 & 2
 * with all rendering algorithms except AVAudio3DMixingRenderingAlgorithmSoundField and
 * AVAudio3DMixingRenderingAlgorithmAuto.
 * 
 * AVAudio3DMixingRenderingAlgorithmEqualPowerPanning
 * 	EqualPowerPanning merely pans the data of the mixer bus into a stereo field. This
 * 	algorithm is analogous to the pan knob found on a mixing board channel strip.
 * 
 * AVAudio3DMixingRenderingAlgorithmSphericalHead
 * 	SphericalHead is designed to emulate 3 dimensional space in headphones by simulating
 * 	inter-aural time delays and other spatial cues. SphericalHead is slightly less CPU
 * 	intensive than the HRTF algorithm.
 * 
 * AVAudio3DMixingRenderingAlgorithmHRTF
 * 	HRTF (Head Related Transfer Function) is a high quality algorithm using filtering to
 * 	emulate 3 dimensional space in headphones. HRTF is a cpu intensive algorithm.
 * 
 * AVAudio3DMixingRenderingAlgorithmHRTFHQ
 * 	Higher quality HRTF rendering algorithm compared to AVAudio3DMixingRenderingAlgorithmHRTF.
 * 	Improvements have been made to the overall frequency response and localization of
 * 	sources in a 3D space.
 * 
 * AVAudio3DMixingRenderingAlgorithmSoundField
 * 	SoundField is designed for rendering to multi channel hardware. The mixer takes data
 * 	being rendered with SoundField and distributes it amongst all the output channels with
 * 	a weighting toward the location in which the sound derives. It is very effective for
 * 	ambient sounds, which may derive from a specific location in space, yet should be heard
 * 	through the listener's entire space.
 * 
 * AVAudio3DMixingRenderingAlgorithmStereoPassThrough
 * 	StereoPassThrough should be used when no localization is desired for the source data.
 * 	Setting this algorithm tells the mixer to pass the input channels to output without
 * 	localization. If the input and output AudioChannelLayouts differ, mixing is done
 * 	according to the kAudioFormatProperty_MatrixMixMap property of the layouts.
 * 
 * AVAudio3DMixingRenderingAlgorithmAuto
 * 	Automatically pick the highest-quality rendering algorithm available for current playback
 * 	hardware. The algorithm may not be identical to other existing algorithms and may change
 * 	in the future as new algorithms are developed. When using Manual Rendering modes or
 * 	wired output, it may be necessary to manually set the AVAudioEnvironmentNode's output
 * 	type. Multi-channel rendering requires setting a channel layout on the
 * 	AVAudioEnvironmentNode's output.
 */
@Generated
public final class AVAudio3DMixingRenderingAlgorithm {
    @Generated @NInt public static final long EqualPowerPanning = 0x0000000000000000L;
    @Generated @NInt public static final long SphericalHead = 0x0000000000000001L;
    @Generated @NInt public static final long HRTF = 0x0000000000000002L;
    @Generated @NInt public static final long SoundField = 0x0000000000000003L;
    @Generated @NInt public static final long StereoPassThrough = 0x0000000000000005L;

    @Generated
    private AVAudio3DMixingRenderingAlgorithm() {
    }

    @Generated @NInt public static final long HRTFHQ = 0x0000000000000006L;
    @Generated @NInt public static final long Auto = 0x0000000000000007L;
}
