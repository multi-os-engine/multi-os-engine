package apple.coreaudiotypes.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@enum] AudioChannelBitmap
 * 
 * These constants are for use in the mChannelBitmap field of an
 * AudioChannelLayout structure.
 */
@Generated
public final class AudioChannelBitmap {
    @Generated
    private AudioChannelBitmap() {
    }

    @Generated public static final int Left = 0x00000001;
    @Generated public static final int Right = 0x00000002;
    @Generated public static final int Center = 0x00000004;
    @Generated public static final int LFEScreen = 0x00000008;
    @Generated public static final int LeftSurround = 0x00000010;
    @Generated public static final int RightSurround = 0x00000020;
    @Generated public static final int LeftCenter = 0x00000040;
    @Generated public static final int RightCenter = 0x00000080;
    /**
     * WAVE: "Back Center"
     */
    @Generated public static final int CenterSurround = 0x00000100;
    @Generated public static final int LeftSurroundDirect = 0x00000200;
    @Generated public static final int RightSurroundDirect = 0x00000400;
    @Generated public static final int TopCenterSurround = 0x00000800;
    /**
     * WAVE: "Top Front Left"
     */
    @Generated public static final int VerticalHeightLeft = 0x00001000;
    /**
     * WAVE: "Top Front Center"
     */
    @Generated public static final int VerticalHeightCenter = 0x00002000;
    /**
     * WAVE: "Top Front Right"
     */
    @Generated public static final int VerticalHeightRight = 0x00004000;
    @Generated public static final int TopBackLeft = 0x00008000;
    @Generated public static final int TopBackCenter = 0x00010000;
    @Generated public static final int TopBackRight = 0x00020000;
    @Generated public static final int LeftTopFront = 0x00001000;
    @Generated public static final int CenterTopFront = 0x00002000;
    @Generated public static final int RightTopFront = 0x00004000;
    @Generated public static final int LeftTopMiddle = 0x00200000;
    @Generated public static final int CenterTopMiddle = 0x00000800;
    @Generated public static final int RightTopMiddle = 0x00800000;
    @Generated public static final int LeftTopRear = 0x01000000;
    @Generated public static final int CenterTopRear = 0x02000000;
    @Generated public static final int RightTopRear = 0x04000000;
}
