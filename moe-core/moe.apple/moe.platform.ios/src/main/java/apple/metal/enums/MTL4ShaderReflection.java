package apple.metal.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * Option mask for requesting reflection information at pipeline build time.
 * 
 * API-Since: 26.0
 */
@Generated
public final class MTL4ShaderReflection {
    @Generated
    private MTL4ShaderReflection() {
    }

    /**
     * Requests no information.
     * 
     * API-Since: 26.0
     */
    @Generated @NUInt public static final long None = 0x0000000000000000L;
    /**
     * Requests reflection information for bindings.
     * 
     * API-Since: 26.0
     */
    @Generated @NUInt public static final long BindingInfo = 0x0000000000000001L;
    /**
     * Requests reflection information for buffer types.
     * 
     * API-Since: 26.0
     */
    @Generated @NUInt public static final long BufferTypeInfo = 0x0000000000000002L;
}