package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class hash_info_bucket extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public hash_info_bucket() {
        super(hash_info_bucket.class);
    }

    @Generated
    protected hash_info_bucket(Pointer peer) {
        super(peer);
    }

    @Generated
    public hash_info_bucket(int hib_count) {
        super(hash_info_bucket.class);
        setHib_count(hib_count);
    }

    /**
     * number of records in bucket
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int hib_count();

    /**
     * number of records in bucket
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setHib_count(int value);
}