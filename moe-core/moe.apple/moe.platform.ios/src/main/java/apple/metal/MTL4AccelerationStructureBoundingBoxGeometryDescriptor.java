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
 * Describes bounding-box geometry suitable for ray tracing.
 * 
 * You use bounding boxes to implement procedural geometry for ray tracing, such as spheres or any other shape
 * you define by using intersection functions.
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
public class MTL4AccelerationStructureBoundingBoxGeometryDescriptor extends
        MTL4AccelerationStructureGeometryDescriptor {
    static {
        NatJ.register();
    }

    @Generated
    protected MTL4AccelerationStructureBoundingBoxGeometryDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTL4AccelerationStructureBoundingBoxGeometryDescriptor alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTL4AccelerationStructureBoundingBoxGeometryDescriptor allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * References a buffer containing bounding box data in `MTLAxisAlignedBoundingBoxes` format.
     * 
     * You are responsible for ensuring the buffer address of the range is not zero.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("boundingBoxBuffer")
    @ByValue
    public native MTL4BufferRange boundingBoxBuffer();

    /**
     * Describes the number of bounding boxes the `boundingBoxBuffer` contains.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("boundingBoxCount")
    @NUInt
    public native long boundingBoxCount();

    /**
     * Assigns the stride, in bytes, between bounding boxes in the bounding box buffer `boundingBoxBuffer` references.
     * 
     * You are responsible for ensuring this stride is at least 24 bytes and a multiple of 4 bytes.
     * 
     * This property defaults to `24` bytes.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("boundingBoxStride")
    @NUInt
    public native long boundingBoxStride();

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
    public native MTL4AccelerationStructureBoundingBoxGeometryDescriptor init();

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
    public static native MTL4AccelerationStructureBoundingBoxGeometryDescriptor new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * References a buffer containing bounding box data in `MTLAxisAlignedBoundingBoxes` format.
     * 
     * You are responsible for ensuring the buffer address of the range is not zero.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setBoundingBoxBuffer:")
    public native void setBoundingBoxBuffer(@ByValue MTL4BufferRange value);

    /**
     * Describes the number of bounding boxes the `boundingBoxBuffer` contains.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setBoundingBoxCount:")
    public native void setBoundingBoxCount(@NUInt long value);

    /**
     * Assigns the stride, in bytes, between bounding boxes in the bounding box buffer `boundingBoxBuffer` references.
     * 
     * You are responsible for ensuring this stride is at least 24 bytes and a multiple of 4 bytes.
     * 
     * This property defaults to `24` bytes.
     * 
     * API-Since: 26.0
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
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}