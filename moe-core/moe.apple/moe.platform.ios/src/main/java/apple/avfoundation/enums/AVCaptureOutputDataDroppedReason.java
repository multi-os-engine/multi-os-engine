package apple.avfoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] AVCaptureOutputDataDroppedReason
 * 
 * Constants indicating the reason a capture data output dropped data.
 * 
 * [@constant] AVCaptureOutputDataDroppedReasonNone
 * No data was dropped.
 * [@constant] AVCaptureOutputDataDroppedReasonLateData
 * Data was dropped because alwaysDiscardsLate{VideoFrames | DepthData} is YES and the client was still processing
 * previous data when the current data needed to be delivered.
 * [@constant] AVCaptureOutputDataDroppedReasonOutOfBuffers
 * Data was dropped because its pool of buffers ran dry. This is usually indicative that the client is holding onto data
 * objects too long.
 * [@constant] AVCaptureOutputDataDroppedReasonDiscontinuity
 * Data was dropped because the device providing the data experienced a discontinuity, and an unknown number of data
 * objects have been lost. This condition is typically caused by the system being too busy.
 * 
 * API-Since: 11.0
 */
@Generated
public final class AVCaptureOutputDataDroppedReason {
    @Generated
    private AVCaptureOutputDataDroppedReason() {
    }

    /**
     * API-Since: 11.0
     */
    @Generated @NInt public static final long None = 0x0000000000000000L;
    /**
     * API-Since: 11.0
     */
    @Generated @NInt public static final long LateData = 0x0000000000000001L;
    /**
     * API-Since: 11.0
     */
    @Generated @NInt public static final long OutOfBuffers = 0x0000000000000002L;
    /**
     * API-Since: 11.0
     */
    @Generated @NInt public static final long Discontinuity = 0x0000000000000003L;
}
