package apple.sensitivecontentanalysis.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Options for the different types of analyzed video streams.
 * 
 * Pass this enum into the ``SCVideoStreamAnalyzer/init(participantUUID:streamDirection:)`` initializer when creating an
 * ``SCVideoStreamAnalyzer`` to analyze video streams.
 * 
 * API-Since: 26.0
 */
@Generated
public final class SCVideoStreamAnalyzerStreamDirection {
    @Generated
    private SCVideoStreamAnalyzerStreamDirection() {
    }

    /**
     * An option that refers to a video stream sent to another device.
     * 
     * This option refers to the stream that originates from the device's camera.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Outgoing = 0x0000000000000001L;
    /**
     * An option that indicates a video stream from another device.
     * 
     * This option refers to a video stream that the device receives over the network from another device's camera.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Incoming = 0x0000000000000002L;
}