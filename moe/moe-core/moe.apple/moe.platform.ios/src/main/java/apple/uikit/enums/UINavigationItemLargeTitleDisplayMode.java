package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class UINavigationItemLargeTitleDisplayMode {
    @Generated
    private UINavigationItemLargeTitleDisplayMode() {
    }

    /**
     * Automatically use the large out-of-line title based on the state of the previous item in the navigation bar. An
     * item with largeTitleDisplayMode=Automatic will show or hide the large title based on the request of the previous
     * navigation item. If the first item pushed is set to Automatic, then it will show the large title if the
     * navigation bar has prefersLargeTitles=YES.
     */
    @Generated @NInt public static final long Automatic = 0x0000000000000000L;
    /**
     * Always use a larger title when this item is topmost.
     */
    @Generated @NInt public static final long Always = 0x0000000000000001L;
    /**
     * Never use a larger title when this item is topmost.
     */
    @Generated @NInt public static final long Never = 0x0000000000000002L;
}