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
public final class CGPoint extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public CGPoint() {
        super(CGPoint.class);
    }

    @Generated
    protected CGPoint(Pointer peer) {
        super(peer);
    }

    @Generated
    public CGPoint(@NFloat double x, @NFloat double y) {
        super(CGPoint.class);
        setX(x);
        setY(y);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    @NFloat
    public native double x();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setX(@NFloat double value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    @NFloat
    public native double y();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setY(@NFloat double value);
}