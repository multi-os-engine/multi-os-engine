package apple.linkpresentation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Constants used by NSError to indicate errors in the LinkPresentation domain.
 */
@Generated
public final class LPErrorCode {
    @Generated
    private LPErrorCode() {
    }

    /**
     * LPErrorUnknown indicates that an unknown error occurred.
     */
    @Generated @NInt public static final long Unknown = 0x0000000000000001L;
    /**
     * LPErrorMetadataFetchFailed indicates that a metadata fetch failed.
     * This can be due to network conditions, server availability, or any number of other causes.
     */
    @Generated @NInt public static final long MetadataFetchFailed = 0x0000000000000002L;
    /**
     * LPErrorMetadataFetchCancelled indicates that the metadata fetch was cancelled by the client.
     */
    @Generated @NInt public static final long MetadataFetchCancelled = 0x0000000000000003L;
    /**
     * LPErrorMetadataFetchTimedOut indicates that the metadata fetch took longer than allowed.
     */
    @Generated @NInt public static final long MetadataFetchTimedOut = 0x0000000000000004L;
}
