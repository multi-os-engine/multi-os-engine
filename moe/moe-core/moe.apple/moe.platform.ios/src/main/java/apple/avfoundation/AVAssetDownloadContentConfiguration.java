package apple.avfoundation;

import apple.NSObject;
import apple.foundation.NSArray;
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
 * AVAssetDownloadContentConfiguration
 * 
 * Represents the configuration consisting of variant and the variant's media options.
 * 
 * API-Since: 15.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVAssetDownloadContentConfiguration extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected AVAssetDownloadContentConfiguration(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVAssetDownloadContentConfiguration alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVAssetDownloadContentConfiguration allocWithZone(VoidPtr zone);

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
    public native AVAssetDownloadContentConfiguration init();

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
     * [@property] mediaSelections
     * 
     * An array of media selections obtained from the AVAsset.
     * 
     * If a media selection is not provided, automatic media selection associated with the asset will be used.
     */
    @NotNull
    @Generated
    @Selector("mediaSelections")
    public native NSArray<? extends AVMediaSelection> mediaSelections();

    @Generated
    @Owned
    @Selector("new")
    public static native AVAssetDownloadContentConfiguration new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] mediaSelections
     * 
     * An array of media selections obtained from the AVAsset.
     * 
     * If a media selection is not provided, automatic media selection associated with the asset will be used.
     */
    @Generated
    @Selector("setMediaSelections:")
    public native void setMediaSelections(@NotNull NSArray<? extends AVMediaSelection> value);

    /**
     * [@property] variantQualifiers
     * 
     * An array of variant qualifiers.
     * 
     * The qualifiers are expected to be added in the preferential order and will be evaluated in that order until the
     * qualifier matches one or more AVAssetVariants. Only those variants which can be played on the current device
     * configuration will be initially chosen for evaluation. If there is more than one match, automatic variant
     * selection will be used to choose among the matched.
     * If a variant qualifier is constructed to explicitly choose a variant, no evaluation is performed and the variant
     * provided will be downloaded as is, even if it is not playable on current device configuration.
     * If a variant qualifier has not been provided, or if the variant qualifier when evaluated does not match any of
     * the variants which can be played according to the current device configuration, automatic variant selection will
     * be used.
     */
    @Generated
    @Selector("setVariantQualifiers:")
    public native void setVariantQualifiers(@NotNull NSArray<? extends AVAssetVariantQualifier> value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * [@property] variantQualifiers
     * 
     * An array of variant qualifiers.
     * 
     * The qualifiers are expected to be added in the preferential order and will be evaluated in that order until the
     * qualifier matches one or more AVAssetVariants. Only those variants which can be played on the current device
     * configuration will be initially chosen for evaluation. If there is more than one match, automatic variant
     * selection will be used to choose among the matched.
     * If a variant qualifier is constructed to explicitly choose a variant, no evaluation is performed and the variant
     * provided will be downloaded as is, even if it is not playable on current device configuration.
     * If a variant qualifier has not been provided, or if the variant qualifier when evaluated does not match any of
     * the variants which can be played according to the current device configuration, automatic variant selection will
     * be used.
     */
    @NotNull
    @Generated
    @Selector("variantQualifiers")
    public native NSArray<? extends AVAssetVariantQualifier> variantQualifiers();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
