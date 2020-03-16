package apple.intents.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class INStartCallIntentResponseCode {
    @Generated
    private INStartCallIntentResponseCode() {
    }

    @Generated @NInt public static final long Unspecified = 0x0000000000000000L;
    @Generated @NInt public static final long Ready = 0x0000000000000001L;
    @Generated @NInt public static final long ContinueInApp = 0x0000000000000002L;
    @Generated @NInt public static final long UserConfirmationRequired = 0x0000000000000003L;
    @Generated @NInt public static final long Failure = 0x0000000000000004L;
    @Generated @NInt public static final long FailureRequiringAppLaunch = 0x0000000000000005L;
    @Generated @NInt public static final long FailureCallingServiceNotAvailable = 0x0000000000000006L;
    @Generated @NInt public static final long FailureContactNotSupportedByApp = 0x0000000000000007L;
    @Generated @NInt public static final long FailureAirplaneModeEnabled = 0x0000000000000008L;
    @Generated @NInt public static final long FailureUnableToHandOff = 0x0000000000000009L;
    @Generated @NInt public static final long FailureAppConfigurationRequired = 0x000000000000000AL;
    @Generated @NInt public static final long FailureCallInProgress = 0x000000000000000BL;
}