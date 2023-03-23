package apple.appclip.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] APActivationPayloadErrorCode
 * 
 * Error code of the NSError object passed in completionHandler for location confirmation.
 * [@constant] APActivationPayloadErrorCodeDisallowed The location confirmation request is disallowed by user or system;
 * or the code is not acquired by QR/NFC scanning.
 * [@constant] APActivationPayloadErrorCodeDoesNotMatch The payload passed in by the application doesn't match the
 * payload it was launched with.
 * 
 * API-Since: 14.0
 */
@Generated
public final class APActivationPayloadErrorCode {
    @Generated
    private APActivationPayloadErrorCode() {
    }

    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long Disallowed = 0x0000000000000001L;
    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long DoesNotMatch = 0x0000000000000002L;
}
