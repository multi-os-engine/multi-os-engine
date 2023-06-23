package apple.avfoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * [@enum] AVDelegatingPlaybackCoordinatorSeekOptions
 * 
 * Configuration for a call to [AVDelegatingPlaybackCoordinator coordinateSeekToTime:options:].
 * 
 * [@constant] AVDelegatingPlaybackCoordinatorSeekOptionResumeImmediately
 * Requests that the coordinator resume playback as soon as possible after the seek is complete and ignore other
 * participant's readiness and suspensions.
 */
@Generated
public final class AVDelegatingPlaybackCoordinatorSeekOptions {
    @Generated
    private AVDelegatingPlaybackCoordinatorSeekOptions() {
    }

    @Generated @NUInt public static final long AVDelegatingPlaybackCoordinatorSeekOptionResumeImmediately = 0x0000000000000001L;
}
