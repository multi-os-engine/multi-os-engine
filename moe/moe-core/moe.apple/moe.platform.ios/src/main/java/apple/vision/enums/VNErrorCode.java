package apple.vision.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class VNErrorCode {
    @Generated
    private VNErrorCode() {
    }

    @Generated @NInt public static final long OK = 0x0000000000000000L;
    @Generated @NInt public static final long RequestCancelled = 0x0000000000000001L;
    @Generated @NInt public static final long InvalidFormat = 0x0000000000000002L;
    @Generated @NInt public static final long OperationFailed = 0x0000000000000003L;
    @Generated @NInt public static final long OutOfBoundsError = 0x0000000000000004L;
    @Generated @NInt public static final long InvalidOption = 0x0000000000000005L;
    @Generated @NInt public static final long IOError = 0x0000000000000006L;
    @Generated @NInt public static final long MissingOption = 0x0000000000000007L;
    @Generated @NInt public static final long NotImplemented = 0x0000000000000008L;
    @Generated @NInt public static final long InternalError = 0x0000000000000009L;
    @Generated @NInt public static final long OutOfMemory = 0x000000000000000AL;
    @Generated @NInt public static final long UnknownError = 0x000000000000000BL;
    @Generated @NInt public static final long InvalidOperation = 0x000000000000000CL;
    @Generated @NInt public static final long InvalidImage = 0x000000000000000DL;
    @Generated @NInt public static final long InvalidArgument = 0x000000000000000EL;
    @Generated @NInt public static final long InvalidModel = 0x000000000000000FL;
    /**
     * API-Since: 12.0
     */
    @Generated @NInt public static final long UnsupportedRevision = 0x0000000000000010L;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long DataUnavailable = 0x0000000000000011L;
    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long TimeStampNotFound = 0x0000000000000012L;
    /**
     * API-Since: 15.0
     */
    @Generated @NInt public static final long UnsupportedRequest = 0x0000000000000013L;
    @Generated @NInt public static final long TuriCoreErrorCode = 0xFFFFFFFFFFFFFFFFL;
    /**
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Timeout = 0x0000000000000014L;
}
