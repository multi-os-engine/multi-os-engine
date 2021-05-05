package apple.coreml.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class MLComputeUnits {
    @Generated
    private MLComputeUnits() {
    }

    @Generated @NInt public static final long CPUOnly = 0x0000000000000000L;
    @Generated @NInt public static final long CPUAndGPU = 0x0000000000000001L;
    @Generated @NInt public static final long All = 0x0000000000000002L;
}