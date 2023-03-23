package apple.foundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 11.0
 */
@Generated
public final class NSItemProviderRepresentationVisibility {
    @Generated
    private NSItemProviderRepresentationVisibility() {
    }

    /**
     * All processes can see this representation
     * 
     * API-Since: 11.0
     */
    @Generated @NInt public static final long All = 0x0000000000000000L;
    /**
     * Only processes from the same dev team can see this representation
     * 
     * API-Since: 11.0
     */
    @Generated @NInt public static final long Team = 0x0000000000000001L;
    /**
     * Ony the originator's process can see this representation
     * 
     * API-Since: 11.0
     */
    @Generated @NInt public static final long OwnProcess = 0x0000000000000003L;
}