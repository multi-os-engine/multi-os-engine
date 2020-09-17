package apple.corehaptics.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class CHHapticEngineStoppedReason {
    @Generated
    private CHHapticEngineStoppedReason() {
    }

    @Generated @NInt public static final long AudioSessionInterrupt = 0x0000000000000001L;
    @Generated @NInt public static final long ApplicationSuspended = 0x0000000000000002L;
    @Generated @NInt public static final long IdleTimeout = 0x0000000000000003L;
    @Generated @NInt public static final long NotifyWhenFinished = 0x0000000000000004L;
    @Generated @NInt public static final long SystemError = 0xFFFFFFFFFFFFFFFFL;
    @Generated @NInt public static final long EngineDestroyed = 0x0000000000000005L;
    @Generated @NInt public static final long GameControllerDisconnect = 0x0000000000000006L;
}