package apple.metal;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
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

/**
 * Base class for all Metal 4 acceleration structure geometry descriptors.
 * 
 * Don't use this class directly. Use one of the derived classes instead.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTL4AccelerationStructureGeometryDescriptor extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MTL4AccelerationStructureGeometryDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTL4AccelerationStructureGeometryDescriptor alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTL4AccelerationStructureGeometryDescriptor allocWithZone(VoidPtr zone);

    /**
     * A boolean value that indicates whether the ray-tracing system in Metal allows the invocation of intersection
     * functions
     * more than once per ray-primitive intersection.
     * 
     * The property's default value is <doc://com.apple.documentation/documentation/swift/true>.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("allowDuplicateIntersectionFunctionInvocation")
    public native boolean allowDuplicateIntersectionFunctionInvocation();

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
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    @NotNull
    public native Object copyWithZone(@Nullable VoidPtr zone);

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

    @Generated
    @Selector("init")
    public native MTL4AccelerationStructureGeometryDescriptor init();

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

    /**
     * Sets the offset that this geometry contributes to determining the intersection function to invoke when a ray
     * intersects it.
     * 
     * When you perform a ray tracing operation in the Metal Shading Language, and provide the ray intersector object
     * with an instance of ``MTLIntersectionFunctionTable``, Metal adds this offset to the instance offset from structs
     * such
     * as:
     * 
     * - ``MTLAccelerationStructureInstanceDescriptor``
     * - ``MTLAccelerationStructureUserIDInstanceDescriptor``
     * - ``MTLAccelerationStructureMotionInstanceDescriptor``
     * - ``MTLIndirectAccelerationStructureInstanceDescriptor``
     * - ``MTLIndirectAccelerationStructureMotionInstanceDescriptor``
     * 
     * The sum of these offsets provides an index into the intersection function table that the ray tracing system uses
     * to retrieve and invoke the function at this index, allowing you to customize the intersection evaluation process.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("intersectionFunctionTableOffset")
    @NUInt
    public native long intersectionFunctionTableOffset();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * Assigns an optional label you can assign to this geometry for debugging purposes.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("label")
    @Nullable
    public native String label();

    @Generated
    @Owned
    @Selector("new")
    public static native MTL4AccelerationStructureGeometryDescriptor new_objc();

    /**
     * Provides a hint to Metal that this geometry is opaque, potentially accelerating the ray/primitive intersection
     * process.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("opaque")
    public native boolean opaque();

    /**
     * Assigns optional buffer containing data to associate with each primitive in this geometry.
     * 
     * You can use zero as the buffer address in this buffer range.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("primitiveDataBuffer")
    @ByValue
    public native MTL4BufferRange primitiveDataBuffer();

    /**
     * Sets the size, in bytes, of the data for each primitive in the primitive data buffer ``primitiveDataBuffer``
     * references.
     * 
     * This size needs to be at most ``primitiveDataStride`` in size and a multiple of 4 bytes.
     * 
     * This property defaults to 0 bytes.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("primitiveDataElementSize")
    @NUInt
    public native long primitiveDataElementSize();

    /**
     * Defines the stride, in bytes, between each primitive's data in the primitive data buffer ``primitiveDataBuffer``
     * references.
     * 
     * You are responsible for ensuring the stride is at least ``primitiveDataElementSize`` in size and a multiple of 4
     * bytes.
     * 
     * This property defaults to `0` bytes, which indicates the stride is equal to ``primitiveDataElementSize``.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("primitiveDataStride")
    @NUInt
    public native long primitiveDataStride();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * A boolean value that indicates whether the ray-tracing system in Metal allows the invocation of intersection
     * functions
     * more than once per ray-primitive intersection.
     * 
     * The property's default value is <doc://com.apple.documentation/documentation/swift/true>.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setAllowDuplicateIntersectionFunctionInvocation:")
    public native void setAllowDuplicateIntersectionFunctionInvocation(boolean value);

    /**
     * Sets the offset that this geometry contributes to determining the intersection function to invoke when a ray
     * intersects it.
     * 
     * When you perform a ray tracing operation in the Metal Shading Language, and provide the ray intersector object
     * with an instance of ``MTLIntersectionFunctionTable``, Metal adds this offset to the instance offset from structs
     * such
     * as:
     * 
     * - ``MTLAccelerationStructureInstanceDescriptor``
     * - ``MTLAccelerationStructureUserIDInstanceDescriptor``
     * - ``MTLAccelerationStructureMotionInstanceDescriptor``
     * - ``MTLIndirectAccelerationStructureInstanceDescriptor``
     * - ``MTLIndirectAccelerationStructureMotionInstanceDescriptor``
     * 
     * The sum of these offsets provides an index into the intersection function table that the ray tracing system uses
     * to retrieve and invoke the function at this index, allowing you to customize the intersection evaluation process.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setIntersectionFunctionTableOffset:")
    public native void setIntersectionFunctionTableOffset(@NUInt long value);

    /**
     * Assigns an optional label you can assign to this geometry for debugging purposes.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setLabel:")
    public native void setLabel(@Nullable String value);

    /**
     * Provides a hint to Metal that this geometry is opaque, potentially accelerating the ray/primitive intersection
     * process.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setOpaque:")
    public native void setOpaque(boolean value);

    /**
     * Assigns optional buffer containing data to associate with each primitive in this geometry.
     * 
     * You can use zero as the buffer address in this buffer range.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setPrimitiveDataBuffer:")
    public native void setPrimitiveDataBuffer(@ByValue MTL4BufferRange value);

    /**
     * Sets the size, in bytes, of the data for each primitive in the primitive data buffer ``primitiveDataBuffer``
     * references.
     * 
     * This size needs to be at most ``primitiveDataStride`` in size and a multiple of 4 bytes.
     * 
     * This property defaults to 0 bytes.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setPrimitiveDataElementSize:")
    public native void setPrimitiveDataElementSize(@NUInt long value);

    /**
     * Defines the stride, in bytes, between each primitive's data in the primitive data buffer ``primitiveDataBuffer``
     * references.
     * 
     * You are responsible for ensuring the stride is at least ``primitiveDataElementSize`` in size and a multiple of 4
     * bytes.
     * 
     * This property defaults to `0` bytes, which indicates the stride is equal to ``primitiveDataElementSize``.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setPrimitiveDataStride:")
    public native void setPrimitiveDataStride(@NUInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}