package apple.imagecapturecore;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSProgress;
import apple.foundation.NSSet;
import apple.imagecapturecore.protocol.ICCameraDeviceDownloadDelegate;
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
 * --------------------------------------------------------------------------------------------------------------- ICCameraDevice
 * <p>
 * ICCameraDevice
 * <p>
 * ICCameraDevice is a concrete subclass of ICDevice class. ICDeviceBrowser creates instances of this class.
 */
@Generated
@Library("ImageCaptureCore")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class ICCameraDevice extends ICDevice {
    static {
        NatJ.register();
    }

    @Generated
    protected ICCameraDevice(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native ICCameraDevice alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native ICCameraDevice allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * [@property] batteryLevel
     * <p>
     * ￼Indicates the battery charge level. Its value ranges from 0 to 100.
     */
    @Generated
    @Selector("batteryLevel")
    @NUInt
    public native long batteryLevel();

    /**
     * [@property] batteryLevelAvailable
     * <p>
     * Indicates if the device has reported battery charge level￼.
     */
    @Generated
    @Selector("batteryLevelAvailable")
    public native boolean batteryLevelAvailable();

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
     * [@property] contentCatalogPercentCompleted
     * <p>
     * ￼Indicates the percentage of content cataloging completed on the device. Its value ranges from 0 to 100.
     */
    @Generated
    @Selector("contentCatalogPercentCompleted")
    @NUInt
    public native long contentCatalogPercentCompleted();

    /**
     * [@property] contents
     * <p>
     * ￼Contents of the camera. The structure of the elements in this array will reflect the folder structure of the storage reported by the camera. Each item in this array will correspond to a storage on the camera.
     */
    @Generated
    @Selector("contents")
    public native NSArray<? extends ICCameraItem> contents();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * filesOfType:
     * <p>
     * This method returns an array of files on the camera of type fileType.
     * <p>
     * The fileType string is one of the following Uniform Type Identifier strings: kUTTypeImage, kUTTypeMovie, kUTTypeAudio, or kUTTypeData.
     */
    @Generated
    @Selector("filesOfType:")
    public native NSArray<String> filesOfType(String fileUTType);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * [@property] iCloudPhotosEnabled
     * <p>
     * Set to YES if the device is made by Apple and is pass-coded locked and connected to an untrusted host.
     */
    @Generated
    @Selector("iCloudPhotosEnabled")
    public native boolean iCloudPhotosEnabled();

    @Generated
    @Selector("init")
    public native ICCameraDevice init();

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
     * [@property] accessRestrictedAppleDevice
     * <p>
     * Set to YES if the device is made by Apple and is pass-coded locked and connected to an untrusted host.
     */
    @Generated
    @Selector("isAccessRestrictedAppleDevice")
    public native boolean isAccessRestrictedAppleDevice();

    /**
     * [@property] ejectable
     * <p>
     * ￼Indicates whether the device can be 'soft' removed or disconnected.
     */
    @Generated
    @Selector("isEjectable")
    public native boolean isEjectable();

    /**
     * [@property] locked
     * <p>
     * ￼Indicates whether the device is locked.  A locked device does not allow for deletion of any asset.
     */
    @Generated
    @Selector("isLocked")
    public native boolean isLocked();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    /**
     * [@property] mediaFiles
     * <p>
     * ￼The property mediaFiles represents all image, movie and audio files on the camera. These files are returned as a single array without regard to the folder hierarchy used to store these files on the camera.
     */
    @Generated
    @Selector("mediaFiles")
    public native NSArray<? extends ICCameraItem> mediaFiles();

    @Generated
    @Owned
    @Selector("new")
    public static native ICCameraDevice new_objc();

    /**
     * [@property] ptpEventHandler
     * <p>
     * As an alternative to setting up an object to handle PTP event packets, a handler can be set.  The handler will always be called in place of the delegate if non-nil.  If the handler is not present, the delegate will be called if present. It is guaranteed only one of the methods will be called if both are implemented.
     */
    @Generated
    @Selector("ptpEventHandler")
    @ObjCBlock(name = "call_ptpEventHandler_ret")
    public native Block_ptpEventHandler_ret ptpEventHandler();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_ptpEventHandler_ret {
        @Generated
        void call_ptpEventHandler_ret(NSData arg0);
    }

    /**
     * requestDeleteFiles
     * <p>
     * Deletes files.
     */
    @Generated
    @Selector("requestDeleteFiles:")
    public native void requestDeleteFiles(NSArray<? extends ICCameraItem> files);

    /**
     * requestDeleteFiles:deleteFailed:completion
     * <p>
     * Allows for deletion of an array of ICCameraItem objects, with the added ability to catch delete failures using the
     * 'deleteFailed' block, and a completion block that will return the overall state of the request.
     * <p>
     * The deleteFailed block will return:
     * - NSDictionary<ICDeleteError, ICCameraItem*>*
     * <p>
     * The completion block will return:
     * — error:
     * - nil if successful
     * - NSError* with an code set to ICReturnDeleteFilesFailed if any file failed.
     * <p>
     * - result: NSDictionary<ICDeleteResult, NSArray<ICCameraItem*>*>* result
     * - ICDeleteSuccessful: NSArray<ICCameraItem*>* success
     * - ICDeleteFailed: NSArray<ICCameraItem*>* failed
     */
    @Generated
    @Selector("requestDeleteFiles:deleteFailed:completion:")
    public native NSProgress requestDeleteFilesDeleteFailedCompletion(NSArray<? extends ICCameraItem> files,
            @ObjCBlock(name = "call_requestDeleteFilesDeleteFailedCompletion_1") Block_requestDeleteFilesDeleteFailedCompletion_1 deleteFailed,
            @ObjCBlock(name = "call_requestDeleteFilesDeleteFailedCompletion_2") Block_requestDeleteFilesDeleteFailedCompletion_2 completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestDeleteFilesDeleteFailedCompletion_1 {
        @Generated
        void call_requestDeleteFilesDeleteFailedCompletion_1(NSDictionary<String, ? extends ICCameraItem> arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestDeleteFilesDeleteFailedCompletion_2 {
        @Generated
        void call_requestDeleteFilesDeleteFailedCompletion_2(
                NSDictionary<String, ? extends NSArray<? extends ICCameraItem>> result, NSError error);
    }

    /**
     * requestDownloadFile:options:downloadDelegate:didDownloadSelector:contextInfo:
     * <p>
     * Download a file from the camera. Please refer to the top of this header for information about the options.
     * <p>
     * The downloadDelegate passed must not be nil. When this request is completed, the didDownloadSelector of the downloadDelegate object is called.The didDownloadSelector should have the same signature as: - (void)didDownloadFile:(ICCameraFile*)file error:(NSError*)error options:(NSDictionary*)options contextInfo:(void*)contextInfo. The content of error returned should be examined to determine if the request completed successfully.
     */
    @Generated
    @Selector("requestDownloadFile:options:downloadDelegate:didDownloadSelector:contextInfo:")
    public native void requestDownloadFileOptionsDownloadDelegateDidDownloadSelectorContextInfo(ICCameraFile file,
            NSDictionary<String, ?> options,
            @Mapped(ObjCObjectMapper.class) ICCameraDeviceDownloadDelegate downloadDelegate, SEL selector,
            VoidPtr contextInfo);

    /**
     * requestSendPTPCommand:outData:completion
     * <p>
     * This method asynchronously sends a PTP command to a camera.
     * <p>
     * The response, data, and any error message will be returned the block.
     */
    @Generated
    @Selector("requestSendPTPCommand:outData:completion:")
    public native void requestSendPTPCommandOutDataCompletion(NSData ptpCommand, NSData ptpData,
            @ObjCBlock(name = "call_requestSendPTPCommandOutDataCompletion") Block_requestSendPTPCommandOutDataCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestSendPTPCommandOutDataCompletion {
        @Generated
        void call_requestSendPTPCommandOutDataCompletion(NSData responseData, NSData ptpResponseData, NSError error);
    }

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] ptpEventHandler
     * <p>
     * As an alternative to setting up an object to handle PTP event packets, a handler can be set.  The handler will always be called in place of the delegate if non-nil.  If the handler is not present, the delegate will be called if present. It is guaranteed only one of the methods will be called if both are implemented.
     */
    @Generated
    @Selector("setPtpEventHandler:")
    public native void setPtpEventHandler(@ObjCBlock(name = "call_setPtpEventHandler") Block_setPtpEventHandler value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setPtpEventHandler {
        @Generated
        void call_setPtpEventHandler(NSData arg0);
    }

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * [@property] tetheredCaptureEnabled
     * <p>
     * This property is set to YES when tethered capture is enabled on the device.
     * <p>
     * Use 'requestEnableTethering' and 'requestDisableTethering' to enable or disable tethered capture on the device.
     */
    @Generated
    @Selector("tetheredCaptureEnabled")
    public native boolean tetheredCaptureEnabled();

    /**
     * [@property] timeOffset
     * <p>
     * Indicates the time offset, in seconds, between the camera's clock and the computer's clock￼. This value is positive if the camera's clock is ahead of the computer's clock. This property should be ignored if the camera's capabilities property does not contain ICCameraDeviceCanSyncClock.
     */
    @Generated
    @Selector("timeOffset")
    public native double timeOffset();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * [@property] mediaPresentation
     * <p>
     * The media presentation describes the visible assets from a device that may contain multiple formats of each media asset.  The asigngments are of the type ICMediaPresentation enumeration.  This property is available only if the capability ICCameraDeviceSupportsHEIF is  present.
     * <p>
     * A device supporting this capability can specify the
     * following presentations:
     * <p>
     * ICMediaPresentationConverted - The default behavior for applications retrieving images from a device supporting HEIF is to show only converted JPG from HEIF originals, and only H264 encoded video assets from HEVC.
     * ICMediaPresentationOriginal - This presentation will show only original images from a device supporting HEIF and HEVC.  Burned in renders are always exported in JPG, as are burned in effects for MOV clips.
     */
    @Generated
    @Selector("mediaPresentation")
    @NUInt
    public native long mediaPresentation();

    /**
     * [@property] mediaPresentation
     * <p>
     * The media presentation describes the visible assets from a device that may contain multiple formats of each media asset.  The asigngments are of the type ICMediaPresentation enumeration.  This property is available only if the capability ICCameraDeviceSupportsHEIF is  present.
     * <p>
     * A device supporting this capability can specify the
     * following presentations:
     * <p>
     * ICMediaPresentationConverted - The default behavior for applications retrieving images from a device supporting HEIF is to show only converted JPG from HEIF originals, and only H264 encoded video assets from HEVC.
     * ICMediaPresentationOriginal - This presentation will show only original images from a device supporting HEIF and HEVC.  Burned in renders are always exported in JPG, as are burned in effects for MOV clips.
     */
    @Generated
    @Selector("setMediaPresentation:")
    public native void setMediaPresentation(@NUInt long value);
}
