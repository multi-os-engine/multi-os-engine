package apple.networkextension.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@typedef] NEHotspotConfigurationEAPType
 * 
 * EAP Type.
 * [@const] NEHotspotConfigurationEAPTypeTLS EAP-TLS.
 * [@const] NEHotspotConfigurationEAPTypeTTLS TTLS.
 * [@const] NEHotspotConfigurationEAPTypePEAP PEAP.
 * [@const] NEHotspotConfigurationEAPTypeFAST EAP-FAST.
 * 
 * API-Since: 11.0
 */
@Generated
public final class NEHotspotConfigurationEAPType {
    @Generated
    private NEHotspotConfigurationEAPType() {
    }

    /**
     * API-Since: 11.0
     */
    @Generated @NInt public static final long EAPTLS = 0x000000000000000DL;
    /**
     * API-Since: 11.0
     */
    @Generated @NInt public static final long EAPTTLS = 0x0000000000000015L;
    /**
     * API-Since: 11.0
     */
    @Generated @NInt public static final long EAPPEAP = 0x0000000000000019L;
    /**
     * API-Since: 11.0
     */
    @Generated @NInt public static final long EAPFAST = 0x000000000000002BL;
}
