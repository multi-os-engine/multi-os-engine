package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class UISwitchStyle {
    @Generated
    private UISwitchStyle() {
    }

    /**
     * The style most appropriate to the current UIUserInterfaceIdiom
     */
    @Generated @NInt public static final long Automatic = 0x0000000000000000L;
    /**
     * The AppKit-style checkbox — only supported for Catalyst in the Mac idiom
     */
    @Generated @NInt public static final long Checkbox = 0x0000000000000001L;
    /**
     * The on/off sliding style switch — classic iOS appearance.
     */
    @Generated @NInt public static final long Sliding = 0x0000000000000002L;
}