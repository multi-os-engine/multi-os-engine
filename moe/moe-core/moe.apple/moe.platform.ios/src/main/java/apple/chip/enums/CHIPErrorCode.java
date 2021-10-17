package apple.chip.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class CHIPErrorCode {
    @Generated
    private CHIPErrorCode() {
    }

    @Generated @NInt public static final long Success = 0x0000000000000000L;
    @Generated @NInt public static final long ErrorCodeUndefinedError = 0x0000000000000001L;
    @Generated @NInt public static final long ErrorCodeInvalidStringLength = 0x0000000000000002L;
    @Generated @NInt public static final long ErrorCodeInvalidIntegerValue = 0x0000000000000003L;
    @Generated @NInt public static final long ErrorCodeInvalidArgument = 0x0000000000000004L;
    @Generated @NInt public static final long ErrorCodeInvalidMessageLength = 0x0000000000000005L;
    @Generated @NInt public static final long ErrorCodeInvalidState = 0x0000000000000006L;
    @Generated @NInt public static final long ErrorCodeWrongAddressType = 0x0000000000000007L;
    @Generated @NInt public static final long ErrorCodeIntegrityCheckFailed = 0x0000000000000008L;
    @Generated @NInt public static final long ErrorCodeDuplicateExists = 0x0000000000000009L;
}
