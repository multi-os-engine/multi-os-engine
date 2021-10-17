package apple.avfaudio.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] AVAudioStereoOrientation
 * <p>
 * Constants indicating stereo input audio orientation, for use with built-in mic input data sources with a stereo polar pattern selected.
 * <p>
 * [@var] AVAudioStereoOrientationNone
 * Indicates that audio capture orientation is not applicable (on mono capture, for instance).
 * [@var] AVAudioStereoOrientationPortrait
 * Indicates that audio capture should be oriented vertically, Lightning connector on the bottom.
 * [@var] AVAudioStereoOrientationPortraitUpsideDown
 * Indicates that audio capture should be oriented vertically, Lightning connector on the top.
 * [@var] AVAudioStereoOrientationLandscapeRight
 * Indicates that audio capture should be oriented horizontally, Lightning connector on the right.
 * [@var] AVAudioStereoOrientationLandscapeLeft
 * Indicates that audio capture should be oriented horizontally, Lightning connector on the left.
 */
@Generated
public final class AVAudioStereoOrientation {
    @Generated
    private AVAudioStereoOrientation() {
    }

    @Generated @NInt public static final long None = 0x0000000000000000L;
    @Generated @NInt public static final long Portrait = 0x0000000000000001L;
    @Generated @NInt public static final long PortraitUpsideDown = 0x0000000000000002L;
    @Generated @NInt public static final long LandscapeRight = 0x0000000000000003L;
    @Generated @NInt public static final long LandscapeLeft = 0x0000000000000004L;
}
