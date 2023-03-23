package apple.network.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@typedef] nw_interface_radio_type_t
 * 
 * Interface radio types represent the radio technology for a network link.
 */
@Generated
public final class nw_interface_radio_type_t {
    @Generated
    private nw_interface_radio_type_t() {
    }

    @Generated public static final int nw_interface_radio_type_unknown = 0x00000000;
    @Generated public static final int nw_interface_radio_type_wifi_b = 0x00000001;
    @Generated public static final int nw_interface_radio_type_wifi_a = 0x00000002;
    @Generated public static final int nw_interface_radio_type_wifi_g = 0x00000003;
    @Generated public static final int nw_interface_radio_type_wifi_n = 0x00000004;
    @Generated public static final int nw_interface_radio_type_wifi_ac = 0x00000005;
    @Generated public static final int nw_interface_radio_type_wifi_ax = 0x00000006;
    /**
     * 4G LTE
     */
    @Generated public static final int nw_interface_radio_type_cell_lte = 0x00000080;
    /**
     * 5G Dual LTE & New Radio Sub6
     */
    @Generated public static final int nw_interface_radio_type_cell_endc_sub6 = 0x00000081;
    /**
     * 5G Dual LTE & New Radio mmWave
     */
    @Generated public static final int nw_interface_radio_type_cell_endc_mmw = 0x00000082;
    /**
     * 5G Stand Alone New Radio Sub6
     */
    @Generated public static final int nw_interface_radio_type_cell_nr_sa_sub6 = 0x00000083;
    /**
     * 5G Stand Alone New Radio mmWave
     */
    @Generated public static final int nw_interface_radio_type_cell_nr_sa_mmw = 0x00000084;
    /**
     * 3G WCDMA
     */
    @Generated public static final int nw_interface_radio_type_cell_wcdma = 0x00000085;
    /**
     * 2G GSM
     */
    @Generated public static final int nw_interface_radio_type_cell_gsm = 0x00000086;
    /**
     * 1x data
     */
    @Generated public static final int nw_interface_radio_type_cell_cdma = 0x00000087;
    /**
     * HDR data
     */
    @Generated public static final int nw_interface_radio_type_cell_evdo = 0x00000088;
}
