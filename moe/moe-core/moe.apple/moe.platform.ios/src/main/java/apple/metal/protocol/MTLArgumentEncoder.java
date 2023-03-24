package apple.metal.protocol;

import apple.foundation.struct.NSRange;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.ConstNUIntPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCObject;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * [@protocol] MTLArgumentEncoder
 * 
 * MTLArgumentEncoder encodes buffer, texture, sampler, and constant data into a buffer.
 * 
 * API-Since: 11.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLArgumentEncoder")
public interface MTLArgumentEncoder {
    /**
     * [@property] alignment
     * 
     * The alignment in bytes required to store the encoded resource bindings.
     */
    @Generated
    @Selector("alignment")
    @NUInt
    long alignment();

    /**
     * constantDataAtIndex:
     * 
     * Returns a pointer to the constant data at the given bind point index.
     */
    @NotNull
    @Generated
    @Selector("constantDataAtIndex:")
    VoidPtr constantDataAtIndex(@NUInt long index);

    /**
     * [@property] device
     * 
     * The device this argument encoder was created against.
     */
    @NotNull
    @Generated
    @Selector("device")
    @MappedReturn(ObjCObjectMapper.class)
    MTLDevice device();

    /**
     * [@property] encodedLength
     * 
     * The number of bytes required to store the encoded resource bindings.
     */
    @Generated
    @Selector("encodedLength")
    @NUInt
    long encodedLength();

    /**
     * [@property] label
     * 
     * A string to help identify this object.
     */
    @Nullable
    @Generated
    @Selector("label")
    String label();

    /**
     * setArgumentBuffer:offset:
     * 
     * Sets the destination buffer and offset at which the arguments will be encoded.
     */
    @Generated
    @Selector("setArgumentBuffer:offset:")
    void setArgumentBufferOffset(@Nullable @Mapped(ObjCObjectMapper.class) MTLBuffer argumentBuffer,
            @NUInt long offset);

    /**
     * * @method setArgumentBuffer:offset:arrayElement:
     * * @brief Sets the destination buffer, starting offset and specific array element arguments will be encoded into.
     * arrayElement represents
     * the desired element of IAB array targetted by encoding
     */
    @Generated
    @Selector("setArgumentBuffer:startOffset:arrayElement:")
    void setArgumentBufferStartOffsetArrayElement(@Nullable @Mapped(ObjCObjectMapper.class) MTLBuffer argumentBuffer,
            @NUInt long startOffset, @NUInt long arrayElement);

    /**
     * setBuffer:offset:atIndex:
     * 
     * Set a buffer at the given bind point index.
     */
    @Generated
    @Selector("setBuffer:offset:atIndex:")
    void setBufferOffsetAtIndex(@Nullable @Mapped(ObjCObjectMapper.class) MTLBuffer buffer, @NUInt long offset,
            @NUInt long index);

    /**
     * setBuffers:offsets:withRange:
     * 
     * Set an array of buffers at the given bind point index range.
     */
    @Generated
    @Selector("setBuffers:offsets:withRange:")
    void setBuffersOffsetsWithRange(@NotNull @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> buffers,
            @NotNull ConstNUIntPtr offsets, @ByValue NSRange range);

    /**
     * [@property] label
     * 
     * A string to help identify this object.
     */
    @Generated
    @Selector("setLabel:")
    void setLabel(@Nullable String value);

    /**
     * setSamplerState:atIndex:
     * 
     * Set a sampler at the given bind point index.
     */
    @Generated
    @Selector("setSamplerState:atIndex:")
    void setSamplerStateAtIndex(@Nullable @Mapped(ObjCObjectMapper.class) MTLSamplerState sampler, @NUInt long index);

    /**
     * setSamplerStates:withRange:
     * 
     * Set an array of samplers at the given bind point index range.
     */
    @Generated
    @Selector("setSamplerStates:withRange:")
    void setSamplerStatesWithRange(@NotNull @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> samplers,
            @ByValue NSRange range);

    /**
     * setTexture:atIndex:
     * 
     * Set a texture at the given bind point index.
     */
    @Generated
    @Selector("setTexture:atIndex:")
    void setTextureAtIndex(@Nullable @Mapped(ObjCObjectMapper.class) MTLTexture texture, @NUInt long index);

    /**
     * setTextures:withRange:
     * 
     * Set an array of textures at the given bind point index range.
     */
    @Generated
    @Selector("setTextures:withRange:")
    void setTexturesWithRange(@NotNull @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> textures,
            @ByValue NSRange range);

    /**
     * newArgumentEncoderForBufferAtIndex:
     * 
     * Returns a pointer to a new MTLArgumentEncoder that can be used to encode the an argument buffer
     * in the buffer associated with a given index.
     * Returns nil if the resource at the given index is not an argument buffer.
     * 
     * API-Since: 11.0
     */
    @Nullable
    @Generated
    @Selector("newArgumentEncoderForBufferAtIndex:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLArgumentEncoder newArgumentEncoderForBufferAtIndex(@NUInt long index);

    /**
     * setComputePipelineState:atIndex
     * 
     * Sets a compute pipeline state at a given bind point index
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setComputePipelineState:atIndex:")
    void setComputePipelineStateAtIndex(@Nullable @Mapped(ObjCObjectMapper.class) MTLComputePipelineState pipeline,
            @NUInt long index);

    /**
     * setComputePipelineStates:withRange
     * 
     * Set an array of compute pipeline states at a given bind point index range
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setComputePipelineStates:withRange:")
    void setComputePipelineStatesWithRange(@NotNull @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> pipelines,
            @ByValue NSRange range);

    /**
     * setIndirectCommandBuffer:atIndex
     * 
     * Sets an indirect command buffer at a given bind point index
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("setIndirectCommandBuffer:atIndex:")
    void setIndirectCommandBufferAtIndex(
            @Nullable @Mapped(ObjCObjectMapper.class) MTLIndirectCommandBuffer indirectCommandBuffer,
            @NUInt long index);

    /**
     * setIndirectCommandBuffers:withRange:
     * 
     * Set an array of indirect command buffers at the given bind point index range.
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("setIndirectCommandBuffers:withRange:")
    void setIndirectCommandBuffersWithRange(@NotNull @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> buffers,
            @ByValue NSRange range);

    /**
     * setRenderPipelineState:atIndex
     * 
     * Sets a render pipeline state at a given bind point index
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setRenderPipelineState:atIndex:")
    void setRenderPipelineStateAtIndex(@Nullable @Mapped(ObjCObjectMapper.class) MTLRenderPipelineState pipeline,
            @NUInt long index);

    /**
     * setRenderPipelineStates:withRange
     * 
     * Set an array of render pipeline states at a given bind point index range
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setRenderPipelineStates:withRange:")
    void setRenderPipelineStatesWithRange(@NotNull @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> pipelines,
            @ByValue NSRange range);

    /**
     * API-Since: 14.0
     */
    @Generated
    @Selector("setAccelerationStructure:atIndex:")
    void setAccelerationStructureAtIndex(
            @Nullable @Mapped(ObjCObjectMapper.class) MTLAccelerationStructure accelerationStructure,
            @NUInt long index);

    /**
     * setIntersectionFunctionTable:atIndex:
     * 
     * Set an intersection function table at the given buffer index
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setIntersectionFunctionTable:atIndex:")
    void setIntersectionFunctionTableAtIndex(
            @Nullable @Mapped(ObjCObjectMapper.class) MTLIntersectionFunctionTable intersectionFunctionTable,
            @NUInt long index);

    /**
     * setIntersectionFunctionTables:withRange:
     * 
     * Set intersection function tables at the given buffer index range
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setIntersectionFunctionTables:withRange:")
    void setIntersectionFunctionTablesWithRange(
            @NotNull @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> intersectionFunctionTables,
            @ByValue NSRange range);

    /**
     * setVisibleFunctionTable:atIndex:
     * 
     * Set a visible function table at the given buffer index
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setVisibleFunctionTable:atIndex:")
    void setVisibleFunctionTableAtIndex(
            @Nullable @Mapped(ObjCObjectMapper.class) MTLVisibleFunctionTable visibleFunctionTable, @NUInt long index);

    /**
     * setVisibleFunctionTables:withRange:
     * 
     * Set visible function tables at the given buffer index range
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setVisibleFunctionTables:withRange:")
    void setVisibleFunctionTablesWithRange(
            @NotNull @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> visibleFunctionTables,
            @ByValue NSRange range);
}
