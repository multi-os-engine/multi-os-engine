package apple.homekit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum]      HMCharacteristicValueInputEvent
 * 
 * [@constant]  HMCharacteristicValueInputEventSinglePress  Single tap or press.
 * [@constant]  HMCharacteristicValueInputEventDoublePress  Double tap or press.
 * [@constant]  HMCharacteristicValueInputEventLongPress    Long Press.
 */
@Generated
public final class HMCharacteristicValueInputEvent {
    @Generated
    private HMCharacteristicValueInputEvent() {
    }

    @Generated @NInt public static final long SinglePress = 0x0000000000000000L;
    @Generated @NInt public static final long DoublePress = 0x0000000000000001L;
    @Generated @NInt public static final long LongPress = 0x0000000000000002L;
}