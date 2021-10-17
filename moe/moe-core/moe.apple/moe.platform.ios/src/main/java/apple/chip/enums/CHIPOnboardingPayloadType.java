package apple.chip.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class CHIPOnboardingPayloadType {
    @Generated
    private CHIPOnboardingPayloadType() {
    }

    @Generated @NUInt public static final long QRCode = 0x0000000000000000L;
    @Generated @NUInt public static final long ManualCode = 0x0000000000000001L;
    @Generated @NUInt public static final long NFC = 0x0000000000000002L;
    @Generated @NUInt public static final long Admin = 0x0000000000000003L;
}
