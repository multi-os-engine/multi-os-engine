package apple.avfaudio.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class AVAudio3DVectorOrientation extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public AVAudio3DVectorOrientation() {
        super(AVAudio3DVectorOrientation.class);
    }

    @Generated
    protected AVAudio3DVectorOrientation(Pointer peer) {
        super(peer);
    }

    @Generated
    public AVAudio3DVectorOrientation(@ByValue AVAudio3DPoint forward, @ByValue AVAudio3DPoint up) {
        super(AVAudio3DVectorOrientation.class);
        setForward(forward);
        setUp(up);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    @ByValue
    public native AVAudio3DPoint forward();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setForward(@ByValue AVAudio3DPoint value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    @ByValue
    public native AVAudio3DPoint up();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setUp(@ByValue AVAudio3DPoint value);
}
