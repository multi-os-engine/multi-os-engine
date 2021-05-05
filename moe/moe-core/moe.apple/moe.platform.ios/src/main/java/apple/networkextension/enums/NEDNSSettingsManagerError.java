package apple.networkextension.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@typedef] NEDNSSettingsManagerError
 * 
 * DNS Settings Manager error codes
 */
@Generated
public final class NEDNSSettingsManagerError {
    @Generated
    private NEDNSSettingsManagerError() {
    }

    /**
     * [@const] NEDNSSettingsManagerErrorConfigurationInvalid The DNS settings manager is invalid
     */
    @Generated @NInt public static final long Invalid = 0x0000000000000001L;
    /**
     * [@const] NEDNSSettingsManagerErrorConfigurationDisabled The DNS settings manager is not enabled.
     */
    @Generated @NInt public static final long Disabled = 0x0000000000000002L;
    /**
     * [@const] NEDNSSettingsManagerErrorConfigurationStale The DNS settings manager needs to be loaded.
     */
    @Generated @NInt public static final long Stale = 0x0000000000000003L;
    /**
     * [@const] NEDNSSettingsManagerErrorConfigurationCannotBeRemoved The DNS settings manager cannot be removed.
     */
    @Generated @NInt public static final long CannotBeRemoved = 0x0000000000000004L;
}