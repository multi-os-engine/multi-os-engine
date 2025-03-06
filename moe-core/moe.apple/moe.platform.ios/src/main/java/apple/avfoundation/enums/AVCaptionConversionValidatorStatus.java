package apple.avfoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] AVCaptionConversionValidatorStatus
 * 
 * These constants are returned by the AVCaptionConversionValidator status property to indicate the progress of a
 * validation operation.
 * 
 * [@constant] AVCaptionConversionValidatorStatusUnknown
 * Indicates that the validation operation has not yet been initiated.
 * [@constant] AVCaptionConversionValidatorStatusValidating
 * Indicates that the validation operation is currently in progress.
 * [@constant] AVCaptionConversionValidatorStatusCompleted
 * Indicates that the validation operation has been completed.
 * [@constant] AVCaptionConversionValidatorStatusStopped
 * Indicates that the validation operation was stopped prior to completion.
 * 
 * API-Since: 18.0
 */
@Generated
public final class AVCaptionConversionValidatorStatus {
    @Generated
    private AVCaptionConversionValidatorStatus() {
    }

    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Unknown = 0x0000000000000000L;
    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Validating = 0x0000000000000001L;
    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Completed = 0x0000000000000002L;
    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Stopped = 0x0000000000000003L;
}