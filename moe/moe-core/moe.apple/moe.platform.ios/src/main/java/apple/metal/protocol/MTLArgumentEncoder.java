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
    Object device();

    @Generated
    @Selector("encodedLength")
    @NUInt
    long encodedLength();

    @Generated
    @Selector("label")
    String label();

    @Generated
    @Selector("setArgumentBuffer:offset:")
    void setArgumentBufferOffset(@Mapped(ObjCObjectMapper.class) Object argumentBuffer, @NUInt long offset);

    @Generated
    @Selector("setArgumentBuffer:startOffset:arrayElement:")
    void setArgumentBufferStartOffsetArrayElement(@Mapped(ObjCObjectMapper.class) Object argumentBuffer,
            @NUInt long startOffset, @NUInt long arrayElement);

    @Generated
    @Selector("setBuffer:offset:atIndex:")
    void setBufferOffsetAtIndex(@Mapped(ObjCObjectMapper.class) Object buffer, @NUInt long offset, @NUInt long index);

    @Generated
    @Selector("setBuffers:offsets:withRange:")
    void setBuffersOffsetsWithRange(@ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> buffers,
            ConstNUIntPtr offsets, @ByValue NSRange range);

    @Generated
    @Selector("setLabel:")
    void setLabel(String value);

    @Generated
    @Selector("setSamplerState:atIndex:")
    void setSamplerStateAtIndex(@Mapped(ObjCObjectMapper.class) Object sampler, @NUInt long index);

    @Generated
    @Selector("setSamplerStates:withRange:")
    void setSamplerStatesWithRange(@ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> samplers,
            @ByValue NSRange range);

    @Generated
    @Selector("setTexture:atIndex:")
    void setTextureAtIndex(@Mapped(ObjCObjectMapper.class) Object texture, @NUInt long index);

    @Generated
    @Selector("setTextures:withRange:")
    void setTexturesWithRange(@ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> textures, @ByValue NSRange range);
}