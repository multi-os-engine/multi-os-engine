package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class UIScrollViewContentInsetAdjustmentBehavior {
    @Generated
    private UIScrollViewContentInsetAdjustmentBehavior() {
    }

    /**
     * Similar to .scrollableAxes, but for backward compatibility will also adjust the top & bottom contentInset when
     * the scroll view is owned by a view controller with automaticallyAdjustsScrollViewInsets = YES inside a navigation
     * controller, regardless of whether the scroll view is scrollable
     */
    @Generated @NInt public static final long Automatic = 0x0000000000000000L;
    /**
     * Edges for scrollable axes are adjusted (i.e., contentSize.width/height > frame.size.width/height or
     * alwaysBounceHorizontal/Vertical = YES)
     */
    @Generated @NInt public static final long ScrollableAxes = 0x0000000000000001L;
    /**
     * contentInset is not adjusted
     */
    @Generated @NInt public static final long Never = 0x0000000000000002L;
    /**
     * contentInset is always adjusted by the scroll view's safeAreaInsets
     */
    @Generated @NInt public static final long Always = 0x0000000000000003L;
}