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
    @Generated
    @IsOptional
    @Selector("coachingOverlayViewDidDeactivate:")
    default void coachingOverlayViewDidDeactivate(ARCoachingOverlayView coachingOverlayView) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("coachingOverlayViewDidRequestSessionReset:")
    default void coachingOverlayViewDidRequestSessionReset(ARCoachingOverlayView coachingOverlayView) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("coachingOverlayViewWillActivate:")
    default void coachingOverlayViewWillActivate(ARCoachingOverlayView coachingOverlayView) {
        throw new java.lang.UnsupportedOperationException();
    }
}