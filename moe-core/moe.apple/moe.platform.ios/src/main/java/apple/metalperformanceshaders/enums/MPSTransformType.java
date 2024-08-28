package apple.metalperformanceshaders.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * Instance transformation type options
 * 
 * API-Since: 12.0
 */
@Generated
public final class MPSTransformType {
    @Generated
    private MPSTransformType() {
    }

    /**
     * Instance transformations are represented by a 4x4 column major matrix of 32 bit
     * floats
     * 
     * API-Since: 12.0
     */
    @Generated @NUInt public static final long Float4x4 = 0x0000000000000000L;
    /**
     * All instances have the identity transformation (no transformation). This can be used
     * to compose multiple polygon acceleration structures in an instance acceleration structure
     * without the cost of transforming instances. For example, geometry can be divided into
     * static and dynamic polygon acceleration structures which can be rebuilt and refit
     * independently.
     * 
     * API-Since: 12.0
     */
    @Generated @NUInt public static final long Identity = 0x0000000000000001L;
}