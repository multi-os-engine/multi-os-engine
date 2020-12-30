package apple.metalperformanceshaders.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * @brief Instance transformation type options
 */
@Generated
public final class MPSTransformType {
    @Generated
    private MPSTransformType() {
    }

    /**
     * @brief Instance transformations are represented by a 4x4 column major matrix of 32 bit
     * floats
     */
    @Generated @NUInt public static final long Float4x4 = 0x0000000000000000L;
    /**
     * @brief All instances have the identity transformation (no transformation). This can be used
     * to compose multiple polygon acceleration structures in an instance acceleration structure
     * without the cost of transforming instances. For example, geometry can be divided into
     * static and dynamic polygon acceleration structures which can be rebuilt and refit
     * independently.
     */
    @Generated @NUInt public static final long Identity = 0x0000000000000001L;
}