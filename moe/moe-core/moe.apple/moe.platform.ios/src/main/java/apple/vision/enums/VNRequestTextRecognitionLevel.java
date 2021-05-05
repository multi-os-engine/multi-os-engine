package apple.vision.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Text recognition level options to favor speed over recognition accuracy. The VNRequestTextRecognitionLevelAccurate is the default option used by VNRecognizeTextRequest.
 */
@Generated
public final class VNRequestTextRecognitionLevel {
    @Generated
    private VNRequestTextRecognitionLevel() {
    }

    @Generated @NInt public static final long Accurate = 0x0000000000000000L;
    @Generated @NInt public static final long Fast = 0x0000000000000001L;
}