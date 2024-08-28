package apple.linkpresentation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 13.0
 */
@Generated
public final class LPErrorCode {
    @Generated
    private LPErrorCode() {
    }

    /**
     * An unknown error.
     * 
     * API-Since: 13.0
     */
    @Generated @NInt public static final long Unknown = 0x0000000000000001L;
    /**
     * An error indicating that a metadata fetch failed.
     * 
     * API-Since: 13.0
     */
    @Generated @NInt public static final long MetadataFetchFailed = 0x0000000000000002L;
    /**
     * An error indicating that the metadata fetch was canceled by the client.
     * 
     * API-Since: 13.0
     */
    @Generated @NInt public static final long MetadataFetchCancelled = 0x0000000000000003L;
    /**
     * An error indicating that the metadata fetch took longer than allowed.
     * 
     * API-Since: 13.0
     */
    @Generated @NInt public static final long MetadataFetchTimedOut = 0x0000000000000004L;
    /**
     * An error indicating that the metadata fetch was not allowed due to system policies.
     * 
     * API-Since: 17.0
     */
    @Generated @NInt public static final long MetadataFetchNotAllowed = 0x0000000000000005L;
}
