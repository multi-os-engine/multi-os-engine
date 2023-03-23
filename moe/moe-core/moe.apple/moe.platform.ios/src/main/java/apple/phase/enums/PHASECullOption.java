package apple.phase.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] PHASECullOption
 * 
 * Cull option.
 * 
 * Determines what the engine should do when a sound asset becomes cullable.
 * [@constant] PHASECullOptionTerminate
 * If cullable, the sound asset will stop. Note that this can occur before or during playback.
 * [@constant] PHASECullOptionSleepWakeAtZero
 * If cullable, the sound asset will be put to sleep. Upon waking, start playback at the beginning.
 * [@constant] PHASECullOptionSleepWakeAtRandomOffset
 * If cullable, the sound asset will be put to sleep. Upon waking, start playback at random offset.
 * [@constant] PHASECullOptionSleepWakeAtRealtimeOffset
 * If cullable, the sound asset will be put to sleep. Upon waking, start playback at realtime offset.
 * [@constant] PHASECullOptionDoNotCull
 * If cullable, continue playback, even if the sound is inaudible.
 */
@Generated
public final class PHASECullOption {
    @Generated
    private PHASECullOption() {
    }

    @Generated @NInt public static final long Terminate = 0x0000000000000000L;
    @Generated @NInt public static final long SleepWakeAtZero = 0x0000000000000001L;
    @Generated @NInt public static final long SleepWakeAtRandomOffset = 0x0000000000000002L;
    @Generated @NInt public static final long SleepWakeAtRealtimeOffset = 0x0000000000000003L;
    @Generated @NInt public static final long DoNotCull = 0x0000000000000004L;
}
