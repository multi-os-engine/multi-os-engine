package apple.corenfc.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] NFCVASMode
 * 
 * [@constant] NFCVASModeURLOnly Reserved.
 * [@constant] NFCVASModeNormal Full VAS protocol.
 * 
 * API-Since: 13.0
 */
@Generated
public final class NFCVASMode {
    @Generated
    private NFCVASMode() {
    }

    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long NFCVASModeURLOnly = 0x0000000000000000L;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long NFCVASModeNormal = 0x0000000000000001L;
    /**
     * API-Since: 13.0
     * Deprecated-Since: 14.0
     */
    @Deprecated @Generated @NInt public static final long VASModeURLOnly = 0x0000000000000000L;
    /**
     * API-Since: 13.0
     * Deprecated-Since: 14.0
     */
    @Deprecated @Generated @NInt public static final long VASModeNormal = 0x0000000000000001L;
}
