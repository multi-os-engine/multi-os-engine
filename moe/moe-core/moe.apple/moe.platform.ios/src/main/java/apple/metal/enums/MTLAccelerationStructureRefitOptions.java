package apple.metal.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * [@enum] MTLAccelerationStructureRefitOptions
 * 
 * Controls the acceleration structure refit operation
 * 
 * API-Since: 16.0
 */
@Generated
public final class MTLAccelerationStructureRefitOptions {
    @Generated
    private MTLAccelerationStructureRefitOptions() {
    }

    /**
     * Refitting shall result in updated vertex data from the provided geometry descriptor.
     * If not set, vertex buffers shall be ignored on the geometry descriptor and vertex data previously
     * encoded shall be copied.
     * 
     * API-Since: 16.0
     */
    @Generated @NUInt public static final long VertexData = 0x0000000000000001L;
    /**
     * Refitting shall result in updated per primitive data from the provided geometry descriptor.
     * If not set, per primitive data buffers shall be ignored on the geometry descriptor and per primitive
     * data previously encoded shall be copied.
     * 
     * API-Since: 16.0
     */
    @Generated @NUInt public static final long PerPrimitiveData = 0x0000000000000002L;
}