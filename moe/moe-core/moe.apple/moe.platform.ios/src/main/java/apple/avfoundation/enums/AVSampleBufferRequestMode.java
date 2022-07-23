package apple.avfoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] AVSampleBufferRequestMode
 * <p>
 * Defines the allowed values for AVSampleBufferRequest's mode property.
 * <p>
 * [@constant] AVSampleBufferRequestModeImmediate
 * Sample data for requests with AVSampleBufferRequestModeImmediate will be loaded as soon as possible. The current time
 * represented by AVSampleBufferGenerator's timebase has no influence on these requests.
 * [@constant] AVSampleBufferRequestModeScheduled
 * AVSampleBufferRequestModeScheduled indicates that a request is needed by the time AVSampleBufferGenerator's timebase
 * reaches the CMSampleBuffer's presentationTime or, if specificed, AVSampleBufferRequest's overrideTime. The
 * AVSampleBufferGenerator will attempt to deliver sample data with sufficient leeway for downstream processing. It will
 * also attempt to hold off on loading data until the CMSampleBuffer is needed. If AVSampleBufferGenerator's timebase
 * has a rate of zero, this mode behaves like AVSampleBufferRequestModeImmediate.
 * [@constant] AVSampleBufferRequestModeOpportunistic
 * The AVSampleBufferGenerator will attempt to read data for opportunistic requests as soon as possible. However, in
 * situations with multiple competing requests, the AVSampleBufferGenerator may defer an opportunistic request in favor
 * of another immediate request or a scheduled requests with a presentation time close to the timebase time. Because a
 * request with AVSampleBufferRequestModeOpportunistic may be postponed indefinitely, this mode should not be used for
 * time-sensitive processing.
 */
@Generated
public final class AVSampleBufferRequestMode {
    @Generated
    private AVSampleBufferRequestMode() {
    }

    @Generated @NInt public static final long Immediate = 0x0000000000000000L;
    @Generated @NInt public static final long Scheduled = 0x0000000000000001L;
    @Generated @NInt public static final long Opportunistic = 0x0000000000000002L;
}
