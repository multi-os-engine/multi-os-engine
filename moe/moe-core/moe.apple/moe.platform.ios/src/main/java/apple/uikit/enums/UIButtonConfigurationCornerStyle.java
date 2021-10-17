package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class UIButtonConfigurationCornerStyle {
    @Generated
    private UIButtonConfigurationCornerStyle() {
    }

    /**
     * The corner radius provided by the background style will be used as is, without adjusting for dynamic type
     */
    @Generated @NInt public static final long Fixed = 0xFFFFFFFFFFFFFFFFL;
    /**
     * The corner radius provided by the background style is adjusted based on dynamic type
     */
    @Generated @NInt public static final long Dynamic = 0x0000000000000000L;
    /**
     * Ignore the corner radius provided by the background style and substitute a small system defined corner radius.
     */
    @Generated @NInt public static final long Small = 0x0000000000000001L;
    /**
     * Ignore the corner radius provided by the background style and substitute a medium system defined corner radius.
     */
    @Generated @NInt public static final long Medium = 0x0000000000000002L;
    /**
     * Ignore the corner radius provided by the background style and substitute a large system defined corner radius.
     */
    @Generated @NInt public static final long Large = 0x0000000000000003L;
    /**
     * Ignore the corner radius provided by the background style and always set the corner radius to generate a capsule.
     */
    @Generated @NInt public static final long Capsule = 0x0000000000000004L;
}
