package apple.metalperformanceshaders.enums;

import org.moe.natj.general.ann.Generated;

@Generated
public final class MPSFloatDataTypeBit {
    @Generated
    private MPSFloatDataTypeBit() {
    }

    /**
     * 1 bit of sign
     */
    @Generated public static final int SignBit = 0x00800000;
    /**
     * 5 bits of exponent
     */
    @Generated public static final int ExponentBit = 0x007C0000;
    /**
     * 8 bits of mantissa
     */
    @Generated public static final int MantissaBit = 0x0003FC00;
}