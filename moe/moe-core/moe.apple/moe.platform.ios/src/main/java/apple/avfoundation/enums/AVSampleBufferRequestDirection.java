package apple.avfoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] AVSampleBufferRequestDirection
 * 
 * Indicates the direction in which the samples should be generated for the AVSampleBufferRequest.
 * 
 * [@constant] AVSampleBufferRequestDirectionNone
 * Indicates only one sample will be loaded at [AVSampleBufferRequest startCursor], and the [AVSampleBufferRequest
 * limitCursor], [AVSampleBufferRequest preferredMinSampleCount], and [AVSampleBufferRequest maxSampleCount] will be
 * ignored.
 * [@constant] AVSampleBufferRequestDirectionForward
 * Indicates zero or more following samples may be loaded from [AVSampleBufferRequest startCursor], subject to
 * [AVSampleBufferRequest limitCursor], [AVSampleBufferRequest preferredMinSampleCount], and [AVSampleBufferRequest
 * maxSampleCount]
 * [@constant] AVSampleBufferRequestDirectionReverse
 * Indicates zero or more preceeding samples may be loaded from [AVSampleBufferRequest startCursor], subject to
 * [AVSampleBufferRequest limitCursor], [AVSampleBufferRequest preferredMinSampleCount], and [AVSampleBufferRequest
 * maxSampleCount]
 */
@Generated
public final class AVSampleBufferRequestDirection {
    @Generated
    private AVSampleBufferRequestDirection() {
    }

    @Generated @NInt public static final long Forward = 0x0000000000000001L;
    @Generated @NInt public static final long None = 0x0000000000000000L;
    @Generated @NInt public static final long Reverse = 0xFFFFFFFFFFFFFFFFL;
}
