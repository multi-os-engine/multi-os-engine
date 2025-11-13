package apple.coreimage.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Constants indicating the Data Matrix code ECC version.
 * 
 * ECC 000 - 140 symbols offer five levels of error correction using convolutional code error correction.
 * Each successive level or error correction offers more protection for the message data but increases the
 * size of the symbol required to carry a given message. See the ISO/IEC 16022:2006 spec for other modes.
 * 
 * ECC 200 symbols utilize Reed-Solomon error correction.
 * The error correction capacity for any given Data Matrix symbol is fixed by the size (in rows and columns)
 * of the symbol. See Table 7 of ISO/IEC 16022:2006(E) for more details.
 */
@Generated
public final class CIDataMatrixCodeECCVersion {
    @Generated
    private CIDataMatrixCodeECCVersion() {
    }

    /**
     * Indicates error correction using convolutional code error correction with no data protection.
     */
    @Generated @NInt public static final long Version000 = 0x0000000000000000L;
    /**
     * Indicates 1/4 of the symbol is dedicated to convolutional code error correction.
     */
    @Generated @NInt public static final long Version050 = 0x0000000000000032L;
    /**
     * Indicates 1/3 of the symbol is dedicated to convolutional code error correction.
     */
    @Generated @NInt public static final long Version080 = 0x0000000000000050L;
    /**
     * Indicates 1/2 of the symbol is dedicated to convolutional code error correction.
     */
    @Generated @NInt public static final long Version100 = 0x0000000000000064L;
    /**
     * Indicates 3/4 of the symbol is dedicated to convolutional code error correction.
     */
    @Generated @NInt public static final long Version140 = 0x000000000000008CL;
    /**
     * Indicates error correction using Reed-Solomon error correction. Data protection overhead varies based on symbol
     * size.
     */
    @Generated @NInt public static final long Version200 = 0x00000000000000C8L;
}
