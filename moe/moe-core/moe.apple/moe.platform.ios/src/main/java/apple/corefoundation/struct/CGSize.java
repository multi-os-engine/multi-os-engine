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
public final class CGSize extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public CGSize() {
        super(CGSize.class);
    }

    @Generated
    protected CGSize(Pointer peer) {
        super(peer);
    }

    @Generated
    public CGSize(@NFloat double width, @NFloat double height) {
        super(CGSize.class);
        setWidth(width);
        setHeight(height);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    @NFloat
    public native double width();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setWidth(@NFloat double value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    @NFloat
    public native double height();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setHeight(@NFloat double value);
}