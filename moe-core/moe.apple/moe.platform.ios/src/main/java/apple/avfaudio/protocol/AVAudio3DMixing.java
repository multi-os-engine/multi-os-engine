package apple.avfaudio.protocol;

import apple.avfaudio.struct.AVAudio3DPoint;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * [@protocol] AVAudio3DMixing
 * 
 * Protocol that defines 3D mixing properties
 */
@Generated
@Library("AVFAudio")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AVAudio3DMixing")
public interface AVAudio3DMixing {
    /**
     * [@property] obstruction
     * 
     * Simulates filtering of the direct path of sound due to an obstacle
     * 
     * Only the direct path of sound between the source and listener is blocked.
     * 
     * Range: -100.0 -> 0.0 dB
     * Default: 0.0
     * Mixer: AVAudioEnvironmentNode
     */
    @Generated
    @Selector("obstruction")
    float obstruction();

    /**
     * [@property] occlusion
     * 
     * Simulates filtering of the direct and reverb paths of sound due to an obstacle
     * 
     * Both the direct and reverb paths of sound between the source and listener are blocked.
     * 
     * Range: -100.0 -> 0.0 dB
     * Default: 0.0
     * Mixer: AVAudioEnvironmentNode
     */
    @Generated
    @Selector("occlusion")
    float occlusion();

    /**
     * [@property] pointSourceInHeadMode
     * 
     * In-head rendering choice for AVAudio3DMixingSourceModePointSource in AVAudio3DMixingRenderingAlgorithmAuto
     * 
     * Default: AVAudio3DMixingPointSourceInHeadModeMono
     * Mixer: AVAudioEnvironmentNode
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("pointSourceInHeadMode")
    @NInt
    long pointSourceInHeadMode();

    /**
     * [@property] position
     * 
     * The location of the source in the 3D environment
     * 
     * The coordinates are specified in meters.
     * 
     * Mixer: AVAudioEnvironmentNode
     */
    @Generated
    @Selector("position")
    @ByValue
    AVAudio3DPoint position();

    /**
     * [@property] rate
     * 
     * Changes the playback rate of the input signal
     * 
     * A value of 2.0 results in the output audio playing one octave higher.
     * A value of 0.5, results in the output audio playing one octave lower.
     * 
     * Range: 0.5 -> 2.0
     * Default: 1.0
     * Mixer: AVAudioEnvironmentNode
     */
    @Generated
    @Selector("rate")
    float rate();

    /**
     * [@property] renderingAlgorithm
     * 
     * Type of rendering algorithm used
     * 
     * Depending on the current output format of the AVAudioEnvironmentNode, only a subset of the
     * rendering algorithms may be supported. An array of valid rendering algorithms can be
     * retrieved by calling applicableRenderingAlgorithms on AVAudioEnvironmentNode.
     * 
     * Default: AVAudio3DMixingRenderingAlgorithmEqualPowerPanning
     * Mixer: AVAudioEnvironmentNode
     */
    @Generated
    @Selector("renderingAlgorithm")
    @NInt
    long renderingAlgorithm();

    /**
     * [@property] reverbBlend
     * 
     * Controls the blend of dry and reverb processed audio
     * 
     * This property controls the amount of the source's audio that will be processed by the reverb
     * in AVAudioEnvironmentNode. A value of 0.5 will result in an equal blend of dry and processed
     * (wet) audio.
     * 
     * Range: 0.0 (completely dry) -> 1.0 (completely wet)
     * Default: 0.0
     * Mixer: AVAudioEnvironmentNode
     */
    @Generated
    @Selector("reverbBlend")
    float reverbBlend();

    /**
     * [@property] obstruction
     * 
     * Simulates filtering of the direct path of sound due to an obstacle
     * 
     * Only the direct path of sound between the source and listener is blocked.
     * 
     * Range: -100.0 -> 0.0 dB
     * Default: 0.0
     * Mixer: AVAudioEnvironmentNode
     */
    @Generated
    @Selector("setObstruction:")
    void setObstruction(float value);

    /**
     * [@property] occlusion
     * 
     * Simulates filtering of the direct and reverb paths of sound due to an obstacle
     * 
     * Both the direct and reverb paths of sound between the source and listener are blocked.
     * 
     * Range: -100.0 -> 0.0 dB
     * Default: 0.0
     * Mixer: AVAudioEnvironmentNode
     */
    @Generated
    @Selector("setOcclusion:")
    void setOcclusion(float value);

    /**
     * [@property] pointSourceInHeadMode
     * 
     * In-head rendering choice for AVAudio3DMixingSourceModePointSource in AVAudio3DMixingRenderingAlgorithmAuto
     * 
     * Default: AVAudio3DMixingPointSourceInHeadModeMono
     * Mixer: AVAudioEnvironmentNode
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setPointSourceInHeadMode:")
    void setPointSourceInHeadMode(@NInt long value);

    /**
     * [@property] position
     * 
     * The location of the source in the 3D environment
     * 
     * The coordinates are specified in meters.
     * 
     * Mixer: AVAudioEnvironmentNode
     */
    @Generated
    @Selector("setPosition:")
    void setPosition(@ByValue AVAudio3DPoint value);

    /**
     * [@property] rate
     * 
     * Changes the playback rate of the input signal
     * 
     * A value of 2.0 results in the output audio playing one octave higher.
     * A value of 0.5, results in the output audio playing one octave lower.
     * 
     * Range: 0.5 -> 2.0
     * Default: 1.0
     * Mixer: AVAudioEnvironmentNode
     */
    @Generated
    @Selector("setRate:")
    void setRate(float value);

    /**
     * [@property] renderingAlgorithm
     * 
     * Type of rendering algorithm used
     * 
     * Depending on the current output format of the AVAudioEnvironmentNode, only a subset of the
     * rendering algorithms may be supported. An array of valid rendering algorithms can be
     * retrieved by calling applicableRenderingAlgorithms on AVAudioEnvironmentNode.
     * 
     * Default: AVAudio3DMixingRenderingAlgorithmEqualPowerPanning
     * Mixer: AVAudioEnvironmentNode
     */
    @Generated
    @Selector("setRenderingAlgorithm:")
    void setRenderingAlgorithm(@NInt long value);

    /**
     * [@property] reverbBlend
     * 
     * Controls the blend of dry and reverb processed audio
     * 
     * This property controls the amount of the source's audio that will be processed by the reverb
     * in AVAudioEnvironmentNode. A value of 0.5 will result in an equal blend of dry and processed
     * (wet) audio.
     * 
     * Range: 0.0 (completely dry) -> 1.0 (completely wet)
     * Default: 0.0
     * Mixer: AVAudioEnvironmentNode
     */
    @Generated
    @Selector("setReverbBlend:")
    void setReverbBlend(float value);

    /**
     * [@property] sourceMode
     * 
     * Controls how individual channels of an input bus are rendered
     * 
     * Default: AVAudio3DMixingSourceModeSpatializeIfMono
     * Mixer: AVAudioEnvironmentNode
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setSourceMode:")
    void setSourceMode(@NInt long value);

    /**
     * [@property] sourceMode
     * 
     * Controls how individual channels of an input bus are rendered
     * 
     * Default: AVAudio3DMixingSourceModeSpatializeIfMono
     * Mixer: AVAudioEnvironmentNode
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("sourceMode")
    @NInt
    long sourceMode();
}
