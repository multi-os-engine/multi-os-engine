package apple.corenfc.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class NFCTagType {
    @Generated
    private NFCTagType() {
    }

    @Generated @NUInt public static final long ISO15693 = 0x0000000000000001L;
    @Generated @NUInt public static final long FeliCa = 0x0000000000000002L;
    @Generated @NUInt public static final long ISO7816Compatible = 0x0000000000000003L;
    @Generated @NUInt public static final long MiFare = 0x0000000000000004L;
}