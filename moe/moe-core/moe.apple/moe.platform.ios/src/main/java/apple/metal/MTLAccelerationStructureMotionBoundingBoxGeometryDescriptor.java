package apple.metal;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
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
 * Descriptor for motion bounding box geometry
 * 
 * API-Since: 15.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTLAccelerationStructureMotionBoundingBoxGeometryDescriptor extends
        MTLAccelerationStructureGeometryDescriptor {
    static {
        NatJ.register();
    }

    @Generated
    protected MTLAccelerationStructureMotionBoundingBoxGeometryDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTLAccelerationStructureMotionBoundingBoxGeometryDescriptor alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MTLAccelerationStructureMotionBoundingBoxGeometryDescriptor allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * Bounding box buffer containing MTLAxisAlignedBoundingBoxes similar to what
     * MTLAccelerationStructureBoundingBoxGeometryDescriptor has but array of the values.
     */
    @Generated
    @Selector("boundingBoxBuffers")
    public native NSArray<? extends MTLMotionKeyframeData> boundingBoxBuffers();

    /**
     * Number of bounding boxes
     */
    @Generated
    @Selector("boundingBoxCount")
    @NUInt
    public native long boundingBoxCount();

    /**
     * Stride, in bytes, between bounding boxes in the bounding box buffer. Must be at least 24
     * bytes and must be a multiple of 4 bytes. Defaults to 24 bytes.
     */
    @Generated
    @Selector("boundingBoxStride")
    @NUInt
    public native long boundingBoxStride();

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
    public static native MTLAccelerationStructureMotionBoundingBoxGeometryDescriptor descriptor();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MTLAccelerationStructureMotionBoundingBoxGeometryDescriptor init();

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
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native MTLAccelerationStructureMotionBoundingBoxGeometryDescriptor new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Bounding box buffer containing MTLAxisAlignedBoundingBoxes similar to what
     * MTLAccelerationStructureBoundingBoxGeometryDescriptor has but array of the values.
     */
    @Generated
    @Selector("setBoundingBoxBuffers:")
    public native void setBoundingBoxBuffers(NSArray<? extends MTLMotionKeyframeData> value);

    /**
     * Number of bounding boxes
     */
    @Generated
    @Selector("setBoundingBoxCount:")
    public native void setBoundingBoxCount(@NUInt long value);

    /**
     * Stride, in bytes, between bounding boxes in the bounding box buffer. Must be at least 24
     * bytes and must be a multiple of 4 bytes. Defaults to 24 bytes.
     */
    @Generated
    @Selector("setBoundingBoxStride:")
    public native void setBoundingBoxStride(@NUInt long value);

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
}
