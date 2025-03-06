package apple.struct;

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
import org.moe.natj.general.ann.UncertainReturn;
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure(alignment = 4)
public final class kmod_info extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public kmod_info() {
        super(kmod_info.class);
    }

    @Generated
    protected kmod_info(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    @UncertainReturn("Options: reference, array Fallback: reference")
    public native kmod_info next();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setNext(@UncertainArgument("Options: reference, array Fallback: reference") kmod_info value);

    /**
     * version of this structure
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int info_version();

    /**
     * version of this structure
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setInfo_version(int value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int id();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setId(int value);

    @Generated
    @StructureField(order = 3, isGetter = true, count = 64)
    public native byte name(int field_idx);

    @Generated
    @StructureField(order = 3, isGetter = false, count = 64)
    public native void setName(byte value, int field_idx);

    @Generated
    @StructureField(order = 4, isGetter = true, count = 64)
    public native byte version(int field_idx);

    @Generated
    @StructureField(order = 4, isGetter = false, count = 64)
    public native void setVersion(byte value, int field_idx);

    /**
     * # linkage refs to this
     */
    @Generated
    @StructureField(order = 5, isGetter = true)
    public native int reference_count();

    /**
     * # linkage refs to this
     */
    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setReference_count(int value);

    /**
     * who this refs (links on)
     */
    @Generated
    @StructureField(order = 6, isGetter = true)
    @UncertainReturn("Options: reference, array Fallback: reference")
    public native kmod_reference reference_list();

    /**
     * who this refs (links on)
     */
    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setReference_list(
            @UncertainArgument("Options: reference, array Fallback: reference") kmod_reference value);

    /**
     * starting address
     */
    @Generated
    @StructureField(order = 7, isGetter = true)
    @NUInt
    public native long address();

    /**
     * starting address
     */
    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void setAddress(@NUInt long value);

    /**
     * total size
     */
    @Generated
    @StructureField(order = 8, isGetter = true)
    @NUInt
    public native long size();

    /**
     * total size
     */
    @Generated
    @StructureField(order = 8, isGetter = false)
    public native void setSize(@NUInt long value);

    /**
     * unwired hdr size
     */
    @Generated
    @StructureField(order = 9, isGetter = true)
    @NUInt
    public native long hdr_size();

    /**
     * unwired hdr size
     */
    @Generated
    @StructureField(order = 9, isGetter = false)
    public native void setHdr_size(@NUInt long value);

    @Generated
    @StructureField(order = 10, isGetter = true)
    @FunctionPtr(name = "call_start")
    public native Function_start start();

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_start {
        @Generated
        int call_start(@UncertainArgument("Options: reference, array Fallback: reference") kmod_info ki, VoidPtr data);
    }

    @Generated
    @StructureField(order = 10, isGetter = false)
    public native void setStart(@FunctionPtr(name = "call_start") Function_start value);

    @Generated
    @StructureField(order = 11, isGetter = true)
    @FunctionPtr(name = "call_stop")
    public native Function_stop stop();

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_stop {
        @Generated
        int call_stop(@UncertainArgument("Options: reference, array Fallback: reference") kmod_info ki, VoidPtr data);
    }

    @Generated
    @StructureField(order = 11, isGetter = false)
    public native void setStop(@FunctionPtr(name = "call_stop") Function_stop value);
}