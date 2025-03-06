package apple.browserenginekit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * API-Since: 17.4
 */
@Generated
public final class BESelectionFlags {
    @Generated
    private BESelectionFlags() {
    }

    /**
     * API-Since: 17.4
     */
    @Generated @NUInt public static final long SelectionFlagsNone = 0x0000000000000000L;
    /**
     * API-Since: 17.4
     */
    @Generated @NUInt public static final long WordIsNearTap = 0x0000000000000001L;
    /**
     * API-Since: 17.4
     */
    @Generated @NUInt public static final long SelectionFlipped = 0x0000000000000002L;
    /**
     * API-Since: 17.4
     */
    @Generated @NUInt public static final long PhraseBoundaryChanged = 0x0000000000000004L;
}