package apple.matter.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class MTRDiscoveryCapabilities {
    @Generated
    private MTRDiscoveryCapabilities() {
    }

    /**
     * Device capabilities are not known (e.g. all we have is a numeric code).
     */
    @Generated @NUInt public static final long Unknown = 0x0000000000000000L;
    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     */
    @Generated @Deprecated @NUInt public static final long None = 0x0000000000000000L;
    /**
     * Device supports WiFi softAP
     */
    @Generated @NUInt public static final long SoftAP = 0x0000000000000001L;
    /**
     * Device supports BLE
     */
    @Generated @NUInt public static final long BLE = 0x0000000000000002L;
    /**
     * Device supports On Network setup
     */
    @Generated @NUInt public static final long OnNetwork = 0x0000000000000004L;
    @Generated @NUInt public static final long AllMask = 0x0000000000000007L;
}