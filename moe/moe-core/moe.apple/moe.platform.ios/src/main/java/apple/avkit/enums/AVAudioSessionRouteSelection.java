package apple.avkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@constant] AVAudioSessionRouteSelectionNone
 * Indicates no route was selected.
 * [@constant] AVAudioSessionRouteSelectionLocal
 * Indicates that the local device was selected.
 * [@constant] AVAudioSessionRouteSelectionExternal
 * Indicates that an external device was selected.
 * 
 * API-Since: 13.0
 */
@Generated
public final class AVAudioSessionRouteSelection {
    @Generated
    private AVAudioSessionRouteSelection() {
    }

    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long None = 0x0000000000000000L;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long Local = 0x0000000000000001L;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long External = 0x0000000000000002L;
}
