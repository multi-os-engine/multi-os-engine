package apple.accelerate.struct;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;

@Generated
@Structure()
public final class SparseGMRESOptions extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public SparseGMRESOptions() {
        super(SparseGMRESOptions.class);
    }

    @Generated
    protected SparseGMRESOptions(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    @FunctionPtr(name = "call_reportError")
    public native Function_reportError reportError();

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_reportError {
        @Generated
        void call_reportError(
                @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg0);
    }

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setReportError(@FunctionPtr(name = "call_reportError") Function_reportError value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native byte variant();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setVariant(byte value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int nvec();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setNvec(int value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int maxIterations();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setMaxIterations(int value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native double atol();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setAtol(double value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    public native double rtol();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setRtol(double value);

    @Generated
    @StructureField(order = 6, isGetter = true)
    @FunctionPtr(name = "call_reportStatus")
    public native Function_reportStatus reportStatus();

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_reportStatus {
        @Generated
        void call_reportStatus(
                @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg0);
    }

    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setReportStatus(@FunctionPtr(name = "call_reportStatus") Function_reportStatus value);
}