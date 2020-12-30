package apple.coreimage.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * @enum CIDataMatrixCodeECCVersion
 * @abstract
 *    Constants indicating the Data Matrix code ECC version.
 * 
 * @discussion
 *    ECC 000 - 140 symbols offer five levels of error correction using convolutional code error correction. Each successive level of error correction offers more protection for the message data and increases the size of the symbol required to carry a specific message. ECC 000 symbols offer no data protection. The other modes are described in ISO/IEC 16022:2006 and enumerated in this list only for completeness.
 * 
 *    ECC 200 symbols utilize Reed-Solomon error correction. The error correction capacity for any given Data Matrix symbol is fixed by the size (in rows and columns) of the symbol. See Table 7 of ISO/IEC 16022:2006(E) for more details.
 * 
 * @constant CIDataMatrixCodeECCVersion000
 *    Indicates error correction using convolutional code error correction with no data protection.
 * @constant CIDataMatrixCodeECCVersion050
 *    Indicates 1/4 of the symbol is dedicated to convolutional code error correction.
 * @constant CIDataMatrixCodeECCVersion080
 *    Indicates 1/3 of the symbol is dedicated to convolutional code error correction.
 * @constant CIDataMatrixCodeECCVersion100
 *    Indicates 1/2 of the symbol is dedicated to convolutional code error correction.
 * @constant CIDataMatrixCodeECCVersion140
 *    Indicates 3/4 of the symbol is dedicated to convolutional code error correction.
 * @constant CIDataMatrixCodeECCVersion200
 *    Indicates error correction using Reed-Solomon error correction. Data protection overhead varies based on symbol size.
 */
@Generated
public final class CIDataMatrixCodeECCVersion {
    @Generated
    private CIDataMatrixCodeECCVersion() {
    }

    @Generated @NInt public static final long Version000 = 0x0000000000000000L;
    @Generated @NInt public static final long Version050 = 0x0000000000000032L;
    @Generated @NInt public static final long Version080 = 0x0000000000000050L;
    @Generated @NInt public static final long Version100 = 0x0000000000000064L;
    @Generated @NInt public static final long Version140 = 0x000000000000008CL;
    @Generated @NInt public static final long Version200 = 0x00000000000000C8L;
}