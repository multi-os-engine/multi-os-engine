package apple.passkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Identity error codes.
 * 
 * API-Since: 16.0
 */
@Generated
public final class PKIdentityError {
    @Generated
    private PKIdentityError() {
    }

    /**
     * Catch-all for all errors without a specific error code.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Unknown = 0x0000000000000000L;
    /**
     * Returned if the request originates from an unsupported device.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long NotSupported = 0x0000000000000001L;
    /**
     * Returned if the sheet was cancelled.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Cancelled = 0x0000000000000002L;
    /**
     * Returned if a request cannot be processed because
     * the network is not available.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long NetworkUnavailable = 0x0000000000000003L;
    /**
     * Returned if no supported elements were requested.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long NoElementsRequested = 0x0000000000000004L;
    /**
     * Returned if a request is made but another request is already
     * in progress.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long RequestAlreadyInProgress = 0x0000000000000005L;
    /**
     * Returned if the caller-supplied nonce is too large or otherwise unsuitable.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long InvalidNonce = 0x0000000000000006L;
    /**
     * Returned if an element requested by the caller is invalid.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long InvalidElement = 0x0000000000000007L;
}