package apple.avfoundation;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
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
 * AVAssetDownloadConfiguration
 * 
 * Configuration parameters for the download task.
 * 
 * Download configuration consists of primary and auxiliary content configurations. Primary content configuration
 * represents the primary set of renditions essential for offline playback. Auxiliary content configurations represent
 * additional configurations to complement the primary.
 * For example, the primary content configuration may represent stereo audio renditions and auxiliary configuration may
 * represent complementing multichannel audio renditions.
 * 
 * It is important to configure your download configuration object appropriately before using it to create a download
 * task. Download task makes a copy of the configuration settings you provide and use those settings to configure the
 * task. Once configured, the task object ignores any changes you make to the NSURLSessionConfiguration object. If you
 * need to modify your settings, you must update the download configuration object and use it to create a new download
 * task object.
 * 
 * API-Since: 15.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVAssetDownloadConfiguration extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVAssetDownloadConfiguration(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVAssetDownloadConfiguration alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVAssetDownloadConfiguration allocWithZone(VoidPtr zone);

    /**
     * [@property] assetArtworkData
     * 
     * NSData representing artwork data for this asset. Optional. May be displayed, for example, by the usage pane of
     * the Settings app. Must work with +[UIImage imageWithData:].
     */
    @Nullable
    @Generated
    @Selector("artworkData")
    public native NSData artworkData();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * [@property] auxiliaryContentConfigurations
     * 
     * The auxiliary content for the download. Optional.
     * 
     * By default, auxiliaryContentConfigurations will have one or more default auxiliary content configurations. These
     * content configurations can be augmented with additional content configurations or removed entirely if no
     * auxiliary content is desired.
     */
    @NotNull
    @Generated
    @Selector("auxiliaryContentConfigurations")
    public native NSArray<? extends AVAssetDownloadContentConfiguration> auxiliaryContentConfigurations();

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

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * downloadConfigurationWithAsset:title:
     * 
     * Creates and initializes a download configuration object.
     * 
     * This method will throw an exception if AVURLAsset has been invalidated.
     * 
     * @param asset
     *              The asset to create the download configuration for.
     * @param title
     *              A human readable title for this asset, expected to be as suitable as possible for the user's
     *              preferred languages. Will show up in the usage pane of the settings app.
     */
    @Generated
    @Selector("downloadConfigurationWithAsset:title:")
    public static native AVAssetDownloadConfiguration downloadConfigurationWithAssetTitle(@NotNull AVURLAsset asset,
            @NotNull String title);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native AVAssetDownloadConfiguration init();

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
    public static native AVAssetDownloadConfiguration new_objc();

    /**
     * [@property] optimizesAuxiliaryContentConfigurations
     * 
     * Optimizes auxiliary content selection depending on the primary to minimize total number of video renditions
     * downloaded. True by default.
     * 
     * For example, if the primary content configuration represents stereo renditions and auxiliary content
     * configuration represents multichannel audio renditions, auxiliary multichannel variant will be chosen so as to
     * avoid downloading duplicate video renditions.
     */
    @Generated
    @Selector("optimizesAuxiliaryContentConfigurations")
    public native boolean optimizesAuxiliaryContentConfigurations();

    /**
     * [@property] primaryContentConfiguration
     * 
     * The primary content for the download.
     */
    @NotNull
    @Generated
    @Selector("primaryContentConfiguration")
    public native AVAssetDownloadContentConfiguration primaryContentConfiguration();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] assetArtworkData
     * 
     * NSData representing artwork data for this asset. Optional. May be displayed, for example, by the usage pane of
     * the Settings app. Must work with +[UIImage imageWithData:].
     */
    @Generated
    @Selector("setArtworkData:")
    public native void setArtworkData(@Nullable NSData value);

    /**
     * [@property] auxiliaryContentConfigurations
     * 
     * The auxiliary content for the download. Optional.
     * 
     * By default, auxiliaryContentConfigurations will have one or more default auxiliary content configurations. These
     * content configurations can be augmented with additional content configurations or removed entirely if no
     * auxiliary content is desired.
     */
    @Generated
    @Selector("setAuxiliaryContentConfigurations:")
    public native void setAuxiliaryContentConfigurations(
            @NotNull NSArray<? extends AVAssetDownloadContentConfiguration> value);

    /**
     * [@property] optimizesAuxiliaryContentConfigurations
     * 
     * Optimizes auxiliary content selection depending on the primary to minimize total number of video renditions
     * downloaded. True by default.
     * 
     * For example, if the primary content configuration represents stereo renditions and auxiliary content
     * configuration represents multichannel audio renditions, auxiliary multichannel variant will be chosen so as to
     * avoid downloading duplicate video renditions.
     */
    @Generated
    @Selector("setOptimizesAuxiliaryContentConfigurations:")
    public native void setOptimizesAuxiliaryContentConfigurations(boolean value);

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
