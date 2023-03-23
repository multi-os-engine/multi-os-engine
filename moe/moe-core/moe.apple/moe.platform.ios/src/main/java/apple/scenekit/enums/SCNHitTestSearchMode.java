package apple.scenekit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] SCNHitTestSearchMode
 * 
 * hit test modes
 * 
 * API-Since: 11.0
 */
@Generated
public final class SCNHitTestSearchMode {
    @Generated
    private SCNHitTestSearchMode() {
    }

    /**
     * The closest object found.
     * 
     * API-Since: 11.0
     */
    @Generated @NInt public static final long Closest = 0x0000000000000000L;
    /**
     * All found objects sorted from nearest to farthest.
     * 
     * API-Since: 11.0
     */
    @Generated @NInt public static final long All = 0x0000000000000001L;
    /**
     * The first object found. This object is not necessarily the nearest.
     * 
     * API-Since: 11.0
     */
    @Generated @NInt public static final long Any = 0x0000000000000002L;
}
