package apple.metal.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * A bitfield of commands that may be performed indirectly.
 * 
 * API-Since: 12.0
 */
@Generated
public final class MTLIndirectCommandType {
    @Generated
    private MTLIndirectCommandType() {
    }

    /**
     * API-Since: 12.0
     */
    @Generated @NUInt public static final long Draw = 0x0000000000000001L;
    /**
     * API-Since: 12.0
     */
    @Generated @NUInt public static final long DrawIndexed = 0x0000000000000002L;
    @Generated @NUInt public static final long DrawPatches = 0x0000000000000004L;
    @Generated @NUInt public static final long DrawIndexedPatches = 0x0000000000000008L;
    /**
     * Dispatch threadgroups with concurrent execution
     * 
     * API-Since: 13.0
     */
    @Generated @NUInt public static final long ConcurrentDispatch = 0x0000000000000020L;
    /**
     * Dispatch threads with concurrent execution
     * 
     * API-Since: 13.0
     */
    @Generated @NUInt public static final long ConcurrentDispatchThreads = 0x0000000000000040L;
    /**
     * API-Since: 17.0
     */
    @Generated @NUInt public static final long DrawMeshThreadgroups = 0x0000000000000080L;
    /**
     * API-Since: 17.0
     */
    @Generated @NUInt public static final long DrawMeshThreads = 0x0000000000000100L;
}