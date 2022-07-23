package apple.networkextension.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@typedef] NEHotspotConfigurationError
 * <p>
 * Hotspot Configuration error codes
 * [@const] NEHotspotConfigurationErrorInvalid The Wi-Fi configuration is invalid
 * [@const] NEHotspotConfigurationErrorInvalidSSID The given SSID string is invalid.
 * [@const] NEHotspotConfigurationErrorInvalidWPAPassphrase The given WPA/WPA2 Personal passphrase is invalid.
 * [@const] NEHotspotConfigurationErrorInvalidWEPPassphrase The given WEP passphrase is invalid.
 * [@const] NEHotspotConfigurationErrorInvalidEAPSettings Invalid EAP Settings.
 * [@const] NEHotspotConfigurationErrorInvalidHS20Settings Invalid Hotspot 2.0 Settings.
 * [@const] NEHotspotConfigurationErrorInvalidHS20DomainName The given Hotspot 2.0 domain name is invalid.
 * [@const] NEHotspotConfigurationErrorUserDenied Failed to get the user's approval to add a new configuration.
 * [@const] NEHotspotConfigurationErrorInternal An internal error was encountered.
 * [@const] NEHotspotConfigurationErrorPending Previous request by the calling application is pending.
 * [@const] NEHotspotConfigurationErrorSystemConfiguration The calling application cannot modify the System(MDM/Carrier)
 * configuration.
 * [@const] NEHotspotConfigurationErrorUnknown An unknown configuration error occurred.
 * [@const] NEHotspotConfigurationErrorJoinOnceNotSupported JoinOnce option is not support for EAP configuration.
 * [@const] NEHotspotConfigurationErrorAlreadyAssociated Wi-Fi is already associated.
 * [@const] NEHotspotConfigurationErrorApplicationIsNotInForeground The application is not in the foreground.
 * [@const] NEHotspotConfigurationErrorInvalidSSIDPrefix The given SSID Prefix string is invalid.
 */
@Generated
public final class NEHotspotConfigurationError {
    @Generated
    private NEHotspotConfigurationError() {
    }

    @Generated @NInt public static final long Invalid = 0x0000000000000000L;
    @Generated @NInt public static final long InvalidSSID = 0x0000000000000001L;
    @Generated @NInt public static final long InvalidWPAPassphrase = 0x0000000000000002L;
    @Generated @NInt public static final long InvalidWEPPassphrase = 0x0000000000000003L;
    @Generated @NInt public static final long InvalidEAPSettings = 0x0000000000000004L;
    @Generated @NInt public static final long InvalidHS20Settings = 0x0000000000000005L;
    @Generated @NInt public static final long InvalidHS20DomainName = 0x0000000000000006L;
    @Generated @NInt public static final long UserDenied = 0x0000000000000007L;
    @Generated @NInt public static final long Internal = 0x0000000000000008L;
    @Generated @NInt public static final long Pending = 0x0000000000000009L;
    @Generated @NInt public static final long SystemConfiguration = 0x000000000000000AL;
    @Generated @NInt public static final long Unknown = 0x000000000000000BL;
    @Generated @NInt public static final long JoinOnceNotSupported = 0x000000000000000CL;
    @Generated @NInt public static final long AlreadyAssociated = 0x000000000000000DL;
    @Generated @NInt public static final long ApplicationIsNotInForeground = 0x000000000000000EL;
    @Generated @NInt public static final long InvalidSSIDPrefix = 0x000000000000000FL;
}
