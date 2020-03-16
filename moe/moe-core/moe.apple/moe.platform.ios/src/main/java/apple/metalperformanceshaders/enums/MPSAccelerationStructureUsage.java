package apple.metalperformanceshaders.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class MPSAccelerationStructureUsage {
    @Generated
    private MPSAccelerationStructureUsage() {
    }

    @Generated @NUInt public static final long None = 0x0000000000000000L;
    @Generated @NUInt public static final long Refit = 0x0000000000000001L;
    @Generated @NUInt public static final long FrequentRebuild = 0x0000000000000002L;
    @Generated @NUInt public static final long PreferGPUBuild = 0x0000000000000004L;
    @Generated @NUInt public static final long PreferCPUBuild = 0x0000000000000008L;
}