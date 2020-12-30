package apple.network.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@typedef] nw_data_transfer_report_state_t
 * 
 * 	The state of a Data Transfer Report indicates whether or not the contents
 * 	have been collected, and are ready to be accessed.
 */
@Generated
public final class nw_data_transfer_report_state_t {
    @Generated
    private nw_data_transfer_report_state_t() {
    }

    /**
     * [@const] nw_data_transfer_report_state_collecting The report is outstanding; values cannot be accessed.
     */
    @Generated public static final int nw_data_transfer_report_state_collecting = 0x00000001;
    /**
     * [@const] nw_data_transfer_report_state_collected The report is complete; values can now be accessed.
     */
    @Generated public static final int nw_data_transfer_report_state_collected = 0x00000002;
}