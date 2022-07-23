package apple.imagecapturecore;

import apple.NSObject;
import apple.coregraphics.opaque.CGImageRef;
import apple.foundation.NSArray;
import apple.foundation.NSDate;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSMutableDictionary;
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
 * -----------------------------------------------------------------------------------------------------------------
 * ICCameraItem
 * <p>
 * ICCameraItem
 * <p>
 * ICCameraItem is an abstract class that represents an item in an ICCameraDevice object. ICCameraDevice object creates
 * instances of two concrete subclasses of ICCameraItem: ICCameraFolder and ICCameraFile.
 */
@Generated
@Library("ImageCaptureCore")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class ICCameraItem extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected ICCameraItem(Pointer peer) {
        super(peer);
    }

    /**
     * [@property] UTI
     * <p>
     * ￼Item UTI. This is an Uniform Type Identifier string. It is one of: kUTTypeFolder, kUTTypeImage, kUTTypeMovie,
     * kUTTypeAudio, or kUTTypeData.
     */
    @Generated
    @Selector("UTI")
    public native String UTI();

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native ICCameraItem alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native ICCameraItem allocWithZone(VoidPtr zone);

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

    /**
     * [@property] creationDate
     * <p>
     * ￼Creation date of this file. This information is usually the same as the EXIF creation date.
     */
    @Generated
    @Selector("creationDate")
    public native NSDate creationDate();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * [@property] device
     * <p>
     * ￼Parent device of this item.
     */
    @Generated
    @Selector("device")
    public native ICCameraDevice device();

    /**
     * flushMetadataCache
     * <p>
     * ￼Deletes cached metadata for the item.
     */
    @Generated
    @Selector("flushMetadataCache")
    public native void flushMetadataCache();

    /**
     * flushThumbnailCache
     * <p>
     * ￼Deletes cached thumbnail for the item.
     */
    @Generated
    @Selector("flushThumbnailCache")
    public native void flushThumbnailCache();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native ICCameraItem init();

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

    /**
     * [@property] inTemporaryStore
     * <p>
     * ￼Indicates if this folder is in a temporary store. A temporary store may be used by the device when images are
     * captures on the device when it is tethered to the computer.
     */
    @Generated
    @Selector("isInTemporaryStore")
    public native boolean isInTemporaryStore();

    /**
     * [@property] locked
     * <p>
     * ￼Indicates the protection state of this item. It is locked if the storage card in the camera is locked.
     */
    @Generated
    @Selector("isLocked")
    public native boolean isLocked();

    /**
     * [@property] raw
     * <p>
     * ￼Indicates if the file is a raw image file.
     */
    @Generated
    @Selector("isRaw")
    public native boolean isRaw();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    /**
     * [@property] largeThumbnailIfAvailable
     */
    @Generated
    @Selector("largeThumbnailIfAvailable")
    public native CGImageRef largeThumbnailIfAvailable();

    /**
     * [@property] metadata
     * <p>
     * ￼Metadata for the item. The value of this property is NULL unless a 'requestMetadata' message is sent to this
     * object.
     */
    @Generated
    @Selector("metadata")
    public native NSDictionary<?, ?> metadata();

    /**
     * [@property] metadataIfAvailable
     */
    @Generated
    @Selector("metadataIfAvailable")
    public native NSDictionary<String, ?> metadataIfAvailable();

    /**
     * [@property] modificationDate
     * <p>
     * ￼Modification date of this file. This information is usually the same as the EXIF modification date.
     */
    @Generated
    @Selector("modificationDate")
    public native NSDate modificationDate();

    /**
     * [@property] name
     * <p>
     * ￼Name of this item.
     */
    @Generated
    @Selector("name")
    public native String name();

    @Generated
    @Owned
    @Selector("new")
    public static native ICCameraItem new_objc();

    /**
     * [@property] parentFolder
     * <p>
     * ￼Parent folder of this folder. The root folder's parentFolder is nil.
     */
    @Generated
    @Selector("parentFolder")
    public native ICCameraFolder parentFolder();

    /**
     * [@property] ptpObjectHandle
     * <p>
     * PTP object handle value if the item is on a camera that uses PTP protocol. The value of this property is set to 0
     * if the camera does not use PTP protocol.
     */
    @Generated
    @Selector("ptpObjectHandle")
    public native int ptpObjectHandle();

    /**
     * requestMetadata
     * <p>
     * ￼Metadata for the file if one is readily available. If one is not readily available, accessing this property will
     * send a message to the device requesting metadata for the file. The delegate of the device will be notified via
     * method "cameraDevice:didReceiveMetadata:forItem:error:", if this method is implemented by the delegate.
     * [@note] Execution of the delegate callback will occur on the main thread.
     */
    @Generated
    @Selector("requestMetadata")
    public native void requestMetadata();

    /**
     * requestThumbnail
     * <p>
     * This method requests thumbnail for the item. If one is not readily available, accessing this property will send a
     * message to the device requesting a thumbnail for the file. The delegate of the device will be notified via method
     * "cameraDevice:didReceiveThumbnail:forItem:error:", if this method is implemented by the delegate.
     * [@note] Execution of the delegate callback will occur on the main thread.
     */
    @Generated
    @Selector("requestThumbnail")
    public native void requestThumbnail();

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

    /**
     * [@property] thumbnail
     * <p>
     * ￼Thumbnail for the item. The value of this property is NULL unless a 'requestThumbnail' message is sent to this
     * object.
     */
    @Generated
    @Selector("thumbnail")
    public native CGImageRef thumbnail();

    /**
     * [@property] thumbnailIfAvailable
     */
    @Generated
    @Selector("thumbnailIfAvailable")
    public native CGImageRef thumbnailIfAvailable();

    /**
     * [@property] userData
     * <p>
     * ￼A mutable dictionary to store arbitrary key-value pairs associated with a camera item object. This can be used
     * by
     * view objects that bind to this object to store "house-keeping" information.
     */
    @Generated
    @Selector("userData")
    public native NSMutableDictionary<?, ?> userData();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * [@property] addedAfterContentCatalogCompleted
     * <p>
     * This property is set if the file is captured on the device after the device's content is fully enumerated. This
     * does
     * not apply to files added as a result of adding a new store to the device.
     */
    @Generated
    @Selector("wasAddedAfterContentCatalogCompleted")
    public native boolean wasAddedAfterContentCatalogCompleted();
}
