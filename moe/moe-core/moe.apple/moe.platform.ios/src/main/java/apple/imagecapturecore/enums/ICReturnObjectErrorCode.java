package apple.imagecapturecore.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class ICReturnObjectErrorCode {
    @Generated
    private ICReturnObjectErrorCode() {
    }

    /**
     * Object does not exist.
     */
    @Generated @NInt public static final long DoesNotExist = 0xFFFFFFFFFFFFAC36L;
    /**
     * Object data offset invalid.
     */
    @Generated @NInt public static final long DataOffsetInvalid = 0xFFFFFFFFFFFFAC37L;
    /**
     * Object could not be read
     */
    @Generated @NInt public static final long CouldNotBeRead = 0xFFFFFFFFFFFFAC38L;
    /**
     * Object data empty.
     */
    @Generated @NInt public static final long DataEmpty = 0xFFFFFFFFFFFFAC39L;
    /**
     * Requested transfer size is greater than the current maximum allowed.
     */
    @Generated @NInt public static final long DataRequestTooLarge = 0xFFFFFFFFFFFFAC3AL;
}