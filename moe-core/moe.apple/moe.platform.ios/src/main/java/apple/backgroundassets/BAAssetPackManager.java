package apple.backgroundassets;

import apple.NSObject;
import apple.backgroundassets.protocol.BAManagedAssetPackDownloadDelegate;
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
import org.moe.natj.general.ann.MappedReturn;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * A class that manages asset packs.
 * 
 * The first time that your code refers to the shared manager, Background Assets considers that your app is opting into
 * automatic system management of your asset packs.
 * - Important: When using the asset-pack manager, make sure that you also adopt the corresponding managed extension
 * protocol. For apps that use Apple hosting, the corresponding protocol is `SKDownloaderExtension` from StoreKit. For
 * other apps, the corresponding protocol is ``BAManagedDownloaderExtension``. Not adopting the right protocol is a
 * programmer error.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("BackgroundAssets")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class BAAssetPackManager extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected BAAssetPackManager(Pointer peer) {
        super(peer);
    }

    /**
     * Returns a URL for the specified relative path.
     * 
     * All asset packs share the same namespace, so you can treat the overall collection of downloaded asset packs as if
     * it were a single root directory that contains all of your subdirectories and asset files, regardless of the
     * specific asset pack in which any particular file resides. Unlike
     * ``BAAssetPackManager/contentsAtPath:searchingInAssetPackWithIdentifier:options:error:`` and
     * ``BAAssetPackManager/fileDescriptorForPath:searchingInAssetPackWithIdentifier:error:``, this method supports
     * retrieving entire directories—including packages—in which case it merges the corresponding slices of the shared
     * logical directory from all downloaded asset packs that contain such slices. If there’s a file-path collision
     * across multiple asset packs, then it’s undefined from which asset pack an individual file will be resolved.
     * - Parameters:
     * - path: The relative file path.
     * - error: A pointer to an error that will be set if an error occurs.
     * - Warning: Don’t persist the returned URL beyond the lifetime of the current process.
     * - Warning: This method is less efficient than are
     * ``BAAssetPackManager/contentsAtPath:searchingInAssetPackWithIdentifier:options:error:`` and
     * ``BAAssetPackManager/fileDescriptorForPath:searchingInAssetPackWithIdentifier:error:``; use those methods instead
     * if you can do so. In particular, this method shouldn’t be used to get the URL to the root of the shared
     * asset-pack namespace. Don’t use this method to block the main thread.
     * - Note: This method will return a well formed URL even if no item exists at the specified relative path in any
     * asset pack, in which case any attempts to get its contents—whether it’s a file or a directory—will fail.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("URLForPath:error:")
    @Nullable
    public native NSURL URLForPathError(@NotNull String path,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native BAAssetPackManager alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native BAAssetPackManager allocWithZone(VoidPtr zone);

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

    /**
     * Gets the latest asset-pack information from the server, updates outdated asset packs, and removes obsolete asset
     * packs.
     * - Parameter completionHandler: A block that receives a set of identifiers of asset packs that are being updated
     * and a set of identifiers of removed asset packs or an error if one occurs.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("checkForUpdatesWithCompletionHandler:")
    public native void checkForUpdatesWithCompletionHandler(
            @ObjCBlock(name = "call_checkForUpdatesWithCompletionHandler") @Nullable Block_checkForUpdatesWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_checkForUpdatesWithCompletionHandler {
        @Generated
        void call_checkForUpdatesWithCompletionHandler(@Nullable NSSet<String> updatingIdentifiers,
                @Nullable NSSet<String> removedIdentifiers, @Nullable NSError error);
    }

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    @NotNull
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    @NotNull
    public static native Class classForKeyedUnarchiver();

    /**
     * Returns the contents of an asset file at the specified relative path.
     * 
     * All asset packs share the same namespace, so you can treat the overall collection of downloaded asset packs as if
     * it were a single root directory that contains all of your subdirectories and asset files, regardless of the
     * specific asset pack in which any particular file resides. If there’s a file-path collision across multiple asset
     * packs, then it’s undefined from which asset pack the file will be read unless you explicitly limit the search to
     * a particular asset pack by passing a non-`nil` identifier to the `assetPackIdentifier` parameter.
     * - Parameters:
     * - path: The relative file path.
     * - assetPackIdentifier: The identifier of the asset pack in which you want to search for the file or `nil` if you
     * want to search in all asset packs.
     * - options: Options for how to read the contents of the file into a data object.
     * - error: A pointer to an error that will be set if an error occurs. If no file is found at `path`, then `error`
     * will point to an `NSError` object with ``BAManagedErrorCode/BAManagedErrorCodeFileNotFound`` as its code.
     * - Returns: The file’s contents.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("contentsAtPath:searchingInAssetPackWithIdentifier:options:error:")
    @Nullable
    public native NSData contentsAtPathSearchingInAssetPackWithIdentifierOptionsError(@NotNull String path,
            @Nullable String assetPackIdentifier, @NUInt long options,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    /**
     * An object that receives notifications about events that occur as an asset pack is downloaded.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    public native BAManagedAssetPackDownloadDelegate delegate();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Ensures that the specified asset pack be available locally.
     * 
     * This method checks if the asset pack is currently downloaded. If it isn’t, then it schedules it to be downloaded
     * and calls the block with `nil` for the block’s `error` parameter when the download completes. It’s guaranteed
     * that the requested asset pack will be available locally once the block is called with `nil` for its `error`
     * parameter. If a non-`nil` value is provided to the block’s `error` parameter, then the asset pack is **not**
     * guaranteed to be available locally. You can optionally monitor download progress by attaching a delegate object
     * to `delegate`.
     * - Parameters:
     * - assetPack: The asset pack the local availability of which to ensure.
     * - completionHandler: A block that’s called when the asset pack is available locally or that receives an error if
     * one occurs.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("ensureLocalAvailabilityOfAssetPack:completionHandler:")
    public native void ensureLocalAvailabilityOfAssetPackCompletionHandler(@NotNull BAAssetPack assetPack,
            @ObjCBlock(name = "call_ensureLocalAvailabilityOfAssetPackCompletionHandler") @NotNull Block_ensureLocalAvailabilityOfAssetPackCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_ensureLocalAvailabilityOfAssetPackCompletionHandler {
        @Generated
        void call_ensureLocalAvailabilityOfAssetPackCompletionHandler(@Nullable NSError error);
    }

    /**
     * Opens and returns a file descriptor for the asset file at the specified relative path.
     * 
     * All asset packs share the same namespace, so you can treat the overall collection of downloaded asset packs as if
     * it were a single root directory that contains all of your subdirectories and asset files, regardless of the
     * specific asset pack in which any particular file resides. If there’s a file-path collision across multiple asset
     * packs, then it’s undefined from which asset pack the file will be opened unless you explicitly limit the search
     * to a particular asset pack by passing a non-`nil` identifier to the `assetPackIdentifier` parameter. A return
     * value of `-1` indicates that an error occurred.
     * - Parameters:
     * - path: The relative file path.
     * - assetPackIdentifier: The identifier of the asset pack in which you want to search for the file or `nil` if you
     * want to search in all asset packs.
     * - error: A pointer to an error that will be set if an error occurs. If no file is found at `path`, then it will
     * point to an `NSError` object with ``BAManagedErrorCode/BAManagedErrorCodeFileNotFound`` as its code.
     * - Returns: A descriptor for the opened file.
     * - Important: It’s your responsibility to close the file descriptor when you’re done using it.
     * - Remark: Use this method if you need low-level access to the file descriptor. If you don’t, then use
     * ``BAAssetPackManager/contentsAtPath:searchingInAssetPackWithIdentifier:options:error:`` instead.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("fileDescriptorForPath:searchingInAssetPackWithIdentifier:error:")
    public native int fileDescriptorForPathSearchingInAssetPackWithIdentifierError(@NotNull String path,
            @Nullable String assetPackIdentifier, @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    /**
     * Gets the asset packs that are available to download.
     * 
     * This method might attempt to get the latest asset-pack information from the server.
     * - Parameter completionHandler: A block that receives the asset packs or an error if one occurs.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("getAllAssetPacksWithCompletionHandler:")
    public native void getAllAssetPacksWithCompletionHandler(
            @ObjCBlock(name = "call_getAllAssetPacksWithCompletionHandler") @NotNull Block_getAllAssetPacksWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getAllAssetPacksWithCompletionHandler {
        @Generated
        void call_getAllAssetPacksWithCompletionHandler(@Nullable NSSet<? extends BAAssetPack> assetPacks,
                @Nullable NSError error);
    }

    /**
     * Gets the asset pack with the given identifier.
     * 
     * If no asset pack with the given identifier is found, then the block will receive an `NSError` object with
     * ``BAManagedErrorCode/BAManagedErrorCodeAssetPackNotFound`` as its code for the `error` parameter. This method
     * might attempt to get the latest asset-pack information from the server.
     * - Parameters:
     * - assetPackIdentifier: The asset pack’s identifier.
     * - completionHandler: A block that receives the asset pack or an error if one occurs.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("getAssetPackWithIdentifier:completionHandler:")
    public native void getAssetPackWithIdentifierCompletionHandler(@NotNull String assetPackIdentifier,
            @ObjCBlock(name = "call_getAssetPackWithIdentifierCompletionHandler") @NotNull Block_getAssetPackWithIdentifierCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getAssetPackWithIdentifierCompletionHandler {
        @Generated
        void call_getAssetPackWithIdentifierCompletionHandler(@Nullable BAAssetPack assetPack, @Nullable NSError error);
    }

    /**
     * Gets the status of the asset pack with the specified identifier.
     * 
     * If no asset pack with the specified identifier is found, then the block will receive an `NSError` object with
     * ``BAManagedErrorCode/BAManagedErrorCodeAssetPackNotFound`` as its code for the `error` parameter. This method
     * attempts to get the latest asset-pack information from the server. No updates or removals are automatically
     * triggered.
     * - Parameters:
     * - assetPackIdentifier: The asset pack’s identifier.
     * - completionHandler: A block that receives the status of the asset pack or an error if one occurs.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("getStatusOfAssetPackWithIdentifier:completionHandler:")
    public native void getStatusOfAssetPackWithIdentifierCompletionHandler(@NotNull String assetPackIdentifier,
            @ObjCBlock(name = "call_getStatusOfAssetPackWithIdentifierCompletionHandler") @NotNull Block_getStatusOfAssetPackWithIdentifierCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getStatusOfAssetPackWithIdentifierCompletionHandler {
        @Generated
        void call_getStatusOfAssetPackWithIdentifierCompletionHandler(@NUInt long status, @Nullable NSError error);
    }

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native BAAssetPackManager init();

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
    public static native BAAssetPackManager new_objc();

    /**
     * Removes the specified asset pack from the device.
     * - Parameters:
     * - assetPackIdentifier: The asset pack’s identifier.
     * - completionHandler: A block that receives an error if one occurs.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("removeAssetPackWithIdentifier:completionHandler:")
    public native void removeAssetPackWithIdentifierCompletionHandler(@NotNull String assetPackIdentifier,
            @ObjCBlock(name = "call_removeAssetPackWithIdentifierCompletionHandler") @Nullable Block_removeAssetPackWithIdentifierCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_removeAssetPackWithIdentifierCompletionHandler {
        @Generated
        void call_removeAssetPackWithIdentifierCompletionHandler(@Nullable NSError error);
    }

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * An object that receives notifications about events that occur as an asset pack is downloaded.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(
            @Mapped(ObjCObjectMapper.class) @Nullable BAManagedAssetPackDownloadDelegate value);

    /**
     * An object that receives notifications about events that occur as an asset pack is downloaded.
     * 
     * API-Since: 26.0
     */
    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) @Nullable BAManagedAssetPackDownloadDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * The shared asset-pack manager.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("sharedManager")
    @NotNull
    public static native BAAssetPackManager sharedManager();

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