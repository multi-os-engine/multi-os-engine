package apple.sensorkit.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class SRAmbientLightChromaticity extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public SRAmbientLightChromaticity() {
        super(SRAmbientLightChromaticity.class);
    }

    @Generated
    protected SRAmbientLightChromaticity(Pointer peer) {
        super(peer);
    }

    @Generated
    public SRAmbientLightChromaticity(float x, float y) {
        super(SRAmbientLightChromaticity.class);
        setX(x);
        setY(y);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native float x();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setX(float value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native float y();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setY(float value);
}
