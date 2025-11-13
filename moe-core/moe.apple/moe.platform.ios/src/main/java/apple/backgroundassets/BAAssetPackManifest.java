package apple.backgroundassets;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * A representation of a manifest that lists asset packs that are available to download.
 * 
 * This class applies only when you want to manage your asset packs manually. Don’t use this class if you want to opt in
 * to automatic management of asset packs.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("BackgroundAssets")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class BAAssetPackManifest extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected BAAssetPackManifest(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * Creates download objects for every asset pack in this manifest.
     * 
     * The returned download objects can be scheduled with the download manager.
     * - Returns: A collection of download objects.
     * - Remark: Use this method in your main app; use `-allDownloadsForContentRequest:` in your downloader extension.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("allDownloads")
    @NotNull
    public native NSSet<? extends BADownload> allDownloads();

    /**
     * Creates download objects for every asset pack in this manifest.
     * 
     * The returned download objects can be scheduled with the download manager.
     * - Parameter contentRequest: The content request for the current extension invocation.
     * - Returns: A collection of download objects.
     * - Remark: Use this method in your downloader extension; use `-allDownloads` instead in your main app.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("allDownloadsForContentRequest:")
    @NotNull
    public native NSSet<? extends BADownload> allDownloadsForContentRequest(@NInt long contentRequest);

    @Generated
    @Owned
    @Selector("alloc")
    public static native BAAssetPackManifest alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native BAAssetPackManifest allocWithZone(VoidPtr zone);

    /**
     * The asset packs that are available to download.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("assetPacks")
    @NotNull
    public native NSSet<? extends BAAssetPack> assetPacks();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget, @NotNull SEL aSelector,
            @Mapped(ObjCObjectMapper.class) @Nullable Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    @NotNull
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    @NotNull
    public static native Class classForKeyedUnarchiver();

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
    public native BAAssetPackManifest init();

    /**
     * Initializes a representation of a manifest in memory from JSON-encoded data.
     * - Parameters:
     * - data: JSON-encoded data.
     * - applicationGroupIdentifier: The identifier of the application group in which to store unmanaged asset packs
     * that are downloaded from the manifest.
     * - error: A pointer to an error that will be set if an error occurs.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("initFromData:applicationGroupIdentifier:error:")
    public native BAAssetPackManifest initFromDataApplicationGroupIdentifierError(@NotNull NSData data,
            @NotNull String applicationGroupIdentifier,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    /**
     * Initializes a representation of a manifest in memory given a URL to the manifest’s representation as a JSON file
     * on disk.
     * - Parameters:
     * - URL: A URL to a local JSON file.
     * - applicationGroupIdentifier: The identifier of the application group in which to store unmanaged asset packs
     * that are downloaded from the manifest.
     * - error: A pointer to an error that will be set if an error occurs.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("initWithContentsOfURL:applicationGroupIdentifier:error:")
    public native BAAssetPackManifest initWithContentsOfURLApplicationGroupIdentifierError(@NotNull NSURL URL,
            @NotNull String applicationGroupIdentifier,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

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
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native BAAssetPackManifest new_objc();

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
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}