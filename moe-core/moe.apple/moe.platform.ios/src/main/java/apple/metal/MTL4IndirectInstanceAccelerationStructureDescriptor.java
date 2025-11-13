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
 * Descriptor for an "indirect" instance acceleration structure that allows providing the instance count and
 * motion transform count indirectly, through buffer references.
 * 
 * An instance acceleration structure references other acceleration structures, and provides the ability to
 * "instantiate" them multiple times, each one with potentially a different transformation matrix.
 * 
 * You specify the properties of the instances in the acceleration structure this descriptor builds by providing a
 * buffer of `structs` via its ``instanceDescriptorBuffer`` property.
 * 
 * Compared to ``MTL4InstanceAccelerationStructureDescriptor``, this descriptor allows you to provide the number
 * of instances it references indirectly through a buffer reference, as well as the number of motion transforms.
 * 
 * This enables you to determine these counts indirectly in the GPU timeline via a compute pipeline.
 * Metal needs only to know the maximum possible number of instances and motion transforms to support,
 * which you specify via the ``maxInstanceCount`` and ``maxMotionTransformCount`` properties.
 * 
 * Use a ``MTLResidencySet`` to mark residency of all buffers and acceleration structures this descriptor references
 * when you build this acceleration structure.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTL4IndirectInstanceAccelerationStructureDescriptor extends MTL4AccelerationStructureDescriptor {
    static {
        NatJ.register();
    }

    @Generated
    protected MTL4IndirectInstanceAccelerationStructureDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTL4IndirectInstanceAccelerationStructureDescriptor alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTL4IndirectInstanceAccelerationStructureDescriptor allocWithZone(VoidPtr zone);

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

    @Generated
    @Selector("init")
    public native MTL4IndirectInstanceAccelerationStructureDescriptor init();

    /**
     * Provides a reference to a buffer containing the number of instances in the instance descriptor buffer, formatted
     * as a
     * 32-bit unsigned integer.
     * 
     * You are responsible for ensuring that the final number of instances at build time, which you provide indirectly
     * via this buffer reference , is less than or equal to the value of property ``maxInstanceCount``.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("instanceCountBuffer")
    @ByValue
    public native MTL4BufferRange instanceCountBuffer();

    /**
     * Assigns a reference to a buffer containing instance descriptors for acceleration structures to reference.
     * 
     * This buffer conceptually represents an array of instance data. The specific format for the structs that comprise
     * each entry depends on the value of the ``instanceDescriptorType`` property.
     * 
     * You are responsible for ensuring the buffer address the range contains is not zero.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("instanceDescriptorBuffer")
    @ByValue
    public native MTL4BufferRange instanceDescriptorBuffer();

    /**
     * Sets the stride, in bytes, between instance descriptors in the instance descriptor buffer.
     * 
     * You are responsible for ensuring this stride is at least the size of the structure type corresponding to the
     * instance
     * descriptor type and a multiple of 4 bytes.
     * 
     * Defaults to `0`, indicating the instance descriptors are tightly packed.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("instanceDescriptorStride")
    @NUInt
    public native long instanceDescriptorStride();

    /**
     * Controls the type of instance descriptor that the instance descriptor buffer references.
     * 
     * This value determines the layout Metal expects for the structs the instance descriptor buffer contains.
     * 
     * Defaults to `MTLAccelerationStructureInstanceDescriptorTypeIndirect`. Valid values for this property are
     * `MTLAccelerationStructureInstanceDescriptorTypeIndirect` or
     * `MTLAccelerationStructureInstanceDescriptorTypeIndirectMotion`.
     * 
     * API-Since: 26.0
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

    /**
     * Specifies the layout for the transformation matrices in the instance descriptor buffer and the motion
     * transformation matrix buffer.
     * 
     * Metal interprets the value of this property as the layout for the buffers that both ``instanceDescriptorBuffer``
     * and
     * ``motionTransformBuffer`` reference.
     * 
     * Defaults to `MTLMatrixLayoutColumnMajor`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("instanceTransformationMatrixLayout")
    @NInt
    public native long instanceTransformationMatrixLayout();

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
     * Controls the maximum number of instance descriptors the instance descriptor buffer can reference.
     * 
     * You are responsible for ensuring that the final number of instances at build time, which you provide indirectly
     * via a buffer reference in ``instanceCountBuffer``, is less than or equal to this number.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("maxInstanceCount")
    @NUInt
    public native long maxInstanceCount();

    /**
     * Controls the maximum number of motion transforms in the motion transform buffer.
     * 
     * You are responsible for ensuring that final number of motion transforms at build time that the buffer
     * ``motionTransformCountBuffer`` references is less than or equal to this number.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("maxMotionTransformCount")
    @NUInt
    public native long maxMotionTransformCount();

    /**
     * A buffer containing transformation information for instance motion keyframes, formatted according
     * to the motion transform type.
     * 
     * Each instance can have a different number of keyframes that you configure via individual instance
     * descriptors.
     * 
     * You are responsible for ensuring the buffer address the range references is not zero when using motion instance
     * descriptors.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("motionTransformBuffer")
    @ByValue
    public native MTL4BufferRange motionTransformBuffer();

    /**
     * Associates a buffer reference containing the number of motion transforms in the motion transform buffer,
     * formatted as a
     * 32-bit unsigned integer.
     * 
     * You are responsible for ensuring that the final number of motion transforms at build time in the buffer this
     * property
     * references is less than or equal to the value of property ``maxMotionTransformCount``.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("motionTransformCountBuffer")
    @ByValue
    public native MTL4BufferRange motionTransformCountBuffer();

    /**
     * Sets the stride for motion transform.
     * 
     * Defaults to `0`, indicating that transforms are tightly packed according to the motion transform type.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("motionTransformStride")
    @NUInt
    public native long motionTransformStride();

    /**
     * Sets the type of motion transforms, either as a matrix or individual components.
     * 
     * Defaults to `MTLTransformTypePackedFloat4x3`. Using a `MTLTransformTypeComponent` allows you to represent the
     * rotation by a quaternion (instead as of part of the matrix), allowing for correct motion interpolation.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("motionTransformType")
    @NInt
    public native long motionTransformType();

    @Generated
    @Owned
    @Selector("new")
    public static native MTL4IndirectInstanceAccelerationStructureDescriptor new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Provides a reference to a buffer containing the number of instances in the instance descriptor buffer, formatted
     * as a
     * 32-bit unsigned integer.
     * 
     * You are responsible for ensuring that the final number of instances at build time, which you provide indirectly
     * via this buffer reference , is less than or equal to the value of property ``maxInstanceCount``.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setInstanceCountBuffer:")
    public native void setInstanceCountBuffer(@ByValue MTL4BufferRange value);

    /**
     * Assigns a reference to a buffer containing instance descriptors for acceleration structures to reference.
     * 
     * This buffer conceptually represents an array of instance data. The specific format for the structs that comprise
     * each entry depends on the value of the ``instanceDescriptorType`` property.
     * 
     * You are responsible for ensuring the buffer address the range contains is not zero.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setInstanceDescriptorBuffer:")
    public native void setInstanceDescriptorBuffer(@ByValue MTL4BufferRange value);

    /**
     * Sets the stride, in bytes, between instance descriptors in the instance descriptor buffer.
     * 
     * You are responsible for ensuring this stride is at least the size of the structure type corresponding to the
     * instance
     * descriptor type and a multiple of 4 bytes.
     * 
     * Defaults to `0`, indicating the instance descriptors are tightly packed.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setInstanceDescriptorStride:")
    public native void setInstanceDescriptorStride(@NUInt long value);

    /**
     * Controls the type of instance descriptor that the instance descriptor buffer references.
     * 
     * This value determines the layout Metal expects for the structs the instance descriptor buffer contains.
     * 
     * Defaults to `MTLAccelerationStructureInstanceDescriptorTypeIndirect`. Valid values for this property are
     * `MTLAccelerationStructureInstanceDescriptorTypeIndirect` or
     * `MTLAccelerationStructureInstanceDescriptorTypeIndirectMotion`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setInstanceDescriptorType:")
    public native void setInstanceDescriptorType(@NUInt long value);

    /**
     * Specifies the layout for the transformation matrices in the instance descriptor buffer and the motion
     * transformation matrix buffer.
     * 
     * Metal interprets the value of this property as the layout for the buffers that both ``instanceDescriptorBuffer``
     * and
     * ``motionTransformBuffer`` reference.
     * 
     * Defaults to `MTLMatrixLayoutColumnMajor`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setInstanceTransformationMatrixLayout:")
    public native void setInstanceTransformationMatrixLayout(@NInt long value);

    /**
     * Controls the maximum number of instance descriptors the instance descriptor buffer can reference.
     * 
     * You are responsible for ensuring that the final number of instances at build time, which you provide indirectly
     * via a buffer reference in ``instanceCountBuffer``, is less than or equal to this number.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setMaxInstanceCount:")
    public native void setMaxInstanceCount(@NUInt long value);

    /**
     * Controls the maximum number of motion transforms in the motion transform buffer.
     * 
     * You are responsible for ensuring that final number of motion transforms at build time that the buffer
     * ``motionTransformCountBuffer`` references is less than or equal to this number.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setMaxMotionTransformCount:")
    public native void setMaxMotionTransformCount(@NUInt long value);

    /**
     * A buffer containing transformation information for instance motion keyframes, formatted according
     * to the motion transform type.
     * 
     * Each instance can have a different number of keyframes that you configure via individual instance
     * descriptors.
     * 
     * You are responsible for ensuring the buffer address the range references is not zero when using motion instance
     * descriptors.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setMotionTransformBuffer:")
    public native void setMotionTransformBuffer(@ByValue MTL4BufferRange value);

    /**
     * Associates a buffer reference containing the number of motion transforms in the motion transform buffer,
     * formatted as a
     * 32-bit unsigned integer.
     * 
     * You are responsible for ensuring that the final number of motion transforms at build time in the buffer this
     * property
     * references is less than or equal to the value of property ``maxMotionTransformCount``.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setMotionTransformCountBuffer:")
    public native void setMotionTransformCountBuffer(@ByValue MTL4BufferRange value);

    /**
     * Sets the stride for motion transform.
     * 
     * Defaults to `0`, indicating that transforms are tightly packed according to the motion transform type.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setMotionTransformStride:")
    public native void setMotionTransformStride(@NUInt long value);

    /**
     * Sets the type of motion transforms, either as a matrix or individual components.
     * 
     * Defaults to `MTLTransformTypePackedFloat4x3`. Using a `MTLTransformTypeComponent` allows you to represent the
     * rotation by a quaternion (instead as of part of the matrix), allowing for correct motion interpolation.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setMotionTransformType:")
    public native void setMotionTransformType(@NInt long value);

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