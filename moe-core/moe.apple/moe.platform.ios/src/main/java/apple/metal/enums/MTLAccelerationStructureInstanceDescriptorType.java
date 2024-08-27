package apple.metal.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * API-Since: 15.0
 */
@Generated
public final class MTLAccelerationStructureInstanceDescriptorType {
    @Generated
    private MTLAccelerationStructureInstanceDescriptorType() {
    }

    /**
     * Default instance descriptor: MTLAccelerationStructureInstanceDescriptor
     * 
     * API-Since: 15.0
     */
    @Generated @NUInt public static final long Default = 0x0000000000000000L;
    /**
     * Instance descriptor with an added user-ID
     * 
     * API-Since: 15.0
     */
    @Generated @NUInt public static final long UserID = 0x0000000000000001L;
    /**
     * Instance descriptor with support for motion
     * 
     * API-Since: 15.0
     */
    @Generated @NUInt public static final long Motion = 0x0000000000000002L;
    /**
     * Instance descriptor with a resource handle for the instanced acceleration structure
     * 
     * API-Since: 17.0
     */
    @Generated @NUInt public static final long Indirect = 0x0000000000000003L;
    /**
     * Motion instance descriptor with a resource handle for the instanced acceleration structure.
     * 
     * API-Since: 17.0
     */
    @Generated @NUInt public static final long IndirectMotion = 0x0000000000000004L;
}
