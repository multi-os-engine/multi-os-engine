package apple.intentsui.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * API-Since: 11.0
 */
@Generated
public final class INUIInteractiveBehavior {
    @Generated
    private INUIInteractiveBehavior() {
    }

    /**
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long None = 0x0000000000000000L;
    /**
     * Show UI representing navigation to a new view, such as a navigation chevron
     * 
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long NextView = 0x0000000000000001L;
    /**
     * Show UI representing a launch to leave the context, such as a button
     * 
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long Launch = 0x0000000000000002L;
    /**
     * Show UI representing a generic follow-on action within the context, such as a large tap target
     * 
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long GenericAction = 0x0000000000000003L;
}