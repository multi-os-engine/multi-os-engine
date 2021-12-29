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

/**
 * Descriptor for an instance acceleration structure
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
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

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
     */
    @Generated
    @Selector("instanceCount")
    @NUInt
    public native long instanceCount();

    /**
     * Buffer containing instance descriptors of the type specified by the instanceDescriptorType property
     */
    @Generated
    @Selector("instanceDescriptorBuffer")
    @MappedReturn(ObjCObjectMapper.class)
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

    @Generated
    @Selector("instanceMethodForSelector:")
    @FunctionPtr(name = "call_instanceMethodForSelector_ret")
    public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(SEL aSelector);

    @Generated
    @Selector("instanceMethodSignatureForSelector:")
    public static native NSMethodSignature instanceMethodSignatureForSelector(SEL aSelector);

    /**
     * Acceleration structures to be instanced
     */
    @Generated
    @Selector("instancedAccelerationStructures")
    public native NSArray<?> instancedAccelerationStructures();

    @Generated
    @Selector("instancesRespondToSelector:")
    public static native boolean instancesRespondToSelector(SEL aSelector);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

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
     */
    @Generated
    @Selector("setInstanceCount:")
    public native void setInstanceCount(@NUInt long value);

    /**
     * Buffer containing instance descriptors of the type specified by the instanceDescriptorType property
     */
    @Generated
    @Selector("setInstanceDescriptorBuffer:")
    public native void setInstanceDescriptorBuffer(@Mapped(ObjCObjectMapper.class) MTLBuffer value);

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
     * Acceleration structures to be instanced
     */
    @Generated
    @Selector("setInstancedAccelerationStructures:")
    public native void setInstancedAccelerationStructures(NSArray<?> value);

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
     */
    @Generated
    @Selector("instanceDescriptorType")
    @NUInt
    public native long instanceDescriptorType();

    /**
     * Buffer containing transformation information for motion
     */
    @Generated
    @Selector("motionTransformBuffer")
    @MappedReturn(ObjCObjectMapper.class)
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
     * Number of motion transforms
     */
    @Generated
    @Selector("motionTransformCount")
    @NUInt
    public native long motionTransformCount();

    /**
     * Type of instance descriptor in the instance descriptor buffer. Defaults to
     * MTLAccelerationStructureInstanceDescriptorTypeDefault.
     */
    @Generated
    @Selector("setInstanceDescriptorType:")
    public native void setInstanceDescriptorType(@NUInt long value);

    /**
     * Buffer containing transformation information for motion
     */
    @Generated
    @Selector("setMotionTransformBuffer:")
    public native void setMotionTransformBuffer(@Mapped(ObjCObjectMapper.class) MTLBuffer value);

    /**
     * Offset into the instance motion descriptor buffer. Must be a multiple of 64 bytes and
     * must be aligned to the platform's buffer offset alignment.
     */
    @Generated
    @Selector("setMotionTransformBufferOffset:")
    public native void setMotionTransformBufferOffset(@NUInt long value);

    /**
     * Number of motion transforms
     */
    @Generated
    @Selector("setMotionTransformCount:")
    public native void setMotionTransformCount(@NUInt long value);
}
