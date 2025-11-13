package apple.cinematic.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] CNSpatialAudioRenderingStyle
 * 
 * Standard rendering styles for Audio Mix type effects
 * 
 * API-Since: 26.0
 */
@Generated
public final class CNSpatialAudioRenderingStyle {
    @Generated
    private CNSpatialAudioRenderingStyle() {
    }

    /**
     * Isolates the ambience and place it in a spatial stem. Isolates all voices and place them in a mono stem.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Cinematic = 0x0000000000000000L;
    /**
     * Isolates the ambience and place it in a spatial stem. Isolates all voices, add a studio/proximity effect in the
     * voice track and place them in a mono stem.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Studio = 0x0000000000000001L;
    /**
     * Isolates the ambience and place it in a spatial stem. Isolates only voices from the camera field of view and
     * place them in a mono stem.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long InFrame = 0x0000000000000002L;
    /**
     * Isolates the ambience when foreground is cinematic Audio Mix and place it in a spatial stem. There is no voice
     * stem.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long CinematicBackgroundStem = 0x0000000000000003L;
    /**
     * Isolates all voices and places them in a mono stem. There is no ambience stem.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long CinematicForegroundStem = 0x0000000000000004L;
    /**
     * Isolates all voices, add a studio/proximity effect in the voice track and place them in a mono stem. There is no
     * ambience stem.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long StudioForegroundStem = 0x0000000000000005L;
    /**
     * Isolates only voices from the camera field of view and place them in a mono stem. There is no ambience stem.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long InFrameForegroundStem = 0x0000000000000006L;
    /**
     * This produces a spatial stem of the original recording that is unprocessed. This is the default rendering style.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Standard = 0x0000000000000007L;
    /**
     * Isolates the ambience when foreground is studio Audio Mix and place it in a spatial stem. There is no voice stem.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long StudioBackgroundStem = 0x0000000000000008L;
    /**
     * Isolates the ambience and foreground that is out of frame and place it in a spatial stem. There is no voice stem.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long InFrameBackgroundStem = 0x0000000000000009L;
}