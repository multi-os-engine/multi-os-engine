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
import apple.metal.struct.MTLResourceID;

/**
 * API-Since: 14.0
 */
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

    /**
     * Initialize the function at the given index with a triangle intersection function
     * with the given signature which always accepts ray/triangle intersections. If this method is
     * not called and an intersection function is not otherwise set at the given index,
     * ray/triangle intersections will be ignored if a call to the function at the given index
     * would be required. Ray/triangle intersections are always accepted if an intersection
     * function table is not provided.
     */
    @Generated
    @Selector("setOpaqueTriangleIntersectionFunctionWithSignature:atIndex:")
    void setOpaqueTriangleIntersectionFunctionWithSignatureAtIndex(@NUInt long signature, @NUInt long index);

    /**
     * Initialize the function at the given range with a triangle intersection function
     * with the given signature which always accepts ray/triangle intersections. If this method is
     * not called and an intersection function is not otherwise set at an index in the given range,
     * ray/triangle intersections will be ignored if a call to the function at that index
     * would be required. Ray/triangle intersections are always accepted if an intersection
     * function table is not provided.
     */
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

    /**
     * [@property] gpuResourceID
     * 
     * Handle of the GPU resource suitable for storing in an Argument Buffer
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("gpuResourceID")
    @ByValue
    MTLResourceID gpuResourceID();
}