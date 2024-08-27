package apple.coremedia.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@enum] CMTaggedBufferGroup Errors
 * 
 * The OSStatus errors returned from the CMTaggedBufferGroup routines.
 * [@constant] kCMTaggedBufferGroupError_ParamErr Returned when caller passes incorrect input or output parameters.
 * [@constant] kCMTaggedBufferGroupError_AllocationFailed Returned if a necessary allocation failed.
 * [@constant] kCMTaggedBufferGroupError_InternalError Returned if some kind of internal implementation error occurred.
 * 
 * API-Since: 17.0
 */
@Generated
public final class CMTaggedBufferGroupError {
    @Generated
    private CMTaggedBufferGroupError() {
    }

    /**
     * API-Since: 17.0
     */
    @Generated public static final int ParamErr = 0xFFFFC25C;
    /**
     * API-Since: 17.0
     */
    @Generated public static final int AllocationFailed = 0xFFFFC25B;
    /**
     * API-Since: 17.0
     */
    @Generated public static final int InternalError = 0xFFFFC25A;
}