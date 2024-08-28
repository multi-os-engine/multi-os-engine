package apple.metal.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class MTLBindingAccess {
    @Generated
    private MTLBindingAccess() {
    }

    @Generated @NUInt public static final long BindingAccessReadOnly = 0x0000000000000000L;
    @Generated @NUInt public static final long BindingAccessReadWrite = 0x0000000000000001L;
    @Generated @NUInt public static final long BindingAccessWriteOnly = 0x0000000000000002L;
    /**
     * API-Since: 8.0
     * Deprecated-Since: 17.0
     */
    @Generated @Deprecated @NUInt public static final long ArgumentAccessReadOnly = 0x0000000000000000L;
    /**
     * API-Since: 8.0
     * Deprecated-Since: 17.0
     */
    @Generated @Deprecated @NUInt public static final long ArgumentAccessReadWrite = 0x0000000000000001L;
    /**
     * API-Since: 8.0
     * Deprecated-Since: 17.0
     */
    @Generated @Deprecated @NUInt public static final long ArgumentAccessWriteOnly = 0x0000000000000002L;
}