package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 12.2
 */
@Generated
public final class UIGuidedAccessErrorCode {
    @Generated
    private UIGuidedAccessErrorCode() {
    }

    /**
     * The application is not authorized to perform the requested action. For example, it may have requested a
     * configuration change but is not locked into Single App Mode via a configuration profile.
     * 
     * API-Since: 12.2
     */
    @Generated @NInt public static final long PermissionDenied = 0x0000000000000000L;
    /**
     * Generic failure.
     * 
     * API-Since: 12.2
     */
    @Generated @NInt public static final long Failed = org.moe.natj.general.NatJ.is64Bit() ?
            0x7FFFFFFFFFFFFFFFL :
            0x000000007FFFFFFFL;
}
