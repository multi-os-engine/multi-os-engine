package apple.coregraphics.enums;

import org.moe.natj.general.ann.Generated;

@Generated
public final class CGBitmapLayout {
    @Generated
    private CGBitmapLayout() {
    }

    @Generated public static final int AlphaOnly = 0x00000000;
    @Generated public static final int Gray = 0x00000001;
    @Generated public static final int GrayAlpha = 0x00000002;
    @Generated public static final int RGBA = 0x00000003;
    @Generated public static final int ARGB = 0x00000004;
    /**
     * alpha skipped
     */
    @Generated public static final int RGBX = 0x00000005;
    /**
     * alpha skipped; 16-bit float excluded
     */
    @Generated public static final int XRGB = 0x00000006;
    /**
     * 8-bit only
     */
    @Generated public static final int BGRA = 0x00000007;
    /**
     * alpha skipped; 8-bit only
     */
    @Generated public static final int BGRX = 0x00000008;
    /**
     * 8-bit only
     */
    @Generated public static final int ABGR = 0x00000009;
    /**
     * alpha skipped; 8-bit only
     */
    @Generated public static final int XBGR = 0x0000000A;
    @Generated public static final int CMYK = 0x0000000B;
}