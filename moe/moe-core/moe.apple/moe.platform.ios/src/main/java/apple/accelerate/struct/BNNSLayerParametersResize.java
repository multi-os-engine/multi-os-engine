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
public final class BNNSLayerParametersResize extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public BNNSLayerParametersResize() {
        super(BNNSLayerParametersResize.class);
    }

    @Generated
    protected BNNSLayerParametersResize(Pointer peer) {
        super(peer);
    }

    @Generated
    public BNNSLayerParametersResize(int method, @ByValue BNNSNDArrayDescriptor i_desc,
            @ByValue BNNSNDArrayDescriptor o_desc, boolean align_corners) {
        super(BNNSLayerParametersResize.class);
        setMethod(method);
        setI_desc(i_desc);
        setO_desc(o_desc);
        setAlign_corners(align_corners);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int method();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setMethod(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    @ByValue
    public native BNNSNDArrayDescriptor i_desc();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setI_desc(@ByValue BNNSNDArrayDescriptor value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    @ByValue
    public native BNNSNDArrayDescriptor o_desc();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setO_desc(@ByValue BNNSNDArrayDescriptor value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native boolean align_corners();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setAlign_corners(boolean value);
}