package apple.homekit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] HMCharacteristicValueLabelNamespace
 * <p>
 * [@constant] HMCharacteristicValueLabelNamespaceDot Service labels are dots.
 * [@constant] HMCharacteristicValueLabelNamespaceNumeral Service labels are Arabic numerals.
 */
@Generated
public final class HMCharacteristicValueLabelNamespace {
    @Generated
    private HMCharacteristicValueLabelNamespace() {
    }

    @Generated @NInt public static final long Dot = 0x0000000000000000L;
    @Generated @NInt public static final long Numeral = 0x0000000000000001L;
}
