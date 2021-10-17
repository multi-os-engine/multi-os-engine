package apple.exposurenotification.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * ===========================================================================================================================
 * <p>
 * Overall status of Exposure Notification on the system.
 */
@Generated
public final class ENStatus {
    @Generated
    private ENStatus() {
    }

    /**
     * Status of Exposure Notification is unknown. This is the status before ENManager has activated successfully.
     */
    @Generated @NInt public static final long Unknown = 0x0000000000000000L;
    /**
     * Exposure Notification is active on the system.
     */
    @Generated @NInt public static final long Active = 0x0000000000000001L;
    /**
     * Exposure Notification is disabled. setExposureNotificationEnabled:completionHandler can be used to enable it.
     */
    @Generated @NInt public static final long Disabled = 0x0000000000000002L;
    /**
     * Bluetooth has been turned off on the system. Bluetooth is required for Exposure Notification.
     * Note: this may not match the state of Bluetooth as reported by CoreBluetooth.
     * Exposure Notification is a system service and can use Bluetooth in situations when apps cannot.
     * So for the purposes of Exposure Notification, it's better to use this API instead of CoreBluetooth.
     */
    @Generated @NInt public static final long BluetoothOff = 0x0000000000000003L;
    /**
     * Exposure Notification is not active due to system restrictions, such as parental controls.
     * When in this state, the app cannot enable Exposure Notification.
     */
    @Generated @NInt public static final long Restricted = 0x0000000000000004L;
    /**
     * For future use. Not returned by any APIs yet.
     */
    @Generated @NInt public static final long Paused = 0x0000000000000005L;
    /**
     * Exposure Notification is not available due to insufficient authorization.
     */
    @Generated @NInt public static final long Unauthorized = 0x0000000000000006L;
}
