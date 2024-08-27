package apple.videotoolbox.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class VTInt32Size extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public VTInt32Size() {
        super(VTInt32Size.class);
    }

    @Generated
    protected VTInt32Size(Pointer peer) {
        super(peer);
    }

    @Generated
    public VTInt32Size(int width, int height) {
        super(VTInt32Size.class);
        setWidth(width);
        setHeight(height);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int width();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setWidth(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int height();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setHeight(int value);
}