package apple.imagecapturecore.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class ICReturnMetadataErrorCode {
    @Generated
    private ICReturnMetadataErrorCode() {
    }

    /**
     * Item does not have metadata available.
     */
    @Generated @NInt public static final long NotAvailable = 0xFFFFFFFFFFFFB14AL;
    /**
     * Item metadata request is being serviced.
     */
    @Generated @NInt public static final long AlreadyFetching = 0xFFFFFFFFFFFFB14BL;
    /**
     * Item metadata request has been canceled.
     */
    @Generated @NInt public static final long Canceled = 0xFFFFFFFFFFFFB14CL;
    /**
     * Item metadata request completed with invalid result.
     */
    @Generated @NInt public static final long Invalid = 0xFFFFFFFFFFFFB14DL;
}