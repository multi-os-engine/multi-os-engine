package apple.usernotifications.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 11.0
 */
@Generated
public final class UNShowPreviewsSetting {
    @Generated
    private UNShowPreviewsSetting() {
    }

    /**
     * Notification previews are always shown.
     * 
     * API-Since: 11.0
     */
    @Generated @NInt public static final long Always = 0x0000000000000000L;
    /**
     * Notifications previews are only shown when authenticated.
     * 
     * API-Since: 11.0
     */
    @Generated @NInt public static final long WhenAuthenticated = 0x0000000000000001L;
    /**
     * Notifications previews are never shown.
     * 
     * API-Since: 11.0
     */
    @Generated @NInt public static final long Never = 0x0000000000000002L;
}