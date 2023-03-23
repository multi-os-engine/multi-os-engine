package apple.phase.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] PHASEPushStreamCompletionCallbackCondition
 * 
 * Specifies when the completion handler must be invoked.
 * [@constant] PHASEPushStreamCompletionDataRendered
 * The buffer data has been rendered by the player.
 * This does not account for any signal processing latencies downstream of the player in the engine.
 */
@Generated
public final class PHASEPushStreamCompletionCallbackCondition {
    @Generated
    private PHASEPushStreamCompletionCallbackCondition() {
    }

    @Generated @NInt public static final long PHASEPushStreamCompletionDataRendered = 0x0000000000000000L;
}
