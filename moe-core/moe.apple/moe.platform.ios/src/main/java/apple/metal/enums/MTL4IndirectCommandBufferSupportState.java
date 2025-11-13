package apple.metal.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Enumeration for controlling support for ``MTLIndirectCommandBuffer``.
 * 
 * API-Since: 26.0
 */
@Generated
public final class MTL4IndirectCommandBufferSupportState {
    @Generated
    private MTL4IndirectCommandBufferSupportState() {
    }

    /**
     * Disables support for indirect command buffers.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Disabled = 0x0000000000000000L;
    /**
     * Enables support for indirect command buffers.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Enabled = 0x0000000000000001L;
}