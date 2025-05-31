package apple.webkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Constants used by ``WKWebExtensionWindow`` to indicate the type of a window.
 * [@constant] WKWebExtensionWindowTypeNormal Indicates a normal window.
 * [@constant] WKWebExtensionWindowTypePopup Indicates a popup window.
 * 
 * API-Since: 18.4
 */
@Generated
public final class WKWebExtensionWindowType {
    @Generated
    private WKWebExtensionWindowType() {
    }

    /**
     * API-Since: 18.4
     */
    @Generated @NInt public static final long Normal = 0x0000000000000000L;
    /**
     * API-Since: 18.4
     */
    @Generated @NInt public static final long Popup = 0x0000000000000001L;
}