package apple.network.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@typedef] nw_txt_record_find_key_t
 * 
 * 	An enumeration of possible find results when trying to find a key-value
 * 	pair in the TXT record object.
 */
@Generated
public final class nw_txt_record_find_key_t {
    @Generated
    private nw_txt_record_find_key_t() {
    }

    /**
     * [@const] nw_txt_record_find_key_invalid The key is invalid. According
     * 	to RFC 1464, a key is invalid if it is an empty string, contains
     * 	non-ASCII characters, or has length greater than UINT8_MAX.
     */
    @Generated public static final int nw_txt_record_find_key_invalid = 0x00000000;
    /**
     * [@const] nw_txt_record_find_key_not_present The key-value pair does not exist in the TXT record.
     */
    @Generated public static final int nw_txt_record_find_key_not_present = 0x00000001;
    /**
     * [@const] nw_txt_record_find_key_no_value The key exists in the TXT record, but has no assigned value.
     */
    @Generated public static final int nw_txt_record_find_key_no_value = 0x00000002;
    /**
     * [@const] nw_txt_record_find_key_empty_value The key exists in the TXT record with an empty value.
     */
    @Generated public static final int nw_txt_record_find_key_empty_value = 0x00000003;
    /**
     * [@const] nw_txt_record_find_key_non_empty_value The key exists in the TXT record with a non-empty value.
     */
    @Generated public static final int nw_txt_record_find_key_non_empty_value = 0x00000004;
}