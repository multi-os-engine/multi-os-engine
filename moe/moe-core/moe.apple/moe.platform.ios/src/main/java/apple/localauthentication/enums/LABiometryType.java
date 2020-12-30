package apple.localauthentication.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class LABiometryType {
    @Generated
    private LABiometryType() {
    }

    /**
     * The device does not support biometry.
     */
    @Generated @NInt public static final long None = 0x0000000000000000L;
    /**
     * The device supports Touch ID.
     */
    @Generated @NInt public static final long TypeTouchID = 0x0000000000000001L;
    /**
     * The device supports Face ID.
     */
    @Generated @NInt public static final long TypeFaceID = 0x0000000000000002L;
    /**
     * The device does not support biometry.
     */
    @Generated @NInt public static final long TypeNone = 0x0000000000000000L;
}