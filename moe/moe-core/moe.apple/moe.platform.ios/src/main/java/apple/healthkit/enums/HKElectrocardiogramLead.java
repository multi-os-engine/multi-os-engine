package apple.healthkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] HKElectrocardiogramLead
 * 
 * The medically-defined leads supported by HKElectrocardiogram
 * [@constant] HKElectrocardiogramLeadAppleWatchSimilarToLeadI. Apple Watch Series 4 and above has an electrical heart
 * sensor that, when using
 * the ECG app, enables the generation and analysis of an ECG similar to a Lead I ECG.
 * 
 * API-Since: 14.0
 */
@Generated
public final class HKElectrocardiogramLead {
    @Generated
    private HKElectrocardiogramLead() {
    }

    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long HKElectrocardiogramLeadAppleWatchSimilarToLeadI = 0x0000000000000001L;
}
