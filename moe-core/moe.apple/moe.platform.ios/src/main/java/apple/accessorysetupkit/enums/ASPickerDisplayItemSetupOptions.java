package apple.accessorysetupkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * ---------------------------------------------------------------------------------------------------------------------------
 * 
 * Accessory Setup Options
 */
@Generated
public final class ASPickerDisplayItemSetupOptions {
    @Generated
    private ASPickerDisplayItemSetupOptions() {
    }

    /**
     * Ask user to rename accessory.
     */
    @Generated @NUInt public static final long Rename = 0x0000000000000001L;
    /**
     * App session finishes accessory authorization.
     */
    @Generated @NUInt public static final long ConfirmAuthorization = 0x0000000000000002L;
    /**
     * Display instruction to finish setup in app after accessory is authorized to use.
     */
    @Generated @NUInt public static final long FinishInApp = 0x0000000000000004L;
}