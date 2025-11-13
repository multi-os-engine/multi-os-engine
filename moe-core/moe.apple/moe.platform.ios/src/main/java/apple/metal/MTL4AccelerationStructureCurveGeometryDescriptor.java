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
 * Describes curve geometry suitable for ray tracing.
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
public class MTL4AccelerationStructureCurveGeometryDescriptor extends MTL4AccelerationStructureGeometryDescriptor {
    static {
        NatJ.register();
    }

    @Generated
    protected MTL4AccelerationStructureCurveGeometryDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTL4AccelerationStructureCurveGeometryDescriptor alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTL4AccelerationStructureCurveGeometryDescriptor allocWithZone(VoidPtr zone);

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
     * References a buffer containing curve control points.
     * 
     * Control points are interpolated according to the basis function you specify in ``curveBasis``.
     * 
     * You are responsible for ensuring each control is in a format matching the control point format
     * ``controlPointFormat``
     * specifies, as well as ensuring that the buffer address of the range is not zero.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("controlPointBuffer")
    @ByValue
    public native MTL4BufferRange controlPointBuffer();

    /**
     * Declares the number of control points in the control point buffer.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("controlPointCount")
    @NUInt
    public native long controlPointCount();

    /**
     * Declares the format of the control points the control point buffer references.
     * 
     * Defaults to `MTLAttributeFormatFloat3`, representing 3 floating point values tightly packed.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("controlPointFormat")
    @NUInt
    public native long controlPointFormat();

    /**
     * Sets the stride, in bytes, between control points in the control point buffer the control point buffer
     * references.
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
     * Controls the curve basis function, determining how Metal interpolates the control points.
     * 
     * Defaults to `MTLCurveBasisBSpline`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("curveBasis")
    @NInt
    public native long curveBasis();

    /**
     * Sets the type of curve end caps.
     * 
     * Defaults to `MTLCurveEndCapsNone`.
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
     * Defaults to `MTLCurveTypeRound`.
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
     * Assigns an optional index buffer containing references to control points in the control point buffer.
     * 
     * Each index represents the first control point of a curve segment. You are responsible for ensuring the buffer
     * address of the range is not zero.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("indexBuffer")
    @ByValue
    public native MTL4BufferRange indexBuffer();

    /**
     * Specifies the size of the indices the `indexBuffer` contains, which is typically either 16 or 32-bits for each
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
    public native MTL4AccelerationStructureCurveGeometryDescriptor init();

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
    public static native MTL4AccelerationStructureCurveGeometryDescriptor new_objc();

    /**
     * Assigns a reference to a buffer containing the curve radius for each control point.
     * 
     * Metal interpolates curve radii according to the basis function you specify via ``curveBasis``.
     * 
     * You are responsible for ensuring the type of each radius matches the type property ``radiusFormat`` specifies,
     * that each radius is at least zero, and that the buffer address of the range is not zero.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("radiusBuffer")
    @ByValue
    public native MTL4BufferRange radiusBuffer();

    /**
     * Declares the format of the radii in the radius buffer.
     * 
     * Defaults to `MTLAttributeFormatFloat`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("radiusFormat")
    @NUInt
    public native long radiusFormat();

    /**
     * Configures the stride, in bytes, between radii in the radius buffer.
     * 
     * You are responsible for ensuring this property is set to a multiple of the size corresponding to the
     * ``radiusFormat``.
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
     * Declares the number of control points per curve segment.
     * 
     * Valid values for this property are `2`, `3`, or `4`.
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
     * API-Since: 26.0
     */
    @Generated
    @Selector("segmentCount")
    @NUInt
    public native long segmentCount();

    /**
     * References a buffer containing curve control points.
     * 
     * Control points are interpolated according to the basis function you specify in ``curveBasis``.
     * 
     * You are responsible for ensuring each control is in a format matching the control point format
     * ``controlPointFormat``
     * specifies, as well as ensuring that the buffer address of the range is not zero.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setControlPointBuffer:")
    public native void setControlPointBuffer(@ByValue MTL4BufferRange value);

    /**
     * Declares the number of control points in the control point buffer.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setControlPointCount:")
    public native void setControlPointCount(@NUInt long value);

    /**
     * Declares the format of the control points the control point buffer references.
     * 
     * Defaults to `MTLAttributeFormatFloat3`, representing 3 floating point values tightly packed.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setControlPointFormat:")
    public native void setControlPointFormat(@NUInt long value);

    /**
     * Sets the stride, in bytes, between control points in the control point buffer the control point buffer
     * references.
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
     * Controls the curve basis function, determining how Metal interpolates the control points.
     * 
     * Defaults to `MTLCurveBasisBSpline`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setCurveBasis:")
    public native void setCurveBasis(@NInt long value);

    /**
     * Sets the type of curve end caps.
     * 
     * Defaults to `MTLCurveEndCapsNone`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setCurveEndCaps:")
    public native void setCurveEndCaps(@NInt long value);

    /**
     * Controls the curve type.
     * 
     * Defaults to `MTLCurveTypeRound`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setCurveType:")
    public native void setCurveType(@NInt long value);

    /**
     * Assigns an optional index buffer containing references to control points in the control point buffer.
     * 
     * Each index represents the first control point of a curve segment. You are responsible for ensuring the buffer
     * address of the range is not zero.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setIndexBuffer:")
    public native void setIndexBuffer(@ByValue MTL4BufferRange value);

    /**
     * Specifies the size of the indices the `indexBuffer` contains, which is typically either 16 or 32-bits for each
     * index.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setIndexType:")
    public native void setIndexType(@NUInt long value);

    /**
     * Assigns a reference to a buffer containing the curve radius for each control point.
     * 
     * Metal interpolates curve radii according to the basis function you specify via ``curveBasis``.
     * 
     * You are responsible for ensuring the type of each radius matches the type property ``radiusFormat`` specifies,
     * that each radius is at least zero, and that the buffer address of the range is not zero.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setRadiusBuffer:")
    public native void setRadiusBuffer(@ByValue MTL4BufferRange value);

    /**
     * Declares the format of the radii in the radius buffer.
     * 
     * Defaults to `MTLAttributeFormatFloat`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setRadiusFormat:")
    public native void setRadiusFormat(@NUInt long value);

    /**
     * Configures the stride, in bytes, between radii in the radius buffer.
     * 
     * You are responsible for ensuring this property is set to a multiple of the size corresponding to the
     * ``radiusFormat``.
     * 
     * This property defaults to `0` bytes, indicating that the radii are tightly packed.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setRadiusStride:")
    public native void setRadiusStride(@NUInt long value);

    /**
     * Declares the number of control points per curve segment.
     * 
     * Valid values for this property are `2`, `3`, or `4`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setSegmentControlPointCount:")
    public native void setSegmentControlPointCount(@NUInt long value);

    /**
     * Declares the number of curve segments.
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