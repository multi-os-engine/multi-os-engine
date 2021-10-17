package apple.mlcompute.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@enum]       MLCLSTMResultMode
 * <p>
 * A result mode for an LSTM layer.
 */
@Generated
public final class MLCLSTMResultMode {
    @Generated
    private MLCLSTMResultMode() {
    }

    /**
     * The output result mode. When selected for an LSTM layer, the layer will produce a single result tensor representing the final output of the LSTM.
     */
    @Generated public static final long Output = 0x0000000000000000L;
    /**
     * The output and states result mode. When selected for an LSTM layer, the layer will produce three result tensors representing the final output of
     * the LSTM, the last hidden state, and the cell state, respectively.
     */
    @Generated public static final long OutputAndStates = 0x0000000000000001L;
}
