package apple.webkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * Constants used by ``WKWebExtensionController @/link and @link WKWebExtensionContext`` to indicate tab changes.
 * [@constant] WKWebExtensionTabChangedPropertiesNone Indicates nothing changed.
 * [@constant] WKWebExtensionTabChangedPropertiesLoading Indicates the loading state changed.
 * [@constant] WKWebExtensionTabChangedPropertiesMuted Indicates the muted state changed.
 * [@constant] WKWebExtensionTabChangedPropertiesPinned Indicates the pinned state changed.
 * [@constant] WKWebExtensionTabChangedPropertiesPlayingAudio Indicates the audio playback state changed.
 * [@constant] WKWebExtensionTabChangedPropertiesReaderMode Indicates the reader mode state changed.
 * [@constant] WKWebExtensionTabChangedPropertiesSize Indicates the size changed.
 * [@constant] WKWebExtensionTabChangedPropertiesTitle Indicates the title changed.
 * [@constant] WKWebExtensionTabChangedPropertiesURL Indicates the URL changed.
 * [@constant] WKWebExtensionTabChangedPropertiesZoomFactor Indicates the zoom factor changed.
 * 
 * API-Since: 18.4
 */
@Generated
public final class WKWebExtensionTabChangedProperties {
    @Generated
    private WKWebExtensionTabChangedProperties() {
    }

    /**
     * API-Since: 18.4
     */
    @Generated @NUInt public static final long None = 0x0000000000000000L;
    /**
     * API-Since: 18.4
     */
    @Generated @NUInt public static final long Loading = 0x0000000000000002L;
    /**
     * API-Since: 18.4
     */
    @Generated @NUInt public static final long Muted = 0x0000000000000004L;
    /**
     * API-Since: 18.4
     */
    @Generated @NUInt public static final long Pinned = 0x0000000000000008L;
    /**
     * API-Since: 18.4
     */
    @Generated @NUInt public static final long PlayingAudio = 0x0000000000000010L;
    /**
     * API-Since: 18.4
     */
    @Generated @NUInt public static final long ReaderMode = 0x0000000000000020L;
    /**
     * API-Since: 18.4
     */
    @Generated @NUInt public static final long Size = 0x0000000000000040L;
    /**
     * API-Since: 18.4
     */
    @Generated @NUInt public static final long Title = 0x0000000000000080L;
    /**
     * API-Since: 18.4
     */
    @Generated @NUInt public static final long URL = 0x0000000000000100L;
    /**
     * API-Since: 18.4
     */
    @Generated @NUInt public static final long ZoomFactor = 0x0000000000000200L;
}