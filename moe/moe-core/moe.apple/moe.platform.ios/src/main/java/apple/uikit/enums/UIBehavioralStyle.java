package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * Behavioral Styles are values that determine how a class — such as a view or control — behaves. This includes how the control is drawn, and what behaviors it supports. For example, handling certain customizations in one style, but not another.
 */
@Generated
public final class UIBehavioralStyle {
    @Generated
    private UIBehavioralStyle() {
    }

    /**
     * The system will choose the most appropriate style for the targetted platform.
     */
    @Generated @NUInt public static final long Automatic = 0x0000000000000000L;
    /**
     * A style and set of behaviors best for iOS/iPadOS applications
     */
    @Generated @NUInt public static final long Pad = 0x0000000000000001L;
    /**
     * A style and set of behaviors best for macOS applications
     */
    @Generated @NUInt public static final long Mac = 0x0000000000000002L;
}
