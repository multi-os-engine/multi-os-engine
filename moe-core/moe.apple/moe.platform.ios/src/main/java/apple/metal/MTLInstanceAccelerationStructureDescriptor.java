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
 * Descriptor for an instance acceleration structure
 * 
 * API-Since: 14.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTLInstanceAccelerationStructureDescriptor extends MTLAccelerationStructureDescriptor {
    static {
        NatJ.register();
    }

    @Generated
    protected MTLInstanceAccelerationStructureDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTLInstanceAccelerationStructureDescriptor alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MTLInstanceAccelerationStructureDescriptor allocWithZone(VoidPtr zone);

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

    /**
     * API-Since: 14.0
     */
    @Generated
    @Selector("descriptor")
    public static native MTLInstanceAccelerationStructureDescriptor descriptor();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MTLInstanceAccelerationStructureDescriptor init();

    /**
     * Number of instance descriptors
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("instanceCount")
    @NUInt
    public native long instanceCount();

    /**
     * Buffer containing instance descriptors of the type specified by the instanceDescriptorType property
     * 
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("instanceDescriptorBuffer")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLBuffer instanceDescriptorBuffer();

    /**
     * Offset into the instance descriptor buffer. Must be a multiple of 64 bytes and must be
     * aligned to the platform's buffer offset alignment.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("instanceDescriptorBufferOffset")
    @NUInt
    public native long instanceDescriptorBufferOffset();

    /**
     * Stride, in bytes, between instance descriptors in the instance descriptor buffer. Must
     * be at least the size of the instance descriptor type and must be a multiple of 4 bytes.
     * Defaults to the size of the instance descriptor type.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("instanceDescriptorStride")
    @NUInt
    public native long instanceDescriptorStride();

    @Generated
    @Selector("instanceMethodForSelector:")
    @FunctionPtr(name = "call_instanceMethodForSelector_ret")
    public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(SEL aSelector);

    @Generated
    @Selector("instanceMethodSignatureForSelector:")
    public static native NSMethodSignature instanceMethodSignatureForSelector(SEL aSelector);

    /**
     * Acceleration structures to be instanced
     * 
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("instancedAccelerationStructures")
    public native NSArray<?> instancedAccelerationStructures();

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
    public static native MTLInstanceAccelerationStructureDescriptor new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Number of instance descriptors
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setInstanceCount:")
    public native void setInstanceCount(@NUInt long value);

    /**
     * Buffer containing instance descriptors of the type specified by the instanceDescriptorType property
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setInstanceDescriptorBuffer:")
    public native void setInstanceDescriptorBuffer(@Nullable @Mapped(ObjCObjectMapper.class) MTLBuffer value);

    /**
     * Offset into the instance descriptor buffer. Must be a multiple of 64 bytes and must be
     * aligned to the platform's buffer offset alignment.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setInstanceDescriptorBufferOffset:")
    public native void setInstanceDescriptorBufferOffset(@NUInt long value);

    /**
     * Stride, in bytes, between instance descriptors in the instance descriptor buffer. Must
     * be at least the size of the instance descriptor type and must be a multiple of 4 bytes.
     * Defaults to the size of the instance descriptor type.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setInstanceDescriptorStride:")
    public native void setInstanceDescriptorStride(@NUInt long value);

    /**
     * Acceleration structures to be instanced
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setInstancedAccelerationStructures:")
    public native void setInstancedAccelerationStructures(@Nullable NSArray<?> value);

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
     * Type of instance descriptor in the instance descriptor buffer. Defaults to
     * MTLAccelerationStructureInstanceDescriptorTypeDefault.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("instanceDescriptorType")
    @NUInt
    public native long instanceDescriptorType();

    /**
     * Buffer containing transformation information for motion
     * 
     * API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("motionTransformBuffer")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLBuffer motionTransformBuffer();

    /**
     * Offset into the instance motion descriptor buffer. Must be a multiple of 64 bytes and
     * must be aligned to the platform's buffer offset alignment.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("motionTransformBufferOffset")
    @NUInt
    public native long motionTransformBufferOffset();

    /**
     * Number of motion transforms
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("motionTransformCount")
    @NUInt
    public native long motionTransformCount();

    /**
     * Type of instance descriptor in the instance descriptor buffer. Defaults to
     * MTLAccelerationStructureInstanceDescriptorTypeDefault.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setInstanceDescriptorType:")
    public native void setInstanceDescriptorType(@NUInt long value);

    /**
     * Buffer containing transformation information for motion
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setMotionTransformBuffer:")
    public native void setMotionTransformBuffer(@Nullable @Mapped(ObjCObjectMapper.class) MTLBuffer value);

    /**
     * Offset into the instance motion descriptor buffer. Must be a multiple of 64 bytes and
     * must be aligned to the platform's buffer offset alignment.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setMotionTransformBufferOffset:")
    public native void setMotionTransformBufferOffset(@NUInt long value);

    /**
     * Number of motion transforms
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setMotionTransformCount:")
    public native void setMotionTransformCount(@NUInt long value);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    /**
     * Matrix layout of the transformation matrices in the instance descriptors
     * in the instance descriptor buffer and the transformation matrices in the
     * transformation matrix buffer. Defaults to MTLMatrixLayoutColumnMajor.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("instanceTransformationMatrixLayout")
    @NInt
    public native long instanceTransformationMatrixLayout();

    /**
     * Motion transform stride. Defaults to 0, indicating that transforms are tightly packed according to the
     * motion transform type.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("motionTransformStride")
    @NUInt
    public native long motionTransformStride();

    /**
     * Type of motion transforms. Defaults to MTLTransformTypePackedFloat4x3.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("motionTransformType")
    @NInt
    public native long motionTransformType();

    /**
     * Matrix layout of the transformation matrices in the instance descriptors
     * in the instance descriptor buffer and the transformation matrices in the
     * transformation matrix buffer. Defaults to MTLMatrixLayoutColumnMajor.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setInstanceTransformationMatrixLayout:")
    public native void setInstanceTransformationMatrixLayout(@NInt long value);

    /**
     * Motion transform stride. Defaults to 0, indicating that transforms are tightly packed according to the
     * motion transform type.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setMotionTransformStride:")
    public native void setMotionTransformStride(@NUInt long value);

    /**
     * Type of motion transforms. Defaults to MTLTransformTypePackedFloat4x3.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setMotionTransformType:")
    public native void setMotionTransformType(@NInt long value);
}
