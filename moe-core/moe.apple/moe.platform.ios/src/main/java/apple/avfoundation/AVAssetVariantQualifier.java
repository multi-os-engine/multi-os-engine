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
 * The qualifier of an asset variant.
 * 
 * Subclasses of this type that are used from Swift must fulfill the requirements of a Sendable type.
 * 
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
     * Returns a qualifer for a predicate.
     * 
     * - Parameter predicate: The variant predicate. Must be a valid, non-nil NSPredicate.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("assetVariantQualifierWithPredicate:")
    public static native AVAssetVariantQualifier assetVariantQualifierWithPredicate(@NotNull NSPredicate predicate);

    /**
     * Returns a qualifer for a particular asset variant.
     * 
     * - Parameter variant: A variant obtained from the -[AVAsset variants] or -[AVAssetDownloadConfiguration
     * playableVariants]. Must be a valid, non-nil AVAssetVariant.
     * 
     * API-Since: 15.0
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
     * Creates a NSPredicate for audio channel count which can be used with other NSPredicates to express variant
     * preferences.
     * 
     * - Parameter channelCount: The RHS value for the channel count in the predicate equation.
     * - Parameter mediaSelectionOption: The audio media selection option under consideration.
     * - Parameter operatorType: The valid values are NSLessThanPredicateOperatorType,
     * NSLessThanOrEqualToPredicateOperatorType, NSGreaterThanPredicateOperatorType,
     * NSGreaterThanOrEqualToPredicateOperatorType, NSEqualToPredicateOperatorType and
     * NSNotEqualToPredicateOperatorType.
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("predicateForChannelCount:mediaSelectionOption:operatorType:")
    public static native NSPredicate predicateForChannelCountMediaSelectionOptionOperatorType(@NInt long channelCount,
            @Nullable AVMediaSelectionOption mediaSelectionOption, @NUInt long operatorType);

    /**
     * Creates a NSPredicate for presentation size height which can be used with other NSPredicates to express variant
     * preferences.
     * 
     * - Parameter height: The RHS value for the presentation size height in the predicate equation.
     * - Parameter operatorType: The valid values are NSLessThanPredicateOperatorType,
     * NSLessThanOrEqualToPredicateOperatorType, NSGreaterThanPredicateOperatorType,
     * NSGreaterThanOrEqualToPredicateOperatorType, NSEqualToPredicateOperatorType and
     * NSNotEqualToPredicateOperatorType.
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("predicateForPresentationHeight:operatorType:")
    public static native NSPredicate predicateForPresentationHeightOperatorType(@NFloat double height,
            @NUInt long operatorType);

    /**
     * Creates a NSPredicate for presentation size width which can be used with other NSPredicates to express variant
     * preferences.
     * 
     * - Parameter width: The RHS value for the presentation size width in the predicate equation.
     * - Parameter operatorType: The valid values are NSLessThanPredicateOperatorType,
     * NSLessThanOrEqualToPredicateOperatorType, NSGreaterThanPredicateOperatorType,
     * NSGreaterThanOrEqualToPredicateOperatorType, NSEqualToPredicateOperatorType and
     * NSNotEqualToPredicateOperatorType.
     * 
     * API-Since: 15.0
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

    /**
     * Creates a NSPredicate for binaural which can be used with other NSPredicates to express variant preferences.
     * 
     * - Parameter isBinaural: The RHS value for the value of isBinauralAudio in the predicate equation.
     * - Parameter mediaSelectionOption: The audio media selection option under consideration.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("predicateForBinauralAudio:mediaSelectionOption:")
    @NotNull
    public static native NSPredicate predicateForBinauralAudioMediaSelectionOption(boolean isBinauralAudio,
            @Nullable AVMediaSelectionOption mediaSelectionOption);

    /**
     * Creates a NSPredicate for immersive audio which can be used with other NSPredicates to express variant
     * preferences.
     * 
     * - Parameter isDownmixAudio: The RHS value for the value of isDownmixAudio in the predicate equation.
     * - Parameter mediaSelectionOption: The audio media selection option under consideration.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("predicateForDownmixAudio:mediaSelectionOption:")
    @NotNull
    public static native NSPredicate predicateForDownmixAudioMediaSelectionOption(boolean isDownmixAudio,
            @Nullable AVMediaSelectionOption mediaSelectionOption);

    /**
     * Creates a NSPredicate for immersive audio which can be used with other NSPredicates to express variant
     * preferences.
     * 
     * - Parameter isImmersiveAudio: The RHS value for the value of isImmersiveAudio in the predicate equation.
     * - Parameter mediaSelectionOption: The audio media selection option under consideration.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("predicateForImmersiveAudio:mediaSelectionOption:")
    @NotNull
    public static native NSPredicate predicateForImmersiveAudioMediaSelectionOption(boolean isImmersiveAudio,
            @Nullable AVMediaSelectionOption mediaSelectionOption);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    /**
     * Creates a NSPredicate for audio sample rate which can be used with other NSPredicates to express variant
     * preferences.
     * 
     * - Parameter sampleRate: The RHS value for the sample rate in the predicate equation.
     * - Parameter mediaSelectionOption: The audio media selection option under consideration.
     * - Parameter operatorType: The valid values are NSLessThanPredicateOperatorType,
     * NSLessThanOrEqualToPredicateOperatorType, NSGreaterThanPredicateOperatorType,
     * NSGreaterThanOrEqualToPredicateOperatorType, NSEqualToPredicateOperatorType and
     * NSNotEqualToPredicateOperatorType.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("predicateForAudioSampleRate:mediaSelectionOption:operatorType:")
    @NotNull
    public static native NSPredicate predicateForAudioSampleRateMediaSelectionOptionOperatorType(double sampleRate,
            @Nullable AVMediaSelectionOption mediaSelectionOption, @NUInt long operatorType);

    /**
     * Creates a NSPredicate for audio sample rate which can be used with other NSPredicates to express variant
     * preferences.
     * 
     * Predicate will be evaluated on the media selection option selected for the asset.
     * Media selection options for primary assets may be specified in the AVAssetDownloadConfiguration mediaSelections
     * property.
     * Media selection options for interstitial assets may be circumscribed by -[AVAssetDownloadConfiguration
     * setInterstitialMediaSelectionCriteria: forMediaCharacteristic:].
     * 
     * - Parameter sampleRate: The RHS value for the sample rate in the predicate equation.
     * - Parameter operatorType: The valid values are NSLessThanPredicateOperatorType,
     * NSLessThanOrEqualToPredicateOperatorType, NSGreaterThanPredicateOperatorType,
     * NSGreaterThanOrEqualToPredicateOperatorType, NSEqualToPredicateOperatorType and
     * NSNotEqualToPredicateOperatorType.
     * 
     * API-Since: 18.5
     */
    @Generated
    @Selector("predicateForAudioSampleRate:operatorType:")
    @NotNull
    public static native NSPredicate predicateForAudioSampleRateOperatorType(double sampleRate,
            @NUInt long operatorType);

    /**
     * Creates a NSPredicate for binaural which can be used with other NSPredicates to express variant preferences.
     * 
     * - Parameter isBinaural: The RHS value for the value of isBinauralAudio in the predicate equation.
     * 
     * API-Since: 18.5
     */
    @Generated
    @Selector("predicateForBinauralAudio:")
    @NotNull
    public static native NSPredicate predicateForBinauralAudio(boolean isBinauralAudio);

    /**
     * Creates a NSPredicate for audio channel count which can be used with other NSPredicates to express variant
     * preferences.
     * 
     * Predicate will be evaluated on the media selection option selected for the asset.
     * Media selection options for primary assets may be specified in the AVAssetDownloadConfiguration mediaSelections
     * property.
     * Media selection options for interstitial assets may be circumscribed by -[AVAssetDownloadConfiguration
     * setInterstitialMediaSelectionCriteria: forMediaCharacteristic:].
     * 
     * - Parameter channelCount: The RHS value for the channel count in the predicate equation.
     * - Parameter operatorType: The valid values are NSLessThanPredicateOperatorType,
     * NSLessThanOrEqualToPredicateOperatorType, NSGreaterThanPredicateOperatorType,
     * NSGreaterThanOrEqualToPredicateOperatorType, NSEqualToPredicateOperatorType and
     * NSNotEqualToPredicateOperatorType.
     * 
     * API-Since: 18.5
     */
    @Generated
    @Selector("predicateForChannelCount:operatorType:")
    @NotNull
    public static native NSPredicate predicateForChannelCountOperatorType(@NInt long channelCount,
            @NUInt long operatorType);

    /**
     * Creates a NSPredicate for immersive audio which can be used with other NSPredicates to express variant
     * preferences.
     * 
     * Predicate will be evaluated on the media selection option selected for the asset.
     * Media selection options for primary assets may be specified in the AVAssetDownloadConfiguration mediaSelections
     * property.
     * Media selection options for interstitial assets may be circumscribed by -[AVAssetDownloadConfiguration
     * setInterstitialMediaSelectionCriteria: forMediaCharacteristic:].
     * 
     * - Parameter isDownmixAudio: The RHS value for the value of isDownmixAudio in the predicate equation.
     * 
     * API-Since: 18.5
     */
    @Generated
    @Selector("predicateForDownmixAudio:")
    @NotNull
    public static native NSPredicate predicateForDownmixAudio(boolean isDownmixAudio);

    /**
     * Creates a NSPredicate for immersive audio which can be used with other NSPredicates to express variant
     * preferences.
     * 
     * Predicate will be evaluated on the media selection option selected for the asset.
     * Media selection options for primary assets may be specified in the AVAssetDownloadConfiguration mediaSelections
     * property.
     * Media selection options for interstitial assets may be circumscribed by -[AVAssetDownloadConfiguration
     * setInterstitialMediaSelectionCriteria: forMediaCharacteristic:].
     * 
     * - Parameter isImmersiveAudio: The RHS value for the value of isImmersiveAudio in the predicate equation.
     * 
     * API-Since: 18.5
     */
    @Generated
    @Selector("predicateForImmersiveAudio:")
    @NotNull
    public static native NSPredicate predicateForImmersiveAudio(boolean isImmersiveAudio);
}
