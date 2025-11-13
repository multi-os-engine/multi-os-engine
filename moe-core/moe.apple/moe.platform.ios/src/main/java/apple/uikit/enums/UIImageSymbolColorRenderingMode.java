package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * -- symbol image color rendering modes
 * 
 * API-Since: 26.0
 */
@Generated
public final class UIImageSymbolColorRenderingMode {
    @Generated
    private UIImageSymbolColorRenderingMode() {
    }

    /**
     * Automatically uses an appropriate color rendering mode for the symbol’s color layers.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Automatic = 0x0000000000000000L;
    /**
     * Renders the symbol’s color layers using flat colors.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Flat = 0x0000000000000001L;
    /**
     * Renders the symbol’s color layers using gradients.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Gradient = 0x0000000000000002L;
}