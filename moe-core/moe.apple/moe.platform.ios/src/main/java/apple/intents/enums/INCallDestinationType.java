package apple.intents.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 11.0
 */
@Generated
public final class INCallDestinationType {
    @Generated
    private INCallDestinationType() {
    }

    /**
     * API-Since: 11.0
     */
    @Generated @NInt public static final long Unknown = 0x0000000000000000L;
    /**
     * API-Since: 11.0
     */
    @Generated @NInt public static final long Normal = 0x0000000000000001L;
    /**
     * API-Since: 11.0
     */
    @Generated @NInt public static final long Emergency = 0x0000000000000002L;
    /**
     * API-Since: 11.0
     */
    @Generated @NInt public static final long Voicemail = 0x0000000000000003L;
    /**
     * API-Since: 11.0
     */
    @Generated @NInt public static final long Redial = 0x0000000000000004L;
    /**
     * API-Since: 11.0
     * Deprecated-Since: 11.0
     * Deprecated-Message: Use INCallDestinationTypeNormal instead
     */
    @Deprecated @Generated @NInt public static final long NormalDestination = 0x0000000000000001L;
    /**
     * API-Since: 11.0
     * Deprecated-Since: 11.0
     * Deprecated-Message: Use INCallDestinationTypeEmergency instead
     */
    @Deprecated @Generated @NInt public static final long EmergencyDestination = 0x0000000000000002L;
    /**
     * API-Since: 11.0
     * Deprecated-Since: 11.0
     * Deprecated-Message: Use INCallDestinationTypeVoicemail instead
     */
    @Deprecated @Generated @NInt public static final long VoicemailDestination = 0x0000000000000003L;
    /**
     * API-Since: 11.0
     * Deprecated-Since: 11.0
     * Deprecated-Message: Use INCallDestinationTypeRedial instead
     */
    @Deprecated @Generated @NInt public static final long RedialDestination = 0x0000000000000004L;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long CallBack = 0x0000000000000005L;
}