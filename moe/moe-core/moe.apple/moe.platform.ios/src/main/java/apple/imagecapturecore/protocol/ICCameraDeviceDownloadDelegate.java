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

/**
 * [@protocol] ICCameraDeviceDownloadDelegate <NSObject>
 * 
 * The object passed in as 'downloadDelegate' in the 'requestDownloadFile:options:downloadDelegate:didDownloadSelector:contextInfo:' message must conform to ICCameraDeviceDownloadDelegate protocol.
 */
@Generated
@Library("ImageCaptureCore")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("ICCameraDeviceDownloadDelegate")
public interface ICCameraDeviceDownloadDelegate {
    /**
     * didDownloadFile:error:options:contextInfo:
     * 
     * This message is sent to the delegate when the requested download operation is complete.
     */
    @Generated
    @IsOptional
    @Selector("didDownloadFile:error:options:contextInfo:")
    default void didDownloadFileErrorOptionsContextInfo(ICCameraFile file, NSError error,
            NSDictionary<String, ?> options, VoidPtr contextInfo) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * didReceiveDownloadProgressForFile:downloadedBytes:maxBytes:
     * 
     * This message is sent to the delegate to provide status of the download operation.
     */
    @Generated
    @IsOptional
    @Selector("didReceiveDownloadProgressForFile:downloadedBytes:maxBytes:")
    default void didReceiveDownloadProgressForFileDownloadedBytesMaxBytes(ICCameraFile file, long downloadedBytes,
            long maxBytes) {
        throw new java.lang.UnsupportedOperationException();
    }
}