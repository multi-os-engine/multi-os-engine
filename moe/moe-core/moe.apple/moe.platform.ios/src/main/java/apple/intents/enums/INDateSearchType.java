package apple.intents.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class INDateSearchType {
    @Generated
    private INDateSearchType() {
    }

    @Generated @NInt public static final long Unknown = 0x0000000000000000L;
    @Generated @NInt public static final long ByDueDate = 0x0000000000000001L;
    @Generated @NInt public static final long ByModifiedDate = 0x0000000000000002L;
    @Generated @NInt public static final long ByCreatedDate = 0x0000000000000003L;
}