package apple.corenfc.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class NFCPollingOption {
    @Generated
    private NFCPollingOption() {
    }

    @Generated @NInt public static final long ISO14443 = 0x0000000000000001L;
    @Generated @NInt public static final long ISO15693 = 0x0000000000000002L;
    @Generated @NInt public static final long ISO18092 = 0x0000000000000004L;
}