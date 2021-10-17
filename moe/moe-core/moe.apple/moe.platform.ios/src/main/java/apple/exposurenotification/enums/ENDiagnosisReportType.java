package apple.exposurenotification.enums;

import org.moe.natj.general.ann.Generated;

/**
 * ===========================================================================================================================
 * <p>
 * How positive diagnosis was reported.
 */
@Generated
public final class ENDiagnosisReportType {
    @Generated
    private ENDiagnosisReportType() {
    }

    /**
     * Diagnosis type unknown or not available.
     */
    @Generated public static final int Unknown = 0x00000000;
    /**
     * Confirmed test.
     */
    @Generated public static final int ConfirmedTest = 0x00000001;
    /**
     * Confirmed clinical diagnosis.
     */
    @Generated public static final int ConfirmedClinicalDiagnosis = 0x00000002;
    /**
     * User reported positive diagnosis without health authority involvement.
     */
    @Generated public static final int SelfReported = 0x00000003;
    /**
     * Person determined to be positive based on exposure to another person confirmed to be positive. This report type
     * is reserved for future use and keys with this report type are not matched by iOS.
     */
    @Generated public static final int Recursive = 0x00000004;
    /**
     * Negative test. This is mainly to negate a previous self report or clinical diagnosis that may have been in error.
     */
    @Generated public static final int Revoked = 0x00000005;
}
