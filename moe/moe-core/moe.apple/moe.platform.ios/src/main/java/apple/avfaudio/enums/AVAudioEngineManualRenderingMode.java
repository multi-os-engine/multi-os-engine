package apple.avfaudio.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] AVAudioEngineManualRenderingMode
 * <p>
 * By default, the engine is connected to an audio device and automatically renders in realtime.
 * It can also be configured to operate in manual rendering mode, i.e. not connected to an
 * audio device and rendering in response to requests from the client.
 * <p>
 * AVAudioEngineManualRenderingModeOffline
 * The engine operates in an offline mode without any realtime constraints.
 * <p>
 * AVAudioEngineManualRenderingModeRealtime
 * The engine operates under realtime constraints, i.e. it will not make any blocking call
 * (e.g. calling libdispatch, blocking on a mutex, allocating memory etc.) while rendering.
 * Note that only the block based render mechanism can be used in this mode
 * (see `AVAudioEngine(manualRenderingBlock)`.
 */
@Generated
public final class AVAudioEngineManualRenderingMode {
    @Generated
    private AVAudioEngineManualRenderingMode() {
    }

    @Generated @NInt public static final long Offline = 0x0000000000000000L;
    @Generated @NInt public static final long Realtime = 0x0000000000000001L;
}
