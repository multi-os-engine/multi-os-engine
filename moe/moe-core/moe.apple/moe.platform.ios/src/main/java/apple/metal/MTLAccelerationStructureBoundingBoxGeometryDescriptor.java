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
 * @brief Descriptor for bounding box geometry
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTLAccelerationStructureBoundingBoxGeometryDescriptor extends MTLAccelerationStructureGeometryDescriptor {
    static {
        NatJ.register();
    }

    @Generated
    protected MTLAccelerationStructureBoundingBoxGeometryDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTLAccelerationStructureBoundingBoxGeometryDescriptor alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * @brief Bounding box buffer containing MTLAxisAlignedBoundingBoxes. Must not be nil.
     */
    @Generated
    @Selector("boundingBoxBuffer")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLBuffer boundingBoxBuffer();

    /**
     * @brief Bounding box buffer offset. Must be a multiple of the bounding box stride and must be
     * aligned to the platform's buffer offset alignment.
     */
    @Generated
    @Selector("boundingBoxBufferOffset")
    @NUInt
    public native long boundingBoxBufferOffset();

    /**
     * @brief Number of bounding boxes
     */
    @Generated
    @Selector("boundingBoxCount")
    @NUInt
    public native long boundingBoxCount();

    /**
     * @brief Stride, in bytes, between bounding boxes in the bounding box buffer. Must be at least 24
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
    public static native MTLAccelerationStructureBoundingBoxGeometryDescriptor descriptor();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MTLAccelerationStructureBoundingBoxGeometryDescriptor init();

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
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * @brief Bounding box buffer containing MTLAxisAlignedBoundingBoxes. Must not be nil.
     */
    @Generated
    @Selector("setBoundingBoxBuffer:")
    public native void setBoundingBoxBuffer(@Mapped(ObjCObjectMapper.class) MTLBuffer value);

    /**
     * @brief Bounding box buffer offset. Must be a multiple of the bounding box stride and must be
     * aligned to the platform's buffer offset alignment.
     */
    @Generated
    @Selector("setBoundingBoxBufferOffset:")
    public native void setBoundingBoxBufferOffset(@NUInt long value);

    /**
     * @brief Number of bounding boxes
     */
    @Generated
    @Selector("setBoundingBoxCount:")
    public native void setBoundingBoxCount(@NUInt long value);

    /**
     * @brief Stride, in bytes, between bounding boxes in the bounding box buffer. Must be at least 24
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