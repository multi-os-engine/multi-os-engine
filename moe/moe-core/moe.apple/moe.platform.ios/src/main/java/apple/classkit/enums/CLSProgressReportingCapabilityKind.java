package apple.classkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum]       CLSProgressReportingCapabilityKind
 * [@constant]   CLSProgressReportingCapabilityKindDuration     Reports time spent. By default all CLSContexts have this capability. See CLSActivity for more information.
 * [@constant]   CLSProgressReportingCapabilityKindPercent      Reports progress percentage. See CLSActivity for more information.
 * [@constant]   CLSProgressReportingCapabilityKindBinary       Reports a binary value like true/false, pass/fail, yes/no or correct/incorrect. See CLSBinaryItem for more information.
 * [@constant]   CLSProgressReportingCapabilityKindQuantity     Reports a discrete value. See CLSQuantityItem for more information.
 * [@constant]   CLSProgressReportingCapabilityKindScore        Reports a score. See CLSScoreItem for more information.
 */
@Generated
public final class CLSProgressReportingCapabilityKind {
    @Generated
    private CLSProgressReportingCapabilityKind() {
    }

    @Generated @NInt public static final long Duration = 0x0000000000000000L;
    @Generated @NInt public static final long Percent = 0x0000000000000001L;
    @Generated @NInt public static final long Binary = 0x0000000000000002L;
    @Generated @NInt public static final long Quantity = 0x0000000000000003L;
    @Generated @NInt public static final long Score = 0x0000000000000004L;
}