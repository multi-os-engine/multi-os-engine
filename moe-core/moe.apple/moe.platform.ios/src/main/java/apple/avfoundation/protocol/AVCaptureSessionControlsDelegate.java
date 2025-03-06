package apple.avfoundation.protocol;

import apple.avfoundation.AVCaptureSession;
import org.jetbrains.annotations.NotNull;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * [@protocol] AVCaptureSessionControlsDelegate
 * 
 * Defines an interface for delegates of `AVCaptureSession` to receive events about the session's controls.
 * 
 * API-Since: 18.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AVCaptureSessionControlsDelegate")
public interface AVCaptureSessionControlsDelegate {
    /**
     * sessionControlsDidBecomeActive:
     * 
     * Called when the controls of an `AVCaptureSession` instance become active and are available for interaction.
     * 
     * Delegates receive this message when the controls of an `AVCaptureSession` instance become active and are
     * available for interaction.
     * 
     * API-Since: 18.0
     * 
     * @param session
     *                The `AVCaptureSession` instance whose controls are active.
     */
    @Generated
    @Selector("sessionControlsDidBecomeActive:")
    void sessionControlsDidBecomeActive(@NotNull AVCaptureSession session);

    /**
     * sessionControlsDidBecomeInactive:
     * 
     * Called when the controls of an `AVCaptureSession` instance become inactive and are no longer available for
     * interaction.
     * 
     * Delegates receive this message when the controls of an `AVCaptureSession` instance become inactive and are no
     * longer available for interaction.
     * 
     * API-Since: 18.0
     * 
     * @param session
     *                The `AVCaptureSession` instance whose controls are inactive.
     */
    @Generated
    @Selector("sessionControlsDidBecomeInactive:")
    void sessionControlsDidBecomeInactive(@NotNull AVCaptureSession session);

    /**
     * sessionControlsWillEnterFullscreenAppearance:
     * 
     * Called when the controls of an `AVCaptureSession` instance will enter a fullscreen appearance.
     * 
     * When the controls enter a fullscreen appearance, applications are encouraged to hide portions of their user
     * interface including zoom or exposure sliders and shutter buttons. Few on-screen elements should be visible so
     * users can focus on the controls they are interacting with and view the camera preview unobstructed.
     * 
     * API-Since: 18.0
     * 
     * @param session
     *                The `AVCaptureSession` instance whose controls will enter a fullscreen appearance.
     */
    @Generated
    @Selector("sessionControlsWillEnterFullscreenAppearance:")
    void sessionControlsWillEnterFullscreenAppearance(@NotNull AVCaptureSession session);

    /**
     * sessionControlsWillExitFullscreenAppearance:
     * 
     * Called when the controls of an `AVCaptureSession` instance will exit a fullscreen appearance.
     * 
     * Delegates receive this message when the controls of an `AVCaptureSession` instance should resume showing portions
     * of their user interface that were hidden in response to receiving
     * `-sessionControlsWillEnterFullscreenAppearance:`. This message is sent before
     * `sessionControlsDidBecomeInactive:`.
     * 
     * API-Since: 18.0
     * 
     * @param session
     *                The `AVCaptureSession` instance whose controls will exit a fullscreen appearance.
     */
    @Generated
    @Selector("sessionControlsWillExitFullscreenAppearance:")
    void sessionControlsWillExitFullscreenAppearance(@NotNull AVCaptureSession session);
}