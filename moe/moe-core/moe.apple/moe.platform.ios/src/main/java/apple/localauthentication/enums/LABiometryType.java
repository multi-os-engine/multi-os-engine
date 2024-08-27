package apple.localauthentication.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 11.0
 */
@Generated
public final class LABiometryType {
    @Generated
    private LABiometryType() {
    }

    /**
     * The device does not support biometry.
     * 
     * API-Since: 11.0
     * Deprecated-Since: 11.2
     */
    @Deprecated @Generated @NInt public static final long None = 0x0000000000000000L;
    /**
     * The device supports Touch ID.
     * 
     * API-Since: 11.0
     */
    @Generated @NInt public static final long TypeTouchID = 0x0000000000000001L;
    /**
     * The device supports Face ID.
     */
    @Generated @NInt public static final long TypeFaceID = 0x0000000000000002L;
    /**
     * The device does not support biometry.
     * 
     * API-Since: 11.2
     */
    @Generated @NInt public static final long TypeNone = 0x0000000000000000L;
    /**
     * The device supports Optic ID
     * 
     * API-Since: 17.0
     */
    @Generated @NInt public static final long TypeOpticID = 0x0000000000000004L;
}