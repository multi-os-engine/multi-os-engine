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

@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLArgumentEncoder")
public interface MTLArgumentEncoder {
    @Generated
    @Selector("alignment")
    @NUInt
    long alignment();

    @Generated
    @Selector("constantDataAtIndex:")
    VoidPtr constantDataAtIndex(@NUInt long index);

    @Generated
    @Selector("device")
    @MappedReturn(ObjCObjectMapper.class)
    MTLDevice device();

    @Generated
    @Selector("encodedLength")
    @NUInt
    long encodedLength();

    @Generated
    @Selector("label")
    String label();

    @Generated
    @Selector("setArgumentBuffer:offset:")
    void setArgumentBufferOffset(@Mapped(ObjCObjectMapper.class) MTLBuffer argumentBuffer, @NUInt long offset);

    @Generated
    @Selector("setArgumentBuffer:startOffset:arrayElement:")
    void setArgumentBufferStartOffsetArrayElement(@Mapped(ObjCObjectMapper.class) MTLBuffer argumentBuffer,
            @NUInt long startOffset, @NUInt long arrayElement);

    @Generated
    @Selector("setBuffer:offset:atIndex:")
    void setBufferOffsetAtIndex(@Mapped(ObjCObjectMapper.class) MTLBuffer buffer, @NUInt long offset,
            @NUInt long index);

    @Generated
    @Selector("setBuffers:offsets:withRange:")
    void setBuffersOffsetsWithRange(@ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> buffers,
            ConstNUIntPtr offsets, @ByValue NSRange range);

    @Generated
    @Selector("setLabel:")
    void setLabel(String value);

    @Generated
    @Selector("setSamplerState:atIndex:")
    void setSamplerStateAtIndex(@Mapped(ObjCObjectMapper.class) MTLSamplerState sampler, @NUInt long index);

    @Generated
    @Selector("setSamplerStates:withRange:")
    void setSamplerStatesWithRange(@ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> samplers,
            @ByValue NSRange range);

    @Generated
    @Selector("setTexture:atIndex:")
    void setTextureAtIndex(@Mapped(ObjCObjectMapper.class) MTLTexture texture, @NUInt long index);

    @Generated
    @Selector("setTextures:withRange:")
    void setTexturesWithRange(@ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> textures, @ByValue NSRange range);

    @Generated
    @Selector("newArgumentEncoderForBufferAtIndex:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLArgumentEncoder newArgumentEncoderForBufferAtIndex(@NUInt long index);

    @Generated
    @Selector("setComputePipelineState:atIndex:")
    void setComputePipelineStateAtIndex(@Mapped(ObjCObjectMapper.class) MTLComputePipelineState pipeline,
            @NUInt long index);

    @Generated
    @Selector("setComputePipelineStates:withRange:")
    void setComputePipelineStatesWithRange(@ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> pipelines,
            @ByValue NSRange range);

    @Generated
    @Selector("setIndirectCommandBuffer:atIndex:")
    void setIndirectCommandBufferAtIndex(@Mapped(ObjCObjectMapper.class) MTLIndirectCommandBuffer indirectCommandBuffer,
            @NUInt long index);

    @Generated
    @Selector("setIndirectCommandBuffers:withRange:")
    void setIndirectCommandBuffersWithRange(@ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> buffers,
            @ByValue NSRange range);

    @Generated
    @Selector("setRenderPipelineState:atIndex:")
    void setRenderPipelineStateAtIndex(@Mapped(ObjCObjectMapper.class) MTLRenderPipelineState pipeline,
            @NUInt long index);

    @Generated
    @Selector("setRenderPipelineStates:withRange:")
    void setRenderPipelineStatesWithRange(@ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> pipelines,
            @ByValue NSRange range);

    @Generated
    @Selector("setAccelerationStructure:atIndex:")
    void setAccelerationStructureAtIndex(@Mapped(ObjCObjectMapper.class) MTLAccelerationStructure accelerationStructure,
            @NUInt long index);

    @Generated
    @Selector("setIntersectionFunctionTable:atIndex:")
    void setIntersectionFunctionTableAtIndex(
            @Mapped(ObjCObjectMapper.class) MTLIntersectionFunctionTable intersectionFunctionTable, @NUInt long index);

    @Generated
    @Selector("setIntersectionFunctionTables:withRange:")
    void setIntersectionFunctionTablesWithRange(
            @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> intersectionFunctionTables, @ByValue NSRange range);

    @Generated
    @Selector("setVisibleFunctionTable:atIndex:")
    void setVisibleFunctionTableAtIndex(@Mapped(ObjCObjectMapper.class) MTLVisibleFunctionTable visibleFunctionTable,
            @NUInt long index);

    @Generated
    @Selector("setVisibleFunctionTables:withRange:")
    void setVisibleFunctionTablesWithRange(
            @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> visibleFunctionTables, @ByValue NSRange range);
}