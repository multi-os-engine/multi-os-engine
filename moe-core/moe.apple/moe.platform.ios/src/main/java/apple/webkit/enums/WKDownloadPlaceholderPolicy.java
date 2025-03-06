package apple.webkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] WKDownloadPlaceholderPolicy
 * 
 * The policy for creating a placeholder file in the Downloads directory during downloads.
 * [@constant] WKDownloadPlaceholderPolicyDisable Do not create a placeholder file.
 * [@constant] WKDownloadPlaceholderPolicyEnable Create a placeholder file.
 * 
 * API-Since: 18.2
 */
@Generated
public final class WKDownloadPlaceholderPolicy {
    @Generated
    private WKDownloadPlaceholderPolicy() {
    }

    /**
     * API-Since: 18.2
     */
    @Generated @NInt public static final long Disable = 0x0000000000000000L;
    /**
     * API-Since: 18.2
     */
    @Generated @NInt public static final long Enable = 0x0000000000000001L;
}