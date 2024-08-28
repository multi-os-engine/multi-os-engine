package apple.matter.enums;

import org.moe.natj.general.ann.Generated;

/**
 * API-Since: 16.1
 */
@Generated
public final class MTRActionsCommandBits {
    @Generated
    private MTRActionsCommandBits() {
    }

    /**
     * API-Since: 16.1
     */
    @Generated public static final char InstantAction = 0x0001;
    /**
     * API-Since: 16.1
     */
    @Generated public static final char InstantActionWithTransition = 0x0002;
    /**
     * API-Since: 16.1
     */
    @Generated public static final char StartAction = 0x0004;
    /**
     * API-Since: 16.1
     */
    @Generated public static final char StartActionWithDuration = 0x0008;
    /**
     * API-Since: 16.1
     */
    @Generated public static final char StopAction = 0x0010;
    /**
     * API-Since: 16.1
     */
    @Generated public static final char PauseAction = 0x0020;
    /**
     * API-Since: 16.1
     */
    @Generated public static final char PauseActionWithDuration = 0x0040;
    /**
     * API-Since: 16.1
     */
    @Generated public static final char ResumeAction = 0x0080;
    /**
     * API-Since: 16.1
     */
    @Generated public static final char EnableAction = 0x0100;
    /**
     * API-Since: 16.1
     */
    @Generated public static final char EnableActionWithDuration = 0x0200;
    /**
     * API-Since: 16.1
     */
    @Generated public static final char DisableAction = 0x0400;
    /**
     * API-Since: 16.1
     */
    @Generated public static final char DisableActionWithDuration = 0x0800;
}