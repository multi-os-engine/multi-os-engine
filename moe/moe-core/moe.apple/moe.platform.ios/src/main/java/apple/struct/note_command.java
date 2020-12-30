package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class note_command extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public note_command() {
        super(note_command.class);
    }

    @Generated
    protected note_command(Pointer peer) {
        super(peer);
    }

    /**
     * LC_NOTE
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int cmd();

    /**
     * LC_NOTE
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setCmd(int value);

    /**
     * sizeof(struct note_command)
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int cmdsize();

    /**
     * sizeof(struct note_command)
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setCmdsize(int value);

    /**
     * owner name for this LC_NOTE
     */
    @Generated
    @StructureField(order = 2, isGetter = true, count = 16)
    public native byte data_owner(int field_idx);

    /**
     * owner name for this LC_NOTE
     */
    @Generated
    @StructureField(order = 2, isGetter = false, count = 16)
    public native void setData_owner(byte value, int field_idx);

    /**
     * file offset of this data
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    public native long offset();

    /**
     * file offset of this data
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setOffset(long value);

    /**
     * length of data region
     */
    @Generated
    @StructureField(order = 4, isGetter = true)
    public native long size();

    /**
     * length of data region
     */
    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setSize(long value);
}