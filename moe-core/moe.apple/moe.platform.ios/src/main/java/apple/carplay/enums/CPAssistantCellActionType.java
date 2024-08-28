package apple.carplay.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Actions that Siri will perform when users select the assistant cell.
 * 
 * These actions require that your app supports the required SiriKit intents, and your app is of a supporting category.
 * For CarPlay audio apps, this is limited to INPlayMediaIntent. For CarPlay communication apps, this is
 * INStartCallIntent.
 * 
 * API-Since: 15.0
 */
@Generated
public final class CPAssistantCellActionType {
    @Generated
    private CPAssistantCellActionType() {
    }

    /**
     * API-Since: 15.0
     */
    @Generated @NInt public static final long PlayMedia = 0x0000000000000000L;
    /**
     * API-Since: 15.0
     */
    @Generated @NInt public static final long StartCall = 0x0000000000000001L;
}
