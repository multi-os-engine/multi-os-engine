package apple.metal;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.protocol.MTLBuffer;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Descriptor for motion triangle geometry
 * 
 * API-Since: 15.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTLAccelerationStructureMotionTriangleGeometryDescriptor extends
        MTLAccelerationStructureGeometryDescriptor {
    static {
        NatJ.register();
    }

    @Generated
    protected MTLAccelerationStructureMotionTriangleGeometryDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTLAccelerationStructureMotionTriangleGeometryDescriptor alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MTLAccelerationStructureMotionTriangleGeometryDescriptor allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("descriptor")
    public static native MTLAccelerationStructureMotionTriangleGeometryDescriptor descriptor();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * Optional index buffer containing references to vertices in the vertex buffer. May be nil.
     */
    @Nullable
    @Generated
    @Selector("indexBuffer")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLBuffer indexBuffer();

    /**
     * Index buffer offset. Must be a multiple of the index data type size and must be aligned to both
     * the index data type's alignment and the platform's buffer offset alignment.
     */
    @Generated
    @Selector("indexBufferOffset")
    @NUInt
    public native long indexBufferOffset();

    /**
     * Index type
     */
    @Generated
    @Selector("indexType")
    @NUInt
    public native long indexType();

    @Generated
    @Selector("init")
    public native MTLAccelerationStructureMotionTriangleGeometryDescriptor init();

    @Generated
    @Selector("instanceMethodForSelector:")
    @FunctionPtr(name = "call_instanceMethodForSelector_ret")
    public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(SEL aSelector);

    @Generated
    @Selector("instanceMethodSignatureForSelector:")
    public static native NSMethodSignature instanceMethodSignatureForSelector(SEL aSelector);

    @Generated
    @Selector("instancesRespondToSelector:")
    public static native boolean instancesRespondToSelector(SEL aSelector);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native MTLAccelerationStructureMotionTriangleGeometryDescriptor new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Optional index buffer containing references to vertices in the vertex buffer. May be nil.
     */
    @Generated
    @Selector("setIndexBuffer:")
    public native void setIndexBuffer(@Nullable @Mapped(ObjCObjectMapper.class) MTLBuffer value);

    /**
     * Index buffer offset. Must be a multiple of the index data type size and must be aligned to both
     * the index data type's alignment and the platform's buffer offset alignment.
     */
    @Generated
    @Selector("setIndexBufferOffset:")
    public native void setIndexBufferOffset(@NUInt long value);

    /**
     * Index type
     */
    @Generated
    @Selector("setIndexType:")
    public native void setIndexType(@NUInt long value);

    /**
     * Number of triangles
     */
    @Generated
    @Selector("setTriangleCount:")
    public native void setTriangleCount(@NUInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Vertex buffer containing triangle vertices similar to what MTLAccelerationStructureTriangleGeometryDescriptor has
     * but array of the values.
     */
    @Generated
    @Selector("setVertexBuffers:")
    public native void setVertexBuffers(@NotNull NSArray<? extends MTLMotionKeyframeData> value);

    /**
     * Stride, in bytes, between vertices in each keyframe's vertex buffer. Must be a multiple of the vertex format data
     * type size and must be aligned to
     * the vertex format data type's alignment. Defaults to 0, which will result in a stride of the vertex format data
     * size.
     */
    @Generated
    @Selector("setVertexStride:")
    public native void setVertexStride(@NUInt long value);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Number of triangles
     */
    @Generated
    @Selector("triangleCount")
    @NUInt
    public native long triangleCount();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Vertex buffer containing triangle vertices similar to what MTLAccelerationStructureTriangleGeometryDescriptor has
     * but array of the values.
     */
    @NotNull
    @Generated
    @Selector("vertexBuffers")
    public native NSArray<? extends MTLMotionKeyframeData> vertexBuffers();

    /**
     * Stride, in bytes, between vertices in each keyframe's vertex buffer. Must be a multiple of the vertex format data
     * type size and must be aligned to
     * the vertex format data type's alignment. Defaults to 0, which will result in a stride of the vertex format data
     * size.
     */
    @Generated
    @Selector("vertexStride")
    @NUInt
    public native long vertexStride();

    /**
     * Buffer containing packed float4x3 transformation matrix. Transform is applied to the vertex data when building
     * the acceleration structure. Input vertex buffers are not modified.
     * The transformation matrix is applied to all keyframes' vertex data.
     * When set to nil, transformation matrix is not applied to vertex data.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setTransformationMatrixBuffer:")
    public native void setTransformationMatrixBuffer(@Nullable @Mapped(ObjCObjectMapper.class) MTLBuffer value);

    /**
     * Transformation matrix buffer offset. Must be a multiple of 4 bytes. Defaults to 0.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setTransformationMatrixBufferOffset:")
    public native void setTransformationMatrixBufferOffset(@NUInt long value);

    /**
     * Format type of the vertex buffers across all keyframes.
     * Defaults to MTLAttributeFormatFloat3 (packed).
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setVertexFormat:")
    public native void setVertexFormat(@NUInt long value);

    /**
     * Buffer containing packed float4x3 transformation matrix. Transform is applied to the vertex data when building
     * the acceleration structure. Input vertex buffers are not modified.
     * The transformation matrix is applied to all keyframes' vertex data.
     * When set to nil, transformation matrix is not applied to vertex data.
     * 
     * API-Since: 16.0
     */
    @Nullable
    @Generated
    @Selector("transformationMatrixBuffer")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLBuffer transformationMatrixBuffer();

    /**
     * Transformation matrix buffer offset. Must be a multiple of 4 bytes. Defaults to 0.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("transformationMatrixBufferOffset")
    @NUInt
    public native long transformationMatrixBufferOffset();

    /**
     * Format type of the vertex buffers across all keyframes.
     * Defaults to MTLAttributeFormatFloat3 (packed).
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("vertexFormat")
    @NUInt
    public native long vertexFormat();
}
