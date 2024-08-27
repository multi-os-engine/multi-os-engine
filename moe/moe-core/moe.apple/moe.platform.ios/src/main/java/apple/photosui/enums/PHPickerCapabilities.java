package apple.photosui.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * Constants that specify one or a set of \c PHPickerViewController capabilities.
 * 
 * API-Since: 17.0
 */
@Generated
public final class PHPickerCapabilities {
    @Generated
    private PHPickerCapabilities() {
    }

    /**
     * No specified capabilities.
     * 
     * API-Since: 17.0
     */
    @Generated @NUInt public static final long None = 0x0000000000000000L;
    /**
     * The search bar.
     * 
     * API-Since: 17.0
     */
    @Generated @NUInt public static final long Search = 0x0000000000000001L;
    /**
     * The staging area.
     * 
     * API-Since: 17.0
     */
    @Generated @NUInt public static final long StagingArea = 0x0000000000000002L;
    /**
     * The sidebar or the albums tab.
     * 
     * API-Since: 17.0
     */
    @Generated @NUInt public static final long CollectionNavigation = 0x0000000000000004L;
    /**
     * The "Cancel" and the "Add" (if possible) button.
     * 
     * API-Since: 17.0
     */
    @Generated @NUInt public static final long SelectionActions = 0x0000000000000008L;
    /**
     * Show intervention UI explaining potential risks for kids or teens if a sensitive asset is selected. Analysis and
     * intervention will only be performed if "Communication Safety" is enabled in ScreenTime.
     * 
     * API-Since: 17.0
     */
    @Generated @NUInt public static final long SensitivityAnalysisIntervention = 0x0000000000000010L;
}