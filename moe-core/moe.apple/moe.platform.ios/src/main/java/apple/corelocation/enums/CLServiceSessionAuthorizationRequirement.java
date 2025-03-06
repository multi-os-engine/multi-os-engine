package apple.corelocation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class CLServiceSessionAuthorizationRequirement {
    @Generated
    private CLServiceSessionAuthorizationRequirement() {
    }

    @Generated @NInt public static final long None = 0x0000000000000000L;
    @Generated @NInt public static final long WhenInUse = 0x0000000000000001L;
    @Generated @NInt public static final long Always = 0x0000000000000002L;
}