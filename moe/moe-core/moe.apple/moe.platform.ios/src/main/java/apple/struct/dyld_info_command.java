package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class dyld_info_command extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public dyld_info_command() {
        super(dyld_info_command.class);
    }

    @Generated
    protected dyld_info_command(Pointer peer) {
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
    public native int rebase_off();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setRebase_off(int value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int rebase_size();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setRebase_size(int value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native int bind_off();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setBind_off(int value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    public native int bind_size();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setBind_size(int value);

    @Generated
    @StructureField(order = 6, isGetter = true)
    public native int weak_bind_off();

    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setWeak_bind_off(int value);

    @Generated
    @StructureField(order = 7, isGetter = true)
    public native int weak_bind_size();

    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void setWeak_bind_size(int value);

    @Generated
    @StructureField(order = 8, isGetter = true)
    public native int lazy_bind_off();

    @Generated
    @StructureField(order = 8, isGetter = false)
    public native void setLazy_bind_off(int value);

    @Generated
    @StructureField(order = 9, isGetter = true)
    public native int lazy_bind_size();

    @Generated
    @StructureField(order = 9, isGetter = false)
    public native void setLazy_bind_size(int value);

    @Generated
    @StructureField(order = 10, isGetter = true)
    public native int export_off();

    @Generated
    @StructureField(order = 10, isGetter = false)
    public native void setExport_off(int value);

    @Generated
    @StructureField(order = 11, isGetter = true)
    public native int export_size();

    @Generated
    @StructureField(order = 11, isGetter = false)
    public native void setExport_size(int value);
}