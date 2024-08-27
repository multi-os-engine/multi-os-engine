package apple.coreaudiotypes.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class AudioClassDescription extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public AudioClassDescription() {
        super(AudioClassDescription.class);
    }

    @Generated
    protected AudioClassDescription(Pointer peer) {
        super(peer);
    }

    @Generated
    public AudioClassDescription(int mType, int mSubType, int mManufacturer) {
        super(AudioClassDescription.class);
        setMType(mType);
        setMSubType(mSubType);
        setMManufacturer(mManufacturer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int mType();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setMType(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int mSubType();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setMSubType(int value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int mManufacturer();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setMManufacturer(int value);
}