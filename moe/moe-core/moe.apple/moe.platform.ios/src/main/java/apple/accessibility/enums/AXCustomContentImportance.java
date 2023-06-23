package apple.accessibility.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * If an object combines a significant amount of content into one label that is not always pertinent,
 * using the accessibilityCustomContent method below provides an alternative way to deliver content to the user.
 * 
 * For example, in a photos app, you may want the user to know the date, time, orientation, and shutter speed of a
 * photo.
 * However, that information may not always be necessary to the user. Using the AXCustomContentProvider protocol
 * allows the user to experience the content in a more appropriate manner for that assistive technology.
 * 
 * API-Since: 14.0
 */
@Generated
public final class AXCustomContentImportance {
    @Generated
    private AXCustomContentImportance() {
    }

    /**
     * Default. Content will be output on-demand by the user.
     * 
     * API-Since: 14.0
     */
    @Generated @NUInt public static final long Default = 0x0000000000000000L;
    /**
     * Content will be output immediately to the user.
     * 
     * API-Since: 14.0
     */
    @Generated @NUInt public static final long High = 0x0000000000000001L;
}
