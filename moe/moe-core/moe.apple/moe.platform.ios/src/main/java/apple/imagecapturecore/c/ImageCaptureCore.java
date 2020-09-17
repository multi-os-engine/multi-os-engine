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

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ICTransportTypeUSB();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ICTransportTypeMassStorage();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ICTransportTypeExFAT();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ICTransportTypeTCPIP();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ICStatusNotificationKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ICDeviceCanEjectOrDisconnect();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ICEnumerationChronologicalOrder();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ICErrorDomain();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ICImageSourceThumbnailMaxPixelSize();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ICImageSourceShouldCache();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ICDownloadsDirectoryURL();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ICSaveAsFilename();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ICSavedFilename();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ICSavedAncillaryFiles();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ICOverwrite();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ICDeleteAfterSuccessfulDownload();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ICDownloadSidecarFiles();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ICCameraDeviceCanTakePicture();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ICCameraDeviceCanTakePictureUsingShutterReleaseOnCamera();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ICCameraDeviceCanDeleteOneFile();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ICCameraDeviceCanDeleteAllFiles();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ICCameraDeviceCanSyncClock();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ICCameraDeviceCanReceiveFile();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ICCameraDeviceCanAcceptPTPCommands();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ICDeleteSuccessful();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ICDeleteCanceled();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ICDeleteFailed();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ICDeleteErrorReadOnly();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ICDeleteErrorFileMissing();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ICDeleteErrorDeviceMissing();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ICDeleteErrorCanceled();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ICTruncateAfterSuccessfulDownload();

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