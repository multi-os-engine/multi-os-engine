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
 */
@Generated
public final class AVAudioSessionRouteSelection {
    @Generated
    private AVAudioSessionRouteSelection() {
    }

    @Generated @NInt public static final long None = 0x0000000000000000L;
    @Generated @NInt public static final long Local = 0x0000000000000001L;
    @Generated @NInt public static final long External = 0x0000000000000002L;
}
