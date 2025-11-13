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
 * Describes triangle geometry suitable for ray tracing.
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
public class MTL4AccelerationStructureTriangleGeometryDescriptor extends MTL4AccelerationStructureGeometryDescriptor {
    static {
        NatJ.register();
    }

    @Generated
    protected MTL4AccelerationStructureTriangleGeometryDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTL4AccelerationStructureTriangleGeometryDescriptor alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTL4AccelerationStructureTriangleGeometryDescriptor allocWithZone(VoidPtr zone);

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
     * Sets an optional index buffer containing references to vertices in the `vertexBuffer`.
     * 
     * You can set this property to `0`, the default, to avoid specifying an index buffer.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("indexBuffer")
    @ByValue
    public native MTL4BufferRange indexBuffer();

    /**
     * Configures the size of the indices the `indexBuffer` contains, which is typically either 16 or 32-bits for each
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
    public native MTL4AccelerationStructureTriangleGeometryDescriptor init();

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
    public static native MTL4AccelerationStructureTriangleGeometryDescriptor new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Sets an optional index buffer containing references to vertices in the `vertexBuffer`.
     * 
     * You can set this property to `0`, the default, to avoid specifying an index buffer.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setIndexBuffer:")
    public native void setIndexBuffer(@ByValue MTL4BufferRange value);

    /**
     * Configures the size of the indices the `indexBuffer` contains, which is typically either 16 or 32-bits for each
     * index.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setIndexType:")
    public native void setIndexType(@NUInt long value);

    /**
     * Assigns an optional reference to a buffer containing a `float4x3` transformation matrix.
     * 
     * When the buffer address is non-zero, Metal applies this transform to the vertex data positions when building
     * the acceleration structure.
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
     * Declares the number of triangles in this geometry descriptor.
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
     * Associates a vertex buffer containing triangle vertices.
     * 
     * You are responsible for ensuring that the format of all vertex positions match the ``vertexFormat`` property, and
     * that the buffer address for the buffer range is not zero.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setVertexBuffer:")
    public native void setVertexBuffer(@ByValue MTL4BufferRange value);

    /**
     * Describes the format of the vertices in the vertex buffer.
     * 
     * This property controls the format of the position attribute of the vertices the ``vertexBuffer`` references.
     * 
     * The format defaults to `MTLAttributeFormatFloat3`, corresponding to three packed floating point numbers.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setVertexFormat:")
    public native void setVertexFormat(@NUInt long value);

    /**
     * Sets the stride, in bytes, between vertices in the vertex buffer.
     * 
     * The stride you specify needs to be a multiple of the size of the vertex format you provide in the
     * ``vertexFormat``
     * property. Similarly, you are responsible for ensuring this stride matches the vertex format data type's
     * alignment.
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
     * Assigns an optional reference to a buffer containing a `float4x3` transformation matrix.
     * 
     * When the buffer address is non-zero, Metal applies this transform to the vertex data positions when building
     * the acceleration structure.
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
     * Declares the number of triangles in this geometry descriptor.
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
     * Associates a vertex buffer containing triangle vertices.
     * 
     * You are responsible for ensuring that the format of all vertex positions match the ``vertexFormat`` property, and
     * that the buffer address for the buffer range is not zero.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("vertexBuffer")
    @ByValue
    public native MTL4BufferRange vertexBuffer();

    /**
     * Describes the format of the vertices in the vertex buffer.
     * 
     * This property controls the format of the position attribute of the vertices the ``vertexBuffer`` references.
     * 
     * The format defaults to `MTLAttributeFormatFloat3`, corresponding to three packed floating point numbers.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("vertexFormat")
    @NUInt
    public native long vertexFormat();

    /**
     * Sets the stride, in bytes, between vertices in the vertex buffer.
     * 
     * The stride you specify needs to be a multiple of the size of the vertex format you provide in the
     * ``vertexFormat``
     * property. Similarly, you are responsible for ensuring this stride matches the vertex format data type's
     * alignment.
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