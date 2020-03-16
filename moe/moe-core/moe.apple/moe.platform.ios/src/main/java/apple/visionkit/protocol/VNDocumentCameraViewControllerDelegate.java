package apple.visionkit.protocol;

import apple.foundation.NSError;
import apple.visionkit.VNDocumentCameraScan;
import apple.visionkit.VNDocumentCameraViewController;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("VisionKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("VNDocumentCameraViewControllerDelegate")
public interface VNDocumentCameraViewControllerDelegate {
    @Generated
    @IsOptional
    @Selector("documentCameraViewController:didFailWithError:")
    default void documentCameraViewControllerDidFailWithError(VNDocumentCameraViewController controller,
            NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("documentCameraViewController:didFinishWithScan:")
    default void documentCameraViewControllerDidFinishWithScan(VNDocumentCameraViewController controller,
            VNDocumentCameraScan scan) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("documentCameraViewControllerDidCancel:")
    default void documentCameraViewControllerDidCancel(VNDocumentCameraViewController controller) {
        throw new java.lang.UnsupportedOperationException();
    }
}