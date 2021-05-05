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
public final class AudioFormatListItem extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public AudioFormatListItem() {
        super(AudioFormatListItem.class);
    }

    @Generated
    protected AudioFormatListItem(Pointer peer) {
        super(peer);
    }

    @Generated
    public AudioFormatListItem(@ByValue AudioStreamBasicDescription mASBD, int mChannelLayoutTag) {
        super(AudioFormatListItem.class);
        setMASBD(mASBD);
        setMChannelLayoutTag(mChannelLayoutTag);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    @ByValue
    public native AudioStreamBasicDescription mASBD();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setMASBD(@ByValue AudioStreamBasicDescription value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int mChannelLayoutTag();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setMChannelLayoutTag(int value);
}