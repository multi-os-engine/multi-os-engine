package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 16.0
 */
@Generated
public final class UIPageControlDirection {
    @Generated
    private UIPageControlDirection() {
    }

    /**
     * Page indicators are laid out in the natural direction of the system locale.
     * By default, this is equivalent to @c UIPageControlDirectionLeftToRight on LTR locales, and
     * [@c] UIPageControlDirectionRightToLeft on RTL locales.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Natural = 0x0000000000000000L;
    /**
     * Page indicators are laid out from left to right.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long LeftToRight = 0x0000000000000001L;
    /**
     * Page indicators are laid out from right to left.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long RightToLeft = 0x0000000000000002L;
    /**
     * Page indicators are laid out from top to bottom.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long TopToBottom = 0x0000000000000003L;
    /**
     * Page indicators are laid out from bottom to top.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long BottomToTop = 0x0000000000000004L;
}