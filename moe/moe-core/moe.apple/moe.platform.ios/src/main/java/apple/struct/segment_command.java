package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class segment_command extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public segment_command() {
        super(segment_command.class);
    }

    @Generated
    protected segment_command(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int cmd();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setCmd(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int cmdsize();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setCmdsize(int value);

    @Generated
    @StructureField(order = 2, isGetter = true, count = 16)
    public native byte segname(int field_idx);

    @Generated
    @StructureField(order = 2, isGetter = false, count = 16)
    public native void setSegname(byte value, int field_idx);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int vmaddr();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setVmaddr(int value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native int vmsize();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setVmsize(int value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    public native int fileoff();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setFileoff(int value);

    @Generated
    @StructureField(order = 6, isGetter = true)
    public native int filesize();

    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setFilesize(int value);

    @Generated
    @StructureField(order = 7, isGetter = true)
    public native int maxprot();

    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void setMaxprot(int value);

    @Generated
    @StructureField(order = 8, isGetter = true)
    public native int initprot();

    @Generated
    @StructureField(order = 8, isGetter = false)
    public native void setInitprot(int value);

    @Generated
    @StructureField(order = 9, isGetter = true)
    public native int nsects();

    @Generated
    @StructureField(order = 9, isGetter = false)
    public native void setNsects(int value);

    @Generated
    @StructureField(order = 10, isGetter = true)
    public native int flags();

    @Generated
    @StructureField(order = 10, isGetter = false)
    public native void setFlags(int value);
}