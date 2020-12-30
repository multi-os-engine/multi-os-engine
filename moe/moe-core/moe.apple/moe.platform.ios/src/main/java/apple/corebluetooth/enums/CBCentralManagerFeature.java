package apple.corebluetooth.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 *  [@enum] CBCentralManagerFeature
 * 
 * The set of device specific features.
 * 
 * [@constant] CBCentralManagerFeatureExtendedScanAndConnect      The hardware supports extended scans and enhanced connection creation
 */
@Generated
public final class CBCentralManagerFeature {
    @Generated
    private CBCentralManagerFeature() {
    }

    @Generated @NUInt public static final long CBCentralManagerFeatureExtendedScanAndConnect = 0x0000000000000001L;
}