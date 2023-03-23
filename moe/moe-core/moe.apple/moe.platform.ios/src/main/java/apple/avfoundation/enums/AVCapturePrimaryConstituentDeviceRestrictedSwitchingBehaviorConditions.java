package apple.avfoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * [@enum] AVCapturePrimaryConstituentDeviceRestrictedSwitchingBehaviorConditions
 * 
 * These constants can be used and combined to control the conditions that allow fallback camera selection when the
 * primaryConstituentDeviceSelectionBehavior is set to AVCapturePrimaryConstituentDeviceSwitchingBehaviorRestricted.
 * Note that camera switching necessary to satisfy the requested zoom factor is still allowed.
 * 
 * [@constant] AVCapturePrimaryConstituentDeviceRestrictedSwitchingBehaviorConditionNone
 * Disallow fallback switching.
 * [@constant] AVCapturePrimaryConstituentDeviceRestrictedSwitchingBehaviorConditionVideoZoomChanged
 * Restrict fallback camera switching to when the video zoom factor changes, either through
 * AVCaptureDevice.videoZoomFactor or -[AVCaptureDevice rampToVideoZoomFactor:withRate:]. Note that any change in video
 * zoom factor will allow a switch to a fallback camera, not just changes across switch-over zoom factors.
 * [@constant] AVCapturePrimaryConstituentDeviceRestrictedSwitchingBehaviorConditionFocusModeChanged
 * Restrict fallback camera switches to when AVCaptureDevice.focusMode is set.
 * [@constant] AVCapturePrimaryConstituentDeviceRestrictedSwitchingBehaviorConditionExposureModeChanged
 * Restrict fallback camera switches to when AVCaptureDevice.exposureMode is set.
 * 
 * Whenever triggered by one or more of the enabled conditions, the fallback camera switching waits for exposure and
 * focus to stabilize before deciding which camera to use as the primary constituent device.
 * 
 * Whenever AVCapturePrimaryConstituentDeviceRestrictedSwitchingBehaviorConditionVideoZoomChanged is not included in the
 * restricted switching behavior conditions, AVCapturePrimaryConstituentDeviceSwitchingBehaviorRestricted still allows
 * camera selection when a change in video zoom factor makes a camera eligible or ineligible to be selected as the
 * activePrimaryConstituentDevice. When the video zoom factor decreases to below the switch-over zoom factor of the
 * activePrimaryConstituentDevice, a different camera will be selected to satisfy the requested zoom factor. When the
 * video zoom factor increases and crosses a camera's switch-over zoom factor, this camera becomes eligible to be
 * selected as the activePrimaryConstituentDevice. If exposure and focus allow, this camera then becomes the new
 * activePrimaryConstituentDevice. Similar to the
 * AVCapturePrimaryConstituentDeviceRestrictedSwitchingBehaviorConditionVideoZoomChanged this also waits for exposure
 * and focus to stabilize. Otherwise the activePrimaryConstituentDevice remains unchanged.
 * 
 * API-Since: 15.0
 */
@Generated
public final class AVCapturePrimaryConstituentDeviceRestrictedSwitchingBehaviorConditions {
    @Generated
    private AVCapturePrimaryConstituentDeviceRestrictedSwitchingBehaviorConditions() {
    }

    /**
     * API-Since: 15.0
     */
    @Generated @NUInt public static final long None = 0x0000000000000000L;
    /**
     * API-Since: 15.0
     */
    @Generated @NUInt public static final long VideoZoomChanged = 0x0000000000000001L;
    /**
     * API-Since: 15.0
     */
    @Generated @NUInt public static final long FocusModeChanged = 0x0000000000000002L;
    /**
     * API-Since: 15.0
     */
    @Generated @NUInt public static final long ExposureModeChanged = 0x0000000000000004L;
}
