package apple.gamecontroller.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Elements on a GCDevice can be used for system gestures. The system gesture state represents how input is handled in the app
 * for a controller element that is bound to a system gesture.
 * <p>
 * [@example] The Options button on an extended gamepad can be bound to take a screenshot with a long press. This occurs outside of
 * the control of the app. If a user presses the Options button, the system gesture recognizer will run by default. If a long press is detected,
 * input will not be forwarded to your app (your application won't see the Options button was pressed at all). If a long press is not detected,
 * input will be forwared to your app, with a delay.
 * <p>
 * If you do not want any delay in receiving input for this element, you have two options
 * - Set the preferred state of the element to GCSystemGestureStateAlwaysReceive. The system gesture recognize will run
 * concurrently with input being sent to your app. This removes input delay, but can lead to system gestures being triggered
 * simulatenously with in-app actions.
 * - Set the preferred state of the element to GCSystemGestureStateDisabled. This will disable the system gesture recognizer - your app
 * will receive full control of the input for this element.
 *
 * @see GCControllerElement.boundToSystemGesture
 * @see GCControllerElement.preferredSystemGestureState
 */
@Generated
public final class GCSystemGestureState {
    @Generated
    private GCSystemGestureState() {
    }

    /**
     * System gesture recognizers will run before input is sent to app, this is the default state
     */
    @Generated @NInt public static final long Enabled = 0x0000000000000000L;
    /**
     * Input is sent to app and processed by system gesture recognizers simultaneously
     */
    @Generated @NInt public static final long AlwaysReceive = 0x0000000000000001L;
    /**
     * System gesture recognizers will not run at all. Input is passed directly to app
     */
    @Generated @NInt public static final long Disabled = 0x0000000000000002L;
}
