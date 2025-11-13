package apple.videotoolbox.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * `VTFrameProcessor` error codes.
 * 
 * These error codes are returned in the `NSError` object in the event a method fails.
 */
@Generated
public final class VTFrameProcessorError {
    @Generated
    private VTFrameProcessorError() {
    }

    /**
     * Returned if the processor failed for unknown reason.
     */
    @Generated @NInt public static final long UnknownError = 0xFFFFFFFFFFFFB2EEL;
    /**
     * Returned if the processor failed due to an unsupported resolution.
     */
    @Generated @NInt public static final long UnsupportedResolution = 0xFFFFFFFFFFFFB2EDL;
    /**
     * Returned if the session is used to process frames without being started.
     */
    @Generated @NInt public static final long SessionNotStarted = 0xFFFFFFFFFFFFB2ECL;
    /**
     * Returned if a `startSessionWithConfiguration` call is made on a session which has already been started.
     */
    @Generated @NInt public static final long SessionAlreadyActive = 0xFFFFFFFFFFFFB2EBL;
    /**
     * Returned if a fatal error is encoutnered during processing.
     */
    @Generated @NInt public static final long FatalError = 0xFFFFFFFFFFFFB2EAL;
    /**
     * Returned if processing failed and current session should be stopped.
     */
    @Generated @NInt public static final long SessionLevelError = 0xFFFFFFFFFFFFB2E9L;
    /**
     * Returned if the session failed to initialize the processing pipeline.
     */
    @Generated @NInt public static final long InitializationFailed = 0xFFFFFFFFFFFFB2E8L;
    /**
     * Returned to indicate that one or more frames is in a format which is not supproted by the processor.
     */
    @Generated @NInt public static final long UnsupportedInput = 0xFFFFFFFFFFFFB2E7L;
    /**
     * Returned if the session or processor is unable to allocate required memory.
     */
    @Generated @NInt public static final long MemoryAllocationFailure = 0xFFFFFFFFFFFFB2E6L;
    /**
     * Returned if the specifed revision is not supported by the configured processor.
     */
    @Generated @NInt public static final long RevisionNotSupported = 0xFFFFFFFFFFFFB2E5L;
    /**
     * Returned if the processor encountered an issue preventing it from processing the provided frame.
     */
    @Generated @NInt public static final long ProcessingError = 0xFFFFFFFFFFFFB2E4L;
    /**
     * Returned if one of the provided parameters is not valid.
     */
    @Generated @NInt public static final long InvalidParameterError = 0xFFFFFFFFFFFFB2E3L;
    /**
     * Returned if one of the provided `VTFrameProcessorFrame` objects has a presentation time which is not supported by
     * the processor, either invalid or out-of-order.
     */
    @Generated @NInt public static final long InvalidFrameTiming = 0xFFFFFFFFFFFFB2E2L;
    /**
     * Returned if download of a required model asset for the processor failed
     */
    @Generated @NInt public static final long AssetDownloadFailed = 0xFFFFFFFFFFFFB2E1L;
}