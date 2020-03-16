package apple.corenfc.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class NFCNDEFStatus {
    @Generated
    private NFCNDEFStatus() {
    }

    @Generated @NUInt public static final long NotSupported = 0x0000000000000001L;
    @Generated @NUInt public static final long ReadWrite = 0x0000000000000002L;
    @Generated @NUInt public static final long ReadOnly = 0x0000000000000003L;
}