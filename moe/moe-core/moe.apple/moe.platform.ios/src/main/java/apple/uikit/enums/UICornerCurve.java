package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * The corner curve to apply to a view.
 */
@Generated
public final class UICornerCurve {
    @Generated
    private UICornerCurve() {
    }

    /**
     * Select the corner style automatically.
     */
    @Generated @NInt public static final long Automatic = 0x0000000000000000L;
    /**
     * Always use a circular corner style.
     */
    @Generated @NInt public static final long Circular = 0x0000000000000001L;
    /**
     * Always use a continuous corner style.
     */
    @Generated @NInt public static final long Continuous = 0x0000000000000002L;
}