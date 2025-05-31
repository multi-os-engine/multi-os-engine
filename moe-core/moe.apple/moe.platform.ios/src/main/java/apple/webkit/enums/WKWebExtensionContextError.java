package apple.webkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Constants used by ``NSError`` to indicate errors in the ``WKWebExtensionContext`` domain.
 * [@constant] WKWebExtensionContextErrorUnknown Indicates that an unknown error occurred.
 * [@constant] WKWebExtensionContextErrorAlreadyLoaded Indicates that the context is already loaded by a
 * ``WKWebExtensionController``.
 * [@constant] WKWebExtensionContextErrorNotLoaded Indicates that the context is not loaded by a
 * ``WKWebExtensionController``.
 * [@constant] WKWebExtensionContextErrorBaseURLAlreadyInUse Indicates that another context is already using the
 * specified base URL.
 * [@constant] WKWebExtensionContextErrorNoBackgroundContent Indicates that the extension does not have background
 * content.
 * [@constant] WKWebExtensionContextErrorBackgroundContentFailedToLoad Indicates that an error occurred loading the
 * background content.
 * 
 * API-Since: 18.4
 */
@Generated
public final class WKWebExtensionContextError {
    @Generated
    private WKWebExtensionContextError() {
    }

    /**
     * API-Since: 18.4
     */
    @Generated @NInt public static final long Unknown = 0x0000000000000001L;
    /**
     * API-Since: 18.4
     */
    @Generated @NInt public static final long AlreadyLoaded = 0x0000000000000002L;
    /**
     * API-Since: 18.4
     */
    @Generated @NInt public static final long NotLoaded = 0x0000000000000003L;
    /**
     * API-Since: 18.4
     */
    @Generated @NInt public static final long BaseURLAlreadyInUse = 0x0000000000000004L;
    /**
     * API-Since: 18.4
     */
    @Generated @NInt public static final long NoBackgroundContent = 0x0000000000000005L;
    /**
     * API-Since: 18.4
     */
    @Generated @NInt public static final long BackgroundContentFailedToLoad = 0x0000000000000006L;
}