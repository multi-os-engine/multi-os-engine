package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 14.0
 */
@Generated
public final class UICellConfigurationDropState {
    @Generated
    private UICellConfigurationDropState() {
    }

    /**
     * The cell is not associated with a drag session.
     * 
     * API-Since: 14.0
     */
    @Generated @NInt public static final long None = 0x0000000000000000L;
    /**
     * A drag session is active and may perform a drop in the cell's container, but the cell itself
     * is not the drop target.
     * 
     * API-Since: 14.0
     */
    @Generated @NInt public static final long NotTargeted = 0x0000000000000001L;
    /**
     * The cell is the drop target for a drag session.
     * 
     * API-Since: 14.0
     */
    @Generated @NInt public static final long Targeted = 0x0000000000000002L;
}