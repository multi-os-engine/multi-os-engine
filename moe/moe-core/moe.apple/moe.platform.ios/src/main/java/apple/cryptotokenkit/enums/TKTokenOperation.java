package apple.cryptotokenkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class TKTokenOperation {
    @Generated
    private TKTokenOperation() {
    }

    @Generated @NInt public static final long None = 0x0000000000000000L;
    @Generated @NInt public static final long ReadData = 0x0000000000000001L;
    @Generated @NInt public static final long SignData = 0x0000000000000002L;
    @Generated @NInt public static final long DecryptData = 0x0000000000000003L;
    @Generated @NInt public static final long PerformKeyExchange = 0x0000000000000004L;
}