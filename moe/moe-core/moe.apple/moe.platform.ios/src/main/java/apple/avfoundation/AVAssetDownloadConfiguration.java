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

/**
 * AVAssetDownloadConfiguration
 * <p>
 * Configuration parameters for the download task.
 * <p>
 * Download configuration consists of primary and auxiliary content configurations. Primary content configuration represents the primary set of renditions essential for offline playback. Auxiliary content configurations represent additional configurations to complement the primary.
 * For example, the primary content configuration may represent stereo audio renditions and auxiliary configuration may represent complementing multichannel audio renditions.
 * <p>
 * It is important to configure your download configuration object appropriately before using it to create a download task. Download task makes a copy of the configuration settings you provide and use those settings to configure the task. Once configured, the task object ignores any changes you make to the NSURLSessionConfiguration object. If you need to modify your settings, you must update the download configuration object and use it to create a new download task object.
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

    @Generated
    @Selector("allocWithZone:")
    public static native AVAssetDownloadConfiguration allocWithZone(VoidPtr zone);

    /**
     * [@property]		assetArtworkData
     * <p>
     * NSData representing artwork data for this asset. Optional. May be displayed, for example, by the usage pane of the Settings app. Must work with +[UIImage imageWithData:].
     */
    @Generated
    @Selector("artworkData")
    public native NSData artworkData();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * [@property]		auxiliaryContentConfigurations
     * <p>
     * The auxiliary content for the download. Optional.
     * <p>
     * By default, auxiliaryContentConfigurations will have one or more default auxiliary content configurations. These content configurations can be augmented with additional content configurations or removed entirely if no auxiliary content is desired.
     */
    @Generated
    @Selector("auxiliaryContentConfigurations")
    public native NSArray<? extends AVAssetDownloadContentConfiguration> auxiliaryContentConfigurations();

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
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * downloadConfigurationWithAsset:title:
     * <p>
     * Creates and initializes a download configuration object.
     * <p>
     * This method will throw an exception if AVURLAsset has been invalidated.
     *
     * @param            asset The asset to create the download configuration for.
     * @param            title A human readable title for this asset, expected to be as suitable as possible for the user's preferred languages. Will show up in the usage pane of the settings app.
     */
    @Generated
    @Selector("downloadConfigurationWithAsset:title:")
    public static native AVAssetDownloadConfiguration downloadConfigurationWithAssetTitle(AVURLAsset asset,
            String title);

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

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native AVAssetDownloadConfiguration new_objc();

    /**
     * [@property]		optimizesAuxiliaryContentConfigurations
     * <p>
     * Optimizes auxiliary content selection depending on the primary to minimize total number of video renditions downloaded. True by default.
     * <p>
     * For example, if the primary content configuration represents stereo renditions and auxiliary content configuration represents multichannel audio renditions, auxiliary multichannel variant will be chosen so as to avoid downloading duplicate video renditions.
     */
    @Generated
    @Selector("optimizesAuxiliaryContentConfigurations")
    public native boolean optimizesAuxiliaryContentConfigurations();

    /**
     * [@property]		primaryContentConfiguration
     * <p>
     * The primary content for the download.
     */
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
     * [@property]		assetArtworkData
     * <p>
     * NSData representing artwork data for this asset. Optional. May be displayed, for example, by the usage pane of the Settings app. Must work with +[UIImage imageWithData:].
     */
    @Generated
    @Selector("setArtworkData:")
    public native void setArtworkData(NSData value);

    /**
     * [@property]		auxiliaryContentConfigurations
     * <p>
     * The auxiliary content for the download. Optional.
     * <p>
     * By default, auxiliaryContentConfigurations will have one or more default auxiliary content configurations. These content configurations can be augmented with additional content configurations or removed entirely if no auxiliary content is desired.
     */
    @Generated
    @Selector("setAuxiliaryContentConfigurations:")
    public native void setAuxiliaryContentConfigurations(NSArray<? extends AVAssetDownloadContentConfiguration> value);

    /**
     * [@property]		optimizesAuxiliaryContentConfigurations
     * <p>
     * Optimizes auxiliary content selection depending on the primary to minimize total number of video renditions downloaded. True by default.
     * <p>
     * For example, if the primary content configuration represents stereo renditions and auxiliary content configuration represents multichannel audio renditions, auxiliary multichannel variant will be chosen so as to avoid downloading duplicate video renditions.
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
