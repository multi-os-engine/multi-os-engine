package apple.healthkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] HKAppleECGAlgorithmVersion
 * <p>
 * Indicates which algorithm version number was used by the ECG app on Apple Watch.
 * <p>
 * [@constant] HKAppleECGAlgorithmVersion1 Apple Watch used a version 1 algorithm to generate this ECG.
 */
@Generated
public final class HKAppleECGAlgorithmVersion {
    @Generated
    private HKAppleECGAlgorithmVersion() {
    }

    @Generated @NInt public static final long Version1 = 0x0000000000000001L;
    @Generated @NInt public static final long Version2 = 0x0000000000000002L;
}
