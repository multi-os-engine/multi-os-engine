package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class au_evclass_map extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public au_evclass_map() {
        super(au_evclass_map.class);
    }

    @Generated
    protected au_evclass_map(Pointer peer) {
        super(peer);
    }

    @Generated
    public au_evclass_map(char ec_number, int ec_class) {
        super(au_evclass_map.class);
        setEc_number(ec_number);
        setEc_class(ec_class);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native char ec_number();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setEc_number(char value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int ec_class();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setEc_class(int value);
}