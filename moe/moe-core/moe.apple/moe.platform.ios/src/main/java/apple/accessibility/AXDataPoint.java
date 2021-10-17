package apple.accessibility;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSAttributedString;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
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
 * Provides axis values for a single data point within a series.
 */
@Generated
@Library("Accessibility")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AXDataPoint extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected AXDataPoint(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * Any additional values for additional axes for this data point.
     * These should be provided in the same order as their corresponding
     * `AXDataAxisDescriptor` objects in `AXChartDescriptor.additionalAxes`.
     */
    @Generated
    @Selector("additionalValues")
    public native NSArray<? extends AXDataPointValue> additionalValues();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AXDataPoint alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    /**
     * An attributed version of the name or label for this data point.
     */
    @Generated
    @Selector("attributedLabel")
    public native NSAttributedString attributedLabel();

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
    public native AXDataPoint init();

    @Generated
    @Selector("initWithX:y:")
    public native AXDataPoint initWithXY(AXDataPointValue xValue, AXDataPointValue yValue);

    @Generated
    @Selector("initWithX:y:additionalValues:")
    public native AXDataPoint initWithXYAdditionalValues(AXDataPointValue xValue, AXDataPointValue yValue,
            NSArray<? extends AXDataPointValue> additionalValues);

    @Generated
    @Selector("initWithX:y:additionalValues:label:")
    public native AXDataPoint initWithXYAdditionalValuesLabel(AXDataPointValue xValue, AXDataPointValue yValue,
            NSArray<? extends AXDataPointValue> additionalValues, String label);

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

    /**
     * A name or label for this data point.
     */
    @Generated
    @Selector("label")
    public native String label();

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
     * Any additional values for additional axes for this data point.
     * These should be provided in the same order as their corresponding
     * `AXDataAxisDescriptor` objects in `AXChartDescriptor.additionalAxes`.
     */
    @Generated
    @Selector("setAdditionalValues:")
    public native void setAdditionalValues(NSArray<? extends AXDataPointValue> value);

    /**
     * An attributed version of the name or label for this data point.
     */
    @Generated
    @Selector("setAttributedLabel:")
    public native void setAttributedLabel(NSAttributedString value);

    /**
     * A name or label for this data point.
     */
    @Generated
    @Selector("setLabel:")
    public native void setLabel(String value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * The x-axis value for this data point.
     * Should be a Double for a numeric x-axis or a String for a categorical x-axis.
     */
    @Generated
    @Selector("setXValue:")
    public native void setXValue(AXDataPointValue value);

    /**
     * The y-axis value for this data point.
     */
    @Generated
    @Selector("setYValue:")
    public native void setYValue(AXDataPointValue value);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * The x-axis value for this data point.
     * Should be a Double for a numeric x-axis or a String for a categorical x-axis.
     */
    @Generated
    @Selector("xValue")
    public native AXDataPointValue xValue();

    /**
     * The y-axis value for this data point.
     */
    @Generated
    @Selector("yValue")
    public native AXDataPointValue yValue();
}
