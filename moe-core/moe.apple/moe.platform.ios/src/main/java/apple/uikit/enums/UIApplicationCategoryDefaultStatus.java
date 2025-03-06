package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * The default status of an application for some category.
 * 
 * API-Since: 18.2
 */
@Generated
public final class UIApplicationCategoryDefaultStatus {
    @Generated
    private UIApplicationCategoryDefaultStatus() {
    }

    /**
     * The status was not available. This is an error condition and the returned error object has more information.
     * 
     * API-Since: 18.2
     */
    @Generated @NInt public static final long Unavailable = 0x0000000000000000L;
    /**
     * The application is the default for the category.
     * 
     * API-Since: 18.2
     */
    @Generated @NInt public static final long IsDefault = 0x0000000000000001L;
    /**
     * The application is not the default for the category.
     * 
     * API-Since: 18.2
     */
    @Generated @NInt public static final long NotDefault = 0x0000000000000002L;
}