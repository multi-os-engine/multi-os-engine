package apple.corenfc.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] NFCVASMode
 * 
 * [@constant] NFCVASModeURLOnly     Reserved.
 * [@constant] NFCVASModeNormal      Full VAS protocol.
 */
@Generated
public final class NFCVASMode {
    @Generated
    private NFCVASMode() {
    }

    @Generated @NInt public static final long NFCVASModeURLOnly = 0x0000000000000000L;
    @Generated @NInt public static final long NFCVASModeNormal = 0x0000000000000001L;
    @Generated @NInt public static final long VASModeURLOnly = 0x0000000000000000L;
    @Generated @NInt public static final long VASModeNormal = 0x0000000000000001L;
}