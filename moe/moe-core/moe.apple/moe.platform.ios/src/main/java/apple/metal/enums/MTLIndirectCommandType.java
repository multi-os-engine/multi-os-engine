package apple.metal.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * A bitfield of commands that may be performed indirectly.
 */
@Generated
public final class MTLIndirectCommandType {
    @Generated
    private MTLIndirectCommandType() {
    }

    @Generated @NUInt public static final long Draw = 0x0000000000000001L;
    @Generated @NUInt public static final long DrawIndexed = 0x0000000000000002L;
    @Generated @NUInt public static final long DrawPatches = 0x0000000000000004L;
    @Generated @NUInt public static final long DrawIndexedPatches = 0x0000000000000008L;
    /**
     * Dispatch threadgroups with concurrent execution
     */
    @Generated @NUInt public static final long ConcurrentDispatch = 0x0000000000000020L;
    /**
     * Dispatch threads with concurrent execution
     */
    @Generated @NUInt public static final long ConcurrentDispatchThreads = 0x0000000000000040L;
}