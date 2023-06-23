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
 * Provides information about a data series. A chart may have one or many data series.
 * 
 * API-Since: 15.0
 */
@Generated
@Library("Accessibility")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AXDataSeriesDescriptor extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected AXDataSeriesDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AXDataSeriesDescriptor alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AXDataSeriesDescriptor allocWithZone(VoidPtr zone);

    /**
     * An attributed version of the name of this data series.
     * When set, this will be used instead of `name`.
     */
    @NotNull
    @Generated
    @Selector("attributedName")
    public native NSAttributedString attributedName();

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

    /**
     * The data points that make up the series.
     */
    @NotNull
    @Generated
    @Selector("dataPoints")
    public native NSArray<? extends AXDataPoint> dataPoints();

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
    public native AXDataSeriesDescriptor init();

    @Generated
    @Selector("initWithAttributedName:isContinuous:dataPoints:")
    public native AXDataSeriesDescriptor initWithAttributedNameIsContinuousDataPoints(
            @NotNull NSAttributedString attributedName, boolean isContinuous,
            @NotNull NSArray<? extends AXDataPoint> dataPoints);

    @Generated
    @Selector("initWithName:isContinuous:dataPoints:")
    public native AXDataSeriesDescriptor initWithNameIsContinuousDataPoints(@NotNull String name, boolean isContinuous,
            @NotNull NSArray<? extends AXDataPoint> dataPoints);

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
     * Whether or not this data series should be treated as continuous.
     */
    @Generated
    @Selector("isContinuous")
    public native boolean isContinuous();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * The name or title of this data series.
     */
    @Nullable
    @Generated
    @Selector("name")
    public native String name();

    @Generated
    @Owned
    @Selector("new")
    public static native AXDataSeriesDescriptor new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * An attributed version of the name of this data series.
     * When set, this will be used instead of `name`.
     */
    @Generated
    @Selector("setAttributedName:")
    public native void setAttributedName(@NotNull NSAttributedString value);

    /**
     * The data points that make up the series.
     */
    @Generated
    @Selector("setDataPoints:")
    public native void setDataPoints(@NotNull NSArray<? extends AXDataPoint> value);

    /**
     * Whether or not this data series should be treated as continuous.
     */
    @Generated
    @Selector("setIsContinuous:")
    public native void setIsContinuous(boolean value);

    /**
     * The name or title of this data series.
     */
    @Generated
    @Selector("setName:")
    public native void setName(@Nullable String value);

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
