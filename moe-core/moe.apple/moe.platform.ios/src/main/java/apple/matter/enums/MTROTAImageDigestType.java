package apple.matter.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * A representation of an OTA image header as defined in the Matter
 * specification's "Over-the-Air (OTA) Software Update File Format" section.
 * 
 * API-Since: 16.1
 */
@Generated
public final class MTROTAImageDigestType {
    @Generated
    private MTROTAImageDigestType() {
    }

    /**
     * API-Since: 16.1
     */
    @Generated @NUInt public static final long Sha256 = 0x0000000000000001L;
    /**
     * API-Since: 16.1
     */
    @Generated @NUInt public static final long Sha256_128 = 0x0000000000000002L;
    /**
     * API-Since: 16.1
     */
    @Generated @NUInt public static final long Sha256_120 = 0x0000000000000003L;
    /**
     * API-Since: 16.1
     */
    @Generated @NUInt public static final long Sha256_96 = 0x0000000000000004L;
    /**
     * API-Since: 16.1
     */
    @Generated @NUInt public static final long Sha256_64 = 0x0000000000000005L;
    /**
     * API-Since: 16.1
     */
    @Generated @NUInt public static final long Sha256_32 = 0x0000000000000006L;
    /**
     * API-Since: 16.1
     */
    @Generated @NUInt public static final long Sha384 = 0x0000000000000007L;
    /**
     * API-Since: 16.1
     */
    @Generated @NUInt public static final long Sha512 = 0x0000000000000008L;
    /**
     * API-Since: 16.1
     */
    @Generated @NUInt public static final long Sha3_224 = 0x0000000000000009L;
    /**
     * API-Since: 16.1
     */
    @Generated @NUInt public static final long Sha3_256 = 0x000000000000000AL;
    /**
     * API-Since: 16.1
     */
    @Generated @NUInt public static final long Sha3_384 = 0x000000000000000BL;
    /**
     * API-Since: 16.1
     */
    @Generated @NUInt public static final long Sha3_512 = 0x000000000000000CL;
}