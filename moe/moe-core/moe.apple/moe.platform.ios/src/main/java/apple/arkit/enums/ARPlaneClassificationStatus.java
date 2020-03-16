package apple.arkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class ARPlaneClassificationStatus {
    @Generated
    private ARPlaneClassificationStatus() {
    }

    @Generated @NInt public static final long NotAvailable = 0x0000000000000000L;
    @Generated @NInt public static final long Undetermined = 0x0000000000000001L;
    @Generated @NInt public static final long Unknown = 0x0000000000000002L;
    @Generated @NInt public static final long Known = 0x0000000000000003L;
}