package apple.metrickit.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;

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

    @Generated
    @CFunction
    public static native VoidPtr _MXSignpostMetricsSnapshot();
}