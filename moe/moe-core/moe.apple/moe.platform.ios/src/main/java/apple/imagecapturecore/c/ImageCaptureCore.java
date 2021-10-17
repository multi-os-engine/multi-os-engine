package apple.imagecapturecore.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("ImageCaptureCore")
@Runtime(CRuntime.class)
public final class ImageCaptureCore {
    static {
        NatJ.register();
    }

    @Generated
    private ImageCaptureCore() {
    }

    /**
     * [@const]      ICTransportTypeUSB
     * <p>
     * Indicates that the device uses USB transport.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ICTransportTypeUSB();

    /**
     * [@const]      ICTransportTypeMassStorage
     * <p>
     * Indicates that the device use mounts as a mass-storage volume.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ICTransportTypeMassStorage();

    /**
     * [@const]      ICTransportTypeExFAT
     * <p>
     * Indicates that the device use mounts as a exFat storage volume.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ICTransportTypeExFAT();

    /**
     * [@const]      ICTransportTypeTCPIP
     * <p>
     * Indicates that the device uses TCP/IP transport. These devices are discovered using Bonjour.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ICTransportTypeTCPIP();

    /**
     * ------------------------------------------------------------------------------------------------------------------------------
     * Constants used for device status notifications.
     * [@const]      ICStatusNotificationKey
     * <p>
     * Key for a non-localized notification string.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ICStatusNotificationKey();

    /**
     * ------------------------------------------------------------------------------------------------------------------------------
     * Constants used to describe capabilities of a device
     * [@const]      ICDeviceCanEjectOrDisconnect
     * <p>
     * Indicates either the device is mounted as a mass-storage volume and can be ejected or the it is a remote device with an active connection that can be disconnected.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ICDeviceCanEjectOrDisconnect();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ICEnumerationChronologicalOrder();

    /**
     * ------------------------------------------------------------------------------------------------------------------------------
     * [@ICEXIFOrientationType]
     * <p>
     * Type representing EXIF Orientation tag value
     * <p>
     * The meaning of this value is defined by the EXIF specification. Here is what the letter F would look like if it were tagged correctly and displayed by a program that ignores the orientation tag (thus showing the stored image):
     * <p>
     * 1             2             3             4
     * <p>
     * 8888888       8888888            88       88
     * 88                 88            88       88
     * 8888             8888          8888       8888
     * 88                 88            88       88
     * 88                 88       8888888       8888888
     * <p>
     * 5             6             7             8
     * <p>
     * 8888888888    88                    88    8888888888
     * 88  88        88  88            88  88        88  88
     * 88            8888888888    8888888888            88
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ICErrorDomain();

    /**
     * [@const] ICCameraItemThumbnailOption
     * <p>
     * [@enum] ICImageSourceShouldCache
     * <p>
     * Use of this key will override any custom thumbnail size requested, ignoring the ICImageSourceThumbnailMaxPixelSize
     * option entirely.
     * <p>
     * [@enum] ICImageSourceThumbnailMaxPixelSize
     * <p>
     * Use of this key will be ignored if ICImageSourceShouldCache has also been passed in.  Custom thumbnail requests will never be
     * cached.
     * <p>
     * Only the embedded EXIF thumbnail, or a created thumbnail of EXIF standard size (160x120) will
     * be cached. Use of the ICImageSourceShouldCache flag is discouraged, as the framework shall not act as a
     * backing store out of convienence.
     * <p>
     * If use of this flag is required, it is highly recommeded to only keep the image cached within the framework temporarily,
     * using the method -[ICCameraItem flushThumbnailCache] to evict the thumbnail.
     * <p>
     * Multiple calls to both cache the EXIF thumbnail, and subsequently retrieve a larger thumbnail will work as defined.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ICImageSourceThumbnailMaxPixelSize();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ICImageSourceShouldCache();

    /**
     * [@const]      ICDownloadsDirectoryURL
     * <p>
     * ICDownloadsDirectoryURL
     * <p>
     * The value for this key should be an NSURL object referencing a writable directory. The downloaded files will be saved in that directory.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ICDownloadsDirectoryURL();

    /**
     * [@const]      ICSaveAsFilename
     * <p>
     * ICSaveAsFilename
     * <p>
     * The value for this key should be an NSString object containing the name to be used for the downloaded file.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ICSaveAsFilename();

    /**
     * [@const]      ICSavedFilename
     * <p>
     * ICSavedFilename
     * <p>
     * The value for this key will be an NSString object containing the actual name of the saved file. The options dictionary returned in didDownloadFile:error:options:contextInfo: will have this key.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ICSavedFilename();

    /**
     * [@const]      ICSavedAncillaryFiles
     * <p>
     * ICSavedAncillaryFiles
     * <p>
     * The value for this key will be an NSArray object containing names of files associated with the primary file that is downloaded. The options dictionary returned in didDownloadFile:error:options:contextInfo: may have this key.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ICSavedAncillaryFiles();

    /**
     * [@const]      ICOverwrite
     * <p>
     * ICOverwrite
     * <p>
     * The value for this key should be an NSNumber object representing a boolean value. If this value is YES, the downloaded file will overwrite an existing file with the same name and extension.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ICOverwrite();

    /**
     * [@const]      ICDeleteAfterSuccessfulDownload
     * <p>
     * ICDeleteAfterSuccessfulDownload
     * <p>
     * The value for this key should be an NSNumber object representing a boolean value. If this value is YES, the file will be deleted from the device after it is succcessfully downloaded.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ICDeleteAfterSuccessfulDownload();

    /**
     * [@const]      ICDownloadSidecarFiles
     * <p>
     * ICDownloadSidecarFiles
     * <p>
     * The value for this key should be an NSNumber object representing a boolean value. If this value is YES, all sidecar files will be downloaded along with the media file.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ICDownloadSidecarFiles();

    /**
     * [@const]      ICCameraDeviceCanTakePicture
     * <p>
     * Indicates that the camera can capture a picture while it is connected, if the client sends a 'requestTakePicture' message to it.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ICCameraDeviceCanTakePicture();

    /**
     * [@const]      ICCameraDeviceCanTakePictureUsingShutterReleaseOnCamera
     * <p>
     * Indicates that the camera can capture a picture while it is connected, if the user presses the shutter release on the camera.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ICCameraDeviceCanTakePictureUsingShutterReleaseOnCamera();

    /**
     * [@const]      ICCameraDeviceCanDeleteOneFile
     * <p>
     * Indicates that the camera can delete a file at a time while it is connected.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ICCameraDeviceCanDeleteOneFile();

    /**
     * [@const]      ICCameraDeviceCanDeleteAllFiles
     * <p>
     * Indicates that the camera can delete all files in a single operation while it is connected.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ICCameraDeviceCanDeleteAllFiles();

    /**
     * [@const]      ICCameraDeviceCanSyncClock
     * <p>
     * Indicates that the camera can synchronize its date and time with that of the host computer.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ICCameraDeviceCanSyncClock();

    /**
     * [@const]      ICCameraDeviceCanReceiveFile
     * <p>
     * Indicates that the host can upload files to the camera.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ICCameraDeviceCanReceiveFile();

    /**
     * [@const]      ICCameraDeviceCanAcceptPTPCommands
     * <p>
     * Indicates that the camera can accept PTP commands.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ICCameraDeviceCanAcceptPTPCommands();

    /**
     * [@const]      ICDeleteSuccessful
     * <p>
     * The value for this key should be an NSArray<ICCameraItem*>*
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ICDeleteSuccessful();

    /**
     * [@const]      ICDeleteCanceled
     * <p>
     * The value for this key should be an NSArray<ICCameraItem*>*
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ICDeleteCanceled();

    /**
     * [@const]      ICDeleteFailed
     * <p>
     * The value for this key should be an NSArray<ICCameraItem*>*
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ICDeleteFailed();

    /**
     * [@const]      ICDeleteErrorReadOnly
     * <p>
     * The value for this key should be an ICCameraItem*
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ICDeleteErrorReadOnly();

    /**
     * [@const]      ICDeleteErrorFileMissing
     * <p>
     * The value for this key should be an ICCameraItem*
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ICDeleteErrorFileMissing();

    /**
     * [@const]      ICDeleteErrorDeviceMissing
     * <p>
     * The value for this key should be an ICCameraItem*
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ICDeleteErrorDeviceMissing();

    /**
     * [@const]      ICDeleteErrorDeviceMissing
     * <p>
     * The value for this key should be an ICCameraItem*
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ICDeleteErrorCanceled();

    /**
     * [@const]      ICTruncateAfterSuccessfulDownload
     * <p>
     * The value for this key should be an NSNumber object representing a boolean value. If this value is YES, and the file is a JPG converted from HEIC on device,
     * the padding will be stripped from the end of the file.  Note that the file size property of the ICCameraItem object will not be updated to reflect the newly truncated image.  This
     * option has no effect for images coming from devices without the ability to convert from HEIC to JPG.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ICTruncateAfterSuccessfulDownload();

    /**
     * [@const]      ICCameraDeviceSupportsHEIF
     * <p>
     * Indicates that the camera supports HEIF transcoding, and can change the presentation of converted assets and original assets on the fly.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ICCameraDeviceSupportsHEIF();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ICAuthorizationStatusNotDetermined();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ICAuthorizationStatusRestricted();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ICAuthorizationStatusDenied();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ICAuthorizationStatusAuthorized();
}
