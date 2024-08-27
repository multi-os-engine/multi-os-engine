package apple.networkextension.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@typedef] NEHotspotConfigurationEAPTTLSInnerAuthenticationType
 * 
 * TTLS Inner Authentication Type.
 * [@const] NEHotspotConfigurationEAPTTLSInnerAuthenticationPAP PAP.
 * [@const] NEHotspotConfigurationEAPTTLSInnerAuthenticationCHAP CHAP.
 * [@const] NEHotspotConfigurationEAPTTLSInnerAuthenticationMSCHAP MSCHAP.
 * [@const] NEHotspotConfigurationEAPTTLSInnerAuthenticationMSCHAPv2 MSCHAPv2.
 * [@const] NEHotspotConfigurationEAPTTLSInnerAuthenticationEAP EAP (Default).
 * 
 * API-Since: 11.0
 */
@Generated
public final class NEHotspotConfigurationTTLSInnerAuthenticationType {
    @Generated
    private NEHotspotConfigurationTTLSInnerAuthenticationType() {
    }

    /**
     * API-Since: 11.0
     */
    @Generated @NInt public static final long PAP = 0x0000000000000000L;
    /**
     * API-Since: 11.0
     */
    @Generated @NInt public static final long CHAP = 0x0000000000000001L;
    /**
     * API-Since: 11.0
     */
    @Generated @NInt public static final long MSCHAP = 0x0000000000000002L;
    /**
     * API-Since: 11.0
     */
    @Generated @NInt public static final long MSCHAPv2 = 0x0000000000000003L;
    /**
     * API-Since: 11.0
     */
    @Generated @NInt public static final long EAP = 0x0000000000000004L;
}
