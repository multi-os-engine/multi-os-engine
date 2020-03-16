package apple.arkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class ARWorldMappingStatus {
    @Generated
    private ARWorldMappingStatus() {
    }

    @Generated @NInt public static final long NotAvailable = 0x0000000000000000L;
    @Generated @NInt public static final long Limited = 0x0000000000000001L;
    @Generated @NInt public static final long Extending = 0x0000000000000002L;
    @Generated @NInt public static final long Mapped = 0x0000000000000003L;
}