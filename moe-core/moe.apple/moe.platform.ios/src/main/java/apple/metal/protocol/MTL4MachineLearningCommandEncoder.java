package apple.metal.protocol;

import org.jetbrains.annotations.NotNull;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * Encodes commands for dispatching machine learning networks on Apple silicon.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTL4MachineLearningCommandEncoder")
public interface MTL4MachineLearningCommandEncoder extends MTL4CommandEncoder {
    /**
     * Dispatches a machine learning network using the current pipeline state and argument table.
     * 
     * This method takes a parameter consisting of a `MTLHeap` that Metal can use to allocate intermediate tensors.
     * You can query the minimum size Metal requires for this heap by calling
     * ``MTL4MachineLearningPipelineState/intermediatesHeapSize``.
     * 
     * - Parameters:
     * - heap: a heap that Metal can use to allocate intermediate tensors.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("dispatchNetworkWithIntermediatesHeap:")
    void dispatchNetworkWithIntermediatesHeap(@Mapped(ObjCObjectMapper.class) @NotNull MTLHeap heap);

    /**
     * Sets an argument table for the command encoder's machine learning shader stage.
     * 
     * The argument table provides inputs to all subsequent Machine Learning dispatches.
     * - Parameters:
     * - argumentTable: An argument table to set on the command encoder's Machine Learning stage.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setArgumentTable:")
    void setArgumentTable(@Mapped(ObjCObjectMapper.class) @NotNull MTL4ArgumentTable argumentTable);

    /**
     * Configures the encoder with a machine learning pipeline state instance.
     * 
     * The pipeline state instance affects all subsequent Machine Learning commands.
     * 
     * - Parameters:
     * - pipelineState: A Machine Learning pipeline state instance.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setPipelineState:")
    void setPipelineState(@Mapped(ObjCObjectMapper.class) @NotNull MTL4MachineLearningPipelineState pipelineState);
}