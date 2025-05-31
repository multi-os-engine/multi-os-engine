package apple.webkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Constants used by ``NSError`` to indicate errors in the ``WKWebExtensionMatchPattern`` domain.
 * [@constant] WKWebExtensionMatchPatternErrorUnknown Indicates that an unknown error occurred.
 * [@constant] WKWebExtensionMatchPatternErrorInvalidScheme Indicates that the scheme component was invalid.
 * [@constant] WKWebExtensionMatchPatternErrorInvalidHost Indicates that the host component was invalid.
 * [@constant] WKWebExtensionMatchPatternErrorInvalidPath Indicates that the path component was invalid.
 * 
 * API-Since: 18.4
 */
@Generated
public final class WKWebExtensionMatchPatternError {
    @Generated
    private WKWebExtensionMatchPatternError() {
    }

    /**
     * API-Since: 18.4
     */
    @Generated @NInt public static final long Unknown = 0x0000000000000001L;
    /**
     * API-Since: 18.4
     */
    @Generated @NInt public static final long InvalidScheme = 0x0000000000000002L;
    /**
     * API-Since: 18.4
     */
    @Generated @NInt public static final long InvalidHost = 0x0000000000000003L;
    /**
     * API-Since: 18.4
     */
    @Generated @NInt public static final long InvalidPath = 0x0000000000000004L;
}