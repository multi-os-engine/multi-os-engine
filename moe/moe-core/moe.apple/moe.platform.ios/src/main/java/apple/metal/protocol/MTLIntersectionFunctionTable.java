package apple.metal.protocol;

import apple.foundation.struct.NSRange;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.ConstNUIntPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCObject;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLIntersectionFunctionTable")
public interface MTLIntersectionFunctionTable extends MTLResource {
    @Generated
    @Selector("setBuffer:offset:atIndex:")
    void setBufferOffsetAtIndex(@Mapped(ObjCObjectMapper.class) MTLBuffer buffer, @NUInt long offset,
            @NUInt long index);

    @Generated
    @Selector("setBuffers:offsets:withRange:")
    void setBuffersOffsetsWithRange(@ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> buffers,
            ConstNUIntPtr offsets, @ByValue NSRange range);

    @Generated
    @Selector("setFunction:atIndex:")
    void setFunctionAtIndex(@Mapped(ObjCObjectMapper.class) MTLFunctionHandle function, @NUInt long index);

    @Generated
    @Selector("setFunctions:withRange:")
    void setFunctionsWithRange(@ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> functions,
            @ByValue NSRange range);

    @Generated
    @Selector("setOpaqueTriangleIntersectionFunctionWithSignature:atIndex:")
    void setOpaqueTriangleIntersectionFunctionWithSignatureAtIndex(@NUInt long signature, @NUInt long index);

    @Generated
    @Selector("setOpaqueTriangleIntersectionFunctionWithSignature:withRange:")
    void setOpaqueTriangleIntersectionFunctionWithSignatureWithRange(@NUInt long signature, @ByValue NSRange range);

    @Generated
    @Selector("setVisibleFunctionTable:atBufferIndex:")
    void setVisibleFunctionTableAtBufferIndex(@Mapped(ObjCObjectMapper.class) MTLVisibleFunctionTable functionTable,
            @NUInt long bufferIndex);

    @Generated
    @Selector("setVisibleFunctionTables:withBufferRange:")
    void setVisibleFunctionTablesWithBufferRange(@ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> functionTables,
            @ByValue NSRange bufferRange);
}