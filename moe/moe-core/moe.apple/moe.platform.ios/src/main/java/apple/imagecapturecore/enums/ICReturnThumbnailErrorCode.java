package apple.imagecapturecore.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class ICReturnThumbnailErrorCode {
    @Generated
    private ICReturnThumbnailErrorCode() {
    }

    /**
     * Item does not have thumbnail available.
     */
    @Generated @NInt public static final long NotAvailable = 0xFFFFFFFFFFFFADF8L;
    /**
     * Item thumbnail request is being serviced.
     */
    @Generated @NInt public static final long AlreadyFetching = 0xFFFFFFFFFFFFADF9L;
    /**
     * Item thumbnail request has been canceled.
     */
    @Generated @NInt public static final long Canceled = 0xFFFFFFFFFFFFB17EL;
    /**
     * Item thumbnail request completed with invalid result.
     */
    @Generated @NInt public static final long Invalid = 0xFFFFFFFFFFFFB17FL;
}