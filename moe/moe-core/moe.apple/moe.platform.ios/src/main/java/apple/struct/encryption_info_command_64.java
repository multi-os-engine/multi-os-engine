package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class encryption_info_command_64 extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public encryption_info_command_64() {
        super(encryption_info_command_64.class);
    }

    @Generated
    protected encryption_info_command_64(Pointer peer) {
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
    @StructureField(order = 2, isGetter = true)
    public native int cryptoff();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setCryptoff(int value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int cryptsize();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setCryptsize(int value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native int cryptid();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setCryptid(int value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    public native int pad();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setPad(int value);
}