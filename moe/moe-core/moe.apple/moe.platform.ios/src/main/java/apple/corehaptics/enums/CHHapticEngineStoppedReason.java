package apple.corehaptics.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * @enum CHHapticEngineStoppedReason
 * 	@abstract
 * 		Constants indicating the reason why the CHHapticEngine has stopped.
 * 
 * 	@constant	CHHapticEngineStoppedReasonAudioSessionInterrupt
 * 	The AVAudioSession bound to this engine has been interrupted.
 * 
 * 	@constant	CHHapticEngineStoppedReasonApplicationSuspended
 * 		The application owning this engine has been suspended (i.e., put into the background).
 * 
 * @constant	CHHapticEngineStoppedReasonIdleTimeout
 * 	The engine has stopped due to an idle timeout when the engine's `autoShutdownEnabled` property was set to YES.
 * 
 * @constant	CHHapticEngineStoppedReasonNotifyWhenFinished
 * 		The engine has stopped due to a call to a `CHHapticEngineFinishedHandler` returning `CHHapticEngineFinishedActionStopEngine`.
 * 
 *    @constant    CHHapticEngineStoppedReasonEngineDestroyed
 *        The engine has stopped because the CHHapticEngine instance was destroyed.
 * 
 *    @constant    CHHapticEngineStoppedReasonGameControllerDisconnect
 *        The engine has stopped because the Game Controller associated with this engine disconnected.
 * 
 * 	@constant	CHHapticEngineStoppedReasonSystemError
 * 		An error has occurred.
 */
@Generated
public final class CHHapticEngineStoppedReason {
    @Generated
    private CHHapticEngineStoppedReason() {
    }

    @Generated @NInt public static final long AudioSessionInterrupt = 0x0000000000000001L;
    @Generated @NInt public static final long ApplicationSuspended = 0x0000000000000002L;
    @Generated @NInt public static final long IdleTimeout = 0x0000000000000003L;
    @Generated @NInt public static final long NotifyWhenFinished = 0x0000000000000004L;
    @Generated @NInt public static final long SystemError = 0xFFFFFFFFFFFFFFFFL;
    @Generated @NInt public static final long EngineDestroyed = 0x0000000000000005L;
    @Generated @NInt public static final long GameControllerDisconnect = 0x0000000000000006L;
}