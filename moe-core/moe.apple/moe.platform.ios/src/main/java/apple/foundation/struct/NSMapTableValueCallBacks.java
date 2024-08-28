package apple.foundation.struct;

import apple.foundation.NSMapTable;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.map.ObjCStringMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Generated
@Structure()
public final class NSMapTableValueCallBacks extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public NSMapTableValueCallBacks() {
        super(NSMapTableValueCallBacks.class);
    }

    @Generated
    protected NSMapTableValueCallBacks(Pointer peer) {
        super(peer);
    }

    @Generated
    public NSMapTableValueCallBacks(@FunctionPtr(name = "call_retain") @Nullable Function_retain retain,
            @FunctionPtr(name = "call_release") @Nullable Function_release release,
            @FunctionPtr(name = "call_describe") @Nullable Function_describe describe) {
        super(NSMapTableValueCallBacks.class);
        setRetain(retain);
        setRelease(release);
        setDescribe(describe);
    }

    @Nullable
    @Generated
    @StructureField(order = 0, isGetter = true)
    @FunctionPtr(name = "call_retain")
    public native Function_retain retain();

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_retain {
        @Generated
        void call_retain(@NotNull NSMapTable<?, ?> arg0, @NotNull ConstVoidPtr arg1);
    }

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setRetain(@Nullable @FunctionPtr(name = "call_retain") Function_retain value);

    @Nullable
    @Generated
    @StructureField(order = 1, isGetter = true)
    @FunctionPtr(name = "call_release")
    public native Function_release release();

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_release {
        @Generated
        void call_release(@NotNull NSMapTable<?, ?> arg0, @NotNull VoidPtr arg1);
    }

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setRelease(@Nullable @FunctionPtr(name = "call_release") Function_release value);

    @Nullable
    @Generated
    @StructureField(order = 2, isGetter = true)
    @FunctionPtr(name = "call_describe")
    public native Function_describe describe();

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_describe {
        @Nullable
        @Generated
        @MappedReturn(ObjCStringMapper.class)
        String call_describe(@NotNull NSMapTable<?, ?> arg0, @NotNull ConstVoidPtr arg1);
    }

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setDescribe(@Nullable @FunctionPtr(name = "call_describe") Function_describe value);
}