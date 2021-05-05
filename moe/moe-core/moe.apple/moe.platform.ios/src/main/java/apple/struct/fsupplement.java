package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
@Structure()
public final class fsupplement extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public fsupplement() {
        super(fsupplement.class);
    }

    @Generated
    protected fsupplement(Pointer peer) {
        super(peer);
    }

    @Generated
    public fsupplement(long fs_file_start, long fs_blob_start, @NUInt long fs_blob_size, int fs_orig_fd) {
        super(fsupplement.class);
        setFs_file_start(fs_file_start);
        setFs_blob_start(fs_blob_start);
        setFs_blob_size(fs_blob_size);
        setFs_orig_fd(fs_orig_fd);
    }

    /**
     * offset of Mach-O image in FAT file
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native long fs_file_start();

    /**
     * offset of Mach-O image in FAT file
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setFs_file_start(long value);

    /**
     * offset of signature in Mach-O image
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native long fs_blob_start();

    /**
     * offset of signature in Mach-O image
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setFs_blob_start(long value);

    /**
     * signature blob size
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    @NUInt
    public native long fs_blob_size();

    /**
     * signature blob size
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setFs_blob_size(@NUInt long value);

    /**
     * address of original image
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int fs_orig_fd();

    /**
     * address of original image
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setFs_orig_fd(int value);
}