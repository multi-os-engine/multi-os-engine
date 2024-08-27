package apple.coremedia.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@enum] CMTagDataType
 * 
 * The data type for the value of the CMTag.
 * [@constant] kCMTagDataType_Invalid Value is a sentinel data type indicating it is not valid. The value should not be
 * treated as a value.
 * [@constant] kCMTagDataType_SInt64 Value is a signed 64-bit integer (e,g, int64_t).
 * [@constant] kCMTagDataType_Float64 Value is a 64-bit floating point value (e.g., Float64).
 * [@constant] kCMTagDataType_OSType Value is an OSType in the lower 32 bits of a 64-bit integer (e.g., OSType).
 * [@constant] kCMTagDataType_Flags Value is a 64-bit integer holding option bits or flags.
 * 
 * API-Since: 17.0
 */
@Generated
public final class CMTagDataType {
    @Generated
    private CMTagDataType() {
    }

    /**
     * API-Since: 17.0
     */
    @Generated public static final int Invalid = 0x00000000;
    /**
     * API-Since: 17.0
     */
    @Generated public static final int SInt64 = 0x00000002;
    /**
     * API-Since: 17.0
     */
    @Generated public static final int Float64 = 0x00000003;
    /**
     * API-Since: 17.0
     */
    @Generated public static final int OSType = 0x00000005;
    /**
     * API-Since: 17.0
     */
    @Generated public static final int Flags = 0x00000007;
}