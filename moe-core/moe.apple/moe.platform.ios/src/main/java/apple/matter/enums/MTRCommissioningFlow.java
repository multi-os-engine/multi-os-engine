package apple.matter.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class MTRCommissioningFlow {
    @Generated
    private MTRCommissioningFlow() {
    }

    /**
     * Device automatically enters commissioning mode upon power-up
     */
    @Generated @NUInt public static final long Standard = 0x0000000000000000L;
    /**
     * Device requires a user interaction to enter commissioning mode
     */
    @Generated @NUInt public static final long UserActionRequired = 0x0000000000000001L;
    /**
     * Commissioning steps should be retrieved from the distributed compliance ledger
     */
    @Generated @NUInt public static final long Custom = 0x0000000000000002L;
    @Generated @NUInt public static final long Invalid = 0x0000000000000003L;
}