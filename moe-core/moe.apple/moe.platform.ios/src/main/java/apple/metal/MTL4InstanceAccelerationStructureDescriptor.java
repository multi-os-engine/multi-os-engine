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
 * Descriptor for an instance acceleration structure.
 * 
 * An instance acceleration structure references other acceleration structures, and provides the ability to
 * "instantiate" them multiple times, each one with potentially a different transformation matrix.
 * 
 * You specify the properties of the instances in the acceleration structure this descriptor builds by providing a
 * buffer of `structs` via its ``instanceDescriptorBuffer`` property.
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
public class MTL4InstanceAccelerationStructureDescriptor extends MTL4AccelerationStructureDescriptor {
    static {
        NatJ.register();
    }

    @Generated
    protected MTL4InstanceAccelerationStructureDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTL4InstanceAccelerationStructureDescriptor alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTL4InstanceAccelerationStructureDescriptor allocWithZone(VoidPtr zone);

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
    public native MTL4InstanceAccelerationStructureDescriptor init();

    /**
     * Controls the number of instance descriptors in the instance descriptor buffer references.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("instanceCount")
    @NUInt
    public native long instanceCount();

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
     * Sets the stride, in bytes, between instance descriptors the instance descriptor buffer references.
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
     * Sets the type of instance descriptor that the instance descriptor buffer references.
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
     * Controls the total number of motion transforms in the motion transform buffer.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("motionTransformCount")
    @NUInt
    public native long motionTransformCount();

    /**
     * Specify the stride for motion transform.
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
     * Controls the type of motion transforms, either as a matrix or individual components.
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
    public static native MTL4InstanceAccelerationStructureDescriptor new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Controls the number of instance descriptors in the instance descriptor buffer references.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setInstanceCount:")
    public native void setInstanceCount(@NUInt long value);

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
     * Sets the stride, in bytes, between instance descriptors the instance descriptor buffer references.
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
     * Sets the type of instance descriptor that the instance descriptor buffer references.
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
     * Controls the total number of motion transforms in the motion transform buffer.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setMotionTransformCount:")
    public native void setMotionTransformCount(@NUInt long value);

    /**
     * Specify the stride for motion transform.
     * 
     * Defaults to `0`, indicating that transforms are tightly packed according to the motion transform type.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setMotionTransformStride:")
    public native void setMotionTransformStride(@NUInt long value);

    /**
     * Controls the type of motion transforms, either as a matrix or individual components.
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