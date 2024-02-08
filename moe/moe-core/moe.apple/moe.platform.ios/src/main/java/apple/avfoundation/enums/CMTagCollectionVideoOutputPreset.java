package apple.avfoundation.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@enum] CMTagCollectionVideoOutputPreset
 * 
 * Video output presets supported by CMTagCollectionCreateWithVideoOutputPreset.
 * [@constant] kCMTagCollectionVideoOutputPreset_Monoscopic
 * Used for video output where there is no stereo view, e.g. kCMTagStereoNone.
 * [@constant] kCMTagCollectionVideoOutputPreset_Stereoscopic
 * Used for video output where there are two stereo views, for both left and right eyes, e.g. kCMTagStereoLeftAndRight.
 * 
 * API-Since: 17.2
 */
@Generated
public final class CMTagCollectionVideoOutputPreset {
    @Generated
    private CMTagCollectionVideoOutputPreset() {
    }

    /**
     * API-Since: 17.2
     */
    @Generated public static final int Monoscopic = 0x00000000;
    /**
     * API-Since: 17.2
     */
    @Generated public static final int Stereoscopic = 0x00000001;
}