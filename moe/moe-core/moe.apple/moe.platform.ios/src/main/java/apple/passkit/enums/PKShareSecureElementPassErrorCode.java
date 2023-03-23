package apple.passkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 16.0
 */
@Generated
public final class PKShareSecureElementPassErrorCode {
    @Generated
    private PKShareSecureElementPassErrorCode() {
    }

    /**
     * API-Since: 16.0
     */
    @Generated @NInt public static final long UnknownError = 0x0000000000000000L;
    /**
     * Unable to present share pass UI. This generally occurs when your app isn't entitled to the pass
     * or the pass isn't shareable.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long SetupError = 0x0000000000000001L;
}