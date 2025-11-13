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
 * Describes motion curve geometry, suitable for motion ray tracing.
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
public class MTL4AccelerationStructureMotionCurveGeometryDescriptor extends
        MTL4AccelerationStructureGeometryDescriptor {
    static {
        NatJ.register();
    }

    @Generated
    protected MTL4AccelerationStructureMotionCurveGeometryDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTL4AccelerationStructureMotionCurveGeometryDescriptor alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTL4AccelerationStructureMotionCurveGeometryDescriptor allocWithZone(VoidPtr zone);

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
     * Assigns a reference to a buffer where each entry contains a reference to a buffer of control points.
     * 
     * This property references a buffer that conceptually represents an array with one entry for each keyframe in the
     * motion animation. Each one of these entries consists of a ``MTL4BufferRange`` that, in turn, references a
     * buffer containing the control points corresponding to the keyframe.
     * 
     * You are responsible for ensuring the buffer address is not zero for the top-level buffer, as well as for all
     * the vertex buffers it references.
     * 
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("controlPointBuffers")
    @ByValue
    public native MTL4BufferRange controlPointBuffers();

    /**
     * Specifies the number of control points in the buffers the control point buffers reference.
     * 
     * All keyframes have the same number of control points.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("controlPointCount")
    @NUInt
    public native long controlPointCount();

    /**
     * Declares the format of the control points in the buffers that the control point buffers reference.
     * 
     * All keyframes share the same control point format. Defaults to `MTLAttributeFormatFloat3`, representing 3
     * floating
     * point values tightly packed.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("controlPointFormat")
    @NUInt
    public native long controlPointFormat();

    /**
     * Sets the stride, in bytes, between control points in the control point buffer.
     * 
     * All keyframes share the same control point stride.
     * 
     * You are responsible for ensuring this stride is a multiple of the control point format's element size, and
     * at a minimum exactly the control point format's size.
     * 
     * This property defaults to `0`, indicating that the control points are tightly-packed.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("controlPointStride")
    @NUInt
    public native long controlPointStride();

    /**
     * Sets the curve basis function, determining how Metal interpolates the control points.
     * 
     * Defaults to `MTLCurveBasisBSpline`. All keyframes share the same curve basis function.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("curveBasis")
    @NInt
    public native long curveBasis();

    /**
     * Configures the type of curve end caps.
     * 
     * Defaults to `MTLCurveEndCapsNone`. All keyframes share the same end cap type.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("curveEndCaps")
    @NInt
    public native long curveEndCaps();

    /**
     * Controls the curve type.
     * 
     * Defaults to `MTLCurveTypeRound`. All keyframes share the same curve type.
     * 
     * API-Since: 26.0
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
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * Assigns an optional index buffer containing references to control points in the control point buffers.
     * 
     * All keyframes share the same index buffer, with each index representing the first control point of a curve
     * segment.
     * 
     * You are responsible for ensuring the buffer address of the range is not zero.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("indexBuffer")
    @ByValue
    public native MTL4BufferRange indexBuffer();

    /**
     * Configures the size of the indices the `indexBuffer` contains, which is typically either 16 or 32-bits for each
     * index.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("indexType")
    @NUInt
    public native long indexType();

    @Generated
    @Selector("init")
    public native MTL4AccelerationStructureMotionCurveGeometryDescriptor init();

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
    public static native MTL4AccelerationStructureMotionCurveGeometryDescriptor new_objc();

    /**
     * Assigns a reference to a buffer containing, in turn, references to curve radii buffers.
     * 
     * This property references a buffer that conceptually represents an array with one entry for each keyframe in the
     * motion animation. Each one of these entries consists of a ``MTL4BufferRange`` that, in turn, references a
     * buffer containing the radii corresponding to the keyframe.
     * 
     * Metal interpolates curve radii according to the basis function you specify via ``curveBasis``.
     * 
     * You are responsible for ensuring the type of each radius matches the type property ``radiusFormat`` specifies,
     * that each radius is at least zero, and that the buffer address of the top-level buffer, as well as of buffer
     * it references, is not zero.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("radiusBuffers")
    @ByValue
    public native MTL4BufferRange radiusBuffers();

    /**
     * Sets the format of the radii in the radius buffer.
     * 
     * Defaults to `MTLAttributeFormatFloat`. All keyframes share the same radius format.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("radiusFormat")
    @NUInt
    public native long radiusFormat();

    /**
     * Sets the stride, in bytes, between radii in the radius buffer.
     * 
     * You are responsible for ensuring this property is set to a multiple of the size corresponding to the
     * ``radiusFormat``.
     * All keyframes share the same radius stride.
     * 
     * This property defaults to `0` bytes, indicating that the radii are tightly packed.
     * 
     * API-Since: 26.0
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
     * Controls the number of control points per curve segment.
     * 
     * Valid values for this property are `2`, `3`, or `4`. All keyframes have the same number of control points per
     * curve segment.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("segmentControlPointCount")
    @NUInt
    public native long segmentControlPointCount();

    /**
     * Declares the number of curve segments.
     * 
     * All keyframes have the same number of curve segments.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("segmentCount")
    @NUInt
    public native long segmentCount();

    /**
     * Assigns a reference to a buffer where each entry contains a reference to a buffer of control points.
     * 
     * This property references a buffer that conceptually represents an array with one entry for each keyframe in the
     * motion animation. Each one of these entries consists of a ``MTL4BufferRange`` that, in turn, references a
     * buffer containing the control points corresponding to the keyframe.
     * 
     * You are responsible for ensuring the buffer address is not zero for the top-level buffer, as well as for all
     * the vertex buffers it references.
     * 
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setControlPointBuffers:")
    public native void setControlPointBuffers(@ByValue MTL4BufferRange value);

    /**
     * Specifies the number of control points in the buffers the control point buffers reference.
     * 
     * All keyframes have the same number of control points.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setControlPointCount:")
    public native void setControlPointCount(@NUInt long value);

    /**
     * Declares the format of the control points in the buffers that the control point buffers reference.
     * 
     * All keyframes share the same control point format. Defaults to `MTLAttributeFormatFloat3`, representing 3
     * floating
     * point values tightly packed.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setControlPointFormat:")
    public native void setControlPointFormat(@NUInt long value);

    /**
     * Sets the stride, in bytes, between control points in the control point buffer.
     * 
     * All keyframes share the same control point stride.
     * 
     * You are responsible for ensuring this stride is a multiple of the control point format's element size, and
     * at a minimum exactly the control point format's size.
     * 
     * This property defaults to `0`, indicating that the control points are tightly-packed.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setControlPointStride:")
    public native void setControlPointStride(@NUInt long value);

    /**
     * Sets the curve basis function, determining how Metal interpolates the control points.
     * 
     * Defaults to `MTLCurveBasisBSpline`. All keyframes share the same curve basis function.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setCurveBasis:")
    public native void setCurveBasis(@NInt long value);

    /**
     * Configures the type of curve end caps.
     * 
     * Defaults to `MTLCurveEndCapsNone`. All keyframes share the same end cap type.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setCurveEndCaps:")
    public native void setCurveEndCaps(@NInt long value);

    /**
     * Controls the curve type.
     * 
     * Defaults to `MTLCurveTypeRound`. All keyframes share the same curve type.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setCurveType:")
    public native void setCurveType(@NInt long value);

    /**
     * Assigns an optional index buffer containing references to control points in the control point buffers.
     * 
     * All keyframes share the same index buffer, with each index representing the first control point of a curve
     * segment.
     * 
     * You are responsible for ensuring the buffer address of the range is not zero.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setIndexBuffer:")
    public native void setIndexBuffer(@ByValue MTL4BufferRange value);

    /**
     * Configures the size of the indices the `indexBuffer` contains, which is typically either 16 or 32-bits for each
     * index.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setIndexType:")
    public native void setIndexType(@NUInt long value);

    /**
     * Assigns a reference to a buffer containing, in turn, references to curve radii buffers.
     * 
     * This property references a buffer that conceptually represents an array with one entry for each keyframe in the
     * motion animation. Each one of these entries consists of a ``MTL4BufferRange`` that, in turn, references a
     * buffer containing the radii corresponding to the keyframe.
     * 
     * Metal interpolates curve radii according to the basis function you specify via ``curveBasis``.
     * 
     * You are responsible for ensuring the type of each radius matches the type property ``radiusFormat`` specifies,
     * that each radius is at least zero, and that the buffer address of the top-level buffer, as well as of buffer
     * it references, is not zero.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setRadiusBuffers:")
    public native void setRadiusBuffers(@ByValue MTL4BufferRange value);

    /**
     * Sets the format of the radii in the radius buffer.
     * 
     * Defaults to `MTLAttributeFormatFloat`. All keyframes share the same radius format.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setRadiusFormat:")
    public native void setRadiusFormat(@NUInt long value);

    /**
     * Sets the stride, in bytes, between radii in the radius buffer.
     * 
     * You are responsible for ensuring this property is set to a multiple of the size corresponding to the
     * ``radiusFormat``.
     * All keyframes share the same radius stride.
     * 
     * This property defaults to `0` bytes, indicating that the radii are tightly packed.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setRadiusStride:")
    public native void setRadiusStride(@NUInt long value);

    /**
     * Controls the number of control points per curve segment.
     * 
     * Valid values for this property are `2`, `3`, or `4`. All keyframes have the same number of control points per
     * curve segment.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setSegmentControlPointCount:")
    public native void setSegmentControlPointCount(@NUInt long value);

    /**
     * Declares the number of curve segments.
     * 
     * All keyframes have the same number of curve segments.
     * 
     * API-Since: 26.0
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