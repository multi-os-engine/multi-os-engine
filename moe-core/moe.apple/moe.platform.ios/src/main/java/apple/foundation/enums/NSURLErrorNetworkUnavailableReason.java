package apple.foundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] Codes associated with NSURLErrorNetworkUnavailableReasonKey
 * 
 * Constants used by NSError to indicate that a URLSessionTask failed because of unsatisfiable network constraints.
 * 
 * For example if the URLSessionConfiguration property allowsExpensiveNetworkAccess was set to NO and the only
 * interfaces available were marked as expensive then the task would fail with a NSURLErrorNotConnectedToInternet error
 * and the userInfo dictionary would contain the value NSURLErrorNetworkUnavailableReasonExpensive for the key
 * NSURLErrorNetworkUnavailableReason.
 * 
 * API-Since: 13.0
 */
@Generated
public final class NSURLErrorNetworkUnavailableReason {
    @Generated
    private NSURLErrorNetworkUnavailableReason() {
    }

    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long Cellular = 0x0000000000000000L;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long Expensive = 0x0000000000000001L;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long Constrained = 0x0000000000000002L;
}
