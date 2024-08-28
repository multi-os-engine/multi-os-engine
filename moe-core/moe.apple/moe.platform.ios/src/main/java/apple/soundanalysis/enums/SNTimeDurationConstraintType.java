package apple.soundanalysis.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Enumerates possible types for `SNTimeDurationConstraint`.
 * 
 * API-Since: 15.0
 */
@Generated
public final class SNTimeDurationConstraintType {
    @Generated
    private SNTimeDurationConstraintType() {
    }

    /**
     * An 'enumerated' constraint type.
     * 
     * In order for a duration to satisfy a constraint of this type, it must be a member of a particular set of discrete
     * permissible values.
     * 
     * API-Since: 15.0
     */
    @Generated @NInt public static final long Enumerated = 0x0000000000000001L;
    /**
     * A 'range' constraint type.
     * 
     * In order for a duration to satisfy a constraint of this type, it must be a member of a particular continuous
     * range of permissible values.
     * 
     * API-Since: 15.0
     */
    @Generated @NInt public static final long Range = 0x0000000000000002L;
}
