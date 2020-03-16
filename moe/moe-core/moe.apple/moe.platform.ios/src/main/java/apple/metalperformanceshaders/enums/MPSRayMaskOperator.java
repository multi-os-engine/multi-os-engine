package apple.metalperformanceshaders.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class MPSRayMaskOperator {
    @Generated
    private MPSRayMaskOperator() {
    }

    @Generated @NUInt public static final long And = 0x0000000000000000L;
    @Generated @NUInt public static final long NotAnd = 0x0000000000000001L;
    @Generated @NUInt public static final long Or = 0x0000000000000002L;
    @Generated @NUInt public static final long NotOr = 0x0000000000000003L;
    @Generated @NUInt public static final long Xor = 0x0000000000000004L;
    @Generated @NUInt public static final long NotXor = 0x0000000000000005L;
    @Generated @NUInt public static final long LessThan = 0x0000000000000006L;
    @Generated @NUInt public static final long LessThanOrEqualTo = 0x0000000000000007L;
    @Generated @NUInt public static final long GreaterThan = 0x0000000000000008L;
    @Generated @NUInt public static final long GreaterThanOrEqualTo = 0x0000000000000009L;
}