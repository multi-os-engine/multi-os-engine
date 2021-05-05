package apple.imageio.enums;

import org.moe.natj.general.ann.Generated;

@Generated
public final class CGImageAnimationStatus {
    @Generated
    private CGImageAnimationStatus() {
    }

    /**
     * NULL or invalid parameter passed to API
     */
    @Generated public static final int ParameterError = 0xFFFFA984;
    /**
     * An image cannot be read from the given source
     */
    @Generated public static final int CorruptInputImage = 0xFFFFA983;
    /**
     * The image format is not applicable to animation
     */
    @Generated public static final int UnsupportedFormat = 0xFFFFA982;
    /**
     * An image can be read from the given source, but it is incomplete
     */
    @Generated public static final int IncompleteInputImage = 0xFFFFA981;
    /**
     * A required resource could not be created
     */
    @Generated public static final int AllocationFailure = 0xFFFFA980;
}