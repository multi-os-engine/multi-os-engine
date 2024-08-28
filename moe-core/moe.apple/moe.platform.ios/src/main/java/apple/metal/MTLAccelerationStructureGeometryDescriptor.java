package apple.metal;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
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
import apple.metal.protocol.MTLBuffer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Base class for all geometry descriptors. Do not use this class directly. Use one of the derived
 * classes instead.
 * 
 * API-Since: 14.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTLAccelerationStructureGeometryDescriptor extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MTLAccelerationStructureGeometryDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTLAccelerationStructureGeometryDescriptor alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MTLAccelerationStructureGeometryDescriptor allocWithZone(VoidPtr zone);

    /**
     * Whether intersection functions may be invoked more than once per ray/primitive
     * intersection. Defaults to YES.
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

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
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
    public native MTLAccelerationStructureGeometryDescriptor init();

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
    @Selector("intersectionFunctionTableOffset")
    @NUInt
    public native long intersectionFunctionTableOffset();

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
    public static native MTLAccelerationStructureGeometryDescriptor new_objc();

    /**
     * Whether the geometry is opaque
     */
    @Generated
    @Selector("opaque")
    public native boolean opaque();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Whether intersection functions may be invoked more than once per ray/primitive
     * intersection. Defaults to YES.
     */
    @Generated
    @Selector("setAllowDuplicateIntersectionFunctionInvocation:")
    public native void setAllowDuplicateIntersectionFunctionInvocation(boolean value);

    @Generated
    @Selector("setIntersectionFunctionTableOffset:")
    public native void setIntersectionFunctionTableOffset(@NUInt long value);

    /**
     * Whether the geometry is opaque
     */
    @Generated
    @Selector("setOpaque:")
    public native void setOpaque(boolean value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Label
     * 
     * API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("label")
    public native String label();

    /**
     * Label
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setLabel:")
    public native void setLabel(@Nullable String value);

    /**
     * Data buffer containing per-primitive data. May be nil.
     * 
     * API-Since: 16.0
     */
    @Nullable
    @Generated
    @Selector("primitiveDataBuffer")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLBuffer primitiveDataBuffer();

    /**
     * Primitive data buffer offset in bytes. Must be aligned to the platform's buffer offset alignment. Defaults to 0
     * bytes.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("primitiveDataBufferOffset")
    @NUInt
    public native long primitiveDataBufferOffset();

    /**
     * Size, in bytes, of the data for each primitive in the primitive data buffer. Must be at most primitiveDataStride
     * and must be a
     * multiple of 4 bytes. Defaults to 0 bytes.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("primitiveDataElementSize")
    @NUInt
    public native long primitiveDataElementSize();

    /**
     * Stride, in bytes, between per-primitive data in the primitive data buffer. Must be at least
     * primitiveDataElementSize and must be a
     * multiple of 4 bytes. Defaults to 0 bytes. Assumed to be equal to primitiveDataElementSize if zero.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("primitiveDataStride")
    @NUInt
    public native long primitiveDataStride();

    /**
     * Data buffer containing per-primitive data. May be nil.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setPrimitiveDataBuffer:")
    public native void setPrimitiveDataBuffer(@Nullable @Mapped(ObjCObjectMapper.class) MTLBuffer value);

    /**
     * Primitive data buffer offset in bytes. Must be aligned to the platform's buffer offset alignment. Defaults to 0
     * bytes.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setPrimitiveDataBufferOffset:")
    public native void setPrimitiveDataBufferOffset(@NUInt long value);

    /**
     * Size, in bytes, of the data for each primitive in the primitive data buffer. Must be at most primitiveDataStride
     * and must be a
     * multiple of 4 bytes. Defaults to 0 bytes.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setPrimitiveDataElementSize:")
    public native void setPrimitiveDataElementSize(@NUInt long value);

    /**
     * Stride, in bytes, between per-primitive data in the primitive data buffer. Must be at least
     * primitiveDataElementSize and must be a
     * multiple of 4 bytes. Defaults to 0 bytes. Assumed to be equal to primitiveDataElementSize if zero.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setPrimitiveDataStride:")
    public native void setPrimitiveDataStride(@NUInt long value);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
