package apple.metal.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Represents the status of a compiler task.
 */
@Generated
public final class MTL4CompilerTaskStatus {
    @Generated
    private MTL4CompilerTaskStatus() {
    }

    /**
     * No status.
     */
    @Generated @NInt public static final long None = 0x0000000000000000L;
    /**
     * The compiler task is currently scheduled.
     */
    @Generated @NInt public static final long Scheduled = 0x0000000000000001L;
    /**
     * The compiler task is currently compiling.
     */
    @Generated @NInt public static final long Compiling = 0x0000000000000002L;
    /**
     * The compiler task is finished.
     */
    @Generated @NInt public static final long Finished = 0x0000000000000003L;
}