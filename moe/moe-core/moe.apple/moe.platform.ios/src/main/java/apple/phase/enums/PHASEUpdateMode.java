package apple.phase.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] PHASEUpdateMode
 * <p>
 * Update mode for the engine.
 * <p>
 * The engine update mode determines the rate at which the engine consumes client commands, performs internal updates,
 * and calls any registered handlers.
 * All API calls to the engine are queued until the engine updates.
 * The engine update mode determines if the engine or the application triggers the consumption of API commands.
 * [@note]
 * The update mode does not affect the Audio IO Thread or rendering, in general. The Audio IO Thread always runs in the
 * background, independent of the update mode.
 * [@constant] PHASEUpdateModeAutomatic
 * The engine will internally consume client commands at a rate opaque to the client.
 * In general, automatic update mode is meant for simpler applications that just want to play sounds, without having to
 * maintain a strict update loop.
 * Due to the fact that the engine consumes client commands at its own internal rate, the client is never guaranteed
 * that two independent commands will synchronize.
 * [@constant] PHASEUpdateModeManual
 * When an application requires precise synchronization of API calls with the main update, manual mode is the best
 * choice.
 * In this mode, clients will need to call [PHASEEngine update] periodically to process new commands, perform internal
 * updates, and receive callbacks.
 * The rate at which the client calls update should at least match the rate at which other time-critical subsystems are
 * updated, such graphics rendering etc.
 * API calls between calls to [PHASEEngine update] are guaranteed to be synchronized.
 * For example, the client can move two sources into place, request to start two sound events (one per source), then
 * call [PHASEEngine update].
 * These calls will be guaranteed to be processed at the same time.
 */
@Generated
public final class PHASEUpdateMode {
    @Generated
    private PHASEUpdateMode() {
    }

    @Generated @NInt public static final long Automatic = 0x0000000000000000L;
    @Generated @NInt public static final long Manual = 0x0000000000000001L;
}
