package apple.coremedia.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@enum] CMTag Errors
 * 
 * The OSStatus errors returned from the CMTag routines.
 * [@constant] kCMTagError_ParamErr Returned when caller passes incorrect input or output parameters.
 * [@constant] kCMTagError_AllocationFailed Returned if a necessary allocation failed.
 * 
 * API-Since: 17.0
 */
@Generated
public final class CMTagError {
    @Generated
    private CMTagError() {
    }

    /**
     * API-Since: 17.0
     */
    @Generated public static final int ParamErr = 0xFFFFC28E;
    /**
     * API-Since: 17.0
     */
    @Generated public static final int AllocationFailed = 0xFFFFC28D;
}