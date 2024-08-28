package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class __arm_pagein_state extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public __arm_pagein_state() {
        super(__arm_pagein_state.class);
    }

    @Generated
    protected __arm_pagein_state(Pointer peer) {
        super(peer);
    }

    @Generated
    public __arm_pagein_state(int __pagein_error) {
        super(__arm_pagein_state.class);
        set__pagein_error(__pagein_error);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int __pagein_error();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void set__pagein_error(int value);
}