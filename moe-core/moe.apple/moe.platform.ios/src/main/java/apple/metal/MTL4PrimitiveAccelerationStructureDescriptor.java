package apple.metal;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
 * Descriptor for a primitive acceleration structure that directly references geometric shapes, such as triangles and
 * bounding boxes.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTL4PrimitiveAccelerationStructureDescriptor extends MTL4AccelerationStructureDescriptor {
    static {
        NatJ.register();
    }

    @Generated
    protected MTL4PrimitiveAccelerationStructureDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTL4PrimitiveAccelerationStructureDescriptor alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTL4PrimitiveAccelerationStructureDescriptor allocWithZone(VoidPtr zone);

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

    /**
     * Associates the array of geometry descriptors that comprise this primitive acceleration structure.
     * 
     * If you enable keyframe motion by setting property ``motionKeyframeCount`` to a value greater than `1`, then
     * all geometry descriptors this array references need to be motion geometry descriptors and have a number of
     * primitive buffers equals to ``motionKeyframeCount``.
     * 
     * Example of motion geometry descriptors include: ``MTL4AccelerationStructureMotionTriangleGeometryDescriptor``,
     * ``MTL4AccelerationStructureMotionBoundingBoxGeometryDescriptor``,
     * ``MTL4AccelerationStructureMotionCurveGeometryDescriptor``.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("geometryDescriptors")
    @Nullable
    public native NSArray<? extends MTL4AccelerationStructureGeometryDescriptor> geometryDescriptors();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MTL4PrimitiveAccelerationStructureDescriptor init();

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
     * Configures the motion border mode.
     * 
     * This property controls what happens if Metal samples the acceleration structure after ``motionEndTime``.
     * 
     * Its default value is `MTLMotionBorderModeClamp`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("motionEndBorderMode")
    public native int motionEndBorderMode();

    /**
     * Configures the motion end time for this geometry.
     * 
     * The default value of this property is `1.0f`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("motionEndTime")
    public native float motionEndTime();

    /**
     * Sets the motion keyframe count.
     * 
     * This property's default is `1`, indicating no motion.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("motionKeyframeCount")
    @NUInt
    public native long motionKeyframeCount();

    /**
     * Configures the behavior when the ray-tracing system samples the acceleration structure before the motion start
     * time.
     * 
     * Use this property to control the behavior when the ray-tracing system samples the acceleration structure
     * at a time prior to the one you set for ``motionStartTime``.
     * 
     * The default value of this property is `MTLMotionBorderModeClamp`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("motionStartBorderMode")
    public native int motionStartBorderMode();

    /**
     * Configures the motion start time for this geometry.
     * 
     * The default value of this property is `0.0f`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("motionStartTime")
    public native float motionStartTime();

    @Generated
    @Owned
    @Selector("new")
    public static native MTL4PrimitiveAccelerationStructureDescriptor new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Associates the array of geometry descriptors that comprise this primitive acceleration structure.
     * 
     * If you enable keyframe motion by setting property ``motionKeyframeCount`` to a value greater than `1`, then
     * all geometry descriptors this array references need to be motion geometry descriptors and have a number of
     * primitive buffers equals to ``motionKeyframeCount``.
     * 
     * Example of motion geometry descriptors include: ``MTL4AccelerationStructureMotionTriangleGeometryDescriptor``,
     * ``MTL4AccelerationStructureMotionBoundingBoxGeometryDescriptor``,
     * ``MTL4AccelerationStructureMotionCurveGeometryDescriptor``.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setGeometryDescriptors:")
    public native void setGeometryDescriptors(
            @Nullable NSArray<? extends MTL4AccelerationStructureGeometryDescriptor> value);

    /**
     * Configures the motion border mode.
     * 
     * This property controls what happens if Metal samples the acceleration structure after ``motionEndTime``.
     * 
     * Its default value is `MTLMotionBorderModeClamp`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setMotionEndBorderMode:")
    public native void setMotionEndBorderMode(int value);

    /**
     * Configures the motion end time for this geometry.
     * 
     * The default value of this property is `1.0f`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setMotionEndTime:")
    public native void setMotionEndTime(float value);

    /**
     * Sets the motion keyframe count.
     * 
     * This property's default is `1`, indicating no motion.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setMotionKeyframeCount:")
    public native void setMotionKeyframeCount(@NUInt long value);

    /**
     * Configures the behavior when the ray-tracing system samples the acceleration structure before the motion start
     * time.
     * 
     * Use this property to control the behavior when the ray-tracing system samples the acceleration structure
     * at a time prior to the one you set for ``motionStartTime``.
     * 
     * The default value of this property is `MTLMotionBorderModeClamp`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setMotionStartBorderMode:")
    public native void setMotionStartBorderMode(int value);

    /**
     * Configures the motion start time for this geometry.
     * 
     * The default value of this property is `0.0f`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setMotionStartTime:")
    public native void setMotionStartTime(float value);

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