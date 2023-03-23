package apple.intents.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * The role of the relevant shortcut.
 * 
 * Provides a hint to Siri about the expected user experience.
 * 
 * API-Since: 12.0
 */
@Generated
public final class INRelevantShortcutRole {
    @Generated
    private INRelevantShortcutRole() {
    }

    /**
     * The relevant shortcut represents an action that the user may want to perform using your app.
     * 
     * API-Since: 12.0
     */
    @Generated @NInt public static final long Action = 0x0000000000000000L;
    /**
     * The relevant shortcut represents information that the user may want to glance at.
     * 
     * API-Since: 12.0
     */
    @Generated @NInt public static final long Information = 0x0000000000000001L;
}
