package apple.metal.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Enumeration for controlling alpha-to-one state of a pipeline state object.
 * 
 * API-Since: 26.0
 */
@Generated
public final class MTL4AlphaToOneState {
    @Generated
    private MTL4AlphaToOneState() {
    }

    /**
     * Disables alpha-to-one.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Disabled = 0x0000000000000000L;
    /**
     * Enables alpha-to-one.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Enabled = 0x0000000000000001L;
}