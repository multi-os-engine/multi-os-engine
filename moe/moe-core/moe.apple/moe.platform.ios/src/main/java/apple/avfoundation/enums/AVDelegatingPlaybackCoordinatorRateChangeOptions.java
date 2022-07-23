package apple.avfoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * [@enum] AVDelegatingPlaybackCoordinatorRateChangeOptions
 * <p>
 * Configuration for a call to [AVDelegatingPlaybackCoordinator coordinateRateChangeToRate:options:].
 * <p>
 * [@constant] AVDelegatingPlaybackCoordinatorRateChangeOptionPlayImmediately
 * Requests that the coordinator begin playback as soon as possible and ignore other participant's readiness and
 * suspensions.
 */
@Generated
public final class AVDelegatingPlaybackCoordinatorRateChangeOptions {
    @Generated
    private AVDelegatingPlaybackCoordinatorRateChangeOptions() {
    }

    @Generated @NUInt public static final long AVDelegatingPlaybackCoordinatorRateChangeOptionPlayImmediately = 0x0000000000000001L;
}
