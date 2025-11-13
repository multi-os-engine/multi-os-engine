package apple.metal.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * Custom render pass options you specify at encoder creation time.
 * 
 * Use these options to implement parallel encoding of render passes across multiple CPU threads by providing these
 * values to the `options` parameter of ``MTL4CommandBuffer/renderCommandEncoderWithDescriptor:options:`` and
 * observing these requirements:
 * 
 * 1. Commit all command encoders together in an array you provide to ``MTL4CommandQueue/commit:count:`` or
 * ``MTL4CommandQueue/commit:count:options:``
 * 2. The first command buffer in the array contains a render pass that you start with option
 * ``MTL4RenderEncoderOptionSuspending``
 * 3. The last command buffer in the array contains the same render pass that you start with option
 * ``MTL4RenderEncoderOptionResuming``
 * 4. All intermediate command buffers between the first and last in the array contain the same render pass that you
 * start with both ``MTL4RenderEncoderOptionResuming`` and ``MTL4RenderEncoderOptionSuspending`` options.
 * 5. The sequence of render passes, in submission order, doesn't intermix with compute, blit, acceleration structure
 * or machine learning encoding.
 * 6. A command buffer shouldn't contain a render pass that you start with option ``MTL4RenderEncoderOptionSuspending``
 * if
 * it already contains a render pass that you start with option ``MTL4RenderEncoderOptionResuming``.
 * 
 * API-Since: 26.0
 */
@Generated
public final class MTL4RenderEncoderOptions {
    @Generated
    private MTL4RenderEncoderOptions() {
    }

    /**
     * Declares that this render pass doesn't suspend nor resume.
     * 
     * API-Since: 26.0
     */
    @Generated @NUInt public static final long None = 0x0000000000000000L;
    /**
     * Configures the render pass as *suspending*.
     * 
     * Pass this option to ``MTL4CommandBuffer/renderCommandEncoderWithDescriptor:options:`` to specify that Metal can
     * stitch the work a render command encoder encodes with a subsequent "resuming" render command encoder.
     * 
     * API-Since: 26.0
     */
    @Generated @NUInt public static final long Suspending = 0x0000000000000001L;
    /**
     * Configures the render pass to as *resuming*.
     * 
     * Pass this option to ``MTL4CommandBuffer/renderCommandEncoderWithDescriptor:options:`` to specify that Metal can
     * stitch the work a render command encoder encodes with a prior "suspending" render command encoder.
     * 
     * API-Since: 26.0
     */
    @Generated @NUInt public static final long Resuming = 0x0000000000000002L;
}