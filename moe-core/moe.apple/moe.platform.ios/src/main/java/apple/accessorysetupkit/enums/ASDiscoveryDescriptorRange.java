package apple.accessorysetupkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * ---------------------------------------------------------------------------------------------------------------------------
 * 
 * Discovery Range
 */
@Generated
public final class ASDiscoveryDescriptorRange {
    @Generated
    private ASDiscoveryDescriptorRange() {
    }

    /**
     * The default range in which to discover accessories.
     */
    @Generated @NInt public static final long Default = 0x0000000000000000L;
    /**
     * A range in the immediate vicinity of the device performing accessory discovery.
     * 
     * This range means that an accessory is right next to the device running your app.
     */
    @Generated @NInt public static final long Immediate = 0x000000000000000AL;
}