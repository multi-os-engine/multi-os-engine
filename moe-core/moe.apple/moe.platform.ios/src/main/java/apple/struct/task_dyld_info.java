package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
@Structure(alignment = 4)
public final class task_dyld_info extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public task_dyld_info() {
        super(task_dyld_info.class);
    }

    @Generated
    protected task_dyld_info(Pointer peer) {
        super(peer);
    }

    @Generated
    public task_dyld_info(@NUInt long all_image_info_addr, @NUInt long all_image_info_size, int all_image_info_format) {
        super(task_dyld_info.class);
        setAll_image_info_addr(all_image_info_addr);
        setAll_image_info_size(all_image_info_size);
        setAll_image_info_format(all_image_info_format);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    @NUInt
    public native long all_image_info_addr();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setAll_image_info_addr(@NUInt long value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    @NUInt
    public native long all_image_info_size();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setAll_image_info_size(@NUInt long value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int all_image_info_format();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setAll_image_info_format(int value);
}