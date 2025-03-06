package apple.webkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] WKWebpagePreferencesUpgradeToHTTPSPolicy
 * 
 * A secure navigation policy represents whether or not there is a
 * preference for loading a webpage with https, and how failures should be
 * handled.
 * [@constant] WKWebpagePreferencesUpgradeToHTTPSPolicyKeepAsRequested Maintains the current behavior without preferring
 * https
 * [@constant] WKWebpagePreferencesUpgradeToHTTPSPolicyAutomaticFallbackToHTTP Upgrades http requests to https, and
 * re-attempts the request with http on failure
 * [@constant] WKWebpagePreferencesUpgradeToHTTPSPolicyUserMediatedFallbackToHTTP Upgrades http requests to https, and
 * shows a warning page on failure
 * [@constant] WKWebpagePreferencesUpgradeToHTTPSPolicyErrorOnFailure Upgrades http requests to https, and returns an
 * error on failure
 * 
 * API-Since: 18.2
 */
@Generated
public final class WKWebpagePreferencesUpgradeToHTTPSPolicy {
    @Generated
    private WKWebpagePreferencesUpgradeToHTTPSPolicy() {
    }

    /**
     * API-Since: 18.2
     */
    @Generated @NInt public static final long KeepAsRequested = 0x0000000000000000L;
    /**
     * API-Since: 18.2
     */
    @Generated @NInt public static final long AutomaticFallbackToHTTP = 0x0000000000000001L;
    /**
     * API-Since: 18.2
     */
    @Generated @NInt public static final long UserMediatedFallbackToHTTP = 0x0000000000000002L;
    /**
     * API-Since: 18.2
     */
    @Generated @NInt public static final long ErrorOnFailure = 0x0000000000000003L;
}