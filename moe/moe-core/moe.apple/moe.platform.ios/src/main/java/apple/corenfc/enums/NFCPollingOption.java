package apple.corenfc.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] NFCPollingOption
 * 
 * [@constant] NFCPollingISO14443 Support both Type A & B modulation. NFCTagTypeISO7816Compatible and NFCTagTypeMiFare
 * tags will be discovered.
 * [@constant] NFCPollingISO15693 NFCTagTypeISO15693 tag will be discovered.
 * [@constant] NFCPollingISO18092 NFCTagTypeFeliCa tag will be discovered.
 * [@constant] NFCPollingPACE NFCTagTypeISO7816Compatible will be discovered; only tags with Password Authenticated
 * Connection Establishment (PACE) supported is returned.
 * This is an exclusive value that cannot be combine with other NFCPollingOption values; this will override all other
 * combinations.
 */
@Generated
public final class NFCPollingOption {
    @Generated
    private NFCPollingOption() {
    }

    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long ISO14443 = 0x0000000000000001L;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long ISO15693 = 0x0000000000000002L;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long ISO18092 = 0x0000000000000004L;
    /**
     * API-Since: 16.0
     */
    @Generated @NInt public static final long PACE = 0x0000000000000008L;
}
