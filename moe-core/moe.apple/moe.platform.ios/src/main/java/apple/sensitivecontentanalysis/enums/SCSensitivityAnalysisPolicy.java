package apple.sensitivecontentanalysis.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * SensitivityAnalysis Policy on device, represents type of interventions when enabled
 * 
 * API-Since: 17.0
 */
@Generated
public final class SCSensitivityAnalysisPolicy {
    @Generated
    private SCSensitivityAnalysisPolicy() {
    }

    /**
     * No feature enabled that is requiring Sensitive Analysis on device, analysis will be disabled
     * 
     * API-Since: 17.0
     */
    @Generated @NInt public static final long Disabled = 0x0000000000000000L;
    /**
     * Sensitive Analysis is enabled on device through "Sensitive Content Warning" in Settings.
     * It is expected that brief/inline UI, like simple "show" button.
     * 
     * API-Since: 17.0
     */
    @Generated @NInt public static final long SimpleInterventions = 0x0000000000000001L;
    /**
     * Sensitive Analysis is enabled for kids or teens in ScreenTime through "Communications Safety" feature.
     * It's expected to have more descriptive UI for the user, explaining potential risks.
     * 
     * API-Since: 17.0
     */
    @Generated @NInt public static final long DescriptiveInterventions = 0x0000000000000002L;
}