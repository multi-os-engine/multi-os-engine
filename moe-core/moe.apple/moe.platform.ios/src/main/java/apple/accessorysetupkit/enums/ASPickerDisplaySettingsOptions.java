package apple.accessorysetupkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * ===========================================================================================================================
 * 
 * Picker Options
 */
@Generated
public final class ASPickerDisplaySettingsOptions {
    @Generated
    private ASPickerDisplaySettingsOptions() {
    }

    /**
     * An option to pass discovered accessories to the app for more custom filtering, before they're displayed in the
     * picker for selection.
     * 
     * When your picker uses this option, your ``ASAccessorySession-class`` receives events of type
     * ``ASAccessoryEventType/accessoryDiscovered``.
     * Handle this event by examining the discovered accessory.
     * To include it in the picker, create a new ``ASDiscoveredDisplayItem`` for it and call
     * ``ASAccessorySession/updatePicker(showing:completionHandler:)``.
     */
    @Generated @NUInt public static final long ASPickerDisplaySettingsOptionFilterDiscoveryResults = 0x0000000000000001L;
}