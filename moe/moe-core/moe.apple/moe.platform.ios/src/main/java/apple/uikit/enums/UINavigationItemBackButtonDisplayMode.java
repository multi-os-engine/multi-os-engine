package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class UINavigationItemBackButtonDisplayMode {
    @Generated
    private UINavigationItemBackButtonDisplayMode() {
    }

    /**
     * Default mode, uses an appropriate title, followed by a generic title (typically 'Back'), then no title.
     */
    @Generated @NInt public static final long Default = 0x0000000000000000L;
    /**
     * Generic titles only. Ignores .title and .backButtonTitle (but *not* .backBarButtonItem.title).
     */
    @Generated @NInt public static final long Generic = 0x0000000000000001L;
    /**
     * Don't use a title, just the back button indicator image.
     */
    @Generated @NInt public static final long Minimal = 0x0000000000000002L;
}