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
    @Generated
    @Selector("clearBarrier")
    void clearBarrier();

    @Generated
    @Selector("concurrentDispatchThreadgroups:threadsPerThreadgroup:")
    void concurrentDispatchThreadgroupsThreadsPerThreadgroup(@ByValue MTLSize threadgroupsPerGrid,
            @ByValue MTLSize threadsPerThreadgroup);

    @Generated
    @Selector("concurrentDispatchThreads:threadsPerThreadgroup:")
    void concurrentDispatchThreadsThreadsPerThreadgroup(@ByValue MTLSize threadsPerGrid,
            @ByValue MTLSize threadsPerThreadgroup);

    @Generated
    @Selector("reset")
    void reset();

    @Generated
    @Selector("setBarrier")
    void setBarrier();

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("setComputePipelineState:")
    void setComputePipelineState(@NotNull @Mapped(ObjCObjectMapper.class) MTLComputePipelineState pipelineState);

    @Generated
    @Selector("setKernelBuffer:offset:atIndex:")
    void setKernelBufferOffsetAtIndex(@NotNull @Mapped(ObjCObjectMapper.class) MTLBuffer buffer, @NUInt long offset,
            @NUInt long index);

    @Generated
    @Selector("setStageInRegion:")
    void setStageInRegion(@ByValue MTLRegion region);

    @Generated
    @Selector("setThreadgroupMemoryLength:atIndex:")
    void setThreadgroupMemoryLengthAtIndex(@NUInt long length, @NUInt long index);

    /**
     * API-Since: 14.0
     */
    @Generated
    @Selector("setImageblockWidth:height:")
    void setImageblockWidthHeight(@NUInt long width, @NUInt long height);
}