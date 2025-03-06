package apple.mapkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * The style to use for map item detail callout presentation
 * 
 * API-Since: 18.0
 */
@Generated
public final class MKMapItemDetailSelectionAccessoryCalloutStyle {
    @Generated
    private MKMapItemDetailSelectionAccessoryCalloutStyle() {
    }

    /**
     * An appropriate callout style will be chosen automatically.
     * 
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Automatic = 0x0000000000000000L;
    /**
     * A rich, detailed view
     * 
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Full = 0x0000000000000001L;
    /**
     * A compact, space-saving presentation
     * 
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Compact = 0x0000000000000002L;
}