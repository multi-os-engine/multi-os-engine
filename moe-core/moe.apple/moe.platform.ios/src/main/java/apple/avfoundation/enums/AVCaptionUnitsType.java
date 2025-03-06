package apple.avfoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] AVCaptionUnitsType
 * 
 * Geometry unit.
 * 
 * Some geometric objects are positioned or sized with different kinds of dimensions differeing in unit. In some cases,
 * an object might allow multiple kinds of dimensions varrying by units. AVCaptionUnitsType is an enumeration of kinds
 * of units that are used across caption formats.
 * [@constant] AVCaptionUnitsTypeUnspecified
 * The units has not been specified. The dimension can be seen as invalid.
 * [@constant] AVCaptionUnitsTypeCells
 * The integer value is a number of cells.
 * [@constant] AVCaptionUnitsTypePercent
 * The floating-point value number value is [0 .. 100] correspondng to 0% to 100%, typically relative to the enclosing
 * rectangle.
 */
@Generated
public final class AVCaptionUnitsType {
    @Generated
    private AVCaptionUnitsType() {
    }

    @Generated @NInt public static final long Unspecified = 0x0000000000000000L;
    @Generated @NInt public static final long Cells = 0x0000000000000001L;
    @Generated @NInt public static final long Percent = 0x0000000000000002L;
}