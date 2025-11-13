package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * -- symbol image variable value modes
 * 
 * API-Since: 26.0
 */
@Generated
public final class UIImageSymbolVariableValueMode {
    @Generated
    private UIImageSymbolVariableValueMode() {
    }

    /**
     * Automatically selects an appropriate variable value mode for the symbol.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Automatic = 0x0000000000000000L;
    /**
     * The "color" variable value mode. Sets the opacity of each variable layer to
     * either on or off depending on how its threshold compared to the current value.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Color = 0x0000000000000001L;
    /**
     * The "draw" variable value mode. Changes the drawn length of each variable layer
     * to either based on how its range relates to the current value.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Draw = 0x0000000000000002L;
}