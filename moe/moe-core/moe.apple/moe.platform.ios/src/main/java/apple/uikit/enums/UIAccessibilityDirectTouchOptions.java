package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * API-Since: 17.0
 */
@Generated
public final class UIAccessibilityDirectTouchOptions {
    @Generated
    private UIAccessibilityDirectTouchOptions() {
    }

    /**
     * API-Since: 17.0
     */
    @Generated @NUInt public static final long None = 0x0000000000000000L;
    /**
     * Allows a direct touch area to immediately receive touch events without VoiceOver speaking. Appropriate
     * for apps that provide direct audio feedback during interaction that would conflict with VoiceOver (like a drum
     * pad in a music creation app).
     * 
     * API-Since: 17.0
     */
    @Generated @NUInt public static final long SilentOnTouch = 0x0000000000000001L;
    /**
     * Requires VoiceOver to activate the element before touch passthrough starts.
     * 
     * API-Since: 17.0
     */
    @Generated @NUInt public static final long RequiresActivation = 0x0000000000000002L;
}