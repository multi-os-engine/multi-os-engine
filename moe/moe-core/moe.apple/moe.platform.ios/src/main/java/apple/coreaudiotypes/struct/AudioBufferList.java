package apple.coreaudiotypes.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class AudioBufferList extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public AudioBufferList() {
        super(AudioBufferList.class);
    }

    @Generated
    protected AudioBufferList(Pointer peer) {
        super(peer);
    }

    @Generated
    public AudioBufferList(int mNumberBuffers, @ByValue AudioBuffer mBuffers) {
        super(AudioBufferList.class);
        setMNumberBuffers(mNumberBuffers);
        setMBuffers(mBuffers);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int mNumberBuffers();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setMNumberBuffers(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    @ByValue
    public native AudioBuffer mBuffers();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setMBuffers(@ByValue AudioBuffer value);
}