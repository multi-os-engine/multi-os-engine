package apple.accelerate.struct;

import org.jetbrains.annotations.Nullable;
import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure()
public final class bnns_user_message_data_t extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public bnns_user_message_data_t() {
        super(bnns_user_message_data_t.class);
    }

    @Generated
    protected bnns_user_message_data_t(Pointer peer) {
        super(peer);
    }

    @Generated
    public bnns_user_message_data_t(@NUInt long size, @Nullable VoidPtr data) {
        super(bnns_user_message_data_t.class);
        setSize(size);
        setData(data);
    }

    /**
     * size of the additional logging data
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    @NUInt
    public native long size();

    /**
     * size of the additional logging data
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setSize(@NUInt long value);

    /**
     * pointer to the additional logging data
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    @Nullable
    public native VoidPtr data();

    /**
     * pointer to the additional logging data
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setData(@Nullable VoidPtr value);
}