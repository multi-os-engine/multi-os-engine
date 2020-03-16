package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class UIGuidedAccessErrorCode {
    @Generated
    private UIGuidedAccessErrorCode() {
    }

    @Generated @NInt public static final long PermissionDenied = 0x0000000000000000L;
    @Generated @NInt public static final long Failed = org.moe.natj.general.NatJ.is64Bit() ?
            0x7FFFFFFFFFFFFFFFL :
            0x000000007FFFFFFFL;
}