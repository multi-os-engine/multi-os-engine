package apple.coreimage.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] CIQRCodeErrorCorrectionLevel
 * 
 *    Constants indicating the percentage of the symbol that is dedicated to error correction.
 * 
 * [@constant] CIQRCodeErrorCorrectionLevelL
 *    Indicates that approximately 20% of the symbol data is dedicated to error correction.
 * [@constant] CIQRCodeErrorCorrectionLevelM
 *    Indicates that approximately 37% of the symbol data is dedicated to error correction.
 * [@constant] CIQRCodeErrorCorrectionLevelQ
 *    Indicates that approximately 55% of the symbol data is dedicated to error correction.
 * [@constant] CIQRCodeErrorCorrectionLevelH
 *    Indicates that approximately 65% of the symbol data is dedicated to error correction.
 */
@Generated
public final class CIQRCodeErrorCorrectionLevel {
    @Generated
    private CIQRCodeErrorCorrectionLevel() {
    }

    @Generated @NInt public static final long L = 0x000000000000004CL;
    @Generated @NInt public static final long M = 0x000000000000004DL;
    @Generated @NInt public static final long Q = 0x0000000000000051L;
    @Generated @NInt public static final long H = 0x0000000000000048L;
}