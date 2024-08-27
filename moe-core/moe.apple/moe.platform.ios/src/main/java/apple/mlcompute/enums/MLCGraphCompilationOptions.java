package apple.mlcompute.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@enum] MLCGraphCompilationOptions
 * 
 * A bitmask that specifies the options you use when compiling a graph.
 * 
 * This is passed as an argument to the compileWithOptions method avalable on MLCTrainingGraph and MLCInferenceGraph
 */
@Generated
public final class MLCGraphCompilationOptions {
    @Generated
    private MLCGraphCompilationOptions() {
    }

    /**
     * No graph compilation options.
     */
    @Generated public static final long None = 0x0000000000000000L;
    /**
     * The option to debug layers during graph compilation.
     * 
     * Include this option to disable various optimizations such as layer fusion, and ensure the framework synchronizes
     * the resulting forward and gradients tensors host memory with device memory, for layers marked as debuggable.
     */
    @Generated public static final long DebugLayers = 0x0000000000000001L;
    /**
     * The option to disable layer fusion during graph compilation.
     * 
     * Include this option to disable fusion of layers, which is an important optimization that helps performance and
     * memory footprint.
     */
    @Generated public static final long DisableLayerFusion = 0x0000000000000002L;
    /**
     * The option to link graphs during graph compilation.
     * 
     * Include this option when you link together one or more sub-graphs when executing the forward, gradient, and
     * optimizer update. For example, if the full computation graph includes a layer that the framework doesn’t support,
     * you’ll
     * need to create multiple sub-graphs and link them together using \p MLCGraphCompilationOptionsLinkGraphs. When
     * doing so,
     * include this option when you call \p -compileWithOptions: for graphs you want to link together.
     */
    @Generated public static final long LinkGraphs = 0x0000000000000004L;
    /**
     * The option to compute all gradients during graph compilation.
     * 
     * Include this option to compute gradients for layers with or without parameters that only take input tensors.
     * For example, if the first layer of a graph is a convolution layer, the framework only computes the gradients for
     * weights
     * and biases associated with the convolution layer, but not the gradients for the input. Include this option if you
     * want to
     * compute all gradients for the input.
     */
    @Generated public static final long ComputeAllGradients = 0x0000000000000008L;
}
