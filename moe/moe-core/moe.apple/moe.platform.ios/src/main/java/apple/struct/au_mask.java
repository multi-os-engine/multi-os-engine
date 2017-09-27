package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class au_mask extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public au_mask() {
        super(au_mask.class);
    }

    @Generated
    protected au_mask(Pointer peer) {
        super(peer);
    }

    @Generated
    public au_mask(int am_success, int am_failure) {
        super(au_mask.class);
        setAm_success(am_success);
        setAm_failure(am_failure);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int am_success();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setAm_success(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int am_failure();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setAm_failure(int value);
}