package apple.videotoolbox.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class VTInt32Point extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public VTInt32Point() {
        super(VTInt32Point.class);
    }

    @Generated
    protected VTInt32Point(Pointer peer) {
        super(peer);
    }

    @Generated
    public VTInt32Point(int x, int y) {
        super(VTInt32Point.class);
        setX(x);
        setY(y);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int x();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setX(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int y();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setY(int value);
}