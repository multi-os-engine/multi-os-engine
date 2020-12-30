package apple.metalperformanceshaders.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class MPSNNTrainingStyle {
    @Generated
    private MPSNNTrainingStyle() {
    }

    /**
     * Do not train this node, for example in transfer learning
     */
    @Generated @NUInt public static final long None = 0x0000000000000000L;
    /**
     * The weight update pass will be called in a command buffer completion callback, with a nil command buffer
     */
    @Generated @NUInt public static final long CPU = 0x0000000000000001L;
    /**
     * The weight update pass will be called immediately after the gradient pass is encoded, with a nonnull command buffer
     */
    @Generated @NUInt public static final long GPU = 0x0000000000000002L;
}