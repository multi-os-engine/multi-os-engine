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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Provides axis values for a single data point within a series.
 * 
 * API-Since: 15.0
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
    @NotNull
    @Generated
    @Selector("additionalValues")
    public native NSArray<? extends AXDataPointValue> additionalValues();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AXDataPoint alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AXDataPoint allocWithZone(VoidPtr zone);

    /**
     * An attributed version of the name or label for this data point.
     */
    @Nullable
    @Generated
    @Selector("attributedLabel")
    public native NSAttributedString attributedLabel();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

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
    public native AXDataPoint initWithXY(@NotNull AXDataPointValue xValue, @Nullable AXDataPointValue yValue);

    @Generated
    @Selector("initWithX:y:additionalValues:")
    public native AXDataPoint initWithXYAdditionalValues(@NotNull AXDataPointValue xValue,
            @Nullable AXDataPointValue yValue, @Nullable NSArray<? extends AXDataPointValue> additionalValues);

    @Generated
    @Selector("initWithX:y:additionalValues:label:")
    public native AXDataPoint initWithXYAdditionalValuesLabel(@NotNull AXDataPointValue xValue,
            @Nullable AXDataPointValue yValue, @Nullable NSArray<? extends AXDataPointValue> additionalValues,
            @Nullable String label);

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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * A name or label for this data point.
     */
    @Nullable
    @Generated
    @Selector("label")
    public native String label();

    @Generated
    @Owned
    @Selector("new")
    public static native AXDataPoint new_objc();

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
    public native void setAdditionalValues(@NotNull NSArray<? extends AXDataPointValue> value);

    /**
     * An attributed version of the name or label for this data point.
     */
    @Generated
    @Selector("setAttributedLabel:")
    public native void setAttributedLabel(@Nullable NSAttributedString value);

    /**
     * A name or label for this data point.
     */
    @Generated
    @Selector("setLabel:")
    public native void setLabel(@Nullable String value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * The x-axis value for this data point.
     * Should be a Double for a numeric x-axis or a String for a categorical x-axis.
     */
    @Generated
    @Selector("setXValue:")
    public native void setXValue(@NotNull AXDataPointValue value);

    /**
     * The y-axis value for this data point.
     */
    @Generated
    @Selector("setYValue:")
    public native void setYValue(@Nullable AXDataPointValue value);

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
    @NotNull
    @Generated
    @Selector("xValue")
    public native AXDataPointValue xValue();

    /**
     * The y-axis value for this data point.
     */
    @Nullable
    @Generated
    @Selector("yValue")
    public native AXDataPointValue yValue();
}
