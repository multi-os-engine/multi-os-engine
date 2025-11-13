package apple.accessorysetupkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * ---------------------------------------------------------------------------------------------------------------------------
 * A type that defines service roles for Wi-Fi Aware accessories.
 */
@Generated
public final class ASDiscoveryDescriptorWiFiAwareServiceRole {
    @Generated
    private ASDiscoveryDescriptorWiFiAwareServiceRole() {
    }

    /**
     * The subscriber service role.
     */
    @Generated @NInt public static final long Subscriber = 0x000000000000000AL;
    /**
     * The publisher service role.
     */
    @Generated @NInt public static final long Publisher = 0x0000000000000014L;
}