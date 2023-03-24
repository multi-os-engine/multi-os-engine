package apple.avfoundation;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSPredicate;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NFloat;
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
 * API-Since: 15.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVAssetVariantQualifier extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected AVAssetVariantQualifier(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVAssetVariantQualifier alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVAssetVariantQualifier allocWithZone(VoidPtr zone);

    /**
     * assetVariantQualifierWithPredicate:
     * 
     * Returns a qualifer for a predicate.
     * 
     * @param predicate
     *                  The variant predicate.
     */
    @Generated
    @Selector("assetVariantQualifierWithPredicate:")
    public static native AVAssetVariantQualifier assetVariantQualifierWithPredicate(@NotNull NSPredicate predicate);

    /**
     * assetVariantQualifierWithVariant:
     * 
     * Returns a qualifer for a particular asset variant.
     * 
     * @param variant
     *                A variant obtained from the -[AVAsset variants] or -[AVAssetDownloadConfiguration
     *                playableVariants].
     */
    @Generated
    @Selector("assetVariantQualifierWithVariant:")
    public static native AVAssetVariantQualifier assetVariantQualifierWithVariant(@NotNull AVAssetVariant variant);

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
    public native AVAssetVariantQualifier init();

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
    public static native AVAssetVariantQualifier new_objc();

    /**
     * predicateForChannelCount:mediaSelectionOption:operatorType:
     * 
     * Creates a NSPredicate for audio channel count which can be used with other NSPredicates' to express variant
     * preferences.
     * 
     * @param channelCount
     *                             The RHS value for the channel count in the predicate equation.
     * @param mediaSelectionOption
     *                             The audio media selection option under consideration.
     * @param operatorType
     *                             The valid values are NSLessThanPredicateOperatorType,
     *                             NSLessThanOrEqualToPredicateOperatorType, NSGreaterThanPredicateOperatorType,
     *                             NSGreaterThanOrEqualToPredicateOperatorType, NSEqualToPredicateOperatorType and
     *                             NSNotEqualToPredicateOperatorType.
     */
    @NotNull
    @Generated
    @Selector("predicateForChannelCount:mediaSelectionOption:operatorType:")
    public static native NSPredicate predicateForChannelCountMediaSelectionOptionOperatorType(@NInt long channelCount,
            @NotNull AVMediaSelectionOption mediaSelectionOption, @NUInt long operatorType);

    /**
     * predicateForPresentationHeight:operatorType:
     * 
     * Creates a NSPredicate for presentation size height which can be used with other NSPredicates to express variant
     * preferences.
     * 
     * @param height
     *                     The RHS value for the presentation size height in the predicate equation.
     * @param operatorType
     *                     The valid values are NSLessThanPredicateOperatorType,
     *                     NSLessThanOrEqualToPredicateOperatorType, NSGreaterThanPredicateOperatorType,
     *                     NSGreaterThanOrEqualToPredicateOperatorType, NSEqualToPredicateOperatorType and
     *                     NSNotEqualToPredicateOperatorType.
     */
    @NotNull
    @Generated
    @Selector("predicateForPresentationHeight:operatorType:")
    public static native NSPredicate predicateForPresentationHeightOperatorType(@NFloat double height,
            @NUInt long operatorType);

    /**
     * predicateForPresentationWidth:operatorType:
     * 
     * Creates a NSPredicate for presentation size width which can be used with other NSPredicates to express variant
     * preferences.
     * 
     * @param width
     *                     The RHS value for the presentation size width in the predicate equation.
     * @param operatorType
     *                     The valid values are NSLessThanPredicateOperatorType,
     *                     NSLessThanOrEqualToPredicateOperatorType, NSGreaterThanPredicateOperatorType,
     *                     NSGreaterThanOrEqualToPredicateOperatorType, NSEqualToPredicateOperatorType and
     *                     NSNotEqualToPredicateOperatorType.
     */
    @NotNull
    @Generated
    @Selector("predicateForPresentationWidth:operatorType:")
    public static native NSPredicate predicateForPresentationWidthOperatorType(@NFloat double width,
            @NUInt long operatorType);

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
