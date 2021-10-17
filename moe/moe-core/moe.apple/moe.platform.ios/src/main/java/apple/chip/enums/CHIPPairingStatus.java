package apple.chip.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class CHIPPairingStatus {
    @Generated
    private CHIPPairingStatus() {
    }

    @Generated @NUInt public static final long SecurePairingSuccess = 0x0000000000000000L;
    @Generated @NUInt public static final long SecurePairingFailed = 0x0000000000000001L;
    @Generated @NUInt public static final long UnknownStatus = 0x0000000000000002L;
}
