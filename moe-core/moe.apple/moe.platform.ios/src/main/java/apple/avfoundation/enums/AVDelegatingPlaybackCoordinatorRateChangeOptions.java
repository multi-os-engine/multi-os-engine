package apple.avfoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * Configuration for a call to [AVDelegatingPlaybackCoordinator coordinateRateChangeToRate:options:].
 */
@Generated
public final class AVDelegatingPlaybackCoordinatorRateChangeOptions {
    @Generated
    private AVDelegatingPlaybackCoordinatorRateChangeOptions() {
    }

    /**
     * Requests that the coordinator begin playback as soon as possible and ignore other participant's readiness and
     * suspensions.
     */
    @Generated @NUInt public static final long AVDelegatingPlaybackCoordinatorRateChangeOptionPlayImmediately = 0x0000000000000001L;
}
