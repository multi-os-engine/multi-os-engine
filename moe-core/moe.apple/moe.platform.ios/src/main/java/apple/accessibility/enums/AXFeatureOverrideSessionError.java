package apple.accessibility.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class AXFeatureOverrideSessionError {
    @Generated
    private AXFeatureOverrideSessionError() {
    }

    @Generated @NInt public static final long Undefined = 0x0000000000000000L;
    @Generated @NInt public static final long AppNotEntitled = 0x0000000000000001L;
    @Generated @NInt public static final long OverrideIsAlreadyActive = 0x0000000000000002L;
    @Generated @NInt public static final long OverrideNotFoundForUUID = 0x0000000000000003L;
}