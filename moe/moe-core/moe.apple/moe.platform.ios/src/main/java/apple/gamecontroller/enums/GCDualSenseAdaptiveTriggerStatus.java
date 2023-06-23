package apple.gamecontroller.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 14.5
 */
@Generated
public final class GCDualSenseAdaptiveTriggerStatus {
    @Generated
    private GCDualSenseAdaptiveTriggerStatus() {
    }

    /**
     * The adaptive trigger status cannot be determined.
     * 
     * API-Since: 14.5
     */
    @Generated @NInt public static final long Unknown = 0xFFFFFFFFFFFFFFFFL;
    /**
     * The adaptive trigger is in feedback mode, and a resistive load has not been applied yet.
     * 
     * API-Since: 14.5
     */
    @Generated @NInt public static final long FeedbackNoLoad = 0x0000000000000000L;
    /**
     * The adaptive trigger is in feedback mode, and a resistive load is applied.
     * 
     * API-Since: 14.5
     */
    @Generated @NInt public static final long FeedbackLoadApplied = 0x0000000000000001L;
    /**
     * The adaptive trigger is in weapon mode, the trigger is ready to fire, and a resistive load has not been applied
     * yet.
     * 
     * API-Since: 14.5
     */
    @Generated @NInt public static final long WeaponReady = 0x0000000000000002L;
    /**
     * The adaptive trigger is in weapon mode, the trigger is firing, and a resistive load is currently being applied.
     * 
     * API-Since: 14.5
     */
    @Generated @NInt public static final long WeaponFiring = 0x0000000000000003L;
    /**
     * The adaptive trigger is in weapon mode, the trigger has fired, and a resistive load is no longer being applied.
     * 
     * API-Since: 14.5
     */
    @Generated @NInt public static final long WeaponFired = 0x0000000000000004L;
    /**
     * The adaptive trigger is in vibration mode, and the trigger is not vibrating.
     * 
     * API-Since: 14.5
     */
    @Generated @NInt public static final long VibrationNotVibrating = 0x0000000000000005L;
    /**
     * The adaptive trigger is in vibration mode, and the trigger is currently vibrating.
     * 
     * API-Since: 14.5
     */
    @Generated @NInt public static final long VibrationIsVibrating = 0x0000000000000006L;
    /**
     * The adaptive trigger is in slope feedback mode, the trigger is ready to apply a resistive load, but a resistive
     * load has not been applied yet.
     * 
     * API-Since: 14.5
     */
    @Generated @NInt public static final long SlopeFeedbackReady = 0x0000000000000007L;
    /**
     * The adaptive trigger is in slope feedback mode, and a resistive load is currently being applied to the trigger.
     * 
     * API-Since: 14.5
     */
    @Generated @NInt public static final long SlopeFeedbackApplyingLoad = 0x0000000000000008L;
    /**
     * The adaptive trigger is in slope feedback mode, a resistive load has previously been applied, but is no longer
     * being applied.
     * 
     * API-Since: 14.5
     */
    @Generated @NInt public static final long SlopeFeedbackFinished = 0x0000000000000009L;
}
