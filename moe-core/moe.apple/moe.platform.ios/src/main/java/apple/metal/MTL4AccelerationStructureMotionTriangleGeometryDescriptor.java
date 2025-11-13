package apple.metal;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.struct.MTL4BufferRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
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

/**
 * Describes motion triangle geometry, suitable for motion ray tracing.
 * 
 * Use a ``MTLResidencySet`` to mark residency of all buffers this descriptor references when you build this
 * acceleration structure.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTL4AccelerationStructureMotionTriangleGeometryDescriptor extends
        MTL4AccelerationStructureGeometryDescriptor {
    static {
        NatJ.register();
    }

    @Generated
    protected MTL4AccelerationStructureMotionTriangleGeometryDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTL4AccelerationStructureMotionTriangleGeometryDescriptor alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTL4AccelerationStructureMotionTriangleGeometryDescriptor allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget, @NotNull SEL aSelector,
            @Mapped(ObjCObjectMapper.class) @Nullable Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    @NotNull
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    @NotNull
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * Assigns an optional index buffer containing references to vertices in the vertex buffers you reference through
     * the
     * vertex buffers property.
     * 
     * You can set this property to `0`, the default, to avoid specifying an index buffer. All keyframes share the same
     * index buffer.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("indexBuffer")
    @ByValue
    public native MTL4BufferRange indexBuffer();

    /**
     * Specifies the size of the indices the `indexBuffer` contains, which is typically either 16 or 32-bits for each
     * index.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("indexType")
    @NUInt
    public native long indexType();

    @Generated
    @Selector("init")
    public native MTL4AccelerationStructureMotionTriangleGeometryDescriptor init();

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

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native MTL4AccelerationStructureMotionTriangleGeometryDescriptor new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Assigns an optional index buffer containing references to vertices in the vertex buffers you reference through
     * the
     * vertex buffers property.
     * 
     * You can set this property to `0`, the default, to avoid specifying an index buffer. All keyframes share the same
     * index buffer.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setIndexBuffer:")
    public native void setIndexBuffer(@ByValue MTL4BufferRange value);

    /**
     * Specifies the size of the indices the `indexBuffer` contains, which is typically either 16 or 32-bits for each
     * index.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setIndexType:")
    public native void setIndexType(@NUInt long value);

    /**
     * Assings an optional reference to a buffer containing a `float4x3` transformation matrix.
     * 
     * When the buffer address is non-zero, Metal applies this transform to the vertex data positions when building
     * the acceleration structure. All keyframes share the same transformation matrix.
     * 
     * Building an acceleration structure with a descriptor that specifies this property doesn't modify the contents of
     * the input `vertexBuffer`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setTransformationMatrixBuffer:")
    public native void setTransformationMatrixBuffer(@ByValue MTL4BufferRange value);

    /**
     * Configures the layout for the transformation matrix in the transformation matrix buffer.
     * 
     * You can provide matrices in column-major or row-major form, and this property allows you to control
     * how Metal interprets them.
     * 
     * Defaults to `MTLMatrixLayoutColumnMajor`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setTransformationMatrixLayout:")
    public native void setTransformationMatrixLayout(@NInt long value);

    /**
     * Declares the number of triangles in the vertex buffers that the buffer in the vertex buffers property references.
     * 
     * All keyframes share the same triangle count.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setTriangleCount:")
    public native void setTriangleCount(@NUInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Assigns a buffer where each entry contains a reference to a vertex buffer.
     * 
     * This property references a buffer that conceptually represents an array with one entry for each keyframe in the
     * motion animation. Each one of these entries consists of a ``MTL4BufferRange`` that, in turn, references a
     * vertex buffer containing the vertex data for the keyframe.
     * 
     * You are responsible for ensuring the buffer address is not zero for the top-level buffer, as well as for all
     * the vertex buffers it references.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setVertexBuffers:")
    public native void setVertexBuffers(@ByValue MTL4BufferRange value);

    /**
     * Defines the format of the vertices in the vertex buffers.
     * 
     * All keyframes share the same vertex format. Defaults to `MTLAttributeFormatFloat3`, corresponding to three packed
     * floating point numbers.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setVertexFormat:")
    public native void setVertexFormat(@NUInt long value);

    /**
     * Sets the stride, in bytes, between vertices in all the vertex buffer.
     * 
     * All keyframes share the same vertex stride. This stride needs to be a multiple of the size of the vertex format
     * you
     * provide in the ``vertexFormat`` property.
     * 
     * Similarly, you are responsible for ensuring this stride matches the vertex format data type's alignment.
     * 
     * Defaults to `0`, which signals the stride matches the size of the ``vertexFormat`` data.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setVertexStride:")
    public native void setVertexStride(@NUInt long value);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Assings an optional reference to a buffer containing a `float4x3` transformation matrix.
     * 
     * When the buffer address is non-zero, Metal applies this transform to the vertex data positions when building
     * the acceleration structure. All keyframes share the same transformation matrix.
     * 
     * Building an acceleration structure with a descriptor that specifies this property doesn't modify the contents of
     * the input `vertexBuffer`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("transformationMatrixBuffer")
    @ByValue
    public native MTL4BufferRange transformationMatrixBuffer();

    /**
     * Configures the layout for the transformation matrix in the transformation matrix buffer.
     * 
     * You can provide matrices in column-major or row-major form, and this property allows you to control
     * how Metal interprets them.
     * 
     * Defaults to `MTLMatrixLayoutColumnMajor`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("transformationMatrixLayout")
    @NInt
    public native long transformationMatrixLayout();

    /**
     * Declares the number of triangles in the vertex buffers that the buffer in the vertex buffers property references.
     * 
     * All keyframes share the same triangle count.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("triangleCount")
    @NUInt
    public native long triangleCount();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Assigns a buffer where each entry contains a reference to a vertex buffer.
     * 
     * This property references a buffer that conceptually represents an array with one entry for each keyframe in the
     * motion animation. Each one of these entries consists of a ``MTL4BufferRange`` that, in turn, references a
     * vertex buffer containing the vertex data for the keyframe.
     * 
     * You are responsible for ensuring the buffer address is not zero for the top-level buffer, as well as for all
     * the vertex buffers it references.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("vertexBuffers")
    @ByValue
    public native MTL4BufferRange vertexBuffers();

    /**
     * Defines the format of the vertices in the vertex buffers.
     * 
     * All keyframes share the same vertex format. Defaults to `MTLAttributeFormatFloat3`, corresponding to three packed
     * floating point numbers.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("vertexFormat")
    @NUInt
    public native long vertexFormat();

    /**
     * Sets the stride, in bytes, between vertices in all the vertex buffer.
     * 
     * All keyframes share the same vertex stride. This stride needs to be a multiple of the size of the vertex format
     * you
     * provide in the ``vertexFormat`` property.
     * 
     * Similarly, you are responsible for ensuring this stride matches the vertex format data type's alignment.
     * 
     * Defaults to `0`, which signals the stride matches the size of the ``vertexFormat`` data.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("vertexStride")
    @NUInt
    public native long vertexStride();
}