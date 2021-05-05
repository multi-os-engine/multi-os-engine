package apple.passkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class PKSecureElementPassActivationState {
    @Generated
    private PKSecureElementPassActivationState() {
    }

    @Generated @NInt public static final long Activated = 0x0000000000000000L;
    @Generated @NInt public static final long RequiresActivation = 0x0000000000000001L;
    @Generated @NInt public static final long Activating = 0x0000000000000002L;
    @Generated @NInt public static final long Suspended = 0x0000000000000003L;
    @Generated @NInt public static final long Deactivated = 0x0000000000000004L;
}