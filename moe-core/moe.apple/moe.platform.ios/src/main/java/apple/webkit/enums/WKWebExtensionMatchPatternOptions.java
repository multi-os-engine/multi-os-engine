package apple.webkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * Constants used by ``WKWebExtensionMatchPattern`` to indicate matching options.
 * [@constant] WKWebExtensionMatchPatternOptionsNone Indicates no special matching options.
 * [@constant] WKWebExtensionMatchPatternOptionsIgnoreSchemes Indicates that the scheme components should be ignored
 * while matching.
 * [@constant] WKWebExtensionMatchPatternOptionsIgnorePaths Indicates that the host components should be ignored while
 * matching.
 * [@constant] WKWebExtensionMatchPatternOptionsMatchBidirectionally Indicates that two patterns should be checked in
 * either direction while matching (A matches B, or B matches A). Invalid for matching URLs.
 * 
 * API-Since: 18.4
 */
@Generated
public final class WKWebExtensionMatchPatternOptions {
    @Generated
    private WKWebExtensionMatchPatternOptions() {
    }

    /**
     * API-Since: 18.4
     */
    @Generated @NUInt public static final long None = 0x0000000000000000L;
    /**
     * API-Since: 18.4
     */
    @Generated @NUInt public static final long IgnoreSchemes = 0x0000000000000001L;
    /**
     * API-Since: 18.4
     */
    @Generated @NUInt public static final long IgnorePaths = 0x0000000000000002L;
    /**
     * API-Since: 18.4
     */
    @Generated @NUInt public static final long MatchBidirectionally = 0x0000000000000004L;
}