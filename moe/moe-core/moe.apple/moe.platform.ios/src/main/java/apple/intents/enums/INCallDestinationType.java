package apple.intents.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class INCallDestinationType {
    @Generated
    private INCallDestinationType() {
    }

    @Generated @NInt public static final long Unknown = 0x0000000000000000L;
    @Generated @NInt public static final long Normal = 0x0000000000000001L;
    @Generated @NInt public static final long Emergency = 0x0000000000000002L;
    @Generated @NInt public static final long Voicemail = 0x0000000000000003L;
    @Generated @NInt public static final long Redial = 0x0000000000000004L;
    @Generated @NInt public static final long NormalDestination = 0x0000000000000001L;
    @Generated @NInt public static final long EmergencyDestination = 0x0000000000000002L;
    @Generated @NInt public static final long VoicemailDestination = 0x0000000000000003L;
    @Generated @NInt public static final long RedialDestination = 0x0000000000000004L;
}