package apple.accelerate.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
@Structure()
public final class BNNSLayerParametersLSTM extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public BNNSLayerParametersLSTM() {
        super(BNNSLayerParametersLSTM.class);
    }

    @Generated
    protected BNNSLayerParametersLSTM(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    @NUInt
    public native long input_size();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setInput_size(@NUInt long value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    @NUInt
    public native long hidden_size();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setHidden_size(@NUInt long value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    @NUInt
    public native long batch_size();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setBatch_size(@NUInt long value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    @NUInt
    public native long num_layers();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setNum_layers(@NUInt long value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    @NUInt
    public native long seq_len();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setSeq_len(@NUInt long value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    public native float dropout();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setDropout(float value);

    @Generated
    @StructureField(order = 6, isGetter = true)
    public native int lstm_flags();

    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setLstm_flags(int value);

    @Generated
    @StructureField(order = 7, isGetter = true)
    @ByValue
    public native BNNSNDArrayDescriptor sequence_descriptor();

    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void setSequence_descriptor(@ByValue BNNSNDArrayDescriptor value);

    @Generated
    @StructureField(order = 8, isGetter = true)
    @ByValue
    public native BNNSLSTMDataDescriptor input_descriptor();

    @Generated
    @StructureField(order = 8, isGetter = false)
    public native void setInput_descriptor(@ByValue BNNSLSTMDataDescriptor value);

    @Generated
    @StructureField(order = 9, isGetter = true)
    @ByValue
    public native BNNSLSTMDataDescriptor output_descriptor();

    @Generated
    @StructureField(order = 9, isGetter = false)
    public native void setOutput_descriptor(@ByValue BNNSLSTMDataDescriptor value);

    @Generated
    @StructureField(order = 10, isGetter = true)
    @ByValue
    public native BNNSLSTMGateDescriptor input_gate();

    @Generated
    @StructureField(order = 10, isGetter = false)
    public native void setInput_gate(@ByValue BNNSLSTMGateDescriptor value);

    @Generated
    @StructureField(order = 11, isGetter = true)
    @ByValue
    public native BNNSLSTMGateDescriptor forget_gate();

    @Generated
    @StructureField(order = 11, isGetter = false)
    public native void setForget_gate(@ByValue BNNSLSTMGateDescriptor value);

    @Generated
    @StructureField(order = 12, isGetter = true)
    @ByValue
    public native BNNSLSTMGateDescriptor candidate_gate();

    @Generated
    @StructureField(order = 12, isGetter = false)
    public native void setCandidate_gate(@ByValue BNNSLSTMGateDescriptor value);

    @Generated
    @StructureField(order = 13, isGetter = true)
    @ByValue
    public native BNNSLSTMGateDescriptor output_gate();

    @Generated
    @StructureField(order = 13, isGetter = false)
    public native void setOutput_gate(@ByValue BNNSLSTMGateDescriptor value);

    @Generated
    @StructureField(order = 14, isGetter = true)
    @ByValue
    public native BNNSActivation hidden_activation();

    @Generated
    @StructureField(order = 14, isGetter = false)
    public native void setHidden_activation(@ByValue BNNSActivation value);
}