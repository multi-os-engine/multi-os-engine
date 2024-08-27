package apple.corefoundation.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NFloat;

@Generated
@Structure()
public final class CGVector extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public CGVector() {
        super(CGVector.class);
    }

    @Generated
    protected CGVector(Pointer peer) {
        super(peer);
    }

    @Generated
    public CGVector(@NFloat double dx, @NFloat double dy) {
        super(CGVector.class);
        setDx(dx);
        setDy(dy);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    @NFloat
    public native double dx();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setDx(@NFloat double value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    @NFloat
    public native double dy();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setDy(@NFloat double value);
}