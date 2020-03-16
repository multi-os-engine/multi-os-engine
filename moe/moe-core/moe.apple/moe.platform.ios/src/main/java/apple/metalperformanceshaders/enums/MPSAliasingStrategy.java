package apple.metalperformanceshaders.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class MPSAliasingStrategy {
    @Generated
    private MPSAliasingStrategy() {
    }

    @Generated @NUInt public static final long Default = 0x0000000000000000L;
    @Generated @NUInt public static final long DontCare = 0x0000000000000000L;
    @Generated @NUInt public static final long ShallAlias = 0x0000000000000001L;
    @Generated @NUInt public static final long ShallNotAlias = 0x0000000000000002L;
    @Generated @NUInt public static final long AliasingReserved = 0x0000000000000003L;
    @Generated @NUInt public static final long PreferTemporaryMemory = 0x0000000000000004L;
    @Generated @NUInt public static final long PreferNonTemporaryMemory = 0x0000000000000008L;
}