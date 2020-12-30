package apple.arkit.protocol;

import apple.arkit.ARCoachingOverlayView;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("ARKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("ARCoachingOverlayViewDelegate")
public interface ARCoachingOverlayViewDelegate {
    /**
     * This is called when the view deactivates, either manually or automatically
     * 
     * @param coachingOverlayView The view that was deactivated
     */
    @Generated
    @IsOptional
    @Selector("coachingOverlayViewDidDeactivate:")
    default void coachingOverlayViewDidDeactivate(ARCoachingOverlayView coachingOverlayView) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * This is called when the user taps the reset button in the relocalization state
     * 
     * @discussion By default, when the relocalization reset button is tapped, the overlay will call run on the session using the current
     * `configuration`, and the `ARSessionRunOptionResetTracking` and `ARSessionRunOptionRemoveExistingAnchors` options. The delegate may
     * implement this method to override this behavior. The delegate is then responsible for resetting the session.
     * 
     * @param coachingOverlayView The view currently active
     */
    @Generated
    @IsOptional
    @Selector("coachingOverlayViewDidRequestSessionReset:")
    default void coachingOverlayViewDidRequestSessionReset(ARCoachingOverlayView coachingOverlayView) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * This is called when the view activate, either manually or automatically
     * 
     * @discussion The Developer may hide their application UI in in this callback, and take other appropriate actions to allow
     * `ARCoachingOverlayView` to take over the full screen.
     * @param coachingOverlayView The view that will be activated
     */
    @Generated
    @IsOptional
    @Selector("coachingOverlayViewWillActivate:")
    default void coachingOverlayViewWillActivate(ARCoachingOverlayView coachingOverlayView) {
        throw new java.lang.UnsupportedOperationException();
    }
}