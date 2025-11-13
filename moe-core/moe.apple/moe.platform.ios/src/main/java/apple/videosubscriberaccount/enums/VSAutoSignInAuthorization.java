package apple.videosubscriberaccount.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Auto sign in authorization state.
 * 
 * API-Since: 26.0
 */
@Generated
public final class VSAutoSignInAuthorization {
    @Generated
    private VSAutoSignInAuthorization() {
    }

    /**
     * Consent to auto sign in hasn't been granted nor denied.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long NotDetermined = 0x0000000000000000L;
    /**
     * Authorized to store and use auto sign in tokens.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Granted = 0x0000000000000001L;
    /**
     * Consent to use auto sign in has been denied.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Denied = 0x0000000000000002L;
}