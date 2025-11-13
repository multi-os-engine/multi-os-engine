package apple.audiotoolbox.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@enum] AUAudioMix styles
 * 
 * Constants available as values for parameter kAUAudioMixParameter_Style.
 * 
 * [@constant] kAudioMixRenderingStyle_Cinematic
 * Cinematic rendering style (default)
 * 
 * [@constant] kAudioMixRenderingStyle_Studio
 * Studio rendering style
 * 
 * [@constant] kAudioMixRenderingStyle_InFrame
 * In-Frame rendering style
 * 
 * [@constant] kAudioMixRenderingStyle_CinematicBackgroundStem
 * Cinematic rendering style - background only
 * 
 * [@constant] kAudioMixRenderingStyle_CinematicForegroundStem
 * Cinematic rendering style - foreground only
 * 
 * [@constant] kAudioMixRenderingStyle_StudioForegroundStem
 * Studio rendering style - foreground only
 * 
 * [@constant] kAudioMixRenderingStyle_InFrameForegroundStem
 * In-Frame rendering style - foreground only
 * 
 * [@constant] kAudioMixRenderingStyle_Standard
 * Standard rendering style
 * 
 * [@constant] kAudioMixRenderingStyle_StudioBackgroundStem
 * Studio rendering style - background only
 * 
 * [@constant] kAudioMixRenderingStyle_InFrameBackgroundStem
 * In-Frame rendering style - background only
 */
@Generated
public final class AUAudioMixRenderingStyle {
    @Generated
    private AUAudioMixRenderingStyle() {
    }

    /**
     * API-Since: 26.0
     */
    @Generated public static final int Cinematic = 0x00000000;
    /**
     * API-Since: 26.0
     */
    @Generated public static final int Studio = 0x00000001;
    /**
     * API-Since: 26.0
     */
    @Generated public static final int InFrame = 0x00000002;
    /**
     * API-Since: 26.0
     */
    @Generated public static final int CinematicBackgroundStem = 0x00000003;
    /**
     * API-Since: 26.0
     */
    @Generated public static final int CinematicForegroundStem = 0x00000004;
    /**
     * API-Since: 26.0
     */
    @Generated public static final int StudioForegroundStem = 0x00000005;
    /**
     * API-Since: 26.0
     */
    @Generated public static final int InFrameForegroundStem = 0x00000006;
    /**
     * API-Since: 26.0
     */
    @Generated public static final int Standard = 0x00000007;
    /**
     * API-Since: 26.0
     */
    @Generated public static final int StudioBackgroundStem = 0x00000008;
    /**
     * API-Since: 26.0
     */
    @Generated public static final int InFrameBackgroundStem = 0x00000009;
}