package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class memory_object_perf_info extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public memory_object_perf_info() {
        super(memory_object_perf_info.class);
    }

    @Generated
    protected memory_object_perf_info(Pointer peer) {
        super(peer);
    }

    @Generated
    public memory_object_perf_info(int cluster_size, int may_cache) {
        super(memory_object_perf_info.class);
        setCluster_size(cluster_size);
        setMay_cache(may_cache);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int cluster_size();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setCluster_size(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int may_cache();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setMay_cache(int value);
}