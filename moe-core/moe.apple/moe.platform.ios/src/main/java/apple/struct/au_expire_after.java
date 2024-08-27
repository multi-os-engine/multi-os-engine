package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;

@Generated
@Structure()
public final class au_expire_after extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public au_expire_after() {
        super(au_expire_after.class);
    }

    @Generated
    protected au_expire_after(Pointer peer) {
        super(peer);
    }

    @Generated
    public au_expire_after(@NInt long age, @NUInt long size, byte op_type) {
        super(au_expire_after.class);
        setAge(age);
        setSize(size);
        setOp_type(op_type);
    }

    /**
     * Age after which trail files should be expired
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    @NInt
    public native long age();

    /**
     * Age after which trail files should be expired
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setAge(@NInt long value);

    /**
     * Aggregate trail size when files should be expired
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    @NUInt
    public native long size();

    /**
     * Aggregate trail size when files should be expired
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setSize(@NUInt long value);

    /**
     * Operator used with the above values to determine when files should be expired
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    public native byte op_type();

    /**
     * Operator used with the above values to determine when files should be expired
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setOp_type(byte value);
}