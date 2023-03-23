package apple.passkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Denotes the label displayed on a PKIdentityButton
 * 
 * API-Since: 16.0
 */
@Generated
public final class PKIdentityButtonLabel {
    @Generated
    private PKIdentityButtonLabel() {
    }

    /**
     * Button with text "Verify Identity with Apple Wallet"
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long VerifyIdentity = 0x0000000000000000L;
    /**
     * Button with text "Verify with Apple Wallet"
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Verify = 0x0000000000000001L;
    /**
     * Button with text "Verify Age with Apple Wallet"
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long VerifyAge = 0x0000000000000002L;
    /**
     * Button with text "Continue with Apple Wallet"
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Continue = 0x0000000000000003L;
}