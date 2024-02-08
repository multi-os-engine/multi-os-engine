package apple.passkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 17.0
 */
@Generated
public final class PKDisbursementErrorCode {
    @Generated
    private PKDisbursementErrorCode() {
    }

    /**
     * there was an unknown error processing the disbursement. The user should try again.
     * 
     * API-Since: 17.0
     */
    @Generated @NInt public static final long UnknownError = 0xFFFFFFFFFFFFFFFFL;
    /**
     * the selected card does not support receiving funds in.
     * 
     * API-Since: 17.0
     */
    @Generated @NInt public static final long UnsupportedCardError = 0x0000000000000001L;
    /**
     * the recipient contact information has an error. Use the PKDisbursementErrorKeys in the userInfo to detail the
     * problem.
     * 
     * API-Since: 17.0
     */
    @Generated @NInt public static final long RecipientContactInvalidError = 0x0000000000000002L;
}