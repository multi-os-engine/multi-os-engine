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

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

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

    @Generated
    @Selector("count")
    @NUInt
    public native long count();

    @Generated
    @Selector("creationDate")
    public native NSDate creationDate();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

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

    @Generated
    @Selector("interpolatedLocationAt:")
    @ByValue
    public native CGPoint interpolatedLocationAt(@NFloat double parametricValue);

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
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("objectAtIndexedSubscript:")
    public native PKStrokePoint objectAtIndexedSubscript(@NUInt long i);

    @Generated
    @Selector("parametricValue:offsetByDistance:")
    @NFloat
    public native double parametricValueOffsetByDistance(@NFloat double parametricValue, @NFloat double distanceStep);

    @Generated
    @Selector("parametricValue:offsetByTime:")
    @NFloat
    public native double parametricValueOffsetByTime(@NFloat double parametricValue, double timeStep);

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