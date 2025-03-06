package apple.metal.protocol;

import apple.metal.struct.MTLRegion;
import apple.metal.struct.MTLSize;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;

/**
 * API-Since: 13.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLIndirectComputeCommand")
public interface MTLIndirectComputeCommand {
    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("clearBarrier")
    void clearBarrier();

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("concurrentDispatchThreadgroups:threadsPerThreadgroup:")
    void concurrentDispatchThreadgroupsThreadsPerThreadgroup(@ByValue MTLSize threadgroupsPerGrid,
            @ByValue MTLSize threadsPerThreadgroup);

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("concurrentDispatchThreads:threadsPerThreadgroup:")
    void concurrentDispatchThreadsThreadsPerThreadgroup(@ByValue MTLSize threadsPerGrid,
            @ByValue MTLSize threadsPerThreadgroup);

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("reset")
    void reset();

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("setBarrier")
    void setBarrier();

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("setComputePipelineState:")
    void setComputePipelineState(@NotNull @Mapped(ObjCObjectMapper.class) MTLComputePipelineState pipelineState);

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("setKernelBuffer:offset:atIndex:")
    void setKernelBufferOffsetAtIndex(@NotNull @Mapped(ObjCObjectMapper.class) MTLBuffer buffer, @NUInt long offset,
            @NUInt long index);

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("setStageInRegion:")
    void setStageInRegion(@ByValue MTLRegion region);

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("setThreadgroupMemoryLength:atIndex:")
    void setThreadgroupMemoryLengthAtIndex(@NUInt long length, @NUInt long index);

    /**
     * API-Since: 14.0
     */
    @Generated
    @Selector("setImageblockWidth:height:")
    void setImageblockWidthHeight(@NUInt long width, @NUInt long height);

    /**
     * sets kernel buffer at specified index with provided offset and stride.
     * only call this when the buffer-index is part of the stageInputDescriptor
     * and has set its stride to `MTLBufferLayoutStrideDynamic`
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("setKernelBuffer:offset:attributeStride:atIndex:")
    void setKernelBufferOffsetAttributeStrideAtIndex(@Mapped(ObjCObjectMapper.class) @NotNull MTLBuffer buffer,
            @NUInt long offset, @NUInt long stride, @NUInt long index);
}