package apple.metal.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * [@enum] MTLMultisampleStencilResolveFilter
 * 
 * Controls the MSAA stencil resolve operation.
 */
@Generated
public final class MTLMultisampleStencilResolveFilter {
    @Generated
    private MTLMultisampleStencilResolveFilter() {
    }

    /**
     * [@constant] MTLMultisampleStencilResolveFilterSample0
     * 
     * The stencil sample corresponding to sample 0. This is the default behavior.
     */
    @Generated @NUInt public static final long Sample0 = 0x0000000000000000L;
    /**
     * [@constant] MTLMultisampleStencilResolveFilterDepthResolvedSample
     * 
     * The stencil sample corresponding to whichever depth sample is selected by the depth resolve filter. If depth resolve is not enabled, the stencil sample is chosen based on what a depth resolve filter would have selected.
     */
    @Generated @NUInt public static final long DepthResolvedSample = 0x0000000000000001L;
}