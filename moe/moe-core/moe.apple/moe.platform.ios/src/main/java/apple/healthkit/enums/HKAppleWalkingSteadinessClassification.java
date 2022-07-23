package apple.healthkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] HKAppleWalkingSteadinessClassification
 * <p>
 * This enumerated type is used to represent the classification for the user's walking steadiness.
 * [@constant] HKAppleWalkingSteadinessClassificationOK Walking steadiness is OK.
 * [@constant] HKAppleWalkingSteadinessClassificationLow Walking steadiness is Low.
 * [@constant] HKAppleWalkingSteadinessClassificationVeryLow Walking steadiness is Very Low.
 */
@Generated
public final class HKAppleWalkingSteadinessClassification {
    @Generated
    private HKAppleWalkingSteadinessClassification() {
    }

    @Generated @NInt public static final long OK = 0x0000000000000001L;
    @Generated @NInt public static final long Low = 0x0000000000000002L;
    @Generated @NInt public static final long VeryLow = 0x0000000000000003L;
}
