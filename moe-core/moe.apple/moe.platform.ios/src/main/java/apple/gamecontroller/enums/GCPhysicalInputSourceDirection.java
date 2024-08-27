package apple.gamecontroller.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * One or more directions associated with a \c GCPhysicalInputSource.
 */
@Generated
public final class GCPhysicalInputSourceDirection {
    @Generated
    private GCPhysicalInputSourceDirection() {
    }

    @Generated @NUInt public static final long NotApplicable = 0x0000000000000000L;
    @Generated @NUInt public static final long Up = 0x0000000000000001L;
    @Generated @NUInt public static final long Right = 0x0000000000000002L;
    @Generated @NUInt public static final long Down = 0x0000000000000004L;
    @Generated @NUInt public static final long Left = 0x0000000000000008L;
}