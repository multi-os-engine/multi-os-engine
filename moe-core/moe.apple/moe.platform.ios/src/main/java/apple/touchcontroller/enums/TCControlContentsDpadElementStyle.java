package apple.touchcontroller.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Defines the visual style of the individual up/down/left/right elements of a direction pad.
 * 
 * API-Since: 26.0
 */
@Generated
public final class TCControlContentsDpadElementStyle {
    @Generated
    private TCControlContentsDpadElementStyle() {
    }

    /**
     * A circular direction pad style.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Circle = 0x0000000000000000L;
    /**
     * A pentagon direction pad style.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Pentagon = 0x0000000000000001L;
}