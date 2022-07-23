package apple.avfoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] AVCapturePrimaryConstituentDeviceSwitchingBehavior
 * <p>
 * These constants can be used to control when the virtual device is allowed to switch the active primary constituent
 * device.
 * <p>
 * [@constant] AVCapturePrimaryConstituentDeviceSwitchingBehaviorUnsupported
 * Indicates that the device does not support constituent device switching. This is reported for cameras that do not
 * have more than one constituent device.
 * [@constant] AVCapturePrimaryConstituentDeviceSwitchingBehaviorAuto
 * Automatically select the best camera for the current scene. In this mode there are no restrictions on when a camera
 * switch can occur.
 * [@constant] AVCapturePrimaryConstituentDeviceSwitchingBehaviorRestricted
 * Restrict fallback camera selection to certain conditions (see
 * AVCapturePrimaryConstituentDeviceRestrictedSwitchingBehaviorConditions). Camera switches necessary to satisfy the
 * requested video zoom factor are still allowed without restriction.
 * [@constant] AVCapturePrimaryConstituentDeviceSwitchingBehaviorLocked
 * Lock camera switching to the active primary constituent device. Note that this restricts the
 * minAvailableVideoZoomFactor to the switch-over zoom factor of the activePrimaryConstituentDevice (as reported in
 * AVCaptureDevice.virtualDeviceSwitchOverVideoZoomFactors).
 * <p>
 * Virtual devices with multiple constituent video devices (such as the Dual Camera, Dual Wide Camera, or Triple
 * Camera), consist of cameras that each have different properties such as focal length, maximum light sensitivity, and
 * minimum focus distance. One of the constituent video devices is selected as the primary constituent device. For an
 * AVCaptureSession, the primary constituent device produces for all outputs. For an AVCaptureMultiCamSession, the
 * primary constituent device produces for all outputs connected to the virtual device's native AVCaptureDeviceInputPort
 * (where its sourceDeviceType is equal to the virtual device's deviceType).
 * <p>
 * When the requested zoom factor can be achieved by multiple constituent cameras (see
 * -virtualDeviceSwitchOverVideoZoomFactors), the virtual device chooses the best camera for the scene. The primary
 * condition for this is the focal length; the camera with the longest focal length requires the least amount of digital
 * upscaling and therefore normally provides the highest image quality. Secondary conditions are focus and exposure;
 * when the scene requires focus or exposure to go beyond the limits of the active primary constituent device, a camera
 * with a shorter focal length may be able to deliver a better quality image. Such a device is called a fallback primary
 * constituent device. For example, a telephoto camera with a minimum focus distance of 40cm is not able to deliver a
 * sharp image when the subject in the scene is closer than 40cm. For such a scene, the virtual device will switch to
 * the wide-angle camera which typically has a smaller minimum focus distance and is able to achieve accurate focus on
 * the subject. In this case the wide-angle camera is the fallback primary constitute device.
 */
@Generated
public final class AVCapturePrimaryConstituentDeviceSwitchingBehavior {
    @Generated
    private AVCapturePrimaryConstituentDeviceSwitchingBehavior() {
    }

    @Generated @NInt public static final long Unsupported = 0x0000000000000000L;
    @Generated @NInt public static final long Auto = 0x0000000000000001L;
    @Generated @NInt public static final long Restricted = 0x0000000000000002L;
    @Generated @NInt public static final long Locked = 0x0000000000000003L;
}
