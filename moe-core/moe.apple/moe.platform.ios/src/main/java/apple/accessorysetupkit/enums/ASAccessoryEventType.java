package apple.accessorysetupkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * ===========================================================================================================================
 * Type of event.
 */
@Generated
public final class ASAccessoryEventType {
    @Generated
    private ASAccessoryEventType() {
    }

    /**
     * Unknown event. Placeholder for initializing event types.
     */
    @Generated @NInt public static final long Unknown = 0x0000000000000000L;
    /**
     * [ASAccessoryEvent] Instance activate completed.
     */
    @Generated @NInt public static final long Activated = 0x000000000000000AL;
    /**
     * [ASAccessoryEvent] Instance invalidated.
     */
    @Generated @NInt public static final long Invalidated = 0x000000000000000BL;
    /**
     * [ASAccessoryEvent] Accessories migration complete.
     */
    @Generated @NInt public static final long MigrationComplete = 0x0000000000000014L;
    /**
     * [ASAccessoryEvent] Accessory added.
     */
    @Generated @NInt public static final long AccessoryAdded = 0x000000000000001EL;
    /**
     * [ASAccessoryEvent] Accessory removed from system.
     */
    @Generated @NInt public static final long AccessoryRemoved = 0x000000000000001FL;
    /**
     * [ASAccessoryEvent] Accessory properties changed.
     */
    @Generated @NInt public static final long AccessoryChanged = 0x0000000000000020L;
    /**
     * [ASAccessoryEvent] Picker did present.
     */
    @Generated @NInt public static final long PickerDidPresent = 0x0000000000000028L;
    /**
     * [ASAccessoryEvent] Picker did dismiss.
     */
    @Generated @NInt public static final long PickerDidDismiss = 0x0000000000000032L;
    /**
     * [ASAccessoryEvent] Picker started bridging with accessory.
     */
    @Generated @NInt public static final long PickerSetupBridging = 0x000000000000003CL;
    /**
     * [ASAccessoryEvent] Picker failed setup for accessory.
     */
    @Generated @NInt public static final long PickerSetupFailed = 0x0000000000000046L;
    /**
     * [ASAccessoryEvent] Picker started pairing with accessory.
     */
    @Generated @NInt public static final long PickerSetupPairing = 0x0000000000000050L;
    /**
     * [ASAccessoryEvent] Picker started rename of accessory.
     */
    @Generated @NInt public static final long PickerSetupRename = 0x000000000000005AL;
    /**
     * [ASAccessoryEvent] Accessory discovered.
     */
    @Generated @NInt public static final long AccessoryDiscovered = 0x0000000000000021L;
}