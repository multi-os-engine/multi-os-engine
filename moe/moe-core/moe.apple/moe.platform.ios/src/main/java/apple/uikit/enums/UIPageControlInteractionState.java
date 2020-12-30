package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class UIPageControlInteractionState {
    @Generated
    private UIPageControlInteractionState() {
    }

    /**
     * The default interaction state, where no interaction has occured.
     */
    @Generated @NInt public static final long None = 0x0000000000000000L;
    /**
     * The interaction state for which the page was changed via a single, discrete interaction.
     */
    @Generated @NInt public static final long Discrete = 0x0000000000000001L;
    /**
     * The interaction state for which the page was changed via a continuous interaction.
     */
    @Generated @NInt public static final long Continuous = 0x0000000000000002L;
}