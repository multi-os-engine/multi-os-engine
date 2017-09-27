package apple.coreml.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class MLFeatureType {
    @Generated
    private MLFeatureType() {
    }

    @Generated @NInt public static final long Invalid = 0x0000000000000000L;
    @Generated @NInt public static final long Int64 = 0x0000000000000001L;
    @Generated @NInt public static final long Double = 0x0000000000000002L;
    @Generated @NInt public static final long String = 0x0000000000000003L;
    @Generated @NInt public static final long Image = 0x0000000000000004L;
    @Generated @NInt public static final long MultiArray = 0x0000000000000005L;
    @Generated @NInt public static final long Dictionary = 0x0000000000000006L;
}