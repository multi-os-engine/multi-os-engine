package apple.corenfc.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * [@enum] NFCNDEFStatus
 * 
 * [@constant] NFCNDEFStatusNotSupport    Tag is not NDEF formatted; NDEF read and write are disallowed.
 * [@constant] NFCNDEFStatusReadWrite     Tag is NDEF read and writable.
 * [@constant] NFCNDEFStatusReadOnly      Tag is NDEF read-only; NDEF writing is disallowed.
 */
@Generated
public final class NFCNDEFStatus {
    @Generated
    private NFCNDEFStatus() {
    }

    @Generated @NUInt public static final long NotSupported = 0x0000000000000001L;
    @Generated @NUInt public static final long ReadWrite = 0x0000000000000002L;
    @Generated @NUInt public static final long ReadOnly = 0x0000000000000003L;
}