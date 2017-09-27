package apple.avfoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class AVCaptureLensStabilizationStatus {
    @Generated
    private AVCaptureLensStabilizationStatus() {
    }

    @Generated @NInt public static final long Unsupported = 0x0000000000000000L;
    @Generated @NInt public static final long Off = 0x0000000000000001L;
    @Generated @NInt public static final long Active = 0x0000000000000002L;
    @Generated @NInt public static final long OutOfRange = 0x0000000000000003L;
    @Generated @NInt public static final long Unavailable = 0x0000000000000004L;
}