package apple.passkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 13.4
 */
@Generated
public final class PKAddSecureElementPassErrorCode {
    @Generated
    private PKAddSecureElementPassErrorCode() {
    }

    /**
     * API-Since: 13.4
     * Deprecated-Since: 18.0
     * Deprecated-Message: Use PKAddSecureElementPassGeneralError instead.
     */
    @Deprecated @Generated @NInt public static final long UnknownError = 0x0000000000000000L;
    /**
     * API-Since: 13.4
     */
    @Generated @NInt public static final long UserCanceledError = 0x0000000000000001L;
    /**
     * API-Since: 13.4
     */
    @Generated @NInt public static final long UnavailableError = 0x0000000000000002L;
    /**
     * API-Since: 13.4
     */
    @Generated @NInt public static final long InvalidConfigurationError = 0x0000000000000003L;
    /**
     * API-Since: 13.4
     */
    @Generated @NInt public static final long DeviceNotSupportedError = 0x0000000000000004L;
    /**
     * API-Since: 13.4
     */
    @Generated @NInt public static final long DeviceNotReadyError = 0x0000000000000005L;
    /**
     * API-Since: 13.4
     */
    @Generated @NInt public static final long OSVersionNotSupportedError = 0x0000000000000006L;
    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long GenericError = 0x0000000000000000L;
}