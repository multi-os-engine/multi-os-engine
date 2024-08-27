package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 14.0
 */
@Generated
public final class UIPageControlInteractionState {
    @Generated
    private UIPageControlInteractionState() {
    }

    /**
     * The default interaction state, where no interaction has occurred.
     * 
     * API-Since: 14.0
     */
    @Generated @NInt public static final long None = 0x0000000000000000L;
    /**
     * The interaction state for which the page was changed via a single, discrete interaction.
     * 
     * API-Since: 14.0
     */
    @Generated @NInt public static final long Discrete = 0x0000000000000001L;
    /**
     * The interaction state for which the page was changed via a continuous interaction.
     * 
     * API-Since: 14.0
     */
    @Generated @NInt public static final long Continuous = 0x0000000000000002L;
}