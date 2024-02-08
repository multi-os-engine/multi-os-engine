package apple.networkextension.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@typedef] NERelayManagerError
 * 
 * NERelay Manager error codes
 * 
 * API-Since: 17.0
 */
@Generated
public final class NERelayManagerError {
    @Generated
    private NERelayManagerError() {
    }

    /**
     * [@const] NERelayManagerErrorConfigurationInvalid The relay manager is invalid
     * 
     * API-Since: 17.0
     */
    @Generated @NInt public static final long Invalid = 0x0000000000000001L;
    /**
     * [@const] NERelayManagerErrorConfigurationDisabled The relay manager is not enabled.
     * 
     * API-Since: 17.0
     */
    @Generated @NInt public static final long Disabled = 0x0000000000000002L;
    /**
     * [@const] NERelayManagerErrorConfigurationStale The relay manager needs to be loaded.
     * 
     * API-Since: 17.0
     */
    @Generated @NInt public static final long Stale = 0x0000000000000003L;
    /**
     * [@const] NERelayManagerErrorConfigurationCannotBeRemoved The relay manager cannot be removed.
     * 
     * API-Since: 17.0
     */
    @Generated @NInt public static final long CannotBeRemoved = 0x0000000000000004L;
}