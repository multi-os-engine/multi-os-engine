package apple.appclip.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Error codes that an App Clip activation payload returns.
 * 
 * API-Since: 14.0
 */
@Generated
public final class APActivationPayloadErrorCode {
    @Generated
    private APActivationPayloadErrorCode() {
    }

    /**
     * The user denied location access, or the source of the App Clip
     * invocation wasn’t from an NFC tag or visual code.
     * 
     * API-Since: 14.0
     */
    @Generated @NInt public static final long Disallowed = 0x0000000000000001L;
    /**
     * The provided URL doesn’t match the registered App Clip URL.
     * 
     * API-Since: 14.0
     */
    @Generated @NInt public static final long DoesNotMatch = 0x0000000000000002L;
}
