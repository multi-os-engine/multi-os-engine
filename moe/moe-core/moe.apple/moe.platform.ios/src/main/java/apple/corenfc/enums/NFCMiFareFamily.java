package apple.corenfc.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * [@enum] NFCMiFareFamily
 * <p>
 * [@constant] NFCMiFareUnknown       MiFare compatible ISO14443 Type A tag.
 * [@constant] NFCMiFareUltralight    MiFare Ultralight series.
 * [@constant] NFCMiFarePlus          MiFare Plus series.
 * [@constant] NFCMiFareDESFire       MiFare DESFire series.
 */
@Generated
public final class NFCMiFareFamily {
    @Generated
    private NFCMiFareFamily() {
    }

    @Generated @NUInt public static final long Unknown = 0x0000000000000001L;
    @Generated @NUInt public static final long Ultralight = 0x0000000000000002L;
    @Generated @NUInt public static final long Plus = 0x0000000000000003L;
    @Generated @NUInt public static final long DESFire = 0x0000000000000004L;
}
