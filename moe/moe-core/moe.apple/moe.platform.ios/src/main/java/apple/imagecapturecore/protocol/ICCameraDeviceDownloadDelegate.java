package apple.imagecapturecore.protocol;

import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.imagecapturecore.ICCameraFile;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("ImageCaptureCore")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("ICCameraDeviceDownloadDelegate")
public interface ICCameraDeviceDownloadDelegate {
    @Generated
    @IsOptional
    @Selector("didDownloadFile:error:options:contextInfo:")
    default void didDownloadFileErrorOptionsContextInfo(ICCameraFile file, NSError error,
            NSDictionary<String, ?> options, VoidPtr contextInfo) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("didReceiveDownloadProgressForFile:downloadedBytes:maxBytes:")
    default void didReceiveDownloadProgressForFileDownloadedBytesMaxBytes(ICCameraFile file, long downloadedBytes,
            long maxBytes) {
        throw new java.lang.UnsupportedOperationException();
    }
}