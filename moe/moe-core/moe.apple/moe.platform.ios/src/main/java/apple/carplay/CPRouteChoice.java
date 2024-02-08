package apple.carplay;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * [@c] CPRouteChoice describes a possible route for a @c CPTrip.
 * 
 * API-Since: 12.0
 */
@Generated
@Library("CarPlay")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CPRouteChoice extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected CPRouteChoice(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * additionalInformationVariants is an array of additional information variants for this route choice, arranged from
     * most to least preferred. You must provide at least one variant.
     * The system will select the first variant that fits the available space. The variant strings should be provided as
     * localized, displayable content.
     * Examples: "Fastest Route", "Avoids Tolls"
     */
    @Nullable
    @Generated
    @Selector("additionalInformationVariants")
    public native NSArray<String> additionalInformationVariants();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CPRouteChoice alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CPRouteChoice allocWithZone(VoidPtr zone);

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
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native CPRouteChoice init();

    @Generated
    @Selector("initWithCoder:")
    public native CPRouteChoice initWithCoder(@NotNull NSCoder coder);

    /**
     * Initialize a @c CPRouteChoice with summary variants, additional information variants, and selection summary
     * variants.
     * The variant strings should be provided as localized, displayable content.
     */
    @Generated
    @Selector("initWithSummaryVariants:additionalInformationVariants:selectionSummaryVariants:")
    public native CPRouteChoice initWithSummaryVariantsAdditionalInformationVariantsSelectionSummaryVariants(
            @NotNull NSArray<String> summaryVariants, @NotNull NSArray<String> additionalInformationVariants,
            @NotNull NSArray<String> selectionSummaryVariants);

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

    @Generated
    @Owned
    @Selector("new")
    public static native CPRouteChoice new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * selectionSummaryVariants is an array of summary variants for this route choice, arranged from most to least
     * preferred. You must provide at least one variant.
     * The system will select the first variant that fits the available space.
     */
    @Nullable
    @Generated
    @Selector("selectionSummaryVariants")
    public native NSArray<String> selectionSummaryVariants();

    /**
     * Any custom user info related to this route choice.
     */
    @Generated
    @Selector("setUserInfo:")
    public native void setUserInfo(@Nullable @Mapped(ObjCObjectMapper.class) Object value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * summaryVariants is an array of summary variants for this route choice, arranged from most to least preferred. You
     * must provide at least one variant.
     * The system will select the first variant that fits the available space. The variant strings should be provided as
     * localized, displayable content.
     * Example: "Via I-280 S"
     */
    @NotNull
    @Generated
    @Selector("summaryVariants")
    public native NSArray<String> summaryVariants();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * Any custom user info related to this route choice.
     */
    @Nullable
    @Generated
    @Selector("userInfo")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object userInfo();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
