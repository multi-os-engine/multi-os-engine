package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * -- symbol image weights
 * only regular is supported by now, but you can specify any weight
 * you need for future implementation.
 */
@Generated
public final class UIImageSymbolWeight {
    @Generated
    private UIImageSymbolWeight() {
    }

    @Generated @NInt public static final long Unspecified = 0x0000000000000000L;
    @Generated @NInt public static final long UltraLight = 0x0000000000000001L;
    @Generated @NInt public static final long Thin = 0x0000000000000002L;
    @Generated @NInt public static final long Light = 0x0000000000000003L;
    @Generated @NInt public static final long Regular = 0x0000000000000004L;
    @Generated @NInt public static final long Medium = 0x0000000000000005L;
    @Generated @NInt public static final long Semibold = 0x0000000000000006L;
    @Generated @NInt public static final long Bold = 0x0000000000000007L;
    @Generated @NInt public static final long Heavy = 0x0000000000000008L;
    @Generated @NInt public static final long Black = 0x0000000000000009L;
}