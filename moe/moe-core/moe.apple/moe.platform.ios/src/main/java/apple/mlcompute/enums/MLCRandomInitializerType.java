package apple.mlcompute.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@enum] MLCRandomInitializerType
 * <p>
 * An initializer type you use to create a tensor with random data.
 */
@Generated
public final class MLCRandomInitializerType {
    @Generated
    private MLCRandomInitializerType() {
    }

    @Generated public static final int Invalid = 0x00000000;
    /**
     * The uniform random initializer type.
     */
    @Generated public static final int Uniform = 0x00000001;
    /**
     * The glorot uniform random initializer type.
     */
    @Generated public static final int GlorotUniform = 0x00000002;
    /**
     * The Xavier random initializer type.
     */
    @Generated public static final int Xavier = 0x00000003;
    /**
     * holds the number of MLCRandomInitializerType
     */
    @Generated public static final int Count = 0x00000004;
}
