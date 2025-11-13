package apple.shazamkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import apple.foundation.NSData;

/**
 * An object for storing the reference signatures for custom audio recordings and their associated metadata.
 * 
 * Create a custom catalog by adding reference signatures that you generate from audio that you provide. You also add
 * the associated metadata for each signature. Save your custom catalog and share it with others. You can also load a
 * saved catalog.
 * 
 * API-Since: 15.0
 */
@Generated
@Library("ShazamKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SHCustomCatalog extends SHCatalog {
    static {
        NatJ.register();
    }

    @Generated
    protected SHCustomCatalog(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * Loads a saved custom catalog from a file.
     * 
     * - Parameters:
     * - customCatalogURL: The file URL for a custom catalog.
     * - error: An output value in Objective-C that indicates the type of error; otherwise, `nil`.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("addCustomCatalogFromURL:error:")
    public native boolean addCustomCatalogFromURLError(@NotNull NSURL customCatalogURL,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Adds a reference signature and its associated metadata to a catalog.
     * 
     * 
     * > Note:
     * > This system ignores calls to `addReferenceSignature(_:representing:)` after adding the catalog to an
     * `SHSession`.
     * 
     * - Parameters:
     * - signature: The reference signature for the audio recording.
     * - mediaItems: The metadata for the recording.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("addReferenceSignature:representingMediaItems:error:")
    public native boolean addReferenceSignatureRepresentingMediaItemsError(@NotNull SHSignature signature,
            @NotNull NSArray<? extends SHMediaItem> mediaItems,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Owned
    @Selector("alloc")
    public static native SHCustomCatalog alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SHCustomCatalog allocWithZone(VoidPtr zone);

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

    /**
     * Creates a new custom catalog object for storing reference audio signatures and their associated metadata.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("init")
    public native SHCustomCatalog init();

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
     * Creates a new custom catalog object for storing reference audio signatures and their associated metadata.
     * 
     * - Returns: A new custom catalog for storing processed reference audio recordings and their associated metadata.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Owned
    @Selector("new")
    public static native SHCustomCatalog new_objc();

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
     * Saves the custom catalog to a local file.
     * 
     * If `destinationURL` is a directory, the system creates a `Signatures.shazamcatalog` file.
     * 
     * - Parameters:
     * - destinationURL: A URL for the saved custom catalog file.
     * - error: An output value in Objective-C that indicates the type of error; otherwise, `nil`.
     * 
     * - Returns: `YES` if the catalog writes to the file; otherwise, `NO`.
     * 
     * API-Since: 15.0
     * Deprecated-Since: 18.0
     * Deprecated-Message: Use dataRepresentation
     */
    @Deprecated
    @Generated
    @Selector("writeToURL:error:")
    public native boolean writeToURLError(@NotNull NSURL destinationURL,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    /**
     * The data representation of this file, it can be written to disk
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("dataRepresentation")
    @NotNull
    public native NSData dataRepresentation();

    /**
     * Load a @c SHCustomCatalog from data
     * 
     * @param dataRepresentation The data representation of the @c SHCustomCatalog
     * @param error              Error populated if not a valid data representation
     * 
     *                           API-Since: 18.0
     */
    @Generated
    @Selector("initWithDataRepresentation:error:")
    public native SHCustomCatalog initWithDataRepresentationError(@NotNull NSData dataRepresentation,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);
}
