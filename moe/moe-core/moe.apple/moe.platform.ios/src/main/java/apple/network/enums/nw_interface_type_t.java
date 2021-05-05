package apple.network.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@typedef] nw_interface_type_t
 * 
 * 	Interface types represent the underlying media for a network link, such as Wi-Fi or
 * 	Cellular.
 */
@Generated
public final class nw_interface_type_t {
    @Generated
    private nw_interface_type_t() {
    }

    /**
     * [@const] nw_interface_type_other A virtual or otherwise unknown interface type
     */
    @Generated public static final int nw_interface_type_other = 0x00000000;
    /**
     * [@const] nw_interface_type_wifi A Wi-Fi link
     */
    @Generated public static final int nw_interface_type_wifi = 0x00000001;
    /**
     * [@const] nw_interface_type_wifi A Cellular link
     */
    @Generated public static final int nw_interface_type_cellular = 0x00000002;
    /**
     * [@const] nw_interface_type_wired A Wired Ethernet link
     */
    @Generated public static final int nw_interface_type_wired = 0x00000003;
    /**
     * [@const] nw_interface_type_loopback The loopback interface
     */
    @Generated public static final int nw_interface_type_loopback = 0x00000004;
}