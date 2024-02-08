package apple.avfoundation.protocol;

import apple.avfoundation.AVCapturePhotoOutputReadinessCoordinator;
import org.jetbrains.annotations.NotNull;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * API-Since: 17.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AVCapturePhotoOutputReadinessCoordinatorDelegate")
public interface AVCapturePhotoOutputReadinessCoordinatorDelegate {
    /**
     * readinessCoordinator:captureReadinessDidChange:
     * 
     * A callback delivered on the main queue whenever the captureReadiness property changes.
     * 
     * This callback is always delivered on the main queue and is suitable for updating shutter button availability and
     * appearance.
     * 
     * @param coordinator
     *                         The calling instance of AVCapturePhotoOutputReadinessCoordinator.
     * @param captureReadiness
     *                         The updated captureReadiness value which can be used to update shutter button
     *                         availability and appearance.
     */
    @Generated
    @IsOptional
    @Selector("readinessCoordinator:captureReadinessDidChange:")
    default void readinessCoordinatorCaptureReadinessDidChange(
            @NotNull AVCapturePhotoOutputReadinessCoordinator coordinator, @NInt long captureReadiness) {
        throw new java.lang.UnsupportedOperationException();
    }
}