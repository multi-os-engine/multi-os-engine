package apple.webkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Constants used by ``NSError`` to indicate errors in the ``WKWebExtensionMessagePort`` domain.
 * [@constant] WKWebExtensionMessagePortErrorUnknown Indicates that an unknown error occurred.
 * [@constant] WKWebExtensionMessagePortErrorNotConnected Indicates that the message port is disconnected.
 * [@constant] WKWebExtensionMessagePortErrorMessageInvalid Indicates that the message is invalid. The message must be
 * an object that is JSON-serializable.
 * 
 * API-Since: 18.4
 */
@Generated
public final class WKWebExtensionMessagePortError {
    @Generated
    private WKWebExtensionMessagePortError() {
    }

    /**
     * API-Since: 18.4
     */
    @Generated @NInt public static final long Unknown = 0x0000000000000001L;
    /**
     * API-Since: 18.4
     */
    @Generated @NInt public static final long NotConnected = 0x0000000000000002L;
    /**
     * API-Since: 18.4
     */
    @Generated @NInt public static final long MessageInvalid = 0x0000000000000003L;
}