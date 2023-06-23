package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * The value of the "high contrast" Accessibility setting is available via `UIAccessibilityDarkerSystemColorsEnabled()`,
 * and is also expressed as the UIAccessibilityContrast trait.
 * 
 * API-Since: 13.0
 */
@Generated
public final class UIAccessibilityContrast {
    @Generated
    private UIAccessibilityContrast() {
    }

    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long Unspecified = 0xFFFFFFFFFFFFFFFFL;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long Normal = 0x0000000000000000L;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long High = 0x0000000000000001L;
}