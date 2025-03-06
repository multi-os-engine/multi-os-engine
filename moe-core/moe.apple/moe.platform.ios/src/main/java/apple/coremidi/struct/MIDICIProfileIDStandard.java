package apple.coremidi.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class MIDICIProfileIDStandard extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public MIDICIProfileIDStandard() {
        super(MIDICIProfileIDStandard.class);
    }

    @Generated
    protected MIDICIProfileIDStandard(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native byte profileIDByte1();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setProfileIDByte1(byte value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native byte profileBank();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setProfileBank(byte value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native byte profileNumber();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setProfileNumber(byte value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native byte profileVersion();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setProfileVersion(byte value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native byte profileLevel();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setProfileLevel(byte value);
}