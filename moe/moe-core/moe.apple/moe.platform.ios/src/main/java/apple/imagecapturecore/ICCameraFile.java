package apple.imagecapturecore;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSDate;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSProgress;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * ----------------------------------------------------------------------------------------------------------------- ICCameraFile
 * <p>
 * ICCameraFile
 * <p>
 * This class represents a file on an ICCameraDevice object.
 */
@Generated
@Library("ImageCaptureCore")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class ICCameraFile extends ICCameraItem {
    static {
        NatJ.register();
    }

    @Generated
    protected ICCameraFile(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native ICCameraFile alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native ICCameraFile allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * [@property] burstFavorite
     * <p>
     * True if burst favorite, ignored if not in a burst or not a burst favorite.
     */
    @Generated
    @Selector("burstFavorite")
    public native boolean burstFavorite();

    /**
     * [@property] burstPicked
     * <p>
     * True if burst user picked, ignored if not in a burst or not a burst user picked.
     */
    @Generated
    @Selector("burstPicked")
    public native boolean burstPicked();

    /**
     * [@property] burstUUID
     * <p>
     * burstUUID of file if present, nil if not in a burst.
     */
    @Generated
    @Selector("burstUUID")
    public native String burstUUID();

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
     * [@property] createdFilename
     * <p>
     * Created filename
     */
    @Generated
    @Selector("createdFilename")
    public native String createdFilename();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * [@property] duration
     * <p>
     * ￼Duration of audio/video file in seconds.
     */
    @Generated
    @Selector("duration")
    public native double duration();

    /**
     * [@property] exifCreationDate
     * <p>
     * Properties will either represent the exif creation
     * date, or nil.
     */
    @Generated
    @Selector("exifCreationDate")
    public native NSDate exifCreationDate();

    /**
     * [@property] exifModificationDate
     * <p>
     * Properties will either represent the exif modification
     * date, or nil.
     */
    @Generated
    @Selector("exifModificationDate")
    public native NSDate exifModificationDate();

    /**
     * [@property] fileCreationDate
     * <p>
     * Properties will either represent the actual file creation
     * date, or nil.
     */
    @Generated
    @Selector("fileCreationDate")
    public native NSDate fileCreationDate();

    /**
     * [@property] fileModificationDate
     * <p>
     * Properties will either represent the actual file modification
     * date, or nil.
     */
    @Generated
    @Selector("fileModificationDate")
    public native NSDate fileModificationDate();

    /**
     * [@property] fileSize
     * <p>
     * ￼Size of file in bytes.
     */
    @Generated
    @Selector("fileSize")
    public native long fileSize();

    /**
     * [@property] firstPicked
     * <p>
     * True if file is a firstPicked nil otherwise.
     */
    @Generated
    @Selector("firstPicked")
    public native boolean firstPicked();

    /**
     * [@property] gpsString
     * <p>
     * GPS String in standard format.
     */
    @Generated
    @Selector("gpsString")
    public native String gpsString();

    /**
     * [@property] groupUUID
     * <p>
     * groupUUID of file if present, nil if file has no groupUUID.
     */
    @Generated
    @Selector("groupUUID")
    public native String groupUUID();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * [@property] height
     * <p>
     * Height of an image or movie frame.
     */
    @Generated
    @Selector("height")
    @NInt
    public native long height();

    /**
     * [@property] highFramerate
     * <p>
     * True if file is a slo-mo or high framerate video file, nil otherwise.
     */
    @Generated
    @Selector("highFramerate")
    public native boolean highFramerate();

    @Generated
    @Selector("init")
    public native ICCameraFile init();

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
    public static native ICCameraFile new_objc();

    /**
     * [@property] orientation
     * <p>
     * ￼Desired orientation of image to use when it is downloaded.
     * <p>
     * This property is set to ICEXIFOrientation1 initially. If the format of this file supports EXIF orientation tag, then this property will be updated to match the value of that tag, when the thumbnail or metadata for this file is received.
     */
    @Generated
    @Selector("orientation")
    @NUInt
    public native long orientation();

    /**
     * [@property] originalFilename
     * <p>
     * Original filename on disk
     */
    @Generated
    @Selector("originalFilename")
    public native String originalFilename();

    /**
     * [@property] originatingAssetID
     * <p>
     * originatingAssetID of file if present, nil if not a HEIF or HVEC.
     */
    @Generated
    @Selector("originatingAssetID")
    public native String originatingAssetID();

    /**
     * [@property] pairedRawImage
     * <p>
     * A single item subset of the sidecarFiles array, which contains the logical RAW compliment of a JPG or other
     * format image.
     */
    @Generated
    @Selector("pairedRawImage")
    public native ICCameraFile pairedRawImage();

    /**
     * [@property] relatedUUID
     * <p>
     * Internal related UUID for dbg/aae/etc.
     */
    @Generated
    @Selector("relatedUUID")
    public native String relatedUUID();

    /**
     * requestDownloadWithOptions:progressDelegate:completion
     * <p>
     * ￼Perform a download request and execute the block callback in place of the delegate.
     * [@note] The completion block will execute on an any available queue, often this will not be the main queue.
     *
     * @param options    Dictionary Keys:
     *                   <p>
     *                   - `ICDownloadsDirectoryURL`
     *                   - `ICSaveAsFilename`
     *                   - `ICOverwriteExistingFile`
     *                   - `ICDeleteAfterDownload`
     *                   - `ICAdjustCreationDate`
     * @param completion Completion block to executed after request has returned,
     */
    @Generated
    @Selector("requestDownloadWithOptions:completion:")
    public native NSProgress requestDownloadWithOptionsCompletion(NSDictionary<String, ?> options,
            @ObjCBlock(name = "call_requestDownloadWithOptionsCompletion") Block_requestDownloadWithOptionsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestDownloadWithOptionsCompletion {
        @Generated
        void call_requestDownloadWithOptionsCompletion(String filename, NSError error);
    }

    /**
     * requestMetadataDictionaryWithOptions:completion
     * <p>
     * ￼Perform a metadata request and execute the block callback in place of the delegate.
     * [@note] The completion block will execute on an any available queue, often this will not be the main queue.
     *
     * @param options    Options dictionary
     * @param completion Completion block called with an NSDictionary* object containing the metadata, and an NSError* for status.
     */
    @Generated
    @Selector("requestMetadataDictionaryWithOptions:completion:")
    public native void requestMetadataDictionaryWithOptionsCompletion(NSDictionary<String, ?> options,
            @ObjCBlock(name = "call_requestMetadataDictionaryWithOptionsCompletion") Block_requestMetadataDictionaryWithOptionsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestMetadataDictionaryWithOptionsCompletion {
        @Generated
        void call_requestMetadataDictionaryWithOptionsCompletion(NSDictionary<?, ?> arg0, NSError arg1);
    }

    /**
     * requestReadDataAtOffset:length:completion
     * <p>
     * This method asynchronously reads data of a specified length from a specified offset.
     * [@note] The completion block will execute on an any available queue, often this will not be the main queue.
     *
     * @param offset     The offset into the file to start reading from
     * @param length     The length of data to be read.
     * @param completion Completion block called with an NSData* object representing the data, and an NSError* for status.
     */
    @Generated
    @Selector("requestReadDataAtOffset:length:completion:")
    public native void requestReadDataAtOffsetLengthCompletion(long offset, long length,
            @ObjCBlock(name = "call_requestReadDataAtOffsetLengthCompletion") Block_requestReadDataAtOffsetLengthCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestReadDataAtOffsetLengthCompletion {
        @Generated
        void call_requestReadDataAtOffsetLengthCompletion(NSData arg0, NSError arg1);
    }

    /**
     * requestThumbnailDataWithOptions:completion
     * <p>
     * ￼Perform a thumbnail request and execute the block callback in place of the delegate.
     * [@note] The completion block will execute on an any available queue, often this will not be the main queue.
     *
     * @param options    Options dictionary
     *                   <p>
     *                   - 'kCGImageSourceThumbnailMaxPixelSize' - Request a width different from the embedded EXIF thumbnail
     * @param completion Completion block called with an NSData* object representing the JPG, and an NSError* for status.
     */
    @Generated
    @Selector("requestThumbnailDataWithOptions:completion:")
    public native void requestThumbnailDataWithOptionsCompletion(NSDictionary<String, ?> options,
            @ObjCBlock(name = "call_requestThumbnailDataWithOptionsCompletion") Block_requestThumbnailDataWithOptionsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestThumbnailDataWithOptionsCompletion {
        @Generated
        void call_requestThumbnailDataWithOptionsCompletion(NSData arg0, NSError arg1);
    }

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] orientation
     * <p>
     * ￼Desired orientation of image to use when it is downloaded.
     * <p>
     * This property is set to ICEXIFOrientation1 initially. If the format of this file supports EXIF orientation tag, then this property will be updated to match the value of that tag, when the thumbnail or metadata for this file is received.
     */
    @Generated
    @Selector("setOrientation:")
    public native void setOrientation(@NUInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * [@property] sidecarFiles
     * <p>
     * This property is NULL if there are no sidecar files associated with this file. Otherwise it is an array of
     * ICCameraFile instances of sidecar files associated with this file. An example of a sidecar file is a file with the same base
     * name as this file and having an extension XMP.
     */
    @Generated
    @Selector("sidecarFiles")
    public native NSArray<? extends ICCameraItem> sidecarFiles();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * [@property] timeLapse
     * <p>
     * True if file is a time-lapse video file, nil otherwise.
     */
    @Generated
    @Selector("timeLapse")
    public native boolean timeLapse();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * [@property] width
     * <p>
     * Width of an image or movie frame.
     */
    @Generated
    @Selector("width")
    @NInt
    public native long width();
}
