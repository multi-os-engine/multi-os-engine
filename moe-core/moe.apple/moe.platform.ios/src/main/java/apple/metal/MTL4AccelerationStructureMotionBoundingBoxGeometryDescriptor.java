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
 * Describes motion bounding box geometry, suitable for motion ray tracing.
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
public class MTL4AccelerationStructureMotionBoundingBoxGeometryDescriptor extends
        MTL4AccelerationStructureGeometryDescriptor {
    static {
        NatJ.register();
    }

    @Generated
    protected MTL4AccelerationStructureMotionBoundingBoxGeometryDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTL4AccelerationStructureMotionBoundingBoxGeometryDescriptor alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTL4AccelerationStructureMotionBoundingBoxGeometryDescriptor allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * Configures a reference to a buffer where each entry contains a reference to a buffer of bounding boxes.
     * 
     * This property references a buffer that conceptually represents an array with one entry for each keyframe in the
     * motion animation. Each one of these entries consists of a ``MTL4BufferRange`` that, in turn, references a
     * vertex buffer containing the bounding box data for the keyframe.
     * 
     * You are responsible for ensuring the buffer address is not zero for the top-level buffer, as well as for all
     * the vertex buffers it references.
     * 
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("boundingBoxBuffers")
    @ByValue
    public native MTL4BufferRange boundingBoxBuffers();

    /**
     * Declares the number of bounding boxes in each buffer that `boundingBoxBuffer` references.
     * 
     * All keyframes share the same bounding box count.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("boundingBoxCount")
    @NUInt
    public native long boundingBoxCount();

    /**
     * Declares the stride, in bytes, between bounding boxes in the bounding box buffers each entry in
     * `boundingBoxBuffer`
     * references.
     * 
     * All keyframes share the same bounding box stride. You are responsible for ensuring this stride is at least 24
     * bytes
     * and a multiple of 4 bytes.
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
    public native MTL4AccelerationStructureMotionBoundingBoxGeometryDescriptor init();

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
    public static native MTL4AccelerationStructureMotionBoundingBoxGeometryDescriptor new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Configures a reference to a buffer where each entry contains a reference to a buffer of bounding boxes.
     * 
     * This property references a buffer that conceptually represents an array with one entry for each keyframe in the
     * motion animation. Each one of these entries consists of a ``MTL4BufferRange`` that, in turn, references a
     * vertex buffer containing the bounding box data for the keyframe.
     * 
     * You are responsible for ensuring the buffer address is not zero for the top-level buffer, as well as for all
     * the vertex buffers it references.
     * 
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setBoundingBoxBuffers:")
    public native void setBoundingBoxBuffers(@ByValue MTL4BufferRange value);

    /**
     * Declares the number of bounding boxes in each buffer that `boundingBoxBuffer` references.
     * 
     * All keyframes share the same bounding box count.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setBoundingBoxCount:")
    public native void setBoundingBoxCount(@NUInt long value);

    /**
     * Declares the stride, in bytes, between bounding boxes in the bounding box buffers each entry in
     * `boundingBoxBuffer`
     * references.
     * 
     * All keyframes share the same bounding box stride. You are responsible for ensuring this stride is at least 24
     * bytes
     * and a multiple of 4 bytes.
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