package apple.corehaptics.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * @enum CHHapticEngineFinishedAction
 * @abstract
 * 	Constants indicating what the engine should do in response to the finished handler being called.
 * 
 * @constant	CHHapticEngineFinishedActionStopEngine
 * 		Stop the engine.  This is useful if the client knows that the client is about to go inactive.
 * 
 * @constant	CHHapticEngineFinishedActionLeaveEngineRunning
 * 		Do not stop the engine.  This is useful if the client expects more activity.
 */
@Generated
public final class CHHapticEngineFinishedAction {
    @Generated
    private CHHapticEngineFinishedAction() {
    }

    @Generated @NInt public static final long StopEngine = 0x0000000000000001L;
    @Generated @NInt public static final long LeaveEngineRunning = 0x0000000000000002L;
}