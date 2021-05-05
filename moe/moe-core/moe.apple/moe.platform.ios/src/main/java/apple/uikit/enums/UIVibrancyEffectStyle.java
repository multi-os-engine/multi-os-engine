package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Additional vibrancy styles available in iOS 13, intended for use with the "system material" UIBlurEffect styles.
 * 
 * These vibrancy styles, combined with those blur effect styles, cause only the alpha component of the content
 * to be used. Color information is ignored. (UIVibrancyEffectStyleLabel is an exception; it passes color through.)
 */
@Generated
public final class UIVibrancyEffectStyle {
    @Generated
    private UIVibrancyEffectStyle() {
    }

    /**
     * Vibrancy for text labels.
     */
    @Generated @NInt public static final long Label = 0x0000000000000000L;
    /**
     * Vibrancy for text labels.
     */
    @Generated @NInt public static final long SecondaryLabel = 0x0000000000000001L;
    /**
     * Vibrancy for text labels.
     */
    @Generated @NInt public static final long TertiaryLabel = 0x0000000000000002L;
    /**
     * Vibrancy for text labels.
     */
    @Generated @NInt public static final long QuaternaryLabel = 0x0000000000000003L;
    /**
     * Vibrancy for thicker filled areas.
     */
    @Generated @NInt public static final long Fill = 0x0000000000000004L;
    /**
     * Vibrancy for thicker filled areas.
     */
    @Generated @NInt public static final long SecondaryFill = 0x0000000000000005L;
    /**
     * Vibrancy for thicker filled areas.
     */
    @Generated @NInt public static final long TertiaryFill = 0x0000000000000006L;
    /**
     * Vibrancy for separator lines.
     */
    @Generated @NInt public static final long Separator = 0x0000000000000007L;
}