package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class clockinfo extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public clockinfo() {
        super(clockinfo.class);
    }

    @Generated
    protected clockinfo(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int hz();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setHz(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int tick();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setTick(int value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int tickadj();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setTickadj(int value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int stathz();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setStathz(int value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native int profhz();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setProfhz(int value);
}