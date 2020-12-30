package apple.identitylookup.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class ILMessageFilterError {
    @Generated
    private ILMessageFilterError() {
    }

    /**
     * An unspecified system error occurred.
     */
    @Generated @NInt public static final long System = 0x0000000000000001L;
    /**
     * The network request URL included in the extension's Info.plist was either missing or invalid. See documentation for network request URL requirements.
     */
    @Generated @NInt public static final long InvalidNetworkURL = 0x0000000000000002L;
    /**
     * Extension's containing app is not authorized to allow extension to defer network requests to the host specified in the URL of the extension's Info.plist.
     */
    @Generated @NInt public static final long NetworkURLUnauthorized = 0x0000000000000003L;
    /**
     * Network request was attempted but failed. See `NSUnderlyingErrorKey` in `userInfo` dictionary for details.
     */
    @Generated @NInt public static final long NetworkRequestFailed = 0x0000000000000004L;
    /**
     * Extension requested to defer a request to its network service more than once. Requests may be deferred to the network at most once.
     */
    @Generated @NInt public static final long RedundantNetworkDeferral = 0x0000000000000005L;
}