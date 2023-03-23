package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 16.0
 */
@Generated
public final class UIButtonConfigurationIndicator {
    @Generated
    private UIButtonConfigurationIndicator() {
    }

    /**
     * Automatically determine an indicator based on the button's properties.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Automatic = 0x0000000000000000L;
    /**
     * Don't show any indicator
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long None = 0x0000000000000001L;
    /**
     * Show an indicator appropriate for a popup-style button
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Popup = 0x0000000000000002L;
}