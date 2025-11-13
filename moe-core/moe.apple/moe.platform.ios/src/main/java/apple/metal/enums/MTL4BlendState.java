package apple.metal.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Enumeration for controlling the blend state of a pipeline state object.
 * 
 * API-Since: 26.0
 */
@Generated
public final class MTL4BlendState {
    @Generated
    private MTL4BlendState() {
    }

    /**
     * Disables blending.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Disabled = 0x0000000000000000L;
    /**
     * Enables blending.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Enabled = 0x0000000000000001L;
    /**
     * Defers determining the blending stage.
     * 
     * Behaves as ``MTL4BlendStateDisabled`` until you specialize this pipeline value.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Unspecialized = 0x0000000000000002L;
}