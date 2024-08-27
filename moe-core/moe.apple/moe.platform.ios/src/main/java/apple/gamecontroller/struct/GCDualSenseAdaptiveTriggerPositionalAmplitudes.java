package apple.gamecontroller.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class GCDualSenseAdaptiveTriggerPositionalAmplitudes extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public GCDualSenseAdaptiveTriggerPositionalAmplitudes() {
        super(GCDualSenseAdaptiveTriggerPositionalAmplitudes.class);
    }

    @Generated
    protected GCDualSenseAdaptiveTriggerPositionalAmplitudes(Pointer peer) {
        super(peer);
    }

    /**
     * An array of amplitudes associated with the GCDualSenseAdaptiveTriggerDiscretePositionCount control positions
     * supported by the DualSense adaptive triggers.
     */
    @Generated
    @StructureField(order = 0, isGetter = true, count = 10)
    public native float values(int field_idx);

    /**
     * An array of amplitudes associated with the GCDualSenseAdaptiveTriggerDiscretePositionCount control positions
     * supported by the DualSense adaptive triggers.
     */
    @Generated
    @StructureField(order = 0, isGetter = false, count = 10)
    public native void setValues(float value, int field_idx);
}