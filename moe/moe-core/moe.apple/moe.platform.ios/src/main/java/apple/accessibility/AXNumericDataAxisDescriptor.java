package apple.accessibility;

import apple.NSObject;
import apple.accessibility.protocol.AXDataAxisDescriptor;
import apple.foundation.NSArray;
import apple.foundation.NSAttributedString;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Accessibility")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AXNumericDataAxisDescriptor extends NSObject implements AXDataAxisDescriptor {
    static {
        NatJ.register();
    }

    @Generated
    protected AXNumericDataAxisDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AXNumericDataAxisDescriptor alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

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

    /**
     * The positions of any gridlines along this axis.
     */
    @Generated
    @Selector("gridlinePositions")
    public native NSArray<? extends NSNumber> gridlinePositions();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native AXNumericDataAxisDescriptor init();

    @Generated
    @Selector("initWithAttributedTitle:lowerBound:upperBound:gridlinePositions:valueDescriptionProvider:")
    public native AXNumericDataAxisDescriptor initWithAttributedTitleLowerBoundUpperBoundGridlinePositionsValueDescriptionProvider(
            NSAttributedString attributedTitle, double lowerbound, double upperBound,
            NSArray<? extends NSNumber> gridlinePositions,
            @ObjCBlock(name = "call_initWithAttributedTitleLowerBoundUpperBoundGridlinePositionsValueDescriptionProvider") Block_initWithAttributedTitleLowerBoundUpperBoundGridlinePositionsValueDescriptionProvider valueDescriptionProvider);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithAttributedTitleLowerBoundUpperBoundGridlinePositionsValueDescriptionProvider {
        @Generated
        String call_initWithAttributedTitleLowerBoundUpperBoundGridlinePositionsValueDescriptionProvider(double arg0);
    }

    @Generated
    @Selector("initWithTitle:lowerBound:upperBound:gridlinePositions:valueDescriptionProvider:")
    public native AXNumericDataAxisDescriptor initWithTitleLowerBoundUpperBoundGridlinePositionsValueDescriptionProvider(
            String title, double lowerbound, double upperBound, NSArray<? extends NSNumber> gridlinePositions,
            @ObjCBlock(name = "call_initWithTitleLowerBoundUpperBoundGridlinePositionsValueDescriptionProvider") Block_initWithTitleLowerBoundUpperBoundGridlinePositionsValueDescriptionProvider valueDescriptionProvider);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithTitleLowerBoundUpperBoundGridlinePositionsValueDescriptionProvider {
        @Generated
        String call_initWithTitleLowerBoundUpperBoundGridlinePositionsValueDescriptionProvider(double arg0);
    }

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
     * The minimum displayable value for the axis.
     */
    @Generated
    @Selector("lowerBound")
    public native double lowerBound();

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
     * The scale to use for this axis. This should match the visual representation in the chart.
     * If not set explicitly, this will default to `linear`.
     */
    @Generated
    @Selector("scaleType")
    @NInt
    public native long scaleType();

    @Generated
    @Selector("setAttributedTitle:")
    public native void setAttributedTitle(NSAttributedString value);

    /**
     * The positions of any gridlines along this axis.
     */
    @Generated
    @Selector("setGridlinePositions:")
    public native void setGridlinePositions(NSArray<? extends NSNumber> value);

    /**
     * The minimum displayable value for the axis.
     */
    @Generated
    @Selector("setLowerBound:")
    public native void setLowerBound(double value);

    /**
     * The scale to use for this axis. This should match the visual representation in the chart.
     * If not set explicitly, this will default to `linear`.
     */
    @Generated
    @Selector("setScaleType:")
    public native void setScaleType(@NInt long value);

    @Generated
    @Selector("setTitle:")
    public native void setTitle(String value);

    /**
     * The maximum displayable value for the axis.
     */
    @Generated
    @Selector("setUpperBound:")
    public native void setUpperBound(double value);

    /**
     * Provides a value description to be spoken for a particular data value on this axis.
     * Use this to format data values to string representations that include units, dates, times, etc.
     */
    @Generated
    @Selector("setValueDescriptionProvider:")
    public native void setValueDescriptionProvider(
            @ObjCBlock(name = "call_setValueDescriptionProvider") Block_setValueDescriptionProvider value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setValueDescriptionProvider {
        @Generated
        String call_setValueDescriptionProvider(double arg0);
    }

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("title")
    public native String title();

    /**
     * The maximum displayable value for the axis.
     */
    @Generated
    @Selector("upperBound")
    public native double upperBound();

    /**
     * Provides a value description to be spoken for a particular data value on this axis.
     * Use this to format data values to string representations that include units, dates, times, etc.
     */
    @Generated
    @Selector("valueDescriptionProvider")
    @ObjCBlock(name = "call_valueDescriptionProvider_ret")
    public native Block_valueDescriptionProvider_ret valueDescriptionProvider();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_valueDescriptionProvider_ret {
        @Generated
        String call_valueDescriptionProvider_ret(double arg0);
    }

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
