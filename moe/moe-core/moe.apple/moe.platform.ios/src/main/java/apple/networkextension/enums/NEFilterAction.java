package apple.networkextension.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@typedef] NEFilterAction
 * 
 * A NEFilterAction represents the possible actions taken upon a NEFilterFlow that can be reported by the
 * data provider extension to the control provider extension.
 * 
 * API-Since: 11.0
 */
@Generated
public final class NEFilterAction {
    @Generated
    private NEFilterAction() {
    }

    /**
     * [@const] NEFilterActionInvalid Invalid action, represents an error
     * 
     * API-Since: 11.0
     */
    @Generated @NInt public static final long Invalid = 0x0000000000000000L;
    /**
     * [@const] NEFilterActionAllow Allowing the flow
     * 
     * API-Since: 11.0
     */
    @Generated @NInt public static final long Allow = 0x0000000000000001L;
    /**
     * [@const] NEFilterActionDrop Dropping the flow
     * 
     * API-Since: 11.0
     */
    @Generated @NInt public static final long Drop = 0x0000000000000002L;
    /**
     * [@const] NEFilterActionRemediate Remediating the flow (a "content blocked" page displayed to the user)
     * 
     * API-Since: 11.0
     */
    @Generated @NInt public static final long Remediate = 0x0000000000000003L;
    /**
     * [@const] NEFilterActionFilterData Filtering data on the flow
     * 
     * API-Since: 11.0
     */
    @Generated @NInt public static final long FilterData = 0x0000000000000004L;
}
