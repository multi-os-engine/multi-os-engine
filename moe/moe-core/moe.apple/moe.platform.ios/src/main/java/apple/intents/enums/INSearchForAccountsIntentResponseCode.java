package apple.intents.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class INSearchForAccountsIntentResponseCode {
    @Generated
    private INSearchForAccountsIntentResponseCode() {
    }

    @Generated @NInt public static final long Unspecified = 0x0000000000000000L;
    @Generated @NInt public static final long Ready = 0x0000000000000001L;
    @Generated @NInt public static final long InProgress = 0x0000000000000002L;
    @Generated @NInt public static final long Success = 0x0000000000000003L;
    @Generated @NInt public static final long Failure = 0x0000000000000004L;
    @Generated @NInt public static final long FailureRequiringAppLaunch = 0x0000000000000005L;
    @Generated @NInt public static final long FailureCredentialsUnverified = 0x0000000000000006L;
    @Generated @NInt public static final long FailureAccountNotFound = 0x0000000000000007L;
    @Generated @NInt public static final long FailureTermsAndConditionsAcceptanceRequired = 0x0000000000000008L;
    @Generated @NInt public static final long FailureNotEligible = 0x0000000000000009L;
}