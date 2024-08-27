package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class uuid_command extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public uuid_command() {
        super(uuid_command.class);
    }

    @Generated
    protected uuid_command(Pointer peer) {
        super(peer);
    }

    /**
     * LC_UUID
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int cmd();

    /**
     * LC_UUID
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setCmd(int value);

    /**
     * sizeof(struct uuid_command)
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int cmdsize();

    /**
     * sizeof(struct uuid_command)
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setCmdsize(int value);

    /**
     * the 128-bit uuid
     */
    @Generated
    @StructureField(order = 2, isGetter = true, count = 16)
    public native byte uuid(int field_idx);

    /**
     * the 128-bit uuid
     */
    @Generated
    @StructureField(order = 2, isGetter = false, count = 16)
    public native void setUuid(byte value, int field_idx);
}