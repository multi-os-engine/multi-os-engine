package apple.security.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@enum] tls_ciphersuite_group_t enumeration
 * 
 * Convenience ciphersuite groups that collate ciphersuites of comparable security
 * properties into a single alias.
 * 
 * [@constant] tls_ciphersuite_group_default
 * [@constant] tls_ciphersuite_group_compatibility
 * [@constant] tls_ciphersuite_group_legacy
 * [@constant] tls_ciphersuite_group_ats
 * [@constant] tls_ciphersuite_group_ats_compatibility
 */
@Generated
public final class tls_ciphersuite_group_t {
    @Generated
    private tls_ciphersuite_group_t() {
    }

    @Generated public static final char _default = 0x0000;
    @Generated public static final char _compatibility = 0x0001;
    @Generated public static final char _legacy = 0x0002;
    @Generated public static final char _ats = 0x0003;
    @Generated public static final char _ats_compatibility = 0x0004;
}
