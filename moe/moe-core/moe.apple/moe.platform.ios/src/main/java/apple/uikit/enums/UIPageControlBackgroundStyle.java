package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class UIPageControlBackgroundStyle {
    @Generated
    private UIPageControlBackgroundStyle() {
    }

    /**
     * The default background style that adapts based on the current interaction state.
     */
    @Generated @NInt public static final long Automatic = 0x0000000000000000L;
    /**
     * The background style that shows a full background regardless of the interaction
     */
    @Generated @NInt public static final long Prominent = 0x0000000000000001L;
    /**
     * The background style that shows a minimal background regardless of the interaction
     */
    @Generated @NInt public static final long Minimal = 0x0000000000000002L;
}