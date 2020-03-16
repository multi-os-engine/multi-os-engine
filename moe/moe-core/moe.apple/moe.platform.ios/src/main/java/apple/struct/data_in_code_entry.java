package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class data_in_code_entry extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public data_in_code_entry() {
        super(data_in_code_entry.class);
    }

    @Generated
    protected data_in_code_entry(Pointer peer) {
        super(peer);
    }

    @Generated
    public data_in_code_entry(int offset, char length, char kind) {
        super(data_in_code_entry.class);
        setOffset(offset);
        setLength(length);
        setKind(kind);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int offset();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setOffset(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native char length();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setLength(char value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native char kind();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setKind(char value);
}