package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * -- symbol images size
 */
@Generated
public final class UIImageSymbolScale {
    @Generated
    private UIImageSymbolScale() {
    }

    /**
     * use the system default size
     */
    @Generated @NInt public static final long Default = 0xFFFFFFFFFFFFFFFFL;
    /**
     * allow the system to pick a size based on the context
     */
    @Generated @NInt public static final long Unspecified = 0x0000000000000000L;
    @Generated @NInt public static final long Small = 0x0000000000000001L;
    @Generated @NInt public static final long Medium = 0x0000000000000002L;
    @Generated @NInt public static final long Large = 0x0000000000000003L;
}