package apple.mlcompute.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@enum] MLCDataType
 * <p>
 * A tensor data type.
 */
@Generated
public final class MLCDataType {
    @Generated
    private MLCDataType() {
    }

    @Generated public static final int Invalid = 0x00000000;
    /**
     * The 32-bit floating-point data type.
     */
    @Generated public static final int Float32 = 0x00000001;
    /**
     * The 16-bit floating-point data type.
     */
    @Generated public static final int Float16 = 0x00000003;
    /**
     * The Boolean data type.
     */
    @Generated public static final int Boolean = 0x00000004;
    /**
     * The 64-bit integer data type.
     */
    @Generated public static final int Int64 = 0x00000005;
    /**
     * The 32-bit integer data type.
     */
    @Generated public static final int Int32 = 0x00000007;
    /**
     * The 8-bit integer data type.
     */
    @Generated public static final int Int8 = 0x00000008;
    /**
     * The 8-bit unsigned integer data type.
     */
    @Generated public static final int UInt8 = 0x00000009;
    /**
     * holds the number of MLCDataTypes
     */
    @Generated public static final int Count = 0x0000000A;
}
