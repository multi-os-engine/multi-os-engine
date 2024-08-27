package apple.audiotoolbox.struct;

import apple.opaque.os_workgroup_t;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class AudioUnitRenderContext extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public AudioUnitRenderContext() {
        super(AudioUnitRenderContext.class);
    }

    @Generated
    protected AudioUnitRenderContext(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    @Nullable
    public native os_workgroup_t workgroup();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setWorkgroup(@Nullable os_workgroup_t value);

    /**
     * must be zero
     */
    @Generated
    @StructureField(order = 1, isGetter = true, count = 6)
    public native int reserved(int field_idx);

    /**
     * must be zero
     */
    @Generated
    @StructureField(order = 1, isGetter = false, count = 6)
    public native void setReserved(int value, int field_idx);
}