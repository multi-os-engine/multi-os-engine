package apple.avfaudio.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class AVAudio3DAngularOrientation extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public AVAudio3DAngularOrientation() {
        super(AVAudio3DAngularOrientation.class);
    }

    @Generated
    protected AVAudio3DAngularOrientation(Pointer peer) {
        super(peer);
    }

    @Generated
    public AVAudio3DAngularOrientation(float yaw, float pitch, float roll) {
        super(AVAudio3DAngularOrientation.class);
        setYaw(yaw);
        setPitch(pitch);
        setRoll(roll);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native float yaw();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setYaw(float value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native float pitch();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setPitch(float value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native float roll();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setRoll(float value);
}
