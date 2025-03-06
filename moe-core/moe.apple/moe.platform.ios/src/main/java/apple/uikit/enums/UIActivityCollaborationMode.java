package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Represents the types of sharing (collaborating on an item vs. sending a copy of the item)
 * Share Sheet supports up to two modes, each of which corresponds to one of these types
 * 
 * API-Since: 18.0
 */
@Generated
public final class UIActivityCollaborationMode {
    @Generated
    private UIActivityCollaborationMode() {
    }

    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long SendCopy = 0x0000000000000000L;
    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Collaborate = 0x0000000000000001L;
}