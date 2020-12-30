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
public final class AudioChannelLayout extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public AudioChannelLayout() {
        super(AudioChannelLayout.class);
    }

    @Generated
    protected AudioChannelLayout(Pointer peer) {
        super(peer);
    }

    @Generated
    public AudioChannelLayout(int mChannelLayoutTag, int mChannelBitmap, int mNumberChannelDescriptions,
            @ByValue AudioChannelDescription mChannelDescriptions) {
        super(AudioChannelLayout.class);
        setMChannelLayoutTag(mChannelLayoutTag);
        setMChannelBitmap(mChannelBitmap);
        setMNumberChannelDescriptions(mNumberChannelDescriptions);
        setMChannelDescriptions(mChannelDescriptions);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int mChannelLayoutTag();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setMChannelLayoutTag(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int mChannelBitmap();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setMChannelBitmap(int value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int mNumberChannelDescriptions();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setMNumberChannelDescriptions(int value);

    /**
     * this is a variable length array of mNumberChannelDescriptions elements
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    @ByValue
    public native AudioChannelDescription mChannelDescriptions();

    /**
     * this is a variable length array of mNumberChannelDescriptions elements
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setMChannelDescriptions(@ByValue AudioChannelDescription value);
}