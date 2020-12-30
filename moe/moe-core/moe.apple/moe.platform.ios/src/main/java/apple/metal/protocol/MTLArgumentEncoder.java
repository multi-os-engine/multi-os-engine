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

/**
 * @protocol MTLArgumentEncoder
 * @discussion MTLArgumentEncoder encodes buffer, texture, sampler, and constant data into a buffer.
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLArgumentEncoder")
public interface MTLArgumentEncoder {
    /**
     * @property alignment
     * @abstract The alignment in bytes required to store the encoded resource bindings.
     */
    @Generated
    @Selector("alignment")
    @NUInt
    long alignment();

    /**
     * @method constantDataAtIndex:
     * @brief Returns a pointer to the constant data at the given bind point index.
     */
    @Generated
    @Selector("constantDataAtIndex:")
    VoidPtr constantDataAtIndex(@NUInt long index);

    /**
     * @property device
     * @abstract The device this argument encoder was created against.
     */
    @Generated
    @Selector("device")
    @MappedReturn(ObjCObjectMapper.class)
    MTLDevice device();

    /**
     * @property encodedLength
     * @abstract The number of bytes required to store the encoded resource bindings.
     */
    @Generated
    @Selector("encodedLength")
    @NUInt
    long encodedLength();

    /**
     * @property label
     * @abstract A string to help identify this object.
     */
    @Generated
    @Selector("label")
    String label();

    /**
     * @method setArgumentBuffer:offset:
     * @brief Sets the destination buffer and offset at which the arguments will be encoded.
     */
    @Generated
    @Selector("setArgumentBuffer:offset:")
    void setArgumentBufferOffset(@Mapped(ObjCObjectMapper.class) MTLBuffer argumentBuffer, @NUInt long offset);

    /**
     * * @method setArgumentBuffer:offset:arrayElement:
     * * @brief Sets the destination buffer, starting offset and specific array element arguments will be encoded into. arrayElement represents
     *          the desired element of IAB array targetted by encoding
     */
    @Generated
    @Selector("setArgumentBuffer:startOffset:arrayElement:")
    void setArgumentBufferStartOffsetArrayElement(@Mapped(ObjCObjectMapper.class) MTLBuffer argumentBuffer,
            @NUInt long startOffset, @NUInt long arrayElement);

    /**
     * @method setBuffer:offset:atIndex:
     * @brief Set a buffer at the given bind point index.
     */
    @Generated
    @Selector("setBuffer:offset:atIndex:")
    void setBufferOffsetAtIndex(@Mapped(ObjCObjectMapper.class) MTLBuffer buffer, @NUInt long offset,
            @NUInt long index);

    /**
     * @method setBuffers:offsets:withRange:
     * @brief Set an array of buffers at the given bind point index range.
     */
    @Generated
    @Selector("setBuffers:offsets:withRange:")
    void setBuffersOffsetsWithRange(@ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> buffers,
            ConstNUIntPtr offsets, @ByValue NSRange range);

    /**
     * @property label
     * @abstract A string to help identify this object.
     */
    @Generated
    @Selector("setLabel:")
    void setLabel(String value);

    /**
     * @method setSamplerState:atIndex:
     * @brief Set a sampler at the given bind point index.
     */
    @Generated
    @Selector("setSamplerState:atIndex:")
    void setSamplerStateAtIndex(@Mapped(ObjCObjectMapper.class) MTLSamplerState sampler, @NUInt long index);

    /**
     * @method setSamplerStates:withRange:
     * @brief Set an array of samplers at the given bind point index range.
     */
    @Generated
    @Selector("setSamplerStates:withRange:")
    void setSamplerStatesWithRange(@ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> samplers,
            @ByValue NSRange range);

    /**
     * @method setTexture:atIndex:
     * @brief Set a texture at the given bind point index.
     */
    @Generated
    @Selector("setTexture:atIndex:")
    void setTextureAtIndex(@Mapped(ObjCObjectMapper.class) MTLTexture texture, @NUInt long index);

    /**
     * @method setTextures:withRange:
     * @brief Set an array of textures at the given bind point index range.
     */
    @Generated
    @Selector("setTextures:withRange:")
    void setTexturesWithRange(@ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> textures, @ByValue NSRange range);

    /**
     * @method newArgumentEncoderForBufferAtIndex:
     * @brief Returns a pointer to a new MTLArgumentEncoder that can be used to encode the an argument buffer
     * in the buffer associated with a given index.
     * Returns nil if the resource at the given index is not an argument buffer.
     */
    @Generated
    @Selector("newArgumentEncoderForBufferAtIndex:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLArgumentEncoder newArgumentEncoderForBufferAtIndex(@NUInt long index);

    /**
     * @method setComputePipelineState:atIndex
     * @brief Sets a compute pipeline state at a given bind point index
     */
    @Generated
    @Selector("setComputePipelineState:atIndex:")
    void setComputePipelineStateAtIndex(@Mapped(ObjCObjectMapper.class) MTLComputePipelineState pipeline,
            @NUInt long index);

    /**
     * @method setComputePipelineStates:withRange
     * @brief Set an array of compute pipeline states at a given bind point index range
     */
    @Generated
    @Selector("setComputePipelineStates:withRange:")
    void setComputePipelineStatesWithRange(@ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> pipelines,
            @ByValue NSRange range);

    /**
     * @method setIndirectCommandBuffer:atIndex
     * @brief Sets an indirect command buffer at a given bind point index
     */
    @Generated
    @Selector("setIndirectCommandBuffer:atIndex:")
    void setIndirectCommandBufferAtIndex(@Mapped(ObjCObjectMapper.class) MTLIndirectCommandBuffer indirectCommandBuffer,
            @NUInt long index);

    /**
     * @method setIndirectCommandBuffers:withRange:
     * @brief Set an array of indirect command buffers at the given bind point index range.
     */
    @Generated
    @Selector("setIndirectCommandBuffers:withRange:")
    void setIndirectCommandBuffersWithRange(@ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> buffers,
            @ByValue NSRange range);

    /**
     * @method setRenderPipelineState:atIndex
     * @brief Sets a render pipeline state at a given bind point index
     */
    @Generated
    @Selector("setRenderPipelineState:atIndex:")
    void setRenderPipelineStateAtIndex(@Mapped(ObjCObjectMapper.class) MTLRenderPipelineState pipeline,
            @NUInt long index);

    /**
     * @method setRenderPipelineStates:withRange
     * @brief Set an array of render pipeline states at a given bind point index range
     */
    @Generated
    @Selector("setRenderPipelineStates:withRange:")
    void setRenderPipelineStatesWithRange(@ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> pipelines,
            @ByValue NSRange range);

    @Generated
    @Selector("setAccelerationStructure:atIndex:")
    void setAccelerationStructureAtIndex(@Mapped(ObjCObjectMapper.class) MTLAccelerationStructure accelerationStructure,
            @NUInt long index);

    /**
     * @method setIntersectionFunctionTable:atIndex:
     * @brief Set an intersection function table at the given buffer index
     */
    @Generated
    @Selector("setIntersectionFunctionTable:atIndex:")
    void setIntersectionFunctionTableAtIndex(
            @Mapped(ObjCObjectMapper.class) MTLIntersectionFunctionTable intersectionFunctionTable, @NUInt long index);

    /**
     * @method setIntersectionFunctionTables:withRange:
     * @brief Set intersection function tables at the given buffer index range
     */
    @Generated
    @Selector("setIntersectionFunctionTables:withRange:")
    void setIntersectionFunctionTablesWithRange(
            @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> intersectionFunctionTables, @ByValue NSRange range);

    /**
     * @method setVisibleFunctionTable:atIndex:
     * @brief Set a visible function table at the given buffer index
     */
    @Generated
    @Selector("setVisibleFunctionTable:atIndex:")
    void setVisibleFunctionTableAtIndex(@Mapped(ObjCObjectMapper.class) MTLVisibleFunctionTable visibleFunctionTable,
            @NUInt long index);

    /**
     * @method setVisibleFunctionTables:withRange:
     * @brief Set visible function tables at the given buffer index range
     */
    @Generated
    @Selector("setVisibleFunctionTables:withRange:")
    void setVisibleFunctionTablesWithRange(
            @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> visibleFunctionTables, @ByValue NSRange range);
}