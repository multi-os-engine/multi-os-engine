package apple.foundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class NSProcessInfoThermalState {
    @Generated
    private NSProcessInfoThermalState() {
    }

    @Generated @NInt public static final long Nominal = 0x0000000000000000L;
    @Generated @NInt public static final long Fair = 0x0000000000000001L;
    @Generated @NInt public static final long Serious = 0x0000000000000002L;
    @Generated @NInt public static final long Critical = 0x0000000000000003L;
}