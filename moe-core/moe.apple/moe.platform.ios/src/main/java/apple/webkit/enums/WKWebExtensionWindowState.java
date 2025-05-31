package apple.webkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Constants used by ``WKWebExtensionWindow`` to indicate possible states of a window.
 * [@constant] WKWebExtensionWindowStateNormal Indicates a window is in its normal state.
 * [@constant] WKWebExtensionWindowStateMinimized Indicates a window is minimized.
 * [@constant] WKWebExtensionWindowStateMaximized Indicates a window is maximized.
 * [@constant] WKWebExtensionWindowStateFullscreen Indicates a window is in fullscreen mode.
 * 
 * API-Since: 18.4
 */
@Generated
public final class WKWebExtensionWindowState {
    @Generated
    private WKWebExtensionWindowState() {
    }

    /**
     * API-Since: 18.4
     */
    @Generated @NInt public static final long Normal = 0x0000000000000000L;
    /**
     * API-Since: 18.4
     */
    @Generated @NInt public static final long Minimized = 0x0000000000000001L;
    /**
     * API-Since: 18.4
     */
    @Generated @NInt public static final long Maximized = 0x0000000000000002L;
    /**
     * API-Since: 18.4
     */
    @Generated @NInt public static final long Fullscreen = 0x0000000000000003L;
}