package apple.webkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Constants used by ``NSError`` to indicate errors in the ``WKWebExtensionDataRecord`` domain.
 * [@constant] WKWebExtensionDataRecordErrorUnknown Indicates that an unknown error occurred.
 * [@constant] WKWebExtensionDataRecordErrorLocalStorageFailed Indicates a failure occurred when either deleting or
 * calculating local storage.
 * [@constant] WKWebExtensionDataRecordErrorSessionStorageFailed Indicates a failure occurred when either deleting or
 * calculating session storage.
 * [@constant] WKWebExtensionDataRecordErrorSynchronizedStorageFailed Indicates a failure occurred when either deleting
 * or calculating synchronized storage.
 * 
 * API-Since: 18.4
 */
@Generated
public final class WKWebExtensionDataRecordError {
    @Generated
    private WKWebExtensionDataRecordError() {
    }

    /**
     * API-Since: 18.4
     */
    @Generated @NInt public static final long Unknown = 0x0000000000000001L;
    /**
     * API-Since: 18.4
     */
    @Generated @NInt public static final long LocalStorageFailed = 0x0000000000000002L;
    /**
     * API-Since: 18.4
     */
    @Generated @NInt public static final long SessionStorageFailed = 0x0000000000000003L;
    /**
     * API-Since: 18.4
     */
    @Generated @NInt public static final long SynchronizedStorageFailed = 0x0000000000000004L;
}