package apple.phase.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * [@enum] PHASEAutomaticHeadTrackingFlags
 * 
 * Automatic Head-Tracking flags.
 * [@constant] PHASEAutomaticHeadTrackingFlagOrientation
 * On capable devices, listener orientation will be automatically rotated based on user's head-orientation.
 * [@constant] PHASEAutomaticHeadTrackingFlagPosition
 * On capable devices, listener position will be automatically set based on user's position.
 * 
 * API-Since: 18.0
 */
@Generated
public final class PHASEAutomaticHeadTrackingFlags {
    @Generated
    private PHASEAutomaticHeadTrackingFlags() {
    }

    /**
     * API-Since: 18.0
     */
    @Generated @NUInt public static final long Orientation = 0x0000000000000001L;
    /**
     * API-Since: 18.0
     */
    @Generated @NUInt public static final long Position = 0x0000000000000002L;
}