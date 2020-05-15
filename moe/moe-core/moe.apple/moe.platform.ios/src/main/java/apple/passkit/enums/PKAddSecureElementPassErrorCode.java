package apple.passkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class PKAddSecureElementPassErrorCode {
    @Generated
    private PKAddSecureElementPassErrorCode() {
    }

    @Generated @NInt public static final long UnknownError = 0x0000000000000000L;
    @Generated @NInt public static final long UserCanceledError = 0x0000000000000001L;
    @Generated @NInt public static final long UnavailableError = 0x0000000000000002L;
    @Generated @NInt public static final long InvalidConfigurationError = 0x0000000000000003L;
    @Generated @NInt public static final long DeviceNotSupportedError = 0x0000000000000004L;
    @Generated @NInt public static final long DeviceNotReadyError = 0x0000000000000005L;
}