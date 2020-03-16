package apple.soundanalysis.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class SNErrorCode {
    @Generated
    private SNErrorCode() {
    }

    @Generated @NInt public static final long UnknownError = 0x0000000000000001L;
    @Generated @NInt public static final long OperationFailed = 0x0000000000000002L;
    @Generated @NInt public static final long InvalidFormat = 0x0000000000000003L;
    @Generated @NInt public static final long InvalidModel = 0x0000000000000004L;
    @Generated @NInt public static final long InvalidFile = 0x0000000000000005L;
}