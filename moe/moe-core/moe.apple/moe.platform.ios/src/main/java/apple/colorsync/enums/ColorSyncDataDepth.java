package apple.colorsync.enums;

import org.moe.natj.general.ann.Generated;

/**
 * transform - transform from which to get the profile sequnce used to create the transform
 */
@Generated
public final class ColorSyncDataDepth {
    @Generated
    private ColorSyncDataDepth() {
    }

    @Generated public static final int Sync1BitGamut = 0x00000001;
    @Generated public static final int Sync8BitInteger = 0x00000002;
    @Generated public static final int Sync16BitInteger = 0x00000003;
    @Generated public static final int Sync16BitFloat = 0x00000004;
    @Generated public static final int Sync32BitInteger = 0x00000005;
    @Generated public static final int Sync32BitNamedColorIndex = 0x00000006;
    @Generated public static final int Sync32BitFloat = 0x00000007;
    @Generated public static final int Sync10BitInteger = 0x00000008;
}