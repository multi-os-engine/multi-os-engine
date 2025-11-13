package apple.metal.protocol;

import apple.metal.MTL4MachineLearningPipelineReflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * A pipeline state that you can use with machine-learning encoder instances.
 * 
 * See ``MTL4MachineLearningCommandEncoder`` for more information.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTL4MachineLearningPipelineState")
public interface MTL4MachineLearningPipelineState extends MTLAllocation {
    /**
     * Returns the device the pipeline state belongs to.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("device")
    @MappedReturn(ObjCObjectMapper.class)
    @NotNull
    MTLDevice device();

    /**
     * Obtain the size of the heap, in bytes, this pipeline requires during the execution.
     * 
     * Use this value to allocate a ``MTLHeap`` instance of sufficient size that you can then provide to
     * ``MTL4MachineLearningCommandEncoder/dispatchNetworkWithIntermediatesHeap:``.
     * 
     * Metal uses this heap to store intermediate data as it executes the pipeline. It is your responsibility to provide
     * a heap at least as large as this property requests.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("intermediatesHeapSize")
    @NUInt
    long intermediatesHeapSize();

    /**
     * Queries the string that helps identify this object.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("label")
    @Nullable
    String label();

    /**
     * Returns reflection information for this machine learning pipeline state.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("reflection")
    @Nullable
    MTL4MachineLearningPipelineReflection reflection();
}