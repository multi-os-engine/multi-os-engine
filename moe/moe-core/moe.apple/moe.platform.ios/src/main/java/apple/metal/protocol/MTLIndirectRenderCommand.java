package apple.metal.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Describes a CPU-recorded indirect render command
 * 
 * API-Since: 12.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLIndirectRenderCommand")
public interface MTLIndirectRenderCommand {
    @Generated
    @Selector("drawIndexedPatches:patchStart:patchCount:patchIndexBuffer:patchIndexBufferOffset:controlPointIndexBuffer:controlPointIndexBufferOffset:instanceCount:baseInstance:tessellationFactorBuffer:tessellationFactorBufferOffset:tessellationFactorBufferInstanceStride:")
    void drawIndexedPatchesPatchStartPatchCountPatchIndexBufferPatchIndexBufferOffsetControlPointIndexBufferControlPointIndexBufferOffsetInstanceCountBaseInstanceTessellationFactorBufferTessellationFactorBufferOffsetTessellationFactorBufferInstanceStride(
            @NUInt long numberOfPatchControlPoints, @NUInt long patchStart, @NUInt long patchCount,
            @Nullable @Mapped(ObjCObjectMapper.class) MTLBuffer patchIndexBuffer, @NUInt long patchIndexBufferOffset,
            @NotNull @Mapped(ObjCObjectMapper.class) MTLBuffer controlPointIndexBuffer,
            @NUInt long controlPointIndexBufferOffset, @NUInt long instanceCount, @NUInt long baseInstance,
            @NotNull @Mapped(ObjCObjectMapper.class) MTLBuffer buffer, @NUInt long offset, @NUInt long instanceStride);

    @Generated
    @Selector("drawIndexedPrimitives:indexCount:indexType:indexBuffer:indexBufferOffset:instanceCount:baseVertex:baseInstance:")
    void drawIndexedPrimitivesIndexCountIndexTypeIndexBufferIndexBufferOffsetInstanceCountBaseVertexBaseInstance(
            @NUInt long primitiveType, @NUInt long indexCount, @NUInt long indexType,
            @NotNull @Mapped(ObjCObjectMapper.class) MTLBuffer indexBuffer, @NUInt long indexBufferOffset,
            @NUInt long instanceCount, @NInt long baseVertex, @NUInt long baseInstance);

    @Generated
    @Selector("drawPatches:patchStart:patchCount:patchIndexBuffer:patchIndexBufferOffset:instanceCount:baseInstance:tessellationFactorBuffer:tessellationFactorBufferOffset:tessellationFactorBufferInstanceStride:")
    void drawPatchesPatchStartPatchCountPatchIndexBufferPatchIndexBufferOffsetInstanceCountBaseInstanceTessellationFactorBufferTessellationFactorBufferOffsetTessellationFactorBufferInstanceStride(
            @NUInt long numberOfPatchControlPoints, @NUInt long patchStart, @NUInt long patchCount,
            @Nullable @Mapped(ObjCObjectMapper.class) MTLBuffer patchIndexBuffer, @NUInt long patchIndexBufferOffset,
            @NUInt long instanceCount, @NUInt long baseInstance,
            @NotNull @Mapped(ObjCObjectMapper.class) MTLBuffer buffer, @NUInt long offset, @NUInt long instanceStride);

    @Generated
    @Selector("drawPrimitives:vertexStart:vertexCount:instanceCount:baseInstance:")
    void drawPrimitivesVertexStartVertexCountInstanceCountBaseInstance(@NUInt long primitiveType,
            @NUInt long vertexStart, @NUInt long vertexCount, @NUInt long instanceCount, @NUInt long baseInstance);

    @Generated
    @Selector("reset")
    void reset();

    @Generated
    @Selector("setFragmentBuffer:offset:atIndex:")
    void setFragmentBufferOffsetAtIndex(@NotNull @Mapped(ObjCObjectMapper.class) MTLBuffer buffer, @NUInt long offset,
            @NUInt long index);

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("setRenderPipelineState:")
    void setRenderPipelineState(@NotNull @Mapped(ObjCObjectMapper.class) MTLRenderPipelineState pipelineState);

    @Generated
    @Selector("setVertexBuffer:offset:atIndex:")
    void setVertexBufferOffsetAtIndex(@NotNull @Mapped(ObjCObjectMapper.class) MTLBuffer buffer, @NUInt long offset,
            @NUInt long index);
}