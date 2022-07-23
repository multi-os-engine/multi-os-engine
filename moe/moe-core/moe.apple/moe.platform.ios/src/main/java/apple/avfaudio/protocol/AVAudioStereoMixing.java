package apple.avfaudio.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * [@protocol] AVAudioStereoMixing
 * <p>
 * Protocol that defines stereo mixing properties
 */
@Generated
@Library("AVFAudio")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AVAudioStereoMixing")
public interface AVAudioStereoMixing {
    /**
     * [@property] pan
     * <p>
     * Set a bus's stereo pan
     * <p>
     * Range: -1.0 -> 1.0
     * Default: 0.0
     * Mixer: AVAudioMixerNode
     */
    @Generated
    @Selector("pan")
    float pan();

    /**
     * [@property] pan
     * <p>
     * Set a bus's stereo pan
     * <p>
     * Range: -1.0 -> 1.0
     * Default: 0.0
     * Mixer: AVAudioMixerNode
     */
    @Generated
    @Selector("setPan:")
    void setPan(float value);
}
