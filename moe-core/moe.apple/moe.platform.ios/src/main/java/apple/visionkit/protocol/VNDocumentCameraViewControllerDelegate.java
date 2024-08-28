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
 * A delegate protocol through which the document camera returns its scanned
 * results.
 * 
 * Your app is responsible for dismissing the document camera in all delegate
 * callback methods.
 * 
 * API-Since: 13.0
 */
@Generated
@Library("VisionKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("VNDocumentCameraViewControllerDelegate")
public interface VNDocumentCameraViewControllerDelegate {
    /**
     * Tells the delegate that document scanning failed while the camera view controller was active.
     * 
     * - Parameter controller: The document camera view controller that failed.
     * - Parameter error: The error containing the reason for failure.
     */
    @Generated
    @IsOptional
    @Selector("documentCameraViewController:didFailWithError:")
    default void documentCameraViewControllerDidFailWithError(@NotNull VNDocumentCameraViewController controller,
            @NotNull NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Tells the delegate that the user successfully saved a scanned document from the document camera.
     * 
     * - Parameter controller: The document camera view controller that captured the scan.
     * - Parameter scan: The scanned document that the camera detected.
     */
    @Generated
    @IsOptional
    @Selector("documentCameraViewController:didFinishWithScan:")
    default void documentCameraViewControllerDidFinishWithScan(@NotNull VNDocumentCameraViewController controller,
            @NotNull VNDocumentCameraScan scan) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Tells the delegate that the user canceled out of the document scanner camera.
     * 
     * - Parameter controller: The document camera view controller in which the user canceled.
     */
    @Generated
    @IsOptional
    @Selector("documentCameraViewControllerDidCancel:")
    default void documentCameraViewControllerDidCancel(@NotNull VNDocumentCameraViewController controller) {
        throw new java.lang.UnsupportedOperationException();
    }
}