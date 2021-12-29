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

/**
 * Configure a custom catalog of @c SHSignature objects to match against
 * <p>
 * Use a custom catalog if you intend to search against reference signatures that you have provided yourself. All matches will be performed locally on the device against the signatures added to this Catalog.
 * [@c] SHMediaItem can be built using custom data that will be returned when a match is made.
 * Once this catalog has been built it can be written to disk and loaded again at a later date.
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
     * Load a pre made Custom catalog from disk
     *
     * @param customCatalogURL The path to the assets
     * @param error            An error if the bundle could not be loaded
     */
    @Generated
    @Selector("addCustomCatalogFromURL:error:")
    public native boolean addCustomCatalogFromURLError(NSURL customCatalogURL,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Add a reference @c SHSignature and its associated @c SHMediaItem for matching
     * <p>
     * Once the @c SHCatalog had been added to a @c SHSession further calls to this method will be ignored
     *
     * @param signature  The reference to match against
     * @param mediaItems The metadata associated with the @c SHSignature
     */
    @Generated
    @Selector("addReferenceSignature:representingMediaItems:error:")
    public native boolean addReferenceSignatureRepresentingMediaItemsError(SHSignature signature,
            NSArray<? extends SHMediaItem> mediaItems, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

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
    public static native boolean automaticallyNotifiesObserversForKey(String key);

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

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

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

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

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
     * Write this Catalog to disk
     * <p>
     * A Catalog can safely be shared among devices
     * [@note] If the `destinationURL` is a directory, a file named Signatures.shazamcatalog will be created
     *
     * @param destinationURL The location to write to
     * @param error          populated on error, otherwise nil
     * @return YES on success, NO on failure with a populated error parameter
     */
    @Generated
    @Selector("writeToURL:error:")
    public native boolean writeToURLError(NSURL destinationURL,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);
}
