package apple.foundation.struct;

import apple.foundation.NSHashTable;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.map.ObjCStringMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Generated
@Structure()
public final class NSHashTableCallBacks extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public NSHashTableCallBacks() {
        super(NSHashTableCallBacks.class);
    }

    @Generated
    protected NSHashTableCallBacks(Pointer peer) {
        super(peer);
    }

    @Nullable
    @Generated
    @StructureField(order = 0, isGetter = true)
    @FunctionPtr(name = "call_hash")
    public native Function_hash hash();

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_hash {
        @Generated
        @NUInt
        long call_hash(@NotNull NSHashTable<?> arg0, @NotNull ConstVoidPtr arg1);
    }

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setHash(@Nullable @FunctionPtr(name = "call_hash") Function_hash value);

    @Nullable
    @Generated
    @StructureField(order = 1, isGetter = true)
    @FunctionPtr(name = "call_isEqual")
    public native Function_isEqual isEqual();

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_isEqual {
        @Generated
        boolean call_isEqual(@NotNull NSHashTable<?> arg0, @NotNull ConstVoidPtr arg1, @NotNull ConstVoidPtr arg2);
    }

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setIsEqual(@Nullable @FunctionPtr(name = "call_isEqual") Function_isEqual value);

    @Nullable
    @Generated
    @StructureField(order = 2, isGetter = true)
    @FunctionPtr(name = "call_retain")
    public native Function_retain retain();

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_retain {
        @Generated
        void call_retain(@NotNull NSHashTable<?> arg0, @NotNull ConstVoidPtr arg1);
    }

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setRetain(@Nullable @FunctionPtr(name = "call_retain") Function_retain value);

    @Nullable
    @Generated
    @StructureField(order = 3, isGetter = true)
    @FunctionPtr(name = "call_release")
    public native Function_release release();

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_release {
        @Generated
        void call_release(@NotNull NSHashTable<?> arg0, @NotNull VoidPtr arg1);
    }

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setRelease(@Nullable @FunctionPtr(name = "call_release") Function_release value);

    @Nullable
    @Generated
    @StructureField(order = 4, isGetter = true)
    @FunctionPtr(name = "call_describe")
    public native Function_describe describe();

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_describe {
        @Nullable
        @Generated
        @MappedReturn(ObjCStringMapper.class)
        String call_describe(@NotNull NSHashTable<?> arg0, @NotNull ConstVoidPtr arg1);
    }

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setDescribe(@Nullable @FunctionPtr(name = "call_describe") Function_describe value);
}