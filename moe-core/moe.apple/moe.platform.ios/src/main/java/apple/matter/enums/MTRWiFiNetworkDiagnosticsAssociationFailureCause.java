package apple.matter.enums;

import org.moe.natj.general.ann.Generated;

/**
 * API-Since: 16.1
 */
@Generated
public final class MTRWiFiNetworkDiagnosticsAssociationFailureCause {
    @Generated
    private MTRWiFiNetworkDiagnosticsAssociationFailureCause() {
    }

    /**
     * API-Since: 16.1
     */
    @Generated public static final byte Unknown = 0;
    /**
     * API-Since: 16.1
     */
    @Generated public static final byte AssociationFailed = 1;
    /**
     * API-Since: 16.1
     */
    @Generated public static final byte AuthenticationFailed = 2;
    /**
     * API-Since: 16.1
     */
    @Generated public static final byte SsidNotFound = 3;
}