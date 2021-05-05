package apple.metal.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class MTLTextureSwizzleChannels extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public MTLTextureSwizzleChannels() {
        super(MTLTextureSwizzleChannels.class);
    }

    @Generated
    protected MTLTextureSwizzleChannels(Pointer peer) {
        super(peer);
    }

    @Generated
    public MTLTextureSwizzleChannels(byte red, byte green, byte blue, byte alpha) {
        super(MTLTextureSwizzleChannels.class);
        setRed(red);
        setGreen(green);
        setBlue(blue);
        setAlpha(alpha);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native byte red();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setRed(byte value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native byte green();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setGreen(byte value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native byte blue();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setBlue(byte value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native byte alpha();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setAlpha(byte value);
}