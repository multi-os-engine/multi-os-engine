package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class UIButtonConfigurationTitleAlignment {
    @Generated
    private UIButtonConfigurationTitleAlignment() {
    }

    /**
     * Align title & subtitle automatically
     */
    @Generated @NInt public static final long Automatic = 0x0000000000000000L;
    /**
     * Align title & subtitle along their leading edges
     */
    @Generated @NInt public static final long Leading = 0x0000000000000001L;
    /**
     * Align title & subtitle to be centered with respect to each other
     */
    @Generated @NInt public static final long Center = 0x0000000000000002L;
    /**
     * Align title & subtitle along their trailing edges
     */
    @Generated @NInt public static final long Trailing = 0x0000000000000003L;
}
