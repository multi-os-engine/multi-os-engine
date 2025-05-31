package apple.gamekit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * Describes the release state of an App Store Connect resource, such as an Achievement or Leaderboard.
 * 
 * API-Since: 18.4
 */
@Generated
public final class GKReleaseState {
    @Generated
    private GKReleaseState() {
    }

    /**
     * The system can't determine the release state of the resource.
     * 
     * API-Since: 18.4
     */
    @Generated @NUInt public static final long Unknown = 0x0000000000000000L;
    /**
     * The resource is associated with a release in App Store Connect. This has no relationship with the "archived"
     * state of a resource (i.e., A resource can be release _and_ archived).
     * 
     * API-Since: 18.4
     */
    @Generated @NUInt public static final long Released = 0x0000000000000001L;
    /**
     * The resource has been created in App Store Connect but isn't yet associated with a released version of an App.
     * 
     * API-Since: 18.4
     */
    @Generated @NUInt public static final long Prereleased = 0x0000000000000002L;
}