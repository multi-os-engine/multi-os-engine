package apple.audiotoolbox.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.jetbrains.annotations.Nullable;

@Generated
@Structure()
public final class AudioCodecMagicCookieInfo extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public AudioCodecMagicCookieInfo() {
        super(AudioCodecMagicCookieInfo.class);
    }

    @Generated
    protected AudioCodecMagicCookieInfo(Pointer peer) {
        super(peer);
    }

    @Generated
    public AudioCodecMagicCookieInfo(int mMagicCookieSize, @Nullable ConstVoidPtr mMagicCookie) {
        super(AudioCodecMagicCookieInfo.class);
        setMMagicCookieSize(mMagicCookieSize);
        setMMagicCookie(mMagicCookie);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int mMagicCookieSize();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setMMagicCookieSize(int value);

    @Nullable
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native ConstVoidPtr mMagicCookie();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setMMagicCookie(@Nullable ConstVoidPtr value);
}