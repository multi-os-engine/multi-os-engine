package apple.healthkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class HKElectrocardiogramClassification {
    @Generated
    private HKElectrocardiogramClassification() {
    }

    @Generated @NInt public static final long NotSet = 0x0000000000000000L;
    @Generated @NInt public static final long SinusRhythm = 0x0000000000000001L;
    @Generated @NInt public static final long AtrialFibrillation = 0x0000000000000002L;
    @Generated @NInt public static final long InconclusiveLowHeartRate = 0x0000000000000003L;
    @Generated @NInt public static final long InconclusiveHighHeartRate = 0x0000000000000004L;
    @Generated @NInt public static final long InconclusivePoorReading = 0x0000000000000005L;
    @Generated @NInt public static final long InconclusiveOther = 0x0000000000000006L;
    @Generated @NInt public static final long Unrecognized = 0x0000000000000064L;
}