package apple.scenekit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * @enum SCNColorComponent
 * @abstract Color components
 */
@Generated
public final class SCNColorMask {
    @Generated
    private SCNColorMask() {
    }

    @Generated @NInt public static final long None = 0x0000000000000000L;
    @Generated @NInt public static final long Red = 0x0000000000000008L;
    @Generated @NInt public static final long Green = 0x0000000000000004L;
    @Generated @NInt public static final long Blue = 0x0000000000000002L;
    @Generated @NInt public static final long Alpha = 0x0000000000000001L;
    @Generated @NInt public static final long All = 0x000000000000000FL;
}