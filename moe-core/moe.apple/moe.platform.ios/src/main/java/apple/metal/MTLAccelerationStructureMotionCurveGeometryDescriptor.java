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
 * Acceleration structure motion geometry descriptor describing
 * geometry made of curve primitives
 * 
 * API-Since: 17.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTLAccelerationStructureMotionCurveGeometryDescriptor extends MTLAccelerationStructureGeometryDescriptor {
    static {
        NatJ.register();
    }

    @Generated
    protected MTLAccelerationStructureMotionCurveGeometryDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTLAccelerationStructureMotionCurveGeometryDescriptor alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTLAccelerationStructureMotionCurveGeometryDescriptor allocWithZone(VoidPtr zone);

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

    /**
     * Buffers containing curve control points for each keyframe.
     * Each control point must be of the format specified by the control
     * point format. Buffer offsets musts be multiples of the control
     * point format's element size and must be aligned to the platform's
     * buffer offset alignment. Must not be nil when the acceleration
     * structure is built.
     */
    @Generated
    @Selector("controlPointBuffers")
    @NotNull
    public native NSArray<? extends MTLMotionKeyframeData> controlPointBuffers();

    /**
     * Number of control points in the control point buffers
     */
    @Generated
    @Selector("controlPointCount")
    @NUInt
    public native long controlPointCount();

    /**
     * Format of the control points in the control point buffer.
     * Defaults to MTLAttributeFormatFloat3 (packed).
     */
    @Generated
    @Selector("controlPointFormat")
    @NUInt
    public native long controlPointFormat();

    /**
     * Stride, in bytes, between control points in the control point
     * buffer. Must be a multiple of the control point format's element size
     * and must be at least the control point format's size. Defaults to 0
     * bytes, indicating that the control points are tightly packed.
     */
    @Generated
    @Selector("controlPointStride")
    @NUInt
    public native long controlPointStride();

    /**
     * Curve basis. Defaults to MTLCurveBasisBSpline.
     */
    @Generated
    @Selector("curveBasis")
    @NInt
    public native long curveBasis();

    /**
     * Type of curve end caps. Defaults to MTLCurveEndCapsNone.
     */
    @Generated
    @Selector("curveEndCaps")
    @NInt
    public native long curveEndCaps();

    /**
     * Curve type. Defaults to MTLCurveTypeRound.
     */
    @Generated
    @Selector("curveType")
    @NInt
    public native long curveType();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("descriptor")
    public static native MTLAccelerationStructureMotionCurveGeometryDescriptor descriptor();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * Index buffer containing references to control points in the control
     * point buffer. Must not be nil.
     */
    @Generated
    @Selector("indexBuffer")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    public native MTLBuffer indexBuffer();

    /**
     * Index buffer offset. Must be a multiple of the index data type
     * size and must be aligned to both the index data type's alignment and
     * the platform's buffer offset alignment.
     */
    @Generated
    @Selector("indexBufferOffset")
    @NUInt
    public native long indexBufferOffset();

    /**
     * Index type
     */
    @Generated
    @Selector("indexType")
    @NUInt
    public native long indexType();

    @Generated
    @Selector("init")
    public native MTLAccelerationStructureMotionCurveGeometryDescriptor init();

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
    public static native MTLAccelerationStructureMotionCurveGeometryDescriptor new_objc();

    /**
     * Buffers containing the curve radius for each control point for
     * each keyframe. Each radius must be of the type specified by the radius
     * format. Buffer offsets must be multiples of the radius format size
     * and must be aligned to the platform's buffer offset alignment. Each radius
     * must be at least zero. Must not be nil when the acceleration structure
     * is built.
     */
    @Generated
    @Selector("radiusBuffers")
    @NotNull
    public native NSArray<? extends MTLMotionKeyframeData> radiusBuffers();

    /**
     * Format of the radii in the radius buffer. Defaults to
     * MTLAttributeFormatFloat.
     */
    @Generated
    @Selector("radiusFormat")
    @NUInt
    public native long radiusFormat();

    /**
     * Stride, in bytes, between radii in the radius buffer. Must be
     * a multiple of 4 bytes. Defaults to 4 bytes.
     */
    @Generated
    @Selector("radiusStride")
    @NUInt
    public native long radiusStride();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Number of control points per curve segment. Must be 2, 3, or 4.
     */
    @Generated
    @Selector("segmentControlPointCount")
    @NUInt
    public native long segmentControlPointCount();

    /**
     * Number of curve segments
     */
    @Generated
    @Selector("segmentCount")
    @NUInt
    public native long segmentCount();

    /**
     * Buffers containing curve control points for each keyframe.
     * Each control point must be of the format specified by the control
     * point format. Buffer offsets musts be multiples of the control
     * point format's element size and must be aligned to the platform's
     * buffer offset alignment. Must not be nil when the acceleration
     * structure is built.
     */
    @Generated
    @Selector("setControlPointBuffers:")
    public native void setControlPointBuffers(@NotNull NSArray<? extends MTLMotionKeyframeData> value);

    /**
     * Number of control points in the control point buffers
     */
    @Generated
    @Selector("setControlPointCount:")
    public native void setControlPointCount(@NUInt long value);

    /**
     * Format of the control points in the control point buffer.
     * Defaults to MTLAttributeFormatFloat3 (packed).
     */
    @Generated
    @Selector("setControlPointFormat:")
    public native void setControlPointFormat(@NUInt long value);

    /**
     * Stride, in bytes, between control points in the control point
     * buffer. Must be a multiple of the control point format's element size
     * and must be at least the control point format's size. Defaults to 0
     * bytes, indicating that the control points are tightly packed.
     */
    @Generated
    @Selector("setControlPointStride:")
    public native void setControlPointStride(@NUInt long value);

    /**
     * Curve basis. Defaults to MTLCurveBasisBSpline.
     */
    @Generated
    @Selector("setCurveBasis:")
    public native void setCurveBasis(@NInt long value);

    /**
     * Type of curve end caps. Defaults to MTLCurveEndCapsNone.
     */
    @Generated
    @Selector("setCurveEndCaps:")
    public native void setCurveEndCaps(@NInt long value);

    /**
     * Curve type. Defaults to MTLCurveTypeRound.
     */
    @Generated
    @Selector("setCurveType:")
    public native void setCurveType(@NInt long value);

    /**
     * Index buffer containing references to control points in the control
     * point buffer. Must not be nil.
     */
    @Generated
    @Selector("setIndexBuffer:")
    public native void setIndexBuffer(@Mapped(ObjCObjectMapper.class) @Nullable MTLBuffer value);

    /**
     * Index buffer offset. Must be a multiple of the index data type
     * size and must be aligned to both the index data type's alignment and
     * the platform's buffer offset alignment.
     */
    @Generated
    @Selector("setIndexBufferOffset:")
    public native void setIndexBufferOffset(@NUInt long value);

    /**
     * Index type
     */
    @Generated
    @Selector("setIndexType:")
    public native void setIndexType(@NUInt long value);

    /**
     * Buffers containing the curve radius for each control point for
     * each keyframe. Each radius must be of the type specified by the radius
     * format. Buffer offsets must be multiples of the radius format size
     * and must be aligned to the platform's buffer offset alignment. Each radius
     * must be at least zero. Must not be nil when the acceleration structure
     * is built.
     */
    @Generated
    @Selector("setRadiusBuffers:")
    public native void setRadiusBuffers(@NotNull NSArray<? extends MTLMotionKeyframeData> value);

    /**
     * Format of the radii in the radius buffer. Defaults to
     * MTLAttributeFormatFloat.
     */
    @Generated
    @Selector("setRadiusFormat:")
    public native void setRadiusFormat(@NUInt long value);

    /**
     * Stride, in bytes, between radii in the radius buffer. Must be
     * a multiple of 4 bytes. Defaults to 4 bytes.
     */
    @Generated
    @Selector("setRadiusStride:")
    public native void setRadiusStride(@NUInt long value);

    /**
     * Number of control points per curve segment. Must be 2, 3, or 4.
     */
    @Generated
    @Selector("setSegmentControlPointCount:")
    public native void setSegmentControlPointCount(@NUInt long value);

    /**
     * Number of curve segments
     */
    @Generated
    @Selector("setSegmentCount:")
    public native void setSegmentCount(@NUInt long value);

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