package apple.arkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * A value describing the classification of a mesh face.
 */
@Generated
public final class ARMeshClassification {
    @Generated
    private ARMeshClassification() {
    }

    @Generated @NInt public static final long None = 0x0000000000000000L;
    @Generated @NInt public static final long Wall = 0x0000000000000001L;
    @Generated @NInt public static final long Floor = 0x0000000000000002L;
    @Generated @NInt public static final long Ceiling = 0x0000000000000003L;
    @Generated @NInt public static final long Table = 0x0000000000000004L;
    @Generated @NInt public static final long Seat = 0x0000000000000005L;
    @Generated @NInt public static final long Window = 0x0000000000000006L;
    @Generated @NInt public static final long Door = 0x0000000000000007L;
}