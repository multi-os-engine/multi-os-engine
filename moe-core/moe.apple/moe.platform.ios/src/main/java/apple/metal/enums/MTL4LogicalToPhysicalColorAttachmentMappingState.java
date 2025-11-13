package apple.metal.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Enumerates possible behaviors of how a pipeline maps its logical outputs to its color attachments.
 */
@Generated
public final class MTL4LogicalToPhysicalColorAttachmentMappingState {
    @Generated
    private MTL4LogicalToPhysicalColorAttachmentMappingState() {
    }

    /**
     * Treats the logical color attachment descriptor array for render and tile render pipelines to match the physical
     * one.
     * 
     * This is the default behavior, which produces an identity mapping.
     */
    @Generated @NInt public static final long Identity = 0x0000000000000000L;
    /**
     * Deduces the color attachment mapping by inheriting it from the color attachment map of the current encoder.
     * 
     * Use this setting to indicate Metal should inherit the mapping from the ``colorAttachmentMap`` property of the
     * current
     * ``MTL4RenderCommandEncoder`` or ``MTLRenderCommandEncoder`` in use at draw time.
     */
    @Generated @NInt public static final long Inherited = 0x0000000000000001L;
}