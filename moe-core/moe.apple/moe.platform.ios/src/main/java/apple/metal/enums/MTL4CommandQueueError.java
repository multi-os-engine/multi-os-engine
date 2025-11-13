package apple.metal.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Enumeration of kinds of errors that committing an array of command buffers instances can produce.
 * 
 * API-Since: 26.0
 */
@Generated
public final class MTL4CommandQueueError {
    @Generated
    private MTL4CommandQueueError() {
    }

    /**
     * Indicates the absence of any problems.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long None = 0x0000000000000000L;
    /**
     * Indicates the workload takes longer to execute than the system allows.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Timeout = 0x0000000000000001L;
    /**
     * Indicates a process doesn’t have access to a GPU device.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long NotPermitted = 0x0000000000000002L;
    /**
     * Indicates the GPU doesn’t have sufficient memory to execute a command buffer.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long OutOfMemory = 0x0000000000000003L;
    /**
     * Indicates the physical removal of the GPU before the command buffer completed.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long DeviceRemoved = 0x0000000000000004L;
    /**
     * Indicates that the system revokes GPU access because it’s responsible for too many timeouts or hangs.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long AccessRevoked = 0x0000000000000005L;
    /**
     * Indicates an internal problem in the Metal framework.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Internal = 0x0000000000000006L;
}