package apple.pencilkit;

import apple.NSObject;
import apple.coregraphics.struct.CGPoint;
import apple.foundation.NSArray;
import apple.foundation.NSDate;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.BoolPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * A uniform cubic B-spline representing the point data of a `PKStroke`.
 */
@Generated
@Library("PencilKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PKStrokePath extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected PKStrokePath(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PKStrokePath alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native PKStrokePath allocWithZone(VoidPtr zone);

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
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * The number of control points in this stroke path.
     */
    @Generated
    @Selector("count")
    @NUInt
    public native long count();

    /**
     * The time at which this stroke path was started.
     * The `timeOffset` of contained PKStrokePoints is relative to this date.
     */
    @Generated
    @Selector("creationDate")
    public native NSDate creationDate();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Executes a given block using each point in a range with a distance step.
     *
     * @param range        The parametric range to enumerate points in.
     * @param distanceStep The distance to step between points.
     * @param block        The block to execute for each point. This block takes two parameters
     *                     point The interpolated point on the spline.
     *                     stop A reference to a Boolean value. Setting the value to YES within the block stops further enumeration of the array. If a block stops further enumeration, that block continues to run until it’s finished.
     */
    @Generated
    @Selector("enumerateInterpolatedPointsInRange:strideByDistance:usingBlock:")
    public native void enumerateInterpolatedPointsInRangeStrideByDistanceUsingBlock(PKFloatRange range,
            @NFloat double distanceStep,
            @ObjCBlock(name = "call_enumerateInterpolatedPointsInRangeStrideByDistanceUsingBlock") Block_enumerateInterpolatedPointsInRangeStrideByDistanceUsingBlock block);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateInterpolatedPointsInRangeStrideByDistanceUsingBlock {
        @Generated
        void call_enumerateInterpolatedPointsInRangeStrideByDistanceUsingBlock(PKStrokePoint point, BoolPtr stop);
    }

    /**
     * Executes a given block using each point in a range with a parametric step.
     *
     * @param range          The parametric range to enumerate points in.
     * @param parametricStep The parametric step between points.
     * @param block          The block to execute for each point. This block takes two parameters
     *                       point The interpolated point on the spline.
     *                       stop A reference to a Boolean value. Setting the value to YES within the block stops further enumeration of the array. If a block stops further enumeration, that block continues to run until it’s finished.
     */
    @Generated
    @Selector("enumerateInterpolatedPointsInRange:strideByParametricStep:usingBlock:")
    public native void enumerateInterpolatedPointsInRangeStrideByParametricStepUsingBlock(PKFloatRange range,
            @NFloat double parametricStep,
            @ObjCBlock(name = "call_enumerateInterpolatedPointsInRangeStrideByParametricStepUsingBlock") Block_enumerateInterpolatedPointsInRangeStrideByParametricStepUsingBlock block);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateInterpolatedPointsInRangeStrideByParametricStepUsingBlock {
        @Generated
        void call_enumerateInterpolatedPointsInRangeStrideByParametricStepUsingBlock(PKStrokePoint point, BoolPtr stop);
    }

    /**
     * Executes a given block using each point in a range with a time step.
     *
     * @param range    The parametric range to enumerate points in.
     * @param timeStep The time interval to step between points.
     * @param block    The block to execute for each point. This block takes two parameters
     *                 point The interpolated point on the spline.
     *                 stop A reference to a Boolean value. Setting the value to YES within the block stops further enumeration of the array. If a block stops further enumeration, that block continues to run until it’s finished.
     */
    @Generated
    @Selector("enumerateInterpolatedPointsInRange:strideByTime:usingBlock:")
    public native void enumerateInterpolatedPointsInRangeStrideByTimeUsingBlock(PKFloatRange range, double timeStep,
            @ObjCBlock(name = "call_enumerateInterpolatedPointsInRangeStrideByTimeUsingBlock") Block_enumerateInterpolatedPointsInRangeStrideByTimeUsingBlock block);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateInterpolatedPointsInRangeStrideByTimeUsingBlock {
        @Generated
        void call_enumerateInterpolatedPointsInRangeStrideByTimeUsingBlock(PKStrokePoint point, BoolPtr stop);
    }

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native PKStrokePath init();

    /**
     * Create a stroke path value with the given cubic B-spline control points.
     *
     * @param controlPoints An array of control points for a cubic B-spline.
     * @param creationDate  The start time of this path.
     */
    @Generated
    @Selector("initWithControlPoints:creationDate:")
    public native PKStrokePath initWithControlPointsCreationDate(NSArray<? extends PKStrokePoint> controlPoints,
            NSDate creationDate);

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

    /**
     * The on-curve location for the floating point [0, count-1] `parametricValue` parameter.
     * <p>
     * This has better performance than `[self interpolatedPointAt: parametricValue].location`
     * for when only the location is required.
     */
    @Generated
    @Selector("interpolatedLocationAt:")
    @ByValue
    public native CGPoint interpolatedLocationAt(@NFloat double parametricValue);

    /**
     * The on-curve point for the floating point [0, count-1] `parametricValue` parameter.
     */
    @Generated
    @Selector("interpolatedPointAt:")
    public native PKStrokePoint interpolatedPointAt(@NFloat double parametricValue);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native PKStrokePath new_objc();

    /**
     * Returns B-spline control point at index `i`.
     */
    @Generated
    @Selector("objectAtIndexedSubscript:")
    public native PKStrokePoint objectAtIndexedSubscript(@NUInt long i);

    /**
     * Returns a parametric value on the B-spline that is a specified distance from the given parametric value.
     *
     * @param parametricValue The floating point [0, count-1] parametric value.
     * @param distanceStep    The distance to offset `parametricValue`. `distanceStep` can be positive or negative.
     * @return A parametric value offset by `distanceStep` from `parametricValue`.
     */
    @Generated
    @Selector("parametricValue:offsetByDistance:")
    @NFloat
    public native double parametricValueOffsetByDistance(@NFloat double parametricValue, @NFloat double distanceStep);

    /**
     * Returns a parametric value on the B-spline that is a specified time from the given parametric value.
     *
     * @param parametricValue The floating point [0, count-1] parametric value.
     * @param timeStep        The time to offset `parametricValue`. `timeStep` can be positive or negative.
     * @return A parametric value offset by `timeStep` from `parametricValue`.
     */
    @Generated
    @Selector("parametricValue:offsetByTime:")
    @NFloat
    public native double parametricValueOffsetByTime(@NFloat double parametricValue, double timeStep);

    /**
     * Returns B-spline control point at index `i`.
     */
    @Generated
    @Selector("pointAtIndex:")
    public native PKStrokePoint pointAtIndex(@NUInt long i);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

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
