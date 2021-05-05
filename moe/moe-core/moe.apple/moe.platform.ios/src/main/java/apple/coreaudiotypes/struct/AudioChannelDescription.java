package apple.coreaudiotypes.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class AudioChannelDescription extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public AudioChannelDescription() {
        super(AudioChannelDescription.class);
    }

    @Generated
    protected AudioChannelDescription(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int mChannelLabel();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setMChannelLabel(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int mChannelFlags();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setMChannelFlags(int value);

    @Generated
    @StructureField(order = 2, isGetter = true, count = 3)
    public native float mCoordinates(int field_idx);

    @Generated
    @StructureField(order = 2, isGetter = false, count = 3)
    public native void setMCoordinates(float value, int field_idx);
}