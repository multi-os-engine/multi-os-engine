package apple.passkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Share secure element pass result sent to delegate upon user completion.
 * 
 * [@constant] PKShareSecureElementPassResultCanceled User canceled the share.
 * [@constant] PKShareSecureElementPassResultShared User successfully shared the secure element pass.
 * [@constant] PKShareSecureElementPassResultFailed User's attempt to share was unsuccessful.
 * 
 * API-Since: 16.0
 */
@Generated
public final class PKShareSecureElementPassResult {
    @Generated
    private PKShareSecureElementPassResult() {
    }

    /**
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Canceled = 0x0000000000000000L;
    /**
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Shared = 0x0000000000000001L;
    /**
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Failed = 0x0000000000000002L;
}