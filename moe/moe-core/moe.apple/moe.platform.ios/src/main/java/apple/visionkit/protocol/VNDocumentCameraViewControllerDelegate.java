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
import org.jetbrains.annotations.NotNull;

/**
 * API-Since: 13.0
 */
@Generated
@Library("VisionKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("VNDocumentCameraViewControllerDelegate")
public interface VNDocumentCameraViewControllerDelegate {
    /**
     * The delegate will receive this call when the user is unable to scan, with the following error.
     */
    @Generated
    @IsOptional
    @Selector("documentCameraViewController:didFailWithError:")
    default void documentCameraViewControllerDidFailWithError(@NotNull VNDocumentCameraViewController controller,
            @NotNull NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * The client is responsible for dismissing the document camera in these callbacks.
     * The delegate will receive one of the following calls, depending whether the user saves or cancels, or if the
     * session fails.
     */
    @Generated
    @IsOptional
    @Selector("documentCameraViewController:didFinishWithScan:")
    default void documentCameraViewControllerDidFinishWithScan(@NotNull VNDocumentCameraViewController controller,
            @NotNull VNDocumentCameraScan scan) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * The delegate will receive this call when the user cancels.
     */
    @Generated
    @IsOptional
    @Selector("documentCameraViewControllerDidCancel:")
    default void documentCameraViewControllerDidCancel(@NotNull VNDocumentCameraViewController controller) {
        throw new java.lang.UnsupportedOperationException();
    }
}