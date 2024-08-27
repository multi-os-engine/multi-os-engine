package apple.colorsync.enums;

import org.moe.natj.general.ann.Generated;

@Generated
public final class ColorSyncAlphaInfo {
    @Generated
    private ColorSyncAlphaInfo() {
    }

    /**
     * For example, RGB.
     */
    @Generated public static final int None = 0x00000000;
    /**
     * For example, premultiplied RGBA
     */
    @Generated public static final int PremultipliedLast = 0x00000001;
    /**
     * For example, premultiplied ARGB
     */
    @Generated public static final int PremultipliedFirst = 0x00000002;
    /**
     * For example, non-premultiplied RGBA
     */
    @Generated public static final int Last = 0x00000003;
    /**
     * For example, non-premultiplied ARGB
     */
    @Generated public static final int First = 0x00000004;
    /**
     * For example, RBGX.
     */
    @Generated public static final int NoneSkipLast = 0x00000005;
    /**
     * For example, XRGB.
     */
    @Generated public static final int NoneSkipFirst = 0x00000006;
}