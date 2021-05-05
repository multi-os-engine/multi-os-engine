package apple.imagecapturecore.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class ICReturnDownloadErrorCode {
    @Generated
    private ICReturnDownloadErrorCode() {
    }

    /**
     * Destination path supplied is invalid
     */
    @Generated @NInt public static final long PathInvalid = 0xFFFFFFFFFFFFAD94L;
    /**
     * Destination file is not writable
     */
    @Generated @NInt public static final long FileWritable = 0xFFFFFFFFFFFFAD95L;
}