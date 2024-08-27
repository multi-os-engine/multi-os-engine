package apple.matter.enums;

import org.moe.natj.general.ann.Generated;

/**
 * For the OTA clusters, first we changed the names of the clusters, and then we
 * changed the names of the enums. That means we now have three names for the
 * enums (newest name, name before enum name change, name before cluster name
 * change). We can only track one old name for things, so just manually add the
 * intermediate names.
 * 
 * API-Since: 16.4
 * Deprecated-Since: 17.2
 * Deprecated-Message: Please use MTROTASoftwareUpdateProviderApplyUpdateAction
 */
@Generated
@Deprecated
public final class MTROTASoftwareUpdateProviderOTAApplyUpdateAction {
    @Generated
    private MTROTASoftwareUpdateProviderOTAApplyUpdateAction() {
    }

    /**
     * API-Since: 16.4
     * Deprecated-Since: 17.2
     * Deprecated-Message: Please use MTROTASoftwareUpdateProviderApplyUpdateActionProceed
     */
    @Generated @Deprecated public static final byte Proceed = 0;
    /**
     * API-Since: 16.4
     * Deprecated-Since: 17.2
     * Deprecated-Message: Please use MTROTASoftwareUpdateProviderApplyUpdateActionAwaitNextAction
     */
    @Generated @Deprecated public static final byte AwaitNextAction = 1;
    /**
     * API-Since: 16.4
     * Deprecated-Since: 17.2
     * Deprecated-Message: Please use MTROTASoftwareUpdateProviderApplyUpdateActionDiscontinue
     */
    @Generated @Deprecated public static final byte Discontinue = 2;
}