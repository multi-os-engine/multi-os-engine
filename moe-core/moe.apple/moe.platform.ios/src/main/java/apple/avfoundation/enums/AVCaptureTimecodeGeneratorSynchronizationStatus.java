package apple.avfoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Constants defining the synchronization status of a timecode generator .
 * 
 * API-Since: 26.0
 */
@Generated
public final class AVCaptureTimecodeGeneratorSynchronizationStatus {
    @Generated
    private AVCaptureTimecodeGeneratorSynchronizationStatus() {
    }

    /**
     * The initial state before a source is selected or during error conditions.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Unknown = 0x0000000000000000L;
    /**
     * A timecode source has been selected, but synchronization has not yet started.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long SourceSelected = 0x0000000000000001L;
    /**
     * The timecode generator is actively synchronizing to the selected source.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Synchronizing = 0x0000000000000002L;
    /**
     * The timecode generator is successfully synchronized to the selected source, maintaining active timing alignment.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Synchronized = 0x0000000000000003L;
    /**
     * The synchronization has timed out.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long TimedOut = 0x0000000000000004L;
    /**
     * The timecode generator has failed to establish a connection with a given source.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long SourceUnavailable = 0x0000000000000005L;
    /**
     * The timecode generator is receiving data from the source in an unrecognized format.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long SourceUnsupported = 0x0000000000000006L;
    /**
     * The timecode generator does not require active synchronization for a given source.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long NotRequired = 0x0000000000000007L;
}