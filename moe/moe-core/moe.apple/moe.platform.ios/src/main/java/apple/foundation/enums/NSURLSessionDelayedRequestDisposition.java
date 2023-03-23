package apple.foundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Disposition options for various delegate messages
 * 
 * API-Since: 11.0
 */
@Generated
public final class NSURLSessionDelayedRequestDisposition {
    @Generated
    private NSURLSessionDelayedRequestDisposition() {
    }

    /**
     * Use the original request provided when the task was created; the request parameter is ignored.
     * 
     * API-Since: 11.0
     */
    @Generated @NInt public static final long ContinueLoading = 0x0000000000000000L;
    /**
     * Use the specified request, which may not be nil.
     * 
     * API-Since: 11.0
     */
    @Generated @NInt public static final long UseNewRequest = 0x0000000000000001L;
    /**
     * Cancel the task; the request parameter is ignored.
     * 
     * API-Since: 11.0
     */
    @Generated @NInt public static final long Cancel = 0x0000000000000002L;
}