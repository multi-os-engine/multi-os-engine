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
 * <p>
 * Protocol that defines 3D mixing properties
 */
@Generated
@Library("AVFAudio")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AVAudio3DMixing")
public interface AVAudio3DMixing {
    /**
     * [@property] obstruction
     * <p>
     * Simulates filtering of the direct path of sound due to an obstacle
     * <p>
     * Only the direct path of sound between the source and listener is blocked.
     * <p>
     * Range: -100.0 -> 0.0 dB
     * Default: 0.0
     * Mixer: AVAudioEnvironmentNode
     */
    @Generated
    @Selector("obstruction")
    float obstruction();

    /**
     * [@property] occlusion
     * <p>
     * Simulates filtering of the direct and reverb paths of sound due to an obstacle
     * <p>
     * Both the direct and reverb paths of sound between the source and listener are blocked.
     * <p>
     * Range: -100.0 -> 0.0 dB
     * Default: 0.0
     * Mixer: AVAudioEnvironmentNode
     */
    @Generated
    @Selector("occlusion")
    float occlusion();

    /**
     * [@property] pointSourceInHeadMode
     * <p>
     * In-head rendering choice for AVAudio3DMixingSourceModePointSource in AVAudio3DMixingRenderingAlgorithmAuto
     * <p>
     * Default: AVAudio3DMixingPointSourceInHeadModeMono
     * Mixer: AVAudioEnvironmentNode
     */
    @Generated
    @Selector("pointSourceInHeadMode")
    @NInt
    long pointSourceInHeadMode();

    /**
     * [@property] position
     * <p>
     * The location of the source in the 3D environment
     * <p>
     * The coordinates are specified in meters.
     * <p>
     * Mixer: AVAudioEnvironmentNode
     */
    @Generated
    @Selector("position")
    @ByValue
    AVAudio3DPoint position();

    /**
     * [@property] rate
     * <p>
     * Changes the playback rate of the input signal
     * <p>
     * A value of 2.0 results in the output audio playing one octave higher.
     * A value of 0.5, results in the output audio playing one octave lower.
     * <p>
     * Range: 0.5 -> 2.0
     * Default: 1.0
     * Mixer: AVAudioEnvironmentNode
     */
    @Generated
    @Selector("rate")
    float rate();

    /**
     * [@property] renderingAlgorithm
     * <p>
     * Type of rendering algorithm used
     * <p>
     * Depending on the current output format of the AVAudioEnvironmentNode, only a subset of the
     * rendering algorithms may be supported. An array of valid rendering algorithms can be
     * retrieved by calling applicableRenderingAlgorithms on AVAudioEnvironmentNode.
     * <p>
     * Default: AVAudio3DMixingRenderingAlgorithmEqualPowerPanning
     * Mixer: AVAudioEnvironmentNode
     */
    @Generated
    @Selector("renderingAlgorithm")
    @NInt
    long renderingAlgorithm();

    /**
     * [@property] reverbBlend
     * <p>
     * Controls the blend of dry and reverb processed audio
     * <p>
     * This property controls the amount of the source's audio that will be processed by the reverb
     * in AVAudioEnvironmentNode. A value of 0.5 will result in an equal blend of dry and processed
     * (wet) audio.
     * <p>
     * Range: 0.0 (completely dry) -> 1.0 (completely wet)
     * Default: 0.0
     * Mixer: AVAudioEnvironmentNode
     */
    @Generated
    @Selector("reverbBlend")
    float reverbBlend();

    /**
     * [@property] obstruction
     * <p>
     * Simulates filtering of the direct path of sound due to an obstacle
     * <p>
     * Only the direct path of sound between the source and listener is blocked.
     * <p>
     * Range: -100.0 -> 0.0 dB
     * Default: 0.0
     * Mixer: AVAudioEnvironmentNode
     */
    @Generated
    @Selector("setObstruction:")
    void setObstruction(float value);

    /**
     * [@property] occlusion
     * <p>
     * Simulates filtering of the direct and reverb paths of sound due to an obstacle
     * <p>
     * Both the direct and reverb paths of sound between the source and listener are blocked.
     * <p>
     * Range: -100.0 -> 0.0 dB
     * Default: 0.0
     * Mixer: AVAudioEnvironmentNode
     */
    @Generated
    @Selector("setOcclusion:")
    void setOcclusion(float value);

    /**
     * [@property] pointSourceInHeadMode
     * <p>
     * In-head rendering choice for AVAudio3DMixingSourceModePointSource in AVAudio3DMixingRenderingAlgorithmAuto
     * <p>
     * Default: AVAudio3DMixingPointSourceInHeadModeMono
     * Mixer: AVAudioEnvironmentNode
     */
    @Generated
    @Selector("setPointSourceInHeadMode:")
    void setPointSourceInHeadMode(@NInt long value);

    /**
     * [@property] position
     * <p>
     * The location of the source in the 3D environment
     * <p>
     * The coordinates are specified in meters.
     * <p>
     * Mixer: AVAudioEnvironmentNode
     */
    @Generated
    @Selector("setPosition:")
    void setPosition(@ByValue AVAudio3DPoint value);

    /**
     * [@property] rate
     * <p>
     * Changes the playback rate of the input signal
     * <p>
     * A value of 2.0 results in the output audio playing one octave higher.
     * A value of 0.5, results in the output audio playing one octave lower.
     * <p>
     * Range: 0.5 -> 2.0
     * Default: 1.0
     * Mixer: AVAudioEnvironmentNode
     */
    @Generated
    @Selector("setRate:")
    void setRate(float value);

    /**
     * [@property] renderingAlgorithm
     * <p>
     * Type of rendering algorithm used
     * <p>
     * Depending on the current output format of the AVAudioEnvironmentNode, only a subset of the
     * rendering algorithms may be supported. An array of valid rendering algorithms can be
     * retrieved by calling applicableRenderingAlgorithms on AVAudioEnvironmentNode.
     * <p>
     * Default: AVAudio3DMixingRenderingAlgorithmEqualPowerPanning
     * Mixer: AVAudioEnvironmentNode
     */
    @Generated
    @Selector("setRenderingAlgorithm:")
    void setRenderingAlgorithm(@NInt long value);

    /**
     * [@property] reverbBlend
     * <p>
     * Controls the blend of dry and reverb processed audio
     * <p>
     * This property controls the amount of the source's audio that will be processed by the reverb
     * in AVAudioEnvironmentNode. A value of 0.5 will result in an equal blend of dry and processed
     * (wet) audio.
     * <p>
     * Range: 0.0 (completely dry) -> 1.0 (completely wet)
     * Default: 0.0
     * Mixer: AVAudioEnvironmentNode
     */
    @Generated
    @Selector("setReverbBlend:")
    void setReverbBlend(float value);

    /**
     * [@property] sourceMode
     * <p>
     * Controls how individual channels of an input bus are rendered
     * <p>
     * Default: AVAudio3DMixingSourceModeSpatializeIfMono
     * Mixer: AVAudioEnvironmentNode
     */
    @Generated
    @Selector("setSourceMode:")
    void setSourceMode(@NInt long value);

    /**
     * [@property] sourceMode
     * <p>
     * Controls how individual channels of an input bus are rendered
     * <p>
     * Default: AVAudio3DMixingSourceModeSpatializeIfMono
     * Mixer: AVAudioEnvironmentNode
     */
    @Generated
    @Selector("sourceMode")
    @NInt
    long sourceMode();
}
