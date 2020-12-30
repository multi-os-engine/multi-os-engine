package apple.networkextension.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * @typedef NEHotspotConfigurationEAPType
 * @abstract EAP Type.
 * @const NEHotspotConfigurationEAPTypeTLS EAP-TLS.
 * @const NEHotspotConfigurationEAPTypeTTLS TTLS.
 * @const NEHotspotConfigurationEAPTypePEAP PEAP.
 * @const NEHotspotConfigurationEAPTypeFAST EAP-FAST.
 */
@Generated
public final class NEHotspotConfigurationEAPType {
    @Generated
    private NEHotspotConfigurationEAPType() {
    }

    @Generated @NInt public static final long EAPTLS = 0x000000000000000DL;
    @Generated @NInt public static final long EAPTTLS = 0x0000000000000015L;
    @Generated @NInt public static final long EAPPEAP = 0x0000000000000019L;
    @Generated @NInt public static final long EAPFAST = 0x000000000000002BL;
}