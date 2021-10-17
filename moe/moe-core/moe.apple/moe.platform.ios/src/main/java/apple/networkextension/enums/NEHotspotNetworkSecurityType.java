package apple.networkextension.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@typedef] NEHotspotNetworkSecurityType
 * <p>
 * Wi-Fi network security type
 */
@Generated
public final class NEHotspotNetworkSecurityType {
    @Generated
    private NEHotspotNetworkSecurityType() {
    }

    /**
     * [@const] NEHotspotNetworkSecurityTypeOpen Open security type
     */
    @Generated @NInt public static final long Open = 0x0000000000000000L;
    /**
     * [@const] NEHotspotNetworkSecurityTypeWEP WEP security type
     */
    @Generated @NInt public static final long WEP = 0x0000000000000001L;
    /**
     * [@const] NEHotspotNetworkSecurityTypeWPA WPA/WPA2/WPA3 using pre-shared secret
     */
    @Generated @NInt public static final long Personal = 0x0000000000000002L;
    /**
     * [@const] NEHotspotNetworkSecurityTypeEnterprise WPA/WPA2/WPA3 using enterprise level security
     */
    @Generated @NInt public static final long Enterprise = 0x0000000000000003L;
    /**
     * [@const] NEHotspotNetworkSecurityTypeUnknown Unknown security type
     */
    @Generated @NInt public static final long Unknown = 0x0000000000000004L;
}
