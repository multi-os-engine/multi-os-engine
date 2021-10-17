package apple.accessibility;

import apple.NSObject;
import apple.accessibility.protocol.AXDataAxisDescriptor;
import apple.coregraphics.struct.CGRect;
import apple.foundation.NSArray;
import apple.foundation.NSAttributedString;
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
 * The top-level descriptor object for an accessible chart.
 */
@Generated
@Library("Accessibility")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AXChartDescriptor extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected AXChartDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * Descriptors for additional categorical or numerical axes beyond x and y.
     * For example, in a visual chart, these values might be represented by the size
     * or color of data points.
     */
    @Generated
    @Selector("additionalAxes")
    public native NSArray<?> additionalAxes();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AXChartDescriptor alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    /**
     * An attributed version of the title of the chart.
     * When set, this will be used instead of `title`.
     */
    @Generated
    @Selector("attributedTitle")
    public native NSAttributedString attributedTitle();

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

    /**
     * The direction of the chart's X axis.
     */
    @Generated
    @Selector("contentDirection")
    @NInt
    public native long contentDirection();

    /**
     * The bounds of the view area for visually rendering data values if applicable, provided in superview coordinates.
     */
    @Generated
    @Selector("contentFrame")
    @ByValue
    public native CGRect contentFrame();

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
    public native AXChartDescriptor init();

    @Generated
    @Selector("initWithAttributedTitle:summary:xAxisDescriptor:yAxisDescriptor:additionalAxes:series:")
    public native AXChartDescriptor initWithAttributedTitleSummaryXAxisDescriptorYAxisDescriptorAdditionalAxesSeries(
            NSAttributedString attributedTitle, String summary,
            @Mapped(ObjCObjectMapper.class) AXDataAxisDescriptor xAxis, AXNumericDataAxisDescriptor yAxis,
            NSArray<?> additionalAxes, NSArray<? extends AXDataSeriesDescriptor> series);

    @Generated
    @Selector("initWithAttributedTitle:summary:xAxisDescriptor:yAxisDescriptor:series:")
    public native AXChartDescriptor initWithAttributedTitleSummaryXAxisDescriptorYAxisDescriptorSeries(
            NSAttributedString attributedTitle, String summary,
            @Mapped(ObjCObjectMapper.class) AXDataAxisDescriptor xAxis, AXNumericDataAxisDescriptor yAxis,
            NSArray<? extends AXDataSeriesDescriptor> series);

    @Generated
    @Selector("initWithTitle:summary:xAxisDescriptor:yAxisDescriptor:additionalAxes:series:")
    public native AXChartDescriptor initWithTitleSummaryXAxisDescriptorYAxisDescriptorAdditionalAxesSeries(String title,
            String summary, @Mapped(ObjCObjectMapper.class) AXDataAxisDescriptor xAxis,
            AXNumericDataAxisDescriptor yAxis, NSArray<?> additionalAxes,
            NSArray<? extends AXDataSeriesDescriptor> series);

    @Generated
    @Selector("initWithTitle:summary:xAxisDescriptor:yAxisDescriptor:series:")
    public native AXChartDescriptor initWithTitleSummaryXAxisDescriptorYAxisDescriptorSeries(String title,
            String summary, @Mapped(ObjCObjectMapper.class) AXDataAxisDescriptor xAxis,
            AXNumericDataAxisDescriptor yAxis, NSArray<? extends AXDataSeriesDescriptor> series);

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
     * A set of data series descriptors describing each series in the chart.
     */
    @Generated
    @Selector("series")
    public native NSArray<? extends AXDataSeriesDescriptor> series();

    /**
     * Descriptors for additional categorical or numerical axes beyond x and y.
     * For example, in a visual chart, these values might be represented by the size
     * or color of data points.
     */
    @Generated
    @Selector("setAdditionalAxes:")
    public native void setAdditionalAxes(NSArray<?> value);

    /**
     * An attributed version of the title of the chart.
     * When set, this will be used instead of `title`.
     */
    @Generated
    @Selector("setAttributedTitle:")
    public native void setAttributedTitle(NSAttributedString value);

    /**
     * The direction of the chart's X axis.
     */
    @Generated
    @Selector("setContentDirection:")
    public native void setContentDirection(@NInt long value);

    /**
     * The bounds of the view area for visually rendering data values if applicable, provided in superview coordinates.
     */
    @Generated
    @Selector("setContentFrame:")
    public native void setContentFrame(@ByValue CGRect value);

    /**
     * A set of data series descriptors describing each series in the chart.
     */
    @Generated
    @Selector("setSeries:")
    public native void setSeries(NSArray<? extends AXDataSeriesDescriptor> value);

    /**
     * A natural language summary of the key message or features of the chart.
     * e.g. "The chart shows that fuel efficiency decreases as vehicle weight increases."
     */
    @Generated
    @Selector("setSummary:")
    public native void setSummary(String value);

    /**
     * The title of the chart.
     */
    @Generated
    @Selector("setTitle:")
    public native void setTitle(String value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * The axis descriptor for the chart's X axis.
     */
    @Generated
    @Selector("setXAxis:")
    public native void setXAxis(@Mapped(ObjCObjectMapper.class) AXDataAxisDescriptor value);

    /**
     * The axis descriptor for the chart's Y axis.
     */
    @Generated
    @Selector("setYAxis:")
    public native void setYAxis(AXNumericDataAxisDescriptor value);

    /**
     * A natural language summary of the key message or features of the chart.
     * e.g. "The chart shows that fuel efficiency decreases as vehicle weight increases."
     */
    @Generated
    @Selector("summary")
    public native String summary();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * The title of the chart.
     */
    @Generated
    @Selector("title")
    public native String title();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * The axis descriptor for the chart's X axis.
     */
    @Generated
    @Selector("xAxis")
    @MappedReturn(ObjCObjectMapper.class)
    public native AXDataAxisDescriptor xAxis();

    /**
     * The axis descriptor for the chart's Y axis.
     */
    @Generated
    @Selector("yAxis")
    public native AXNumericDataAxisDescriptor yAxis();
}
