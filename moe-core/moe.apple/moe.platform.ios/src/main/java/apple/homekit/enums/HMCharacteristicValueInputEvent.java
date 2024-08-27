package apple.homekit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] HMCharacteristicValueInputEvent
 * 
 * [@constant] HMCharacteristicValueInputEventSinglePress Single tap or press.
 * [@constant] HMCharacteristicValueInputEventDoublePress Double tap or press.
 * [@constant] HMCharacteristicValueInputEventLongPress Long Press.
 * 
 * API-Since: 10.3
 */
@Generated
public final class HMCharacteristicValueInputEvent {
    @Generated
    private HMCharacteristicValueInputEvent() {
    }

    /**
     * API-Since: 10.3
     */
    @Generated @NInt public static final long SinglePress = 0x0000000000000000L;
    /**
     * API-Since: 10.3
     */
    @Generated @NInt public static final long DoublePress = 0x0000000000000001L;
    /**
     * API-Since: 10.3
     */
    @Generated @NInt public static final long LongPress = 0x0000000000000002L;
}
