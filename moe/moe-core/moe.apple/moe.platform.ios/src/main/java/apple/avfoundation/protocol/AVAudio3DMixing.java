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

package apple.avfoundation.protocol;

import apple.avfoundation.struct.AVAudio3DPoint;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * @protocol   AVAudio3DMixing
 * @abstract   Protocol that defines 3D mixing properties
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AVAudio3DMixing")
public interface AVAudio3DMixing {
    /**
     * @property obstruction
     * @abstract Simulates filtering of the direct path of sound due to an obstacle
     * @discussion
     *     Only the direct path of sound between the source and listener is blocked.
     * 
     *     Range:      -100.0 -> 0.0 dB
     *     Default:    0.0
     *     Mixer:      AVAudioEnvironmentNode
     */
    @Generated
    @Selector("obstruction")
    float obstruction();

    /**
     * @property occlusion
     * @abstract Simulates filtering of the direct and reverb paths of sound due to an obstacle
     * @discussion
     *     Both the direct and reverb paths of sound between the source and listener are blocked.
     * 
     *     Range:      -100.0 -> 0.0 dB
     *     Default:    0.0
     *     Mixer:      AVAudioEnvironmentNode
     */
    @Generated
    @Selector("occlusion")
    float occlusion();

    /**
     * @property position
     * @abstract The location of the source in the 3D environment
     * @discussion
     *     The coordinates are specified in meters.
     * 
     *     Mixer:      AVAudioEnvironmentNode
     */
    @Generated
    @Selector("position")
    @ByValue
    AVAudio3DPoint position();

    /**
     * @property rate
     * @abstract Changes the playback rate of the input signal
     * @discussion
     *     A value of 2.0 results in the output audio playing one octave higher.
     *     A value of 0.5, results in the output audio playing one octave lower.
     * 
     *     Range:      0.5 -> 2.0
     *     Default:    1.0
     *     Mixer:      AVAudioEnvironmentNode
     */
    @Generated
    @Selector("rate")
    float rate();

    /**
     * @property renderingAlgorithm
     * @abstract Type of rendering algorithm used
     * @discussion
     *     Depending on the current output format of the AVAudioEnvironmentNode, only a subset of the 
     *     rendering algorithms may be supported. An array of valid rendering algorithms can be 
     *     retrieved by calling applicableRenderingAlgorithms on AVAudioEnvironmentNode.
     * 
     *     Default:    AVAudio3DMixingRenderingAlgorithmEqualPowerPanning
     *     Mixer:      AVAudioEnvironmentNode
     */
    @Generated
    @Selector("renderingAlgorithm")
    @NInt
    long renderingAlgorithm();

    /**
     * @property reverbBlend
     * @abstract Controls the blend of dry and reverb processed audio
     * @discussion
     *     This property controls the amount of the source's audio that will be processed by the reverb 
     *     in AVAudioEnvironmentNode. A value of 0.5 will result in an equal blend of dry and processed 
     *     (wet) audio.
     * 
     *     Range:      0.0 (completely dry) -> 1.0 (completely wet)
     *     Default:    0.0
     *     Mixer:      AVAudioEnvironmentNode
     */
    @Generated
    @Selector("reverbBlend")
    float reverbBlend();

    /**
     * @property obstruction
     * @abstract Simulates filtering of the direct path of sound due to an obstacle
     * @discussion
     *     Only the direct path of sound between the source and listener is blocked.
     * 
     *     Range:      -100.0 -> 0.0 dB
     *     Default:    0.0
     *     Mixer:      AVAudioEnvironmentNode
     */
    @Generated
    @Selector("setObstruction:")
    void setObstruction(float value);

    /**
     * @property occlusion
     * @abstract Simulates filtering of the direct and reverb paths of sound due to an obstacle
     * @discussion
     *     Both the direct and reverb paths of sound between the source and listener are blocked.
     * 
     *     Range:      -100.0 -> 0.0 dB
     *     Default:    0.0
     *     Mixer:      AVAudioEnvironmentNode
     */
    @Generated
    @Selector("setOcclusion:")
    void setOcclusion(float value);

    /**
     * @property position
     * @abstract The location of the source in the 3D environment
     * @discussion
     *     The coordinates are specified in meters.
     * 
     *     Mixer:      AVAudioEnvironmentNode
     */
    @Generated
    @Selector("setPosition:")
    void setPosition(@ByValue AVAudio3DPoint value);

    /**
     * @property rate
     * @abstract Changes the playback rate of the input signal
     * @discussion
     *     A value of 2.0 results in the output audio playing one octave higher.
     *     A value of 0.5, results in the output audio playing one octave lower.
     * 
     *     Range:      0.5 -> 2.0
     *     Default:    1.0
     *     Mixer:      AVAudioEnvironmentNode
     */
    @Generated
    @Selector("setRate:")
    void setRate(float value);

    /**
     * @property renderingAlgorithm
     * @abstract Type of rendering algorithm used
     * @discussion
     *     Depending on the current output format of the AVAudioEnvironmentNode, only a subset of the 
     *     rendering algorithms may be supported. An array of valid rendering algorithms can be 
     *     retrieved by calling applicableRenderingAlgorithms on AVAudioEnvironmentNode.
     * 
     *     Default:    AVAudio3DMixingRenderingAlgorithmEqualPowerPanning
     *     Mixer:      AVAudioEnvironmentNode
     */
    @Generated
    @Selector("setRenderingAlgorithm:")
    void setRenderingAlgorithm(@NInt long value);

    /**
     * @property reverbBlend
     * @abstract Controls the blend of dry and reverb processed audio
     * @discussion
     *     This property controls the amount of the source's audio that will be processed by the reverb 
     *     in AVAudioEnvironmentNode. A value of 0.5 will result in an equal blend of dry and processed 
     *     (wet) audio.
     * 
     *     Range:      0.0 (completely dry) -> 1.0 (completely wet)
     *     Default:    0.0
     *     Mixer:      AVAudioEnvironmentNode
     */
    @Generated
    @Selector("setReverbBlend:")
    void setReverbBlend(float value);

    /**
     * @property pointSourceInHeadMode
     * @abstract In-head rendering choice for AVAudio3DMixingSourceModePointSource in AVAudio3DMixingRenderingAlgorithmAuto
     * @discussion
     *     Default:    AVAudio3DMixingPointSourceInHeadModeMono
     *     Mixer:      AVAudioEnvironmentNode
     */
    @Generated
    @Selector("pointSourceInHeadMode")
    @NInt
    long pointSourceInHeadMode();

    /**
     * @property pointSourceInHeadMode
     * @abstract In-head rendering choice for AVAudio3DMixingSourceModePointSource in AVAudio3DMixingRenderingAlgorithmAuto
     * @discussion
     *     Default:    AVAudio3DMixingPointSourceInHeadModeMono
     *     Mixer:      AVAudioEnvironmentNode
     */
    @Generated
    @Selector("setPointSourceInHeadMode:")
    void setPointSourceInHeadMode(@NInt long value);

    /**
     * @property sourceMode
     * @abstract Controls how individual channels of an input bus are rendered
     * @discussion
     *     Default:    AVAudio3DMixingSourceModeSpatializeIfMono
     *     Mixer:      AVAudioEnvironmentNode
     */
    @Generated
    @Selector("setSourceMode:")
    void setSourceMode(@NInt long value);

    /**
     * @property sourceMode
     * @abstract Controls how individual channels of an input bus are rendered
     * @discussion
     *     Default:    AVAudio3DMixingSourceModeSpatializeIfMono
     *     Mixer:      AVAudioEnvironmentNode
     */
    @Generated
    @Selector("sourceMode")
    @NInt
    long sourceMode();
}
