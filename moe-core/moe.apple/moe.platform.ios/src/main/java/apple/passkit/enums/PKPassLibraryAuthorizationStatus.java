package apple.passkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 26.0
 */
@Generated
public final class PKPassLibraryAuthorizationStatus {
    @Generated
    private PKPassLibraryAuthorizationStatus() {
    }

    /**
     * API-Since: 26.0
     */
    @Generated @NInt public static final long NotDetermined = 0xFFFFFFFFFFFFFFFFL;
    /**
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Denied = 0x0000000000000000L;
    /**
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Authorized = 0x0000000000000001L;
    /**
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Restricted = 0x0000000000000002L;
}