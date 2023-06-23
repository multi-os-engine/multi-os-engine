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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Generated
@Structure()
public final class SparseLSMROptions extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public SparseLSMROptions() {
        super(SparseLSMROptions.class);
    }

    @Generated
    protected SparseLSMROptions(Pointer peer) {
        super(peer);
    }

    @Nullable
    @Generated
    @StructureField(order = 0, isGetter = true)
    @FunctionPtr(name = "call_reportError")
    public native Function_reportError reportError();

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_reportError {
        @Generated
        void call_reportError(
                @NotNull @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg0);
    }

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setReportError(@Nullable @FunctionPtr(name = "call_reportError") Function_reportError value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native double lambda();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setLambda(double value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int nvec();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setNvec(int value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int convergenceTest();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setConvergenceTest(int value);

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
    public native double btol();

    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setBtol(double value);

    @Generated
    @StructureField(order = 7, isGetter = true)
    public native double conditionLimit();

    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void setConditionLimit(double value);

    @Generated
    @StructureField(order = 8, isGetter = true)
    public native int maxIterations();

    @Generated
    @StructureField(order = 8, isGetter = false)
    public native void setMaxIterations(int value);

    @Nullable
    @Generated
    @StructureField(order = 9, isGetter = true)
    @FunctionPtr(name = "call_reportStatus")
    public native Function_reportStatus reportStatus();

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_reportStatus {
        @Generated
        void call_reportStatus(
                @NotNull @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg0);
    }

    @Generated
    @StructureField(order = 9, isGetter = false)
    public native void setReportStatus(@Nullable @FunctionPtr(name = "call_reportStatus") Function_reportStatus value);
}