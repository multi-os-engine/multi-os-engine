package apple.metal;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.protocol.MTLBuffer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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

/**
 * Descriptor for an instance acceleration structure built with an indirected buffer of instances.
 * 
 * API-Since: 17.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTLIndirectInstanceAccelerationStructureDescriptor extends MTLAccelerationStructureDescriptor {
    static {
        NatJ.register();
    }

    @Generated
    protected MTLIndirectInstanceAccelerationStructureDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTLIndirectInstanceAccelerationStructureDescriptor alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTLIndirectInstanceAccelerationStructureDescriptor allocWithZone(VoidPtr zone);

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
    @Selector("descriptor")
    public static native MTLIndirectInstanceAccelerationStructureDescriptor descriptor();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MTLIndirectInstanceAccelerationStructureDescriptor init();

    /**
     * Buffer containing the instance count as a uint32_t value. Value at build time
     * must be less than or equal to maxInstanceCount.
     */
    @Generated
    @Selector("instanceCountBuffer")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    public native MTLBuffer instanceCountBuffer();

    /**
     * Offset into the instance count buffer. Must be a multiple of 4 bytes and must be
     * aligned to the platform's buffer offset alignment.
     */
    @Generated
    @Selector("instanceCountBufferOffset")
    @NUInt
    public native long instanceCountBufferOffset();

    /**
     * Buffer containing instance descriptors of the type specified by the instanceDescriptorType property
     */
    @Generated
    @Selector("instanceDescriptorBuffer")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    public native MTLBuffer instanceDescriptorBuffer();

    /**
     * Offset into the instance descriptor buffer. Must be a multiple of 64 bytes and must be
     * aligned to the platform's buffer offset alignment.
     */
    @Generated
    @Selector("instanceDescriptorBufferOffset")
    @NUInt
    public native long instanceDescriptorBufferOffset();

    /**
     * Stride, in bytes, between instance descriptors in the instance descriptor buffer. Must
     * be at least the size of the instance descriptor type and must be a multiple of 4 bytes.
     * Defaults to the size of the instance descriptor type.
     */
    @Generated
    @Selector("instanceDescriptorStride")
    @NUInt
    public native long instanceDescriptorStride();

    /**
     * Type of instance descriptor in the instance descriptor buffer. Defaults to
     * MTLAccelerationStructureInstanceDescriptorTypeIndirect. Must be
     * MTLAccelerationStructureInstanceDescriptorTypeIndirect or
     * MTLAccelerationStructureInstanceDescriptorTypeIndirectMotion.
     */
    @Generated
    @Selector("instanceDescriptorType")
    @NUInt
    public native long instanceDescriptorType();

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

    /**
     * Maximum number of instance descriptors
     */
    @Generated
    @Selector("maxInstanceCount")
    @NUInt
    public native long maxInstanceCount();

    /**
     * Maximum number of motion transforms
     */
    @Generated
    @Selector("maxMotionTransformCount")
    @NUInt
    public native long maxMotionTransformCount();

    /**
     * Buffer containing transformation information for motion
     */
    @Generated
    @Selector("motionTransformBuffer")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    public native MTLBuffer motionTransformBuffer();

    /**
     * Offset into the instance motion descriptor buffer. Must be a multiple of 64 bytes and
     * must be aligned to the platform's buffer offset alignment.
     */
    @Generated
    @Selector("motionTransformBufferOffset")
    @NUInt
    public native long motionTransformBufferOffset();

    /**
     * Buffer containing the motion transform count as a uint32_t value. Value at build time
     * must be less than or equal to maxMotionTransformCount.
     */
    @Generated
    @Selector("motionTransformCountBuffer")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    public native MTLBuffer motionTransformCountBuffer();

    /**
     * Offset into the motion transform count buffer. Must be a multiple of 4 bytes and must be
     * aligned to the platform's buffer offset alignment.
     */
    @Generated
    @Selector("motionTransformCountBufferOffset")
    @NUInt
    public native long motionTransformCountBufferOffset();

    @Generated
    @Owned
    @Selector("new")
    public static native MTLIndirectInstanceAccelerationStructureDescriptor new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Buffer containing the instance count as a uint32_t value. Value at build time
     * must be less than or equal to maxInstanceCount.
     */
    @Generated
    @Selector("setInstanceCountBuffer:")
    public native void setInstanceCountBuffer(@Mapped(ObjCObjectMapper.class) @Nullable MTLBuffer value);

    /**
     * Offset into the instance count buffer. Must be a multiple of 4 bytes and must be
     * aligned to the platform's buffer offset alignment.
     */
    @Generated
    @Selector("setInstanceCountBufferOffset:")
    public native void setInstanceCountBufferOffset(@NUInt long value);

    /**
     * Buffer containing instance descriptors of the type specified by the instanceDescriptorType property
     */
    @Generated
    @Selector("setInstanceDescriptorBuffer:")
    public native void setInstanceDescriptorBuffer(@Mapped(ObjCObjectMapper.class) @Nullable MTLBuffer value);

    /**
     * Offset into the instance descriptor buffer. Must be a multiple of 64 bytes and must be
     * aligned to the platform's buffer offset alignment.
     */
    @Generated
    @Selector("setInstanceDescriptorBufferOffset:")
    public native void setInstanceDescriptorBufferOffset(@NUInt long value);

    /**
     * Stride, in bytes, between instance descriptors in the instance descriptor buffer. Must
     * be at least the size of the instance descriptor type and must be a multiple of 4 bytes.
     * Defaults to the size of the instance descriptor type.
     */
    @Generated
    @Selector("setInstanceDescriptorStride:")
    public native void setInstanceDescriptorStride(@NUInt long value);

    /**
     * Type of instance descriptor in the instance descriptor buffer. Defaults to
     * MTLAccelerationStructureInstanceDescriptorTypeIndirect. Must be
     * MTLAccelerationStructureInstanceDescriptorTypeIndirect or
     * MTLAccelerationStructureInstanceDescriptorTypeIndirectMotion.
     */
    @Generated
    @Selector("setInstanceDescriptorType:")
    public native void setInstanceDescriptorType(@NUInt long value);

    /**
     * Maximum number of instance descriptors
     */
    @Generated
    @Selector("setMaxInstanceCount:")
    public native void setMaxInstanceCount(@NUInt long value);

    /**
     * Maximum number of motion transforms
     */
    @Generated
    @Selector("setMaxMotionTransformCount:")
    public native void setMaxMotionTransformCount(@NUInt long value);

    /**
     * Buffer containing transformation information for motion
     */
    @Generated
    @Selector("setMotionTransformBuffer:")
    public native void setMotionTransformBuffer(@Mapped(ObjCObjectMapper.class) @Nullable MTLBuffer value);

    /**
     * Offset into the instance motion descriptor buffer. Must be a multiple of 64 bytes and
     * must be aligned to the platform's buffer offset alignment.
     */
    @Generated
    @Selector("setMotionTransformBufferOffset:")
    public native void setMotionTransformBufferOffset(@NUInt long value);

    /**
     * Buffer containing the motion transform count as a uint32_t value. Value at build time
     * must be less than or equal to maxMotionTransformCount.
     */
    @Generated
    @Selector("setMotionTransformCountBuffer:")
    public native void setMotionTransformCountBuffer(@Mapped(ObjCObjectMapper.class) @Nullable MTLBuffer value);

    /**
     * Offset into the motion transform count buffer. Must be a multiple of 4 bytes and must be
     * aligned to the platform's buffer offset alignment.
     */
    @Generated
    @Selector("setMotionTransformCountBufferOffset:")
    public native void setMotionTransformCountBufferOffset(@NUInt long value);

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