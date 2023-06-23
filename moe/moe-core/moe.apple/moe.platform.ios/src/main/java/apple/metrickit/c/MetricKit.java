package apple.metrickit.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.objc.map.ObjCStringMapper;
import org.jetbrains.annotations.NotNull;

@Generated
@Library("MetricKit")
@Runtime(CRuntime.class)
public final class MetricKit {
    static {
        NatJ.register();
    }

    @Generated
    private MetricKit() {
    }

    /**
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native VoidPtr _MXSignpostMetricsSnapshot();

    /**
     * [@const] MXErrorDomain
     * 
     * Error domain for NSError values stemming from the MetricKit Framework API.
     * 
     * This error domain is used as the domain for all NSError instances stemming from the MetricKit Framework.
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MXErrorDomain();
}