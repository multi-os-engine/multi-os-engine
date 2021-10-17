package apple.mlcompute.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@enum]       MLCExecutionOptions
 * <p>
 * A bitmask that specifies the options you’ll use when executing a graph.
 */
@Generated
public final class MLCExecutionOptions {
    @Generated
    private MLCExecutionOptions() {
    }

    @Generated public static final long None = 0x0000000000000000L;
    /**
     * The option to skip writing input data to device memory.
     * <p>
     * this option to prevent writing the input tensors to device memory associated with these tensors when the framework
     * executes the graph.
     */
    @Generated public static final long SkipWritingInputDataToDevice = 0x0000000000000001L;
    /**
     * The option to execute the graph synchronously.
     * <p>
     * Include this option to wait until execution of the graph on specified device finishes before returning from the
     * \p execute method.
     */
    @Generated public static final long Synchronous = 0x0000000000000002L;
    /**
     * The option to return profiling information in the callback before returning from execution.
     * <p>
     * Include this option to return profliling information in the graph execute completion handler callback, including
     * device execution time.
     */
    @Generated public static final long Profiling = 0x0000000000000004L;
    /**
     * The option to execute the forward pass for inference only.
     * <p>
     * If you include this option and execute a training graph using one of the \p execute methods, such as
     * \p -executeWithInputsData:lossLabelsData:lossLabelWeightsData:batchSize:options:completionHandler: , the framework only
     * executes the forward pass of the training graph, and it executes that forward pass for inference only.
     * <p>
     * If you include this option and execute a training graph using one of the executeForward methods, such as
     * \p -executeForwardWithBatchSize:options:completionHandler:), the framework executes the forward pass for inference only.
     */
    @Generated public static final long ForwardForInference = 0x0000000000000008L;
    /**
     * The option to enable additional per layer profiling information currently emitted using signposts.
     * <p>
     * The option to enable per layer profiling information emitted as signposts. The per layer information
     * can be visualized using the Logging Instrument in Xcode's Instruments. This information may not be available for all MLCDevice.
     */
    @Generated public static final long PerLayerProfiling = 0x0000000000000010L;
}
