package apple.adservices.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * The error codes that may be returned by AAAttribution.
 * 
 * API-Since: 14.3
 */
@Generated
public final class AAAttributionErrorCode {
    @Generated
    private AAAttributionErrorCode() {
    }

    /**
     * attributionTokenWithError: is unable to provide a token because the internet isn’t available.
     * 
     * To receive an attribution token, you must have unimpeded internet access. Make sure
     * you’re not using a simulator when generating a token.
     * 
     * API-Since: 14.3
     */
    @Generated @NInt public static final long NetworkError = 0x0000000000000001L;
    /**
     * attributionTokenWithError: is unable to provide a token because of an internal error.
     * 
     * API-Since: 14.3
     */
    @Generated @NInt public static final long InternalError = 0x0000000000000002L;
    /**
     * attributionTokenWithError: is unable to provide a token because of an unsupported operating system.
     * 
     * API-Since: 14.3
     */
    @Generated @NInt public static final long PlatformNotSupported = 0x0000000000000003L;
}
