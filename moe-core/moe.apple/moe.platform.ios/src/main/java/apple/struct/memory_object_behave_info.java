package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class memory_object_behave_info extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public memory_object_behave_info() {
        super(memory_object_behave_info.class);
    }

    @Generated
    protected memory_object_behave_info(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int copy_strategy();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setCopy_strategy(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int temporary();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setTemporary(int value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int invalidate();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setInvalidate(int value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int silent_overwrite();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setSilent_overwrite(int value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native int advisory_pageout();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setAdvisory_pageout(int value);
}