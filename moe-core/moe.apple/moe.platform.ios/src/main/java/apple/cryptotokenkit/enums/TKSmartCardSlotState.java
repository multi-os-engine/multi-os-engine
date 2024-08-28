package apple.cryptotokenkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Enumerates all possible slot states.
 */
@Generated
public final class TKSmartCardSlotState {
    @Generated
    private TKSmartCardSlotState() {
    }

    /**
     * Slot is no longer known to the system. This is terminal state for TKSmartCardSlot instance, once reached, the
     * slot instance can never be revived.
     */
    @Generated @NInt public static final long Missing = 0x0000000000000000L;
    /**
     * The slot is empty, no card is inserted.
     */
    @Generated @NInt public static final long Empty = 0x0000000000000001L;
    /**
     * The card was inserted into the slot and an initial probe is in progress.
     */
    @Generated @NInt public static final long Probing = 0x0000000000000002L;
    /**
     * The card inserted in the slot does not answer.
     */
    @Generated @NInt public static final long MuteCard = 0x0000000000000003L;
    /**
     * Card properly answered to reset.
     */
    @Generated @NInt public static final long ValidCard = 0x0000000000000004L;
}