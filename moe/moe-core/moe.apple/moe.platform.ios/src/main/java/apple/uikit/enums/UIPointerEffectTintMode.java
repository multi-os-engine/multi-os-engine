package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 13.4
 */
@Generated
public final class UIPointerEffectTintMode {
    @Generated
    private UIPointerEffectTintMode() {
    }

    /**
     * Indicates that no tint should be applied to the view.
     * 
     * API-Since: 13.4
     */
    @Generated @NInt public static final long None = 0x0000000000000000L;
    /**
     * Indicates that a tint overlay should be placed above the view.
     * 
     * API-Since: 13.4
     */
    @Generated @NInt public static final long Overlay = 0x0000000000000001L;
    /**
     * Indicates that a tint underlay should be placed below the view.
     * 
     * API-Since: 13.4
     */
    @Generated @NInt public static final long Underlay = 0x0000000000000002L;
}