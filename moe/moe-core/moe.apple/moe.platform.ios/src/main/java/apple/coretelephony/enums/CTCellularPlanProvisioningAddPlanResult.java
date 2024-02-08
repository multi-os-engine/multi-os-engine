package apple.coretelephony.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * API-Since: 12.0
 */
@Generated
public final class CTCellularPlanProvisioningAddPlanResult {
    @Generated
    private CTCellularPlanProvisioningAddPlanResult() {
    }

    /**
     * API-Since: 12.0
     */
    @Generated @NUInt public static final long Unknown = 0x0000000000000000L;
    /**
     * API-Since: 12.0
     */
    @Generated @NUInt public static final long Fail = 0x0000000000000001L;
    /**
     * API-Since: 12.0
     */
    @Generated @NUInt public static final long Success = 0x0000000000000002L;
    /**
     * API-Since: 17.0
     */
    @Generated @NUInt public static final long Cancel = 0x0000000000000003L;
}