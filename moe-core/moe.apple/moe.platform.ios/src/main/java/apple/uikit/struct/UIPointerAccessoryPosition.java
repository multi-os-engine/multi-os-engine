package apple.uikit.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NFloat;

@Generated
@Structure()
public final class UIPointerAccessoryPosition extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public UIPointerAccessoryPosition() {
        super(UIPointerAccessoryPosition.class);
    }

    @Generated
    protected UIPointerAccessoryPosition(Pointer peer) {
        super(peer);
    }

    @Generated
    public UIPointerAccessoryPosition(@NFloat double offset, @NFloat double angle) {
        super(UIPointerAccessoryPosition.class);
        setOffset(offset);
        setAngle(angle);
    }

    /**
     * Offset from the primary pointer shape. Only allows positive values.
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    @NFloat
    public native double offset();

    /**
     * Offset from the primary pointer shape. Only allows positive values.
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setOffset(@NFloat double value);

    /**
     * Clock-wise angle from top in radians.
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    @NFloat
    public native double angle();

    /**
     * Clock-wise angle from top in radians.
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setAngle(@NFloat double value);
}
