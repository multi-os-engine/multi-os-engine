package apple.cinematic.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * The type of object that was detected.
 * 
 * Special detection types include:
 * - autoFocus: from the autofocus system of the camera
 * - fixedFocus: an explicit request to focus at a fixed disparity
 * - custom: an object tracked via a custom tracker
 * 
 * 
 * API-Since: 17.0
 */
@Generated
public final class CNDetectionType {
    @Generated
    private CNDetectionType() {
    }

    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long Unknown = 0x0000000000000000L;
    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long HumanFace = 0x0000000000000001L;
    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long HumanHead = 0x0000000000000002L;
    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long HumanTorso = 0x0000000000000003L;
    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long CatBody = 0x0000000000000004L;
    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long DogBody = 0x0000000000000005L;
    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long CatHead = 0x0000000000000009L;
    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long DogHead = 0x000000000000000AL;
    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long SportsBall = 0x000000000000000BL;
    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long AutoFocus = 0x0000000000000064L;
    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long FixedFocus = 0x0000000000000065L;
    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long Custom = 0x0000000000000066L;
}