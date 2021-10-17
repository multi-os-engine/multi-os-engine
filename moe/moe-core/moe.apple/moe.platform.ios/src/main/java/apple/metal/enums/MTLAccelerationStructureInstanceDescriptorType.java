package apple.metal.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class MTLAccelerationStructureInstanceDescriptorType {
    @Generated
    private MTLAccelerationStructureInstanceDescriptorType() {
    }

    /**
     * Default instance descriptor: MTLAccelerationStructureInstanceDescriptor
     */
    @Generated @NUInt public static final long Default = 0x0000000000000000L;
    /**
     * Instance descriptor with an added user-ID
     */
    @Generated @NUInt public static final long UserID = 0x0000000000000001L;
    /**
     * Instance descriptor with support for motion
     */
    @Generated @NUInt public static final long Motion = 0x0000000000000002L;
}
