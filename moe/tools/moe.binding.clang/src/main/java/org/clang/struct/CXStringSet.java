package org.clang.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ann.UncertainReturn;

@Generated
@Structure()
public final class CXStringSet extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public CXStringSet() {
        super(CXStringSet.class);
    }

    @Generated
    protected CXStringSet(Pointer peer) {
        super(peer);
    }

    @Generated
    public CXStringSet(@UncertainArgument("Options: reference, array Fallback: reference") CXString Strings,
            int Count) {
        super(CXStringSet.class);
        setStrings(Strings);
        setCount(Count);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    @UncertainReturn("Options: reference, array Fallback: reference")
    public native CXString Strings();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setStrings(@UncertainArgument("Options: reference, array Fallback: reference") CXString value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int Count();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setCount(int value);
}
