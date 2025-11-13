package apple.metal.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * This enumeration controls if Metal accumulates visibility results between render encoders or resets them.
 * 
 * You can specify this property for ``MTLRenderCommandEncoders`` and for ``MTL4RenderCommandEncoders`` through
 * their descriptors' ``MTLRenderCommandEncoder/visibilityResultType`` and
 * ``MTL4RenderCommandEncoder/visibilityResultType``
 * methods.
 * 
 * API-Since: 26.0
 */
@Generated
public final class MTLVisibilityResultType {
    @Generated
    private MTLVisibilityResultType() {
    }

    /**
     * Reset visibility result data when you create a render command encoder.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Reset = 0x0000000000000000L;
    /**
     * Accumulate visibility results data across multiple render passes.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Accumulate = 0x0000000000000001L;
}