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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

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
    void setBufferOffsetAtIndex(@Nullable @Mapped(ObjCObjectMapper.class) MTLBuffer buffer, @NUInt long offset,
            @NUInt long index);

    @Generated
    @Selector("setBuffers:offsets:withRange:")
    void setBuffersOffsetsWithRange(@NotNull @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> buffers,
            @NotNull ConstNUIntPtr offsets, @ByValue NSRange range);

    @Generated
    @Selector("setFunction:atIndex:")
    void setFunctionAtIndex(@Nullable @Mapped(ObjCObjectMapper.class) MTLFunctionHandle function, @NUInt long index);

    @Generated
    @Selector("setFunctions:withRange:")
    void setFunctionsWithRange(@NotNull @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> functions,
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
    void setVisibleFunctionTableAtBufferIndex(
            @Nullable @Mapped(ObjCObjectMapper.class) MTLVisibleFunctionTable functionTable, @NUInt long bufferIndex);

    @Generated
    @Selector("setVisibleFunctionTables:withBufferRange:")
    void setVisibleFunctionTablesWithBufferRange(
            @NotNull @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> functionTables,
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

    /**
     * Initialize the function at the given index with a curve intersection function
     * with the given signature which always accepts ray/curve intersections. If this method is
     * not called and an intersection function is not otherwise set at the given index,
     * ray/curve intersections will be ignored if a call to the function at the given index
     * would be required. Ray/curve intersections are always accepted if an intersection
     * function table is not provided.
     */
    @Generated
    @Selector("setOpaqueCurveIntersectionFunctionWithSignature:atIndex:")
    void setOpaqueCurveIntersectionFunctionWithSignatureAtIndex(@NUInt long signature, @NUInt long index);

    /**
     * Initialize the function at the given range with a curve intersection function
     * with the given signature which always accepts ray/curve intersections. If this method is
     * not called and an intersection function is not otherwise set at an index in the given range,
     * ray/curve intersections will be ignored if a call to the function at that index
     * would be required. Ray/curve intersections are always accepted if an intersection
     * function table is not provided.
     */
    @Generated
    @Selector("setOpaqueCurveIntersectionFunctionWithSignature:withRange:")
    void setOpaqueCurveIntersectionFunctionWithSignatureWithRange(@NUInt long signature, @ByValue NSRange range);
}