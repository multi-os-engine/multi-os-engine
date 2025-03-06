package apple.matter.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * API-Since: 17.6
 */
@Generated
public final class MTRStorageSecurityLevel {
    @Generated
    private MTRStorageSecurityLevel() {
    }

    /**
     * Data must be stored in secure (encrypted) storage.
     * 
     * API-Since: 17.6
     */
    @Generated @NUInt public static final long Secure = 0x0000000000000000L;
    /**
     * Data may be stored in the clear.
     * 
     * API-Since: 17.6
     */
    @Generated @NUInt public static final long NotSecure = 0x0000000000000001L;
}