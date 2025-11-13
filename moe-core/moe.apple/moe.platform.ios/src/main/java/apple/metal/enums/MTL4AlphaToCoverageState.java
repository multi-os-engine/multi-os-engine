package apple.metal.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Enumeration for controlling alpha-to-coverage state of a pipeline state object.
 * 
 * API-Since: 26.0
 */
@Generated
public final class MTL4AlphaToCoverageState {
    @Generated
    private MTL4AlphaToCoverageState() {
    }

    /**
     * Disables alpha-to-coverage.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Disabled = 0x0000000000000000L;
    /**
     * Enables alpha-to-coverage.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Enabled = 0x0000000000000001L;
}