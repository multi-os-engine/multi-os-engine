package apple.accelerate.struct;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ptr.IntPtr;
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure()
public final class SparseSymbolicFactorOptions extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public SparseSymbolicFactorOptions() {
        super(SparseSymbolicFactorOptions.class);
    }

    @Generated
    protected SparseSymbolicFactorOptions(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int control();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setControl(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native byte orderMethod();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setOrderMethod(byte value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native IntPtr order();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setOrder(IntPtr value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native IntPtr ignoreRowsAndColumns();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setIgnoreRowsAndColumns(IntPtr value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    @FunctionPtr(name = "call_malloc")
    public native Function_malloc malloc();

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_malloc {
        @Generated
        VoidPtr call_malloc(@NUInt long arg0);
    }

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setMalloc(@FunctionPtr(name = "call_malloc") Function_malloc value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    @FunctionPtr(name = "call_free")
    public native Function_free free();

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_free {
        @Generated
        void call_free(VoidPtr arg0);
    }

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setFree(@FunctionPtr(name = "call_free") Function_free value);

    @Generated
    @StructureField(order = 6, isGetter = true)
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
    @StructureField(order = 6, isGetter = false)
    public native void setReportError(@FunctionPtr(name = "call_reportError") Function_reportError value);
}