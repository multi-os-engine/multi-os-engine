package apple.exposurenotification.enums;

import org.moe.natj.general.ann.Generated;

/**
 * ===========================================================================================================================
 * 
 * How positive diagnosis was reported.
 * 
 * API-Since: 12.5
 */
@Generated
public final class ENDiagnosisReportType {
    @Generated
    private ENDiagnosisReportType() {
    }

    /**
     * Diagnosis type unknown or not available.
     * 
     * API-Since: 12.5
     */
    @Generated public static final int Unknown = 0x00000000;
    /**
     * Confirmed test.
     * 
     * API-Since: 12.5
     */
    @Generated public static final int ConfirmedTest = 0x00000001;
    /**
     * Confirmed clinical diagnosis.
     * 
     * API-Since: 12.5
     */
    @Generated public static final int ConfirmedClinicalDiagnosis = 0x00000002;
    /**
     * User reported positive diagnosis without health authority involvement.
     * 
     * API-Since: 12.5
     */
    @Generated public static final int SelfReported = 0x00000003;
    /**
     * Person determined to be positive based on exposure to another person confirmed to be positive. This report type
     * is reserved for future use and keys with this report type are not matched by iOS.
     * 
     * API-Since: 12.5
     */
    @Generated public static final int Recursive = 0x00000004;
    /**
     * Negative test. This is mainly to negate a previous self report or clinical diagnosis that may have been in error.
     * 
     * API-Since: 12.5
     */
    @Generated public static final int Revoked = 0x00000005;
}
