package apple.accelerate.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class BNNSLayerParametersDropout extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public BNNSLayerParametersDropout() {
        super(BNNSLayerParametersDropout.class);
    }

    @Generated
    protected BNNSLayerParametersDropout(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    @ByValue
    public native BNNSNDArrayDescriptor i_desc();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setI_desc(@ByValue BNNSNDArrayDescriptor value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    @ByValue
    public native BNNSNDArrayDescriptor o_desc();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setO_desc(@ByValue BNNSNDArrayDescriptor value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native float rate();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setRate(float value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int seed();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setSeed(int value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native byte control();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setControl(byte value);
}